package f7i;

import ibd.j;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f132626a;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.Daily.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.Weekly.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.Monthly.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f132626a = iArr;
    }
}
