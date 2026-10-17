package aig;

import android.os.Parcelable;
import com.google.android.gms.wallet.WalletConstants;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.miles.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.am;
import ip0.zj;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fub.k f5275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zjh.j f5276b;

    public r(fub.k revPointsTransactionMapper, ugg.b airlinesWithWaysToRedeemListItemMapper, zjh.j legalEntityDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(revPointsTransactionMapper, "revPointsTransactionMapper");
        Intrinsics.checkNotNullParameter(airlinesWithWaysToRedeemListItemMapper, "airlinesWithWaysToRedeemListItemMapper");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        this.f5275a = revPointsTransactionMapper;
        this.f5276b = legalEntityDisclaimerMapper;
    }

    public static List a(List list, ListSubheaderDelegate.Model model) {
        List list2 = (List) ue0.e.M(list);
        return list2 != null ? yp0.b.g(list2, model, null, 0, 0, 126) : f0.f322471a;
    }

    public static ListSubheaderDelegate.Model b() {
        return new ListSubheaderDelegate.Model("AIRLINES_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.miles_home_section_all_airlines_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
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
        char c2;
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        List listC2 = u.c(new SearchButtonDelegate.Model("SEARCH_ITEM_ID", new TextLocalisedClause(R$string.miles_home_search_bar_placeholder, null, null, 14), null, R$attr.uikit_dp8, R$attr.uikit_dp16, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION));
        HeroBannerDelegate.Model model = new HeroBannerDelegate.Model("DISCOVER_BANNER_ITEM_ID", (Clause) new TextLocalisedClause(R$string.miles_home_section_discover_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.miles_home_section_discover_subtitle, null, null, 14), (Media) new CdnImage("discover_banner", "mobile/miles/discover_banner", null, null, null, null, Constants.TAG_FC_SPEED_MODE), (HeroBannerDelegate.b) null, false, am.AUTO, (Object) null, (AnalyticsContext) null, 1904);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        boolean z = domainState.e;
        Data data = domainState.f;
        if (z) {
            model = null;
        }
        List listL = v.l(model);
        Data data2 = domainState.f5262a;
        Data data3 = domainState.f5263b;
        Data data4 = domainState.f5264c;
        boolean z3 = domainState.d;
        int i = 0;
        boolean z4 = data.getContent() != null;
        if ((e(data3) || e(data2)) && e(data4)) {
            listC = u.c(d("ERROR_COMBINED_ITEM_ID"));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            c2 = 1;
        } else {
            c2 = 1;
            List list = (List) iii.c.f(t1.t(data2, data3), new agh.h(this, 29), new ah1.p(this, 9), new p(z4, this, z3, i));
            List list2 = (List) ue0.e.M((Collection) iii.c.f(data4, new agh.h(this, 28), new ah1.p(this, 8), new a2f.q(this, 13)));
            listC = d0.E0(list2 != null ? yp0.b.g(list2, new ListSubheaderDelegate.Model("TRANSACTIONS_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.miles_home_section_transactions_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126) : f0.f322471a, list);
        }
        List[] elements = new List[3];
        elements[0] = listC2;
        elements[c2] = listL;
        elements[2] = listC;
        Intrinsics.checkNotNullParameter(elements, "elements");
        eVarB.addAll(w.u(kotlin.collections.d.L(elements)));
        qv0.i iVar = (qv0.i) data.getContent();
        if (iVar != null) {
            eVarB.add(iVar);
        }
        eVarB.addAll(zjh.j.v(this.f5276b, domainState.f5265g));
        return new k(u.a(eVarB));
    }
}
