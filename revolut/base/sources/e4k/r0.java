package e4k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class r0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kq2.c f122631b;

    public /* synthetic */ r0(kq2.c cVar, int i) {
        this.f122630a = i;
        this.f122631b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f122630a) {
            case 0:
                BankTransferData updateTransferData = (BankTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                return BankTransferData.a(updateTransferData, 0L, null, null, null, null, null, null, this.f122631b, null, null, null, null, null, 1047551);
            default:
                RemittanceTransferData updateTransferData2 = (RemittanceTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData2, "$this$updateTransferData");
                return RemittanceTransferData.a(updateTransferData2, 0L, null, null, null, null, null, null, null, null, this.f122631b, null, 7167);
        }
    }
}
