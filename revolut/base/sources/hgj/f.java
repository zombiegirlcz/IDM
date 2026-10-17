package hgj;

import dej.a1;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f152187a;

    static {
        int[] iArr = new int[a1.values().length];
        try {
            iArr[a1.PAC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a1.POWER_OF_ATTORNEY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a1.DYNAMIC_FORM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a1.OTP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f152187a = iArr;
    }
}
