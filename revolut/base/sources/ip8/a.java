package ip8;

import dp8.d;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f167678a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.DAILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.MONTHLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d.ONE_OFF.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f167678a = iArr;
    }
}
