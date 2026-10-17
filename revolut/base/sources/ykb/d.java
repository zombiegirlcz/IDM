package ykb;

import ncd.k;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f314603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f314604b;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.EFFECTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f314603a = iArr;
        int[] iArr2 = new int[com.revolut.feature.shared.savings.models.product.e.values().length];
        try {
            iArr2[com.revolut.feature.shared.savings.models.product.e.ONCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[com.revolut.feature.shared.savings.models.product.e.EVERY_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[com.revolut.feature.shared.savings.models.product.e.EVERY_WORKING_DAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        f314604b = iArr2;
    }
}
