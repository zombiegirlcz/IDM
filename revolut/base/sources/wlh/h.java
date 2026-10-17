package wlh;

import xzg.q0;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f298493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f298494b;

    static {
        int[] iArr = new int[q0.values().length];
        try {
            iArr[q0.PERSONAL_JOINT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q0.PERSONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f298493a = iArr;
        int[] iArr2 = new int[hel.b.values().length];
        try {
            iArr2[hel.b.GB.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[hel.b.AU.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[hel.b.EEA.ordinal()] = 3;
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
            iArr2[hel.b.SG.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[hel.b.US.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        f298494b = iArr2;
    }
}
