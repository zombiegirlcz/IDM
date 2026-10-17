package npe;

import mpe.g;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f218199a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.PRIMARY_RESIDENCY_DECLARATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f218199a = iArr;
    }
}
