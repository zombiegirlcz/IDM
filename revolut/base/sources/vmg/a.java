package vmg;

import do3.t;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f290574a;

    static {
        int[] iArr = new int[t.values().length];
        try {
            iArr[t.NOT_VERIFIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t.VERIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[t.GRADUATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f290574a = iArr;
    }
}
