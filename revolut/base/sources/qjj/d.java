package qjj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f246889a;

    static {
        int[] iArr = new int[dej.e.values().length];
        try {
            iArr[dej.e.UPGRADE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[dej.e.DOWNGRADE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f246889a = iArr;
    }
}
