package wvg;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.delegates.e9;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.ManageEcommercePluginFlowContract$State;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesInfo;
import com.revolut.feature.wealth.analytics.data.repositories.complex_analytics.model.TotalValueChartFacade;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_items.AddKeyStatsViewItemsScreen;
import ip0.gu;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300466a;

    public /* synthetic */ r1(int i) {
        this.f300466a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f300466a) {
            case 0:
                TotalValueChartFacade totalValueChartFacade = ((xvg.b) obj2).f309264a;
                if (totalValueChartFacade != null) {
                    return x1.g(totalValueChartFacade);
                }
                return null;
            case 1:
                TotalValueChartFacade totalValueChartFacade2 = ((xvg.b) obj2).f309264a;
                if (totalValueChartFacade2 != null) {
                    return x1.h(totalValueChartFacade2);
                }
                return null;
            case 2:
                TotalValueChartFacade totalValueChartFacade3 = ((xvg.b) obj2).f309264a;
                if (totalValueChartFacade3 != null) {
                    return x1.h(totalValueChartFacade3);
                }
                return null;
            case 3:
                TotalValueChartFacade totalValueChartFacade4 = ((xvg.b) obj2).f309264a;
                if (totalValueChartFacade4 != null) {
                    return x1.g(totalValueChartFacade4);
                }
                return null;
            case 4:
                String str = (String) obj2;
                KProperty[] kPropertyArr = AddKeyStatsViewItemsScreen.T;
                return prk.o.m(str, "it", str, "LIST_ID_CLEAR_ALL");
            case 5:
                return null;
            case 6:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 7:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new ManageEcommercePluginFlowContract$State((Set) pair.f186386b, (Set) pair.f186385a);
            case 8:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                pb0 pb0Var = new pb0("loading_ADDRESS_ROW_ITEM_ID");
                yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                e9 e9Var = new e9("loading_MAP_ITEM_ID", zhm.f0.f322471a, false, null, 506);
                yp0.b.l(e9Var, 0, 0, 0, 0, null, false, 63);
                return new ww8.j(new TextLocalisedClause(R$string.kyc_poa_confirm_address_new_subtitle, null, null, 14), new TextLocalisedClause(R$string.kyc_poa_confirm_address_new_title, null, null, 14), new TextLocalisedClause(R$string.kyc_poa_confirm_address_button, null, null, 14), zhm.v.k(pb0Var, e9Var), false);
            case 9:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return zhm.f0.f322471a;
            case 10:
                wx0.b it10 = (wx0.b) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.j();
            case 11:
                wx0.b it11 = (wx0.b) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f();
            case 12:
                wx0.b it12 = (wx0.b) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.a();
            case 13:
                wx0.b it13 = (wx0.b) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.k();
            case 14:
                h93.f0 card = (h93.f0) obj2;
                Intrinsics.checkNotNullParameter(card, "card");
                return Boolean.valueOf(card.T && !card.d);
            case 15:
                h93.f0 card2 = (h93.f0) obj2;
                Intrinsics.checkNotNullParameter(card2, "card");
                return Boolean.valueOf(card2.U && !card2.d);
            case 16:
                h93.f0 card3 = (h93.f0) obj2;
                Intrinsics.checkNotNullParameter(card3, "card");
                return Boolean.valueOf(card3.V && !card3.d);
            case 17:
                h93.f0 card4 = (h93.f0) obj2;
                Intrinsics.checkNotNullParameter(card4, "card");
                return Boolean.valueOf(card4.W && !card4.d);
            case 18:
                wx6.h update = (wx6.h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return wx6.h.a(update, null, !update.f300761b, null, 5);
            case 19:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 20:
                Data it14 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                od0.h hVar = od0.i.Companion;
                Object content = it14.getContent();
                hVar.getClass();
                return od0.h.a(content);
            case 21:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                Data data = (Data) pair2.f186385a;
                od0.i iVar = (od0.i) pair2.f186386b;
                try {
                    Object content2 = data.getContent();
                    return new Data(content2 != null ? new Pair((List) content2, iVar) : null, data.getError(), data.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, data.getLoading());
                }
            case 22:
                List it15 = (List) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return zi0.c.P(it15, false, null, 2);
            case 23:
                Function0 it16 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                aim.e eVarB = zhm.u.b();
                eVarB.add(new gu("ID_LOADING_ACCOUNT_DETAILS_SECTION_HEADER", 0, 0, 30));
                eVarB.addAll(wxe.h0.b());
                return new wxe.e0(wxe.c0.f300899a, zhm.u.a(eVarB));
            case 24:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM travel_booking").step();
                    return null;
                } finally {
                }
            case 25:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM travel_favorite").step();
                    return null;
                } finally {
                }
            case 26:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM travel_favorite");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "image");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new oxf.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4)));
                        break;
                    }
                    return arrayList;
                } finally {
                }
            case 27:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM travel_trip").step();
                    return null;
                } finally {
                }
            case 28:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return zhm.d0.E0(((ActiveOrPastInvitesInfo) pair3.f186386b).f81705a, ((ActiveOrPastInvitesInfo) pair3.f186385a).f81705a);
            default:
                ActiveOrPastInvitesInfo it17 = (ActiveOrPastInvitesInfo) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f81705a;
        }
    }

    public /* synthetic */ r1(Object obj2, int i) {
        this.f300466a = i;
    }
}
