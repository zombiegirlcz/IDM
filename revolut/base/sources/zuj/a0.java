package zuj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f325486a;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.Stays.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.Experiences.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m.AirportFastTrack.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[m.Custom.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f325486a = iArr;
    }
}
