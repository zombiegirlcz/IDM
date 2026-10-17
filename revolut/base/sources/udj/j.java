package udj;

import wli.q;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f279237a;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.EXTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.PROGRAMMATIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f279237a = iArr;
    }
}
