package lkb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f196345a;

    static {
        int[] iArr = new int[xjb.b.values().length];
        try {
            iArr[xjb.b.PAUSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xjb.b.ON_TRACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[xjb.b.NOT_ELIGIBLE_FOR_PRIZES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[xjb.b.WEEK_IN_DANGER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[xjb.b.TWO_WEEKS_IN_DANGER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f196345a = iArr;
    }
}
