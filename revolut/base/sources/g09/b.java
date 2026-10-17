package g09;

import u09.m;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f139372a;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.INCLUDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.EXCLUDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f139372a = iArr;
    }
}
