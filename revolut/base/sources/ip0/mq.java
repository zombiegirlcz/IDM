package ip0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class mq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f165414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f165415b;

    static {
        int[] iArr = new int[jq.values().length];
        try {
            iArr[jq.POSITIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jq.NEGATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f165414a = iArr;
        int[] iArr2 = new int[iq.values().length];
        try {
            iArr2[iq.RADIO_BUTTON.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[iq.CHECK_BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f165415b = iArr2;
    }
}
