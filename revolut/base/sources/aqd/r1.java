package aqd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f8396b;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.REMOVE_DESTINATIONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.REGULAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f8395a = iArr;
        int[] iArr2 = new int[hel.b.values().length];
        try {
            iArr2[hel.b.GB.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[hel.b.EEA.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[hel.b.SG.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[hel.b.MX.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[hel.b.BR.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[hel.b.AU.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[hel.b.US.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        f8396b = iArr2;
    }
}
