package sx0;

import aw0.v1;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f266246a;

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
        f266246a = iArr;
    }
}
