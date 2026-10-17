package xw5;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.CryptoCommodityBuyCollectionFlow;
import com.revolut.feature.wealth.api.domain.model.collectionquote.CollectionQuoteFeeBreakdown;
import gim.i;
import ip0.ck0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import rp0.l;
import rp0.t;
import rp0.y;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoCommodityBuyCollectionFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CryptoCommodityBuyCollectionFlow cryptoCommodityBuyCollectionFlow, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoCommodityBuyCollectionFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.T.getValue();
        String listId = model.f51832a;
        Object obj3 = model.o;
        com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.a aVar2 = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.a) dVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (a0.H(listId, "FEE_BREAKDOWN_CELL_", false)) {
            CollectionQuoteFeeBreakdown collectionQuoteFeeBreakdown = obj3 instanceof CollectionQuoteFeeBreakdown ? (CollectionQuoteFeeBreakdown) obj3 : null;
            if (collectionQuoteFeeBreakdown == null) {
                throw new IllegalStateException("Fee breakdown dialog parcel is not a CollectionQuoteFeeBreakdown");
            }
            j60.a aVar3 = aVar2.f71534t;
            vw5.a aVar4 = aVar2.u;
            String title = collectionQuoteFeeBreakdown.f95271a;
            String description = collectionQuoteFeeBreakdown.f95273c;
            aVar4.getClass();
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            aVar3.x(new y(u.c(new TextDelegate.Model("CRYPTO_EXCHANGE_DIALOG_TEXT_ID", new TextClause(description, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ck0(0), null, null, 0, 0, 0, 0, 2032)), new t(new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 30), l.WINDOW, null, "CRYPTO_EXCHANGE_DIALOG_ID", null, 984));
        }
        return Unit.f186387a;
    }
}
