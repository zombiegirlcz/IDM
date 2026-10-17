package gs2;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreen$V2;
import com.revolut.feature.spending_analytics.impl.ui.rev10.travel.models.NoActiveTravelException;
import com.revolut.retail.feature.api.rewards_hub.R$string;
import com.revolut.retail.trading.core.domain.orders.InvestFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import ip0.ep;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.xk;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146304a;

    public /* synthetic */ t(int i) {
        this.f146304a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws NoActiveTravelException {
        int i = this.f146304a;
        od0.i iVar = od0.i.f224256b;
        switch (i) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return zhm.u.c(new pb0("ID_PAYTO_LOADING_ITEM"));
            case 1:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return zhm.u.c(new pb0("ID_DIRECT_DEBIT_EMPTY_ITEM"));
            case 2:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return zhm.u.c(new pb0("ID_MERCHANT_EMPTY_ITEM"));
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                gu guVar = new gu("ITEM_ID_SETTINGS_LOADING_HEADER", R$attr.uikit_dp16, R$attr.uikit_dp12, 24);
                pb0 pb0Var = new pb0("ITEM_ID_SETTINGS_LOADING_ROW");
                yp0.b.l(pb0Var, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
                return zhm.v.k(guVar, pb0Var);
            case 4:
                fr2.c content = (fr2.c) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                if (content instanceof FincrimeHomeScreen$V2) {
                    return (FincrimeHomeScreen$V2) content;
                }
                throw new IllegalStateException("Only API response v2.+ is supported for Voluntary Offboarding flow");
            case 5:
                od0.i it11 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                if (it11.d()) {
                    return (g0j.a) it11.c();
                }
                throw new NoActiveTravelException();
            case 6:
                Throwable it12 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 7:
                Function0 it13 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                aim.e eVarB = zhm.u.b();
                nb0 nb0Var = pb0.Companion;
                List listK = zhm.v.k(nb0.b(nb0Var, "LOADING_ROW_ID1", false, 0, false, 30), nb0.b(nb0Var, "LOADING_ROW_ID2", false, 0, false, 30), nb0.b(nb0Var, "LOADING_ROW_ID3", false, 0, false, 30), nb0.b(nb0Var, "LOADING_ROW_ID4", false, 0, false, 30));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB.addAll(listK);
                gu guVar2 = new gu("LIFESTYLE_SECTION_ID", 0, 0, 30);
                xk xkVar = new xk("LIFESTYLE_GRID_ID", zhm.v.k(new ep("LIFESTYLE_GRID_LOADING_ITEM_ID1"), new ep("LIFESTYLE_GRID_LOADING_ITEM_ID2"), new ep("LIFESTYLE_GRID_LOADING_ITEM_ID3"), new ep("LIFESTYLE_GRID_LOADING_ITEM_ID4")), null, null, null, 60);
                yp0.b.l(xkVar, 0, 0, 0, 0, null, false, 63);
                eVarB.addAll(zhm.v.k(guVar2, xkVar));
                return new gtd.h(zhm.u.a(eVarB), gtd.f.f146584a);
            case 8:
                return Float.valueOf(((gti.e) obj2).f146614a);
            case 9:
                Throwable th10 = (Throwable) obj2;
                Intrinsics.h(th10);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                return Unit.f186387a;
            case 10:
                Throwable it14 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 11:
                wi0.b it15 = (wi0.b) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Unit.f186387a;
            case 12:
                wi0.b it16 = (wi0.b) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Unit.f186387a;
            case 13:
                RecyclerView.ViewHolder it17 = (RecyclerView.ViewHolder) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Unit.f186387a;
            case 14:
                nrf.c it18 = (nrf.c) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                od0.h hVar = od0.i.Companion;
                hrf.b bVar = new hrf.b(it18);
                hVar.getClass();
                return od0.h.a(bVar);
            case 15:
                ybl.g it19 = (ybl.g) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Boolean.valueOf(it19.a(zhm.v.k(cfl.p.PRIVATE_MARKETS, cfl.p.PRIVATE_BANK)));
            case 16:
                InvestOrder order = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(order, "order");
                return Boolean.valueOf((order instanceof InvestFundOrder) && io3.h.l(((InvestFundOrder) order).d) && com.revolut.retail.trading.core.domain.orders.a.l(order));
            case 17:
                Function0 it20 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return null;
            case 18:
                Function0 it21 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return new guj.f(new TextLocalisedClause(R$string.rewards_hub_challenge_details_header_eligibility_link, null, null, 14), i2b.a.o(guj.g.a(0), guj.g.a(1)));
            case 19:
                cul.v it22 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                aul.b bVar2 = it22.d;
                if (bVar2 != null) {
                    return zi0.c.P(bVar2, false, null, 3);
                }
                return null;
            case 20:
                cul.v it23 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return it23.f109180j;
            case 21:
                cul.v it24 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return it24.H;
            case 22:
                cul.v it25 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return it25.f109180j;
            case 23:
                cul.v it26 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                aul.b bVar3 = it26.d;
                if (bVar3 != null) {
                    return zi0.c.P(bVar3, false, null, 3);
                }
                return null;
            case 24:
                cul.v it27 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                return it27.H;
            case 25:
                cul.v it28 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it28, "it");
                return it28.f109180j;
            case 26:
                cul.v it29 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it29, "it");
                return it29.f109184p;
            case 27:
                cul.v it30 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it30, "it");
                return it30.H;
            case 28:
                cul.v currentState = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(currentState, "currentState");
                Data data = currentState.f109180j;
                if (data == null) {
                    return zi0.c.P(Optional.empty(), false, null, 3);
                }
                try {
                    Object content2 = data.getContent();
                    return new Data(content2 != null ? Optional.of((xi0.b) content2) : null, data.getError(), data.getLoading());
                } catch (Throwable th11) {
                    return new Data(null, th11, data.getLoading());
                }
            default:
                cul.v it31 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it31, "it");
                return zi0.c.P(it31.f109176b, false, null, 3);
        }
    }

    public /* synthetic */ t(Object obj2, int i) {
        this.f146304a = i;
    }
}
