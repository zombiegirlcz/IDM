package lpe;

import com.revolut.feature.tax_residency.api.BackNavigationType;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f198993a;

    static {
        int[] iArr = new int[BackNavigationType.values().length];
        try {
            iArr[BackNavigationType.BACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BackNavigationType.CROSS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BackNavigationType.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f198993a = iArr;
    }
}
