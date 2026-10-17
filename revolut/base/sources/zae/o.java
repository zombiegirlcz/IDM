package zae;

import bb2.t;
import com.google.common.collect.ImmutableMap;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionableIconDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.SubscriptionDetailsActivity;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.SubscriptionDetailsScreenContract$Configuration;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import ip0.dg;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import le.u1;
import org.jetbrains.annotations.NotNull;
import qfm.e1;
import qfm.j1;
import qfm.p0;
import qfm.r0;
import qua.u;
import wli.x;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends pri.a implements q {

    @NotNull
    public static final h Companion = new h();
    public final bce.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qce.j f320672j;
    public final sri.m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xpi.g f320673l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f320674m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SubscriptionDetailsScreenContract$Configuration f320675n;
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c70.a f320676p;

    public o(qb8.b juniorAllowancePresenterDelegate, bce.a presentationModel, qce.j actionsPresenterDelegate, sri.m navigator, xpi.g navBarWithToolbarView, ImmutableMap contentProviders, SubscriptionDetailsScreenContract$Configuration configuration, x deeplinkHandler, c70.a clipboard) {
        Intrinsics.checkNotNullParameter(juniorAllowancePresenterDelegate, "juniorAllowancePresenterDelegate");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(actionsPresenterDelegate, "actionsPresenterDelegate");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(contentProviders, "contentProviders");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        this.i = presentationModel;
        this.f320672j = actionsPresenterDelegate;
        this.k = navigator;
        this.f320673l = navBarWithToolbarView;
        this.f320674m = contentProviders;
        this.f320675n = configuration;
        this.o = deeplinkHandler;
        this.f320676p = clipboard;
        P(v.k(actionsPresenterDelegate, juniorAllowancePresenterDelegate));
        String subscriptionId = configuration.f89239a;
        bce.g gVar = (bce.g) presentationModel;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        ((bce.c) gVar.f14439a).w0().set(subscriptionId);
    }

    public static final abe.a Q(o oVar, hce.c cVar) {
        String str;
        oVar.getClass();
        hce.b bVar = cVar.f150886a;
        switch (i.f320665a[bVar.f150883a.f249314a.f160152c.ordinal()]) {
            case 1:
                str = !u.x(bVar.f150883a) ? "DIRECT_DEBIT" : "PAYTO_MANDATE";
                break;
            case 2:
                str = "WALLET";
                break;
            case 3:
                str = "INTERNAL_TRANSFER";
                break;
            case 4:
                str = "BANK_TRANSFER";
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                str = "CARD_MANDATE";
                break;
            case 9:
                str = !u.m(bVar.f150883a) ? "BILL" : "BILL_BOLETO";
                break;
            case 10:
            case 11:
            case 12:
                str = "BILLS_AND_TAXES";
                break;
            case 13:
                str = "QR_CODE";
                break;
            case 14:
                str = "PIX_MANDATE";
                break;
            case 15:
                str = "UPI";
                break;
            case 16:
                str = "UPI_MANDATE";
                break;
            case 17:
                str = "GIRO_DIRECT_DEBIT";
                break;
            case 18:
                str = "MASAV_DIRECT_DEBIT";
                break;
            case 19:
                str = "MOBILE_PLAN_SUBSCRIPTION";
                break;
            case 20:
            case 21:
                str = "SAVINGS_VAULTS";
                break;
            case 22:
                str = "CREDIT_SCHEDULED_PAYMENTS";
                break;
            case 23:
                str = "BILL_ACCOUNTS";
                break;
            case 24:
                str = "PAID_PLAN";
                break;
            case 25:
                str = "REFUND";
                break;
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
                str = "BASIC";
                break;
            case 37:
                str = "JUNIOR_ALLOWANCE";
                break;
            case 38:
                str = "COBRANDS";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        abe.a aVar = (abe.a) oVar.f320674m.get(str);
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("No provider registered for key ".concat(str));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        r view = (r) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        IntRange intRange = new IntRange(0, 10, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new pb0(a0.d.n("shimmer_row", it8.nextInt())));
        }
        SubscriptionDetailsActivity subscriptionDetailsActivity = (SubscriptionDetailsActivity) view;
        subscriptionDetailsActivity.setItems(arrayList);
        ?? r2 = subscriptionDetailsActivity.z0;
        ?? r3 = subscriptionDetailsActivity.D0;
        ?? r4 = subscriptionDetailsActivity.y0;
        efm.b bVarR = R();
        Function1 function1K = K();
        xy7.l lVar = new xy7.l(5, new j(new BreadcrumbException(), 7));
        bVarR.getClass();
        pfm.a aVar2 = new pfm.a(bVarR, lVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new yma.h(4, function1K), new yzc.p(6, k.f320668a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, hVarW);
        r0 r0VarD = te0.w.D(((ErrorDelegate) subscriptionDetailsActivity.M0.getValue()).f52226c, new f(this, 0));
        Function1 function1K2 = K();
        pfm.a aVar3 = new pfm.a(r0VarD, new xy7.l(5, new j(new BreadcrumbException(), 8)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new yma.h(4, function1K2), new yzc.p(6, l.f320669a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar, hVarW2);
        xpi.c cVar = (xpi.c) this.f320673l;
        efm.r rVarQ = cVar.Q();
        f fVar = new f(this, 1);
        Function1 function1K3 = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarQ.onErrorResumeNext(new xy7.l(5, new z63.j(new BreadcrumbException(), 28)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new yma.h(4, fVar), new yma.h(4, function1K3), new yzc.p(6, function0J));
        te0.w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        ihm.f fVar2 = ((LargeActionButtonDelegate) subscriptionDetailsActivity.O0.getValue()).d.f121375b;
        f fVar3 = new f(this, 2);
        Function1 function1K4 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = fVar2.onErrorResumeNext(new xy7.l(5, new z63.j(new BreadcrumbException(), 29)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new yma.h(4, fVar3), new yma.h(4, function1K4), new yzc.p(6, function0J2));
        te0.w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        ihm.f fVar4 = ((ActionsDelegate) subscriptionDetailsActivity.E0.getValue()).f51611c.f121375b;
        f fVar5 = new f(this, 3);
        Function1 function1K5 = K();
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = fVar4.onErrorResumeNext(new xy7.l(5, new j(new BreadcrumbException(), 0)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new yma.h(4, fVar5), new yma.h(4, function1K5), new yzc.p(6, function0J3));
        te0.w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        NavBarWithToolbar navBarWithToolbar = cVar.f307974j;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        efm.r rVarQ0 = navBarWithToolbar.q0();
        f fVar6 = new f(this, 4);
        Function1 function1K6 = K();
        Function0 function0J4 = J();
        efm.r rVarOnErrorResumeNext4 = rVarQ0.onErrorResumeNext(new xy7.l(5, new j(new BreadcrumbException(), 1)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new yma.h(4, fVar6), new yma.h(4, function1K6), new yzc.p(6, function0J4));
        te0.w.j0(bVar, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        NavBarWithToolbar navBarWithToolbar2 = cVar.f307974j;
        if (navBarWithToolbar2 == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        efm.r rVarX0 = navBarWithToolbar2.x0();
        f fVar7 = new f(this, 5);
        Function1 function1K7 = K();
        Function0 function0J5 = J();
        efm.r rVarOnErrorResumeNext5 = rVarX0.onErrorResumeNext(new xy7.l(5, new j(new BreadcrumbException(), 2)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext5, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe5 = rVarOnErrorResumeNext5.subscribe(new yma.h(4, fVar7), new yma.h(4, function1K7), new yzc.p(6, function0J5));
        te0.w.j0(bVar, cVarSubscribe5);
        Intrinsics.h(cVarSubscribe5);
        ihm.f fVar8 = ((CellDetailsChevronDelegate) subscriptionDetailsActivity.A0.getValue()).f51821c;
        f fVar9 = new f(this, 6);
        Function1 function1K8 = K();
        Function0 function0J6 = J();
        efm.r rVarOnErrorResumeNext6 = fVar8.onErrorResumeNext(new xy7.l(5, new j(new BreadcrumbException(), 3)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext6, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe6 = rVarOnErrorResumeNext6.subscribe(new yma.h(4, fVar9), new yma.h(4, function1K8), new yzc.p(6, function0J6));
        te0.w.j0(bVar, cVarSubscribe6);
        Intrinsics.h(cVarSubscribe6);
        ihm.f fVar10 = ((RowDelegate) subscriptionDetailsActivity.F0.getValue()).f53218h;
        f fVar11 = new f(this, 7);
        Function1 function1K9 = K();
        Function0 function0J7 = J();
        efm.r rVarOnErrorResumeNext7 = fVar10.onErrorResumeNext(new xy7.l(5, new j(new BreadcrumbException(), 4)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext7, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe7 = rVarOnErrorResumeNext7.subscribe(new yma.h(4, fVar11), new yma.h(4, function1K9), new yzc.p(6, function0J7));
        te0.w.j0(bVar, cVarSubscribe7);
        Intrinsics.h(cVarSubscribe7);
        ihm.f fVar12 = ((ListSubheaderDelegate) subscriptionDetailsActivity.f89238x0.getValue()).f52707c;
        f fVar13 = new f(this, 8);
        Function1 function1K10 = K();
        Function0 function0J8 = J();
        efm.r rVarOnErrorResumeNext8 = fVar12.onErrorResumeNext(new xy7.l(5, new j(new BreadcrumbException(), 5)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext8, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe8 = rVarOnErrorResumeNext8.subscribe(new yma.h(4, fVar13), new yma.h(4, function1K10), new yzc.p(6, function0J8));
        te0.w.j0(bVar, cVarSubscribe8);
        Intrinsics.h(cVarSubscribe8);
        ihm.f fVar14 = ((CellDetailsActionDelegate) r4.getValue()).d;
        f fVar15 = new f(this, 9);
        Function1 function1K11 = K();
        Function0 function0J9 = J();
        efm.r rVarOnErrorResumeNext9 = fVar14.onErrorResumeNext(new xy7.l(5, new j(new BreadcrumbException(), 6)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext9, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe9 = rVarOnErrorResumeNext9.subscribe(new yma.h(4, fVar15), new yma.h(4, function1K11), new yzc.p(6, function0J9));
        te0.w.j0(bVar, cVarSubscribe9);
        Intrinsics.h(cVarSubscribe9);
        ihm.f fVar16 = ((CellDetailsDelegate) r3.getValue()).d;
        f fVar17 = new f(this, 10);
        Function1 function1K12 = K();
        Function0 function0J10 = J();
        efm.r rVarOnErrorResumeNext10 = fVar16.onErrorResumeNext(new xy7.l(5, new z63.j(new BreadcrumbException(), 21)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext10, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe10 = rVarOnErrorResumeNext10.subscribe(new yma.h(4, fVar17), new yma.h(4, function1K12), new yzc.p(6, function0J10));
        te0.w.j0(bVar, cVarSubscribe10);
        Intrinsics.h(cVarSubscribe10);
        r0 r0VarD2 = te0.w.D(((PlainTextWarningDelegate) subscriptionDetailsActivity.L0.getValue()).d.f121375b, new f(this, 13));
        Function1 function1K13 = K();
        pfm.a aVar4 = new pfm.a(r0VarD2, new xy7.l(5, new j(new BreadcrumbException(), 9)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new yma.h(4, function1K13), new yzc.p(6, m.f320670a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar, hVarW3);
        p0 p0VarF = te0.w.F(((CellDetailsNoteDelegate) r2.getValue()).e, new f(this, 14));
        Function1 function1K14 = K();
        Function0 function0J11 = J();
        j1 j1Var = new j1(p0VarF, new xy7.l(5, new j(new BreadcrumbException(), 10)), 1);
        Intrinsics.checkNotNullExpressionValue(j1Var, "onErrorResumeNext(...)");
        te0.w.j0(bVar, j1Var.m(new yma.h(4, n.f320671a), new yma.h(4, function1K14), new yzc.p(6, function0J11), e1.INSTANCE));
        ihm.f fVar18 = ((CellDetailsNoteDelegate) r2.getValue()).d;
        f fVar19 = new f(this, 15);
        Function1 function1K15 = K();
        Function0 function0J12 = J();
        efm.r rVarOnErrorResumeNext11 = fVar18.onErrorResumeNext(new xy7.l(5, new z63.j(new BreadcrumbException(), 22)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext11, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe11 = rVarOnErrorResumeNext11.subscribe(new yma.h(4, fVar19), new yma.h(4, function1K15), new yzc.p(6, function0J12));
        te0.w.j0(bVar, cVarSubscribe11);
        Intrinsics.h(cVarSubscribe11);
        ihm.f fVar20 = ((CellDetailsAccountDelegate) subscriptionDetailsActivity.P0.getValue()).d;
        f fVar21 = new f(this, 16);
        Function1 function1K16 = K();
        Function0 function0J13 = J();
        efm.r rVarOnErrorResumeNext12 = fVar20.onErrorResumeNext(new xy7.l(5, new z63.j(new BreadcrumbException(), 23)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext12, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe12 = rVarOnErrorResumeNext12.subscribe(new yma.h(4, fVar21), new yma.h(4, function1K16), new yzc.p(6, function0J13));
        te0.w.j0(bVar, cVarSubscribe12);
        Intrinsics.h(cVarSubscribe12);
        ihm.f fVar22 = ((CellDetailsActionableIconDelegate) subscriptionDetailsActivity.K0.getValue()).f51807c;
        f fVar23 = new f(this, 17);
        Function1 function1K17 = K();
        Function0 function0J14 = J();
        efm.r rVarOnErrorResumeNext13 = fVar22.onErrorResumeNext(new xy7.l(5, new z63.j(new BreadcrumbException(), 24)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext13, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe13 = rVarOnErrorResumeNext13.subscribe(new yma.h(4, fVar23), new yma.h(4, function1K17), new yzc.p(6, function0J14));
        te0.w.j0(bVar, cVarSubscribe13);
        Intrinsics.h(cVarSubscribe13);
        ihm.f fVar24 = ((CellDetailsActionDelegate) r4.getValue()).f51780c;
        f fVar25 = new f(this, 18);
        Function1 function1K18 = K();
        Function0 function0J15 = J();
        efm.r rVarOnErrorResumeNext14 = fVar24.onErrorResumeNext(new xy7.l(5, new z63.j(new BreadcrumbException(), 25)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext14, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe14 = rVarOnErrorResumeNext14.subscribe(new yma.h(4, fVar25), new yma.h(4, function1K18), new yzc.p(6, function0J15));
        te0.w.j0(bVar, cVarSubscribe14);
        Intrinsics.h(cVarSubscribe14);
        ihm.f fVar26 = ((CellDetailsDelegate) r3.getValue()).d;
        f fVar27 = new f(this, 19);
        Function1 function1K19 = K();
        Function0 function0J16 = J();
        efm.r rVarOnErrorResumeNext15 = fVar26.onErrorResumeNext(new xy7.l(5, new z63.j(new BreadcrumbException(), 26)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext15, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe15 = rVarOnErrorResumeNext15.subscribe(new yma.h(4, fVar27), new yma.h(4, function1K19), new yzc.p(6, function0J16));
        te0.w.j0(bVar, cVarSubscribe15);
        Intrinsics.h(cVarSubscribe15);
        ihm.f fVar28 = ((ActionWidgetDelegate) subscriptionDetailsActivity.U0.getValue()).f51589c.f121375b;
        f fVar29 = new f(this, 20);
        Function1 function1K20 = K();
        Function0 function0J17 = J();
        efm.r rVarOnErrorResumeNext16 = fVar28.onErrorResumeNext(new xy7.l(5, new z63.j(new BreadcrumbException(), 27)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext16, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe16 = rVarOnErrorResumeNext16.subscribe(new yma.h(4, fVar29), new yma.h(4, function1K20), new yzc.p(6, function0J17));
        te0.w.j0(bVar, cVarSubscribe16);
        Intrinsics.h(cVarSubscribe16);
    }

    public final efm.b R() {
        efm.r rVarR;
        SubscriptionDetailsScreenContract$Configuration subscriptionDetailsScreenContract$Configuration = this.f320675n;
        boolean z = subscriptionDetailsScreenContract$Configuration.f89241c;
        f9e.b mode = subscriptionDetailsScreenContract$Configuration.f89240b;
        bce.g gVar = (bce.g) this.i;
        bce.b bVar = gVar.f14439a;
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i = bce.f.f14438a[mode.ordinal()];
        if (i == 1) {
            efm.r rVarDistinctUntilChanged = u1.d(rd0.e.c(gVar.i.i(false), kotlin.coroutines.g.f186406a), gVar.f14441c.k((String) ((bce.c) bVar).w0().get())).distinctUntilChanged((kfm.d) new bce.e(new t(8), 2));
            Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
            rVarR = pd.b.r(rVarDistinctUntilChanged, new a6j.a(gVar, z, 7));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            rVarR = nim.a.w(rd0.e.c(gVar.f14444j.B0((String) ((bce.c) bVar).w0().get()), kotlin.coroutines.g.f186406a), new bce.d(gVar, 1));
        }
        efm.r rVarSwitchMap = m70.a.g(rVarR, new z8d.h(3), null, 2).switchMap(new zab.b(18, new f(this, 11)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        dg dgVar = new dg("ID_CONTENT_ERROR", new TextLocalisedClause(R$string.recurring_detail_something_wrong, null, null, 14), new TextLocalisedClause(R$string.recurring_detail_try_again, null, null, 14));
        yp0.b.l(dgVar, 0, 0, 0, 0, null, false, 63);
        List listC = zhm.u.c(dgVar);
        od0.i.Companion.getClass();
        efm.r rVarJust = efm.r.just(new Pair(listC, od0.i.f224256b));
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        efm.r rVarDistinctUntilChanged2 = ue0.e.z(rVarSwitchMap, rVarJust).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
        efm.b bVarFlatMapCompletable = o70.a.f(rVarDistinctUntilChanged2).flatMapCompletable(new zab.b(19, new f(this, 12)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        return bVarFlatMapCompletable;
    }
}
