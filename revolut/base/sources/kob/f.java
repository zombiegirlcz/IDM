package kob;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f186283a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.Personal.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.Joint.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f186283a = iArr;
    }
}
