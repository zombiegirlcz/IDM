package yik;

import hha.w0;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f314336a;

    static {
        int[] iArr = new int[w0.values().length];
        try {
            iArr[w0.PRIVATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w0.ULTRA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[w0.METAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[w0.PREMIUM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[w0.PLUS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f314336a = iArr;
    }
}
