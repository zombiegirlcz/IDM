package gld;

import ble.c1;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.PhotoBannerLargeDelegate;
import com.revolut.core.ui_kit.delegates.RateOneClickDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.j2;
import vkm.t0;
import vkm.v1;
import vkm.z1;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mkd.g f144616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final twg.c f144617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final skd.i f144618c;
    public final ild.k d;
    public final hld.c e;
    public final skd.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fld.d f144619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.revolut.feature.slot_manager.impl.ui.screen.checklist.b f144620h;
    public final bld.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jld.f f144621j;
    public final gte.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zkm.d f144622l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f144623m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f144624n;
    public final j2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1 f144625p;

    public a0(mkd.g view, twg.c slotManagerFeedEventHandlerManager, skd.i slotManagerInteractor, ild.k slotTodoTilesMapper, hld.h slotSuggestionsMapper, hld.c crossSellTilesMapper, skd.j slotsUpdateRelay, fld.d slotChecklistFetchConfigEventHandlerDelegate, com.revolut.feature.slot_manager.impl.ui.screen.checklist.b slotsChecklistVisibilityTracker, bld.j customRatingMediator, jld.f fincrimeNpsMediator, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(slotManagerFeedEventHandlerManager, "slotManagerFeedEventHandlerManager");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(slotTodoTilesMapper, "slotTodoTilesMapper");
        Intrinsics.checkNotNullParameter(slotSuggestionsMapper, "slotSuggestionsMapper");
        Intrinsics.checkNotNullParameter(crossSellTilesMapper, "crossSellTilesMapper");
        Intrinsics.checkNotNullParameter(slotsUpdateRelay, "slotsUpdateRelay");
        Intrinsics.checkNotNullParameter(slotChecklistFetchConfigEventHandlerDelegate, "slotChecklistFetchConfigEventHandlerDelegate");
        Intrinsics.checkNotNullParameter(slotsChecklistVisibilityTracker, "slotsChecklistVisibilityTracker");
        Intrinsics.checkNotNullParameter(customRatingMediator, "customRatingMediator");
        Intrinsics.checkNotNullParameter(fincrimeNpsMediator, "fincrimeNpsMediator");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f144616a = view;
        this.f144617b = slotManagerFeedEventHandlerManager;
        this.f144618c = slotManagerInteractor;
        this.d = slotTodoTilesMapper;
        this.e = crossSellTilesMapper;
        this.f = slotsUpdateRelay;
        this.f144619g = slotChecklistFetchConfigEventHandlerDelegate;
        this.f144620h = slotsChecklistVisibilityTracker;
        this.i = customRatingMediator;
        this.f144621j = fincrimeNpsMediator;
        this.k = featureToggleInteractor;
        this.f144622l = skm.e0.D(rd0.e.a(skm.p0.f264002b), skm.p0.f264003c);
        this.f144623m = new LinkedHashMap();
        this.f144624n = new LinkedHashMap();
        this.o = vkm.q.c(mkd.b.f206218a);
        z1 z1VarA = ta6.a.a(1);
        z1VarA.k(Unit.f186387a);
        this.f144625p = z1VarA;
    }

    public static vkm.y b(Flow flow, SlotContext slotContext, zhm.f0 f0Var) {
        Pair pair = new Pair("error_slot_screen", slotContext.f87254a.name());
        String str = (String) zhm.d0.c0(slotContext.f87255b);
        if (str == null) {
            str = "";
        }
        Pair[] elements = {pair, new Pair("error_slot_target", str)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return rd0.e.e(flow, kotlin.collections.d.y0(elements), new bwb.k(f0Var, null));
    }

    public static c1 d(wkm.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Continuation continuation = null;
        t0 t0VarB = vkm.q.B(new tk9.i(2, 7, continuation), dVar);
        gk7.a keySelector = new gk7.a(20);
        Intrinsics.checkNotNullParameter(t0VarB, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new c1(new v1(new twb.b0(t0VarB, keySelector, continuation, 21)), 9);
    }

    public final boolean a(String listId, String str) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        return str != null ? kotlin.text.d0.J(listId, str, false) : kotlin.text.d0.J(listId, "SlotTodoTile", false) || kotlin.text.d0.J(listId, "SUGGESTED_FOR_YOU_KEY_LIST_ID", false) || kotlin.text.d0.J(listId, "INCENTIVE_LIST_ID_PREFIX", false) || kotlin.text.d0.J(listId, "cross_sell_tiles_scroller", false);
    }

    public final SlotContext c() {
        mkd.c cVar = (mkd.c) this.o.getValue();
        if (cVar instanceof mkd.a) {
            return ((mkd.a) cVar).f206217a;
        }
        if (Intrinsics.f(cVar, mkd.b.f206218a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Flow e() {
        Continuation continuation = null;
        int i = 0;
        return new i(vkm.q.J(vkm.q.Q(vkm.q.Q(new g4b.a0(this.o, 9), new c(continuation, this, i)), new c(continuation, this, 1)), vkm.q.g(this.f144619g.f135948b)), this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ghk.a0 f() {
        koi.k kVarC;
        koi.c cVar;
        mkd.g gVar = this.f144616a;
        koi.c cVarV0 = gVar.v0();
        koi.k kVarC2 = cVarV0.c(PhotoBannerLargeDelegate.class);
        if (kVarC2 == null) {
            kVarC2 = new PhotoBannerLargeDelegate();
            cVarV0.a(kVarC2);
        }
        ScrollerDelegate scrollerDelegate = (ScrollerDelegate) cVarV0.c(ScrollerDelegate.class);
        if (scrollerDelegate == null || (cVar = scrollerDelegate.e) == null) {
            kVarC = null;
        } else {
            kVarC = cVar.c(PhotoBannerLargeDelegate.class);
            if (kVarC == null) {
                cVar.a(kVarC2);
                kVarC = kVarC2;
            }
        }
        int i = 2;
        int i2 = 1;
        PhotoBannerLargeDelegate[] elements = {kVarC2, kVarC};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listU = zhm.d0.U(kotlin.collections.d.L(elements));
        ArrayList arrayList = new ArrayList(zhm.w.t(listU, 10));
        Iterator it8 = listU.iterator();
        while (it8.hasNext()) {
            arrayList.add(rd0.e.b(((PhotoBannerLargeDelegate) it8.next()).f52902c));
        }
        an9.g gVar2 = new an9.g(vkm.q.I(arrayList), 6);
        ArrayList arrayList2 = new ArrayList(zhm.w.t(listU, 10));
        Iterator it9 = listU.iterator();
        while (it9.hasNext()) {
            arrayList2.add(rd0.e.b(((PhotoBannerLargeDelegate) it9.next()).d));
        }
        return new ghk.a0(new i(vkm.q.J(gVar2, new an9.g(vkm.q.I(arrayList2), 5), d(rd0.e.b(gVar.F1()))), this, i2), this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ghk.a0 g() {
        koi.k kVarC;
        koi.c cVar;
        mkd.g gVar = this.f144616a;
        koi.c cVarV0 = gVar.v0();
        koi.k kVarC2 = cVarV0.c(HeroBannerDelegate.class);
        if (kVarC2 == null) {
            kVarC2 = new HeroBannerDelegate(0);
            cVarV0.a(kVarC2);
        }
        ScrollerDelegate scrollerDelegate = (ScrollerDelegate) cVarV0.c(ScrollerDelegate.class);
        if (scrollerDelegate == null || (cVar = scrollerDelegate.e) == null) {
            kVarC = null;
        } else {
            kVarC = cVar.c(HeroBannerDelegate.class);
            if (kVarC == null) {
                cVar.a(kVarC2);
                kVarC = kVarC2;
            }
        }
        int i = 2;
        HeroBannerDelegate[] elements = {kVarC2, kVarC};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listU = zhm.d0.U(kotlin.collections.d.L(elements));
        ArrayList arrayList = new ArrayList(zhm.w.t(listU, 10));
        Iterator it8 = listU.iterator();
        while (it8.hasNext()) {
            arrayList.add(rd0.e.b(((HeroBannerDelegate) it8.next()).d));
        }
        an9.g gVar2 = new an9.g(vkm.q.I(arrayList), 8);
        ArrayList arrayList2 = new ArrayList(zhm.w.t(listU, 10));
        Iterator it9 = listU.iterator();
        while (it9.hasNext()) {
            arrayList2.add(rd0.e.b(((HeroBannerDelegate) it9.next()).e));
        }
        return new ghk.a0(new i(vkm.q.J(gVar2, new an9.g(vkm.q.I(arrayList2), 7), d(rd0.e.b(gVar.F1()))), this, i), this, 3);
    }

    public final Flow h() {
        return vkm.q.Q(this.o, new c(null, this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ghk.a0 i() {
        koi.k kVarC;
        koi.c cVar;
        mkd.g gVar = this.f144616a;
        koi.c cVarV0 = gVar.v0();
        koi.k kVarC2 = cVarV0.c(HeroBannerDelegate.class);
        if (kVarC2 == null) {
            kVarC2 = new HeroBannerDelegate(0);
            cVarV0.a(kVarC2);
        }
        ScrollerDelegate scrollerDelegate = (ScrollerDelegate) cVarV0.c(ScrollerDelegate.class);
        if (scrollerDelegate == null || (cVar = scrollerDelegate.e) == null) {
            kVarC = null;
        } else {
            kVarC = cVar.c(HeroBannerDelegate.class);
            if (kVarC == null) {
                cVar.a(kVarC2);
                kVarC = kVarC2;
            }
        }
        HeroBannerDelegate[] elements = {kVarC2, kVarC};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listU = zhm.d0.U(kotlin.collections.d.L(elements));
        int i = 10;
        ArrayList arrayList = new ArrayList(zhm.w.t(listU, 10));
        Iterator it8 = listU.iterator();
        while (it8.hasNext()) {
            arrayList.add(rd0.e.b(((HeroBannerDelegate) it8.next()).d));
        }
        an9.g gVar2 = new an9.g(vkm.q.I(arrayList), i);
        ArrayList arrayList2 = new ArrayList(zhm.w.t(listU, 10));
        Iterator it9 = listU.iterator();
        while (it9.hasNext()) {
            arrayList2.add(rd0.e.b(((HeroBannerDelegate) it9.next()).e));
        }
        return new ghk.a0(new i(vkm.q.J(gVar2, new an9.g(vkm.q.I(arrayList2), 9), d(rd0.e.b(gVar.F1()))), this, 5), this, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vkm.f j() {
        koi.k kVarC;
        koi.c cVar;
        koi.c cVar2;
        mkd.g gVar = this.f144616a;
        c1 c1VarD = d(vkm.q.J(rd0.e.b(gVar.X1()), rd0.e.b(gVar.F1())));
        koi.c cVarV0 = gVar.v0();
        koi.k kVarC2 = cVarV0.c(ActionWidgetDelegate.class);
        if (kVarC2 == null) {
            kVarC2 = new ActionWidgetDelegate();
            cVarV0.a(kVarC2);
        }
        ScrollerDelegate scrollerDelegate = (ScrollerDelegate) cVarV0.c(ScrollerDelegate.class);
        koi.k kVar = null;
        if (scrollerDelegate == null || (cVar2 = scrollerDelegate.e) == null) {
            kVarC = null;
        } else {
            kVarC = cVar2.c(ActionWidgetDelegate.class);
            if (kVarC == null) {
                cVar2.a(kVarC2);
                kVarC = kVarC2;
            }
        }
        ActionWidgetDelegate[] elements = {kVarC2, kVarC};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listU = zhm.d0.U(kotlin.collections.d.L(elements));
        ArrayList arrayList = new ArrayList(zhm.w.t(listU, 10));
        Iterator it8 = listU.iterator();
        while (it8.hasNext()) {
            arrayList.add(rd0.e.b(((ActionWidgetDelegate) it8.next()).f51589c.f121375b));
        }
        ghk.a0 a0Var = new ghk.a0(new i(vkm.q.J(new an9.g(vkm.q.I(arrayList), 11), c1VarD), this, 6), this, 5);
        koi.c cVarV02 = gVar.v0();
        koi.k kVarC3 = cVarV02.c(RateOneClickDelegate.class);
        if (kVarC3 == null) {
            kVarC3 = new RateOneClickDelegate();
            cVarV02.a(kVarC3);
        }
        ScrollerDelegate scrollerDelegate2 = (ScrollerDelegate) cVarV02.c(ScrollerDelegate.class);
        if (scrollerDelegate2 != null && (cVar = scrollerDelegate2.e) != null) {
            koi.k kVarC4 = cVar.c(RateOneClickDelegate.class);
            if (kVarC4 == null) {
                cVar.a(kVarC3);
                kVar = kVarC3;
            } else {
                kVar = kVarC4;
            }
        }
        RateOneClickDelegate[] elements2 = {kVarC3, kVar};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        List listU2 = zhm.d0.U(kotlin.collections.d.L(elements2));
        ArrayList arrayList2 = new ArrayList(zhm.w.t(listU2, 10));
        Iterator it9 = listU2.iterator();
        while (it9.hasNext()) {
            efm.r rVarHide = ((RateOneClickDelegate) it9.next()).d.hide();
            Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
            arrayList2.add(rd0.e.b(rVarHide));
        }
        i iVar = new i(vkm.q.I(arrayList2), this, 3);
        ArrayList arrayList3 = new ArrayList(zhm.w.t(listU2, 10));
        Iterator it10 = listU2.iterator();
        while (it10.hasNext()) {
            efm.r rVarHide2 = ((RateOneClickDelegate) it10.next()).f53145c.hide();
            Intrinsics.checkNotNullExpressionValue(rVarHide2, "hide(...)");
            arrayList3.add(rd0.e.b(rVarHide2));
        }
        return vkm.q.J(a0Var, vkm.q.J(iVar, new i(vkm.q.I(arrayList3), this, 4)));
    }
}
