package qc0;

import android.net.Uri;
import com.revolut.core.backend_flow.ui.screen.BackendScreenContract$Configuration;
import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.BackendFlowExitDialog;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;
import com.revolut.feature.backend_flow.domain.models.DeeplinkScreen;
import com.revolut.feature.backend_flow.domain.models.EntitiesListItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.HtmlPromptScreen;
import com.revolut.feature.backend_flow.domain.models.PromptScreen;
import com.revolut.feature.backend_flow.domain.models.StatusDialogScreen;
import com.revolut.feature.backend_flow.domain.models.StoriesScreen;
import com.revolut.feature.backend_flow.domain.models.SummaryScreen;
import com.revolut.feature.backend_flow.domain.models.TutorialScreen;
import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ChooserActivityDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import ip0.v7;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public abstract class f1 implements j {

    @NotNull
    public static final d1 Companion = new d1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f244416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final am2.a f244417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f244418c;
    public final t70.b d;
    public final String e;
    public final mm.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wli.x f244419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xl2.f f244420h;
    public final s70.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yc0.a f244421j;
    public final ihm.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.b f244422l;

    public f1(h presentationModel, dcl.q transitionsInteractor, am2.a backendFlowCountryInteractor, k state, t70.b currencyLocalization, String flowName, mm.d actionsDispatcher, wli.x deeplinkHandler, xl2.f backendFlowConfiguration, s70.a intentProvider, yc0.a addressFlowInputDataMapper) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(transitionsInteractor, "transitionsInteractor");
        Intrinsics.checkNotNullParameter(backendFlowCountryInteractor, "backendFlowCountryInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(backendFlowConfiguration, "backendFlowConfiguration");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(addressFlowInputDataMapper, "addressFlowInputDataMapper");
        this.f244416a = presentationModel;
        this.f244417b = backendFlowCountryInteractor;
        this.f244418c = state;
        this.d = currencyLocalization;
        this.e = flowName;
        this.f = actionsDispatcher;
        this.f244419g = deeplinkHandler;
        this.f244420h = backendFlowConfiguration;
        this.i = intentProvider;
        this.f244421j = addressFlowInputDataMapper;
        this.k = p.a.D("toSerialized(...)");
        this.f244422l = j6.a.h("create(...)");
    }

    public static efm.b e(f1 f1Var, od0.i analyticsProduct) throws CloneNotSupportedException {
        String str;
        List list;
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        String str2 = (String) zhm.d0.o0(f1Var.k());
        if (str2 == null) {
            return f1Var.p(new FinishCommand(1609, null, null, 6));
        }
        Stack stackK = f1Var.k();
        od0.i iVar = (od0.i) te0.w.O(f1Var.j().q());
        BackendFlowExitDialog backendFlowExitDialog = iVar != null ? (BackendFlowExitDialog) iVar.g() : null;
        Object objClone = f1Var.k().clone();
        Intrinsics.i(objClone, "null cannot be cast to non-null type java.util.Stack<kotlin.String>");
        Stack stack = (Stack) objClone;
        while (true) {
            stack.pop();
            str = (String) zhm.d0.o0(stack);
            if (str == null) {
                break;
            }
            od0.i iVar2 = (od0.i) te0.w.O(f1Var.j().k());
            BackendFlow backendFlow = iVar2 != null ? (BackendFlow) iVar2.g() : null;
            BackendScreen backendScreenG = (backendFlow == null || (list = backendFlow.e) == null) ? null : g(str, list);
            if (!(backendScreenG instanceof BottomPromptScreen) && !(backendScreenG instanceof PromptScreen) && !(backendScreenG instanceof HtmlPromptScreen) && !(backendScreenG instanceof StoriesScreen)) {
                if (!(backendScreenG instanceof FormScreen) && !(backendScreenG instanceof DeeplinkScreen) && !(backendScreenG instanceof StatusDialogScreen) && !(backendScreenG instanceof SummaryScreen) && !(backendScreenG instanceof TutorialScreen) && backendScreenG != null) {
                    throw new NoWhenBranchMatchedException();
                }
                if (backendScreenG == null || !uc0.b.r(backendScreenG)) {
                    break;
                }
            }
        }
        f1Var.j().r0().set(stack);
        return str2.equals("STEP_RESULT") ? f1Var.p(new FinishCommand(null, null, null, 7)) : str != null ? f1Var.p(ngm.n.h(f(null))) : backendFlowExitDialog != null ? new pfm.h(new phc.d(f1Var, stackK, 15), 2).e(f1Var.h().n0(backendFlowExitDialog)) : f1Var.p(new FinishCommand(1609, null, null, 6));
    }

    public static FragmentNavigateCommand f(BackendScreen backendScreen) {
        zc0.j.Companion.getClass();
        return new FragmentNavigateCommand(zc0.f.f321046b, new BackendScreenContract$Configuration(backendScreen), true, 2040);
    }

    public static BackendScreen g(String str, List list) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((BackendScreen) next).getId(), str)) {
                break;
            }
        }
        return (BackendScreen) next;
    }

    public static String q(BackendFlow backendFlow) {
        return "BackendFlow(state=" + backendFlow.f63263a + ", startingViewId=" + backendFlow.f + ", currentViewId=" + backendFlow.f63266g + ", screensCount=" + backendFlow.e.size() + ")";
    }

    public efm.r T() {
        return this.k;
    }

    @Override // qi3.r
    public final efm.b a() {
        pfm.h hVar = new pfm.h(new a1(this, 3), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // qi3.r
    public final efm.b c(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        pfm.t tVarL = h().a2(id10).l(new a1(this, 1));
        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
        return tVarL;
    }

    @Override // qi3.r
    public final efm.r d() {
        return this.k;
    }

    @Override // qc0.j
    public efm.b goBack() {
        efm.d0 d0VarC = te0.w.C(j().P());
        l0 l0Var = new l0(13, new z0(this, 2));
        d0VarC.getClass();
        pfm.a aVar = new pfm.a(new ufm.f(d0VarC, l0Var, 3), new l0(14, new z0(this, 3)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public h h() {
        return this.f244416a;
    }

    @Override // qc0.j
    public efm.b h0() {
        return l();
    }

    public efm.k i() {
        rfm.h hVar = rfm.h.f253943a;
        Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
        return hVar;
    }

    public k j() {
        return this.f244418c;
    }

    public final Stack k() {
        return (Stack) j().r0().get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final efm.b l() {
        Object next;
        this.f244422l.onNext(Unit.f186387a);
        od0.i iVar = (od0.i) te0.w.O(j().k());
        Object[] objArr = 0;
        BackendFlow backendFlow = iVar != null ? (BackendFlow) iVar.g() : null;
        if (backendFlow != null && !k().isEmpty()) {
            String str = (String) k().lastElement();
            Iterator it8 = backendFlow.e.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((BackendScreen) next).getId(), str)) {
                    break;
                }
            }
            BackendScreen backendScreen = (BackendScreen) next;
            if (backendScreen instanceof TutorialScreen) {
                TutorialScreen tutorialScreen = (TutorialScreen) backendScreen;
                if (tutorialScreen.f63716j != null) {
                    return v7.x(new ufm.f(te0.w.o0(skm.p0.f264003c, new q03.m(this, tutorialScreen, objArr == true ? 1 : 0, 29)), new l0(15, new qa9.r(tutorialScreen, 11)), 3), "ignoreElement(...)");
                }
            }
        }
        boolean zF = Intrinsics.f(zhm.d0.o0(k()), "STEP_RESULT");
        boolean z = (backendFlow != null ? backendFlow.f63263a : null) == xl2.c0.COMPLETE;
        if (zF || z) {
            return r();
        }
        efm.d0 d0VarFirstOrError = h().n().firstOrError();
        l0 l0Var = new l0(16, new z0(this, 4));
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, l0Var, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final efm.b m(Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof Action.Dismiss) {
            pfm.m mVar = pfm.m.f235744a;
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (action instanceof Action.Deeplink) {
            return u(((Action.Deeplink) action).f63226c);
        }
        if (!(action instanceof Action.Submit)) {
            throw new NoWhenBranchMatchedException();
        }
        pfm.a aVarE = h().y0((Action.Submit) action).e(l());
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final rfm.s n(String backendScreenId) {
        Intrinsics.checkNotNullParameter(backendScreenId, "backendScreenId");
        boolean zContains = k().contains(backendScreenId);
        v(backendScreenId);
        rfm.o oVar = new rfm.o(new c1(this, 0));
        l0 l0Var = new l0(10, new pud.b(this, backendScreenId, zContains, 2));
        dfm.c cVar = mfm.f.d;
        rfm.s sVar = new rfm.s(new rfm.y(oVar, cVar, l0Var, cVar, mfm.f.f205043c));
        Intrinsics.checkNotNullExpressionValue(sVar, "ignoreElement(...)");
        return sVar;
    }

    public final boolean o() {
        te0.v vVarK = j().k();
        Intrinsics.checkNotNullParameter(vVarK, "<this>");
        return ta6.a.B((BackendFlow) ((od0.i) ((te0.r) vVarK).get()).c());
    }

    public final pfm.h p(NaviCommand naviCommand) {
        pfm.h hVar = new pfm.h(new b1(this, naviCommand, 2), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    public final pfm.a r() {
        efm.k kVarI = i();
        l0 l0Var = new l0(12, new z0(this, 1));
        kVarI.getClass();
        dfm.c cVar = mfm.f.d;
        pfm.a aVar = new pfm.a(new rfm.y(kVarI, cVar, l0Var, cVar, mfm.f.f205043c).m(efm.k.g(new FinishCommand(-1, null, null, 6))), new l0(17, new z0(this, 5)), 3);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final efm.b s(String chooserItemId) {
        Intrinsics.checkNotNullParameter(chooserItemId, "chooserItemId");
        efm.b bVarFlatMapCompletable = h().w0().flatMapSingle(new l0(5, new q2g.h(this, chooserItemId, 26))).flatMapCompletable(new l0(6, new z0(this, 0)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        return bVarFlatMapCompletable;
    }

    public final pfm.a t(EntitiesListItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        rfm.o oVar = new rfm.o(new c1(this, 1));
        Intrinsics.checkNotNullExpressionValue(oVar, "fromCallable(...)");
        pfm.a aVar = new pfm.a(oVar, new l0(9, new q2g.h(this, item, 25)), 3);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final efm.b u(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        if (kotlin.text.a0.H(url2, "mailto:", false)) {
            Uri uri2 = Uri.parse(url2);
            m70.a.c(kotlin.jvm.internal.t0.f186434a);
            return p(new ActivityNavigateCommand(new ChooserActivityDestination("android.intent.action.SENDTO", uri2, "", 6), null, null, null, 0, null, null, null, null, false, 1022));
        }
        if (kotlin.text.a0.y(url2, ".pdf", false)) {
            return p(new FeatureCommand(new PdfViewFeatureConfiguration(url2, null, false, o(), 30)));
        }
        if (!this.f244419g.y1(url2)) {
            return p(new FeatureCommand(new WebViewFeatureConfig(url2, null, 0, true, false, o(), 65420)));
        }
        return pd.b.n(skm.p0.f264003c, new e1(this, url2, null, 0));
    }

    public final void v(String step) {
        Intrinsics.checkNotNullParameter(step, "step");
        Object objClone = k().clone();
        Intrinsics.i(objClone, "null cannot be cast to non-null type java.util.Stack<kotlin.String>");
        Stack stack = (Stack) objClone;
        if (stack.contains(step)) {
            while (!Intrinsics.f(stack.lastElement(), step)) {
                stack.pop();
            }
        } else {
            stack.push(step);
        }
        j().r0().set(stack);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.b w(com.revolut.feature.backend_flow.domain.models.BackendFlow r17, com.revolut.feature.backend_flow.domain.models.BackendFlow r18) {
        /*
            Method dump skipped, instruction units count: 1285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qc0.f1.w(com.revolut.feature.backend_flow.domain.models.BackendFlow, com.revolut.feature.backend_flow.domain.models.BackendFlow):efm.b");
    }
}
