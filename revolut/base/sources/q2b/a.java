package q2b;

import bfl.g;
import k4l.n0;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f241557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f241558b;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f241557a = iArr;
        int[] iArr2 = new int[n0.values().length];
        try {
            iArr2[n0.TAKE_PROFIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[n0.STOP_LOSS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f241558b = iArr2;
    }
}
