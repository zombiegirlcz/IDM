package zsj;

import ysj.v;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f324942a;

    static {
        int[] iArr = new int[v.values().length];
        try {
            iArr[v.PREDEFINED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v.CUSTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f324942a = iArr;
    }
}
