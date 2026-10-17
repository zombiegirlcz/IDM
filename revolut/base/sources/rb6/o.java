package rb6;

import ba6.u;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f252973a;

    static {
        int[] iArr = new int[u.values().length];
        try {
            iArr[u.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u.MAJOR_EVENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f252973a = iArr;
    }
}
