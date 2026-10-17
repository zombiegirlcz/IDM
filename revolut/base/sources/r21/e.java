package r21;

import com.revolut.domain.models.beneficiary.BeneficiarySortingStrategy;
import tof.i;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f251033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f251034b;

    static {
        int[] iArr = new int[BeneficiarySortingStrategy.values().length];
        try {
            iArr[BeneficiarySortingStrategy.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BeneficiarySortingStrategy.NO_SORTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f251033a = iArr;
        int[] iArr2 = new int[i.values().length];
        try {
            iArr2[i.PAYID_ALIAS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[i.SPIN_ALIAS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[i.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f251034b = iArr2;
    }
}
