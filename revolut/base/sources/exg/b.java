package exg;

import pwg.j;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f130427a;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.RED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.WHITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.GREEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f130427a = iArr;
    }
}
