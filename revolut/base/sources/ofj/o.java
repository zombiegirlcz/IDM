package ofj;

import kfj.h1;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f224900a;

    static {
        int[] iArr = new int[h1.values().length];
        try {
            iArr[h1.PORTING_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h1.PORTING_UPDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f224900a = iArr;
    }
}
