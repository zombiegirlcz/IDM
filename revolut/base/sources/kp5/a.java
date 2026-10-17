package kp5;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.impl.ui.addcryptobeneficiary.flow.CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.h;
import od0.i;
import te0.w;
import up5.a0;
import up5.e;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f188170b;

    public /* synthetic */ a(c cVar, int i) {
        this.f188169a = i;
        this.f188170b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f188169a) {
            case 0:
                CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction action = (CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                c cVar = this.f188170b;
                pfm.a aVar = new pfm.a(cVar.f188173c.a(action.f71156a, action.f71157b, action.f71158c, action.d, action.e, action.i).g(sjg.a.a(cVar.f)), new km2.b(19, new a(cVar, 1)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar;
            default:
                CryptoAddress address = (CryptoAddress) obj2;
                Intrinsics.checkNotNullParameter(address, "addedAddress");
                a0 a0Var = (a0) this.f188170b.e;
                a0Var.getClass();
                Intrinsics.checkNotNullParameter(address, "address");
                e eVar = (e) a0Var.f281852b;
                te0.e eVarC0 = eVar.C0();
                h hVar = i.Companion;
                wk5.a aVar2 = address.f71063h;
                hVar.getClass();
                pfm.a aVarE = w.z0(eVarC0, h.a(aVar2)).e(w.A0(eVar.w0(), address.f71059a));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
        }
    }
}
