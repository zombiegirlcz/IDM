package zrc;

import vrc.i;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f324671a;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.TOP_TO_BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.BOTTOM_TO_TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f324671a = iArr;
    }
}
