package e4k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class n0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2k.f f122622b;

    public /* synthetic */ n0(y2k.f fVar, int i) {
        this.f122621a = i;
        this.f122622b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        BankTransferData updateTransferData = (BankTransferData) obj2;
        switch (this.f122621a) {
            case 0:
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                break;
            default:
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                break;
        }
        return BankTransferData.a(updateTransferData, 0L, null, null, null, ((y2k.g) this.f122622b).f310674a, null, null, null, null, null, null, null, null, 1048543);
    }
}
