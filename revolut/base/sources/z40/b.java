package z40;

import v30.k;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f319303a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.POOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.GREAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.WOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k.POSTPONED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f319303a = iArr;
    }
}
