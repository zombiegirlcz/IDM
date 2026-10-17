package ke7;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f183014a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.Mute.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.AudioOutput.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.Chat.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e.End.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f183014a = iArr;
    }
}
