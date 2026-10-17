package dcg;

import cgi.e;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f112985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f112986b;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.PAY_NOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.PAY_LATER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f112985a = iArr;
        int[] iArr2 = new int[fgi.a.values().length];
        try {
            iArr2[fgi.a.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[fgi.a.EXPEDIA.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[fgi.a.VRBO.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[fgi.a.NUITEE.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f112986b = iArr2;
    }
}
