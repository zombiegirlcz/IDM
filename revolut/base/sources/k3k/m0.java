package k3k;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.payments.bank_transfer.api.PaymentsBankTransferApi$FeatureToggles;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$string;
import com.revolut.retail.feature.payments.bank_transfer.impl.common.RemittanceRoutesException;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class m0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t0 f180781w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(t0 t0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f180781w = t0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m0 m0Var = new m0(this.f180781w, continuation, 0);
                m0Var.v = obj2;
                return m0Var;
            default:
                m0 m0Var2 = new m0(this.f180781w, continuation, 1);
                m0Var2.v = obj2;
                return m0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m0) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        kq2.e eVar;
        TextLocalisedClause textLocalisedClause;
        int i = 14;
        switch (this.u) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar = (x) pair.f186385a;
                RemittanceTransferData remittanceTransferData = (RemittanceTransferData) pair.f186386b;
                e3k.d dVar = xVar.f180807b;
                ?? r62 = 0;
                r62 = 0;
                e3k.c cVar = dVar instanceof e3k.c ? (e3k.c) dVar : null;
                t0 t0Var = this.f180781w;
                if (cVar != null) {
                    RemittanceRoutesException remittanceRoutesException = cVar.f122338a;
                    if (Intrinsics.f(remittanceRoutesException, RemittanceRoutesException.NoRoutesAvailable.f101991a)) {
                        textLocalisedClause = new TextLocalisedClause(R$string.remittance_error_no_routes_title, null, null, 14);
                    } else {
                        if (!Intrinsics.f(remittanceRoutesException, RemittanceRoutesException.CurrencyNotSupported1502.f101990a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause = new TextLocalisedClause(com.revolut.core.strings_provider.R$string.error_api_1502, null, null, 14);
                    }
                    yji.l.a1(t0Var, t0Var.X1(new y0("ROUTE_ERROR_STATUS_DIALOG_ID", new nii.z(textLocalisedClause, null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4)), null, null, new k22.c(t0Var, r62, 3), 3);
                }
                if (xVar.a().size() == 1) {
                    r62 = ((kq2.e) zhm.d0.b0(xVar.a())).f188300a;
                } else if (remittanceTransferData.k != null) {
                    r62 = t0Var.A2().k;
                } else if (((jte.d) t0Var.D).c(PaymentsBankTransferApi$FeatureToggles.ChargeBearerPreselection.f101894c) && (eVar = (kq2.e) zhm.d0.d0(xVar.a())) != null) {
                    r62 = eVar.f188300a;
                }
                t0Var.x2(new k1.a(r62, xVar, 12));
                return Unit.f186387a;
            default:
                xi0.b bVar = (xi0.b) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t0 t0Var2 = this.f180781w;
                t0Var2.x2(new k1.a(t0Var2, bVar, i));
                return Unit.f186387a;
        }
    }
}
