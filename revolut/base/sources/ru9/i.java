package ru9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f257477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f257478b;

    static {
        int[] iArr = new int[gw0.t.values().length];
        try {
            iArr[gw0.t.FIRST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gw0.t.SINGLE_TAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[gw0.t.MIDDLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[gw0.t.LAST.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[gw0.t.SINGLE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f257477a = iArr;
        int[] iArr2 = new int[dv9.d.values().length];
        try {
            iArr2[dv9.d.SENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[dv9.d.SENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[dv9.d.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f257478b = iArr2;
    }
}
