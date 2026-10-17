package irj;

import arj.b;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f168063a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.GLOBAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.POCKET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f168063a = iArr;
    }
}
