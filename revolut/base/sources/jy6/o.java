package jy6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f179349a;

    static {
        int[] iArr = new int[sr6.m.values().length];
        try {
            iArr[sr6.m.SEVEN_DAYS_BEFORE_DUE_DATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[sr6.m.ON_DUE_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[sr6.m.THREE_DAYS_AFTER_DUE_DATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f179349a = iArr;
    }
}
