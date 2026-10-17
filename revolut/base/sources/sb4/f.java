package sb4;

import xu3.o0;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f261505a;

    static {
        int[] iArr = new int[o0.values().length];
        try {
            iArr[o0.MAIN_APPLICANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o0.CO_APPLICANT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o0.JOINT_APPLICANTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f261505a = iArr;
    }
}
