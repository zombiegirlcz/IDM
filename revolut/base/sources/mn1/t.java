package mn1;

import com.revolut.feature.apm.bills.core.api.model.search.boleto.BillBoletoAliasType;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f207350a;

    static {
        int[] iArr = new int[BillBoletoAliasType.values().length];
        try {
            iArr[BillBoletoAliasType.CNPJ.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BillBoletoAliasType.CPF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f207350a = iArr;
    }
}
