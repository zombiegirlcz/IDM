package defpackage;

import com.youTransactor.uCube.rpc.SecurityMode;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f250667a;

    static {
        int[] iArr = new int[SecurityMode.values().length];
        f250667a = iArr;
        try {
            iArr[SecurityMode.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f250667a[SecurityMode.SIGNED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f250667a[SecurityMode.SIGNED_CIPHERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f250667a[SecurityMode.SIGNED_NOT_CHECKED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
