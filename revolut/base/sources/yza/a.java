package yza;

import vza.b;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f318060a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.SIGN_IN_SIGN_UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.GLOBAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f318060a = iArr;
    }
}
