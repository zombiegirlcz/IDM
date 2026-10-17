package f5f;

import cfl.j;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f132303a;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.YOUTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f132303a = iArr;
    }
}
