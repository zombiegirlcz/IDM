package kjd;

import mx0.u9;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f184398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f184399b;

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
            iArr[cr0.h.ANCHORED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[cr0.h.DRAGGING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f184398a = iArr;
        int[] iArr2 = new int[u9.values().length];
        try {
            iArr2[u9.REASON_GESTURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[u9.REASON_DEVELOPER_ANIMATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f184399b = iArr2;
    }
}
