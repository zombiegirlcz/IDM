package e4k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class p0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g4k.c0 f122626b;

    public /* synthetic */ p0(g4k.c0 c0Var, int i) {
        this.f122625a = i;
        this.f122626b = c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f122625a) {
            case 0:
                x updateState = (x) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return x.a(updateState, this.f122626b.f140540a, null, null, 0, null, null, null, false, 1022);
            case 1:
                BankTransferData updateTransferData = (BankTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                return this.f122626b.f140541b;
            case 2:
                return x.a((x) obj2, this.f122626b.f140540a, null, null, 0, null, null, null, false, 1022);
            default:
                return this.f122626b.f140541b;
        }
    }
}
