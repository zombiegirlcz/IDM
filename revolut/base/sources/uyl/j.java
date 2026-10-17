package uyl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f284468a;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.EDITOR_HINT_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.EDITOR_HINT_ONLY_DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i.EDITOR_DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[i.EDITOR_ALPHANUMERIC.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[i.EDITOR_AMOUNT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[i.PICKER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[i.PICKER_SINGLE_ELEMENT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[i.EDITOR.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[i.PICKER_DISABLED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f284468a = iArr;
    }
}
