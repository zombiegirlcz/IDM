package t4d;

import z3d.f;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f267974a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.ADD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.REMOVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.SYNCED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f267974a = iArr;
    }
}
