package vp7;

import kl7.p1;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f291132a;

    static {
        int[] iArr = new int[p1.values().length];
        try {
            iArr[p1.CLAIM_NOT_SETTLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p1.CLAIM_EXCEEDS_AMOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p1.CLAIM_DATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[p1.CLAIM_TYPE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f291132a = iArr;
    }
}
