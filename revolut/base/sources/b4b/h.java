package b4b;

import aw0.n6;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.xe;
import com.revolut.core.ui_kit.delegates.ze;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import com.revolut.feature.retail.cfd.impl.R$string;
import com.revolut.feature.retail.cfd.impl.flows.order.CfdOrderData;
import com.revolut.feature.retail.cfd.impl.screens.order.v2.CfdOrderFormController;
import java.util.ArrayList;
import java.util.Set;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CfdOrderFormController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(CfdOrderFormController cfdOrderFormController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cfdOrderFormController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            case 1:
                return new h(this.v, continuation, 1);
            default:
                return new h(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((h) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        Clause clause;
        Object obj3;
        char c2;
        Clause clauseA;
        Object obj4;
        int i = this.u;
        Continuation continuation = null;
        CfdOrderFormController cfdOrderFormController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.retail.cfd.impl.screens.order.v2.a) cfdOrderFormController.k3()).B2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.cfd.impl.screens.order.v2.a aVar3 = (com.revolut.feature.retail.cfd.impl.screens.order.v2.a) cfdOrderFormController.k3();
                j60.a aVar4 = aVar3.B;
                z3b.g gVar = aVar3.C;
                cli.y yVar = aVar3.J;
                CfdOrderData cfdOrderData = ((n) ((j2) yVar.f22677a).getValue()).f12227a;
                Set availableOrderTypes = ((n) ((j2) yVar.f22677a).getValue()).f;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(cfdOrderData, "cfdOrderData");
                Intrinsics.checkNotNullParameter(availableOrderTypes, "availableOrderTypes");
                rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.wealth_margin_cfd_order_type, null, null, 14), null, null, 30);
                EnumEntries<e2b.a> enumEntriesA = e2b.a.a();
                ArrayList arrayList = new ArrayList(zhm.w.t(enumEntriesA, 10));
                for (e2b.a orderTypeToShow : enumEntriesA) {
                    z3b.h hVar = gVar.f319240b;
                    bfl.g tradeSide = cfdOrderData.f82169a;
                    String symbol = gVar.f319239a.f12237b.e;
                    boolean z = cfdOrderData.f82170b == orderTypeToShow;
                    boolean zContains = availableOrderTypes.contains(orderTypeToShow);
                    xul.n nVar = ((z3b.j) hVar).f319242a;
                    Intrinsics.checkNotNullParameter(orderTypeToShow, "orderTypeToShow");
                    Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
                    Intrinsics.checkNotNullParameter(symbol, "symbol");
                    r0 r0VarD = u2b.c.d(orderTypeToShow);
                    int i2 = z3b.i.f319241a[orderTypeToShow.ordinal()];
                    if (i2 == 1) {
                        str = "CFD_ORDER_TYPE_ITEM_MARKET";
                    } else if (i2 == 2) {
                        str = "CFD_ORDER_TYPE_ITEM_LIMIT";
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "CFD_ORDER_TYPE_ITEM_STOP";
                    }
                    RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(nVar.b(tradeSide, r0VarD), z ? new AccentCircleBadge(dw0.a.Checked) : null, null, false, null, false, 60);
                    Clause clauseC = nVar.c(r0VarD, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254));
                    if (zContains) {
                        clause = clauseC;
                        obj3 = null;
                        c2 = 14;
                        clauseA = nVar.a(r0VarD, tradeSide, symbol);
                    } else {
                        if (orderTypeToShow == e2b.a.MARKET) {
                            obj4 = null;
                            clauseA = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_type_selector_market_unavailable, null, null, 14);
                            clause = clauseC;
                            c2 = 14;
                        } else {
                            obj4 = null;
                            c2 = 14;
                            clause = clauseC;
                            clauseA = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_orders_type_selector_unavailable_symbol_description, zhm.u.c(symbol), null, 12);
                        }
                        obj3 = obj4;
                    }
                    arrayList.add(new RowDelegate.Model(str, image40, clause, null, 0, clauseA, null, null, 0, 0, null, zContains, z ? ze.f55694a : xe.f55602a, zContains ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a, null, null, null, null, null, null, orderTypeToShow, null, null, null, null, null, 0, 0, 0, 0, null, -4208680, 15));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                aVar4.x(new rp0.y(arrayList, tVar, rp0.l.WINDOW, null, null, null, 1016));
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.cfd.impl.screens.order.v2.a aVar6 = (com.revolut.feature.retail.cfd.impl.screens.order.v2.a) cfdOrderFormController.k3();
                MarginQuote marginQuote = (MarginQuote) ((n) ((j2) aVar6.J.f22677a).getValue()).d.getContent();
                if (marginQuote != null) {
                    aVar6.n2(new av7.l(aVar6, marginQuote, continuation, 8), new whi.b(6));
                }
                return Unit.f186387a;
        }
    }
}
