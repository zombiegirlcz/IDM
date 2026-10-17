package wfh;

import jel.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f297142a;

    static {
        int[] iArr = new int[w.values().length];
        try {
            iArr[w.VENTURE_CAPITAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w.PRIVATE_CREDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[w.PRIVATE_EQUITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[w.MULTI_ASSET.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[w.INFRASTRUCTURE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[w.REAL_ESTATE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f297142a = iArr;
    }
}
