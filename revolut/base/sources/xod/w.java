package xod;

import aw0.l2;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f307827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f307828b;

    static {
        int[] iArr = new int[l2.values().length];
        try {
            iArr[l2.GREATER_VALUE_GREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l2.GREATER_VALUE_RED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f307827a = iArr;
        int[] iArr2 = new int[v.values().length];
        try {
            iArr2[v.ARROW_UP_ON_INCREASE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[v.ARROW_DOWN_ON_INCREASE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f307828b = iArr2;
    }
}
