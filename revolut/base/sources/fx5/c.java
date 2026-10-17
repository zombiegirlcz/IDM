package fx5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.select.CryptoCommodityBuyCollectionSelectCryptoScreen;
import dv5.p;
import fs2.k;
import fwf.n;
import ip0.qd0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoCommodityBuyCollectionSelectCryptoScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CryptoCommodityBuyCollectionSelectCryptoScreen cryptoCommodityBuyCollectionSelectCryptoScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoCommodityBuyCollectionSelectCryptoScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ?? r06 = this.v.Y;
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String str = model.f53304a;
        qd0 selectedState = model.f53306c;
        if (Intrinsics.f(str, "SELECT_ALL_CRYPTOS_LIST_ID")) {
            i iVar = (i) ((g) r06.getValue());
            iVar.getClass();
            Intrinsics.checkNotNullParameter(selectedState, "selectedState");
            if (selectedState == qd0.SELECTED) {
                iVar.x2(new n(4));
            } else {
                iVar.x2(new k(iVar, 19));
            }
            a2 a2Var = iVar.f138744r;
            if (a2Var != null) {
                a2Var.f(null);
            }
            iVar.y2();
        } else {
            g gVar = (g) r06.getValue();
            RowDelegate.Model innerItem = (RowDelegate.Model) model.f53305b;
            i iVar2 = (i) gVar;
            iVar2.getClass();
            Intrinsics.checkNotNullParameter(selectedState, "selectedState");
            Intrinsics.checkNotNullParameter(innerItem, "innerItem");
            Object obj3 = innerItem.u;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
            xi0.b bVar = (xi0.b) obj3;
            if (selectedState == qd0.SELECTED) {
                iVar2.x2(new p(18, bVar));
            } else {
                iVar2.x2(new p(19, bVar));
            }
            a2 a2Var2 = iVar2.f138744r;
            if (a2Var2 != null) {
                a2Var2.f(null);
            }
            iVar2.y2();
        }
        return Unit.f186387a;
    }
}
