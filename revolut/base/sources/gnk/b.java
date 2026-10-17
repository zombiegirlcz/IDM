package gnk;

import hha.i;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f145025a;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.MONTHLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.ANNUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f145025a = iArr;
    }
}
