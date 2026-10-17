package iv9;

import dv9.s;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f168790a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.STICKER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.GIF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s.EMOJI.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[s.TEXT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[s.KEY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[s.PLAN_GIFTING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[s.PLAN_REFERRAL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[s.GIPHY_GIF_ID.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[s.REFERRAL.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[s.SALARY_REFERRAL.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f168790a = iArr;
    }
}
