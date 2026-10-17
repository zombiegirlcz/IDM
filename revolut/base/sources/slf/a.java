package slf;

import aw0.k7;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f264199a;

    static {
        int[] iArr = new int[k7.values().length];
        try {
            iArr[k7.ALWAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k7.ONLY_NEGATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k7.NEVER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f264199a = iArr;
    }
}
