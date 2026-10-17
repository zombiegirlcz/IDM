package zc0;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.backend_flow.ui.BackendFlowPermissionDestination;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.api.navigation.AddressFlowNavigationDestination;
import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.AddressInputItem;
import com.revolut.feature.backend_flow.domain.models.BackendEntityItem;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;
import com.revolut.feature.backend_flow.domain.models.CardCellItem;
import com.revolut.feature.backend_flow.domain.models.CardSelectionItem;
import com.revolut.feature.backend_flow.domain.models.CountrySelectionItem;
import com.revolut.feature.backend_flow.domain.models.DeeplinkScreen;
import com.revolut.feature.backend_flow.domain.models.EntitiesSummaryItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.HtmlPromptScreen;
import com.revolut.feature.backend_flow.domain.models.HtmlStringItem;
import com.revolut.feature.backend_flow.domain.models.PollingInfo;
import com.revolut.feature.backend_flow.domain.models.PromptScreen;
import com.revolut.feature.backend_flow.domain.models.SecondaryDescription;
import com.revolut.feature.backend_flow.domain.models.StatusDialogScreen;
import com.revolut.feature.backend_flow.domain.models.StoriesScreen;
import com.revolut.feature.backend_flow.domain.models.SummaryScreen;
import com.revolut.feature.backend_flow.domain.models.TransactionCellItem;
import com.revolut.feature.backend_flow.domain.models.TutorialScreen;
import com.revolut.feature.backend_flow.domain.models.WidgetProgressionItem;
import com.revolut.feature.remote_stories.models.navigation.RemoteStoriesFeatureConfig;
import com.revolut.feature.remote_stories.models.params.RemoteStoryModelParams;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f321125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2 f321126b;

    public /* synthetic */ t(y2 y2Var, int i) {
        this.f321125a = i;
        this.f321126b = y2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.r rVarNever;
        int i;
        efm.r rVarJust;
        PollingInfo pollingInfo;
        int i2 = this.f321125a;
        pfm.m mVar = pfm.m.f235744a;
        int i3 = 1;
        y2 y2Var = this.f321126b;
        switch (i2) {
            case 0:
                e3 e3Var = (e3) obj2;
                Intrinsics.checkNotNullParameter(e3Var, "<destruct>");
                return y2Var.f321162h.A2(e3Var.f321043a, e3Var.f321044b);
            case 1:
                Action action = (Action) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                ((tpi.i) y2Var.f321168q).W(true);
                return ((qc0.f1) y2Var.i).m(action);
            case 2:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                tpi.i iVar = (tpi.i) y2Var.f321168q;
                if (zBooleanValue) {
                    iVar.W(true);
                } else {
                    iVar.Q();
                }
                return Unit.f186387a;
            case 3:
                Action action2 = (Action) obj2;
                qc0.j jVar = y2Var.i;
                Intrinsics.h(action2);
                pfm.a aVarE = ((qc0.f1) jVar).m(action2).e(new pfm.h(new r(y2Var, 1), 2));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            case 4:
                BackendScreen screen = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen, "screen");
                efm.d0 d0VarP = y2Var.P();
                x xVar = new x(24, new cia.d(1, screen, uc0.a.class, "toAnalyticsContext", "toAnalyticsContext(Lcom/revolut/feature/backend_flow/domain/models/BackendScreen;Ljava/lang/String;I)Lcom/google/protobuf/GeneratedMessageLite;", 1, 10));
                d0VarP.getClass();
                return new ufm.i(d0VarP, xVar, 1);
            case 5:
                BackendScreen it8 = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ypi.i iVar2 = y2Var.f321163j;
                if ((it8 instanceof BottomPromptScreen) || (it8 instanceof HtmlPromptScreen) || (it8 instanceof PromptScreen) || (it8 instanceof StoriesScreen) || (it8 instanceof StatusDialogScreen)) {
                    rVarNever = efm.r.never();
                    Intrinsics.checkNotNullExpressionValue(rVarNever, "never(...)");
                } else if ((it8 instanceof DeeplinkScreen) || (it8 instanceof SummaryScreen) || (it8 instanceof TutorialScreen)) {
                    sfm.b bVarG = new pfm.h(new z6l.a(iVar2, 3), 2).g(efm.r.never());
                    Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
                    rVarNever = o70.a.c(bVarG);
                } else {
                    if (!(it8 instanceof FormScreen)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    HtmlStringItem htmlStringItem = ((FormScreen) it8).f63474m;
                    if (htmlStringItem == null) {
                        sfm.b bVarG2 = new pfm.h(new z6l.a(iVar2, 3), 2).g(efm.r.never());
                        Intrinsics.checkNotNullExpressionValue(bVarG2, "andThen(...)");
                        rVarNever = o70.a.c(bVarG2);
                    } else {
                        iVar2.t(new ypi.l(new HtmlClause(0, 30, (Integer) null, (Object) null, htmlStringItem.f63481a)));
                        iVar2.d(true);
                        efm.r map = iVar2.e().map(new n(new zbj.j0(21), 7));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        rVarNever = o70.a.c(map);
                    }
                }
                return te0.w.D(rVarNever, new a0(y2Var, 9));
            case 6:
                Clause it9 = (Clause) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                y2Var.f321163j.f(it9);
                return Unit.f186387a;
            case 7:
                StoriesScreen storyScreen = (StoriesScreen) obj2;
                Intrinsics.checkNotNullParameter(storyScreen, "storyScreen");
                g gVar = y2Var.f321162h;
                if (Intrinsics.f(gVar.e(), storyScreen.f63663a)) {
                    return mVar;
                }
                gVar.h3(storyScreen.f63663a);
                qc0.j jVar2 = y2Var.i;
                String storyId = storyScreen.d;
                boolean z = storyScreen.f63664b;
                qc0.f1 f1Var = (qc0.f1) jVar2;
                f1Var.getClass();
                Intrinsics.checkNotNullParameter(storyId, "storyId");
                return f1Var.p(new FeatureCommand(new RemoteStoriesFeatureConfig.Id(storyId, new RemoteStoryModelParams(null, null, z, 13), f1Var.o(), 133)));
            case 8:
                BackendScreen screen2 = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen2, "screen");
                if (screen2 instanceof FormScreen) {
                    ihm.b bVar = y2Var.A;
                    m2 m2Var = m2.f;
                    return bVar.map(new x2l.a(26, false)).distinctUntilChanged();
                }
                if ((screen2 instanceof StoriesScreen) || (screen2 instanceof BottomPromptScreen) || (screen2 instanceof PromptScreen) || (screen2 instanceof DeeplinkScreen) || (screen2 instanceof StatusDialogScreen) || (screen2 instanceof SummaryScreen) || (screen2 instanceof HtmlPromptScreen) || (screen2 instanceof TutorialScreen)) {
                    return efm.r.empty();
                }
                throw new NoWhenBranchMatchedException();
            case 9:
                g gVar2 = y2Var.f321162h;
                BackendScreen screen3 = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen3, "screen");
                if (!(screen3 instanceof FormScreen) || !uc0.b.p(screen3)) {
                    return new pfm.h(new r(y2Var, 2), 2);
                }
                String strG = gVar2.g();
                FormScreen screen4 = (FormScreen) screen3;
                String str = screen4.f63467a;
                if (Intrinsics.f(strG, str)) {
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return mVar;
                }
                gVar2.U1(str);
                qc0.f1 f1Var2 = (qc0.f1) y2Var.i;
                f1Var2.getClass();
                Intrinsics.checkNotNullParameter(screen4, "screen");
                Object objB0 = zhm.d0.b0(screen4.f63468b);
                Intrinsics.i(objB0, "null cannot be cast to non-null type com.revolut.feature.backend_flow.domain.models.AddressInputItem");
                AddressFlowContract$InputData inputData = ((yc0.c) f1Var2.f244421j).a(screen4, (AddressInputItem) objB0);
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                return f1Var2.p(gc0.c.f(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new AddressFlowNavigationDestination(inputData), false, (Integer) 155, 0, 53)));
            case 10:
                g gVar3 = y2Var.f321162h;
                FormScreen screen5 = (FormScreen) obj2;
                Intrinsics.checkNotNullParameter(screen5, "screen");
                for (Object obj3 : screen5.f63468b) {
                    if (((BackendItem) obj3) instanceof CountrySelectionItem) {
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.backend_flow.domain.models.CountrySelectionItem");
                        CountrySelectionItem countrySelectionItem = (CountrySelectionItem) obj3;
                        String str2 = countrySelectionItem.f63368a;
                        qc0.j jVar3 = y2Var.i;
                        if (Intrinsics.f(gVar3.b(), str2)) {
                            return countrySelectionItem.e != null ? ((qc0.f1) jVar3).l() : jVar3.goBack();
                        }
                        gVar3.e1(str2);
                        return ((qc0.f1) jVar3).s(str2);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 11:
                qc0.g result = (qc0.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                return ((qc0.f1) y2Var.i).w(result.f244424b, result.f244423a);
            case 12:
                g gVar4 = y2Var.f321162h;
                BackendScreen screen6 = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen6, "screen");
                if (!(screen6 instanceof FormScreen) || !uc0.b.r(screen6)) {
                    return new pfm.h(new r(y2Var, 3), 2);
                }
                String strI = gVar4.i();
                FormScreen screen7 = (FormScreen) screen6;
                String str3 = screen7.f63467a;
                if (Intrinsics.f(strI, str3)) {
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return mVar;
                }
                gVar4.I1(str3);
                qc0.f1 f1Var3 = (qc0.f1) y2Var.i;
                f1Var3.getClass();
                Intrinsics.checkNotNullParameter(screen7, "screen");
                return f1Var3.p(gc0.c.f(new KompotOverlayFeatureConfig(new BackendFlowPermissionDestination(screen7), yhi.b.SOLID, Integer.valueOf(Constants.TAG_PAYMENT_APP_CLESS_VERSION), 8)));
            case 13:
                Boolean bool = (Boolean) obj2;
                xpi.g gVar5 = y2Var.f321165m;
                Intrinsics.h(bool);
                ((xpi.c) gVar5).setVisible(bool.booleanValue());
                return Unit.f186387a;
            case 14:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Clause clause = (Clause) pair.f186385a;
                BackendFlow backendFlow = (BackendFlow) pair.f186386b;
                xpi.g gVar6 = y2Var.f321165m;
                Intrinsics.h(clause);
                ((xpi.c) gVar6).n0(clause);
                Intrinsics.checkNotNullParameter(backendFlow, "<this>");
                if (!Boolean.parseBoolean((String) backendFlow.i.get("showProgressBar"))) {
                    ((xpi.c) gVar6).p0(clause);
                }
                return Unit.f186387a;
            case 15:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                od0.i iVar3 = (od0.i) pair2.f186385a;
                od0.i iVar4 = (od0.i) pair2.f186386b;
                xpi.g gVar7 = y2Var.f321165m;
                Intrinsics.h(iVar3);
                boolean z3 = (iVar3.d() && !kotlin.text.d0.W((CharSequence) iVar3.c())) || (iVar4.d() && !kotlin.text.d0.W(((SecondaryDescription) iVar4.c()).f63601b));
                xpi.c cVar = (xpi.c) gVar7;
                cVar.l0(z3);
                if (z3) {
                    aim.e eVarB = zhm.u.b();
                    String str4 = (String) iVar3.f224257a;
                    if (str4 != null) {
                        eVarB.add(new HtmlClause(0, 30, (Integer) null, (Object) null, str4));
                    }
                    SecondaryDescription secondaryDescription = (SecondaryDescription) iVar4.f224257a;
                    if (secondaryDescription != null) {
                        eVarB.add(new TextClause(secondaryDescription.f63601b, (Style) new Click(28, (Integer) null, (Object) secondaryDescription, "SUBTITLE_PROMPT_LABEL_ID", false), (Integer) null, false, (o9) null, (List) null, 124));
                    }
                    cVar.f0(yoj.b.m(new TextClause(m70.a.o(kotlin.jvm.internal.t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.u.a(eVarB)));
                }
                return Unit.f186387a;
            case 16:
                ty0.a clickData = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj4 = clickData.d;
                boolean z4 = obj4 instanceof SecondaryDescription;
                y2 y2Var2 = this.f321126b;
                if (!z4) {
                    return ((qc0.f1) y2Var2.i).u(clickData.f275445a);
                }
                pfm.a aVar = new pfm.a(new ufm.c(new wf6.w(y2Var2, (SecondaryDescription) obj4, 8), 2), new x(23, new zab.s(1, y2Var2, y2.class, "showDialog", "showDialog(Lcom/revolut/core/ui_kit/dialogs/ExpandableDialogDisplayer$Model;)Lio/reactivex/Completable;", 0, 28)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar;
            case 17:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                ((xpi.c) y2Var.f321165m).d0(it10);
                return Unit.f186387a;
            case 18:
                Boolean bool2 = (Boolean) obj2;
                xpi.g gVar8 = y2Var.f321165m;
                Intrinsics.h(bool2);
                if (bool2.booleanValue()) {
                    NavBarWithToolbar navBarWithToolbar = ((xpi.c) gVar8).f307974j;
                    if (navBarWithToolbar == null) {
                        Intrinsics.r("navBarWithToolbarView");
                        throw null;
                    }
                    navBarWithToolbar.H0(false);
                } else {
                    NavBarWithToolbar navBarWithToolbar2 = ((xpi.c) gVar8).f307974j;
                    if (navBarWithToolbar2 == null) {
                        Intrinsics.r("navBarWithToolbarView");
                        throw null;
                    }
                    navBarWithToolbar2.j0(false);
                }
                return Unit.f186387a;
            case 19:
                BackendScreen screen8 = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen8, "screen");
                if (!(screen8 instanceof xl2.v)) {
                    efm.r rVarJust2 = efm.r.just(zi0.c.P(screen8, false, null, 3));
                    Intrinsics.checkNotNullExpressionValue(rVarJust2, "just(...)");
                    return rVarJust2;
                }
                List<BackendItem> f = ((xl2.v) screen8).getF();
                ArrayList arrayList = new ArrayList(zhm.w.t(f, 10));
                for (BackendItem backendItem : f) {
                    g gVar9 = y2Var.f321162h;
                    if (backendItem instanceof CardSelectionItem) {
                        CardSelectionItem cardSelectionItem = (CardSelectionItem) backendItem;
                        efm.d0 d0VarP2 = y2Var.P();
                        n nVar = new n(new z8g.q(y2Var, cardSelectionItem, 25), 6);
                        d0VarP2.getClass();
                        sfm.b bVar2 = new sfm.b(d0VarP2, nVar, 2);
                        Intrinsics.checkNotNullExpressionValue(bVar2, "flatMapObservable(...)");
                        rVarJust = nim.a.w(bVar2, new pb0.d(cardSelectionItem, i3));
                    } else if (backendItem instanceof CardCellItem) {
                        CardCellItem cardCellItem = (CardCellItem) backendItem;
                        efm.d0 d0VarP3 = y2Var.P();
                        b0 b0Var = new b0(new z8g.q(y2Var, cardCellItem, 27), 8);
                        d0VarP3.getClass();
                        sfm.b bVar3 = new sfm.b(d0VarP3, b0Var, 2);
                        Intrinsics.checkNotNullExpressionValue(bVar3, "flatMapObservable(...)");
                        rVarJust = nim.a.w(bVar3, new pb0.b(cardCellItem, i3));
                    } else if (backendItem instanceof EntitiesSummaryItem) {
                        efm.d0 d0VarFirstOrError = gVar9.n().take(1L).firstOrError();
                        b0 b0Var2 = new b0(new u(y2Var, (EntitiesSummaryItem) backendItem, 1), 7);
                        d0VarFirstOrError.getClass();
                        rVarJust = new sfm.b(d0VarFirstOrError, b0Var2, 2);
                        Intrinsics.checkNotNullExpressionValue(rVarJust, "flatMapObservable(...)");
                    } else {
                        if (backendItem instanceof BackendEntityItem) {
                            BackendEntityItem backendEntityItem = (BackendEntityItem) backendItem;
                            efm.d0 d0VarFirstOrError2 = gVar9.n().take(1L).firstOrError();
                            i = 14;
                            b0 b0Var3 = new b0(new z8g.q(y2Var, backendEntityItem, 28), i);
                            d0VarFirstOrError2.getClass();
                            sfm.b bVar4 = new sfm.b(d0VarFirstOrError2, b0Var3, 2);
                            Intrinsics.checkNotNullExpressionValue(bVar4, "flatMapObservable(...)");
                            rVarJust = nim.a.w(bVar4, new pb0.g(backendEntityItem, 1));
                        } else {
                            i = 14;
                            if (backendItem instanceof WidgetProgressionItem) {
                                WidgetProgressionItem widgetProgressionItem = (WidgetProgressionItem) backendItem;
                                rVarJust = nim.a.w(rd0.e.c(oc0.m.a(y2Var.f321172w, widgetProgressionItem.f63721b), kotlin.coroutines.g.f186406a), new pb0.j(widgetProgressionItem, 1));
                            } else if (backendItem instanceof TransactionCellItem) {
                                TransactionCellItem transactionCellItem = (TransactionCellItem) backendItem;
                                rVarJust = nim.a.w(rd0.e.c(t9l.g.c(y2Var.f321173x, transactionCellItem.f63702b), kotlin.coroutines.g.f186406a), new pb0.h(transactionCellItem, 2));
                            } else {
                                rVarJust = efm.r.just(zi0.c.P(backendItem, false, null, 3));
                                Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                            }
                        }
                        Intrinsics.i(rVarJust, "null cannot be cast to non-null type io.reactivex.Observable<com.revolut.data.model.Data<com.revolut.feature.backend_flow.domain.models.BackendItem>>");
                        arrayList.add(rVarJust.map(new b0(new za9.c(backendItem, 9), 1)));
                        i3 = 1;
                    }
                    i = 14;
                    Intrinsics.i(rVarJust, "null cannot be cast to non-null type io.reactivex.Observable<com.revolut.data.model.Data<com.revolut.feature.backend_flow.domain.models.BackendItem>>");
                    arrayList.add(rVarJust.map(new b0(new za9.c(backendItem, 9), 1)));
                    i3 = 1;
                }
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                return nim.a.w(mif.a.l(arrayList), new cd0.b(screen8, i3));
            case 20:
                BackendScreen updatedScreen = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(updatedScreen, "updatedScreen");
                return y2Var.f321162h.s(updatedScreen);
            case 21:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                ((k3l.d) y2Var.f321166n).O(new StatusViewConfiguration.Error("PREFETCH_ITEMS_ERROR_DIALOG_ID", new TextLocalisedClause(R$string.error_generic, null, null, 14), null, null, null, null, null, 8188));
                return Unit.f186387a;
            case 22:
                g gVar10 = y2Var.f321162h;
                Parcelable screen9 = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen9, "screen");
                if (!(screen9 instanceof xl2.z) || (pollingInfo = ((TutorialScreen) ((xl2.z) screen9)).f63712b) == null) {
                    gVar10.k0();
                } else {
                    gVar10.t0(pollingInfo.f63577a);
                }
                return Unit.f186387a;
            case 23:
                Intrinsics.checkNotNullParameter((FullScreenStateDelegate.Model) obj2, "it");
                return y2Var.f0();
            case 24:
                pfm.h hVar = new pfm.h(new z6l.a(y2Var.f321171t, 2), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            case 25:
                qc0.j jVar4 = y2Var.i;
                g gVar11 = y2Var.f321162h;
                InputDisclosureDelegate.Model model = (InputDisclosureDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj5 = model.e;
                if (obj5 instanceof r3) {
                    return gVar11.y2(((r3) obj5).f321117a).e(((qc0.f1) jVar4).l());
                }
                if (!(obj5 instanceof y3)) {
                    return gVar11.n2(model.f52539a).e(((qc0.f1) jVar4).l());
                }
                y3 y3Var = (y3) obj5;
                return gVar11.Y0(y3Var.f321175a, y3Var.f321176b).e(((qc0.f1) jVar4).l());
            case 26:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return y2Var.f321162h.C2((String) pair3.f186385a, (String) pair3.f186386b);
            case 27:
                String id10 = (String) obj2;
                Intrinsics.checkNotNullParameter(id10, "id");
                return ((qc0.f1) y2Var.i).s(id10);
            case 28:
                Pair pair4 = (Pair) obj2;
                return y2Var.f321162h.v1((String) pair4.f186385a, (String) pair4.f186386b);
            default:
                Pair pair5 = (Pair) obj2;
                return y2Var.f321162h.Q2((String) pair5.f186385a, (String) pair5.f186386b);
        }
    }
}
