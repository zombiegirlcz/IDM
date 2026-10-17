package kbc;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f182573a;

    static {
        int[] iArr = new int[wbc.c.values().length];
        try {
            iArr[wbc.c.CANCELLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wbc.c.RETURNED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[wbc.c.ORDERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[wbc.c.SHIPPED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[wbc.c.MISSED_DELIVERY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[wbc.c.IN_TRANSIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[wbc.c.DELIVERED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[wbc.c.PICK_UP_AVAILABLE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f182573a = iArr;
    }
}
