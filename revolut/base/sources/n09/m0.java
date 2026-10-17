package n09;

import com.revolut.data.model.Data;
import com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig;
import com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig$RewardsHome$Destination;
import com.revolut.feature.learn.shared.impl.ui.home.LearnHomeScreenContract$InputData;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.z1;
import zhm.z0;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends jki.g implements w {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LearnHomeScreenContract$InputData f210957p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g09.f f210958q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g09.a f210959r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final dz8.f f210960s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f210961t;
    public final z1 u;
    public final l v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(jki.p stateMapper, LearnHomeScreenContract$InputData inputData, g09.f learnDomainInteractor, g09.a categoriesInteractor, dz8.f learnHomeUiConfig) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(learnDomainInteractor, "learnDomainInteractor");
        Intrinsics.checkNotNullParameter(categoriesInteractor, "categoriesInteractor");
        Intrinsics.checkNotNullParameter(learnHomeUiConfig, "learnHomeUiConfig");
        this.f210957p = inputData;
        this.f210958q = learnDomainInteractor;
        this.f210959r = categoriesInteractor;
        this.f210960s = learnHomeUiConfig;
        this.u = vkm.q.b(0, 6, null);
        u09.v vVar = inputData.f78011a;
        this.v = new l(null, y2(z0.i(x.f210970a, vVar != null ? new y(vVar) : null)), false, false);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new i0(this, continuation, 0), new yi5.b(26));
        l2(new i0(this, continuation, 1), new yi5.b(26));
        l2(new i0(this, continuation, 2), new yi5.b(26));
        l2(new mpd.p(this, continuation, 21), new yi5.b(26));
    }

    @Override // yji.l
    public final void T1(long j2) {
        this.u.k(Unit.f186387a);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.v;
    }

    public final ArrayList y2(Iterable iterable) {
        int i;
        ArrayList arrayList = new ArrayList(zhm.w.t(iterable, 10));
        Iterator it8 = iterable.iterator();
        while (true) {
            i = 0;
            zF = false;
            boolean zF = false;
            if (!it8.hasNext()) {
                break;
            }
            z zVar = (z) it8.next();
            LearnHomeScreenContract$InputData learnHomeScreenContract$InputData = this.f210957p;
            u09.v vVar = learnHomeScreenContract$InputData.f78011a;
            if ((vVar == null ? -1 : g0.f210940a[vVar.ordinal()]) == -1) {
                zF = Intrinsics.f(zVar, x.f210970a);
            } else if ((zVar instanceof y) && ((y) zVar).f210971a == learnHomeScreenContract$InputData.f78011a) {
                zF = true;
            }
            arrayList.add(new a0(zVar, zF, new Data(null, null, true, 3, null)));
        }
        if (!arrayList.isEmpty()) {
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                if (((a0) it9.next()).f210924b) {
                    return arrayList;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (Object objA : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            if (i == 0) {
                objA = a0.a((a0) objA, true);
            }
            arrayList2.add(objA);
            i = i2;
        }
        return arrayList2;
    }

    public final void z2(final v event) {
        Object next;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof s) {
            final int i = 0;
            x2(new Function1() { // from class: n09.d0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            l updateState = (l) obj2;
                            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                            List list = updateState.f210952a;
                            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                            int i2 = 0;
                            for (Object obj3 : list) {
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    zhm.v.s();
                                    throw null;
                                }
                                arrayList.add(a0.a((a0) obj3, i2 == ((s) event).f210967a));
                                i2 = i3;
                            }
                            return l.a(updateState, arrayList, false, null, false, 14);
                        default:
                            l updateState2 = (l) obj2;
                            Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                            List<a0> list2 = updateState2.f210952a;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            for (a0 a0Var : list2) {
                                arrayList2.add(a0.a(a0Var, Intrinsics.f(a0Var.f210923a.a(), ((u) event).f210969a)));
                            }
                            return l.a(updateState2, arrayList2, false, null, false, 14);
                    }
                }
            });
            return;
        }
        if (event instanceof u) {
            final int i2 = 1;
            x2(new Function1() { // from class: n09.d0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            l updateState = (l) obj2;
                            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                            List list = updateState.f210952a;
                            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                            int i22 = 0;
                            for (Object obj3 : list) {
                                int i3 = i22 + 1;
                                if (i22 < 0) {
                                    zhm.v.s();
                                    throw null;
                                }
                                arrayList.add(a0.a((a0) obj3, i22 == ((s) event).f210967a));
                                i22 = i3;
                            }
                            return l.a(updateState, arrayList, false, null, false, 14);
                        default:
                            l updateState2 = (l) obj2;
                            Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                            List<a0> list2 = updateState2.f210952a;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            for (a0 a0Var : list2) {
                                arrayList2.add(a0.a(a0Var, Intrinsics.f(a0Var.f210923a.a(), ((u) event).f210969a)));
                            }
                            return l.a(updateState2, arrayList2, false, null, false, 14);
                    }
                }
            });
            return;
        }
        if (event instanceof m) {
            Object obj2 = ((m) event).f210956a.f51742s;
            u09.f fVar = obj2 instanceof u09.f ? (u09.f) obj2 : null;
            if (fVar != null) {
                C1(new LearnKompotFeatureConfig.CourseOverview.Destination(fVar.f276109a, fVar.f276112g, null, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE)));
                return;
            }
            return;
        }
        if (event instanceof t) {
            Object obj3 = ((t) event).f210968a.f53364p;
            u09.f fVar2 = obj3 instanceof u09.f ? (u09.f) obj3 : null;
            if (fVar2 != null) {
                C1(new LearnKompotFeatureConfig.CourseOverview.Destination(fVar2.f276109a, fVar2.f276112g, null, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE)));
                return;
            }
            return;
        }
        if (event instanceof n) {
            this.u.k(Unit.f186387a);
            return;
        }
        boolean z = event instanceof q;
        ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM fullscreen_slide_from_bottom = ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a;
        SkipShownArticleBehaviour.AlwaysShow alwaysShow = SkipShownArticleBehaviour.AlwaysShow.f81285a;
        if (z) {
            yji.l.j2(this, e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Id("crypto-risk-disclosure-uae")), alwaysShow, false, null, null, false, 60)), fullscreen_slide_from_bottom, null, 2);
            return;
        }
        if (event instanceof p) {
            C1(new ExternalDestination.Browser("https://www.revolut.com/legal/cryptocurrency-terms", null));
            return;
        }
        if (event instanceof o) {
            yji.l.j2(this, e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Id("crypto-risk-disclosure-br")), alwaysShow, false, null, null, false, 60)), fullscreen_slide_from_bottom, null, 2);
            return;
        }
        if (!(event instanceof r)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((r) event).f210966a;
        if (!Intrinsics.f(str, "MENU_ITEM_ID_GLOSSARY")) {
            if (Intrinsics.f(str, "MENU_ITEM_ID_REWARDS")) {
                C1(LearnKompotFeatureConfig$RewardsHome$Destination.f77973a);
                return;
            }
            return;
        }
        Iterator it8 = ((l) t2()).f210952a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((a0) next).f210924b) {
                    break;
                }
            }
        }
        a0 a0Var = (a0) next;
        z zVar = a0Var != null ? a0Var.f210923a : null;
        y yVar = zVar instanceof y ? (y) zVar : null;
        C1(new LearnKompotFeatureConfig.GlossaryHome.Destination(yVar != null ? yVar.f210971a : null));
    }
}
