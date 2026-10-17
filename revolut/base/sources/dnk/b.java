package dnk;

import ggk.f0;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f116357a;

    static {
        int[] iArr = new int[f0.values().length];
        try {
            iArr[f0.IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f0.VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f116357a = iArr;
    }
}
