package bof;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.transactions.impl.model.FeeBreakdownNavigation;
import com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.crypto.card.linked_transaction.LinkedTransactionScreen;
import com.revolut.feature_market_data_api.navigation.HistoricFeeBreakdownFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LinkedTransactionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LinkedTransactionScreen linkedTransactionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = linkedTransactionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f51781a;
        int iHashCode = str.hashCode();
        LinkedTransactionScreen linkedTransactionScreen = this.v;
        if (iHashCode != -1710795474) {
            if (iHashCode != -120246419) {
                if (iHashCode == 153880855 && str.equals("ID_EXTRAS_STATEMENT")) {
                    q qVar = (q) linkedTransactionScreen.d();
                    qVar.getClass();
                    qVar.n2(new k(1, qVar, null), new whi.b(6));
                }
            } else if (str.equals("ID_EXTRAS_CONFIRMATION")) {
                q qVar2 = (q) linkedTransactionScreen.d();
                qVar2.getClass();
                qVar2.n2(new k(0, qVar2, null), new whi.b(6));
            }
        } else if (str.equals("ID_EXTRAS_FEE")) {
            Object obj3 = model.f51787l;
            FeeBreakdownNavigation feeNavigation = obj3 instanceof FeeBreakdownNavigation ? (FeeBreakdownNavigation) obj3 : null;
            if (feeNavigation != null) {
                q qVar3 = (q) linkedTransactionScreen.d();
                qVar3.getClass();
                Intrinsics.checkNotNullParameter(feeNavigation, "feeNavigation");
                a3 a3Var = feeNavigation.f92037a;
                String str2 = a3Var.f272600m;
                if (str2 != null) {
                    ChargeBreakdown chargeBreakdown = feeNavigation.f92038b;
                    qVar3.f17420p.getClass();
                    z3i.b bVarR = kye.e.r(a3Var);
                    c4i.a aVar2 = c4i.a.EXCHANGE;
                    xi0.b bVar = feeNavigation.f92039c;
                    boolean z = feeNavigation.d;
                    k9 value = k9.Crypto;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    Intrinsics.checkNotNullParameter(value, "value");
                    qVar3.C1(u0.b(new FeatureCommand(new HistoricFeeBreakdownFeatureConfig(chargeBreakdown, str2, bVarR, bVar, z, false, aVar2, new AnalyticsProduct.Retail(value), 288))));
                }
            }
        }
        return Unit.f186387a;
    }
}
