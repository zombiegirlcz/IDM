package hc7;

import akl.p;
import android.net.Uri;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i4;
import com.revolut.core.ui_kit.delegates.widgets.p2;
import com.revolut.domain.interactors.experiments.ExperimentsFetchingInteractor$ExperimentType;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTopupRequestNavigation$Destination;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTopupRequestNavigation$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmConsentNavigation$Destination;
import com.revolut.feature.home_feed.api.deeplink.AddWidgetDeeplinkAction;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionData;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionId;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.payinstore.api.config.PayInStore;
import com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload;
import com.revolut.feature.subaccount.impl.product.widgets.links.SubaccountLinkParcel;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.api.rewards_hub.model.RewardsHubChallengeDetailsParams;
import com.revolut.retail.feature.api.rewards_hub.navigation.RewardsHubDetailsDestination;
import elm.f;
import hn.h;
import i31.j;
import i31.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jk5.i;
import joe.o;
import k7c.n;
import kce.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import l3l.s;
import lk0.g;
import no.i1;
import npi.e;
import skm.e0;
import skm.p0;
import sri.m;
import tof.hc;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f150855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f150856c;

    public /* synthetic */ a(int i, String str, Object obj2) {
        this.f150854a = i;
        this.f150856c = str;
        this.f150855b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kfm.a
    public final void run() {
        int i = this.f150854a;
        int i2 = 17;
        int i3 = 2;
        Object[] objArr = 0;
        Object obj2 = this.f150856c;
        Object obj3 = this.f150855b;
        switch (i) {
            case 0:
                m mVar = ((c) obj3).f150857a;
                s49.a aVar = s49.a.SINGLE_TOP;
                MainContainerNavigationId.MainContainerTabId mainContainerTabId = u49.a.f277275a;
                HomeFeedWidgetContext.Personal.INSTANCE.getClass();
                mVar.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(aVar, new MainContainerInnerConfiguration(mainContainerTabId, new TabAccountsLaunchConfig(null, new TabAccountsInitialPayload.Action(new AddWidgetDeeplinkAction(HomeFeedWidgetContext.Personal.Companion.a(), (String) obj2, null))), null, 4))));
                break;
            case 1:
                e eVar = (e) obj2;
                if (!((Boolean) obj3).booleanValue()) {
                    String simpleName = hn.d.class.getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, simpleName, "Dialog result is not handled: " + eVar, null, null, 16);
                }
                break;
            case 2:
                npi.d configuration = (npi.d) obj2;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                ((h) obj3).f154012b.onNext(configuration);
                break;
            case 3:
                i1i.c cVar = (i1i.c) obj3;
                ((opi.b) cVar.i).Z(cVar.f157641h.f((dj0.d) obj2));
                break;
            case 4:
                l lVar = (l) obj3;
                String str = (String) obj2;
                Iterable iterable = (List) lVar.f158086c.get("transfer_links");
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : iterable) {
                    if (!Intrinsics.f(((TransferLinkDetails) obj4).getF60363b(), str)) {
                        arrayList.add(obj4);
                    }
                }
                lVar.f158089j.k(j.a.f158082a, arrayList);
                break;
            case 5:
                ((i3g.c) obj3).f158206b.onNext((g) obj2);
                break;
            case 6:
                ((i4g.h) obj3).f.onNext((g) obj2);
                break;
            case 7:
                ((i8b.b) obj3).A2(new BridgeDestination((NaviCommand) obj2));
                break;
            case 8:
                ((jid.d) obj3).f174431b.onNext((g) obj2);
                break;
            case 9:
                ((i) obj3).C2(new jk5.a((String) obj2));
                break;
            case 10:
                ((cid.a) obj3).f24445b.c((FeatureCommand) obj2);
                break;
            case 11:
                ((jn9.a) obj2).f176661b.c(new FeatureCommand(new PayInStore(((jf0.c) obj3).e(2))));
                break;
            case 12:
                ((o) obj3).e.j(Unit.f186387a, (List) obj2);
                break;
            case 13:
                ((fqj.h) ((jqj.m) obj3).f177748c).a(u.c(new hc((String) obj2, null)));
                break;
            case 14:
                ExperimentsFetchingInteractor$ExperimentType experimentType = (ExperimentsFetchingInteractor$ExperimentType) obj2;
                for (i1 i1Var : ((jte.c) obj3).d) {
                    i1Var.getClass();
                    Intrinsics.checkNotNullParameter(experimentType, "experimentType");
                    if (experimentType != ExperimentsFetchingInteractor$ExperimentType.FIREBASE || i1Var.f217790b.b(ExperimentsFetchingInteractor$ExperimentType.SKYWALKER).isEmpty()) {
                        CoroutineScope coroutineScopeC = i1Var.f.c();
                        p0 p0Var = p0.f264001a;
                        e0.C(coroutineScopeC, f.f127540b, null, new mtj.i((Object) i1Var, (Object) experimentType, (Continuation) (objArr == true ? 1 : 0), i2), 2);
                    }
                }
                break;
            case 15:
                ((k39.b) obj3).b((NaviCommand) obj2);
                break;
            case 16:
                k86.f fVar = (k86.f) obj3;
                String str2 = (String) obj2;
                k86.e eVar2 = new k86.e(true);
                List list = (List) fVar.f182094b.get(eVar2.a());
                if (list != null) {
                    ArrayList arrayListF1 = d0.f1(list);
                    arrayListF1.removeIf(new p(new n(str2, i3), 8));
                    fVar.d.j(eVar2, arrayListF1);
                    break;
                }
                break;
            case 17:
                ((Function1) obj3).invoke((g) obj2);
                break;
            case 18:
                ((r) obj3).f182721c.onNext((NaviCommand) obj2);
                break;
            case 19:
                ym.b bVar = (ym.b) obj3;
                kn.h hVar = (kn.h) obj2;
                boolean zF = Intrinsics.f(bVar.f314825c, "");
                if (bVar.f314824b) {
                    ((tpi.i) ((tpi.j) hVar.f185966a.get())).W(true);
                    if (zF) {
                        hVar.f185967b.incrementAndGet();
                    }
                } else {
                    ((tpi.i) ((tpi.j) hVar.f185966a.get())).Q();
                    if (zF) {
                        hVar.f185967b.decrementAndGet();
                    }
                }
                break;
            case 20:
                krj.d dVar = (krj.d) obj3;
                qzi.a aVar2 = (qzi.a) obj2;
                dVar.f188881b.g().b(aVar2.f250646a);
                String id10 = aVar2.f250647b;
                Intrinsics.checkNotNullParameter(id10, "id");
                dVar.a(id10);
                break;
            case 21:
                kuj.f fVar2 = (kuj.f) obj2;
                Object obj5 = ((i4) ((BaseDraggableWidgetDelegate.a) obj3)).f55384c.f53364p;
                RewardsHubChallengeDetailsParams rewardsHubChallengeDetailsParams = obj5 instanceof RewardsHubChallengeDetailsParams ? (RewardsHubChallengeDetailsParams) obj5 : null;
                if (rewardsHubChallengeDetailsParams != null) {
                    fVar2.f189840b.a(new aii.e0(new RewardsHubDetailsDestination(rewardsHubChallengeDetailsParams), com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE), false, 4));
                    break;
                }
                break;
            case 22:
                ((kvi.e) obj3).f190135b.a((ParcelableDestination) obj2);
                break;
            case 23:
                ((kz1.b) obj3).f191044a.c(new FeatureCommand(new MainScreenFeatureConfig.WithAction(s49.a.SINGLE_TOP, new MainContainerActionData(new MainContainerActionId("APM_DEEPLINK"), (ApmDeeplinkPayload) obj2))));
                break;
            case 24:
                ((kz1.c) obj3).f191045a.c(new FeatureCommand(new MainScreenFeatureConfig.WithAction(s49.a.SINGLE_TOP, new MainContainerActionData(new MainContainerActionId("APM_DEEPLINK"), new ApmDeeplinkPayload.Chat((String) obj2)))));
                break;
            case 25:
                ((kz1.e) obj3).f191046a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, u0.f((ApmConsentNavigation$Destination) obj2), 2))));
                break;
            case 26:
                ((kz1.h) obj3).f191051a.c(kz1.h.b((ApmDeeplinkPayload.Apm) obj2));
                break;
            case 27:
                ((kz1.j) obj3).f191054a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, u0.f(new ApmTopupRequestNavigation$Destination(new ApmTopupRequestNavigation$InputData((String) obj2))), 2))));
                break;
            case 28:
                ((s) obj3).d.onNext(new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.VIEW", null, null, null, Uri.parse(((ty0.a) obj2).f275446b), 14), null, null, null, 0, null, null, null, null, false, 1022));
                break;
            default:
                l7e.h hVar2 = (l7e.h) obj2;
                Object obj6 = ((p2) ((BaseDraggableWidgetDelegate.a) obj3)).f55467c.f55203g;
                SubaccountLinkParcel subaccountLinkParcel = obj6 instanceof SubaccountLinkParcel ? (SubaccountLinkParcel) obj6 : null;
                if (subaccountLinkParcel == null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "SubaccountLinkWidgetEventHandler", j6.a.q("Unknown model parcel ", obj6 != null ? obj6.getClass().getName() : null), null, h0Var);
                } else {
                    hVar2.f192573c.c(null, subaccountLinkParcel.f88985b, false, new kob.a(hVar2, i2));
                }
                break;
        }
    }

    public /* synthetic */ a(Boolean bool, hn.d dVar, e eVar) {
        this.f150854a = 1;
        this.f150855b = bool;
        this.f150856c = eVar;
    }

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f150854a = i;
        this.f150855b = obj2;
        this.f150856c = obj3;
    }
}
