package ph0;

import vg0.c0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f236191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f236192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f236193c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[c0.values().length];
        try {
            iArr[c0.DISCOURAGED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c0.PREFERRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c0.REQUIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f236191a = iArr;
        int[] iArr2 = new int[vg0.a.values().length];
        try {
            iArr2[vg0.a.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[vg0.a.INDIRECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[vg0.a.DIRECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[vg0.a.ENTERPRISE.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f236192b = iArr2;
        int[] iArr3 = new int[vg0.b.values().length];
        try {
            iArr3[vg0.b.PLATFORM.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[vg0.b.CROSS_PLATFORM.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        f236193c = iArr3;
        int[] iArr4 = new int[vg0.d.values().length];
        try {
            iArr4[vg0.d.DISCOURAGED.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[vg0.d.PREFERRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[vg0.d.REQUIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        d = iArr4;
    }
}
