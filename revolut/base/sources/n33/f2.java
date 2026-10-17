package n33;

import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.card_order_new.api.BackConfirmationDialog;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.card_order_new.impl.R$string;
import com.revolut.feature.card_order_new.impl.newcard.OrderNewCardActivity;
import com.revolut.feature.card_order_new.impl.newcard.OrderNewCardContract$Configuration;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import mx0.v9;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class f2 extends bsi.a implements s {

    @NotNull
    public static final y0 Companion = new y0();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Set f211708y;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tpi.j f211709j;
    public final f9b.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final npi.f f211710l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k3l.b f211711m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final sri.m f211712n;
    public final r o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u f211713p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f0 f211714q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t2 f211715r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final OrderNewCardContract$Configuration f211716s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final opi.d f211717t;
    public final d u;
    public final b23.m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final gte.a f211718w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f211719x;

    static {
        h93.l0[] elements = {h93.l0.INDIA_GLOBAL, h93.l0.BRAZIL_GLOBAL};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f211708y = kotlin.collections.d.y0(elements);
    }

    public f2(tpi.j progressView, f9b.f errorView, npi.f dialogView, k3l.b statusViewModel, sri.m navigator, r presentationModel, u router, f0 orderNewCardMapper, t2 toolbarFactory, OrderNewCardContract$Configuration configuration, opi.d bottomDialogView, d bottomDialogProvider, b23.m juniorCardOrderSkipDialogProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(dialogView, "dialogView");
        Intrinsics.checkNotNullParameter(statusViewModel, "statusViewModel");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(orderNewCardMapper, "orderNewCardMapper");
        Intrinsics.checkNotNullParameter(toolbarFactory, "toolbarFactory");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(bottomDialogView, "bottomDialogView");
        Intrinsics.checkNotNullParameter(bottomDialogProvider, "bottomDialogProvider");
        Intrinsics.checkNotNullParameter(juniorCardOrderSkipDialogProvider, "juniorCardOrderSkipDialogProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f211709j = progressView;
        this.k = errorView;
        this.f211710l = dialogView;
        this.f211711m = statusViewModel;
        this.f211712n = navigator;
        this.o = presentationModel;
        this.f211713p = router;
        this.f211714q = orderNewCardMapper;
        this.f211715r = toolbarFactory;
        this.f211716s = configuration;
        this.f211717t = bottomDialogView;
        this.u = bottomDialogProvider;
        this.v = juniorCardOrderSkipDialogProvider;
        this.f211718w = featureToggleInteractor;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        efm.b aVar2;
        efm.d0 d0VarE;
        efm.d0 d0VarE2;
        efm.r rVar;
        char c2;
        efm.d0 d0VarM;
        boolean z;
        boolean z3;
        List listE0;
        SelectedTab selectedTab;
        y view = (y) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        OrderNewCardContract$Configuration orderNewCardContract$Configuration = this.f211716s;
        SelectedTab selectedTab2 = orderNewCardContract$Configuration.f65208a;
        boolean z4 = orderNewCardContract$Configuration.f65209b;
        int i = 13;
        int i2 = 4;
        int i3 = 10;
        r rVar2 = this.o;
        if (z4 || selectedTab2 != SelectedTab.DEBIT) {
            aVar2 = pfm.m.f235744a;
            Intrinsics.checkNotNullExpressionValue(aVar2, "complete(...)");
        } else {
            efm.d0 d0VarFirstOrError = ((t0) rVar2).l().firstOrError();
            j0 j0Var = new j0(i, new u0(this, i3));
            d0VarFirstOrError.getClass();
            aVar2 = new pfm.a(d0VarFirstOrError, j0Var, 4);
            Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        }
        int[] iArr = z0.d;
        switch (iArr[selectedTab2.ordinal()]) {
            case 1:
                d0VarE = ((t0) rVar2).e();
                break;
            case 2:
                d0VarE = efm.d0.m(Boolean.TRUE);
                Intrinsics.checkNotNullExpressionValue(d0VarE, "just(...)");
                break;
            case 3:
                d0VarE = ((t0) rVar2).p();
                break;
            case 4:
                d0VarE = ((t0) rVar2).q();
                break;
            case 5:
                d0VarE = ((t0) rVar2).n();
                break;
            case 6:
                d0VarE = ((t0) rVar2).o();
                break;
            case 7:
                d0VarE = ((t0) rVar2).m();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        int i5 = 11;
        j0 j0Var2 = new j0(15, new u0(this, i5));
        d0VarE.getClass();
        pfm.a aVar3 = new pfm.a(d0VarE, j0Var2, 4);
        Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
        pfm.a aVarE = aVar2.e(aVar3);
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        SelectedTab selectedTab3 = orderNewCardContract$Configuration.f65208a;
        int i6 = 3;
        int i21 = 5;
        int i22 = 6;
        if (z4 && selectedTab3 == (selectedTab = SelectedTab.DEBIT)) {
            efm.r rVarJust = efm.r.just(zhm.u.c(selectedTab));
            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
            rVar = rVarJust;
        } else {
            switch (iArr[selectedTab3.ordinal()]) {
                case 1:
                    d0VarE2 = ((t0) rVar2).e();
                    break;
                case 2:
                    d0VarE2 = efm.d0.m(Boolean.TRUE);
                    Intrinsics.checkNotNullExpressionValue(d0VarE2, "just(...)");
                    break;
                case 3:
                    d0VarE2 = ((t0) rVar2).p();
                    break;
                case 4:
                    d0VarE2 = ((t0) rVar2).q();
                    break;
                case 5:
                    d0VarE2 = ((t0) rVar2).n();
                    break;
                case 6:
                    d0VarE2 = ((t0) rVar2).o();
                    break;
                case 7:
                    d0VarE2 = ((t0) rVar2).m();
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            j0 j0Var3 = new j0(i5, new f23.v(selectedTab3, 1));
            d0VarE2.getClass();
            ufm.i iVar = new ufm.i(d0VarE2, j0Var3, 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            t0 t0Var = (t0) rVar2;
            efm.d0 a7 = t0Var.e();
            efm.d0 b4 = t0Var.p();
            pfm.z c3 = t0Var.q();
            efm.d0 d = t0Var.n();
            ufm.i e = t0Var.o();
            ufm.i f = t0Var.m();
            efm.d0 g3 = t0Var.l().firstOrError();
            Intrinsics.checkNotNullExpressionValue(g3, "firstOrError(...)");
            Intrinsics.checkNotNullParameter(a7, "a");
            Intrinsics.checkNotNullParameter(b4, "b");
            Intrinsics.checkNotNullParameter(c3, "c");
            Intrinsics.checkNotNullParameter(d, "d");
            Intrinsics.checkNotNullParameter(e, "e");
            Intrinsics.checkNotNullParameter(f, "f");
            Intrinsics.checkNotNullParameter(g3, "g");
            uyd.y yVar = new uyd.y(22);
            mfm.f.b(b4, "source2 is null");
            mfm.f.b(g3, "source7 is null");
            efm.d0 d0VarF = efm.d0.F(new kl.t1(yVar, 12), a7, b4, c3, d, e, f, g3);
            Intrinsics.checkNotNullExpressionValue(d0VarF, "zip(...)");
            ufm.i iVar2 = new ufm.i(d0VarF, new j0(12, new u0(this, 9)), 1);
            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
            int i32 = efm.i.f125385a;
            j01.b bVar = new j01.b(efm.d0.h(new qfm.c(new efm.h0[]{iVar, iVar2}, 1)), 7);
            Intrinsics.checkNotNullExpressionValue(bVar, "toObservable(...)");
            rVar = bVar;
        }
        t0 t0Var2 = (t0) rVar2;
        w wVar = t0Var2.i;
        ang.f fVar = t0Var2.f211822h;
        s2 s2Var = (s2) wVar;
        te0.j jVar = s2Var.f211809c;
        KProperty[] kPropertyArr = s2.f211807p;
        te0.e value = jVar.getValue(s2Var, kPropertyArr[1]);
        te0.s sVar = te0.s.f270018a;
        efm.r rVarC = value.c(sVar);
        fk3.a aVar4 = t0Var2.f211821g;
        efm.r rVarStartWith = t0Var2.h().startWith(new Data(null, null, false, 7, null));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        efm.r rVarX = t0Var2.b().x();
        od0.i.Companion.getClass();
        od0.i iVar3 = od0.i.f224256b;
        efm.r rVarDistinctUntilChanged = rVarX.startWith(iVar3).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        efm.r rVarDistinctUntilChanged2 = new sfm.b(t0Var2.q(), new n30.d(new i0(t0Var2, 2), 23), 2).startWith(iVar3).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
        ufm.i iVar4 = new ufm.i(fVar.f(false), new n30.d(new c(i21), 10), 1);
        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
        ik3.c cVar = (ik3.c) aVar4;
        ufm.i iVar5 = new ufm.i(te0.w.H0(iVar4, cVar.p()), new n30.d(new c(i22), 11), 1);
        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
        c cVar2 = new c(7);
        zhm.h0 h0Var = zhm.h0.f322473a;
        efm.r rVarDistinctUntilChanged3 = ue0.e.I(iVar5, h0Var, cVar2).x().startWith(Boolean.TRUE).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged3, "distinctUntilChanged(...)");
        ufm.i iVar6 = new ufm.i(fVar.f(false), new n30.d(new c(9), 17), 1);
        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
        ufm.i iVar7 = new ufm.i(te0.w.H0(iVar6, cVar.p()), new n30.d(new c(8), 12), 1);
        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
        efm.r rVarX2 = iVar7.x();
        Boolean bool = Boolean.FALSE;
        efm.r rVarDistinctUntilChanged4 = rVarX2.startWith(bool).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged4, "distinctUntilChanged(...)");
        if (t0Var2.f()) {
            d0VarM = efm.d0.m(bool);
            Intrinsics.checkNotNullExpressionValue(d0VarM, "just(...)");
            c2 = 1;
        } else {
            c2 = 1;
            ufm.i iVar8 = new ufm.i(fVar.f(false), new j0(5, new i0(t0Var2, 7)), 1);
            Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
            d0VarM = iVar8;
        }
        efm.r rVarDistinctUntilChanged5 = d0VarM.x().startWith(bool).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged5, "distinctUntilChanged(...)");
        s2 s2Var2 = (s2) t0Var2.i;
        int i33 = 0;
        Flow flowE = boh.f.e(vkm.q.Q(rd0.e.b(s2Var2.f211809c.getValue(s2Var2, kPropertyArr[c2]).c(sVar)), new o0(null, t0Var2, i33)), new i0(t0Var2, i33));
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        efm.r rVarC2 = rd0.e.c(flowE, gVar);
        k18.c cVar3 = t0Var2.u;
        efm.r map = pd.b.r(kli.a.h(hng.g.b(((ang.b) ((l61.a) cVar3.f180140b)).f7765a), ((ang.f) cVar3.f180141c).k(false)), new n1.y(cVar3, 10)).map(new n30.d(new c(i6), 9));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarDistinctUntilChanged6 = ue0.e.H(map, h0Var, new c(i2)).startWith(iVar3).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged6, "distinctUntilChanged(...)");
        efm.r rVarL = t0Var2.l();
        efm.r rVarX3 = ((gi5.d) t0Var2.v).c(null).x();
        sh5.c.Companion.getClass();
        efm.r rVarStartWith2 = rVarX3.startWith(sh5.b.a());
        Intrinsics.checkNotNullExpressionValue(rVarStartWith2, "startWith(...)");
        efm.r rVarDistinctUntilChanged7 = new ufm.i(t0Var2.o(), new j0(6, new i0(t0Var2, 9)), 0).x().startWith(new q(false, false)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged7, "distinctUntilChanged(...)");
        sfm.b bVarG = aVarE.g(te0.w.u(rVar, rVarC, rVarStartWith, rVarDistinctUntilChanged, rVarDistinctUntilChanged2, rVarDistinctUntilChanged3, rVarDistinctUntilChanged4, rVarDistinctUntilChanged5, rVarC2, rVarDistinctUntilChanged6, rVarL, rVarStartWith2, rVarDistinctUntilChanged7, rd0.e.c(((om4.f) t0Var2.C).b(), gVar)).map(new j0(27, new u0(this, 15))));
        zn3.a aVar5 = orderNewCardContract$Configuration.f65211g;
        zn3.a aVar6 = zn3.a.ONBOARDING;
        f0 f0Var = this.f211714q;
        if (aVar5 == aVar6) {
            f0Var.getClass();
            listE0 = zhm.v.k(new pb0("item_loading_0"), new pb0("item_loading_1"), new pb0("item_loading_2"));
            z3 = true;
            z = false;
        } else {
            f0Var.getClass();
            IntRange intRange = new IntRange(1, 5, 1);
            ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
            vim.f it8 = intRange.iterator();
            while (it8.f289625c) {
                arrayList.add(new com.revolut.core.ui_kit.views.q(a0.d.n("TAB_LOADING_", it8.nextInt()), Tabs.c.a.f58897a, 50));
            }
            z = false;
            z3 = true;
            listE0 = zhm.d0.E0(zhm.v.k(new pb0("item_loading_0"), new pb0("item_loading_1"), new pb0("item_loading_2")), zhm.u.c(new TabsDelegate.Model("TABS_ITEM_ID", arrayList, null, null, null, null, 0, R$attr.uikit_dp24, null, 7932)));
        }
        efm.r rVarDistinctUntilChanged8 = bVarG.startWith(new v(listE0, this.f211715r.a(t0Var2.g() ^ z3, z, orderNewCardContract$Configuration), null, z)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged8, "distinctUntilChanged(...)");
        efm.r rVarF = o70.a.f(rVarDistinctUntilChanged8);
        f9b.f fVar2 = this.k;
        efm.r rVarN = hx7.a.N(rVarF, fVar2, z, z3);
        n09.j0 j0Var4 = new n09.j0(this, view, 20);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarN.onErrorResumeNext(new ly7.g(6, new n0c.p(new BreadcrumbException(), 27)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        n1i.b bVar2 = new n1i.b(1, j0Var4);
        akl.s sVar2 = this.i;
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(bVar2, new n1i.b(1, sVar2), new j7a.j(17, function0J));
        ifm.b bVar3 = this.f239031a;
        te0.w.j0(bVar3, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        OrderNewCardActivity orderNewCardActivity = (OrderNewCardActivity) view;
        efm.r rVarFilter = orderNewCardActivity.Z0().f58608l.filter(new j0(7, new v0(2)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        pfm.a aVar7 = new pfm.a(te0.w.D(rVarFilter, new u0(this, 5)), new ly7.g(6, new n0c.p(new BreadcrumbException(), 17)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        m72.b.z(sVar2, aVar7, new j7a.j(17, f1.f211707a), "subscribe(...)", bVar3);
        efm.r rVarFilter2 = orderNewCardActivity.Z0().f58608l.filter(new j0(8, new c(29)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        pfm.a aVar8 = new pfm.a(te0.w.D(rVarFilter2, new u0(this, 6)), new ly7.g(6, new n0c.p(new BreadcrumbException(), 18)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
        m72.b.z(sVar2, aVar8, new j7a.j(17, g1.f211722a), "subscribe(...)", bVar3);
        efm.r rVarFilter3 = orderNewCardActivity.Z0().f58608l.filter(new j0(10, new v0(0)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter3, "filter(...)");
        pfm.a aVar9 = new pfm.a(te0.w.D(rVarFilter3, new u0(this, 7)), new ly7.g(6, new n0c.p(new BreadcrumbException(), 19)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar9, "onErrorResumeNext(...)");
        m72.b.z(sVar2, aVar9, new j7a.j(17, h1.f211729a), "subscribe(...)", bVar3);
        ProductSelectionDelegate productSelectionDelegate = orderNewCardActivity.A0;
        int i43 = 2;
        efm.r rVarMergeWith = productSelectionDelegate.p().map(new n30.d(new c(0), 7)).mergeWith(orderNewCardActivity.H0.f53218h.map(new n30.d(new c(1), 8))).mergeWith(orderNewCardActivity.z0.f52780c.map(new n30.d(new c(i43), i43)));
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        u0 u0Var = new u0(this, 8);
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarMergeWith.onErrorResumeNext(new ly7.g(6, new n0c.p(new BreadcrumbException(), 9)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new n1i.b(1, u0Var), new n1i.b(1, sVar2), new j7a.j(17, function0J2));
        te0.w.j0(bVar3, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        pfm.a aVar10 = new pfm.a(te0.w.D(te0.w.a0(productSelectionDelegate.p(), new n1j.t(27)), new u0(this, 16)), new ly7.g(6, new n0c.p(new BreadcrumbException(), 20)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar10, "onErrorResumeNext(...)");
        m72.b.z(sVar2, aVar10, new j7a.j(17, i1.f211736a), "subscribe(...)", bVar3);
        efm.r map2 = orderNewCardActivity.B0.f53530c.map(new n30.d(new n1j.t(29), 6));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        u0 u0Var2 = new u0(this, 0);
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = map2.onErrorResumeNext(new ly7.g(6, new n0c.p(new BreadcrumbException(), 10)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new n1i.b(1, u0Var2), new n1i.b(1, sVar2), new j7a.j(17, function0J3));
        te0.w.j0(bVar3, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        pfm.a aVar11 = new pfm.a(te0.w.D(orderNewCardActivity.b1().f59410q, new u0(this, 1)), new ly7.g(6, new n0c.p(new BreadcrumbException(), 12)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar11, "onErrorResumeNext(...)");
        m72.b.z(sVar2, aVar11, new j7a.j(17, j1.f211743a), "subscribe(...)", bVar3);
        efm.r rVarMergeWith2 = orderNewCardActivity.D0.f52339c.f121375b.map(new n30.d(new n1j.t(25), 3)).mergeWith(orderNewCardActivity.C0.f53515c.f121375b.map(new n30.d(new n1j.t(26), 4)));
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith2, "mergeWith(...)");
        pfm.a aVar12 = new pfm.a(te0.w.D(rVarMergeWith2, new u0(this, 2)), new ly7.g(6, new n0c.p(new BreadcrumbException(), 13)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar12, "onErrorResumeNext(...)");
        m72.b.z(sVar2, aVar12, new j7a.j(17, b1.f211690a), "subscribe(...)", bVar3);
        pfm.a aVar13 = new pfm.a(te0.w.D(orderNewCardActivity.b1().o.f57403b, new v9(1, this, f2.class, "processMenuItemClick", "processMenuItemClick(Ljava/lang/String;)Lio/reactivex/Completable;", 0, 9)), new ly7.g(6, new n0c.p(new BreadcrumbException(), 14)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar13, "onErrorResumeNext(...)");
        m72.b.z(sVar2, aVar13, new j7a.j(17, c1.f211694a), "subscribe(...)", bVar3);
        pfm.a aVar14 = new pfm.a(te0.w.D(orderNewCardActivity.F0.d.f121375b.map(new n30.d(new n1j.t(28), 5)), new v9(1, this, f2.class, "processBottomDialogButtonClicks", "processBottomDialogButtonClicks(Ljava/lang/String;)Lio/reactivex/Completable;", 0, 10)), new ly7.g(6, new n0c.p(new BreadcrumbException(), 15)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar14, "onErrorResumeNext(...)");
        m72.b.z(sVar2, aVar14, new j7a.j(17, d1.f211697a), "subscribe(...)", bVar3);
        efm.r rVarA0 = te0.w.a0(orderNewCardActivity.I0.f52310c.f121375b, new u0(this, 3));
        int i59 = 0;
        int i66 = 1;
        v9 v9Var = new v9(i66, this.f211712n, sri.m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", i59, 11);
        Function0 function0J4 = J();
        efm.r rVarOnErrorResumeNext4 = rVarA0.onErrorResumeNext(new ly7.g(6, new n0c.p(new BreadcrumbException(), 11)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new n1i.b(1, v9Var), new n1i.b(1, sVar2), new j7a.j(17, function0J4));
        te0.w.j0(bVar3, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        pfm.a aVar15 = new pfm.a(hx7.a.L(o70.a.g(te0.w.D(orderNewCardActivity.G0.f53218h, new u0(this, 4))), fVar2, true, null, 24), new ly7.g(6, new n0c.p(new BreadcrumbException(), 16)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar15, "onErrorResumeNext(...)");
        m72.b.z(sVar2, aVar15, new j7a.j(17, e1.f211702a), "subscribe(...)", bVar3);
        r2 r2Var = (r2) this.f211713p;
        efm.r rVarHide = r2Var.f211802p.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.r rVarF2 = o70.a.f(rVarHide);
        v9 v9Var2 = new v9(i66, this.f211712n, sri.m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", i59, 12);
        Function0 function0J5 = J();
        efm.r rVarOnErrorResumeNext5 = rVarF2.onErrorResumeNext(new ly7.g(6, new n0c.p(new BreadcrumbException(), 21)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext5, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe5 = rVarOnErrorResumeNext5.subscribe(new n1i.b(1, v9Var2), new n1i.b(1, sVar2), new j7a.j(17, function0J5));
        te0.w.j0(bVar3, cVarSubscribe5);
        Intrinsics.h(cVarSubscribe5);
        efm.r rVarF3 = o70.a.f(r2Var.f211803q);
        v9 v9Var3 = new v9(i66, this.f211710l, npi.f.class, "showDialog", "showDialog(Lcom/revolut/retail/common/ui/activity/delegate/dialog/DialogConfiguration;)V", i59, 13);
        Function0 function0J6 = J();
        efm.r rVarOnErrorResumeNext6 = rVarF3.onErrorResumeNext(new ly7.g(6, new n0c.p(new BreadcrumbException(), 22)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext6, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe6 = rVarOnErrorResumeNext6.subscribe(new n1i.b(1, v9Var3), new n1i.b(1, sVar2), new j7a.j(17, function0J6));
        te0.w.j0(bVar3, cVarSubscribe6);
        Intrinsics.h(cVarSubscribe6);
        efm.r rVarF4 = o70.a.f(r2Var.f211804r);
        int i74 = 0;
        int i92 = 1;
        v9 v9Var4 = new v9(i92, this.f211711m, k3l.b.class, "show", "show(Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration;)V", i74, 14);
        Function0 function0J7 = J();
        efm.r rVarOnErrorResumeNext7 = rVarF4.onErrorResumeNext(new ly7.g(6, new n0c.p(new BreadcrumbException(), 23)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext7, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe7 = rVarOnErrorResumeNext7.subscribe(new n1i.b(1, v9Var4), new n1i.b(1, sVar2), new j7a.j(17, function0J7));
        te0.w.j0(bVar3, cVarSubscribe7);
        Intrinsics.h(cVarSubscribe7);
        efm.b bVarFlatMapCompletable = ((k3l.d) this.f211711m).f180813j.flatMapCompletable(new j0(9, new v9(i92, this.f211713p, u.class, "onStatusViewResult", "onStatusViewResult(Lcom/revolut/retail/operation_status/modal_status/StatusViewResult;)Lio/reactivex/Completable;", i74, 15)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        ly7.g gVar2 = new ly7.g(6, new n0c.p(new BreadcrumbException(), 24));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar16 = new pfm.a(bVarFlatMapCompletable, gVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar16, "onErrorResumeNext(...)");
        m72.b.z(sVar2, aVar16, new j7a.j(17, k1.f211752a), "subscribe(...)", bVar3);
        efm.r rVarHide2 = ((ihm.j) t0Var2.D.d).hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide2, "hide(...)");
        efm.r rVarS = mo3.a.s(o70.a.f(rVarHide2), this.f211709j);
        Intrinsics.checkNotNullExpressionValue(rVarS, "withDataProgress(...)");
        efm.b bVarFlatMapCompletable2 = hx7.a.N(rVarS, fVar2, false, false).flatMapCompletable(new j0(14, new v9(i92, this.f211713p, u.class, "onCancelOrderResult", "onCancelOrderResult(Lcom/revolut/data/model/Data;)Lio/reactivex/Completable;", i74, 16)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable2, "flatMapCompletable(...)");
        ly7.g gVar3 = new ly7.g(6, new n0c.p(new BreadcrumbException(), 25));
        bVarFlatMapCompletable2.getClass();
        pfm.a aVar17 = new pfm.a(bVarFlatMapCompletable2, gVar3, 2);
        Intrinsics.checkNotNullExpressionValue(aVar17, "onErrorResumeNext(...)");
        m72.b.z(sVar2, aVar17, new j7a.j(17, l1.f211758a), "subscribe(...)", bVar3);
        efm.b bVarFlatMapCompletable3 = orderNewCardActivity.f65207x0.flatMapCompletable(new j0(23, new u0(this, 12)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable3, "flatMapCompletable(...)");
        ly7.g gVar4 = new ly7.g(6, new n0c.p(new BreadcrumbException(), 26));
        bVarFlatMapCompletable3.getClass();
        pfm.a aVar18 = new pfm.a(bVarFlatMapCompletable3, gVar4, 2);
        Intrinsics.checkNotNullExpressionValue(aVar18, "onErrorResumeNext(...)");
        m72.b.z(sVar2, aVar18, new j7a.j(17, m1.f211765a), "subscribe(...)", bVar3);
    }

    public final void Q(kc8.a aVar) {
        mzb.e task = new mzb.e(this, aVar, 9);
        Intrinsics.checkNotNullParameter("LAUNCH_JUNIOR_CARD_ORDER", "key");
        Intrinsics.checkNotNullParameter(task, "task");
        pri.g gVar = this.f239032b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter("LAUNCH_JUNIOR_CARD_ORDER", "key");
        Intrinsics.checkNotNullParameter(task, "task");
        pfm.h hVar = new pfm.h(new m1i.t(gVar, task, 29), 1);
        Intrinsics.checkNotNullExpressionValue(hVar, "defer(...)");
        efm.b bVarU = mo3.a.u(o70.a.g(hVar), this.f211709j, true);
        Intrinsics.checkNotNullExpressionValue(bVarU, "withProgress$default(...)");
        pfm.a aVar2 = new pfm.a(hx7.a.L(bVarU, this.k, true, null, 24), new ly7.g(6, new n0c.p(new BreadcrumbException(), 8)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new n1i.b(1, this.i), new j7a.j(17, a1.f211684a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f239031a, hVarW);
    }

    public final pfm.a R(e13.a aVar, h93.l0 l0Var) {
        int i = z0.f211857a[aVar.ordinal()];
        u uVar = this.f211713p;
        if (i == 1) {
            return ((r2) uVar).l(l0Var);
        }
        if (i == 2) {
            return ((r2) uVar).m(l0Var);
        }
        if (i == 3) {
            return ((r2) uVar).k(l0Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void S(e13.a aVar) {
        pfm.a aVar2;
        int i = z0.f211857a[aVar.ordinal()];
        r rVar = this.o;
        if (i == 1) {
            efm.d0 d0VarFirstOrError = ((t0) rVar).l().firstOrError();
            j0 j0Var = new j0(16, new w0(this, aVar, 0));
            d0VarFirstOrError.getClass();
            aVar2 = new pfm.a(d0VarFirstOrError, j0Var, 4);
        } else if (i == 2) {
            efm.d0 d0VarFirstOrError2 = ((t0) rVar).l().firstOrError();
            j0 j0Var2 = new j0(17, new w0(this, aVar, 1));
            d0VarFirstOrError2.getClass();
            aVar2 = new pfm.a(d0VarFirstOrError2, j0Var2, 4);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            efm.d0 d0VarFirstOrError3 = ((t0) rVar).l().firstOrError();
            j0 j0Var3 = new j0(18, new w0(this, aVar, 2));
            d0VarFirstOrError3.getClass();
            aVar2 = new pfm.a(d0VarFirstOrError3, j0Var3, 4);
        }
        efm.b bVarU = mo3.a.u(aVar2, this.f211709j, true);
        Intrinsics.checkNotNullExpressionValue(bVarU, "withProgress$default(...)");
        pfm.a aVar3 = new pfm.a(hx7.a.L(bVarU, this.k, false, null, 24), new ly7.g(6, new n0c.p(new BreadcrumbException(), 29)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar3.w(new n1i.b(1, this.i), new j7a.j(17, o1.f211775a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f239031a, hVarW);
    }

    public final boolean T(do3.n nVar) {
        boolean zC = ((jte.d) this.f211718w).c(CardsCoreApi$Toggles.LocalComboCardsImprovements.f65565c);
        r rVar = this.o;
        if (zC) {
            wi0.b.Companion.getClass();
            return te0.w.S(nVar, wi0.b.A) && !((t0) rVar).g() && this.f211719x;
        }
        wi0.b.Companion.getClass();
        return te0.w.S(nVar, wi0.b.A) && !((t0) rVar).g();
    }

    public final boolean U(do3.n nVar, boolean z) {
        wi0.b.Companion.getClass();
        if (te0.w.S(nVar, wi0.b.O0)) {
            return z || !((t0) this.o).g();
        }
        return false;
    }

    public final pfm.h V(BackConfirmationDialog dialog) {
        this.u.getClass();
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        rp0.t tVar = new rp0.t(dialog.f64930a, dialog.f64931b, null, 28);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        Clause clause = dialog.f64932c;
        int i = R$attr.uikit_dp16;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("BACK_DIALOG_PRIMARY_BUTTON_ID", defaultFilledButton, null, clause, false, null, null, R$attr.uikit_dp24, 0, i, i, 1520);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
        Clause clause2 = dialog.d;
        int i2 = R$attr.uikit_dp16;
        return (pfm.h) ((opi.b) this.f211717t).a0(new rp0.y(zhm.v.k(model, new LargeActionButtonDelegate.Model("BACK_DIALOG_SECONDARY_BUTTON_ID", defaultFilledButton2, null, clause2, false, null, null, i2, R$attr.uikit_dp24, i2, i2, 496)), tVar, null, null, null, null, "ORDER_NEW_CARD_BOTTOM_DIALOG_RECYCLER", null, null, null, 3836));
    }

    public final boolean W(do3.n nVar) {
        if (!((jte.d) this.f211718w).c(CardsCoreApi$Toggles.LocalComboCardsImprovements.f65565c)) {
            wi0.b.Companion.getClass();
            return te0.w.S(nVar, wi0.b.A);
        }
        wi0.b.Companion.getClass();
        if (te0.w.S(nVar, wi0.b.A)) {
            return ((t0) this.o).g() || !this.f211719x;
        }
        return false;
    }

    public final pfm.h X() {
        this.v.getClass();
        Intrinsics.checkNotNullParameter("ORDER_NEW_CARD_BOTTOM_DIALOG_RECYCLER", "delegatesKey");
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.rev_u18_card_order_skip_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.rev_u18_card_order_skip_confirmation_subtitle, null, null, 14), null, 28);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rev_u18_card_order_skip_confirmation_button_get_card, null, null, 14);
        int i = R$attr.uikit_dp16;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("LIST_ID_ACTION_CONTINUE", defaultFilledButton, null, textLocalisedClause, true, null, null, i, R$attr.uikit_dp8, i, i, DefaultFrameSampler.DESIRED_FRAME_WIDTH);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.rev_u18_card_order_skip_confirmation_button_skip, null, null, 14);
        int i2 = R$attr.uikit_dp16;
        return (pfm.h) ((opi.b) this.f211717t).a0(new rp0.y(zhm.v.k(model, new LargeActionButtonDelegate.Model("LIST_ID_ACTION_CANCEL", defaultFilledButton2, null, textLocalisedClause2, true, null, null, R$attr.uikit_dp8, R$attr.uikit_dp24, i2, i2, DefaultFrameSampler.DESIRED_FRAME_WIDTH)), tVar, null, null, null, null, "ORDER_NEW_CARD_BOTTOM_DIALOG_RECYCLER", null, null, null, 3836));
    }

    public final pfm.a Y(e13.a aVar) {
        efm.d0 d0VarFirst = m70.a.g(((t0) this.o).h(), null, new l0(4), 1).first(zhm.f0.f322471a);
        j0 j0Var = new j0(24, new x0(aVar, 1));
        d0VarFirst.getClass();
        ufm.i iVar = new ufm.i(d0VarFirst, j0Var, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        pfm.a aVar2 = new pfm.a(o70.a.i(iVar), new j0(25, new w0(this, aVar, 4)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        return aVar2;
    }

    public final pfm.a Z(e13.a aVar) {
        efm.d0 d0VarFirst = m70.a.g(((t0) this.o).h(), null, new l0(3), 1).first(zhm.f0.f322471a);
        j0 j0Var = new j0(21, new x0(aVar, 0));
        d0VarFirst.getClass();
        ufm.i iVar = new ufm.i(d0VarFirst, j0Var, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        pfm.a aVar2 = new pfm.a(o70.a.i(iVar), new j0(22, new w0(this, aVar, 3)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        return aVar2;
    }
}
