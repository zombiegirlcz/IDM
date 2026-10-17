package o47;

import n47.j;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f222164a;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.ALL_TIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.CUSTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[j.TAX_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f222164a = iArr;
    }
}
