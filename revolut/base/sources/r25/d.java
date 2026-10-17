package r25;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import efm.r;
import gzg.a0;
import ihm.f;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import qu4.s;
import r0e.i;
import sfe.h;
import sfe.j;
import sfe.k;
import sfe.l;
import sfe.o;
import sfe.p;
import sfe.q;
import ssi.m;
import te0.w;
import yji.n;
import zhm.a1;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends pfe.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f251055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j60.a f251056n;
    public final m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RowDelegate f251057p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CellDetailsDelegate f251058q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TwinHorizontalButtonDelegate f251059r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LargeActionButtonDelegate f251060s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final BannerDelegate f251061t;
    public final LinkedHashSet u;

    public d(ImmutableMap creditEventHandlers, j60.a bottomDialogExtension, m transactionsWidgetActionExtension, ImmutableSet innerExtensions) {
        Intrinsics.checkNotNullParameter(creditEventHandlers, "creditEventHandlers");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtension, "transactionsWidgetActionExtension");
        Intrinsics.checkNotNullParameter(innerExtensions, "innerExtensions");
        this.f251055m = creditEventHandlers;
        this.f251056n = bottomDialogExtension;
        this.o = transactionsWidgetActionExtension;
        this.f251057p = new RowDelegate(null, null, 7);
        this.f251058q = new CellDetailsDelegate();
        this.f251059r = new TwinHorizontalButtonDelegate();
        this.f251060s = new LargeActionButtonDelegate();
        this.f251061t = new BannerDelegate();
        this.u = a1.l(d0.i1(creditEventHandlers.values()), innerExtensions);
    }

    @Override // yji.n
    public final void D2() {
        this.f251056n.d(v.k(this.f251057p, this.f251059r, this.f251060s, new ListCellDelegate(), new PlainTextDelegate(), this.f251058q, new TextDelegate(), new ProgressStepsDelegate(), this.f251061t));
    }

    @Override // yji.n
    public final void H2() {
        RowDelegate rowDelegate = this.f251057p;
        f fVar = rowDelegate.f53218h;
        r map = rowDelegate.f53226s.map(new c(0, new i(27)));
        f fVar2 = this.f251058q.d;
        f fVar3 = this.f251060s.d.f121375b;
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.f251059r;
        Intrinsics.checkNotNullParameter(twinHorizontalButtonDelegate, "<this>");
        r rVarMerge = r.merge(w.a0(twinHorizontalButtonDelegate.f53572c.f121375b, new a0(22)), w.a0(twinHorizontalButtonDelegate.d.f121375b, new a0(23)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        BannerDelegate bannerDelegate = this.f251061t;
        Intrinsics.checkNotNullParameter(bannerDelegate, "<this>");
        f fVar4 = bannerDelegate.f51699c;
        h35.d dVar = h35.d.f;
        r map2 = fVar4.map(new dug.e(29));
        f fVar5 = bannerDelegate.e;
        h35.e eVar = h35.e.f;
        r map3 = r.merge(map2, fVar5.map(new h35.c(0))).map(new n4d.a0(yx4.b.Companion, 22));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        r rVarMerge2 = r.merge(v.k(fVar, map, fVar2, fVar3, rVarMerge, map3, this.f251056n.C().map(new c(1, new i(28)))));
        Intrinsics.checkNotNullExpressionValue(rVarMerge2, "merge(...)");
        n.l2(this, rd0.e.b(rVarMerge2), null, new s(this, (Continuation) null, 19), 3);
    }

    @Override // pfe.a
    public final Set Z2() {
        return this.u;
    }

    @Override // pfe.c
    public final Object b3(sfe.s sVar, Continuation continuation) {
        if (sVar instanceof sfe.m) {
            Object objB3 = c3(((sfe.m) sVar).f262420b).b3(sVar, continuation);
            return objB3 == fim.a.COROUTINE_SUSPENDED ? objB3 : Unit.f186387a;
        }
        if (sVar instanceof sfe.n) {
            Object objB32 = c3(((sfe.n) sVar).f262422a).b3(sVar, continuation);
            return objB32 == fim.a.COROUTINE_SUSPENDED ? objB32 : Unit.f186387a;
        }
        if (sVar instanceof l) {
            Object objB33 = c3(((l) sVar).f262417a).b3(sVar, continuation);
            return objB33 == fim.a.COROUTINE_SUSPENDED ? objB33 : Unit.f186387a;
        }
        if (sVar instanceof h) {
            Object objB34 = c3(((h) sVar).f262410a).b3(sVar, continuation);
            return objB34 == fim.a.COROUTINE_SUSPENDED ? objB34 : Unit.f186387a;
        }
        if (sVar instanceof p) {
            Object objB35 = c3(((p) sVar).f262425a).b3(sVar, continuation);
            return objB35 == fim.a.COROUTINE_SUSPENDED ? objB35 : Unit.f186387a;
        }
        if (sVar instanceof q) {
            Object objB36 = c3(((q) sVar).f262427a).b3(sVar, continuation);
            return objB36 == fim.a.COROUTINE_SUSPENDED ? objB36 : Unit.f186387a;
        }
        if (sVar instanceof j) {
            Object objB37 = c3(((j) sVar).f262415a).b3(sVar, continuation);
            return objB37 == fim.a.COROUTINE_SUSPENDED ? objB37 : Unit.f186387a;
        }
        if (!(sVar instanceof o) && !(sVar instanceof sfe.r) && !(sVar instanceof sfe.i) && !(sVar instanceof k)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = jli.h.f175850a;
        return Unit.f186387a;
    }

    public final b c3(ProductAccountId productAccountId) {
        ProductAccountId.Payload payload = productAccountId.f89730b;
        if (!(payload instanceof CreditAccountType)) {
            payload = null;
        }
        CreditAccountType creditAccountType = (CreditAccountType) payload;
        if (creditAccountType == null) {
            throw new IllegalArgumentException("ProductAccountId.Payload should contain information about ProductType");
        }
        b bVar = (b) this.f251055m.get(creditAccountType.getClass());
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("There is no CreditAccountChildEventHandler associated with ProductType = " + creditAccountType + ", check DI bindings");
    }
}
