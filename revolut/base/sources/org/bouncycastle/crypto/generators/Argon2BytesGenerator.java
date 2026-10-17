package org.bouncycastle.crypto.generators;

import ch.qos.logback.core.util.a;
import ehe.n;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.Blake2bDigest;
import org.bouncycastle.crypto.params.Argon2Parameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Longs;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class Argon2BytesGenerator {
    private static final int ARGON2_ADDRESSES_IN_BLOCK = 128;
    private static final int ARGON2_BLOCK_SIZE = 1024;
    private static final int ARGON2_PREHASH_DIGEST_LENGTH = 64;
    private static final int ARGON2_PREHASH_SEED_LENGTH = 72;
    private static final int ARGON2_QWORDS_IN_BLOCK = 128;
    private static final int ARGON2_SYNC_POINTS = 4;
    private static final long M32L = 4294967295L;
    private static final int MAX_PARALLELISM = 16777215;
    private static final int MIN_ITERATIONS = 1;
    private static final int MIN_OUTLEN = 4;
    private static final int MIN_PARALLELISM = 1;
    private static final byte[] ZERO_BYTES = new byte[4];
    private int laneLength;
    private Block[] memory;
    private Argon2Parameters parameters;
    private int segmentLength;

    public static class Block {
        private static final int SIZE = 128;
        private final long[] v;

        private Block() {
            this.v = new long[128];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Block clear() {
            Arrays.fill(this.v, 0L);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void copyBlock(Block block) {
            System.arraycopy(block.v, 0, this.v, 0, 128);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xor(Block block, Block block2) {
            long[] jArr = this.v;
            long[] jArr2 = block.v;
            long[] jArr3 = block2.v;
            for (int i = 0; i < 128; i++) {
                jArr[i] = jArr2[i] ^ jArr3[i];
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xorWith(Block block) {
            long[] jArr = this.v;
            long[] jArr2 = block.v;
            for (int i = 0; i < 128; i++) {
                jArr[i] = jArr[i] ^ jArr2[i];
            }
        }

        public void fromBytes(byte[] bArr) {
            if (bArr.length < 1024) {
                throw new IllegalArgumentException("input shorter than blocksize");
            }
            Pack.littleEndianToLong(bArr, 0, this.v);
        }

        public void toBytes(byte[] bArr) {
            if (bArr.length < 1024) {
                throw new IllegalArgumentException("output shorter than blocksize");
            }
            Pack.longToLittleEndian(this.v, bArr, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xorWith(Block block, Block block2) {
            long[] jArr = this.v;
            long[] jArr2 = block.v;
            long[] jArr3 = block2.v;
            for (int i = 0; i < 128; i++) {
                jArr[i] = jArr[i] ^ (jArr2[i] ^ jArr3[i]);
            }
        }
    }

    public static class FillBlock {
        Block R;
        Block Z;
        Block addressBlock;
        Block inputBlock;

        private FillBlock() {
            this.R = new Block();
            this.Z = new Block();
            this.addressBlock = new Block();
            this.inputBlock = new Block();
        }

        private void applyBlake() {
            for (int i = 0; i < 8; i++) {
                int i2 = i * 16;
                Argon2BytesGenerator.roundFunction(this.Z, i2, i2 + 1, i2 + 2, i2 + 3, i2 + 4, i2 + 5, i2 + 6, i2 + 7, i2 + 8, i2 + 9, i2 + 10, i2 + 11, i2 + 12, i2 + 13, i2 + 14, i2 + 15);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                int i5 = i3 * 2;
                Argon2BytesGenerator.roundFunction(this.Z, i5, i5 + 1, i5 + 16, i5 + 17, i5 + 32, i5 + 33, i5 + 48, i5 + 49, i5 + 64, i5 + 65, i5 + 80, i5 + 81, i5 + 96, i5 + 97, i5 + 112, i5 + 113);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillBlock(Block block, Block block2) {
            this.Z.copyBlock(block);
            applyBlake();
            block2.xor(block, this.Z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillBlockWithXor(Block block, Block block2, Block block3) {
            this.R.xor(block, block2);
            this.Z.copyBlock(this.R);
            applyBlake();
            block3.xorWith(this.R, this.Z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillBlock(Block block, Block block2, Block block3) {
            this.R.xor(block, block2);
            this.Z.copyBlock(this.R);
            applyBlake();
            block3.xor(this.R, this.Z);
        }
    }

    public static class Position {
        int lane;
        int pass;
        int slice;
    }

    private static void F(long[] jArr, int i, int i2, int i3, int i5) {
        quarterRound(jArr, i, i2, i5, 32);
        quarterRound(jArr, i3, i5, i2, 24);
        quarterRound(jArr, i, i2, i5, 16);
        quarterRound(jArr, i3, i5, i2, 63);
    }

    private static void addByteString(byte[] bArr, Digest digest, byte[] bArr2) {
        if (bArr2 == null) {
            digest.update(ZERO_BYTES, 0, 4);
            return;
        }
        Pack.intToLittleEndian(bArr2.length, bArr, 0);
        digest.update(bArr, 0, 4);
        digest.update(bArr2, 0, bArr2.length);
    }

    private void digest(byte[] bArr, byte[] bArr2, int i, int i2) {
        Block block = this.memory[this.laneLength - 1];
        for (int i3 = 1; i3 < this.parameters.getLanes(); i3++) {
            int i5 = this.laneLength;
            block.xorWith(this.memory[(i5 - 1) + (i3 * i5)]);
        }
        block.toBytes(bArr);
        hash(bArr, bArr2, i, i2);
    }

    private void fillFirstBlocks(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[72];
        System.arraycopy(bArr2, 0, bArr3, 0, 64);
        bArr3[64] = 1;
        for (int i = 0; i < this.parameters.getLanes(); i++) {
            Pack.intToLittleEndian(i, bArr2, 68);
            Pack.intToLittleEndian(i, bArr3, 68);
            hash(bArr2, bArr, 0, 1024);
            this.memory[this.laneLength * i].fromBytes(bArr);
            hash(bArr3, bArr, 0, 1024);
            this.memory[(this.laneLength * i) + 1].fromBytes(bArr);
        }
    }

    private void fillMemoryBlocks() {
        FillBlock fillBlock = new FillBlock();
        Position position = new Position();
        for (int i = 0; i < this.parameters.getIterations(); i++) {
            position.pass = i;
            for (int i2 = 0; i2 < 4; i2++) {
                position.slice = i2;
                for (int i3 = 0; i3 < this.parameters.getLanes(); i3++) {
                    position.lane = i3;
                    fillSegment(fillBlock, position);
                }
            }
        }
    }

    private void fillSegment(FillBlock fillBlock, Position position) {
        Block blockClear;
        Block blockClear2;
        FillBlock fillBlock2 = fillBlock;
        Position position2 = position;
        boolean zIsDataIndependentAddressing = isDataIndependentAddressing(position2);
        int startingIndex = getStartingIndex(position2);
        int iA = n.a(position2.slice, this.segmentLength, position2.lane * this.laneLength, startingIndex);
        int prevOffset = getPrevOffset(iA);
        if (zIsDataIndependentAddressing) {
            blockClear = fillBlock2.addressBlock.clear();
            blockClear2 = fillBlock2.inputBlock.clear();
            initAddressBlocks(fillBlock2, position2, blockClear2, blockClear);
        } else {
            blockClear = null;
            blockClear2 = null;
        }
        boolean zIsWithXor = isWithXor(position2);
        while (true) {
            int i = iA;
            if (startingIndex >= this.segmentLength) {
                return;
            }
            Block block = blockClear;
            int i2 = prevOffset;
            Block block2 = blockClear2;
            long pseudoRandom = getPseudoRandom(fillBlock2, startingIndex, block, block2, i2, zIsDataIndependentAddressing);
            boolean z = zIsDataIndependentAddressing;
            FillBlock fillBlock3 = fillBlock2;
            int refLane = getRefLane(position2, pseudoRandom);
            int refColumn = getRefColumn(position2, startingIndex, pseudoRandom, refLane == position2.lane);
            Block[] blockArr = this.memory;
            Block block3 = blockArr[i2];
            Block block4 = blockArr[(this.laneLength * refLane) + refColumn];
            Block block5 = blockArr[i];
            if (zIsWithXor) {
                fillBlock3.fillBlockWithXor(block3, block4, block5);
            } else {
                fillBlock3.fillBlock(block3, block4, block5);
            }
            iA = i + 1;
            startingIndex++;
            position2 = position;
            fillBlock2 = fillBlock3;
            zIsDataIndependentAddressing = z;
            prevOffset = i;
            blockClear = block;
            blockClear2 = block2;
        }
    }

    private int getPrevOffset(int i) {
        return i % this.laneLength == 0 ? (i + r0) - 1 : i - 1;
    }

    private long getPseudoRandom(FillBlock fillBlock, int i, Block block, Block block2, int i2, boolean z) {
        if (!z) {
            return this.memory[i2].v[0];
        }
        int i3 = i % 128;
        if (i3 == 0) {
            nextAddresses(fillBlock, block2, block);
        }
        return block.v[i3];
    }

    private int getRefColumn(Position position, int i, long j2, boolean z) {
        int i2;
        int i3;
        int i5 = position.pass;
        int i6 = 0;
        int i21 = position.slice;
        if (i5 != 0) {
            int i22 = this.segmentLength;
            int i32 = this.laneLength;
            int i33 = ((i21 + 1) * i22) % i32;
            int i43 = i32 - i22;
            if (z) {
                i2 = (i43 + i) - 1;
            } else {
                i2 = i43 + (i != 0 ? 0 : -1);
            }
            i6 = i33;
            i3 = i2;
        } else if (z) {
            i3 = ((i21 * this.segmentLength) + i) - 1;
        } else {
            i3 = (i21 * this.segmentLength) + (i != 0 ? 0 : -1);
        }
        long j3 = j2 & 4294967295L;
        return ((int) (((long) i6) + (((long) (i3 - 1)) - ((((long) i3) * ((j3 * j3) >>> 32)) >>> 32)))) % this.laneLength;
    }

    private int getRefLane(Position position, long j2) {
        return (position.pass == 0 && position.slice == 0) ? position.lane : (int) ((j2 >>> 32) % ((long) this.parameters.getLanes()));
    }

    private static int getStartingIndex(Position position) {
        return (position.pass == 0 && position.slice == 0) ? 2 : 0;
    }

    private void hash(byte[] bArr, byte[] bArr2, int i, int i2) {
        byte[] bArr3 = new byte[4];
        Pack.intToLittleEndian(i2, bArr3, 0);
        if (i2 <= 64) {
            Blake2bDigest blake2bDigest = new Blake2bDigest(i2 * 8);
            blake2bDigest.update(bArr3, 0, 4);
            blake2bDigest.update(bArr, 0, bArr.length);
            blake2bDigest.doFinal(bArr2, i);
            return;
        }
        Blake2bDigest blake2bDigest2 = new Blake2bDigest(512);
        byte[] bArr4 = new byte[64];
        blake2bDigest2.update(bArr3, 0, 4);
        blake2bDigest2.update(bArr, 0, bArr.length);
        blake2bDigest2.doFinal(bArr4, 0);
        System.arraycopy(bArr4, 0, bArr2, i, 32);
        int i3 = i + 32;
        int i5 = 2;
        int i6 = ((i2 + 31) / 32) - 2;
        while (i5 <= i6) {
            blake2bDigest2.update(bArr4, 0, 64);
            blake2bDigest2.doFinal(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr2, i3, 32);
            i5++;
            i3 += 32;
        }
        Blake2bDigest blake2bDigest3 = new Blake2bDigest((i2 - (i6 * 32)) * 8);
        blake2bDigest3.update(bArr4, 0, 64);
        blake2bDigest3.doFinal(bArr2, i3);
    }

    private void initAddressBlocks(FillBlock fillBlock, Position position, Block block, Block block2) {
        block.v[0] = intToLong(position.pass);
        block.v[1] = intToLong(position.lane);
        block.v[2] = intToLong(position.slice);
        block.v[3] = intToLong(this.memory.length);
        block.v[4] = intToLong(this.parameters.getIterations());
        block.v[5] = intToLong(this.parameters.getType());
        if (position.pass == 0 && position.slice == 0) {
            nextAddresses(fillBlock, block, block2);
        }
    }

    private void initialize(byte[] bArr, byte[] bArr2, int i) {
        Blake2bDigest blake2bDigest = new Blake2bDigest(512);
        Pack.intToLittleEndian(new int[]{this.parameters.getLanes(), i, this.parameters.getMemory(), this.parameters.getIterations(), this.parameters.getVersion(), this.parameters.getType()}, bArr, 0);
        blake2bDigest.update(bArr, 0, 24);
        addByteString(bArr, blake2bDigest, bArr2);
        addByteString(bArr, blake2bDigest, this.parameters.getSalt());
        addByteString(bArr, blake2bDigest, this.parameters.getSecret());
        addByteString(bArr, blake2bDigest, this.parameters.getAdditional());
        byte[] bArr3 = new byte[72];
        blake2bDigest.doFinal(bArr3, 0);
        fillFirstBlocks(bArr, bArr3);
    }

    private long intToLong(int i) {
        return ((long) i) & 4294967295L;
    }

    private boolean isDataIndependentAddressing(Position position) {
        return this.parameters.getType() == 1 || (this.parameters.getType() == 2 && position.pass == 0 && position.slice < 2);
    }

    private boolean isWithXor(Position position) {
        return (position.pass == 0 || this.parameters.getVersion() == 16) ? false : true;
    }

    private void nextAddresses(FillBlock fillBlock, Block block, Block block2) {
        long[] jArr = block.v;
        jArr[6] = jArr[6] + 1;
        fillBlock.fillBlock(block, block2);
        fillBlock.fillBlock(block2, block2);
    }

    private static void quarterRound(long[] jArr, int i, int i2, int i3, int i5) {
        long j2 = jArr[i];
        long j3 = jArr[i2];
        long j5 = jArr[i3];
        long jD = a.d((j2 & 4294967295L) * 2, 4294967295L & j3, j3, j2);
        long jRotateRight = Longs.rotateRight(j5 ^ jD, i5);
        jArr[i] = jD;
        jArr[i3] = jRotateRight;
    }

    private void reset() {
        if (this.memory == null) {
            return;
        }
        int i = 0;
        while (true) {
            Block[] blockArr = this.memory;
            if (i >= blockArr.length) {
                return;
            }
            Block block = blockArr[i];
            if (block != null) {
                block.clear();
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void roundFunction(Block block, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32, int i33, int i43, int i59, int i66, int i74, int i92, int i96, int i99) {
        long[] jArr = block.v;
        F(jArr, i, i6, i33, i74);
        F(jArr, i2, i21, i43, i92);
        F(jArr, i3, i22, i59, i96);
        F(jArr, i5, i32, i66, i99);
        F(jArr, i, i21, i59, i99);
        F(jArr, i2, i22, i66, i74);
        F(jArr, i3, i32, i33, i92);
        F(jArr, i5, i6, i43, i96);
    }

    public int generateBytes(byte[] bArr, byte[] bArr2) {
        return generateBytes(bArr, bArr2, 0, bArr2.length);
    }

    public void init(Argon2Parameters argon2Parameters) {
        if (argon2Parameters.getVersion() != 16 && argon2Parameters.getVersion() != 19) {
            throw new UnsupportedOperationException("unknown Argon2 version");
        }
        if (argon2Parameters.getType() != 0 && argon2Parameters.getType() != 1 && argon2Parameters.getType() != 2) {
            throw new UnsupportedOperationException("unknown Argon2 type");
        }
        if (argon2Parameters.getLanes() < 1) {
            throw new IllegalStateException("lanes must be at least 1");
        }
        if (argon2Parameters.getLanes() > MAX_PARALLELISM) {
            throw new IllegalStateException("lanes must be at most 16777215");
        }
        if (argon2Parameters.getIterations() < 1) {
            throw new IllegalStateException("iterations is less than: 1");
        }
        this.parameters = argon2Parameters;
        int iMax = Math.max(argon2Parameters.getMemory(), argon2Parameters.getLanes() * 8) / (argon2Parameters.getLanes() * 4);
        this.segmentLength = iMax;
        this.laneLength = iMax * 4;
        this.memory = new Block[argon2Parameters.getLanes() * this.laneLength];
        int i = 0;
        while (true) {
            Block[] blockArr = this.memory;
            if (i >= blockArr.length) {
                return;
            }
            blockArr[i] = new Block();
            i++;
        }
    }

    public int generateBytes(byte[] bArr, byte[] bArr2, int i, int i2) {
        if (i2 < 4) {
            throw new IllegalStateException("output length less than 4");
        }
        byte[] bArr3 = new byte[1024];
        initialize(bArr3, bArr, i2);
        fillMemoryBlocks();
        digest(bArr3, bArr2, i, i2);
        reset();
        return i2;
    }

    public int generateBytes(char[] cArr, byte[] bArr) {
        return generateBytes(this.parameters.getCharToByteConverter().convert(cArr), bArr);
    }

    public int generateBytes(char[] cArr, byte[] bArr, int i, int i2) {
        return generateBytes(this.parameters.getCharToByteConverter().convert(cArr), bArr, i, i2);
    }
}
