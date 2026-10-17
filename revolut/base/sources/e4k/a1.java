package e4k;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.payments.bank_transfer.api.PaymentsBankTransferApi$FeatureToggles;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$string;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.extensions.AvailableTypesErrorHandlerExtension$ErrorType;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.n1;
import rp0.d2;

/* JADX INFO: loaded from: classes11.dex */
public final class a1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a f122571w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(int i, com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f122571w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a1 a1Var = new a1(0, this.f122571w, continuation);
                a1Var.v = obj2;
                return a1Var;
            case 1:
                a1 a1Var2 = new a1(1, this.f122571w, continuation);
                a1Var2.v = obj2;
                return a1Var2;
            case 2:
                a1 a1Var3 = new a1(2, this.f122571w, continuation);
                a1Var3.v = obj2;
                return a1Var3;
            default:
                a1 a1Var4 = new a1(3, this.f122571w, continuation);
                a1Var4.v = obj2;
                return a1Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a1) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((a1) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((a1) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a1) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        kq2.e eVar;
        int i = this.u;
        com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar = this.f122571w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.x2(new e1.b((Map) pair.f186385a, (krf.a) pair.f186386b, 19));
                break;
            case 1:
                String str = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(str);
                aVar.C1(new BridgeDestination(new FeatureCommand(new WebViewFeatureConfig(str, null, 0, false, true, false, 114590))));
                break;
            case 2:
                Pair pair2 = (Pair) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVar = (z) pair2.f186385a;
                BankTransferData bankTransferData = (BankTransferData) pair2.f186386b;
                Exception exception = zVar.i;
                kq2.c cVar = null;
                com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar5 = this.f122571w;
                if (exception != null) {
                    aVar5.F.R();
                    g4k.i0 i0Var = (g4k.i0) aVar5.B;
                    i0Var.getClass();
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    ServerError serverErrorA = i0Var.f140557m.a(exception);
                    if (serverErrorA != null && serverErrorA.f51362a == 4107) {
                        i0Var.f140558n.x(rp0.d0.d(new TextLocalisedClause(R$string.payments_transfer_missing_fiscal_code_bottom_sheet_title, null, null, 14), new TextLocalisedClause(R$string.payments_transfer_missing_fiscal_code_bottom_sheet_subtitle, null, null, 14), new d2("CTA_ADD_ID", new TextLocalisedClause(R$string.payments_transfer_missing_fiscal_code_bottom_sheet_action_add, null, null, 14), null, 60), new d2("CTA_CANCEL_ID", new TextLocalisedClause(R$string.payments_transfer_missing_fiscal_code_bottom_sheet_action_cancel, null, null, 14), null, 60), null, 112));
                    }
                }
                kq2.f fVar = zVar.f122656b;
                List list = fVar != null ? fVar.f188309m : null;
                if (list != null && list.size() == 1) {
                    cVar = ((kq2.e) zhm.d0.b0(list)).f188300a;
                } else if (bankTransferData.k != null) {
                    cVar = aVar5.G2().k;
                } else if (((jte.d) aVar5.C).c(PaymentsBankTransferApi$FeatureToggles.ChargeBearerPreselection.f101894c) && list != null && (eVar = (kq2.e) zhm.d0.d0(list)) != null) {
                    cVar = eVar.f188300a;
                }
                aVar5.x2(new dqd.a(zVar, aVar5, bankTransferData, cVar, 1));
                break;
            default:
                n1 n1Var = (n1) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.F.Q();
                if (n1Var.a().a() == AvailableTypesErrorHandlerExtension$ErrorType.WITHDRAWAL_COOLDOWN) {
                    aVar.v2(d0.f122584a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
