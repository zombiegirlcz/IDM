package ww4;

import vl4.k;
import vl4.t;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f300609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f300610b;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.AUTO_PAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.REPAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f300609a = iArr;
        int[] iArr2 = new int[t.values().length];
        try {
            iArr2[t.ARROW_UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f300610b = iArr2;
    }
}
