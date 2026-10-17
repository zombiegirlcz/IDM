package km9;

import hha.w0;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f185732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f185733b;

    static {
        int[] iArr = new int[do3.c.values().length];
        try {
            iArr[do3.c.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[do3.c.YOUTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f185732a = iArr;
        int[] iArr2 = new int[w0.values().length];
        try {
            iArr2[w0.ESSENTIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[w0.STANDARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[w0.PLUS.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[w0.PREMIUM.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[w0.METAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[w0.ULTRA.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[w0.PRIVATE.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[w0.UNKNOWN.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[w0.BASIC.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        f185733b = iArr2;
    }
}
