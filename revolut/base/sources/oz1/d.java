package oz1;

import j02.n;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f231103a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.MANDATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.AMENDMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f231103a = iArr;
    }
}
