package fsd;

import amd.e;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f137662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f137663b;

    static {
        int[] iArr = new int[amd.b.values().length];
        try {
            iArr[amd.b.CASH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[amd.b.LINKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[amd.b.LINKED_CREDIT_CARDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[amd.b.LINKED_COMBINED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[amd.b.SAVINGS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[amd.b.INVEST.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[amd.b.CRYPTO.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[amd.b.CREDIT_CARDS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[amd.b.PAY_LATER.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[amd.b.LOANS.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[amd.b.CREDIT.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[amd.b.POCKETS.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[amd.b.OTHER_ASSETS.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        f137662a = iArr;
        int[] iArr2 = new int[e.values().length];
        try {
            iArr2[e.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[e.JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[e.PRO.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[e.POCKETS.ordinal()] = 4;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[e.CREDIT_CARDS.ordinal()] = 5;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[e.PAY_LATER.ordinal()] = 6;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[e.LOANS.ordinal()] = 7;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[e.SAVINGS.ordinal()] = 8;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[e.JOINT_SAVINGS.ordinal()] = 9;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[e.LINKED_ACCOUNT.ordinal()] = 10;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[e.INVEST.ordinal()] = 11;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[e.CRYPTO.ordinal()] = 12;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[e.LINKED_CREDIT_CARDS.ordinal()] = 13;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[e.CUSTOM_ASSET_PROPERTY.ordinal()] = 14;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[e.CUSTOM_ASSET_VEHICLE.ordinal()] = 15;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[e.CUSTOM_ASSET_FINE_ART_AND_ANTIQUE.ordinal()] = 16;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[e.CUSTOM_ASSET_COLLECTIBLE.ordinal()] = 17;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[e.CUSTOM_ASSET_WATCH.ordinal()] = 18;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[e.CUSTOM_ASSET_JEWELLERY.ordinal()] = 19;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[e.CUSTOM_ASSET_OTHER.ordinal()] = 20;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[e.CUSTOM_ASSET_UNKNOWN.ordinal()] = 21;
        } catch (NoSuchFieldError unused34) {
        }
        f137663b = iArr2;
    }
}
