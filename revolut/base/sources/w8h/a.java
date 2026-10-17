package w8h;

import cfl.j;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f295647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f295648b;

    static {
        int[] iArr = new int[cfl.b.values().length];
        try {
            iArr[cfl.b.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cfl.b.ONBOARDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cfl.b.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[cfl.b.SUSPENDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[cfl.b.OFFBOARDING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[cfl.b.TERMINATED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f295647a = iArr;
        int[] iArr2 = new int[j.values().length];
        try {
            iArr2[j.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[j.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[j.YOUTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        f295648b = iArr2;
    }
}
