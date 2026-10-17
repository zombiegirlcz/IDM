package tya;

import pwa.n;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f275532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f275533b;

    static {
        int[] iArr = new int[pwa.b.values().length];
        try {
            iArr[pwa.b.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pwa.b.VERIFYING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pwa.b.INELIGIBLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[pwa.b.REDEEMED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[pwa.b.REWARD_AVAILABLE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[pwa.b.IGNORED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[pwa.b.EXPIRED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[pwa.b.MAX_REACHED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f275532a = iArr;
        int[] iArr2 = new int[n.values().length];
        try {
            iArr2[n.CRYPTO_INTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        f275533b = iArr2;
    }
}
