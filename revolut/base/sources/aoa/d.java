package aoa;

import hha.w0;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f7939b;

    static {
        int[] iArr = new int[oga.i.values().length];
        try {
            iArr[oga.i.Warning.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f7938a = iArr;
        int[] iArr2 = new int[w0.values().length];
        try {
            iArr2[w0.PRIVATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[w0.ULTRA.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[w0.METAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[w0.PREMIUM.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[w0.PLUS.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        f7939b = iArr2;
    }
}
