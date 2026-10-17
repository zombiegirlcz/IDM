package ueg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f279415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f279416b;

    static {
        int[] iArr = new int[g0.values().length];
        try {
            iArr[g0.UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g0.DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f279415a = iArr;
        int[] iArr2 = new int[cr0.h.values().length];
        try {
            iArr2[cr0.h.EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[cr0.h.COLLAPSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[cr0.h.ANCHORED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[cr0.h.HIDDEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[cr0.h.DRAGGING.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[cr0.h.SETTLING.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        f279416b = iArr2;
    }
}
