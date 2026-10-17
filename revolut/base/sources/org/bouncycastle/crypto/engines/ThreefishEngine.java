package org.bouncycastle.crypto.engines;

import j6.a;
import okl.m;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.TweakableBlockCipherParameters;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class ThreefishEngine implements BlockCipher {
    public static final int BLOCKSIZE_1024 = 1024;
    public static final int BLOCKSIZE_256 = 256;
    public static final int BLOCKSIZE_512 = 512;
    private static final long C_240 = 2004413935125273122L;
    private static final int MAX_ROUNDS = 80;
    private static int[] MOD17 = null;
    private static int[] MOD3 = null;
    private static int[] MOD5 = null;
    private static int[] MOD9 = null;
    private static final int ROUNDS_1024 = 80;
    private static final int ROUNDS_256 = 72;
    private static final int ROUNDS_512 = 72;
    private static final int TWEAK_SIZE_BYTES = 16;
    private static final int TWEAK_SIZE_WORDS = 2;
    private int blocksizeBytes;
    private int blocksizeWords;
    private ThreefishCipher cipher;
    private long[] currentBlock;
    private boolean forEncryption;

    /* JADX INFO: renamed from: kw, reason: collision with root package name */
    private long[] f228384kw;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long[] f228385t;

    public static final class Threefish1024Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 24;
        private static final int ROTATION_0_1 = 13;
        private static final int ROTATION_0_2 = 8;
        private static final int ROTATION_0_3 = 47;
        private static final int ROTATION_0_4 = 8;
        private static final int ROTATION_0_5 = 17;
        private static final int ROTATION_0_6 = 22;
        private static final int ROTATION_0_7 = 37;
        private static final int ROTATION_1_0 = 38;
        private static final int ROTATION_1_1 = 19;
        private static final int ROTATION_1_2 = 10;
        private static final int ROTATION_1_3 = 55;
        private static final int ROTATION_1_4 = 49;
        private static final int ROTATION_1_5 = 18;
        private static final int ROTATION_1_6 = 23;
        private static final int ROTATION_1_7 = 52;
        private static final int ROTATION_2_0 = 33;
        private static final int ROTATION_2_1 = 4;
        private static final int ROTATION_2_2 = 51;
        private static final int ROTATION_2_3 = 13;
        private static final int ROTATION_2_4 = 34;
        private static final int ROTATION_2_5 = 41;
        private static final int ROTATION_2_6 = 59;
        private static final int ROTATION_2_7 = 17;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 20;
        private static final int ROTATION_3_2 = 48;
        private static final int ROTATION_3_3 = 41;
        private static final int ROTATION_3_4 = 47;
        private static final int ROTATION_3_5 = 28;
        private static final int ROTATION_3_6 = 16;
        private static final int ROTATION_3_7 = 25;
        private static final int ROTATION_4_0 = 41;
        private static final int ROTATION_4_1 = 9;
        private static final int ROTATION_4_2 = 37;
        private static final int ROTATION_4_3 = 31;
        private static final int ROTATION_4_4 = 12;
        private static final int ROTATION_4_5 = 47;
        private static final int ROTATION_4_6 = 44;
        private static final int ROTATION_4_7 = 30;
        private static final int ROTATION_5_0 = 16;
        private static final int ROTATION_5_1 = 34;
        private static final int ROTATION_5_2 = 56;
        private static final int ROTATION_5_3 = 51;
        private static final int ROTATION_5_4 = 4;
        private static final int ROTATION_5_5 = 53;
        private static final int ROTATION_5_6 = 42;
        private static final int ROTATION_5_7 = 41;
        private static final int ROTATION_6_0 = 31;
        private static final int ROTATION_6_1 = 44;
        private static final int ROTATION_6_2 = 47;
        private static final int ROTATION_6_3 = 46;
        private static final int ROTATION_6_4 = 19;
        private static final int ROTATION_6_5 = 42;
        private static final int ROTATION_6_6 = 44;
        private static final int ROTATION_6_7 = 25;
        private static final int ROTATION_7_0 = 9;
        private static final int ROTATION_7_1 = 48;
        private static final int ROTATION_7_2 = 35;
        private static final int ROTATION_7_3 = 52;
        private static final int ROTATION_7_4 = 23;
        private static final int ROTATION_7_5 = 31;
        private static final int ROTATION_7_6 = 37;
        private static final int ROTATION_7_7 = 20;

        public Threefish1024Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f228386kw;
            long[] jArr4 = this.f228387t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j2 = jArr[0];
            int i = 1;
            long j3 = jArr[1];
            long j5 = jArr[2];
            long j16 = jArr[3];
            long j22 = jArr[4];
            long j42 = jArr[5];
            long j46 = jArr[6];
            long j47 = jArr[7];
            long j57 = jArr[8];
            int i2 = 9;
            long j58 = jArr[9];
            long j65 = jArr[10];
            long j69 = jArr[11];
            long j76 = jArr[12];
            long j85 = jArr[13];
            long j100 = jArr[14];
            long jXorRotr = jArr[15];
            int i3 = 19;
            while (i3 >= i) {
                int i5 = iArr[i3];
                int i6 = iArr2[i3];
                int i21 = i5 + 1;
                long j101 = j2 - jArr3[i21];
                int i22 = i5 + 2;
                long j102 = j3 - jArr3[i22];
                int i32 = i5 + 3;
                long j103 = j5 - jArr3[i32];
                int i33 = i5 + 4;
                long j104 = j16 - jArr3[i33];
                int i43 = i5 + 5;
                int i59 = i;
                long j105 = j22 - jArr3[i43];
                int i66 = i5 + 6;
                long[] jArr5 = jArr3;
                long j106 = j42 - jArr3[i66];
                int i74 = i5 + 7;
                long[] jArr6 = jArr4;
                long j107 = j46 - jArr5[i74];
                int i92 = i5 + 8;
                int[] iArr3 = iArr2;
                long j108 = j47 - jArr5[i92];
                int i96 = i5 + 9;
                long j109 = j57 - jArr5[i96];
                int i99 = i5 + 10;
                long j110 = j58 - jArr5[i99];
                int i100 = i5 + 11;
                long j111 = j65 - jArr5[i100];
                int i101 = i5 + 12;
                long j112 = j69 - jArr5[i101];
                int i102 = i5 + 13;
                long j113 = j76 - jArr5[i102];
                int i103 = i5 + 14;
                int i104 = i6 + 1;
                long j114 = j85 - (jArr5[i103] + jArr6[i104]);
                int i105 = i5 + 15;
                long j115 = j100 - (jArr5[i105] + jArr6[i6 + 2]);
                long j116 = i3;
                long jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr - ((jArr5[i5 + 16] + j116) + 1), i2, j101);
                long j117 = j101 - jXorRotr2;
                long jXorRotr3 = ThreefishEngine.xorRotr(j112, 48, j103);
                long j118 = j103 - jXorRotr3;
                long jXorRotr4 = ThreefishEngine.xorRotr(j114, 35, j107);
                long j119 = j107 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(j110, 52, j105);
                long j120 = j105 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(j102, 23, j115);
                long j121 = j115 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(j106, 31, j109);
                long j122 = j109 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(j104, 37, j111);
                long j123 = j111 - jXorRotr8;
                long jXorRotr9 = ThreefishEngine.xorRotr(j108, 20, j113);
                long j124 = j113 - jXorRotr9;
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr9, 31, j117);
                long j125 = j117 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(jXorRotr7, 44, j118);
                long j126 = j118 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr8, 47, j120);
                long j127 = j120 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr6, 46, j119);
                long j128 = j119 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr2, 19, j124);
                long j129 = j124 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr4, 42, j121);
                long j130 = j121 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr3, 44, j122);
                long j131 = j122 - jXorRotr16;
                long jXorRotr17 = ThreefishEngine.xorRotr(jXorRotr5, 25, j123);
                long j132 = j123 - jXorRotr17;
                long jXorRotr18 = ThreefishEngine.xorRotr(jXorRotr17, 16, j125);
                long j133 = j125 - jXorRotr18;
                long jXorRotr19 = ThreefishEngine.xorRotr(jXorRotr15, 34, j126);
                long j134 = j126 - jXorRotr19;
                long jXorRotr20 = ThreefishEngine.xorRotr(jXorRotr16, 56, j128);
                long j135 = j128 - jXorRotr20;
                long jXorRotr21 = ThreefishEngine.xorRotr(jXorRotr14, 51, j127);
                long j136 = j127 - jXorRotr21;
                long jXorRotr22 = ThreefishEngine.xorRotr(jXorRotr10, 4, j132);
                long j137 = j132 - jXorRotr22;
                long jXorRotr23 = ThreefishEngine.xorRotr(jXorRotr12, 53, j129);
                long j138 = j129 - jXorRotr23;
                long jXorRotr24 = ThreefishEngine.xorRotr(jXorRotr11, 42, j130);
                long j139 = j130 - jXorRotr24;
                long jXorRotr25 = ThreefishEngine.xorRotr(jXorRotr13, 41, j131);
                long j140 = j131 - jXorRotr25;
                long jXorRotr26 = ThreefishEngine.xorRotr(jXorRotr25, 41, j133);
                long j141 = j133 - jXorRotr26;
                long jXorRotr27 = ThreefishEngine.xorRotr(jXorRotr23, 9, j134);
                long jXorRotr28 = ThreefishEngine.xorRotr(jXorRotr24, 37, j136);
                long j142 = j136 - jXorRotr28;
                long jXorRotr29 = ThreefishEngine.xorRotr(jXorRotr22, 31, j135);
                long j143 = j135 - jXorRotr29;
                long jXorRotr30 = ThreefishEngine.xorRotr(jXorRotr18, 12, j140);
                long j144 = j140 - jXorRotr30;
                long jXorRotr31 = ThreefishEngine.xorRotr(jXorRotr20, 47, j137);
                long j145 = j137 - jXorRotr31;
                long jXorRotr32 = ThreefishEngine.xorRotr(jXorRotr19, 44, j138);
                long j146 = j138 - jXorRotr32;
                long jXorRotr33 = ThreefishEngine.xorRotr(jXorRotr21, 30, j139);
                long j147 = j139 - jXorRotr33;
                long j148 = j141 - jArr5[i5];
                long j149 = jXorRotr26 - jArr5[i21];
                long j150 = (j134 - jXorRotr27) - jArr5[i22];
                long j151 = jXorRotr27 - jArr5[i32];
                long j152 = j142 - jArr5[i33];
                long j153 = jXorRotr28 - jArr5[i43];
                long j154 = j143 - jArr5[i66];
                long j155 = jXorRotr29 - jArr5[i74];
                long j156 = j144 - jArr5[i92];
                long j157 = jXorRotr30 - jArr5[i96];
                long j158 = j145 - jArr5[i99];
                long j159 = jXorRotr31 - jArr5[i100];
                long j160 = j146 - jArr5[i101];
                long j161 = jXorRotr32 - (jArr5[i102] + jArr6[i6]);
                long j162 = j147 - (jArr5[i103] + jArr6[i104]);
                long jXorRotr34 = ThreefishEngine.xorRotr(jXorRotr33 - (jArr5[i105] + j116), 5, j148);
                long j163 = j148 - jXorRotr34;
                long jXorRotr35 = ThreefishEngine.xorRotr(j159, 20, j150);
                long j164 = j150 - jXorRotr35;
                long jXorRotr36 = ThreefishEngine.xorRotr(j161, 48, j154);
                long j165 = j154 - jXorRotr36;
                long jXorRotr37 = ThreefishEngine.xorRotr(j157, 41, j152);
                long j166 = j152 - jXorRotr37;
                long jXorRotr38 = ThreefishEngine.xorRotr(j149, 47, j162);
                long j167 = j162 - jXorRotr38;
                long jXorRotr39 = ThreefishEngine.xorRotr(j153, 28, j156);
                long j168 = j156 - jXorRotr39;
                long jXorRotr40 = ThreefishEngine.xorRotr(j151, 16, j158);
                long j169 = j158 - jXorRotr40;
                long jXorRotr41 = ThreefishEngine.xorRotr(j155, 25, j160);
                long j170 = j160 - jXorRotr41;
                long jXorRotr42 = ThreefishEngine.xorRotr(jXorRotr41, 33, j163);
                long j171 = j163 - jXorRotr42;
                long jXorRotr43 = ThreefishEngine.xorRotr(jXorRotr39, 4, j164);
                long j172 = j164 - jXorRotr43;
                long jXorRotr44 = ThreefishEngine.xorRotr(jXorRotr40, 51, j166);
                long j173 = j166 - jXorRotr44;
                long jXorRotr45 = ThreefishEngine.xorRotr(jXorRotr38, 13, j165);
                long j174 = j165 - jXorRotr45;
                long jXorRotr46 = ThreefishEngine.xorRotr(jXorRotr34, 34, j170);
                long j175 = j170 - jXorRotr46;
                long jXorRotr47 = ThreefishEngine.xorRotr(jXorRotr36, 41, j167);
                long j176 = j167 - jXorRotr47;
                long jXorRotr48 = ThreefishEngine.xorRotr(jXorRotr35, 59, j168);
                long j177 = j168 - jXorRotr48;
                long jXorRotr49 = ThreefishEngine.xorRotr(jXorRotr37, 17, j169);
                long j178 = j169 - jXorRotr49;
                long jXorRotr50 = ThreefishEngine.xorRotr(jXorRotr49, 38, j171);
                long j179 = j171 - jXorRotr50;
                long jXorRotr51 = ThreefishEngine.xorRotr(jXorRotr47, 19, j172);
                long j180 = j172 - jXorRotr51;
                long jXorRotr52 = ThreefishEngine.xorRotr(jXorRotr48, 10, j174);
                long j181 = j174 - jXorRotr52;
                long jXorRotr53 = ThreefishEngine.xorRotr(jXorRotr46, 55, j173);
                long j182 = j173 - jXorRotr53;
                long jXorRotr54 = ThreefishEngine.xorRotr(jXorRotr42, 49, j178);
                long j183 = j178 - jXorRotr54;
                long jXorRotr55 = ThreefishEngine.xorRotr(jXorRotr44, 18, j175);
                long j184 = j175 - jXorRotr55;
                long jXorRotr56 = ThreefishEngine.xorRotr(jXorRotr43, 23, j176);
                long j185 = j176 - jXorRotr56;
                long jXorRotr57 = ThreefishEngine.xorRotr(jXorRotr45, 52, j177);
                long j186 = j177 - jXorRotr57;
                long jXorRotr58 = ThreefishEngine.xorRotr(jXorRotr57, 24, j179);
                long j187 = j179 - jXorRotr58;
                long jXorRotr59 = ThreefishEngine.xorRotr(jXorRotr55, 13, j180);
                j5 = j180 - jXorRotr59;
                long jXorRotr60 = ThreefishEngine.xorRotr(jXorRotr56, 8, j182);
                long j188 = j182 - jXorRotr60;
                long jXorRotr61 = ThreefishEngine.xorRotr(jXorRotr54, 47, j181);
                long j189 = j181 - jXorRotr61;
                long jXorRotr62 = ThreefishEngine.xorRotr(jXorRotr50, 8, j186);
                long j190 = j186 - jXorRotr62;
                long jXorRotr63 = ThreefishEngine.xorRotr(jXorRotr52, 17, j183);
                long j191 = j183 - jXorRotr63;
                long jXorRotr64 = ThreefishEngine.xorRotr(jXorRotr51, 22, j184);
                j76 = j184 - jXorRotr64;
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr53, 37, j185);
                j100 = j185 - jXorRotr;
                j69 = jXorRotr63;
                j65 = j191;
                jArr3 = jArr5;
                jArr4 = jArr6;
                iArr = iArr;
                j46 = j189;
                j42 = jXorRotr60;
                j2 = j187;
                i2 = 9;
                j16 = jXorRotr59;
                j85 = jXorRotr64;
                j47 = jXorRotr61;
                i3 -= 2;
                j58 = jXorRotr62;
                j22 = j188;
                j3 = jXorRotr58;
                i = i59;
                j57 = j190;
                iArr2 = iArr3;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            int i106 = i;
            long j192 = j2 - jArr7[0];
            long j193 = j3 - jArr7[i106];
            long j194 = j5 - jArr7[2];
            long j195 = j16 - jArr7[3];
            long j196 = j22 - jArr7[4];
            long j197 = j42 - jArr7[5];
            long j198 = j46 - jArr7[6];
            long j199 = j47 - jArr7[7];
            long j200 = j57 - jArr7[8];
            long j201 = j58 - jArr7[9];
            long j202 = j65 - jArr7[10];
            long j203 = j69 - jArr7[11];
            long j204 = j76 - jArr7[12];
            long j205 = j85 - (jArr7[13] + jArr8[0]);
            long j206 = j100 - (jArr7[14] + jArr8[i106]);
            long j207 = jXorRotr - jArr7[15];
            jArr2[0] = j192;
            jArr2[i106] = j193;
            jArr2[2] = j194;
            jArr2[3] = j195;
            jArr2[4] = j196;
            jArr2[5] = j197;
            jArr2[6] = j198;
            jArr2[7] = j199;
            jArr2[8] = j200;
            jArr2[9] = j201;
            jArr2[10] = j202;
            jArr2[11] = j203;
            jArr2[12] = j204;
            jArr2[13] = j205;
            jArr2[14] = j206;
            jArr2[15] = j207;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f228386kw;
            long[] jArr4 = this.f228387t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j2 = jArr[0];
            long j3 = jArr[1];
            long j5 = jArr[2];
            long j16 = jArr[3];
            long j22 = jArr[4];
            long j42 = jArr[5];
            long j46 = jArr[6];
            long j47 = jArr[7];
            long j57 = jArr[8];
            long j58 = jArr[9];
            long j65 = jArr[10];
            long j69 = jArr[11];
            int i = 9;
            long j76 = jArr[12];
            int i2 = 12;
            int i3 = 13;
            long j85 = jArr[13];
            long j100 = jArr[14];
            long j101 = jArr[15];
            long j102 = j2 + jArr3[0];
            long j103 = j3 + jArr3[1];
            long j104 = j5 + jArr3[2];
            long j105 = j16 + jArr3[3];
            long j106 = j22 + jArr3[4];
            long j107 = j42 + jArr3[5];
            long j108 = j46 + jArr3[6];
            long j109 = j47 + jArr3[7];
            long j110 = j57 + jArr3[8];
            long j111 = j58 + jArr3[9];
            long j112 = j65 + jArr3[10];
            long j113 = j69 + jArr3[11];
            long j114 = j76 + jArr3[12];
            long j115 = jArr3[13] + jArr4[0] + j85;
            long j116 = jArr3[14] + jArr4[1] + j100;
            long j117 = j107;
            long j118 = j109;
            long j119 = j111;
            long j120 = j113;
            long j121 = j101 + jArr3[15];
            long j122 = j115;
            long j123 = j106;
            long j124 = j102;
            long j125 = j105;
            int i5 = 1;
            while (i5 < 20) {
                int i6 = iArr[i5];
                int i21 = iArr2[i5];
                long j126 = j125;
                long j127 = j124 + j103;
                long jRotlXor = ThreefishEngine.rotlXor(j103, 24, j127);
                long j128 = j104 + j126;
                long jRotlXor2 = ThreefishEngine.rotlXor(j126, i3, j128);
                int i22 = i5;
                long j129 = j117;
                long j130 = j123 + j129;
                long jRotlXor3 = ThreefishEngine.rotlXor(j129, 8, j130);
                long[] jArr5 = jArr3;
                long j131 = j118;
                long j132 = j108 + j131;
                long[] jArr6 = jArr4;
                long jRotlXor4 = ThreefishEngine.rotlXor(j131, 47, j132);
                long j133 = j119;
                long j134 = j110 + j133;
                int[] iArr3 = iArr2;
                long jRotlXor5 = ThreefishEngine.rotlXor(j133, 8, j134);
                long j135 = j120;
                long j136 = j112 + j135;
                long jRotlXor6 = ThreefishEngine.rotlXor(j135, 17, j136);
                long j137 = j122;
                long j138 = j114 + j137;
                long jRotlXor7 = ThreefishEngine.rotlXor(j137, 22, j138);
                long j139 = j121;
                long j140 = j116 + j139;
                long jRotlXor8 = ThreefishEngine.rotlXor(j139, 37, j140);
                long j141 = j127 + jRotlXor5;
                long jRotlXor9 = ThreefishEngine.rotlXor(jRotlXor5, 38, j141);
                long j142 = j128 + jRotlXor7;
                long jRotlXor10 = ThreefishEngine.rotlXor(jRotlXor7, 19, j142);
                long j143 = j132 + jRotlXor6;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor6, 10, j143);
                long j144 = j130 + jRotlXor8;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor8, 55, j144);
                long j145 = j136 + jRotlXor4;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor4, 49, j145);
                long j146 = j138 + jRotlXor2;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor2, 18, j146);
                long j147 = j140 + jRotlXor3;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor3, 23, j147);
                long j148 = j134 + jRotlXor;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor, 52, j148);
                long j149 = j141 + jRotlXor13;
                long jRotlXor17 = ThreefishEngine.rotlXor(jRotlXor13, 33, j149);
                long j150 = j142 + jRotlXor15;
                long jRotlXor18 = ThreefishEngine.rotlXor(jRotlXor15, 4, j150);
                long j151 = j144 + jRotlXor14;
                long jRotlXor19 = ThreefishEngine.rotlXor(jRotlXor14, 51, j151);
                long j152 = j143 + jRotlXor16;
                long jRotlXor20 = ThreefishEngine.rotlXor(jRotlXor16, 13, j152);
                long j153 = j146 + jRotlXor12;
                long jRotlXor21 = ThreefishEngine.rotlXor(jRotlXor12, 34, j153);
                long j154 = j147 + jRotlXor10;
                long jRotlXor22 = ThreefishEngine.rotlXor(jRotlXor10, 41, j154);
                long j155 = j148 + jRotlXor11;
                long jRotlXor23 = ThreefishEngine.rotlXor(jRotlXor11, 59, j155);
                long j156 = j145 + jRotlXor9;
                long jRotlXor24 = ThreefishEngine.rotlXor(jRotlXor9, 17, j156);
                long j157 = j149 + jRotlXor21;
                long jRotlXor25 = ThreefishEngine.rotlXor(jRotlXor21, 5, j157);
                long j158 = j150 + jRotlXor23;
                long jRotlXor26 = ThreefishEngine.rotlXor(jRotlXor23, 20, j158);
                long j159 = j152 + jRotlXor22;
                long jRotlXor27 = ThreefishEngine.rotlXor(jRotlXor22, 48, j159);
                long j160 = j151 + jRotlXor24;
                long jRotlXor28 = ThreefishEngine.rotlXor(jRotlXor24, 41, j160);
                long j161 = j154 + jRotlXor20;
                long jRotlXor29 = ThreefishEngine.rotlXor(jRotlXor20, 47, j161);
                long j162 = j155 + jRotlXor18;
                long jRotlXor30 = ThreefishEngine.rotlXor(jRotlXor18, 28, j162);
                long j163 = j156 + jRotlXor19;
                long jRotlXor31 = ThreefishEngine.rotlXor(jRotlXor19, 16, j163);
                long j164 = j153 + jRotlXor17;
                long jRotlXor32 = ThreefishEngine.rotlXor(jRotlXor17, 25, j164);
                long j165 = j157 + jArr5[i6];
                int i32 = i6 + 1;
                long j166 = jRotlXor29 + jArr5[i32];
                int i33 = i6 + 2;
                long j167 = j158 + jArr5[i33];
                int i43 = i6 + 3;
                long j168 = jRotlXor31 + jArr5[i43];
                int i59 = i6 + 4;
                long j169 = j160 + jArr5[i59];
                int i66 = i6 + 5;
                long j170 = jRotlXor30 + jArr5[i66];
                int i74 = i6 + 6;
                long j171 = j159 + jArr5[i74];
                int i92 = i6 + 7;
                long j172 = jRotlXor32 + jArr5[i92];
                int i96 = i6 + 8;
                long j173 = j162 + jArr5[i96];
                int i99 = i6 + 9;
                long j174 = jRotlXor28 + jArr5[i99];
                int i100 = i6 + 10;
                long j175 = j163 + jArr5[i100];
                int i101 = i6 + 11;
                long j176 = jRotlXor26 + jArr5[i101];
                int i102 = i6 + 12;
                long j177 = j164 + jArr5[i102];
                int i103 = i6 + 13;
                long j178 = jArr5[i103] + jArr6[i21] + jRotlXor27;
                int i104 = i6 + 14;
                int i105 = i21 + 1;
                long j179 = jArr5[i104] + jArr6[i105] + j161;
                int i106 = i6 + 15;
                long j180 = i22;
                long j181 = jArr5[i106] + j180 + jRotlXor25;
                long j182 = j165 + j166;
                long jRotlXor33 = ThreefishEngine.rotlXor(j166, 41, j182);
                long j183 = j167 + j168;
                long jRotlXor34 = ThreefishEngine.rotlXor(j168, i, j183);
                long j184 = j169 + j170;
                long jRotlXor35 = ThreefishEngine.rotlXor(j170, 37, j184);
                long j185 = j171 + j172;
                long jRotlXor36 = ThreefishEngine.rotlXor(j172, 31, j185);
                long j186 = j173 + j174;
                long jRotlXor37 = ThreefishEngine.rotlXor(j174, i2, j186);
                long j187 = j175 + j176;
                long jRotlXor38 = ThreefishEngine.rotlXor(j176, 47, j187);
                long j188 = j177 + j178;
                long jRotlXor39 = ThreefishEngine.rotlXor(j178, 44, j188);
                long j189 = j179 + j181;
                long jRotlXor40 = ThreefishEngine.rotlXor(j181, 30, j189);
                long j190 = j182 + jRotlXor37;
                long jRotlXor41 = ThreefishEngine.rotlXor(jRotlXor37, 16, j190);
                long j191 = j183 + jRotlXor39;
                long jRotlXor42 = ThreefishEngine.rotlXor(jRotlXor39, 34, j191);
                long j192 = j185 + jRotlXor38;
                long jRotlXor43 = ThreefishEngine.rotlXor(jRotlXor38, 56, j192);
                long j193 = j184 + jRotlXor40;
                long jRotlXor44 = ThreefishEngine.rotlXor(jRotlXor40, 51, j193);
                long j194 = j187 + jRotlXor36;
                long jRotlXor45 = ThreefishEngine.rotlXor(jRotlXor36, 4, j194);
                long j195 = j188 + jRotlXor34;
                long jRotlXor46 = ThreefishEngine.rotlXor(jRotlXor34, 53, j195);
                long j196 = j189 + jRotlXor35;
                long jRotlXor47 = ThreefishEngine.rotlXor(jRotlXor35, 42, j196);
                long j197 = j186 + jRotlXor33;
                long jRotlXor48 = ThreefishEngine.rotlXor(jRotlXor33, 41, j197);
                long j198 = j190 + jRotlXor45;
                long jRotlXor49 = ThreefishEngine.rotlXor(jRotlXor45, 31, j198);
                long j199 = j191 + jRotlXor47;
                long jRotlXor50 = ThreefishEngine.rotlXor(jRotlXor47, 44, j199);
                long j200 = j193 + jRotlXor46;
                long jRotlXor51 = ThreefishEngine.rotlXor(jRotlXor46, 47, j200);
                long j201 = j192 + jRotlXor48;
                long jRotlXor52 = ThreefishEngine.rotlXor(jRotlXor48, 46, j201);
                long j202 = j195 + jRotlXor44;
                long jRotlXor53 = ThreefishEngine.rotlXor(jRotlXor44, 19, j202);
                long j203 = j196 + jRotlXor42;
                long jRotlXor54 = ThreefishEngine.rotlXor(jRotlXor42, 42, j203);
                long j204 = j197 + jRotlXor43;
                long jRotlXor55 = ThreefishEngine.rotlXor(jRotlXor43, 44, j204);
                long j205 = j194 + jRotlXor41;
                long jRotlXor56 = ThreefishEngine.rotlXor(jRotlXor41, 25, j205);
                long j206 = j198 + jRotlXor53;
                long jRotlXor57 = ThreefishEngine.rotlXor(jRotlXor53, 9, j206);
                long j207 = j199 + jRotlXor55;
                long jRotlXor58 = ThreefishEngine.rotlXor(jRotlXor55, 48, j207);
                long j208 = j201 + jRotlXor54;
                long jRotlXor59 = ThreefishEngine.rotlXor(jRotlXor54, 35, j208);
                long j209 = j200 + jRotlXor56;
                long jRotlXor60 = ThreefishEngine.rotlXor(jRotlXor56, 52, j209);
                long j210 = j203 + jRotlXor52;
                long jRotlXor61 = ThreefishEngine.rotlXor(jRotlXor52, 23, j210);
                long j211 = j204 + jRotlXor50;
                long jRotlXor62 = ThreefishEngine.rotlXor(jRotlXor50, 31, j211);
                long j212 = j205 + jRotlXor51;
                long jRotlXor63 = ThreefishEngine.rotlXor(jRotlXor51, 37, j212);
                long j213 = j202 + jRotlXor49;
                long jRotlXor64 = ThreefishEngine.rotlXor(jRotlXor49, 20, j213);
                long j214 = jArr5[i32] + j206;
                long j215 = jRotlXor61 + jArr5[i33];
                long j216 = j207 + jArr5[i43];
                long j217 = jRotlXor63 + jArr5[i59];
                long j218 = j209 + jArr5[i66];
                long j219 = jRotlXor62 + jArr5[i74];
                long j220 = j208 + jArr5[i92];
                long j221 = jRotlXor64 + jArr5[i96];
                long j222 = j211 + jArr5[i99];
                j119 = jRotlXor60 + jArr5[i100];
                long j223 = j212 + jArr5[i101];
                long j224 = jRotlXor58 + jArr5[i102];
                j114 = j213 + jArr5[i103];
                j122 = jArr5[i104] + jArr6[i105] + jRotlXor59;
                long j225 = jArr5[i106] + jArr6[i21 + 2] + j210;
                j121 = jArr5[i6 + 16] + j180 + 1 + jRotlXor57;
                j108 = j220;
                j110 = j222;
                j123 = j218;
                j103 = j215;
                j104 = j216;
                i5 = i22 + 2;
                j125 = j217;
                j112 = j223;
                j120 = j224;
                j117 = j219;
                i3 = 13;
                i = 9;
                i2 = 12;
                j118 = j221;
                j124 = j214;
                j116 = j225;
                jArr3 = jArr5;
                jArr4 = jArr6;
                iArr = iArr;
                iArr2 = iArr3;
            }
            jArr2[0] = j124;
            jArr2[1] = j103;
            jArr2[2] = j104;
            jArr2[3] = j125;
            jArr2[4] = j123;
            jArr2[5] = j117;
            jArr2[6] = j108;
            jArr2[7] = j118;
            jArr2[8] = j110;
            jArr2[9] = j119;
            jArr2[10] = j112;
            jArr2[11] = j120;
            jArr2[12] = j114;
            jArr2[13] = j122;
            jArr2[14] = j116;
            jArr2[15] = j121;
        }
    }

    public static final class Threefish256Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 14;
        private static final int ROTATION_0_1 = 16;
        private static final int ROTATION_1_0 = 52;
        private static final int ROTATION_1_1 = 57;
        private static final int ROTATION_2_0 = 23;
        private static final int ROTATION_2_1 = 40;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 37;
        private static final int ROTATION_4_0 = 25;
        private static final int ROTATION_4_1 = 33;
        private static final int ROTATION_5_0 = 46;
        private static final int ROTATION_5_1 = 12;
        private static final int ROTATION_6_0 = 58;
        private static final int ROTATION_6_1 = 22;
        private static final int ROTATION_7_0 = 32;
        private static final int ROTATION_7_1 = 32;

        public Threefish256Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f228386kw;
            long[] jArr4 = this.f228387t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j2 = jArr[0];
            int i = 1;
            long j3 = jArr[1];
            char c2 = 2;
            long j5 = jArr[2];
            long jXorRotr = jArr[3];
            int i2 = 17;
            while (i2 >= i) {
                int i3 = iArr[i2];
                int i5 = iArr2[i2];
                int i6 = i3 + 1;
                long j16 = j2 - jArr3[i6];
                int i21 = i3 + 2;
                int i22 = i5 + 1;
                long j22 = j3 - (jArr3[i21] + jArr4[i22]);
                int i32 = i3 + 3;
                long j42 = j5 - (jArr3[i32] + jArr4[i5 + 2]);
                int i33 = i;
                long j46 = i2;
                char c3 = c2;
                long jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr - ((jArr3[i3 + 4] + j46) + 1), 32, j16);
                long j47 = j16 - jXorRotr2;
                long[] jArr5 = jArr3;
                long jXorRotr3 = ThreefishEngine.xorRotr(j22, 32, j42);
                long j57 = j42 - jXorRotr3;
                long[] jArr6 = jArr4;
                long jXorRotr4 = ThreefishEngine.xorRotr(jXorRotr3, 58, j47);
                long j58 = j47 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(jXorRotr2, 22, j57);
                long j65 = j57 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(jXorRotr5, 46, j58);
                long j69 = j58 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(jXorRotr4, 12, j65);
                long j76 = j65 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(jXorRotr7, 25, j69);
                long jXorRotr9 = ThreefishEngine.xorRotr(jXorRotr6, 33, j76);
                long j85 = (j69 - jXorRotr8) - jArr5[i3];
                long j100 = jXorRotr8 - (jArr5[i6] + jArr6[i5]);
                long j101 = (j76 - jXorRotr9) - (jArr5[i21] + jArr6[i22]);
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr9 - (jArr5[i32] + j46), 5, j85);
                long j102 = j85 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(j100, 37, j101);
                long j103 = j101 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr11, 23, j102);
                long j104 = j102 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr10, 40, j103);
                long j105 = j103 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr13, 52, j104);
                long j106 = j104 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr12, 57, j105);
                long j107 = j105 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr15, 14, j106);
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr14, 16, j107);
                j5 = j107 - jXorRotr;
                i2 -= 2;
                j3 = jXorRotr16;
                i = i33;
                jArr3 = jArr5;
                c2 = c3;
                j2 = j106 - jXorRotr16;
                jArr4 = jArr6;
                iArr = iArr;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            int i43 = i;
            char c5 = c2;
            long j108 = j2 - jArr7[0];
            long j109 = j3 - (jArr7[i43] + jArr8[0]);
            long j110 = j5 - (jArr7[c5] + jArr8[i43]);
            long j111 = jXorRotr - jArr7[3];
            jArr2[0] = j108;
            jArr2[i43] = j109;
            jArr2[c5] = j110;
            jArr2[3] = j111;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f228386kw;
            long[] jArr4 = this.f228387t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j2 = jArr[0];
            long j3 = jArr[1];
            char c2 = 2;
            long j5 = jArr[2];
            long j16 = jArr[3];
            long j22 = j2 + jArr3[0];
            long j42 = jArr3[1] + jArr4[0] + j3;
            long j46 = jArr3[2] + jArr4[1] + j5;
            long j47 = j16 + jArr3[3];
            long j57 = j46;
            long j58 = j42;
            int i = 1;
            while (i < 18) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                long j65 = j22 + j58;
                char c3 = c2;
                long jRotlXor = ThreefishEngine.rotlXor(j58, 14, j65);
                long j69 = j57 + j47;
                long jRotlXor2 = ThreefishEngine.rotlXor(j47, 16, j69);
                long[] jArr5 = jArr3;
                long j76 = j65 + jRotlXor2;
                long jRotlXor3 = ThreefishEngine.rotlXor(jRotlXor2, 52, j76);
                long j85 = j69 + jRotlXor;
                long jRotlXor4 = ThreefishEngine.rotlXor(jRotlXor, 57, j85);
                long j100 = j76 + jRotlXor4;
                long jRotlXor5 = ThreefishEngine.rotlXor(jRotlXor4, 23, j100);
                long j101 = j85 + jRotlXor3;
                long jRotlXor6 = ThreefishEngine.rotlXor(jRotlXor3, 40, j101);
                long j102 = j100 + jRotlXor6;
                long jRotlXor7 = ThreefishEngine.rotlXor(jRotlXor6, 5, j102);
                long j103 = j101 + jRotlXor5;
                long jRotlXor8 = ThreefishEngine.rotlXor(jRotlXor5, 37, j103);
                long j104 = j102 + jArr5[i2];
                int i5 = i2 + 1;
                long j105 = jArr5[i5] + jArr4[i3] + jRotlXor8;
                int i6 = i2 + 2;
                int i21 = i3 + 1;
                long j106 = jArr5[i6] + jArr4[i21] + j103;
                int i22 = i2 + 3;
                long j107 = i;
                long j108 = jArr5[i22] + j107 + jRotlXor7;
                long[] jArr6 = jArr4;
                long j109 = j104 + j105;
                long jRotlXor9 = ThreefishEngine.rotlXor(j105, 25, j109);
                long j110 = j106 + j108;
                long jRotlXor10 = ThreefishEngine.rotlXor(j108, 33, j110);
                long j111 = j109 + jRotlXor10;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor10, 46, j111);
                long j112 = j110 + jRotlXor9;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor9, 12, j112);
                long j113 = j111 + jRotlXor12;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor12, 58, j113);
                long j114 = j112 + jRotlXor11;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor11, 22, j114);
                long j115 = j113 + jRotlXor14;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor14, 32, j115);
                long j116 = j114 + jRotlXor13;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor13, 32, j116);
                long j117 = j115 + jArr5[i5];
                j58 = jArr5[i6] + jArr6[i21] + jRotlXor16;
                j57 = jArr5[i22] + jArr6[i3 + 2] + j116;
                j47 = jArr5[i2 + 4] + j107 + 1 + jRotlXor15;
                i += 2;
                j22 = j117;
                c2 = c3;
                jArr3 = jArr5;
                jArr4 = jArr6;
                iArr = iArr;
            }
            jArr2[0] = j22;
            jArr2[1] = j58;
            jArr2[c2] = j57;
            jArr2[3] = j47;
        }
    }

    public static final class Threefish512Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 46;
        private static final int ROTATION_0_1 = 36;
        private static final int ROTATION_0_2 = 19;
        private static final int ROTATION_0_3 = 37;
        private static final int ROTATION_1_0 = 33;
        private static final int ROTATION_1_1 = 27;
        private static final int ROTATION_1_2 = 14;
        private static final int ROTATION_1_3 = 42;
        private static final int ROTATION_2_0 = 17;
        private static final int ROTATION_2_1 = 49;
        private static final int ROTATION_2_2 = 36;
        private static final int ROTATION_2_3 = 39;
        private static final int ROTATION_3_0 = 44;
        private static final int ROTATION_3_1 = 9;
        private static final int ROTATION_3_2 = 54;
        private static final int ROTATION_3_3 = 56;
        private static final int ROTATION_4_0 = 39;
        private static final int ROTATION_4_1 = 30;
        private static final int ROTATION_4_2 = 34;
        private static final int ROTATION_4_3 = 24;
        private static final int ROTATION_5_0 = 13;
        private static final int ROTATION_5_1 = 50;
        private static final int ROTATION_5_2 = 10;
        private static final int ROTATION_5_3 = 17;
        private static final int ROTATION_6_0 = 25;
        private static final int ROTATION_6_1 = 29;
        private static final int ROTATION_6_2 = 39;
        private static final int ROTATION_6_3 = 43;
        private static final int ROTATION_7_0 = 8;
        private static final int ROTATION_7_1 = 35;
        private static final int ROTATION_7_2 = 56;
        private static final int ROTATION_7_3 = 22;

        public Threefish512Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f228386kw;
            long[] jArr4 = this.f228387t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            char c2 = 5;
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j2 = jArr[0];
            int i = 1;
            long j3 = jArr[1];
            char c3 = 2;
            long j5 = jArr[2];
            long jXorRotr = jArr[3];
            long j16 = jArr[4];
            long jXorRotr2 = jArr[5];
            long j22 = jArr[6];
            long jXorRotr3 = jArr[7];
            int i2 = 17;
            while (i2 >= i) {
                int i3 = iArr[i2];
                int i5 = iArr2[i2];
                int i6 = i3 + 1;
                long j42 = j2 - jArr3[i6];
                int i21 = i3 + 2;
                long j46 = j3 - jArr3[i21];
                int i22 = i3 + 3;
                long j47 = j5 - jArr3[i22];
                int i32 = i3 + 4;
                long j57 = jXorRotr - jArr3[i32];
                int i33 = i3 + 5;
                char c5 = c3;
                long j58 = j16 - jArr3[i33];
                int i43 = i3 + 6;
                int i59 = i5 + 1;
                int i66 = i;
                long j65 = jXorRotr2 - (jArr3[i43] + jArr4[i59]);
                int i74 = i3 + 7;
                long[] jArr5 = jArr3;
                long j69 = j22 - (jArr3[i74] + jArr4[i5 + 2]);
                long[] jArr6 = jArr4;
                long j76 = i2;
                long j85 = jXorRotr3 - ((jArr5[i3 + 8] + j76) + 1);
                int[] iArr3 = iArr2;
                long jXorRotr4 = ThreefishEngine.xorRotr(j46, 8, j69);
                long j100 = j69 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(j85, 35, j42);
                long j101 = j42 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(j65, 56, j47);
                long j102 = j47 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(j57, 22, j58);
                long j103 = j58 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(jXorRotr4, 25, j103);
                long j104 = j103 - jXorRotr8;
                long jXorRotr9 = ThreefishEngine.xorRotr(jXorRotr7, 29, j100);
                long j105 = j100 - jXorRotr9;
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr6, 39, j101);
                long j106 = j101 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(jXorRotr5, 43, j102);
                long j107 = j102 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr8, 13, j107);
                long j108 = j107 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr11, 50, j104);
                long j109 = j104 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr10, 10, j105);
                long j110 = j105 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr9, 17, j106);
                long j111 = j106 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr12, 39, j111);
                long j112 = j111 - jXorRotr16;
                long jXorRotr17 = ThreefishEngine.xorRotr(jXorRotr15, 30, j108);
                long jXorRotr18 = ThreefishEngine.xorRotr(jXorRotr14, 34, j109);
                long jXorRotr19 = ThreefishEngine.xorRotr(jXorRotr13, 24, j110);
                long j113 = j110 - jXorRotr19;
                long j114 = j112 - jArr5[i3];
                long j115 = jXorRotr16 - jArr5[i6];
                long j116 = (j108 - jXorRotr17) - jArr5[i21];
                long j117 = jXorRotr17 - jArr5[i22];
                long j118 = (j109 - jXorRotr18) - jArr5[i32];
                long j119 = jXorRotr18 - (jArr5[i33] + jArr6[i5]);
                long j120 = j113 - (jArr5[i43] + jArr6[i59]);
                long j121 = jXorRotr19 - (jArr5[i74] + j76);
                long jXorRotr20 = ThreefishEngine.xorRotr(j115, 44, j120);
                long j122 = j120 - jXorRotr20;
                long jXorRotr21 = ThreefishEngine.xorRotr(j121, 9, j114);
                long j123 = j114 - jXorRotr21;
                long jXorRotr22 = ThreefishEngine.xorRotr(j119, 54, j116);
                long j124 = j116 - jXorRotr22;
                long jXorRotr23 = ThreefishEngine.xorRotr(j117, 56, j118);
                long j125 = j118 - jXorRotr23;
                long jXorRotr24 = ThreefishEngine.xorRotr(jXorRotr20, 17, j125);
                long j126 = j125 - jXorRotr24;
                long jXorRotr25 = ThreefishEngine.xorRotr(jXorRotr23, 49, j122);
                long j127 = j122 - jXorRotr25;
                long jXorRotr26 = ThreefishEngine.xorRotr(jXorRotr22, 36, j123);
                long j128 = j123 - jXorRotr26;
                long jXorRotr27 = ThreefishEngine.xorRotr(jXorRotr21, 39, j124);
                long j129 = j124 - jXorRotr27;
                long jXorRotr28 = ThreefishEngine.xorRotr(jXorRotr24, 33, j129);
                long j130 = j129 - jXorRotr28;
                long jXorRotr29 = ThreefishEngine.xorRotr(jXorRotr27, 27, j126);
                long j131 = j126 - jXorRotr29;
                long jXorRotr30 = ThreefishEngine.xorRotr(jXorRotr26, 14, j127);
                long j132 = j127 - jXorRotr30;
                long jXorRotr31 = ThreefishEngine.xorRotr(jXorRotr25, 42, j128);
                long j133 = j128 - jXorRotr31;
                long jXorRotr32 = ThreefishEngine.xorRotr(jXorRotr28, 46, j133);
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr31, 36, j130);
                jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr30, 19, j131);
                long j134 = j131 - jXorRotr2;
                jXorRotr3 = ThreefishEngine.xorRotr(jXorRotr29, 37, j132);
                j22 = j132 - jXorRotr3;
                j5 = j130 - jXorRotr;
                j3 = jXorRotr32;
                i2 -= 2;
                j2 = j133 - jXorRotr32;
                i = i66;
                jArr3 = jArr5;
                c2 = c2;
                c3 = c5;
                iArr2 = iArr3;
                j16 = j134;
                jArr4 = jArr6;
                iArr = iArr;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            char c6 = c2;
            int i92 = i;
            char c7 = c3;
            long j135 = j2 - jArr7[0];
            long j136 = j3 - jArr7[i92];
            long j137 = j5 - jArr7[c7];
            long j138 = jXorRotr - jArr7[3];
            long j139 = j16 - jArr7[4];
            long j140 = jXorRotr2 - (jArr7[c6] + jArr8[0]);
            long j141 = j22 - (jArr7[6] + jArr8[i92]);
            long j142 = jXorRotr3 - jArr7[7];
            jArr2[0] = j135;
            jArr2[i92] = j136;
            jArr2[c7] = j137;
            jArr2[3] = j138;
            jArr2[4] = j139;
            jArr2[c6] = j140;
            jArr2[6] = j141;
            jArr2[7] = j142;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f228386kw;
            long[] jArr4 = this.f228387t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j2 = jArr[0];
            long j3 = jArr[1];
            long j5 = jArr[2];
            long j16 = jArr[3];
            long j22 = jArr[4];
            long j42 = jArr[5];
            long j46 = jArr[6];
            long j47 = jArr[7];
            long j57 = j2 + jArr3[0];
            long j58 = j3 + jArr3[1];
            long j65 = j5 + jArr3[2];
            long j69 = j16 + jArr3[3];
            long j76 = j22 + jArr3[4];
            long j85 = jArr3[5] + jArr4[0] + j42;
            long j100 = jArr3[6] + jArr4[1] + j46;
            long j101 = j47 + jArr3[7];
            long j102 = j100;
            long j103 = j76;
            long j104 = j57;
            int i = 1;
            long j105 = j69;
            long j106 = j85;
            long j107 = j65;
            long j108 = j101;
            while (i < 18) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                long j109 = j105;
                long j110 = j104 + j58;
                long jRotlXor = ThreefishEngine.rotlXor(j58, 46, j110);
                long[] jArr5 = jArr3;
                long j111 = j107 + j109;
                long[] jArr6 = jArr4;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long jRotlXor2 = ThreefishEngine.rotlXor(j109, 36, j111);
                long j112 = j103 + j106;
                long jRotlXor3 = ThreefishEngine.rotlXor(j106, 19, j112);
                long j113 = j102 + j108;
                long jRotlXor4 = ThreefishEngine.rotlXor(j108, 37, j113);
                long j114 = j111 + jRotlXor;
                long jRotlXor5 = ThreefishEngine.rotlXor(jRotlXor, 33, j114);
                long j115 = j112 + jRotlXor4;
                long jRotlXor6 = ThreefishEngine.rotlXor(jRotlXor4, 27, j115);
                long j116 = j113 + jRotlXor3;
                long jRotlXor7 = ThreefishEngine.rotlXor(jRotlXor3, 14, j116);
                long j117 = j110 + jRotlXor2;
                long jRotlXor8 = ThreefishEngine.rotlXor(jRotlXor2, 42, j117);
                long j118 = j115 + jRotlXor5;
                long jRotlXor9 = ThreefishEngine.rotlXor(jRotlXor5, 17, j118);
                long j119 = j116 + jRotlXor8;
                long jRotlXor10 = ThreefishEngine.rotlXor(jRotlXor8, 49, j119);
                long j120 = j117 + jRotlXor7;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor7, 36, j120);
                long j121 = j114 + jRotlXor6;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor6, 39, j121);
                int i5 = i;
                long j122 = j119 + jRotlXor9;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor9, 44, j122);
                long j123 = j120 + jRotlXor12;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor12, 9, j123);
                long j124 = j121 + jRotlXor11;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor11, 54, j124);
                long j125 = j118 + jRotlXor10;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor10, 56, j125);
                long j126 = j123 + jArr5[i2];
                int i6 = i2 + 1;
                long j127 = jRotlXor13 + jArr5[i6];
                int i21 = i2 + 2;
                long j128 = j124 + jArr5[i21];
                int i22 = i2 + 3;
                long j129 = jRotlXor16 + jArr5[i22];
                int i32 = i2 + 4;
                long j130 = j125 + jArr5[i32];
                int i33 = i2 + 5;
                long j131 = jArr5[i33] + jArr6[i3] + jRotlXor15;
                int i43 = i2 + 6;
                int i59 = i3 + 1;
                long j132 = jArr5[i43] + jArr6[i59] + j122;
                int i66 = i2 + 7;
                long j133 = i5;
                long j134 = jArr5[i66] + j133 + jRotlXor14;
                long j135 = j126 + j127;
                long jRotlXor17 = ThreefishEngine.rotlXor(j127, 39, j135);
                long j136 = j128 + j129;
                long jRotlXor18 = ThreefishEngine.rotlXor(j129, 30, j136);
                long j137 = j130 + j131;
                long jRotlXor19 = ThreefishEngine.rotlXor(j131, 34, j137);
                long j138 = j132 + j134;
                long jRotlXor20 = ThreefishEngine.rotlXor(j134, 24, j138);
                long j139 = j136 + jRotlXor17;
                long jRotlXor21 = ThreefishEngine.rotlXor(jRotlXor17, 13, j139);
                long j140 = j137 + jRotlXor20;
                long jRotlXor22 = ThreefishEngine.rotlXor(jRotlXor20, 50, j140);
                long j141 = j138 + jRotlXor19;
                long jRotlXor23 = ThreefishEngine.rotlXor(jRotlXor19, 10, j141);
                long j142 = j135 + jRotlXor18;
                long jRotlXor24 = ThreefishEngine.rotlXor(jRotlXor18, 17, j142);
                long j143 = j140 + jRotlXor21;
                long jRotlXor25 = ThreefishEngine.rotlXor(jRotlXor21, 25, j143);
                long j144 = j141 + jRotlXor24;
                long jRotlXor26 = ThreefishEngine.rotlXor(jRotlXor24, 29, j144);
                long j145 = j142 + jRotlXor23;
                long jRotlXor27 = ThreefishEngine.rotlXor(jRotlXor23, 39, j145);
                long j146 = j139 + jRotlXor22;
                long jRotlXor28 = ThreefishEngine.rotlXor(jRotlXor22, 43, j146);
                long j147 = j144 + jRotlXor25;
                long jRotlXor29 = ThreefishEngine.rotlXor(jRotlXor25, 8, j147);
                long j148 = j145 + jRotlXor28;
                long jRotlXor30 = ThreefishEngine.rotlXor(jRotlXor28, 35, j148);
                long j149 = j146 + jRotlXor27;
                long jRotlXor31 = ThreefishEngine.rotlXor(jRotlXor27, 56, j149);
                long j150 = j143 + jRotlXor26;
                long jRotlXor32 = ThreefishEngine.rotlXor(jRotlXor26, 22, j150);
                long j151 = j148 + jArr5[i6];
                long j152 = jRotlXor29 + jArr5[i21];
                long j153 = j149 + jArr5[i22];
                long j154 = jRotlXor32 + jArr5[i32];
                long j155 = j150 + jArr5[i33];
                long j156 = jArr5[i43] + jArr6[i59] + jRotlXor31;
                j102 = jArr5[i66] + jArr6[i3 + 2] + j147;
                j103 = j155;
                j104 = j151;
                j107 = j153;
                jArr4 = jArr6;
                iArr = iArr3;
                j58 = j152;
                j108 = jArr5[i2 + 8] + j133 + 1 + jRotlXor30;
                j105 = j154;
                jArr3 = jArr5;
                i = i5 + 2;
                j106 = j156;
                iArr2 = iArr4;
            }
            jArr2[0] = j104;
            jArr2[1] = j58;
            jArr2[2] = j107;
            jArr2[3] = j105;
            jArr2[4] = j103;
            jArr2[5] = j106;
            jArr2[6] = j102;
            jArr2[7] = j108;
        }
    }

    public static abstract class ThreefishCipher {

        /* JADX INFO: renamed from: kw, reason: collision with root package name */
        protected final long[] f228386kw;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        protected final long[] f228387t;

        public ThreefishCipher(long[] jArr, long[] jArr2) {
            this.f228386kw = jArr;
            this.f228387t = jArr2;
        }

        public abstract void decryptBlock(long[] jArr, long[] jArr2);

        public abstract void encryptBlock(long[] jArr, long[] jArr2);
    }

    static {
        int[] iArr = new int[80];
        MOD9 = iArr;
        MOD17 = new int[iArr.length];
        MOD5 = new int[iArr.length];
        MOD3 = new int[iArr.length];
        int i = 0;
        while (true) {
            int[] iArr2 = MOD9;
            if (i >= iArr2.length) {
                return;
            }
            MOD17[i] = i % 17;
            iArr2[i] = i % 9;
            MOD5[i] = i % 5;
            MOD3[i] = i % 3;
            i++;
        }
    }

    public ThreefishEngine(int i) {
        ThreefishCipher threefish256Cipher;
        long[] jArr = new long[5];
        this.f228385t = jArr;
        int i2 = i / 8;
        this.blocksizeBytes = i2;
        int i3 = i2 / 8;
        this.blocksizeWords = i3;
        this.currentBlock = new long[i3];
        long[] jArr2 = new long[(i3 * 2) + 1];
        this.f228384kw = jArr2;
        if (i == 256) {
            threefish256Cipher = new Threefish256Cipher(jArr2, jArr);
        } else if (i == 512) {
            threefish256Cipher = new Threefish512Cipher(jArr2, jArr);
        } else {
            if (i != 1024) {
                throw new IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
            }
            threefish256Cipher = new Threefish1024Cipher(jArr2, jArr);
        }
        this.cipher = threefish256Cipher;
    }

    public static long bytesToWord(byte[] bArr, int i) {
        return Pack.littleEndianToLong(bArr, i);
    }

    public static long rotlXor(long j2, int i, long j3) {
        return ((j2 >>> (-i)) | (j2 << i)) ^ j3;
    }

    private void setKey(long[] jArr) {
        if (jArr.length != this.blocksizeWords) {
            throw new IllegalArgumentException(a.v(new StringBuilder("Threefish key must be same size as block ("), " words)", this.blocksizeWords));
        }
        long j2 = C_240;
        int i = 0;
        while (true) {
            int i2 = this.blocksizeWords;
            if (i >= i2) {
                long[] jArr2 = this.f228384kw;
                jArr2[i2] = j2;
                System.arraycopy(jArr2, 0, jArr2, i2 + 1, i2);
                return;
            } else {
                long[] jArr3 = this.f228384kw;
                long j3 = jArr[i];
                jArr3[i] = j3;
                j2 ^= j3;
                i++;
            }
        }
    }

    private void setTweak(long[] jArr) {
        if (jArr.length != 2) {
            throw new IllegalArgumentException("Tweak must be 2 words.");
        }
        long[] jArr2 = this.f228385t;
        long j2 = jArr[0];
        jArr2[0] = j2;
        long j3 = jArr[1];
        jArr2[1] = j3;
        jArr2[2] = j2 ^ j3;
        jArr2[3] = j2;
        jArr2[4] = j3;
    }

    public static void wordToBytes(long j2, byte[] bArr, int i) {
        Pack.longToLittleEndian(j2, bArr, i);
    }

    public static long xorRotr(long j2, int i, long j3) {
        long j5 = j2 ^ j3;
        return (j5 << (-i)) | (j5 >>> i);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Threefish-" + (this.blocksizeBytes * 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blocksizeBytes;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] key;
        byte[] tweak;
        long[] jArr;
        long[] jArr2 = null;
        if (cipherParameters instanceof TweakableBlockCipherParameters) {
            TweakableBlockCipherParameters tweakableBlockCipherParameters = (TweakableBlockCipherParameters) cipherParameters;
            key = tweakableBlockCipherParameters.getKey().getKey();
            tweak = tweakableBlockCipherParameters.getTweak();
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(m.l("Invalid parameter passed to Threefish init - ", cipherParameters));
            }
            key = ((KeyParameter) cipherParameters).getKey();
            tweak = null;
        }
        if (key == null) {
            jArr = null;
        } else {
            if (key.length != this.blocksizeBytes) {
                throw new IllegalArgumentException(a.v(new StringBuilder("Threefish key must be same size as block ("), " bytes)", this.blocksizeBytes));
            }
            jArr = new long[this.blocksizeWords];
            Pack.littleEndianToLong(key, 0, jArr);
        }
        if (tweak != null) {
            if (tweak.length != 16) {
                throw new IllegalArgumentException("Threefish tweak must be 16 bytes");
            }
            jArr2 = new long[2];
            Pack.littleEndianToLong(tweak, 0, jArr2);
        }
        init(z, jArr, jArr2);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 256, cipherParameters, Utils.getPurpose(z)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        int i3 = this.blocksizeBytes;
        if (i + i3 > bArr.length) {
            throw new DataLengthException("Input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new OutputLengthException("Output buffer too short");
        }
        Pack.littleEndianToLong(bArr, i, this.currentBlock);
        long[] jArr = this.currentBlock;
        processBlock(jArr, jArr);
        Pack.longToLittleEndian(this.currentBlock, bArr2, i2);
        return this.blocksizeBytes;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    public int processBlock(long[] jArr, long[] jArr2) throws IllegalStateException, DataLengthException {
        long[] jArr3 = this.f228384kw;
        int i = this.blocksizeWords;
        if (jArr3[i] == 0) {
            throw new IllegalStateException("Threefish engine not initialised");
        }
        if (jArr.length != i) {
            throw new DataLengthException("Input buffer too short");
        }
        if (jArr2.length != i) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.forEncryption) {
            this.cipher.encryptBlock(jArr, jArr2);
        } else {
            this.cipher.decryptBlock(jArr, jArr2);
        }
        return this.blocksizeWords;
    }

    public void init(boolean z, long[] jArr, long[] jArr2) {
        this.forEncryption = z;
        if (jArr != null) {
            setKey(jArr);
        }
        if (jArr2 != null) {
            setTweak(jArr2);
        }
    }
}
