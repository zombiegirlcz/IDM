package arf;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8698a;

    static {
        int[] iArr = new int[hpf.a.values().length];
        try {
            iArr[hpf.a.BANK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hpf.a.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f8698a = iArr;
    }
}
