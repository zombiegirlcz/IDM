package mnl;

import gkl.k;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f207525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f207526b;

    static {
        int[] iArr = new int[jkl.i.values().length];
        try {
            iArr[jkl.i.FACE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jkl.i.FACE_OTP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[jkl.i.ID_DOC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f207525a = iArr;
        int[] iArr2 = new int[k.values().length];
        try {
            iArr2[k.PREPARED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[k.UNDER_VERIFICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f207526b = iArr2;
    }
}
