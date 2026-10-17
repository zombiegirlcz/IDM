package itj;

import htj.c0;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f168413a;

    static {
        int[] iArr = new int[c0.values().length];
        try {
            iArr[c0.PREDEFINED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c0.CUSTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f168413a = iArr;
    }
}
