package go7;

import kl7.z0;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f145102a;

    static {
        int[] iArr = new int[z0.values().length];
        try {
            iArr[z0.APPLIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z0.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z0.IN_PROGRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[z0.QUOTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f145102a = iArr;
    }
}
