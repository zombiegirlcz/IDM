package im3;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f162291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f162292b;

    static {
        int[] iArr = new int[iy9.a.values().length];
        try {
            iArr[iy9.a.TWO_FA_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[iy9.a.PEER_TO_PEER_CHAT_MESSAGING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f162291a = iArr;
        int[] iArr2 = new int[kbk.h.values().length];
        try {
            iArr2[kbk.h.ELIGIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[kbk.h.RECEIVER_PRIVACY_BLOCK.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[kbk.h.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f162292b = iArr2;
    }
}
