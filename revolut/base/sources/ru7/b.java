package ru7;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f257460a;

    static {
        int[] iArr = new int[dl7.a.values().length];
        try {
            iArr[dl7.a.EVENT_CANCELLATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[dl7.a.TRIP_CANCELLATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f257460a = iArr;
    }
}
