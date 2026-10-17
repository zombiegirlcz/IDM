package l5j;

import pwa.e;
import pwa.p;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f192302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f192303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f192304c;

    static {
        int[] iArr = new int[p.values().length];
        try {
            iArr[p.BUSINESS_SIGN_UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p.BUSINESS_VERIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p.ADD_MONEY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[p.ORDER_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[p.MAKE_PURCHASES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f192302a = iArr;
        int[] iArr2 = new int[pwa.b.values().length];
        try {
            iArr2[pwa.b.REDEEMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[pwa.b.REWARD_AVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[pwa.b.VERIFYING.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[pwa.b.ACTIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[pwa.b.EXPIRED.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[pwa.b.IGNORED.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[pwa.b.MAX_REACHED.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[pwa.b.INELIGIBLE.ordinal()] = 8;
        } catch (NoSuchFieldError unused13) {
        }
        f192303b = iArr2;
        int[] iArr3 = new int[e.values().length];
        try {
            iArr3[e.NOT_STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[e.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[e.DONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[e.EXPIRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[e.INELIGIBLE.ordinal()] = 5;
        } catch (NoSuchFieldError unused18) {
        }
        f192304c = iArr3;
    }
}
