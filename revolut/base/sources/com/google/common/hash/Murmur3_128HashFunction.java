package com.google.common.hash;

import com.google.common.primitives.UnsignedBytes;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
final class Murmur3_128HashFunction extends AbstractHashFunction implements Serializable {
    private static final long serialVersionUID = 0;
    private final int seed;
    static final HashFunction MURMUR3_128 = new Murmur3_128HashFunction(0);
    static final HashFunction GOOD_FAST_HASH_128 = new Murmur3_128HashFunction(Hashing.GOOD_FAST_HASH_SEED);

    public static final class Murmur3_128Hasher extends AbstractStreamingHasher {
        private static final long C1 = -8663945395140668459L;
        private static final long C2 = 5545529020109919103L;
        private static final int CHUNK_SIZE = 16;

        /* JADX INFO: renamed from: h1, reason: collision with root package name */
        private long f49264h1;
        private long h2;
        private int length;

        public Murmur3_128Hasher(int i) {
            super(16);
            long j2 = i;
            this.f49264h1 = j2;
            this.h2 = j2;
            this.length = 0;
        }

        private void bmix64(long j2, long j3) {
            long jMixK1 = mixK1(j2) ^ this.f49264h1;
            this.f49264h1 = jMixK1;
            long jRotateLeft = Long.rotateLeft(jMixK1, 27);
            long j5 = this.h2;
            this.f49264h1 = ((jRotateLeft + j5) * 5) + 1390208809;
            long jMixK2 = mixK2(j3) ^ j5;
            this.h2 = jMixK2;
            this.h2 = ((Long.rotateLeft(jMixK2, 31) + this.f49264h1) * 5) + 944331445;
        }

        private static long fmix64(long j2) {
            long j3 = (j2 ^ (j2 >>> 33)) * (-49064778989728563L);
            long j5 = (j3 ^ (j3 >>> 33)) * (-4265267296055464877L);
            return j5 ^ (j5 >>> 33);
        }

        private static long mixK1(long j2) {
            return Long.rotateLeft(j2 * C1, 31) * C2;
        }

        private static long mixK2(long j2) {
            return Long.rotateLeft(j2 * C2, 33) * C1;
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public HashCode makeHash() {
            long j2 = this.f49264h1;
            int i = this.length;
            long j3 = j2 ^ ((long) i);
            long j5 = this.h2 ^ ((long) i);
            long j16 = j3 + j5;
            this.f49264h1 = j16;
            this.h2 = j5 + j16;
            this.f49264h1 = fmix64(j16);
            long jFmix64 = fmix64(this.h2);
            long j22 = this.f49264h1 + jFmix64;
            this.f49264h1 = j22;
            this.h2 = jFmix64 + j22;
            return HashCode.fromBytesNoCopy(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f49264h1).putLong(this.h2).array());
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void process(ByteBuffer byteBuffer) {
            bmix64(byteBuffer.getLong(), byteBuffer.getLong());
            this.length += 16;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.common.hash.AbstractStreamingHasher
        public void processRemaining(ByteBuffer byteBuffer) {
            long j2;
            long j3;
            long j5;
            long j16;
            long j22;
            long j42;
            long j46;
            this.length = byteBuffer.remaining() + this.length;
            long j47 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    j2 = 0;
                    j46 = j2 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f49264h1 = mixK1(j46) ^ this.f49264h1;
                    this.h2 ^= mixK2(j47);
                    return;
                case 2:
                    j3 = 0;
                    j2 = j3 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j46 = j2 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f49264h1 = mixK1(j46) ^ this.f49264h1;
                    this.h2 ^= mixK2(j47);
                    return;
                case 3:
                    j5 = 0;
                    j3 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j5;
                    j2 = j3 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j46 = j2 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f49264h1 = mixK1(j46) ^ this.f49264h1;
                    this.h2 ^= mixK2(j47);
                    return;
                case 4:
                    j16 = 0;
                    j5 = j16 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24);
                    j3 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j5;
                    j2 = j3 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j46 = j2 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f49264h1 = mixK1(j46) ^ this.f49264h1;
                    this.h2 ^= mixK2(j47);
                    return;
                case 5:
                    j22 = 0;
                    j16 = j22 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(4))) << 32);
                    j5 = j16 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24);
                    j3 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j5;
                    j2 = j3 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j46 = j2 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f49264h1 = mixK1(j46) ^ this.f49264h1;
                    this.h2 ^= mixK2(j47);
                    return;
                case 6:
                    j42 = 0;
                    j22 = (((long) UnsignedBytes.toInt(byteBuffer.get(5))) << 40) ^ j42;
                    j16 = j22 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(4))) << 32);
                    j5 = j16 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24);
                    j3 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j5;
                    j2 = j3 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j46 = j2 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f49264h1 = mixK1(j46) ^ this.f49264h1;
                    this.h2 ^= mixK2(j47);
                    return;
                case 7:
                    j42 = ((long) UnsignedBytes.toInt(byteBuffer.get(6))) << 48;
                    j22 = (((long) UnsignedBytes.toInt(byteBuffer.get(5))) << 40) ^ j42;
                    j16 = j22 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(4))) << 32);
                    j5 = j16 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24);
                    j3 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j5;
                    j2 = j3 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j46 = j2 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f49264h1 = mixK1(j46) ^ this.f49264h1;
                    this.h2 ^= mixK2(j47);
                    return;
                case 8:
                    j46 = byteBuffer.getLong();
                    this.f49264h1 = mixK1(j46) ^ this.f49264h1;
                    this.h2 ^= mixK2(j47);
                    return;
                case 9:
                    j47 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j46 = byteBuffer.getLong();
                    this.f49264h1 = mixK1(j46) ^ this.f49264h1;
                    this.h2 ^= mixK2(j47);
                    return;
                case 10:
                    j47 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j47 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j46 = byteBuffer.getLong();
                    this.f49264h1 = mixK1(j46) ^ this.f49264h1;
                    this.h2 ^= mixK2(j47);
                    return;
                case 11:
                    j47 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j47 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j47 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j46 = byteBuffer.getLong();
                    this.f49264h1 = mixK1(j46) ^ this.f49264h1;
                    this.h2 ^= mixK2(j47);
                    return;
                case 12:
                    j47 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24;
                    j47 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j47 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j47 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j46 = byteBuffer.getLong();
                    this.f49264h1 = mixK1(j46) ^ this.f49264h1;
                    this.h2 ^= mixK2(j47);
                    return;
                case 13:
                    j47 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(12))) << 32;
                    j47 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24;
                    j47 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j47 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j47 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j46 = byteBuffer.getLong();
                    this.f49264h1 = mixK1(j46) ^ this.f49264h1;
                    this.h2 ^= mixK2(j47);
                    return;
                case 14:
                    j47 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(13))) << 40;
                    j47 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(12))) << 32;
                    j47 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24;
                    j47 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j47 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j47 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j46 = byteBuffer.getLong();
                    this.f49264h1 = mixK1(j46) ^ this.f49264h1;
                    this.h2 ^= mixK2(j47);
                    return;
                case 15:
                    j47 = ((long) UnsignedBytes.toInt(byteBuffer.get(14))) << 48;
                    j47 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(13))) << 40;
                    j47 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(12))) << 32;
                    j47 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24;
                    j47 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j47 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j47 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j46 = byteBuffer.getLong();
                    this.f49264h1 = mixK1(j46) ^ this.f49264h1;
                    this.h2 ^= mixK2(j47);
                    return;
                default:
                    throw new AssertionError("Should never get here.");
            }
        }
    }

    public Murmur3_128HashFunction(int i) {
        this.seed = i;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 128;
    }

    public boolean equals(Object obj2) {
        return (obj2 instanceof Murmur3_128HashFunction) && this.seed == ((Murmur3_128HashFunction) obj2).seed;
    }

    public int hashCode() {
        return Murmur3_128HashFunction.class.hashCode() ^ this.seed;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new Murmur3_128Hasher(this.seed);
    }

    public String toString() {
        return j6.a.v(new StringBuilder("Hashing.murmur3_128("), ")", this.seed);
    }
}
