package cq8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f108032a;

    static {
        int[] iArr = new int[dp8.h.values().length];
        try {
            iArr[dp8.h.PLANNED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[dp8.h.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f108032a = iArr;
    }
}
