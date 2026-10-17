package die;

import sfe.g;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f115057a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.DESTRUCTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f115057a = iArr;
    }
}
