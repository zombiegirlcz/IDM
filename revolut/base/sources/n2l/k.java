package n2l;

import xzg.q0;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f211592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f211593b;

    static {
        int[] iArr = new int[q0.values().length];
        try {
            iArr[q0.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q0.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f211592a = iArr;
        int[] iArr2 = new int[cfl.j.values().length];
        try {
            iArr2[cfl.j.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[cfl.j.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[cfl.j.YOUTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f211593b = iArr2;
    }
}
