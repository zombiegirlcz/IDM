package nz8;

import qz8.n;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f220992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f220993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f220994c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.AVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n.LOCKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f220992a = iArr;
        int[] iArr2 = new int[qz8.d.values().length];
        try {
            iArr2[qz8.d.NEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[qz8.d.TRENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f220993b = iArr2;
        int[] iArr3 = new int[jz8.d.values().length];
        try {
            iArr3[jz8.d.NEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[jz8.d.TRENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f220994c = iArr3;
        int[] iArr4 = new int[u09.g.values().length];
        try {
            iArr4[u09.g.NEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[u09.g.TRENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        d = iArr4;
        int[] iArr5 = new int[pz8.b.values().length];
        try {
            iArr5[pz8.b.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr5[pz8.b.DISCOVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        e = iArr5;
    }
}
