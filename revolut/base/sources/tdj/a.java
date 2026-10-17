package tdj;

import ncj.d;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f269999a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.ABSOLUTE_VALUES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.PERCENTAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f269999a = iArr;
    }
}
