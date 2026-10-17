package ice;

import a08.f0;
import a08.g0;
import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subscriptions.impl.subscriptionlist.SubscriptionListActivity;
import com.revolut.feature.subscriptions.impl.subscriptionlist.SubscriptionListContract$Configuration;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import efm.r;
import i2i.d0;
import i9g.e0;
import ip0.dg;
import java.util.List;
import java.util.Map;
import k71.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends bsi.a implements b {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g9e.a f160257j;
    public final sri.m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xpi.g f160258l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kce.a f160259m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a9e.h f160260n;
    public final SubscriptionListContract$Configuration o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nhf.a f160261p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public q f160262q;

    public o(g9e.a presentationModel, sri.m navigator, xpi.g navBarWithToolbarView, kce.a router, a9e.h itemMapper, SubscriptionListContract$Configuration configuration, nhf.a unitedWalletInteractor) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        this.f160257j = presentationModel;
        this.k = navigator;
        this.f160258l = navBarWithToolbarView;
        this.f160259m = router;
        this.f160260n = itemMapper;
        this.o = configuration;
        this.f160261p = unitedWalletInteractor;
        q.Companion.getClass();
        this.f160262q = k71.p.a();
    }

    public static List Q() {
        return u.c(new FullScreenStateDelegate.Model("NO_SUBSCRIPTIONS_ITEM_LIST_ID", new TextLocalisedClause(R$string.subscriptions_list_no_results_title, null, null, 14), new TextLocalisedClause(R$string.subscriptions_list_no_results_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32752));
    }

    public static koi.j R() {
        dg dgVar = new dg("ID_CONTENT_ERROR", new TextLocalisedClause(R$string.recurring_detail_something_wrong, null, null, 14), new TextLocalisedClause(R$string.recurring_detail_try_again, null, null, 14));
        yp0.b.l(dgVar, 0, 0, 0, 0, null, false, 63);
        return dgVar;
    }

    public static void S(o oVar, aim.e eVar, xi0.b bVar, List list, List list2, Map map, List list3, TextLocalisedClause textLocalisedClause, boolean z, int i) {
        boolean z3 = true;
        boolean z4 = (i & 256) == 0;
        if ((i & 512) == 0) {
            z3 = z;
        } else if (oVar.o.f89313a != null) {
            z3 = false;
        }
        List listA = a9e.h.a(oVar.f160260n, list3, z3 ? new a9e.f("DEFAULT_HEADER_ID", bVar, textLocalisedClause, eVar.isEmpty(), list, z4, false) : a9e.e.f2426a, list2, null, map, oVar.f160262q, 24);
        if (listA != null) {
            eVar.addAll(listA);
        }
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        TextLocalisedClause textLocalisedClause;
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        efm.b bVarT = T();
        g0 g0Var = new g0(21, new d0(new BreadcrumbException(), 17));
        bVarT.getClass();
        pfm.a aVar2 = new pfm.a(bVarT, g0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ea9.c cVar = new ea9.c(26, j.f160252a);
        s sVar = this.i;
        ofm.h hVarW = aVar2.w(new f0(18, sVar), cVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        r rVarF = o70.a.f(((njf.j) this.f160261p).f());
        f fVar = new f(this, 0);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new g0(21, new d0(new BreadcrumbException(), 13)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new f0(18, fVar), new f0(18, sVar), new ea9.c(26, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        SubscriptionListContract$Configuration subscriptionListContract$Configuration = this.o;
        b9e.b bVar2 = subscriptionListContract$Configuration.f89313a;
        switch (bVar2 == null ? -1 : h.f160250a[bVar2.ordinal()]) {
            case -1:
                textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_list_title, null, null, 14);
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_list_section_subscriptions_title, null, null, 14);
                break;
            case 2:
                textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_list_section_scheduled_transfers_title, null, null, 14);
                break;
            case 3:
                textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_list_section_direct_debits_title, null, null, 14);
                break;
            case 4:
                textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_list_section_inactive_title, null, null, 14);
                break;
            case 5:
                textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_list_section_blocked_title, null, null, 14);
                break;
            case 6:
                textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_list_section_pay_later_title, null, null, 14);
                break;
            case 7:
                textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_list_section_loans_title, null, null, 14);
                break;
            case 8:
                textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_list_section_blocked_or_inactive_title, null, null, 14);
                break;
            case 9:
                textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_list_section_blocked_or_deactivated_title, null, null, 14);
                break;
        }
        xpi.c cVar2 = (xpi.c) this.f160258l;
        cVar2.n0(textLocalisedClause);
        cVar2.p0(textLocalisedClause);
        cVar2.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        b9e.b bVar3 = subscriptionListContract$Configuration.f89313a;
        if (bVar3 == b9e.b.SUBSCRIPTION || bVar3 == b9e.b.SCHEDULED_TRANSFER) {
            cVar2.d0(u.c(PlusActionNavBarMenuItem.Companion.c(PlusActionNavBarMenuItem.INSTANCE, "ADD_NEW_LIST_ID", new TextLocalisedClause(R$string.subscriptions_list_action_new, null, null, 14), null, 60)));
        }
        SubscriptionListActivity subscriptionListActivity = (SubscriptionListActivity) view;
        pfm.a aVar3 = new pfm.a(w.D(((ErrorDelegate) subscriptionListActivity.u0.getValue()).f52226c, new f(this, 2)), new g0(21, new d0(new BreadcrumbException(), 18)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new f0(18, sVar), new ea9.c(26, k.f160253a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        pfm.a aVar4 = new pfm.a(w.D(((RowDelegate) subscriptionListActivity.f89309t0.getValue()).f53218h, new f(this, 3)), new g0(21, new d0(new BreadcrumbException(), 19)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new f0(18, sVar), new ea9.c(26, l.f160254a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        pfm.a aVar5 = new pfm.a(ue0.e.v(w.D(((InputDisclosureDelegate) subscriptionListActivity.f89310v0.getValue()).f52538c, new f(this, 4))), new g0(21, new d0(new BreadcrumbException(), 20)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new f0(18, sVar), new ea9.c(26, m.f160255a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
        pfm.a aVar6 = new pfm.a(w.D(cVar2.Q(), new f(this, 5)), new g0(21, new d0(new BreadcrumbException(), 15)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new f0(18, sVar), new ea9.c(26, n.f160256a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        w.j0(bVar, hVarW5);
        r rVarFilter = cVar2.b().filter(new icc.c(new e0(22), 3));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        pfm.a aVar7 = new pfm.a(w.D(rVarFilter, new f(this, 6)), new g0(21, new d0(new BreadcrumbException(), 16)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar7.w(new f0(18, sVar), new ea9.c(26, i.f160251a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        w.j0(bVar, hVarW6);
        r rVarF2 = o70.a.f(((kce.r) this.f160259m).f182721c);
        f fVar2 = new f(this, 7);
        Function0 function0J2 = J();
        r rVarOnErrorResumeNext2 = rVarF2.onErrorResumeNext(new g0(21, new d0(new BreadcrumbException(), 14)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new f0(18, fVar2), new f0(18, sVar), new ea9.c(26, function0J2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
    }

    public final efm.b T() {
        SubscriptionListContract$Configuration subscriptionListContract$Configuration = this.o;
        r rVarOnErrorResumeNext = g9e.a.b(this.f160257j, subscriptionListContract$Configuration.f89313a, subscriptionListContract$Configuration.f89315c, subscriptionListContract$Configuration.d, 17).map(new icc.c(new f(this, 8), 1)).onErrorResumeNext(r.just(new Pair(u.c(R()), null)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        efm.b bVarConcatMapCompletable = o70.a.f(rVarOnErrorResumeNext).concatMapCompletable(new icc.c(new f(this, 1), 2));
        Intrinsics.checkNotNullExpressionValue(bVarConcatMapCompletable, "concatMapCompletable(...)");
        return bVarConcatMapCompletable;
    }
}
