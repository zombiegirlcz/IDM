package t3e;

import tvb.e;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f267744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f267745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f267746c;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.INTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.EPAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f267744a = iArr;
        int[] iArr2 = new int[tvb.c.values().length];
        try {
            iArr2[tvb.c.AU_NZ.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[tvb.c.IL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[tvb.c.GLOBAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f267745b = iArr2;
        int[] iArr3 = new int[t1e.d.values().length];
        try {
            iArr3[t1e.d.MSI.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        f267746c = iArr3;
    }
}
