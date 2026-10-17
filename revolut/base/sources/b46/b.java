package b46;

import kyh.g;
import wd6.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f12185b;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f12184a = iArr;
        int[] iArr2 = new int[e.values().length];
        try {
            iArr2[e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f12185b = iArr2;
    }
}
