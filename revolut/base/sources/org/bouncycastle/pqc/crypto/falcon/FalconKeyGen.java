package org.bouncycastle.pqc.crypto.falcon;

import ch.qos.logback.core.util.a;
import com.youTransactor.uCube.rpc.Constants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Pack;
import org.jmrtd.PassportService;

/* JADX INFO: loaded from: classes14.dex */
class FalconKeyGen {
    private static final int DEPTH_INT_FG = 4;
    private static final short[] REV10 = {0, 512, 256, 768, 128, 640, 384, 896, 64, 576, 320, 832, 192, 704, 448, 960, 32, 544, 288, 800, 160, 672, 416, 928, 96, 608, 352, 864, 224, 736, 480, 992, 16, 528, PassportService.EF_DG16, 784, 144, 656, 400, 912, 80, 592, 336, 848, 208, 720, 464, 976, 48, 560, 304, Constants.REPEAT_LAST_MESSAGE_COMMAND, 176, 688, 432, 944, 112, 624, 368, 880, 240, 752, 496, 1008, 8, 520, PassportService.EF_DG8, 776, 136, 648, 392, 904, 72, 584, 328, 840, 200, 712, 456, 968, 40, 552, 296, 808, 168, 680, 424, 936, 104, 616, 360, 872, 232, 744, 488, 1000, 24, 536, 280, 792, 152, 664, 408, 920, 88, 600, 344, 856, 216, 728, 472, 984, 56, 568, 312, 824, 184, 696, 440, 952, 120, 632, 376, 888, 248, 760, 504, 1016, 4, 516, PassportService.EF_DG4, 772, 132, 644, 388, 900, 68, 580, 324, 836, 196, 708, 452, 964, 36, 548, 292, 804, 164, 676, 420, 932, 100, 612, 356, 868, 228, 740, 484, 996, 20, 532, 276, 788, 148, 660, 404, 916, 84, 596, 340, 852, 212, 724, 468, 980, 52, 564, 308, 820, 180, 692, 436, 948, 116, 628, 372, 884, 244, 756, 500, 1012, 12, 524, PassportService.EF_DG12, 780, 140, 652, 396, 908, 76, 588, 332, 844, 204, 716, 460, 972, 44, 556, 300, 812, 172, 684, 428, 940, 108, 620, 364, 876, 236, 748, 492, 1004, 28, 540, 284, 796, 156, 668, 412, 924, 92, 604, 348, 860, 220, 732, 476, 988, 60, 572, 316, 828, 188, 700, 444, 956, 124, 636, 380, 892, 252, 764, 508, 1020, 2, Constants.CANCEL_COMMAND, PassportService.EF_DG2, Constants.RTC_SET, 130, 642, 386, 898, 66, 578, 322, 834, 194, 706, 450, 962, 34, 546, 290, 802, 162, 674, 418, 930, 98, 610, 354, 866, 226, 738, 482, 994, 18, 530, 274, 786, 146, 658, 402, 914, 82, 594, 338, 850, 210, 722, 466, 978, 50, 562, 306, 818, 178, 690, 434, 946, 114, 626, 370, 882, 242, 754, 498, 1010, 10, 522, PassportService.EF_DG10, 778, 138, 650, 394, 906, 74, 586, 330, 842, 202, 714, 458, 970, 42, 554, 298, 810, 170, 682, 426, 938, 106, 618, 362, 874, 234, 746, 490, 1002, 26, 538, 282, 794, 154, 666, 410, 922, 90, 602, 346, 858, 218, 730, 474, 986, 58, 570, 314, 826, 186, 698, 442, 954, 122, 634, 378, 890, 250, 762, 506, 1018, 6, 518, PassportService.EF_DG6, 774, 134, 646, 390, 902, 70, 582, 326, 838, 198, 710, 454, 966, 38, 550, 294, 806, 166, 678, 422, 934, 102, 614, 358, 870, 230, 742, 486, 998, 22, 534, 278, 790, 150, 662, 406, 918, 86, 598, 342, 854, 214, 726, 470, 982, 54, 566, 310, 822, 182, 694, 438, 950, 118, 630, 374, 886, 246, 758, 502, 1014, 14, 526, PassportService.EF_DG14, 782, 142, 654, 398, 910, 78, 590, 334, 846, 206, 718, 462, 974, 46, 558, 302, 814, 174, 686, 430, 942, 110, 622, 366, 878, 238, 750, 494, 1006, 30, 542, PassportService.EF_COM, 798, 158, 670, 414, 926, 94, 606, 350, 862, 222, 734, 478, 990, 62, 574, 318, 830, 190, 702, 446, 958, 126, 638, 382, 894, 254, 766, 510, 1022, 1, 513, PassportService.EF_DG1, Constants.RTC_GET, 129, 641, 385, 897, 65, 577, 321, 833, 193, 705, 449, 961, 33, 545, 289, 801, 161, 673, 417, 929, 97, 609, 353, 865, 225, 737, 481, 993, 17, 529, 273, 785, 145, 657, 401, 913, 81, 593, 337, 849, 209, 721, 465, 977, 49, 561, 305, Constants.GET_STATUS_COMMAND, 177, 689, 433, 945, 113, 625, 369, 881, 241, 753, 497, 1009, 9, 521, PassportService.EF_DG9, 777, 137, 649, 393, 905, 73, 585, 329, 841, 201, 713, 457, 969, 41, 553, 297, 809, 169, 681, 425, 937, 105, 617, 361, 873, 233, 745, 489, 1001, 25, 537, 281, 793, 153, 665, 409, 921, 89, 601, 345, 857, 217, 729, 473, 985, 57, 569, 313, 825, 185, 697, 441, 953, 121, 633, 377, 889, 249, 761, 505, 1017, 5, 517, PassportService.EF_DG5, 773, 133, 645, 389, 901, 69, 581, 325, 837, 197, 709, 453, 965, 37, 549, 293, 805, 165, 677, 421, 933, 101, 613, 357, 869, 229, 741, 485, 997, 21, 533, 277, 789, 149, 661, 405, 917, 85, 597, 341, 853, 213, 725, 469, 981, 53, 565, 309, 821, 181, 693, 437, 949, 117, 629, 373, 885, 245, 757, 501, 1013, 13, 525, PassportService.EF_DG13, 781, 141, 653, 397, 909, 77, 589, 333, 845, 205, 717, 461, 973, 45, 557, 301, 813, 173, 685, 429, 941, 109, 621, 365, 877, 237, 749, 493, 1005, 29, 541, 285, 797, 157, 669, 413, 925, 93, 605, 349, 861, 221, 733, 477, 989, 61, 573, 317, 829, 189, 701, 445, 957, 125, 637, 381, 893, 253, 765, 509, 1021, 3, 515, PassportService.EF_DG3, 771, 131, 643, 387, 899, 67, 579, 323, 835, 195, 707, 451, 963, 35, 547, 291, 803, 163, 675, 419, 931, 99, 611, 355, 867, 227, 739, 483, 995, 19, 531, 275, 787, 147, 659, 403, 915, 83, 595, 339, 851, 211, 723, 467, 979, 51, 563, 307, 819, 179, 691, 435, 947, 115, 627, 371, 883, 243, 755, 499, 1011, 11, 523, PassportService.EF_DG11, 779, 139, 651, 395, 907, 75, 587, 331, 843, 203, 715, 459, 971, 43, 555, 299, 811, 171, 683, 427, 939, 107, 619, 363, 875, 235, 747, 491, 1003, 27, 539, 283, 795, 155, 667, 411, 923, 91, 603, 347, 859, 219, 731, 475, 987, 59, 571, 315, 827, 187, 699, 443, 955, 123, 635, 379, 891, 251, 763, 507, 1019, 7, 519, PassportService.EF_DG7, 775, 135, 647, 391, 903, 71, 583, 327, 839, 199, 711, 455, 967, 39, 551, 295, 807, 167, 679, 423, 935, 103, 615, 359, 871, 231, 743, 487, 999, 23, 535, 279, 791, 151, 663, 407, 919, 87, 599, 343, 855, 215, 727, 471, 983, 55, 567, 311, 823, 183, 695, 439, 951, 119, 631, 375, 887, 247, 759, 503, 1015, 15, 527, PassportService.EF_DG15, 783, 143, 655, 399, 911, 79, 591, 335, 847, 207, 719, 463, 975, 47, 559, 303, 815, 175, 687, 431, 943, 111, 623, 367, 879, 239, 751, 495, 1007, 31, 543, 287, 799, 159, 671, 415, 927, 
    95, 607, 351, 863, 223, 735, 479, 991, 63, 575, 319, 831, 191, 703, 447, 959, 127, 639, 383, 895, 255, 767, 511, 1023};
    private static final long[] gauss_1024_12289 = {1283868770400643928L, 6416574995475331444L, 4078260278032692663L, 2353523259288686585L, 1227179971273316331L, 575931623374121527L, 242543240509105209L, 91437049221049666L, 30799446349977173L, 9255276791179340L, 2478152334826140L, 590642893610164L, 125206034929641L, 23590435911403L, 3948334035941L, 586753615614L, 77391054539L, 9056793210L, 940121950, 86539696, 7062824, 510971, 32764, 1862, 94, 4, 0};
    private static final int[] MAX_BL_SMALL = {1, 1, 2, 2, 4, 7, 14, 27, 53, 106, Constants.TAG_FIRMWARE_VERSION};
    private static final int[] MAX_BL_LARGE = {2, 2, 5, 7, 12, 21, 40, 78, 157, 308};
    private static final int[] bitlength_avg = {4, 11, 24, 50, 102, 202, 401, 794, 1577, 3138, 6308};
    private static final int[] bitlength_std = {0, 1, 1, 1, 1, 2, 4, 5, 8, 13, 25};

    private static long get_rng_u64(SHAKEDigest sHAKEDigest) {
        byte[] bArr = new byte[8];
        sHAKEDigest.doOutput(bArr, 0, 8);
        return Pack.littleEndianToLong(bArr, 0);
    }

    public static void keygen(SHAKEDigest sHAKEDigest, byte[] bArr, byte[] bArr2, byte[] bArr3, short[] sArr, int i) {
        int i2;
        int i3;
        byte b4;
        byte[] bArr4 = bArr;
        byte[] bArr5 = bArr2;
        int i5 = i;
        int iMkn = mkn(i5);
        short[] sArr2 = sArr;
        while (true) {
            double[] dArr = new double[iMkn * 3];
            poly_small_mkgauss(sHAKEDigest, bArr4, i5);
            poly_small_mkgauss(sHAKEDigest, bArr5, i5);
            int i6 = 1 << (FalconCodec.max_fg_bits[i5] - 1);
            for (int i21 = 0; i21 < iMkn; i21++) {
                byte b5 = bArr4[i21];
                if (b5 >= i6 || b5 <= (i3 = -i6) || (b4 = bArr5[i21]) >= i6 || b4 <= i3) {
                    i6 = -1;
                    break;
                }
            }
            if (i6 >= 0) {
                int iPoly_small_sqnorm = poly_small_sqnorm(bArr4, i5);
                int iPoly_small_sqnorm2 = poly_small_sqnorm(bArr5, i5);
                if ((((long) ((-((iPoly_small_sqnorm | iPoly_small_sqnorm2) >>> 31)) | (iPoly_small_sqnorm + iPoly_small_sqnorm2))) & BodyPartID.bodyIdMax) >= 16823) {
                    continue;
                } else {
                    int i22 = iMkn + iMkn;
                    poly_small_to_fp(dArr, 0, bArr4, i5);
                    poly_small_to_fp(dArr, iMkn, bArr5, i5);
                    FalconFFT.FFT(dArr, 0, i5);
                    FalconFFT.FFT(dArr, iMkn, i5);
                    FalconFFT.poly_invnorm2_fft(dArr, i22, dArr, 0, dArr, iMkn, i5);
                    FalconFFT.poly_adj_fft(dArr, 0, i5);
                    FalconFFT.poly_adj_fft(dArr, iMkn, i5);
                    FalconFFT.poly_mulconst(dArr, 0, 12289.0d, i5);
                    FalconFFT.poly_mulconst(dArr, iMkn, 12289.0d, i5);
                    FalconFFT.poly_mul_autoadj_fft(dArr, 0, dArr, i22, i5);
                    FalconFFT.poly_mul_autoadj_fft(dArr, iMkn, dArr, i22, i5);
                    FalconFFT.iFFT(dArr, 0, i5);
                    FalconFFT.iFFT(dArr, iMkn, i5);
                    double d = 0.0d;
                    for (int i32 = 0; i32 < iMkn; i32++) {
                        double d5 = dArr[i32];
                        double d6 = dArr[iMkn + i32];
                        d += (d6 * d6) + (d5 * d5);
                    }
                    if (d >= 16822.4121d) {
                        continue;
                    } else {
                        short[] sArr3 = new short[iMkn * 2];
                        if (sArr2 == null) {
                            sArr2 = sArr3;
                            i2 = iMkn;
                        } else {
                            i2 = 0;
                        }
                        int iCompute_public = FalconVrfy.compute_public(sArr2, 0, bArr4, bArr5, i5, sArr3, i2);
                        short[] sArr4 = sArr2;
                        if (iCompute_public != 0) {
                            if (solve_NTRU(i5, bArr3, bArr, bArr2, (1 << (FalconCodec.max_FG_bits[i5] - 1)) - 1, new int[i5 > 2 ? iMkn * 28 : iMkn * 84]) != 0) {
                                return;
                            }
                        }
                        bArr4 = bArr;
                        bArr5 = bArr2;
                        i5 = i;
                        sArr2 = sArr4;
                    }
                }
            }
        }
    }

    private static void make_fg(int[] iArr, int i, byte[] bArr, byte[] bArr2, int i2, int i3, int i5) {
        int iMkn = mkn(i2);
        int i6 = i + iMkn;
        int i21 = FalconSmallPrimeList.PRIMES[0].f228797p;
        for (int i22 = 0; i22 < iMkn; i22++) {
            iArr[i + i22] = modp_set(bArr[i22], i21);
            iArr[i6 + i22] = modp_set(bArr2[i22], i21);
        }
        if (i3 != 0 || i5 == 0) {
            int i32 = 0;
            while (i32 < i3) {
                int i33 = i32 + 1;
                make_fg_step(iArr, i, i2 - i32, i32, i32 != 0 ? 1 : 0, (i33 < i3 || i5 != 0) ? 1 : 0);
                i32 = i33;
            }
            return;
        }
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i43 = falconSmallPrimeArr[0].f228797p;
        int iModp_ninv31 = modp_ninv31(i43);
        int i59 = i6 + iMkn;
        modp_mkgm2(iArr, i59, iArr, i59 + iMkn, i2, falconSmallPrimeArr[0].f228796g, i43, iModp_ninv31);
        modp_NTT2(iArr, i, iArr, i59, i2, i43, iModp_ninv31);
        modp_NTT2(iArr, i6, iArr, i59, i2, i43, iModp_ninv31);
    }

    private static void make_fg_step(int[] iArr, int i, int i2, int i3, int i5, int i6) {
        int i21;
        int i22;
        int i32;
        int i33;
        int i43;
        int i59;
        int i66;
        int i74;
        int i92;
        int[] iArr2 = iArr;
        boolean z = true;
        int i96 = 1 << i2;
        int i99 = i96 >> 1;
        int[] iArr3 = MAX_BL_SMALL;
        int i100 = iArr3[i3];
        int i101 = iArr3[i3 + 1];
        int i102 = i99 * i101;
        int i103 = i + i102;
        int i104 = i103 + i102;
        int i105 = i96 * i100;
        int i106 = i104 + i105;
        int i107 = i106 + i105;
        int i108 = i107 + i96;
        int i109 = i108 + i96;
        System.arraycopy(iArr2, i, iArr2, i104, i96 * 2 * i100);
        int i110 = 0;
        while (i110 < i100) {
            FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
            int i111 = falconSmallPrimeArr[i110].f228797p;
            int iModp_ninv31 = modp_ninv31(i111);
            int iModp_R2 = modp_R2(i111, iModp_ninv31);
            int i112 = falconSmallPrimeArr[i110].f228796g;
            boolean z3 = z;
            int i113 = i110;
            int i114 = i107;
            int i115 = i108;
            modp_mkgm2(iArr2, i114, iArr, i115, i2, i112, i111, iModp_ninv31);
            int i116 = iModp_ninv31;
            int i117 = i104 + i113;
            int i118 = 0;
            int i119 = i117;
            while (i118 < i96) {
                iArr[i109 + i118] = iArr[i119];
                i118++;
                i119 += i100;
            }
            if (i5 == 0) {
                int i120 = i109;
                modp_NTT2(iArr, i120, iArr, i114, i2, i111, i116);
                i32 = i120;
                i116 = i116;
                i111 = i111;
            } else {
                i32 = i109;
            }
            int i121 = i + i113;
            int i122 = 0;
            int i123 = i121;
            while (i122 < i99) {
                int i124 = i32 + (i122 << 1);
                iArr[i123] = modp_montymul(modp_montymul(iArr[i124], iArr[i124 + 1], i111, i116), iModp_R2, i111, i116);
                i122++;
                i123 += i101;
            }
            if (i5 != 0) {
                int i125 = i100;
                int i126 = i116;
                modp_iNTT2_ext(iArr, i117, i125, iArr, i115, i2, i111, i126);
                i33 = i115;
                i116 = i126;
                i43 = i125;
            } else {
                int i127 = i100;
                i33 = i115;
                i43 = i127;
            }
            int i128 = i106 + i113;
            int i129 = 0;
            int i130 = i128;
            while (i129 < i96) {
                iArr[i32 + i129] = iArr[i130];
                i129++;
                i130 += i43;
            }
            if (i5 == 0) {
                int i131 = i111;
                int i132 = i116;
                modp_NTT2(iArr, i32, iArr, i114, i2, i131, i132);
                i116 = i132;
                i111 = i131;
            }
            int i133 = i103 + i113;
            int i134 = 0;
            int i135 = i133;
            while (i134 < i99) {
                int i136 = i32 + (i134 << 1);
                iArr[i135] = modp_montymul(modp_montymul(iArr[i136], iArr[i136 + 1], i111, i116), iModp_R2, i111, i116);
                i134++;
                i135 += i101;
            }
            if (i5 != 0) {
                int i137 = i43;
                i66 = i33;
                i74 = i116;
                modp_iNTT2_ext(iArr, i128, i137, iArr, i66, i2, i111, i74);
                i59 = i137;
            } else {
                i59 = i43;
                i66 = i33;
                i74 = i116;
            }
            if (i6 == 0) {
                int i138 = i2 - 1;
                int i139 = i101;
                modp_iNTT2_ext(iArr, i121, i139, iArr, i66, i138, i111, i74);
                modp_iNTT2_ext(iArr, i133, i139, iArr, i66, i138, i111, i74);
                i92 = i139;
            } else {
                i92 = i101;
            }
            i110 = i113 + 1;
            iArr2 = iArr;
            i108 = i66;
            i107 = i114;
            i109 = i32;
            i101 = i92;
            i100 = i59;
            z = z3;
        }
        int i140 = i100;
        int i141 = i101;
        int i142 = i109;
        int i143 = i107;
        int i144 = i108;
        zint_rebuild_CRT(iArr, i104, i140, i140, i96, 1, iArr, i143);
        zint_rebuild_CRT(iArr, i106, i140, i140, i96, 1, iArr, i143);
        int i145 = i143;
        int i146 = i140;
        while (i146 < i141) {
            FalconSmallPrime[] falconSmallPrimeArr2 = FalconSmallPrimeList.PRIMES;
            int i147 = falconSmallPrimeArr2[i146].f228797p;
            int iModp_ninv312 = modp_ninv31(i147);
            int iModp_R22 = modp_R2(i147, iModp_ninv312);
            int iModp_Rx = modp_Rx(i140, i147, iModp_ninv312, iModp_R22);
            int i148 = falconSmallPrimeArr2[i146].f228796g;
            int i149 = iModp_R22;
            int i150 = i145;
            int i151 = i144;
            int i152 = i146;
            modp_mkgm2(iArr, i150, iArr, i151, i2, i148, i147, iModp_ninv312);
            int i153 = i104;
            int i154 = 0;
            while (i154 < i96) {
                int i155 = i147;
                int i156 = i140;
                int i157 = iModp_Rx;
                int i158 = i149;
                int iZint_mod_small_signed = zint_mod_small_signed(iArr, i153, i156, i155, iModp_ninv312, i158, i157);
                i147 = i155;
                iArr[i142 + i154] = iZint_mod_small_signed;
                i154++;
                i153 += i156;
                i140 = i156;
                iModp_Rx = i157;
                i149 = i158;
            }
            int i159 = iModp_Rx;
            int i160 = i149;
            int i161 = i140;
            int i162 = i160;
            int i163 = i147;
            modp_NTT2(iArr, i142, iArr, i150, i2, i163, iModp_ninv312);
            int i164 = i163;
            int i165 = i + i152;
            int i166 = i165;
            int i167 = 0;
            while (i167 < i99) {
                int i168 = i142 + (i167 << 1);
                iArr[i166] = modp_montymul(modp_montymul(iArr[i168], iArr[i168 + 1], i164, iModp_ninv312), i162, i164, iModp_ninv312);
                i167++;
                i166 += i141;
            }
            int i169 = i106;
            for (int i170 = 0; i170 < i96; i170++) {
                int i171 = i164;
                int i172 = i162;
                int i173 = i161;
                int i174 = i159;
                int iZint_mod_small_signed2 = zint_mod_small_signed(iArr, i169, i173, i171, iModp_ninv312, i172, i174);
                i164 = i171;
                iArr[i142 + i170] = iZint_mod_small_signed2;
                i169 += i173;
                i162 = i172;
                i161 = i173;
                i159 = i174;
            }
            int i175 = i161;
            int i176 = i164;
            modp_NTT2(iArr, i142, iArr, i150, i2, i176, iModp_ninv312);
            int i177 = i103 + i152;
            int i178 = 0;
            int i179 = i177;
            while (i178 < i99) {
                int i180 = i142 + (i178 << 1);
                iArr[i179] = modp_montymul(modp_montymul(iArr[i180], iArr[i180 + 1], i176, iModp_ninv312), i162, i176, iModp_ninv312);
                i178++;
                i179 += i141;
            }
            if (i6 == 0) {
                int i181 = i2 - 1;
                i21 = i141;
                i22 = i151;
                modp_iNTT2_ext(iArr, i165, i21, iArr, i22, i181, i176, iModp_ninv312);
                modp_iNTT2_ext(iArr, i177, i21, iArr, i22, i181, i176, iModp_ninv312);
            } else {
                i21 = i141;
                i22 = i151;
            }
            i146 = i152 + 1;
            i141 = i21;
            i144 = i22;
            i145 = i150;
            i140 = i175;
        }
    }

    private static int mkgauss(SHAKEDigest sHAKEDigest, int i) {
        int i2 = 1 << (10 - i);
        int i3 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            long j2 = get_rng_u64(sHAKEDigest);
            int i6 = (int) (j2 >>> 63);
            int i21 = (int) (((j2 & Long.MAX_VALUE) - gauss_1024_12289[0]) >>> 63);
            long j3 = Long.MAX_VALUE & get_rng_u64(sHAKEDigest);
            int i22 = 1;
            int i32 = 0;
            while (true) {
                long[] jArr = gauss_1024_12289;
                if (i22 < jArr.length) {
                    int i33 = ((int) ((j3 - jArr[i22]) >>> 63)) ^ 1;
                    i32 |= (-((i21 ^ 1) & i33)) & i22;
                    i21 |= i33;
                    i22++;
                }
            }
            i3 += ((-i6) ^ i32) + i6;
        }
        return i3;
    }

    private static int mkn(int i) {
        return 1 << i;
    }

    private static void modp_NTT2(int[] iArr, int i, int[] iArr2, int i2, int i3, int i5, int i6) {
        modp_NTT2_ext(iArr, i, 1, iArr2, i2, i3, i5, i6);
    }

    private static void modp_NTT2_ext(int[] iArr, int i, int i2, int[] iArr2, int i3, int i5, int i6, int i21) {
        if (i5 == 0) {
            return;
        }
        int iMkn = mkn(i5);
        int i22 = 1;
        int i32 = iMkn;
        while (i22 < iMkn) {
            int i33 = i32 >> 1;
            int i43 = 0;
            int i59 = 0;
            while (i43 < i22) {
                int i66 = iArr2[i3 + i22 + i43];
                int i74 = (i59 * i2) + i;
                int i92 = (i33 * i2) + i74;
                int i96 = 0;
                while (i96 < i33) {
                    int i99 = iArr[i74];
                    int iModp_montymul = modp_montymul(iArr[i92], i66, i6, i21);
                    iArr[i74] = modp_add(i99, iModp_montymul, i6);
                    iArr[i92] = modp_sub(i99, iModp_montymul, i6);
                    i96++;
                    i74 += i2;
                    i92 += i2;
                }
                i43++;
                i59 += i32;
            }
            i22 <<= 1;
            i32 = i33;
        }
    }

    private static int modp_R(int i) {
        return Integer.MIN_VALUE - i;
    }

    private static int modp_R2(int i, int i2) {
        int iModp_R = modp_R(i);
        int iModp_add = modp_add(iModp_R, iModp_R, i);
        int iModp_montymul = modp_montymul(iModp_add, iModp_add, i, i2);
        int iModp_montymul2 = modp_montymul(iModp_montymul, iModp_montymul, i, i2);
        int iModp_montymul3 = modp_montymul(iModp_montymul2, iModp_montymul2, i, i2);
        int iModp_montymul4 = modp_montymul(iModp_montymul3, iModp_montymul3, i, i2);
        int iModp_montymul5 = modp_montymul(iModp_montymul4, iModp_montymul4, i, i2);
        return (iModp_montymul5 + (i & (-(iModp_montymul5 & 1)))) >>> 1;
    }

    private static int modp_Rx(int i, int i2, int i3, int i5) {
        int i6 = i - 1;
        int iModp_R = modp_R(i2);
        int i21 = 0;
        while (true) {
            int i22 = 1 << i21;
            if (i22 > i6) {
                return iModp_R;
            }
            if ((i22 & i6) != 0) {
                iModp_R = modp_montymul(iModp_R, i5, i2, i3);
            }
            i5 = modp_montymul(i5, i5, i2, i3);
            i21++;
        }
    }

    private static int modp_add(int i, int i2, int i3) {
        int i5 = (i + i2) - i3;
        return i5 + ((-(i5 >>> 31)) & i3);
    }

    private static int modp_div(int i, int i2, int i3, int i5, int i6) {
        int i21 = i3 - 2;
        for (int i22 = 30; i22 >= 0; i22--) {
            int iModp_montymul = modp_montymul(i6, i6, i3, i5);
            i6 = iModp_montymul ^ ((-(1 & (i21 >>> i22))) & (modp_montymul(iModp_montymul, i2, i3, i5) ^ iModp_montymul));
        }
        return modp_montymul(i, modp_montymul(i6, 1, i3, i5), i3, i5);
    }

    private static void modp_iNTT2(int[] iArr, int i, int[] iArr2, int i2, int i3, int i5, int i6) {
        modp_iNTT2_ext(iArr, i, 1, iArr2, i2, i3, i5, i6);
    }

    private static void modp_iNTT2_ext(int[] iArr, int i, int i2, int[] iArr2, int i3, int i5, int i6, int i21) {
        int i22;
        if (i5 == 0) {
            return;
        }
        int iMkn = mkn(i5);
        int i32 = iMkn;
        int i33 = 1;
        while (true) {
            i22 = 0;
            if (i32 <= 1) {
                break;
            }
            i32 >>= 1;
            int i43 = i33 << 1;
            int i59 = 0;
            int i66 = 0;
            while (i59 < i32) {
                int i74 = iArr2[i3 + i32 + i59];
                int i92 = (i66 * i2) + i;
                int i96 = (i33 * i2) + i92;
                int i99 = 0;
                while (i99 < i33) {
                    int i100 = iArr[i92];
                    int i101 = iArr[i96];
                    iArr[i92] = modp_add(i100, i101, i6);
                    iArr[i96] = modp_montymul(modp_sub(i100, i101, i6), i74, i6, i21);
                    i99++;
                    i92 += i2;
                    i96 += i2;
                }
                i59++;
                i66 += i43;
            }
            i33 = i43;
        }
        int i102 = 1 << (31 - i5);
        int i103 = i;
        while (i22 < iMkn) {
            iArr[i103] = modp_montymul(iArr[i103], i102, i6, i21);
            i22++;
            i103 += i2;
        }
    }

    private static void modp_mkgm2(int[] iArr, int i, int[] iArr2, int i2, int i3, int i5, int i6, int i21) {
        int iMkn = mkn(i3);
        int iModp_R2 = modp_R2(i6, i21);
        int iModp_montymul = modp_montymul(i5, iModp_R2, i6, i21);
        for (int i22 = i3; i22 < 10; i22++) {
            iModp_montymul = modp_montymul(iModp_montymul, iModp_montymul, i6, i21);
        }
        int iModp_div = modp_div(iModp_R2, iModp_montymul, i6, i21, modp_R(i6));
        int i32 = 10 - i3;
        int iModp_R = modp_R(i6);
        int iModp_montymul2 = iModp_R;
        for (int i33 = 0; i33 < iMkn; i33++) {
            short s2 = REV10[i33 << i32];
            iArr[i + s2] = iModp_R;
            iArr2[s2 + i2] = iModp_montymul2;
            iModp_R = modp_montymul(iModp_R, iModp_montymul, i6, i21);
            iModp_montymul2 = modp_montymul(iModp_montymul2, iModp_div, i6, i21);
        }
    }

    private static int modp_montymul(int i, int i2, int i3, int i5) {
        long unsignedLong = toUnsignedLong(i) * toUnsignedLong(i2);
        int i6 = ((int) (((((((long) i5) * unsignedLong) & 2147483647L) * ((long) i3)) + unsignedLong) >>> 31)) - i3;
        return i6 + ((-(i6 >>> 31)) & i3);
    }

    private static int modp_ninv31(int i) {
        int i2 = 2 - i;
        int i3 = (2 - (i * i2)) * i2;
        int i5 = (2 - (i * i3)) * i3;
        int i6 = (2 - (i * i5)) * i5;
        return (-((2 - (i * i6)) * i6)) & Integer.MAX_VALUE;
    }

    private static int modp_norm(int i, int i2) {
        return i - (i2 & (((i - ((i2 + 1) >>> 1)) >>> 31) - 1));
    }

    private static void modp_poly_rec_res(int[] iArr, int i, int i2, int i3, int i5, int i6) {
        int i21 = 1 << (i2 - 1);
        for (int i22 = 0; i22 < i21; i22++) {
            int i32 = (i22 << 1) + i;
            iArr[i + i22] = modp_montymul(modp_montymul(iArr[i32], iArr[i32 + 1], i3, i5), i6, i3, i5);
        }
    }

    private static int modp_set(int i, int i2) {
        return i + (i2 & (-(i >>> 31)));
    }

    private static int modp_sub(int i, int i2, int i3) {
        int i5 = i - i2;
        return i5 + ((-(i5 >>> 31)) & i3);
    }

    private static void poly_big_to_fp(double[] dArr, int[] iArr, int i, int i2, int i3, int i5) {
        int iMkn = mkn(i5);
        double d = 0.0d;
        if (i2 == 0) {
            for (int i6 = 0; i6 < iMkn; i6++) {
                dArr[i6] = 0.0d;
            }
            return;
        }
        int i21 = i;
        int i22 = 0;
        while (i22 < iMkn) {
            int i32 = -(iArr[(i21 + i2) - 1] >>> 30);
            int i33 = i32 >>> 1;
            int i43 = i32 & 1;
            double d5 = 1.0d;
            double d6 = d;
            int i59 = 0;
            while (i59 < i2) {
                int i66 = (iArr[i21 + i59] ^ i33) + i43;
                i43 = i66 >>> 31;
                int i74 = i66 & Integer.MAX_VALUE;
                d6 += ((double) (i74 - ((i74 << 1) & i32))) * d5;
                i59++;
                d5 *= 2.147483648E9d;
            }
            dArr[i22] = d6;
            i22++;
            i21 += i3;
            d = 0.0d;
        }
    }

    private static int poly_big_to_small(byte[] bArr, int i, int[] iArr, int i2, int i3, int i5) {
        int iMkn = mkn(i5);
        for (int i6 = 0; i6 < iMkn; i6++) {
            int iZint_one_to_plain = zint_one_to_plain(iArr, i2 + i6);
            if (iZint_one_to_plain < (-i3) || iZint_one_to_plain > i3) {
                return 0;
            }
            bArr[i + i6] = (byte) iZint_one_to_plain;
        }
        return 1;
    }

    private static void poly_small_mkgauss(SHAKEDigest sHAKEDigest, byte[] bArr, int i) {
        int iMkgauss;
        int iMkn = mkn(i);
        int i2 = 0;
        for (int i3 = 0; i3 < iMkn; i3++) {
            while (true) {
                iMkgauss = mkgauss(sHAKEDigest, i);
                if (iMkgauss >= -127 && iMkgauss <= 127) {
                    if (i3 != iMkn - 1) {
                        i2 ^= iMkgauss & 1;
                        break;
                    } else if (((iMkgauss & 1) ^ i2) == 0) {
                    }
                }
            }
            bArr[i3] = (byte) iMkgauss;
        }
    }

    private static int poly_small_sqnorm(byte[] bArr, int i) {
        int iMkn = mkn(i);
        int i2 = 0;
        int i3 = 0;
        for (int i5 = 0; i5 < iMkn; i5++) {
            byte b4 = bArr[i5];
            i2 += b4 * b4;
            i3 |= i2;
        }
        return (-(i3 >>> 31)) | i2;
    }

    private static void poly_small_to_fp(double[] dArr, int i, byte[] bArr, int i2) {
        int iMkn = mkn(i2);
        for (int i3 = 0; i3 < iMkn; i3++) {
            dArr[i + i3] = bArr[i3];
        }
    }

    private static void poly_sub_scaled(int[] iArr, int i, int i2, int i3, int[] iArr2, int i5, int i6, int i21, int[] iArr3, int i22, int i32, int i33) {
        int iMkn = mkn(i33);
        for (int i43 = 0; i43 < iMkn; i43++) {
            int i59 = i5;
            int i66 = -iArr3[i43];
            int i74 = (i43 * i3) + i;
            for (int i92 = 0; i92 < iMkn; i92++) {
                zint_add_scaled_mul_small(iArr, i74, i2, iArr2, i59, i6, i66, i22, i32);
                if (i43 + i92 == iMkn - 1) {
                    i74 = i;
                    i66 = -i66;
                } else {
                    i74 += i3;
                }
                i59 += i21;
            }
        }
    }

    private static void poly_sub_scaled_ntt(int[] iArr, int i, int i2, int i3, int[] iArr2, int i5, int i6, int i21, int[] iArr3, int i22, int i32, int i33, int[] iArr4, int i43) {
        int i59 = i6;
        int iMkn = mkn(i33);
        int i66 = i59 + 1;
        int iMkn2 = i43 + mkn(i33);
        int iMkn3 = iMkn2 + mkn(i33);
        int i74 = (iMkn * i66) + iMkn3;
        int i92 = 0;
        while (i92 < i66) {
            FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
            int i96 = falconSmallPrimeArr[i92].f228797p;
            int iModp_ninv31 = modp_ninv31(i96);
            int iModp_R2 = modp_R2(i96, iModp_ninv31);
            int iModp_Rx = modp_Rx(i59, i96, iModp_ninv31, iModp_R2);
            int i99 = iMkn2;
            modp_mkgm2(iArr4, i43, iArr4, i99, i33, falconSmallPrimeArr[i92].f228796g, i96, iModp_ninv31);
            for (int i100 = 0; i100 < iMkn; i100++) {
                iArr4[i74 + i100] = modp_set(iArr3[i100], i96);
            }
            modp_NTT2(iArr4, i74, iArr4, i43, i33, i96, iModp_ninv31);
            int i101 = iMkn3 + i92;
            int i102 = i5;
            int i103 = i101;
            int i104 = 0;
            while (i104 < iMkn) {
                iArr4[i103] = zint_mod_small_signed(iArr2, i102, i59, i96, iModp_ninv31, iModp_R2, iModp_Rx);
                i104++;
                i102 += i21;
                i103 += i66;
                i59 = i6;
            }
            int i105 = i92;
            modp_NTT2_ext(iArr4, i101, i66, iArr4, i43, i33, i96, iModp_ninv31);
            int i106 = i101;
            int i107 = 0;
            while (i107 < iMkn) {
                iArr4[i106] = modp_montymul(modp_montymul(iArr4[i74 + i107], iArr4[i106], i96, iModp_ninv31), iModp_R2, i96, iModp_ninv31);
                i107++;
                i106 += i66;
            }
            iMkn2 = i99;
            modp_iNTT2_ext(iArr4, i101, i66, iArr4, iMkn2, i33, i96, iModp_ninv31);
            i92 = i105 + 1;
            i59 = i6;
        }
        zint_rebuild_CRT(iArr4, iMkn3, i66, i66, iMkn, 1, iArr4, i74);
        int i108 = i;
        int i109 = iMkn3;
        int i110 = 0;
        while (i110 < iMkn) {
            int i111 = i66;
            zint_sub_scaled(iArr, i108, i2, iArr4, i109, i111, i22, i32);
            i66 = i111;
            i110++;
            i108 += i3;
            i109 += i66;
        }
    }

    private static int solve_NTRU(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, int[] iArr) {
        int iMkn = mkn(i);
        if (solve_NTRU_deepest(i, bArr2, bArr3, iArr) == 0) {
            return 0;
        }
        if (i <= 2) {
            int i3 = i;
            while (true) {
                int i5 = i3 - 1;
                if (i3 <= 0) {
                    break;
                }
                if (solve_NTRU_intermediate(i, bArr2, bArr3, i5, iArr) == 0) {
                    return 0;
                }
                i3 = i5;
            }
        } else {
            int i6 = i;
            while (true) {
                int i21 = i6 - 1;
                if (i6 > 2) {
                    if (solve_NTRU_intermediate(i, bArr2, bArr3, i21, iArr) == 0) {
                        return 0;
                    }
                    i6 = i21;
                } else if (solve_NTRU_binary_depth1(i, bArr2, bArr3, iArr) == 0 || solve_NTRU_binary_depth0(i, bArr2, bArr3, iArr) == 0) {
                    return 0;
                }
            }
        }
        byte[] bArr4 = new byte[iMkn];
        if (poly_big_to_small(bArr, 0, iArr, 0, i2, i) == 0 || poly_big_to_small(bArr4, 0, iArr, iMkn, i2, i) == 0) {
            return 0;
        }
        int i22 = iMkn + iMkn;
        int i32 = i22 + iMkn;
        int i33 = i32 + iMkn;
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i43 = falconSmallPrimeArr[0].f228797p;
        int iModp_ninv31 = modp_ninv31(i43);
        modp_mkgm2(iArr, i33, iArr, 0, i, falconSmallPrimeArr[0].f228796g, i43, iModp_ninv31);
        for (int i59 = 0; i59 < iMkn; i59++) {
            iArr[i59] = modp_set(bArr4[i59], i43);
        }
        for (int i66 = 0; i66 < iMkn; i66++) {
            iArr[iMkn + i66] = modp_set(bArr2[i66], i43);
            iArr[i22 + i66] = modp_set(bArr3[i66], i43);
            iArr[i32 + i66] = modp_set(bArr[i66], i43);
        }
        modp_NTT2(iArr, iMkn, iArr, i33, i, i43, iModp_ninv31);
        modp_NTT2(iArr, i22, iArr, i33, i, i43, iModp_ninv31);
        modp_NTT2(iArr, i32, iArr, i33, i, i43, iModp_ninv31);
        modp_NTT2(iArr, 0, iArr, i33, i, i43, iModp_ninv31);
        int iModp_montymul = modp_montymul(12289, 1, i43, iModp_ninv31);
        for (int i74 = 0; i74 < iMkn; i74++) {
            if (modp_sub(modp_montymul(iArr[iMkn + i74], iArr[i74], i43, iModp_ninv31), modp_montymul(iArr[i22 + i74], iArr[i32 + i74], i43, iModp_ninv31), i43) != iModp_montymul) {
                return 0;
            }
        }
        return 1;
    }

    private static int solve_NTRU_binary_depth0(int i, byte[] bArr, byte[] bArr2, int[] iArr) {
        int i2 = 1;
        int i3 = 1 << i;
        int i5 = i3 >> 1;
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i6 = 0;
        int i21 = falconSmallPrimeArr[0].f228797p;
        int iModp_ninv31 = modp_ninv31(i21);
        int iModp_R2 = modp_R2(i21, iModp_ninv31);
        int i22 = i5 + i5;
        int i32 = i22 + i3;
        int i33 = i32 + i3;
        int i43 = i33 + i3;
        modp_mkgm2(iArr, i33, iArr, i43, i, falconSmallPrimeArr[0].f228796g, i21, iModp_ninv31);
        for (int i59 = 0; i59 < i5; i59++) {
            iArr[i59] = modp_set(zint_one_to_plain(iArr, i59), i21);
            int i66 = i5 + i59;
            iArr[i66] = modp_set(zint_one_to_plain(iArr, i66), i21);
        }
        int i74 = i - 1;
        modp_NTT2(iArr, 0, iArr, i33, i74, i21, iModp_ninv31);
        modp_NTT2(iArr, i5, iArr, i33, i74, i21, iModp_ninv31);
        for (int i92 = 0; i92 < i3; i92++) {
            iArr[i22 + i92] = modp_set(bArr[i92], i21);
            iArr[i32 + i92] = modp_set(bArr2[i92], i21);
        }
        modp_NTT2(iArr, i22, iArr, i33, i, i21, iModp_ninv31);
        modp_NTT2(iArr, i32, iArr, i33, i, i21, iModp_ninv31);
        int i96 = 0;
        while (i96 < i3) {
            int i99 = i22 + i96;
            int i100 = iArr[i99];
            int i101 = i99 + 1;
            int i102 = iArr[i101];
            int i103 = i32 + i96;
            int i104 = i2;
            int i105 = iArr[i103];
            int i106 = i103 + 1;
            int i107 = i6;
            int i108 = iArr[i106];
            int i109 = i96 >> 1;
            int iModp_montymul = modp_montymul(iArr[i109], iModp_R2, i21, iModp_ninv31);
            int i110 = i96;
            int iModp_montymul2 = modp_montymul(iArr[i5 + i109], iModp_R2, i21, iModp_ninv31);
            iArr[i99] = modp_montymul(i108, iModp_montymul, i21, iModp_ninv31);
            iArr[i101] = modp_montymul(i105, iModp_montymul, i21, iModp_ninv31);
            iArr[i103] = modp_montymul(i102, iModp_montymul2, i21, iModp_ninv31);
            iArr[i106] = modp_montymul(i100, iModp_montymul2, i21, iModp_ninv31);
            i96 = i110 + 2;
            i2 = i104;
            i6 = i107;
        }
        int i111 = i2;
        int i112 = i6;
        modp_iNTT2(iArr, i22, iArr, i43, i, i21, iModp_ninv31);
        modp_iNTT2(iArr, i32, iArr, i43, i, i21, iModp_ninv31);
        int i113 = i3 + i3;
        System.arraycopy(iArr, i22, iArr, 0, i3 * 2);
        int i114 = i113 + i3;
        int i115 = i114 + i3;
        int i116 = i115 + i3;
        int i117 = i116 + i3;
        modp_mkgm2(iArr, i113, iArr, i114, i, FalconSmallPrimeList.PRIMES[i112].f228796g, i21, iModp_ninv31);
        modp_NTT2(iArr, 0, iArr, i113, i, i21, iModp_ninv31);
        modp_NTT2(iArr, i3, iArr, i113, i, i21, iModp_ninv31);
        int iModp_set = modp_set(bArr[i112], i21);
        iArr[i117] = iModp_set;
        iArr[i116] = iModp_set;
        for (int i118 = i111; i118 < i3; i118++) {
            iArr[i116 + i118] = modp_set(bArr[i118], i21);
            iArr[(i117 + i3) - i118] = modp_set(-bArr[i118], i21);
        }
        modp_NTT2(iArr, i116, iArr, i113, i, i21, iModp_ninv31);
        modp_NTT2(iArr, i117, iArr, i113, i, i21, iModp_ninv31);
        for (int i119 = i112; i119 < i3; i119++) {
            int iModp_montymul3 = modp_montymul(iArr[i117 + i119], iModp_R2, i21, iModp_ninv31);
            iArr[i114 + i119] = modp_montymul(iModp_montymul3, iArr[i119], i21, iModp_ninv31);
            iArr[i115 + i119] = modp_montymul(iModp_montymul3, iArr[i116 + i119], i21, iModp_ninv31);
        }
        int iModp_set2 = modp_set(bArr2[i112], i21);
        iArr[i117] = iModp_set2;
        iArr[i116] = iModp_set2;
        for (int i120 = i111; i120 < i3; i120++) {
            iArr[i116 + i120] = modp_set(bArr2[i120], i21);
            iArr[(i117 + i3) - i120] = modp_set(-bArr2[i120], i21);
        }
        modp_NTT2(iArr, i116, iArr, i113, i, i21, iModp_ninv31);
        modp_NTT2(iArr, i117, iArr, i113, i, i21, iModp_ninv31);
        for (int i121 = i112; i121 < i3; i121++) {
            int iModp_montymul4 = modp_montymul(iArr[i117 + i121], iModp_R2, i21, iModp_ninv31);
            int i122 = i114 + i121;
            iArr[i122] = modp_add(iArr[i122], modp_montymul(iModp_montymul4, iArr[i3 + i121], i21, iModp_ninv31), i21);
            int i123 = i115 + i121;
            iArr[i123] = modp_add(iArr[i123], modp_montymul(iModp_montymul4, iArr[i116 + i121], i21, iModp_ninv31), i21);
        }
        modp_mkgm2(iArr, i113, iArr, i116, i, FalconSmallPrimeList.PRIMES[i112].f228796g, i21, iModp_ninv31);
        modp_iNTT2(iArr, i114, iArr, i116, i, i21, iModp_ninv31);
        modp_iNTT2(iArr, i115, iArr, i116, i, i21, iModp_ninv31);
        int i124 = i115;
        for (int i125 = i112; i125 < i3; i125++) {
            int i126 = i114 + i125;
            iArr[i113 + i125] = modp_norm(iArr[i126], i21);
            iArr[i126] = modp_norm(iArr[i124 + i125], i21);
        }
        double[] dArr = new double[i3 * 3];
        for (int i127 = i112; i127 < i3; i127++) {
            dArr[i113 + i127] = iArr[i114 + i127];
        }
        FalconFFT.FFT(dArr, i113, i);
        System.arraycopy(dArr, i113, dArr, i3, i5);
        int i128 = i3 + i5;
        int i129 = i112;
        while (i129 < i3) {
            dArr[i128 + i129] = iArr[i113 + i129];
            i129++;
            i124 = i124;
        }
        int i130 = i124;
        FalconFFT.FFT(dArr, i128, i);
        FalconFFT.poly_div_autoadj_fft(dArr, i128, dArr, i3, i);
        FalconFFT.iFFT(dArr, i128, i);
        int i131 = i112;
        while (i131 < i3) {
            iArr[i113 + i131] = modp_set((int) FPREngine.fpr_rint(dArr[i128 + i131]), i21);
            i131++;
            dArr = dArr;
            i128 = i128;
        }
        modp_mkgm2(iArr, i114, iArr, i130, i, FalconSmallPrimeList.PRIMES[i112].f228796g, i21, iModp_ninv31);
        for (int i132 = i112; i132 < i3; i132++) {
            iArr[i116 + i132] = modp_set(bArr[i132], i21);
            iArr[i117 + i132] = modp_set(bArr2[i132], i21);
        }
        modp_NTT2(iArr, i113, iArr, i114, i, i21, iModp_ninv31);
        modp_NTT2(iArr, i116, iArr, i114, i, i21, iModp_ninv31);
        modp_NTT2(iArr, i117, iArr, i114, i, i21, iModp_ninv31);
        for (int i133 = i112; i133 < i3; i133++) {
            int iModp_montymul5 = modp_montymul(iArr[i113 + i133], iModp_R2, i21, iModp_ninv31);
            iArr[i133] = modp_sub(iArr[i133], modp_montymul(iModp_montymul5, iArr[i116 + i133], i21, iModp_ninv31), i21);
            int i134 = i3 + i133;
            iArr[i134] = modp_sub(iArr[i134], modp_montymul(iModp_montymul5, iArr[i117 + i133], i21, iModp_ninv31), i21);
        }
        modp_iNTT2(iArr, 0, iArr, i130, i, i21, iModp_ninv31);
        modp_iNTT2(iArr, i3, iArr, i130, i, i21, iModp_ninv31);
        for (int i135 = i112; i135 < i3; i135++) {
            iArr[i135] = modp_norm(iArr[i135], i21);
            int i136 = i3 + i135;
            iArr[i136] = modp_norm(iArr[i136], i21);
        }
        return i111;
    }

    private static int solve_NTRU_binary_depth1(int i, byte[] bArr, byte[] bArr2, int[] iArr) {
        int i2;
        int i3 = 1;
        int i5 = 1 << i;
        int i6 = i - 1;
        int i21 = 1 << i6;
        int i22 = i21 >> 1;
        int[] iArr2 = MAX_BL_SMALL;
        int i32 = iArr2[1];
        int i33 = iArr2[2];
        int i43 = MAX_BL_LARGE[1];
        int i59 = i33 * i22;
        int i66 = i59 + i59;
        int i74 = i43 * i21;
        int i92 = i66 + i74;
        int i96 = 0;
        while (i96 < i43) {
            int i99 = FalconSmallPrimeList.PRIMES[i96].f228797p;
            int i100 = i96;
            int iModp_ninv31 = modp_ninv31(i99);
            int iModp_R2 = modp_R2(i99, iModp_ninv31);
            int iModp_Rx = modp_Rx(i33, i99, iModp_ninv31, iModp_R2);
            int i101 = i66 + i100;
            int i102 = i92 + i100;
            int i103 = i92;
            int i104 = i59;
            int i105 = i3;
            int i106 = 0;
            int i107 = 0;
            while (i107 < i22) {
                int i108 = i99;
                int i109 = iModp_R2;
                int i110 = i106;
                iArr[i101] = zint_mod_small_signed(iArr, i106, i33, i108, iModp_ninv31, i109, iModp_Rx);
                int i111 = i104;
                iArr[i102] = zint_mod_small_signed(iArr, i111, i33, i108, iModp_ninv31, i109, iModp_Rx);
                i101 += i43;
                i102 += i43;
                i104 = i111 + i33;
                i106 = i110 + i33;
                i99 = i108;
                iModp_R2 = i109;
                i74 = i74;
                i32 = i32;
                i107++;
                i103 = i103;
            }
            i96 = i100 + 1;
            i74 = i74;
            i32 = i32;
            i3 = i105;
            i92 = i103;
        }
        int i112 = i3;
        int i113 = i32;
        int i114 = 0;
        int i115 = i74;
        int[] iArr3 = iArr;
        System.arraycopy(iArr3, i66, iArr3, 0, i115);
        System.arraycopy(iArr3, i92, iArr3, i115, i115);
        int i116 = i115 + i115;
        int i117 = i113 * i21;
        int i118 = i116 + i117;
        int i119 = i118 + i117;
        int i120 = 0;
        while (i120 < i43) {
            FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
            int i121 = falconSmallPrimeArr[i120].f228797p;
            int iModp_ninv312 = modp_ninv31(i121);
            int iModp_R22 = modp_R2(i121, iModp_ninv312);
            int i122 = i119;
            int i123 = i122 + i5;
            int i124 = i123 + i21;
            int i125 = i124 + i5;
            int i126 = i120;
            modp_mkgm2(iArr3, i122, iArr, i123, i, falconSmallPrimeArr[i120].f228796g, i121, iModp_ninv312);
            int i127 = i121;
            for (int i128 = i114; i128 < i5; i128++) {
                iArr[i124 + i128] = modp_set(bArr[i128], i127);
                iArr[i125 + i128] = modp_set(bArr2[i128], i127);
            }
            modp_NTT2(iArr, i124, iArr, i122, i, i127, iModp_ninv312);
            modp_NTT2(iArr, i125, iArr, i122, i, i127, iModp_ninv312);
            int i129 = i;
            while (i129 > i6) {
                int i130 = i127;
                int i131 = iModp_R22;
                int i132 = i124;
                modp_poly_rec_res(iArr, i132, i129, i130, iModp_ninv312, i131);
                int i133 = i125;
                modp_poly_rec_res(iArr, i133, i129, i130, iModp_ninv312, i131);
                i127 = i130;
                iModp_R22 = i131;
                i125 = i133;
                i129--;
                i124 = i132;
            }
            int i134 = iModp_R22;
            int i135 = i122 + i21;
            System.arraycopy(iArr, i123, iArr, i135, i21);
            int i136 = i135 + i21;
            System.arraycopy(iArr, i124, iArr, i136, i21);
            int i137 = i136 + i21;
            System.arraycopy(iArr, i125, iArr, i137, i21);
            int i138 = i137 + i21;
            int i139 = i138 + i22;
            int i140 = i115 + i126;
            int i141 = i140;
            int i142 = i126;
            int i143 = 0;
            while (i143 < i22) {
                iArr[i138 + i143] = iArr[i142];
                iArr[i139 + i143] = iArr[i141];
                i143++;
                i142 += i43;
                i141 += i43;
            }
            int i144 = i - 2;
            modp_NTT2(iArr, i138, iArr, i122, i144, i127, iModp_ninv312);
            int i145 = i139;
            modp_NTT2(iArr, i145, iArr, i122, i144, i127, iModp_ninv312);
            int i146 = i140;
            int i147 = i126;
            int i148 = 0;
            while (i148 < i22) {
                int i149 = i148 << 1;
                int i150 = i136 + i149;
                int i151 = i147;
                int i152 = iArr[i150];
                int i153 = i145;
                int i154 = iArr[i150 + 1];
                int i155 = i149 + i137;
                int i156 = i146;
                int i157 = iArr[i155];
                int i158 = iArr[i155 + 1];
                int i159 = i148;
                int iModp_montymul = modp_montymul(iArr[i138 + i148], i134, i127, iModp_ninv312);
                int i160 = i137;
                int iModp_montymul2 = modp_montymul(iArr[i153 + i159], i134, i127, iModp_ninv312);
                iArr[i151] = modp_montymul(i158, iModp_montymul, i127, iModp_ninv312);
                iArr[i151 + i43] = modp_montymul(i157, iModp_montymul, i127, iModp_ninv312);
                iArr[i156] = modp_montymul(i154, iModp_montymul2, i127, iModp_ninv312);
                iArr[i156 + i43] = modp_montymul(i152, iModp_montymul2, i127, iModp_ninv312);
                i148 = i159 + 1;
                int i161 = i43 << 1;
                i146 = i156 + i161;
                i147 = i151 + i161;
                i145 = i153;
                i137 = i160;
            }
            int i162 = i137;
            int i163 = i43;
            int i164 = i127;
            int i165 = i6;
            modp_iNTT2_ext(iArr, i126, i163, iArr, i135, i165, i164, iModp_ninv312);
            modp_iNTT2_ext(iArr, i140, i163, iArr, i135, i165, i164, iModp_ninv312);
            int i166 = i113;
            if (i126 < i166) {
                modp_iNTT2(iArr, i136, iArr, i135, i165, i164, iModp_ninv312);
                modp_iNTT2(iArr, i162, iArr, i135, i165, i164, iModp_ninv312);
                i2 = i165;
                int i167 = i116 + i126;
                int i168 = i118 + i126;
                int i169 = 0;
                while (i169 < i21) {
                    iArr[i167] = iArr[i136 + i169];
                    iArr[i168] = iArr[i162 + i169];
                    i169++;
                    i167 += i166;
                    i168 += i166;
                }
            } else {
                i2 = i165;
            }
            i120 = i126 + 1;
            iArr3 = iArr;
            i113 = i166;
            i6 = i2;
            i119 = i122;
            i114 = 0;
            i43 = i163;
        }
        int i170 = i119;
        int i171 = i43;
        int i172 = i6;
        int i173 = i113;
        int i174 = i21 << 1;
        zint_rebuild_CRT(iArr, 0, i171, i171, i174, 1, iArr, i170);
        zint_rebuild_CRT(iArr, i116, i173, i173, i174, 1, iArr, i170);
        double[] dArr = new double[i21];
        double[] dArr2 = new double[i21];
        poly_big_to_fp(dArr, iArr, 0, i171, i171, i172);
        poly_big_to_fp(dArr2, iArr, i115, i171, i171, i172);
        System.arraycopy(iArr, i116, iArr, 0, i173 * 2 * i21);
        double[] dArr3 = new double[i21];
        double[] dArr4 = new double[i21];
        poly_big_to_fp(dArr3, iArr, 0, i173, i173, i172);
        poly_big_to_fp(dArr4, iArr, i117, i173, i173, i172);
        FalconFFT.FFT(dArr, 0, i172);
        FalconFFT.FFT(dArr2, 0, i172);
        FalconFFT.FFT(dArr3, 0, i172);
        FalconFFT.FFT(dArr4, 0, i172);
        double[] dArr5 = new double[i21];
        double[] dArr6 = new double[i22];
        FalconFFT.poly_add_muladj_fft(dArr5, dArr, dArr2, dArr3, dArr4, i172);
        FalconFFT.poly_invnorm2_fft(dArr6, 0, dArr3, 0, dArr4, 0, i172);
        FalconFFT.poly_mul_autoadj_fft(dArr5, 0, dArr6, 0, i172);
        FalconFFT.iFFT(dArr5, 0, i172);
        for (int i175 = 0; i175 < i21; i175++) {
            double d = dArr5[i175];
            if (d >= 9.223372036854776E18d || -9.223372036854776E18d >= d) {
                return 0;
            }
            dArr5[i175] = FPREngine.fpr_rint(d);
        }
        FalconFFT.FFT(dArr5, 0, i172);
        FalconFFT.poly_mul_fft(dArr3, 0, dArr5, 0, i172);
        FalconFFT.poly_mul_fft(dArr4, 0, dArr5, 0, i172);
        FalconFFT.poly_sub(dArr, 0, dArr3, 0, i172);
        FalconFFT.poly_sub(dArr2, 0, dArr4, 0, i172);
        FalconFFT.iFFT(dArr, 0, i172);
        FalconFFT.iFFT(dArr2, 0, i172);
        for (int i176 = 0; i176 < i21; i176++) {
            iArr[i176] = (int) FPREngine.fpr_rint(dArr[i176]);
            iArr[i21 + i176] = (int) FPREngine.fpr_rint(dArr2[i176]);
        }
        return i112;
    }

    private static int solve_NTRU_deepest(int i, byte[] bArr, byte[] bArr2, int[] iArr) {
        int i2 = MAX_BL_SMALL[i];
        int i3 = i2 + i2;
        int i5 = i3 + i2;
        int i6 = i5 + i2;
        make_fg(iArr, i3, bArr, bArr2, i, i, 0);
        zint_rebuild_CRT(iArr, i3, i2, i2, 2, 0, iArr, i6);
        return (zint_bezout(iArr, i2, iArr, 0, iArr, i3, iArr, i5, i2, iArr, i6) != 0 && zint_mul_small(iArr, 0, i2, 12289) == 0 && zint_mul_small(iArr, i2, i2, 12289) == 0) ? 1 : 0;
    }

    private static int solve_NTRU_intermediate(int i, byte[] bArr, byte[] bArr2, int i2, int[] iArr) {
        double d;
        double[] dArr;
        int i3;
        double[] dArr2;
        int i5;
        int i6;
        int i21;
        int i22;
        double[] dArr3;
        int i32;
        double[] dArr4;
        int i33;
        double[] dArr5;
        int[] iArr2;
        int i43;
        int i59;
        int i66;
        int i74;
        int i92;
        int i96;
        int i99;
        int i100;
        int i101;
        int i102;
        int i103;
        int i104;
        int i105;
        int i106;
        int i107;
        int i108;
        int i109;
        int i110 = i - i2;
        int i111 = 1;
        int i112 = 1 << i110;
        int i113 = i112 >> 1;
        int[] iArr3 = MAX_BL_SMALL;
        int i114 = iArr3[i2];
        int i115 = iArr3[i2 + 1];
        int i116 = MAX_BL_LARGE[i2];
        int i117 = i115 * i113;
        int i118 = i117 + i117;
        int[] iArr4 = iArr;
        make_fg(iArr4, i118, bArr, bArr2, i, i2, 1);
        int i119 = i2;
        int i120 = i112 * i116;
        int i121 = i120 + i120;
        int i122 = i112 * i114;
        System.arraycopy(iArr4, i118, iArr4, i121, i122 + i122);
        int i123 = i121 + i122;
        int i124 = i123 + i122;
        int i125 = 0;
        System.arraycopy(iArr4, 0, iArr4, i124, i117 + i117);
        int i126 = i117 + i124;
        int i127 = 0;
        while (i127 < i116) {
            int i128 = FalconSmallPrimeList.PRIMES[i127].f228797p;
            int iModp_ninv31 = modp_ninv31(i128);
            int i129 = i111;
            int iModp_R2 = modp_R2(i128, iModp_ninv31);
            int iModp_Rx = modp_Rx(i115, i128, iModp_ninv31, iModp_R2);
            int i130 = i120 + i127;
            int i131 = i124;
            int i132 = i127;
            int i133 = i112;
            int i134 = i126;
            int i135 = 0;
            while (i135 < i113) {
                int i136 = i115;
                int i137 = i127;
                int i138 = i128;
                int i139 = iModp_R2;
                int i140 = i124;
                iArr[i132] = zint_mod_small_signed(iArr4, i124, i136, i138, iModp_ninv31, i139, iModp_Rx);
                int i141 = i134;
                iArr[i130] = zint_mod_small_signed(iArr, i141, i136, i138, iModp_ninv31, i139, iModp_Rx);
                i135++;
                i134 = i141 + i136;
                i132 += i116;
                i130 += i116;
                i115 = i136;
                i121 = i121;
                i124 = i140 + i136;
                iModp_R2 = i139;
                iArr4 = iArr;
                i128 = i138;
                i127 = i137;
            }
            i127++;
            i115 = i115;
            i121 = i121;
            iArr4 = iArr;
            i125 = 0;
            i111 = i129;
            i112 = i133;
            i124 = i131;
        }
        int i142 = i124;
        int i143 = i121;
        int i144 = i112;
        int i145 = i111;
        int i146 = i125;
        while (i146 < i116) {
            FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
            int i147 = falconSmallPrimeArr[i146].f228797p;
            int iModp_ninv312 = modp_ninv31(i147);
            int iModp_R22 = modp_R2(i147, iModp_ninv312);
            if (i146 == i114) {
                int i148 = i114;
                int i149 = i143;
                i102 = iModp_ninv312;
                i74 = iModp_R22;
                i92 = i114;
                i96 = i144;
                int i150 = i142;
                i100 = i147;
                zint_rebuild_CRT(iArr, i149, i92, i148, i96, 1, iArr, i150);
                i101 = i149;
                zint_rebuild_CRT(iArr, i123, i92, i92, i96, 1, iArr, i150);
                i99 = i150;
            } else {
                i74 = iModp_R22;
                i92 = i114;
                i96 = i144;
                i99 = i142;
                i100 = i147;
                i101 = i143;
                i102 = iModp_ninv312;
            }
            int i151 = i99 + i96;
            int i152 = i151 + i96;
            int i153 = i152 + i96;
            int i154 = i92;
            int i155 = i99;
            int i156 = i102;
            int i157 = i100;
            int i158 = i96;
            int i159 = i110;
            modp_mkgm2(iArr, i155, iArr, i151, i159, falconSmallPrimeArr[i146].f228796g, i157, i156);
            if (i146 < i154) {
                int i160 = i101 + i146;
                int i161 = i123 + i146;
                int i162 = i160;
                int i163 = i161;
                int i164 = 0;
                while (i164 < i158) {
                    iArr[i152 + i164] = iArr[i162];
                    iArr[i153 + i164] = iArr[i163];
                    i164++;
                    i162 += i154;
                    i163 += i154;
                }
                modp_iNTT2_ext(iArr, i160, i154, iArr, i151, i159, i157, i156);
                modp_iNTT2_ext(iArr, i161, i154, iArr, i151, i159, i157, i156);
                i103 = i151;
                i109 = i156;
                i104 = i155;
                i106 = i152;
                i107 = i153;
                i105 = i154;
                i108 = i159;
            } else {
                i103 = i151;
                int i165 = i157;
                int iModp_Rx2 = modp_Rx(i154, i165, i156, i74);
                int i166 = i123;
                int i167 = i101;
                int i168 = 0;
                while (i168 < i158) {
                    int i169 = i165;
                    int i170 = i74;
                    int i171 = i168;
                    int i172 = i167;
                    int i173 = iModp_Rx2;
                    iArr[i152 + i168] = zint_mod_small_signed(iArr, i167, i154, i169, i156, i170, iModp_Rx2);
                    int i174 = i166;
                    iArr[i153 + i171] = zint_mod_small_signed(iArr, i174, i154, i169, i156, i170, i173);
                    int i175 = i171 + 1;
                    i166 = i174 + i154;
                    i167 = i172 + i154;
                    i74 = i170;
                    i165 = i169;
                    iModp_Rx2 = i173;
                    i168 = i175;
                }
                int i176 = i165;
                i104 = i155;
                i105 = i154;
                modp_NTT2(iArr, i152, iArr, i104, i159, i176, i156);
                i106 = i152;
                modp_NTT2(iArr, i153, iArr, i104, i159, i176, i156);
                i107 = i153;
                i108 = i159;
                i109 = i156;
                i157 = i176;
            }
            int i177 = i107 + i158;
            int i178 = i177 + i113;
            int i179 = i120 + i146;
            int i180 = i146;
            int i181 = i179;
            int i182 = 0;
            while (i182 < i113) {
                iArr[i177 + i182] = iArr[i180];
                iArr[i178 + i182] = iArr[i181];
                i182++;
                i180 += i116;
                i181 += i116;
            }
            int i183 = i157;
            int i184 = i109;
            int i185 = i108 - 1;
            modp_NTT2(iArr, i177, iArr, i104, i185, i183, i184);
            int i186 = i178;
            modp_NTT2(iArr, i186, iArr, i104, i185, i183, i184);
            i142 = i104;
            int i187 = i146;
            int i188 = i179;
            int i189 = 0;
            while (i189 < i113) {
                int i190 = i189 << 1;
                int i191 = i106 + i190;
                int i192 = i189;
                int i193 = iArr[i191];
                int i194 = i186;
                int i195 = iArr[i191 + 1];
                int i196 = i107 + i190;
                int i197 = i187;
                int i198 = iArr[i196];
                int i199 = iArr[i196 + 1];
                int i200 = i188;
                int iModp_montymul = modp_montymul(iArr[i177 + i192], i74, i183, i184);
                int i201 = i108;
                int iModp_montymul2 = modp_montymul(iArr[i194 + i192], i74, i183, i184);
                iArr[i197] = modp_montymul(i199, iModp_montymul, i183, i184);
                iArr[i197 + i116] = modp_montymul(i198, iModp_montymul, i183, i184);
                iArr[i200] = modp_montymul(i195, iModp_montymul2, i183, i184);
                iArr[i200 + i116] = modp_montymul(i193, iModp_montymul2, i183, i184);
                i189 = i192 + 1;
                int i202 = i116 << 1;
                i187 = i197 + i202;
                i188 = i200 + i202;
                i186 = i194;
                i108 = i201;
            }
            int i203 = i108;
            int i204 = i103;
            int i205 = i146;
            modp_iNTT2_ext(iArr, i205, i116, iArr, i204, i203, i183, i184);
            modp_iNTT2_ext(iArr, i179, i116, iArr, i204, i203, i183, i184);
            i146 = i205 + 1;
            i143 = i101;
            i144 = i158;
            i114 = i105;
            i110 = i203;
        }
        int i206 = i110;
        int i207 = i114;
        int i208 = i144;
        int i209 = i143;
        int i210 = i142;
        zint_rebuild_CRT(iArr, 0, i116, i116, i208, 1, iArr, i210);
        zint_rebuild_CRT(iArr, i120, i116, i116, i208, 1, iArr, i210);
        double[] dArr6 = new double[i208];
        double[] dArr7 = new double[i208];
        double[] dArr8 = new double[i208];
        double[] dArr9 = new double[i208];
        double[] dArr10 = new double[i113];
        int[] iArr5 = new int[i208];
        int iMin = Math.min(i207, 10);
        int i211 = (i209 + i207) - iMin;
        int i212 = 10;
        poly_big_to_fp(dArr8, iArr, i211, iMin, i207, i206);
        poly_big_to_fp(dArr9, iArr, (i123 + i207) - iMin, iMin, i207, i206);
        int i213 = i207;
        int i214 = (i213 - iMin) * 31;
        int i215 = bitlength_avg[i119];
        int i216 = bitlength_std[i119];
        int i217 = i215 - (i216 * 6);
        int i218 = (i216 * 6) + i215;
        FalconFFT.FFT(dArr8, 0, i206);
        FalconFFT.FFT(dArr9, 0, i206);
        FalconFFT.poly_invnorm2_fft(dArr10, 0, dArr8, 0, dArr9, 0, i206);
        double[] dArr11 = dArr9;
        int i219 = i206;
        double[] dArr12 = dArr8;
        FalconFFT.poly_adj_fft(dArr12, 0, i219);
        FalconFFT.poly_adj_fft(dArr11, 0, i219);
        int i220 = i116 * 31;
        int i221 = i220;
        int i222 = i220 - i217;
        int i223 = i116;
        while (true) {
            int iMin2 = Math.min(i223, i212);
            double[] dArr13 = dArr6;
            double[] dArr14 = dArr11;
            int i224 = i116;
            double[] dArr15 = dArr10;
            int i225 = i223;
            poly_big_to_fp(dArr13, iArr, i223 - iMin2, iMin2, i224, i219);
            double[] dArr16 = dArr7;
            poly_big_to_fp(dArr16, iArr, (i120 + i225) - iMin2, iMin2, i224, i219);
            FalconFFT.FFT(dArr13, 0, i219);
            FalconFFT.FFT(dArr16, 0, i219);
            FalconFFT.poly_mul_fft(dArr13, 0, dArr12, 0, i219);
            FalconFFT.poly_mul_fft(dArr16, 0, dArr14, 0, i219);
            FalconFFT.poly_add(dArr16, 0, dArr13, 0, i219);
            FalconFFT.poly_mul_autoadj_fft(dArr16, 0, dArr15, 0, i219);
            FalconFFT.iFFT(dArr16, 0, i219);
            int i226 = (i222 - ((i223 - iMin2) * 31)) + i214;
            if (i226 < 0) {
                i226 = -i226;
                d = 2.0d;
            } else {
                d = 0.5d;
            }
            double d5 = 1.0d;
            while (i226 != 0) {
                if ((i226 & 1) != 0) {
                    d5 *= d;
                }
                i226 >>= 1;
                d *= d;
            }
            int i227 = 0;
            while (i227 < i208) {
                double d6 = dArr16[i227] * d5;
                if (-2.147483647E9d >= d6 || d6 >= 2.147483647E9d) {
                    return 0;
                }
                iArr5[i227] = (int) FPREngine.fpr_rint(d6);
                i227++;
                dArr15 = dArr15;
            }
            double[] dArr17 = dArr15;
            int i228 = i221;
            int i229 = i222 / 31;
            int i230 = i222 % 31;
            if (i119 <= 4) {
                dArr2 = dArr13;
                i33 = i210;
                int i231 = i213;
                i59 = i219;
                int i232 = i209;
                dArr4 = dArr12;
                i43 = i213;
                dArr5 = dArr14;
                i3 = i228;
                i21 = 10;
                dArr = dArr17;
                i32 = i224;
                dArr3 = dArr16;
                iArr2 = iArr;
                poly_sub_scaled_ntt(iArr2, 0, i225, i32, iArr, i232, i43, i231, iArr5, i229, i230, i59, iArr, i33);
                i22 = 0;
                i6 = i232;
                i66 = i120;
                poly_sub_scaled_ntt(iArr2, i66, i225, i32, iArr, i123, i43, i43, iArr5, i229, i230, i59, iArr, i33);
                i5 = i225;
            } else {
                dArr = dArr17;
                i3 = i228;
                dArr2 = dArr13;
                i5 = i225;
                i6 = i209;
                i21 = 10;
                i22 = 0;
                dArr3 = dArr16;
                i32 = i224;
                dArr4 = dArr12;
                i33 = i210;
                int i233 = i213;
                dArr5 = dArr14;
                iArr2 = iArr;
                i43 = i233;
                i59 = i219;
                poly_sub_scaled(iArr2, 0, i5, i32, iArr, i6, i43, i233, iArr5, i229, i230, i59);
                i66 = i120;
                poly_sub_scaled(iArr2, i66, i5, i32, iArr, i123, i43, i43, iArr5, i229, i230, i59);
            }
            int i234 = i43;
            i219 = i59;
            int i235 = i222 + i218;
            int i236 = i235 + 10;
            if (i236 < i3) {
                if (i5 * 31 >= i235 + 41) {
                    i5--;
                }
                i221 = i236;
            } else {
                i221 = i3;
            }
            if (i222 <= 0) {
                if (i5 < i234) {
                    int i237 = i66;
                    int i238 = 0;
                    int i239 = i22;
                    while (i238 < i208) {
                        int i240 = (-(iArr2[(i239 + i5) - 1] >>> 30)) >>> 1;
                        for (int i241 = i5; i241 < i234; i241++) {
                            iArr2[i239 + i241] = i240;
                        }
                        int i242 = (-(iArr2[(i237 + i5) - 1] >>> 30)) >>> 1;
                        for (int i243 = i5; i243 < i234; i243++) {
                            iArr2[i237 + i243] = i242;
                        }
                        i238++;
                        i239 += i32;
                        i237 += i32;
                    }
                }
                int i244 = 0;
                int i245 = 0;
                int i246 = 0;
                while (i245 < (i208 << 1)) {
                    System.arraycopy(iArr2, i244, iArr2, i246, i234);
                    i245++;
                    i246 += i234;
                    i244 += i32;
                }
                return i145;
            }
            int i247 = i222 - 25;
            i222 = i247 < 0 ? 0 : i247;
            i119 = i2;
            i120 = i66;
            i223 = i5;
            i210 = i33;
            dArr7 = dArr3;
            dArr12 = dArr4;
            dArr11 = dArr5;
            dArr6 = dArr2;
            dArr10 = dArr;
            i212 = i21;
            i209 = i6;
            i213 = i234;
            i116 = i32;
        }
    }

    private static long toUnsignedLong(int i) {
        return ((long) i) & BodyPartID.bodyIdMax;
    }

    private static void zint_add_mul_small(int[] iArr, int i, int[] iArr2, int i2, int i3, int i5) {
        int i6 = 0;
        for (int i21 = 0; i21 < i3; i21++) {
            int i22 = i + i21;
            long unsignedLong = (toUnsignedLong(iArr2[i2 + i21]) * toUnsignedLong(i5)) + toUnsignedLong(iArr[i22]) + toUnsignedLong(i6);
            iArr[i22] = ((int) unsignedLong) & Integer.MAX_VALUE;
            i6 = (int) (unsignedLong >>> 31);
        }
        iArr[i + i3] = i6;
    }

    private static void zint_add_scaled_mul_small(int[] iArr, int i, int i2, int[] iArr2, int i3, int i5, int i6, int i21, int i22) {
        if (i5 == 0) {
            return;
        }
        int i32 = (-(iArr2[(i3 + i5) - 1] >>> 30)) >>> 1;
        int i33 = 0;
        int i43 = i21;
        int i59 = 0;
        while (i43 < i2) {
            int i66 = i43 - i21;
            int i74 = i66 < i5 ? iArr2[i3 + i66] : i32;
            int i92 = i + i43;
            long unsignedLong = (toUnsignedLong(i33 | ((i74 << i22) & Integer.MAX_VALUE)) * ((long) i6)) + toUnsignedLong(iArr[i92]) + ((long) i59);
            iArr[i92] = ((int) unsignedLong) & Integer.MAX_VALUE;
            i59 = (int) (unsignedLong >>> 31);
            i43++;
            i33 = i74 >>> (31 - i22);
        }
    }

    private static int zint_bezout(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3, int[] iArr4, int i5, int i6, int[] iArr5, int i21) {
        int[] iArr6 = iArr3;
        int i22 = i3;
        int[] iArr7 = iArr4;
        int i32 = i5;
        int i33 = i6;
        int[] iArr8 = iArr5;
        int i43 = i21;
        if (i33 == 0) {
            return 0;
        }
        int i59 = i43 + i33;
        int i66 = i59 + i33;
        int i74 = i66 + i33;
        int iModp_ninv31 = modp_ninv31(iArr6[i22]);
        int iModp_ninv312 = modp_ninv31(iArr7[i32]);
        System.arraycopy(iArr6, i22, iArr8, i66, i33);
        System.arraycopy(iArr7, i32, iArr8, i74, i33);
        iArr[i] = 1;
        iArr2[i2] = 0;
        for (int i92 = 1; i92 < i33; i92++) {
            iArr[i + i92] = 0;
            iArr2[i2 + i92] = 0;
        }
        System.arraycopy(iArr7, i32, iArr8, i43, i33);
        System.arraycopy(iArr6, i22, iArr8, i59, i33);
        iArr8[i59] = iArr8[i59] - 1;
        int i96 = 30;
        int i99 = (i33 * 62) + 30;
        while (true) {
            int i100 = 31;
            if (i99 < i96) {
                break;
            }
            int i101 = -1;
            int i102 = i33;
            int i103 = -1;
            int i104 = 0;
            int i105 = 0;
            int i106 = 0;
            int i107 = 0;
            while (true) {
                int i108 = i102 - 1;
                if (i102 <= 0) {
                    break;
                }
                int i109 = iArr8[i66 + i108];
                int i110 = iArr8[i74 + i108];
                i105 ^= (i105 ^ i109) & i103;
                i104 ^= (i104 ^ i109) & i101;
                i107 ^= (i107 ^ i110) & i103;
                i106 ^= (i106 ^ i110) & i101;
                int i111 = i103 & ((((i109 | i110) + Integer.MAX_VALUE) >>> 31) - 1);
                int i112 = i103;
                i103 = i111;
                i101 = i112;
                i102 = i108;
            }
            int i113 = ~i101;
            long unsignedLong = (toUnsignedLong(i105 & i113) << 31) + toUnsignedLong(i104 | (i105 & i101));
            long unsignedLong2 = (toUnsignedLong(i107 & i113) << 31) + toUnsignedLong(i106 | (i107 & i101));
            int i114 = iArr8[i66];
            int i115 = iArr8[i74];
            long j2 = 0;
            long j3 = 1;
            int i116 = iModp_ninv31;
            long j5 = 0;
            long j16 = 1;
            int i117 = 0;
            while (i117 < i100) {
                long j22 = unsignedLong2 - unsignedLong;
                int i118 = i100;
                int i119 = i66;
                int i120 = (int) ((j22 ^ ((unsignedLong ^ unsignedLong2) & (unsignedLong ^ j22))) >>> 63);
                int i121 = (i114 >> i117) & 1;
                int i122 = i121 & (i115 >> i117) & 1;
                int i123 = i117;
                int i124 = i122 & i120;
                int i125 = i122 & (~i120);
                int i126 = (i121 ^ 1) | i124;
                int i127 = i114 - ((-i124) & i115);
                long j42 = unsignedLong - (unsignedLong2 & (-toUnsignedLong(i124)));
                long j46 = -i124;
                long j47 = j16 - (j5 & j46);
                long j57 = j2 - (j3 & j46);
                int i128 = i115 - ((-i125) & i127);
                long j58 = unsignedLong2 - (j42 & (-toUnsignedLong(i125)));
                long j65 = -i125;
                long j69 = j5 - (j47 & j65);
                long j76 = j3 - (j57 & j65);
                i114 = i127 + ((i126 - 1) & i127);
                long j85 = i126;
                long j100 = j85 - 1;
                j16 = j47 + (j47 & j100);
                j2 = j57 + (j57 & j100);
                unsignedLong = j42 ^ ((j42 ^ (j42 >> 1)) & (-toUnsignedLong(i126)));
                i115 = i128 + ((-i126) & i128);
                long j101 = -j85;
                j5 = j69 + (j69 & j101);
                j3 = j76 + (j76 & j101);
                unsignedLong2 = j58 ^ ((j58 ^ (j58 >> 1)) & (toUnsignedLong(i126) - 1));
                i117 = i123 + 1;
                iModp_ninv312 = iModp_ninv312;
                i66 = i119;
                i100 = i118;
                i99 = i99;
                i59 = i59;
            }
            int i129 = iModp_ninv312;
            long j102 = j2;
            long j103 = j16;
            int iZint_co_reduce = zint_co_reduce(iArr8, i66, iArr5, i74, i33, j103, j102, j5, j3);
            long j104 = -(iZint_co_reduce & 1);
            long j105 = j103 - ((j103 + j103) & j104);
            long j106 = j102 - (j104 & (j102 + j102));
            long j107 = -(iZint_co_reduce >>> 1);
            long j108 = j5 - ((j5 + j5) & j107);
            long j109 = j3 - ((j3 + j3) & j107);
            zint_co_reduce_mod(iArr, i, iArr5, i43, iArr7, i32, i6, i129, j105, j106, j108, j109);
            i33 = i6;
            zint_co_reduce_mod(iArr2, i2, iArr5, i59, iArr6, i22, i33, i116, j105, j106, j108, j109);
            i99 -= 30;
            iArr6 = iArr3;
            i22 = i3;
            iArr7 = iArr4;
            i32 = i5;
            iArr8 = iArr5;
            i43 = i21;
            iModp_ninv31 = i116;
            i74 = i74;
            i96 = 30;
            iModp_ninv312 = i129;
            i66 = i66;
        }
        int i130 = i66;
        int i131 = iArr5[i130] ^ 1;
        for (int i132 = 1; i132 < i33; i132++) {
            i131 |= iArr5[i130 + i132];
        }
        return (1 - ((i131 | (-i131)) >>> 31)) & iArr3[i3] & iArr4[i5];
    }

    private static int zint_co_reduce(int[] iArr, int i, int[] iArr2, int i2, int i3, long j2, long j3, long j5, long j16) {
        long j22 = 0;
        int i5 = 0;
        long j42 = 0;
        while (i5 < i3) {
            int i6 = i + i5;
            int i21 = i2 + i5;
            long j46 = iArr[i6];
            long j47 = iArr2[i21];
            long jD = a.d(j47, j3, j46 * j2, j42);
            int i22 = i5;
            long jD2 = a.d(j47, j16, j46 * j5, j22);
            if (i22 > 0) {
                iArr[i6 - 1] = ((int) jD) & Integer.MAX_VALUE;
                iArr2[i21 - 1] = ((int) jD2) & Integer.MAX_VALUE;
            }
            j22 = jD2 >> 31;
            i5 = i22 + 1;
            j42 = jD >> 31;
        }
        long j57 = j22;
        iArr[(i + i3) - 1] = (int) j42;
        iArr2[(i2 + i3) - 1] = (int) j57;
        int i32 = (int) (j42 >>> 63);
        int i33 = (int) (j57 >>> 63);
        zint_negate(iArr, i, i3, i32);
        zint_negate(iArr2, i2, i3, i33);
        return (i33 << 1) | i32;
    }

    private static void zint_co_reduce_mod(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3, int i5, int i6, long j2, long j3, long j5, long j16) {
        int i21 = i5;
        long j22 = j2;
        int i22 = iArr[i];
        int i32 = iArr2[i2];
        int i33 = Integer.MAX_VALUE;
        int i43 = (((((int) j3) * i32) + (((int) j22) * i22)) * i6) & Integer.MAX_VALUE;
        int i59 = (((i32 * ((int) j16)) + (i22 * ((int) j5))) * i6) & Integer.MAX_VALUE;
        int i66 = 0;
        long j42 = 0;
        long j46 = 0;
        while (i66 < i21) {
            int i74 = i + i66;
            int i92 = i2 + i66;
            int i96 = i33;
            int i99 = i66;
            long j47 = iArr[i74];
            long j57 = iArr2[i92];
            int i100 = i3 + i99;
            long jD = a.d(iArr3[i100], toUnsignedLong(i43), (j57 * j3) + (j47 * j22), j42);
            long jD2 = a.d(iArr3[i100], toUnsignedLong(i59), (j57 * j16) + (j47 * j5), j46);
            if (i99 > 0) {
                iArr[i74 - 1] = ((int) jD) & i96;
                iArr2[i92 - 1] = ((int) jD2) & i96;
            }
            j42 = jD >> 31;
            j46 = jD2 >> 31;
            i66 = i99 + 1;
            i21 = i5;
            j22 = j2;
            i33 = i96;
        }
        long j58 = j42;
        long j65 = j46;
        iArr[(i + i5) - 1] = (int) j58;
        iArr2[(i2 + i5) - 1] = (int) j65;
        zint_finish_mod(iArr, i, i5, iArr3, i3, (int) (j58 >>> 63));
        zint_finish_mod(iArr2, i2, i5, iArr3, i3, (int) (j65 >>> 63));
    }

    private static void zint_finish_mod(int[] iArr, int i, int i2, int[] iArr2, int i3, int i5) {
        int i6 = 0;
        for (int i21 = 0; i21 < i2; i21++) {
            i6 = ((iArr[i + i21] - iArr2[i3 + i21]) - i6) >>> 31;
        }
        int i22 = (-i5) >>> 1;
        int i32 = -((1 - i6) | i5);
        for (int i33 = 0; i33 < i2; i33++) {
            int i43 = i + i33;
            int i59 = (iArr[i43] - ((iArr2[i3 + i33] ^ i22) & i32)) - i5;
            iArr[i43] = Integer.MAX_VALUE & i59;
            i5 = i59 >>> 31;
        }
    }

    private static int zint_mod_small_signed(int[] iArr, int i, int i2, int i3, int i5, int i6, int i21) {
        if (i2 == 0) {
            return 0;
        }
        return modp_sub(zint_mod_small_unsigned(iArr, i, i2, i3, i5, i6), (-(iArr[(i + i2) - 1] >>> 30)) & i21, i3);
    }

    private static int zint_mod_small_unsigned(int[] iArr, int i, int i2, int i3, int i5, int i6) {
        int iModp_add = 0;
        while (true) {
            int i21 = i2 - 1;
            if (i2 <= 0) {
                return iModp_add;
            }
            int iModp_montymul = modp_montymul(iModp_add, i6, i3, i5);
            int i22 = iArr[i + i21] - i3;
            iModp_add = modp_add(iModp_montymul, i22 + ((-(i22 >>> 31)) & i3), i3);
            i2 = i21;
        }
    }

    private static int zint_mul_small(int[] iArr, int i, int i2, int i3) {
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i21 = i + i6;
            long unsignedLong = (toUnsignedLong(iArr[i21]) * toUnsignedLong(i3)) + ((long) i5);
            iArr[i21] = ((int) unsignedLong) & Integer.MAX_VALUE;
            i5 = (int) (unsignedLong >> 31);
        }
        return i5;
    }

    private static void zint_negate(int[] iArr, int i, int i2, int i3) {
        int i5 = (-i3) >>> 1;
        for (int i6 = 0; i6 < i2; i6++) {
            int i21 = i + i6;
            int i22 = (iArr[i21] ^ i5) + i3;
            iArr[i21] = Integer.MAX_VALUE & i22;
            i3 = i22 >>> 31;
        }
    }

    private static void zint_norm_zero(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        int i5 = 0;
        int i6 = i3;
        int i21 = 0;
        while (true) {
            int i22 = i6 - 1;
            if (i6 <= 0) {
                zint_sub(iArr, i, iArr2, i2, i3, i5 >>> 31);
                return;
            }
            int i32 = iArr[i + i22];
            int i33 = iArr2[i2 + i22];
            int i43 = ((i21 << 30) | (i33 >>> 1)) - i32;
            i5 |= ((-(i43 >>> 31)) | ((-i43) >>> 31)) & ((i5 & 1) - 1);
            i6 = i22;
            i21 = i33 & 1;
        }
    }

    private static int zint_one_to_plain(int[] iArr, int i) {
        int i2 = iArr[i];
        return i2 | ((1073741824 & i2) << 1);
    }

    private static void zint_rebuild_CRT(int[] iArr, int i, int i2, int i3, int i5, int i6, int[] iArr2, int i21) {
        int i22 = 0;
        iArr2[i21] = FalconSmallPrimeList.PRIMES[0].f228797p;
        int i32 = 1;
        while (i32 < i2) {
            FalconSmallPrime falconSmallPrime = FalconSmallPrimeList.PRIMES[i32];
            int i33 = falconSmallPrime.f228797p;
            int i43 = falconSmallPrime.f228798s;
            int iModp_ninv31 = modp_ninv31(i33);
            int iModp_R2 = modp_R2(i33, iModp_ninv31);
            int i59 = i;
            int i66 = 0;
            while (i66 < i5) {
                int i74 = i33;
                int i92 = iModp_ninv31;
                int i96 = iModp_R2;
                int iModp_montymul = modp_montymul(i43, modp_sub(iArr[i59 + i32], zint_mod_small_unsigned(iArr, i59, i32, i33, iModp_ninv31, iModp_R2), i74), i74, i92);
                int i99 = i32;
                zint_add_mul_small(iArr, i59, iArr2, i21, i99, iModp_montymul);
                i66++;
                i59 += i3;
                i32 = i99;
                i33 = i74;
                iModp_ninv31 = i92;
                iModp_R2 = i96;
            }
            int i100 = i32;
            iArr2[i21 + i100] = zint_mul_small(iArr2, i21, i100, i33);
            i32 = i100 + 1;
        }
        if (i6 != 0) {
            int i101 = i;
            while (i22 < i5) {
                zint_norm_zero(iArr, i101, iArr2, i21, i2);
                i22++;
                i101 += i3;
            }
        }
    }

    private static void zint_sub(int[] iArr, int i, int[] iArr2, int i2, int i3, int i5) {
        int i6 = -i5;
        int i21 = 0;
        for (int i22 = 0; i22 < i3; i22++) {
            int i32 = i + i22;
            int i33 = iArr[i32];
            int i43 = (i33 - iArr2[i2 + i22]) - i21;
            i21 = i43 >>> 31;
            iArr[i32] = i33 ^ (((i43 & Integer.MAX_VALUE) ^ i33) & i6);
        }
    }

    private static void zint_sub_scaled(int[] iArr, int i, int i2, int[] iArr2, int i3, int i5, int i6, int i21) {
        if (i5 == 0) {
            return;
        }
        int i22 = (-(iArr2[(i3 + i5) - 1] >>> 30)) >>> 1;
        int i32 = 0;
        int i33 = i6;
        int i43 = 0;
        while (i33 < i2) {
            int i59 = i33 - i6;
            int i66 = i59 < i5 ? iArr2[i59 + i3] : i22;
            int i74 = i + i33;
            int i92 = (iArr[i74] - (i32 | ((i66 << i21) & Integer.MAX_VALUE))) - i43;
            iArr[i74] = i92 & Integer.MAX_VALUE;
            i43 = i92 >>> 31;
            i33++;
            i32 = i66 >>> (31 - i21);
        }
    }
}
