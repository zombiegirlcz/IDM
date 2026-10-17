package v3e;

import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.external_accounts.api.navigation.LinkSuccessDestination;
import com.revolut.feature.external_accounts.models.ExternalAccountTopupPayload;
import com.revolut.feature.insurance_embedded.api.navigation.InsuranceEmbeddedDestinations;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionData;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionId;
import com.revolut.feature.stories.models.ButtonAction;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.StackDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.RestartApplicationCommand;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;
import h93.f0;
import hcl.x2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import org.joda.time.DateTime;
import v6l.b1;
import v6l.h0;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f285920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f285921c;

    public /* synthetic */ t(Object obj2, Object obj3, int i) {
        this.f285919a = i;
        this.f285920b = obj2;
        this.f285921c = obj3;
    }

    @Override // kfm.a
    public final void run() {
        int i = this.f285919a;
        NaviCommand naviCommandF = DummyCommand.f98635a;
        Class cls = Boolean.TYPE;
        Object params = this.f285921c;
        Object obj2 = this.f285920b;
        switch (i) {
            case 0:
                ((d0) obj2).R(((ButtonAction.NavigationCommand) ((ButtonAction) params)).f88753a);
                break;
            case 1:
                ((ihm.j) ((v60.g) obj2).f286252c).onNext(params);
                break;
            case 2:
                b1 b1Var = (b1) obj2;
                b1Var.f286432n.k(h0.a.f286452a, b1Var.r(b1Var.p(zhm.u.c(u6l.k.e((f0) params)), false)));
                break;
            case 3:
                vb7.f fVar = (vb7.f) obj2;
                fVar.f287442b.remove("synced_surveys_key");
                fVar.f287443c.G(xam.a.z((ArrayList) params), "surveys_key", kii.e.o(ub7.c.class, KTypeProjection.INSTANCE, List.class));
                break;
            case 4:
                ((vbc.g) obj2).f287498b.a((KompotDestination) params);
                break;
            case 5:
                com.revolut.data.database.models.openbanking.d.D(cls, ((vbj.c) obj2).f287529a, (String) params, Boolean.TRUE);
                break;
            case 6:
                ((vdl.y) obj2).f288065c.f(new x2((String) params, DateTime.now().getMillis()));
                break;
            case 7:
                ((vfg.k) obj2).f288626c.onNext((lk0.g) params);
                break;
            case 8:
                ((vfg.o) obj2).f288631c.onNext((lk0.g) params);
                break;
            case 9:
                ((vfg.t) obj2).f288641c.onNext((lk0.g) params);
                break;
            case 10:
                ((vkc.b) obj2).f289901a.c((CompositeCommand) params);
                break;
            case 11:
                ((vli.l) obj2).f290472a.c((FeatureCommand) params);
                break;
            case 12:
                ((vx5.y) obj2).f292843a.b((NaviCommand) params);
                break;
            case 13:
                ufm.g gVar = (ufm.g) obj2;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                ((ConcurrentHashMap) gVar.f279886c).remove(params);
                break;
            case 14:
                ((wc7.g) obj2).f296358a.b(new fc7.d(new InsuranceEmbeddedDestinations.DetailsLayout((String) params, false)));
                break;
            case 15:
                ((wf0.l) obj2).d.h((String) params);
                break;
            case 16:
                sri.m mVar = ((wf6.b) obj2).f296974a;
                LinkSuccessDestination linkSuccessDestinationB = wf6.b.b((jf0.c) params);
                if (linkSuccessDestinationB != null) {
                    naviCommandF = u0.f(linkSuccessDestinationB);
                }
                mVar.c(naviCommandF);
                break;
            case 17:
                ((wf6.e) obj2).f296981a.c((FeatureCommand) params);
                break;
            case 18:
                sri.m mVar2 = ((wf6.g) obj2).f296987a;
                LinkSuccessDestination linkSuccessDestinationB2 = wf6.g.b((jf0.c) params);
                if (linkSuccessDestinationB2 != null) {
                    naviCommandF = u0.f(linkSuccessDestinationB2);
                }
                mVar2.c(naviCommandF);
                break;
            case 19:
                sri.m mVar3 = ((wf6.u) obj2).f297012a;
                ExternalAccountTopupPayload.LinkedAccountPayload payload = wf6.u.b((jf0.c) params);
                Intrinsics.checkNotNullParameter(payload, "payload");
                mVar3.c(new FeatureCommand(new MainScreenFeatureConfig.WithAction(s49.a.SINGLE_TOP, new MainContainerActionData(new MainContainerActionId("EXTERNAL_ACCOUNT_TOPUP"), payload))));
                break;
            case 20:
                ((wf6.f0) obj2).f296986a.c(wf6.f0.b((jf0.c) params));
                break;
            case 21:
                sri.m mVar4 = ((wf6.h0) obj2).f296988a;
                s49.a aVar = s49.a.SINGLE_TOP;
                MainContainerActionId mainContainerActionId = new MainContainerActionId("EXTERNAL_ACCOUNT_TOPUP");
                HashMap map = ((jf0.c) params).d;
                mVar4.c(new FeatureCommand(new MainScreenFeatureConfig.WithAction(aVar, new MainContainerActionData(mainContainerActionId, new ExternalAccountTopupPayload.OneOffPayload((String) map.get("institutionId"), (String) map.get("branchId"), Intrinsics.f(map.get("success"), "true") ? com.revolut.feature.external_accounts.models.a.SUCCESS : com.revolut.feature.external_accounts.models.a.FAILURE)))));
                break;
            case 22:
                NaviCommand naviCommand = (NaviCommand) params;
                Intrinsics.h(naviCommand);
                ((wrj.l) obj2).C1(new BridgeDestination(naviCommand));
                break;
            case 23:
                ((ws5.i) obj2).f299667a.b(new dt5.d((StackDestination) params));
                break;
            case 24:
                ((x0k.a) obj2).A2(new BridgeDestination((FeatureCommand) params));
                break;
            case 25:
                x0k.a aVar2 = (x0k.a) obj2;
                lw0.a aVar3 = new lw0.a(new TextLocalisedClause(((WealthNewsCategory) params) instanceof WealthNewsCategory.Markets ? R$string.wealth_invest_market_news_info_title : R$string.wealth_trading_widget_top_stories_info_dialog_header, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_widget_top_stories_info_dialog_description, null, null, 14), null, null, false, 28);
                aw0.e eVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1016), null, null, 55);
                k9 k9Var = k9.Wealth;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                yji.n.P2(aVar2, new ActionsBottomSheetController(new dii.a(aVar3, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
                break;
            case 26:
                Pair pair = (Pair) params;
                te0.e eVarU = ((x94.k) obj2).f303553b.U();
                Intrinsics.h(pair);
                eVarU.set(pair);
                break;
            case 27:
                xra.j jVar = (xra.j) params;
                for (wpa.g gVar2 : (ArrayList) obj2) {
                    jVar.f308317a.e(gVar2.f299213b, gVar2.f299212a);
                }
                break;
            case 28:
                xsb.b bVar = (xsb.b) params;
                if (Intrinsics.f(((jf0.c) obj2).d.get("reason"), "A2A_MIGRATION")) {
                    qfa.e eVar2 = bVar.f308442b.f194835a;
                    eVar2.b();
                    eVar2.a();
                    ue0.c cVar = eVar2.f245284c;
                    cVar.G(Boolean.TRUE, "POST_ACTIVATION_NEEDED_KEY", wim.z.d(o0.b(cls)));
                    cVar.I0("POST_ACTIVATION_COMPLETED_KEY");
                }
                bVar.f308441a.c(RestartApplicationCommand.f98667a);
                break;
            default:
                jf0.c cVar2 = (jf0.c) params;
                sri.m mVar5 = ((xsb.d) obj2).f308443a;
                NaviCommand naviCommandB = xsb.d.b(cVar2);
                if (cVar2.l()) {
                    naviCommandB = com.revolut.retail.core.navigation.a.c(jbb.a.a(ibb.c.f160140a, null, null, null, 14), naviCommandB);
                }
                mVar5.c(naviCommandB);
                break;
        }
    }
}
