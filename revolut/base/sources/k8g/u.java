package k8g;

import a83.w0;
import android.os.Parcelable;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.f2;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.hotel.transfers.api.R$string;
import com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.TravelHotelTransfersHomeScreenContract$InputData;
import com.youTransactor.uCube.rpc.Constants;
import ip0.am;
import ip0.zj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class u implements cli.n {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelTransfersHomeScreenContract$InputData f182152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fub.k f182153b;

    public u(TravelHotelTransfersHomeScreenContract$InputData inputData, a agentListItemMapper, fub.k revPointsTransactionMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(agentListItemMapper, "agentListItemMapper");
        Intrinsics.checkNotNullParameter(revPointsTransactionMapper, "revPointsTransactionMapper");
        this.f182152a = inputData;
        this.f182153b = revPointsTransactionMapper;
    }

    public static List a(List list, ListSubheaderDelegate.Model model) {
        List list2 = (List) ue0.e.M(list);
        return list2 != null ? yp0.b.g(list2, model, null, 0, 0, 126) : f0.f322471a;
    }

    public static ListSubheaderDelegate.Model b() {
        return new ListSubheaderDelegate.Model("AGENTS_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.trade_rev_points_home_section_hotel_chains_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public static FullScreenStateDelegate.Model d(String str) {
        return new FullScreenStateDelegate.Model(str, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31684);
    }

    public static boolean e(Data data) {
        return (data.getLoading() || data.getContent() != null || data.getError() == null) ? false : true;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List listC;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = zhm.u.b();
        if (!domainState.f) {
            HeroBannerDelegate.Model model = new HeroBannerDelegate.Model("DISCOVER_BANNER_ITEM_ID", (Clause) new TextLocalisedClause(R$string.trade_rev_points_home_section_discover_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.trade_rev_points_home_section_discover_subtitle, null, null, 14), (Media) new CdnImage("discover_banner", "mobile/hotel_transfers/discover_banner", null, null, null, null, Constants.TAG_FC_SPEED_MODE), (HeroBannerDelegate.b) null, false, am.AUTO, (Object) null, (AnalyticsContext) null, 1904);
            yp0.b.r(model, 0, 0, 0, 0, 15);
            eVarB.add(model);
        }
        Data data = domainState.f182141a;
        Data data2 = domainState.f182142b;
        Data data3 = domainState.f182143c;
        boolean z = domainState.e;
        if ((e(data2) || e(data)) && e(data3)) {
            listC = zhm.u.c(d("ERROR_COMBINED_ITEM_ID"));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
        } else {
            List list = (List) iii.c.f(t1.t(data, data2), new k7c.d(this, 26), new k8d.s(this, 4), new w0(this, z, 7));
            List list2 = (List) ue0.e.M((Collection) iii.c.f(data3, new k7c.d(this, 25), new k8d.s(this, 3), new j75.i(this, 27)));
            ArrayList arrayListE0 = d0.E0(list2 != null ? yp0.b.g(list2, new ListSubheaderDelegate.Model("TRANSACTIONS_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.trade_rev_points.api.R$string.trade_rev_points_home_section_transactions_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126) : f0.f322471a, list);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trade_rev_points_home_section_learn_more_item_hotel_loyalty_programmes, null, null, 14);
            f2 f2Var = f2.INTERNAL;
            listC = d0.E0(yp0.b.g(v.k(new CellDetailsChevronDelegate.Model("FAQ_LOYALTY_PROGRAMME_ITEM_ID", textLocalisedClause, f2Var, 0, null, null, 2040), new CellDetailsChevronDelegate.Model("FAQ_ACCOUNT_LINKING_ITEM_ID", new TextLocalisedClause(R$string.trade_rev_points_home_section_learn_more_item_linking_account, null, null, 14), f2Var, 0, null, null, 2040)), new ListSubheaderDelegate.Model("FAQ_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.trade_rev_points.api.R$string.trade_rev_points_home_section_learn_more_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayListE0);
        }
        eVarB.addAll(listC);
        qv0.i iVar = (qv0.i) domainState.d.getContent();
        if (iVar != null) {
            eVarB.add(iVar);
        }
        return new n(zhm.u.a(eVarB), this.f182152a.f93602a);
    }
}
