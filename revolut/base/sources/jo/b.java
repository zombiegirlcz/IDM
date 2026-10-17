package jo;

import od0.l;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f176819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f176820b;

    static {
        int[] iArr = new int[od0.b.values().length];
        try {
            iArr[od0.b.UNDEFINED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[od0.b.DEVELOPMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[od0.b.BETA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[od0.b.PRODUCTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f176819a = iArr;
        int[] iArr2 = new int[l.values().length];
        try {
            iArr2[l.E2E.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[l.MOCK.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[l.UNDEFINED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f176820b = iArr2;
    }
}
