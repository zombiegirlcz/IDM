package bdk;

import xck.o;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f14618a;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.MILESTONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.MONTHLY_DRAW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f14618a = iArr;
    }
}
