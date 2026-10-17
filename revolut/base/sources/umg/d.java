package umg;

import fmg.n;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f281315a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.NOT_STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n.COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f281315a = iArr;
    }
}
