package jid;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f174438a;

    static {
        int[] iArr = new int[fvb.c.values().length];
        try {
            iArr[fvb.c.WINNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fvb.c.WON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fvb.c.LOSING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[fvb.c.PENDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f174438a = iArr;
    }
}
