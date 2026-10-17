package xyh;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.exchange.models.TakeProfitStopLoss;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderPocketInfo;
import com.revolut.feature_crypto_order_flow.impl.exchange.extensions.dialog.OrderTypeDialogContract$Input;
import com.revolut.feature_crypto_order_flow.impl.exchange.extensions.dialog.OrderTypeDialogController;
import com.revolut.kompot.common.ModalDestination;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.t0;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ t v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, Continuation continuation) {
        super(2, continuation);
        this.v = tVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new r(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objZ;
        boolean z;
        boolean z3;
        TakeProfitStopLoss takeProfitStopLoss;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        t tVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            t0 t0VarO2 = ((com.revolut.feature_crypto_order_flow.impl.exchange.d) tVar.f309741m).O2();
            this.u = 1;
            objZ = vkm.q.z(t0VarO2, this);
            if (objZ == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objZ = obj2;
        }
        CryptoOrderDraft cryptoOrderDraft = (CryptoOrderDraft) objZ;
        if (cryptoOrderDraft == null) {
            return Unit.f186387a;
        }
        CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails = cryptoOrderDraft.f96690b;
        wd6.e eVar = cryptoOrderDraft.e;
        Boolean bool = (Boolean) tVar.f309742n.a().e();
        boolean z4 = eVar == wd6.e.BUY;
        boolean zC = oyh.b.c(cryptoExchangeContract$MoneyDetails.e);
        boolean z6 = !zC && cp5.d.A(cryptoExchangeContract$MoneyDetails.f96683a) && z4 && bool.booleanValue();
        int[] iArr = q.f309737a;
        int i2 = iArr[eVar.ordinal()];
        if (i2 == 1) {
            z = false;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z = true;
        }
        boolean zB3 = t.b3(tVar, cryptoOrderDraft, zC);
        if (zC) {
            z3 = false;
        } else {
            int i3 = iArr[eVar.ordinal()];
            if (i3 == 1) {
                if (Intrinsics.f(oyh.b.b(cryptoExchangeContract$MoneyDetails.e), AccountId.Personal.f51414a)) {
                    Set set = t.f309739q;
                    CryptoOrderPocketInfo cryptoOrderPocketInfo = cryptoOrderDraft.f96696m;
                    if (d0.T(set, cryptoOrderPocketInfo != null ? cryptoOrderPocketInfo.f96705c : null)) {
                    }
                }
                z3 = false;
            } else if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z3 = true;
        }
        tVar.N2(new OrderTypeDialogController(new OrderTypeDialogContract$Input(cryptoOrderDraft.f, z, z4, z6, zB3, zB3 && (takeProfitStopLoss = cryptoOrderDraft.f96697n) != null && takeProfitStopLoss.f72159a, z3)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new xw9.c(tVar, 21));
        return Unit.f186387a;
    }
}
