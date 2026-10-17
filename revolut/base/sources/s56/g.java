package s56;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.defi.remittances.impl.ui.send.amount.DeFiSendAmountScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ DeFiSendAmountScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DeFiSendAmountScreen deFiSendAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.u = deFiSendAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.defi.remittances.impl.ui.send.amount.b bVar = (com.revolut.feature.defi.remittances.impl.ui.send.amount.b) this.u.d();
        cli.y yVar = bVar.z;
        DeFiBalance deFiBalance = ((o) ((j2) yVar.f22677a).getValue()).f259975h;
        Continuation continuation = null;
        if (deFiBalance == null) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "DeFiSendAmountScreenModel", "Pocket clicked without assetInBalance value", null, h0Var);
        } else {
            DeFiAssetDetails deFiAssetDetails = ((o) ((j2) yVar.f22677a).getValue()).f259974g;
            if (deFiAssetDetails == null) {
                zhm.h0 h0Var2 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "DeFiSendAmountScreenModel", "Pocket clicked without assetOut value", null, h0Var2);
            } else {
                bVar.n2(new rhl.b(bVar, deFiBalance, deFiAssetDetails, continuation, 16), new whi.b(6));
            }
        }
        return Unit.f186387a;
    }
}
