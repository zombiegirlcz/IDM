package ul;

import cm.d;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f280844a;

    static {
        int[] iArr = new int[d.values().length];
        f280844a = iArr;
        try {
            iArr[d.On.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f280844a[d.Off.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f280844a[d.Auto.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
