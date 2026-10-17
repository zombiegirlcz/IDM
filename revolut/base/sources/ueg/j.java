package ueg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f279393a;

    static {
        int[] iArr = new int[cr0.h.values().length];
        try {
            iArr[cr0.h.EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cr0.h.COLLAPSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cr0.h.HIDDEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[cr0.h.ANCHORED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[cr0.h.DRAGGING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[cr0.h.SETTLING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f279393a = iArr;
    }
}
