package z2j;

import com.revolut.domain.models.beneficiary.BankFieldFormat;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f319092a;

    static {
        int[] iArr = new int[BankFieldFormat.values().length];
        try {
            iArr[BankFieldFormat.SPACE_EVERY_4.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BankFieldFormat.DASH_EVERY_2.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BankFieldFormat.INPUT_MASK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BankFieldFormat.DROPDOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f319092a = iArr;
    }
}
