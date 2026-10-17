package ds;

import vr.g;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f117173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f117174b;

    static {
        int[] iArr = new int[vr.b.values().length];
        try {
            iArr[vr.b.BAD_QUALITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vr.b.BAD_SUBMISSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vr.b.REJECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f117173a = iArr;
        int[] iArr2 = new int[g.values().length];
        try {
            iArr2[g.MANDATORY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[g.AVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[g.NOT_AVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f117174b = iArr2;
    }
}
