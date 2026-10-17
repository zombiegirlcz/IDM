package s5l;

import o5l.f;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f260101a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.DELIVERED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.POSTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.IN_REVIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f.ORDERED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f260101a = iArr;
    }
}
