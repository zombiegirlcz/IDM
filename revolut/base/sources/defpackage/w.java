package defpackage;

import com.youTransactor.uCube.rpc.SecurityMode;

/* JADX INFO: loaded from: classes15.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f293580a;

    static {
        int[] iArr = new int[SecurityMode.values().length];
        f293580a = iArr;
        try {
            iArr[SecurityMode.SIGNED_NOT_CHECKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f293580a[SecurityMode.SIGNED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f293580a[SecurityMode.SIGNED_CIPHERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f293580a[SecurityMode.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
