package gs0;

import aw0.v1;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f146270a;

    static {
        int[] iArr = new int[v1.values().length];
        try {
            iArr[v1.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v1.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f146270a = iArr;
    }
}
