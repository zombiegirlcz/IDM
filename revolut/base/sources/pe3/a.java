package pe3;

import pe0.d;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f235326a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.ALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f235326a = iArr;
    }
}
