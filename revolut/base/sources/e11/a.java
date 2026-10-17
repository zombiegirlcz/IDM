package e11;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f121845a;

    static {
        int[] iArr = new int[f11.a.values().length];
        try {
            iArr[f11.a.INELIGIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f11.a.READY_TO_CLAIM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f11.a.MAINTAIN_BALANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f11.a.REWARD_ACTIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f121845a = iArr;
    }
}
