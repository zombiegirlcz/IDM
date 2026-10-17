package mae;

import com.revolut.domain.models.banktransfer.AccountFieldType;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f204032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f204033b;

    static {
        int[] iArr = new int[f5j.r.values().length];
        try {
            iArr[f5j.r.PAYID_ALIAS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f204032a = iArr;
        int[] iArr2 = new int[AccountFieldType.values().length];
        try {
            iArr2[AccountFieldType.SORT_CODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[AccountFieldType.IBAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[AccountFieldType.BSB.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        f204033b = iArr2;
    }
}
