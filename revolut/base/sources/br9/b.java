package br9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f17955c;

    static {
        int[] iArr = new int[ar9.g.values().length];
        try {
            iArr[ar9.g.DUMB.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ar9.g.SMART.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f17953a = iArr;
        int[] iArr2 = new int[ar9.h.values().length];
        try {
            iArr2[ar9.h.OWE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ar9.h.OWED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ar9.h.SETTLED_UP.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f17954b = iArr2;
        int[] iArr3 = new int[oq9.d.values().length];
        try {
            iArr3[oq9.d.SETTLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[oq9.d.OWE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[oq9.d.OWED.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f17955c = iArr3;
    }
}
