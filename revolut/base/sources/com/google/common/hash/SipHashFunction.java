package com.google.common.hash;

import a0.d;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
final class SipHashFunction extends AbstractHashFunction implements Serializable {
    static final HashFunction SIP_HASH_24 = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f49266c;
    private final int d;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final long f49267k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private final long f49268k1;

    public static final class SipHasher extends AbstractStreamingHasher {
        private static final int CHUNK_SIZE = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f49269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f49270c;
        private final int d;
        private long finalM;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        private long f49271v0;

        /* JADX INFO: renamed from: v1, reason: collision with root package name */
        private long f49272v1;
        private long v2;

        /* JADX INFO: renamed from: v3, reason: collision with root package name */
        private long f49273v3;

        public SipHasher(int i, int i2, long j2, long j3) {
            super(8);
            this.f49269b = 0L;
            this.finalM = 0L;
            this.f49270c = i;
            this.d = i2;
            this.f49271v0 = 8317987319222330741L ^ j2;
            this.f49272v1 = 7237128888997146477L ^ j3;
            this.v2 = 7816392313619706465L ^ j2;
            this.f49273v3 = 8387220255154660723L ^ j3;
        }

        private void processM(long j2) {
            this.f49273v3 ^= j2;
            sipRound(this.f49270c);
            this.f49271v0 = j2 ^ this.f49271v0;
        }

        private void sipRound(int i) {
            for (int i2 = 0; i2 < i; i2++) {
                long j2 = this.f49271v0;
                long j3 = this.f49272v1;
                this.f49271v0 = j2 + j3;
                this.v2 += this.f49273v3;
                this.f49272v1 = Long.rotateLeft(j3, 13);
                long jRotateLeft = Long.rotateLeft(this.f49273v3, 16);
                long j5 = this.f49272v1;
                long j16 = this.f49271v0;
                this.f49272v1 = j5 ^ j16;
                this.f49273v3 = jRotateLeft ^ this.v2;
                long jRotateLeft2 = Long.rotateLeft(j16, 32);
                long j22 = this.v2;
                long j42 = this.f49272v1;
                this.v2 = j22 + j42;
                this.f49271v0 = jRotateLeft2 + this.f49273v3;
                this.f49272v1 = Long.rotateLeft(j42, 17);
                long jRotateLeft3 = Long.rotateLeft(this.f49273v3, 21);
                long j46 = this.f49272v1;
                long j47 = this.v2;
                this.f49272v1 = j46 ^ j47;
                this.f49273v3 = jRotateLeft3 ^ this.f49271v0;
                this.v2 = Long.rotateLeft(j47, 32);
            }
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public HashCode makeHash() {
            long j2 = this.finalM ^ (this.f49269b << 56);
            this.finalM = j2;
            processM(j2);
            this.v2 ^= 255;
            sipRound(this.d);
            return HashCode.fromLong(((this.f49271v0 ^ this.f49272v1) ^ this.v2) ^ this.f49273v3);
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void process(ByteBuffer byteBuffer) {
            this.f49269b += 8;
            processM(byteBuffer.getLong());
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void processRemaining(ByteBuffer byteBuffer) {
            this.f49269b += (long) byteBuffer.remaining();
            int i = 0;
            while (byteBuffer.hasRemaining()) {
                this.finalM ^= (((long) byteBuffer.get()) & 255) << i;
                i += 8;
            }
        }
    }

    public SipHashFunction(int i, int i2, long j2, long j3) {
        Preconditions.checkArgument(i > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", i);
        Preconditions.checkArgument(i2 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i2);
        this.f49266c = i;
        this.d = i2;
        this.f49267k0 = j2;
        this.f49268k1 = j3;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof SipHashFunction) {
            SipHashFunction sipHashFunction = (SipHashFunction) obj2;
            if (this.f49266c == sipHashFunction.f49266c && this.d == sipHashFunction.d && this.f49267k0 == sipHashFunction.f49267k0 && this.f49268k1 == sipHashFunction.f49268k1) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (int) ((((long) ((SipHashFunction.class.hashCode() ^ this.f49266c) ^ this.d)) ^ this.f49267k0) ^ this.f49268k1);
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new SipHasher(this.f49266c, this.d, this.f49267k0, this.f49268k1);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("Hashing.sipHash");
        sb6.append(this.f49266c);
        sb6.append("");
        sb6.append(this.d);
        sb6.append("(");
        sb6.append(this.f49267k0);
        sb6.append(", ");
        return d.j(this.f49268k1, ")", sb6);
    }
}
