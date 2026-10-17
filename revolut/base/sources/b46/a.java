package b46;

import kyh.g;
import wd6.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f12183b;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f12182a = iArr;
        int[] iArr2 = new int[g.values().length];
        try {
            iArr2[g.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[g.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f12183b = iArr2;
    }
}
