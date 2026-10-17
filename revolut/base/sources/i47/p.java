package i47;

import ip0.qd0;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f158306a;

    static {
        int[] iArr = new int[qd0.values().length];
        try {
            iArr[qd0.UNSELECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qd0.INDETERMINATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qd0.SELECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f158306a = iArr;
    }
}
