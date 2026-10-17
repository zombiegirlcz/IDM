package kb8;

import eb8.i;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f182530a;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.ALLOWED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.FORBIDDEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f182530a = iArr;
    }
}
