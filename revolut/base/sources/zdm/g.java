package zdm;

import ulm.h1;

/* JADX INFO: loaded from: classes23.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f321615a;

    static {
        int[] iArr = new int[h1.values().length];
        try {
            iArr[h1.HTTP_1_0.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h1.HTTP_1_1.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h1.SPDY_3.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h1.HTTP_2.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[h1.H2_PRIOR_KNOWLEDGE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[h1.QUIC.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[h1.HTTP_3.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f321615a = iArr;
    }
}
