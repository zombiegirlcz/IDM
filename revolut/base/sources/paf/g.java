package paf;

import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferOutCreate;
import com.revolut.feature.trading.transfer.investments.api.navigation.TransferOutFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TradingAccount.GIA f234556w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.d dVar, TradingAccount.GIA gia, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f234556w = gia;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, this.f234556w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        TradingAccount.GIA gia = this.f234556w;
        com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            o9f.i iVar = dVar.f91623r;
            String string = gia.f105181a.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            this.u = 1;
            h9f.b bVar = iVar.f223268a;
            bVar.getClass();
            h54.o oVar = new h54.o(bVar, string, null, 9);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(elm.f.f127540b, oVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        u8f.h hVar = ((TransferOutCreate) obj2).f91513a;
        if (hVar != null) {
            return dVar.C1(u0.b(gc0.c.f(new TransferOutFeatureConfig.TransferOut(hVar, gia.f105181a.toString()))));
        }
        hx7.e.n(new IllegalStateException("New Transfer Out create requested but transfer type is unknown!"));
        dVar.L2();
        return Unit.f186387a;
    }
}
