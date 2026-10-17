package gk2;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f144308a;

    static {
        int[] iArr = new int[sj2.d.values().length];
        try {
            iArr[sj2.d.CARD_WITHDRAWAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[sj2.d.CARD_DISPENSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[sj2.d.PIN_CHANGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[sj2.d.PIN_UNBLOCK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[sj2.d.ACCOUNT_WITHDRAWAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[sj2.d.BALANCE_INQUIRY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f144308a = iArr;
    }
}
