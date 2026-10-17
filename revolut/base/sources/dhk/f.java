package dhk;

import hha.w0;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f114829a;

    static {
        int[] iArr = new int[w0.values().length];
        try {
            iArr[w0.ESSENTIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w0.STANDARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[w0.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[w0.BASIC.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[w0.PLUS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[w0.PREMIUM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[w0.METAL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[w0.ULTRA.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[w0.PRIVATE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f114829a = iArr;
    }
}
