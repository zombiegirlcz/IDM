package ip0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class wd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f166990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f166991b;

    static {
        int[] iArr = new int[vd0.values().length];
        try {
            iArr[vd0.RADIO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vd0.CHECKBOX.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f166990a = iArr;
        int[] iArr2 = new int[qd0.values().length];
        try {
            iArr2[qd0.INDETERMINATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[qd0.SELECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[qd0.UNSELECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f166991b = iArr2;
    }
}
