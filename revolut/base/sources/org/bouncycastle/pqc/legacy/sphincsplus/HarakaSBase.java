package org.bouncycastle.pqc.legacy.sphincsplus;

import com.google.android.material.internal.ViewUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.lang.reflect.Array;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
class HarakaSBase {
    protected long[][] haraka512_rc = {new long[]{2652350495371256459L, -4767360454786055294L, -2778808723033108313L, -6138960262205972599L, 4944264682582508575L, 5312892415214084856L, 390034814247088728L, 2584105839607850161L}, new long[]{-2829930801980875922L, 9137660425067592590L, 7974068014816832049L, -4665944065725157058L, 2602240152241800734L, -1525694355931290902L, 8634660511727056099L, 1757945485816280992L}, new long[]{1181946526362588450L, -2765192619992380293L, 3395396416743122529L, -5116273100549372423L, -1285454309797503998L, -3363297609815171261L, -8360835858392998991L, -2371352336613968487L}, new long[]{-2500853454776756032L, 8465221333286591414L, 8817016078209461823L, 9067727467981428858L, 4244107674518258433L, -4347326460570889538L, 1711371409274742987L, 6486926172609168623L}, new long[]{1689001080716996467L, -491496126278250673L, 1273395568185090836L, 5805238412293617850L, -3441289770925384855L, 4592753210857527691L, 7062886034259989751L, -7974393977033172556L}, new long[]{-797818098819718290L, -41460260651793472L, 476036171179798187L, 7391697506481003962L, -855662275170689475L, -3489340839585811635L, -4891525734487956488L, 9110006695579921767L}, new long[]{-886938081943560790L, 4212830408327159617L, -3546674487567282635L, -1955379422127038289L, 3174578079917510314L, 5156046680874954380L, -318545805834821831L, -6176414008149462342L}, new long[]{2529785914229181047L, 2966313764524854080L, 6363694428402697361L, 8292109690175819701L, -8497546332135459587L, -3211108476154815616L, -5526938793786642321L, -4975969843627057770L}, new long[]{3357847021085574721L, -4764837212565187058L, -626391829400648692L, 2124133995575340009L, 7425858999829294301L, -3432032868905637771L, 1119301198758921294L, 1907812968586478892L}, new long[]{-8986524826712832802L, 3356175496741300052L, -5764600317639896362L, 4002747967109689317L, -8718925159733497197L, -1938063772587374661L, -8003749789895945835L, 7302960353763723932L}};
    protected int[][] haraka256_rc = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 10, 8);
    protected final byte[] buffer = new byte[64];

    /* JADX INFO: renamed from: off, reason: collision with root package name */
    protected int f228930off = 0;

    private void Swapn(long[] jArr, int i, int i2, int i3) {
        long j2;
        long j3;
        if (i == 1) {
            j2 = 6148914691236517205L;
            j3 = -6148914691236517206L;
        } else if (i == 2) {
            j2 = 3689348814741910323L;
            j3 = -3689348814741910324L;
        } else {
            if (i != 4) {
                return;
            }
            j2 = 1085102592571150095L;
            j3 = -1085102592571150096L;
        }
        long j5 = jArr[i2];
        long j16 = jArr[i3];
        jArr[i2] = ((j2 & j16) << i) | (j5 & j2);
        jArr[i3] = ((j5 & j3) >>> i) | (j16 & j3);
    }

    private void Swapn32(int[] iArr, int i, int i2, int i3) {
        int i5;
        int i6;
        if (i == 1) {
            i5 = 1431655765;
            i6 = -1431655766;
        } else if (i == 2) {
            i5 = 858993459;
            i6 = -858993460;
        } else if (i != 4) {
            i5 = 0;
            i6 = 0;
        } else {
            i5 = 252645135;
            i6 = -252645136;
        }
        int i21 = iArr[i2];
        int i22 = iArr[i3];
        iArr[i2] = ((i5 & i22) << i) | (i21 & i5);
        iArr[i3] = ((i21 & i6) >>> i) | (i22 & i6);
    }

    private void addRoundKey(long[] jArr, long[] jArr2) {
        jArr[0] = jArr[0] ^ jArr2[0];
        jArr[1] = jArr[1] ^ jArr2[1];
        jArr[2] = jArr[2] ^ jArr2[2];
        jArr[3] = jArr[3] ^ jArr2[3];
        jArr[4] = jArr[4] ^ jArr2[4];
        jArr[5] = jArr[5] ^ jArr2[5];
        jArr[6] = jArr[6] ^ jArr2[6];
        jArr[7] = jArr[7] ^ jArr2[7];
    }

    private void addRoundKey32(int[] iArr, int[] iArr2) {
        iArr[0] = iArr[0] ^ iArr2[0];
        iArr[1] = iArr[1] ^ iArr2[1];
        iArr[2] = iArr[2] ^ iArr2[2];
        iArr[3] = iArr[3] ^ iArr2[3];
        iArr[4] = iArr[4] ^ iArr2[4];
        iArr[5] = iArr[5] ^ iArr2[5];
        iArr[6] = iArr[6] ^ iArr2[6];
        iArr[7] = iArr2[7] ^ iArr[7];
    }

    private void brAesCt64BitsliceSbox(long[] jArr) {
        long j2 = jArr[7];
        long j3 = jArr[6];
        long j5 = jArr[5];
        long j16 = jArr[4];
        long j22 = jArr[3];
        long j42 = jArr[2];
        long j46 = jArr[1];
        long j47 = jArr[0];
        long j57 = j16 ^ j42;
        long j58 = j2 ^ j46;
        long j65 = j2 ^ j16;
        long j69 = j2 ^ j42;
        long j76 = j5 ^ j3;
        long j85 = j76 ^ j47;
        long j100 = j85 ^ j16;
        long j101 = j58 ^ j57;
        long j102 = j85 ^ j2;
        long j103 = j85 ^ j46;
        long j104 = j103 ^ j69;
        long j105 = j22 ^ j101;
        long j106 = j105 ^ j42;
        long j107 = j3 ^ j105;
        long j108 = j106 ^ j47;
        long j109 = j106 ^ j76;
        long j110 = j107 ^ j65;
        long j111 = j47 ^ j110;
        long j112 = j109 ^ j110;
        long j113 = j76 ^ j110;
        long j114 = j101 & j106;
        long j115 = (j104 & j108) ^ j114;
        long j116 = j58 & j113;
        long j117 = (j103 & j85) ^ j116;
        long j118 = j65 & j110;
        long j119 = (j57 & j112) ^ j118;
        long j120 = (j69 & j109) ^ j118;
        long j121 = (j115 ^ j119) ^ j107;
        long j122 = (((j100 & j47) ^ j114) ^ j120) ^ (j109 ^ j69);
        long j123 = (j117 ^ j119) ^ (j58 ^ j113);
        long j124 = (((j102 & j111) ^ j116) ^ j120) ^ (j2 ^ j113);
        long j125 = j121 ^ j122;
        long j126 = j121 & j123;
        long j127 = j124 ^ j126;
        long j128 = (j125 & j127) ^ j122;
        long j129 = ((j122 ^ j126) & (j123 ^ j124)) ^ j124;
        long j130 = j124 & (j127 ^ j129);
        long j131 = j130 ^ (j123 ^ j129);
        long j132 = j125 ^ (j128 & (j127 ^ j130));
        long j133 = j132 ^ j131;
        long j134 = j128 ^ j129;
        long j135 = j128 ^ j132;
        long j136 = j129 ^ j131;
        long j137 = j134 ^ j133;
        long j138 = j129 & j47;
        long j139 = j135 & j113;
        long j140 = j132 & j85;
        long j141 = j128 & j111;
        long j142 = j137 & j112;
        long j143 = j131 & j104;
        long j144 = j129 & j100;
        long j145 = j135 & j58;
        long j146 = j132 & j103;
        long j147 = j134 & j65;
        long j148 = j137 & j57;
        long j149 = j133 & j69;
        long j150 = j147 ^ j148;
        long j151 = j141 ^ j146;
        long j152 = (j136 & j101) ^ j143;
        long j153 = (j136 & j106) ^ j139;
        long j154 = j148 ^ j149;
        long j155 = (j138 ^ j145) ^ j153;
        long j156 = j140 ^ j150;
        long j157 = j139 ^ ((j134 & j110) ^ j142);
        long j158 = j150 ^ j155;
        long j159 = (j128 & j102) ^ j155;
        long j160 = (j142 ^ (j133 & j109)) ^ j156;
        long j161 = j152 ^ j156;
        long j162 = j140 ^ j157;
        long j163 = j159 ^ j160;
        long j164 = (j131 & j108) ^ j161;
        long j165 = (~j160) ^ (j145 ^ j151);
        long j166 = j151 ^ (~j158);
        long j167 = j153 ^ j164;
        long j168 = j162 ^ (~j167);
        long j169 = j154 ^ (~(j162 ^ j163));
        jArr[7] = j157 ^ j161;
        jArr[6] = j168;
        jArr[5] = j169;
        jArr[4] = j167;
        jArr[3] = (j138 ^ j141) ^ j164;
        jArr[2] = (j143 ^ j144) ^ j163;
        jArr[1] = j165;
        jArr[0] = j166;
    }

    private void brAesCt64InterleaveIn(long[] jArr, int i, int[] iArr, int i2) {
        long j2 = ((long) iArr[i2]) & BodyPartID.bodyIdMax;
        long j3 = ((long) iArr[i2 + 1]) & BodyPartID.bodyIdMax;
        long j5 = ((long) iArr[i2 + 2]) & BodyPartID.bodyIdMax;
        long j16 = ((long) iArr[i2 + 3]) & BodyPartID.bodyIdMax;
        long j22 = (j2 | (j2 << 16)) & 281470681808895L;
        long j42 = (j3 | (j3 << 16)) & 281470681808895L;
        long j46 = (j5 | (j5 << 16)) & 281470681808895L;
        long j47 = (j16 | (j16 << 16)) & 281470681808895L;
        jArr[i] = ((j22 | (j22 << 8)) & 71777214294589695L) | (((j46 | (j46 << 8)) & 71777214294589695L) << 8);
        long j57 = ((j47 | (j47 << 8)) & 71777214294589695L) << 8;
        jArr[i + 4] = j57 | ((j42 | (j42 << 8)) & 71777214294589695L);
    }

    private void brAesCt64InterleaveOut(int[] iArr, long[] jArr, int i) {
        long j2 = jArr[i];
        long j3 = j2 & 71777214294589695L;
        long j5 = jArr[i + 4];
        long j16 = j5 & 71777214294589695L;
        long j22 = (j2 >>> 8) & 71777214294589695L;
        long j42 = 71777214294589695L & (j5 >>> 8);
        long j46 = (j3 | (j3 >>> 8)) & 281470681808895L;
        long j47 = ((j16 >>> 8) | j16) & 281470681808895L;
        long j57 = (j22 | (j22 >>> 8)) & 281470681808895L;
        long j58 = (j42 | (j42 >>> 8)) & 281470681808895L;
        int i2 = i << 2;
        iArr[i2] = (int) (j46 | (j46 >>> 16));
        iArr[i2 + 1] = (int) (j47 | (j47 >>> 16));
        iArr[i2 + 2] = (int) (j57 | (j57 >>> 16));
        iArr[i2 + 3] = (int) ((j58 >>> 16) | j58);
    }

    private void brAesCt64Ortho(long[] jArr) {
        Swapn(jArr, 1, 0, 1);
        Swapn(jArr, 1, 2, 3);
        Swapn(jArr, 1, 4, 5);
        Swapn(jArr, 1, 6, 7);
        Swapn(jArr, 2, 0, 2);
        Swapn(jArr, 2, 1, 3);
        Swapn(jArr, 2, 4, 6);
        Swapn(jArr, 2, 5, 7);
        Swapn(jArr, 4, 0, 4);
        Swapn(jArr, 4, 1, 5);
        Swapn(jArr, 4, 2, 6);
        Swapn(jArr, 4, 3, 7);
    }

    private static void brAesCtBitsliceSbox(int[] iArr) {
        int i = iArr[7];
        int i2 = iArr[6];
        int i3 = iArr[5];
        int i5 = iArr[4];
        int i6 = iArr[3];
        int i21 = iArr[2];
        int i22 = iArr[1];
        int i32 = iArr[0];
        int i33 = i5 ^ i21;
        int i43 = i ^ i22;
        int i59 = i ^ i5;
        int i66 = i ^ i21;
        int i74 = i3 ^ i2;
        int i92 = i74 ^ i32;
        int i96 = i92 ^ i5;
        int i99 = i43 ^ i33;
        int i100 = i92 ^ i;
        int i101 = i92 ^ i22;
        int i102 = i101 ^ i66;
        int i103 = i6 ^ i99;
        int i104 = i21 ^ i103;
        int i105 = i2 ^ i103;
        int i106 = i104 ^ i32;
        int i107 = i104 ^ i74;
        int i108 = i105 ^ i59;
        int i109 = i32 ^ i108;
        int i110 = i107 ^ i108;
        int i111 = i74 ^ i108;
        int i112 = i99 & i104;
        int i113 = (i102 & i106) ^ i112;
        int i114 = i43 & i111;
        int i115 = (i101 & i92) ^ i114;
        int i116 = i59 & i108;
        int i117 = (i33 & i110) ^ i116;
        int i118 = (i66 & i107) ^ i116;
        int i119 = (i113 ^ i117) ^ i105;
        int i120 = (((i96 & i32) ^ i112) ^ i118) ^ (i107 ^ i66);
        int i121 = (i115 ^ i117) ^ (i43 ^ i111);
        int i122 = (((i100 & i109) ^ i114) ^ i118) ^ (i ^ i111);
        int i123 = i119 ^ i120;
        int i124 = i119 & i121;
        int i125 = i122 ^ i124;
        int i126 = (i123 & i125) ^ i120;
        int i127 = ((i120 ^ i124) & (i121 ^ i122)) ^ i122;
        int i128 = i122 & (i125 ^ i127);
        int i129 = i128 ^ (i121 ^ i127);
        int i130 = i123 ^ (i126 & (i125 ^ i128));
        int i131 = i130 ^ i129;
        int i132 = i126 ^ i127;
        int i133 = i126 ^ i130;
        int i134 = i127 ^ i129;
        int i135 = i132 ^ i131;
        int i136 = i32 & i127;
        int i137 = i133 & i111;
        int i138 = i130 & i92;
        int i139 = i126 & i109;
        int i140 = i135 & i110;
        int i141 = i129 & i102;
        int i142 = i127 & i96;
        int i143 = i133 & i43;
        int i144 = i130 & i101;
        int i145 = i132 & i59;
        int i146 = i135 & i33;
        int i147 = i131 & i66;
        int i148 = i145 ^ i146;
        int i149 = i139 ^ i144;
        int i150 = (i134 & i99) ^ i141;
        int i151 = (i134 & i104) ^ i137;
        int i152 = i146 ^ i147;
        int i153 = (i136 ^ i143) ^ i151;
        int i154 = i138 ^ i148;
        int i155 = i137 ^ ((i132 & i108) ^ i140);
        int i156 = i148 ^ i153;
        int i157 = (i126 & i100) ^ i153;
        int i158 = (i140 ^ (i131 & i107)) ^ i154;
        int i159 = i150 ^ i154;
        int i160 = i138 ^ i155;
        int i161 = i157 ^ i158;
        int i162 = (i129 & i106) ^ i159;
        int i163 = (~i158) ^ (i143 ^ i149);
        int i164 = (~i156) ^ i149;
        int i165 = i151 ^ i162;
        int i166 = i160 ^ (~i165);
        int i167 = i152 ^ (~(i160 ^ i161));
        iArr[7] = i155 ^ i159;
        iArr[6] = i166;
        iArr[5] = i167;
        iArr[4] = i165;
        iArr[3] = i162 ^ (i136 ^ i139);
        iArr[2] = (i141 ^ i142) ^ i161;
        iArr[1] = i163;
        iArr[0] = i164;
    }

    private void brAesCtOrtho(int[] iArr) {
        Swapn32(iArr, 1, 0, 1);
        Swapn32(iArr, 1, 2, 3);
        Swapn32(iArr, 1, 4, 5);
        Swapn32(iArr, 1, 6, 7);
        Swapn32(iArr, 2, 0, 2);
        Swapn32(iArr, 2, 1, 3);
        Swapn32(iArr, 2, 4, 6);
        Swapn32(iArr, 2, 5, 7);
        Swapn32(iArr, 4, 0, 4);
        Swapn32(iArr, 4, 1, 5);
        Swapn32(iArr, 4, 2, 6);
        Swapn32(iArr, 4, 3, 7);
    }

    private int brDec32Le(byte[] bArr, int i) {
        return (bArr[i + 3] << Ascii.CAN) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] << 8) & 65280) | ((bArr[i + 2] << 16) & 16711680);
    }

    private void brEnc32Le(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i2 + i3] = (byte) (i >> (i3 << 3));
        }
    }

    private void brRangeDec32Le(byte[] bArr, int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = (i2 << 2) + i;
            iArr[i2] = (bArr[i3 + 3] << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] << 8) & 65280) | ((bArr[i3 + 2] << 16) & 16711680);
        }
    }

    private void mixColumns(long[] jArr) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = jArr[2];
        long j16 = jArr[3];
        long j22 = jArr[4];
        long j42 = jArr[5];
        long j46 = jArr[6];
        long j47 = jArr[7];
        long j57 = (j2 >>> 16) | (j2 << 48);
        long j58 = (j3 >>> 16) | (j3 << 48);
        long j65 = (j5 >>> 16) | (j5 << 48);
        long j69 = (j16 >>> 16) | (j16 << 48);
        long j76 = (j22 >>> 16) | (j22 << 48);
        long j85 = (j42 >>> 16) | (j42 << 48);
        long j100 = (j46 >>> 16) | (j46 << 48);
        long j101 = (j47 >>> 16) | (j47 << 48);
        long j102 = j47 ^ j101;
        long j103 = j2 ^ j57;
        jArr[0] = (j102 ^ j57) ^ rotr32(j103);
        long j104 = j3 ^ j58;
        jArr[1] = (((j103 ^ j47) ^ j101) ^ j58) ^ rotr32(j104);
        long j105 = j5 ^ j65;
        jArr[2] = (j104 ^ j65) ^ rotr32(j105);
        long j106 = ((j105 ^ j47) ^ j101) ^ j69;
        long j107 = j16 ^ j69;
        jArr[3] = j106 ^ rotr32(j107);
        long j108 = ((j107 ^ j47) ^ j101) ^ j76;
        long j109 = j22 ^ j76;
        jArr[4] = j108 ^ rotr32(j109);
        long j110 = j109 ^ j85;
        long j111 = j42 ^ j85;
        jArr[5] = j110 ^ rotr32(j111);
        long j112 = j111 ^ j100;
        long j113 = j46 ^ j100;
        jArr[6] = j112 ^ rotr32(j113);
        jArr[7] = rotr32(j102) ^ (j113 ^ j101);
    }

    private void mixColumns32(int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i21 = iArr[5];
        int i22 = iArr[6];
        int i32 = iArr[7];
        int i33 = (i >>> 8) | (i << 24);
        int i43 = (i2 >>> 8) | (i2 << 24);
        int i59 = (i3 >>> 8) | (i3 << 24);
        int i66 = (i5 >>> 8) | (i5 << 24);
        int i74 = (i6 >>> 8) | (i6 << 24);
        int i92 = (i21 >>> 8) | (i21 << 24);
        int i96 = (i22 >>> 8) | (i22 << 24);
        int i99 = (i32 >>> 8) | (i32 << 24);
        int i100 = i32 ^ i99;
        int i101 = i ^ i33;
        iArr[0] = (i100 ^ i33) ^ rotr16(i101);
        int i102 = i2 ^ i43;
        iArr[1] = (((i101 ^ i32) ^ i99) ^ i43) ^ rotr16(i102);
        int i103 = i3 ^ i59;
        iArr[2] = (i102 ^ i59) ^ rotr16(i103);
        int i104 = ((i103 ^ i32) ^ i99) ^ i66;
        int i105 = i5 ^ i66;
        iArr[3] = i104 ^ rotr16(i105);
        int i106 = ((i105 ^ i32) ^ i99) ^ i74;
        int i107 = i6 ^ i74;
        iArr[4] = i106 ^ rotr16(i107);
        int i108 = i107 ^ i92;
        int i109 = i21 ^ i92;
        iArr[5] = i108 ^ rotr16(i109);
        int i110 = i109 ^ i96;
        int i111 = i22 ^ i96;
        iArr[6] = i110 ^ rotr16(i111);
        iArr[7] = rotr16(i100) ^ (i111 ^ i99);
    }

    private int rotr16(int i) {
        return (i >>> 16) | (i << 16);
    }

    private long rotr32(long j2) {
        return (j2 >>> 32) | (j2 << 32);
    }

    private void shiftRows(long[] jArr) {
        for (int i = 0; i < jArr.length; i++) {
            long j2 = jArr[i];
            jArr[i] = ((j2 & 1152640029630136320L) << 4) | (65535 & j2) | ((4293918720L & j2) >>> 4) | ((983040 & j2) << 12) | ((280375465082880L & j2) >>> 8) | ((1095216660480L & j2) << 8) | (((-1152921504606846976L) & j2) >>> 12);
        }
    }

    private void shiftRows32(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            iArr[i] = ((i2 & 1056964608) << 2) | (i2 & 255) | ((64512 & i2) >>> 2) | ((i2 & ViewUtils.EDGE_TO_EDGE_FLAGS) << 6) | ((15728640 & i2) >>> 4) | ((983040 & i2) << 4) | (((-1073741824) & i2) >>> 6);
        }
    }

    public static void xor(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            bArr3[i3 + i6] = (byte) (bArr[i + i6] ^ bArr2[i2 + i6]);
        }
    }

    public void haraka256Perm(byte[] bArr) {
        int[] iArr = new int[8];
        interleaveConstant32(iArr, this.buffer, 0);
        for (int i = 0; i < 5; i++) {
            for (int i2 = 0; i2 < 2; i2++) {
                brAesCtBitsliceSbox(iArr);
                shiftRows32(iArr);
                mixColumns32(iArr);
                addRoundKey32(iArr, this.haraka256_rc[(i << 1) + i2]);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                int i5 = iArr[i3];
                iArr[i3] = ((i5 & 1077952576) >>> 1) | ((-2122219135) & i5) | ((33686018 & i5) << 1) | ((67372036 & i5) << 2) | ((134744072 & i5) << 3) | ((269488144 & i5) >>> 3) | ((538976288 & i5) >>> 2);
            }
        }
        brAesCtOrtho(iArr);
        for (int i6 = 0; i6 < 4; i6++) {
            int i21 = i6 << 1;
            int i22 = i6 << 2;
            brEnc32Le(bArr, iArr[i21], i22);
            brEnc32Le(bArr, iArr[i21 + 1], i22 + 16);
        }
    }

    public void haraka512Perm(byte[] bArr) {
        int[] iArr = new int[16];
        long[] jArr = new long[8];
        brRangeDec32Le(this.buffer, iArr, 0);
        for (int i = 0; i < 4; i++) {
            brAesCt64InterleaveIn(jArr, i, iArr, i << 2);
        }
        brAesCt64Ortho(jArr);
        for (int i2 = 0; i2 < 5; i2++) {
            for (int i3 = 0; i3 < 2; i3++) {
                brAesCt64BitsliceSbox(jArr);
                shiftRows(jArr);
                mixColumns(jArr);
                addRoundKey(jArr, this.haraka512_rc[(i2 << 1) + i3]);
            }
            for (int i5 = 0; i5 < 8; i5++) {
                long j2 = jArr[i5];
                jArr[i5] = ((j2 & (-8934996522953571328L)) >>> 3) | ((281479271743489L & j2) << 5) | ((562958543486978L & j2) << 12) | ((1125917086973956L & j2) >>> 1) | ((2251834173947912L & j2) << 6) | ((9007336695791648L & j2) << 9) | ((18014673391583296L & j2) >>> 4) | ((36029346783166592L & j2) << 3) | ((2377936887688995072L & j2) >>> 5) | ((148621055480562192L & j2) << 2) | ((576469548530665472L & j2) << 4) | ((1152939097061330944L & j2) >>> 12) | ((4611756388245323776L & j2) >>> 10);
            }
        }
        brAesCt64Ortho(jArr);
        for (int i6 = 0; i6 < 4; i6++) {
            brAesCt64InterleaveOut(iArr, jArr, i6);
        }
        for (int i21 = 0; i21 < 16; i21++) {
            for (int i22 = 0; i22 < 4; i22++) {
                bArr[(i21 << 2) + i22] = (byte) ((iArr[i21] >>> (i22 << 3)) & 255);
            }
        }
    }

    public void interleaveConstant(long[] jArr, byte[] bArr, int i) {
        int[] iArr = new int[16];
        brRangeDec32Le(bArr, iArr, i);
        for (int i2 = 0; i2 < 4; i2++) {
            brAesCt64InterleaveIn(jArr, i2, iArr, i2 << 2);
        }
        brAesCt64Ortho(jArr);
    }

    public void interleaveConstant32(int[] iArr, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i2 << 1;
            int i5 = (i2 << 2) + i;
            iArr[i3] = brDec32Le(bArr, i5);
            iArr[i3 + 1] = brDec32Le(bArr, i5 + 16);
        }
        brAesCtOrtho(iArr);
    }

    public void reset() {
        this.f228930off = 0;
        Arrays.clear(this.buffer);
    }
}
