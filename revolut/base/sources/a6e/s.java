package a6e;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends pfe.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f1646m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final oqk.k f1647n;
    public final lqk.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x6e.d f1648p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c7e.g f1649q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pfe.c f1650r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final pfe.c f1651s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final pfe.c f1652t;
    public final e7e.a u;
    public final LargeActionButtonDelegate v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RowDelegate f1653w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TwinHorizontalButtonDelegate f1654x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final SuggestionsBarDelegate f1655y;

    public s(j60.a bottomDialogExtension, oqk.k transactionsWidgetActionExtension, lqk.d membersWidgetActionExtension, x6e.d subaccountEventProvider, c7e.g productAccountEventHandler, pfe.c planCashbackEventHandler, pfe.c revPointsEventHandler, pfe.c collateralEventHandler, e7e.a billWidgetActionExtension, g6e.g subaccountsNavigationProvider) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtension, "transactionsWidgetActionExtension");
        Intrinsics.checkNotNullParameter(membersWidgetActionExtension, "membersWidgetActionExtension");
        Intrinsics.checkNotNullParameter(subaccountEventProvider, "subaccountEventProvider");
        Intrinsics.checkNotNullParameter(productAccountEventHandler, "productAccountEventHandler");
        Intrinsics.checkNotNullParameter(planCashbackEventHandler, "planCashbackEventHandler");
        Intrinsics.checkNotNullParameter(revPointsEventHandler, "revPointsEventHandler");
        Intrinsics.checkNotNullParameter(collateralEventHandler, "collateralEventHandler");
        Intrinsics.checkNotNullParameter(billWidgetActionExtension, "billWidgetActionExtension");
        Intrinsics.checkNotNullParameter(subaccountsNavigationProvider, "subaccountsNavigationProvider");
        this.f1646m = bottomDialogExtension;
        this.f1647n = transactionsWidgetActionExtension;
        this.o = membersWidgetActionExtension;
        this.f1648p = subaccountEventProvider;
        this.f1649q = productAccountEventHandler;
        this.f1650r = planCashbackEventHandler;
        this.f1651s = revPointsEventHandler;
        this.f1652t = collateralEventHandler;
        this.u = billWidgetActionExtension;
        this.v = new LargeActionButtonDelegate();
        this.f1653w = new RowDelegate(null, null, 7);
        this.f1654x = new TwinHorizontalButtonDelegate();
        this.f1655y = new SuggestionsBarDelegate();
    }

    @Override // yji.n
    public final void D2() {
        LargeActionButtonDelegate largeActionButtonDelegate = this.v;
        Continuation continuation = null;
        yji.n.j2(this, rd0.e.b(largeActionButtonDelegate.d.f121375b), null, new o(this, null), 3);
        RowDelegate rowDelegate = this.f1653w;
        yji.n.j2(this, rd0.e.b(rowDelegate.f53218h), null, new p(this, null), 3);
        yji.n.j2(this, rd0.e.b(rowDelegate.f53220l), null, new q(this, null), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.f1654x;
        yji.n.j2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new a07.d(this, continuation, 8), 3);
        yji.n.j2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), null, new r(this, continuation, 0), 3);
        SuggestionsBarDelegate suggestionsBarDelegate = this.f1655y;
        efm.r rVarMerge = efm.r.merge(zhm.v.k(suggestionsBarDelegate.p().d, largeActionButtonDelegate.d.f121375b));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        yji.n.j2(this, rd0.e.b(rVarMerge), null, new r(this, continuation, 1), 3);
        this.f1646m.d(zhm.v.k(largeActionButtonDelegate, rowDelegate, twinHorizontalButtonDelegate, suggestionsBarDelegate, new CellDetailsDelegate()));
    }

    @Override // pfe.a
    public final Set Z2() {
        aim.o oVar = new aim.o();
        pfe.c[] elements = {this.f1649q, this.f1650r, this.f1651s, this.f1652t};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        oVar.addAll(setY0);
        Iterator it8 = setY0.iterator();
        while (it8.hasNext()) {
            oVar.addAll(((pfe.c) it8.next()).Z2());
        }
        oVar.add(this.f1647n);
        oVar.add(this.o);
        oVar.add(this.u);
        return y0.a(oVar);
    }

    @Override // pfe.c
    public final Object b3(sfe.s sVar, Continuation continuation) {
        Object objC3;
        if (sVar instanceof sfe.n) {
            sfe.n nVar = (sfe.n) sVar;
            Object obj2 = nVar.f262423b;
            oqk.k kVar = this.f1647n;
            ssi.k kVarC3 = kVar.c3(obj2);
            if (kVarC3 != null) {
                Object objZ2 = kVar.Z2(kVarC3, continuation);
                return objZ2 == fim.a.COROUTINE_SUSPENDED ? objZ2 : Unit.f186387a;
            }
            Object objC32 = c3(sVar, nVar.f262422a, continuation);
            return objC32 == fim.a.COROUTINE_SUSPENDED ? objC32 : Unit.f186387a;
        }
        if (sVar instanceof sfe.m) {
            Object objC33 = c3(sVar, ((sfe.m) sVar).f262420b, continuation);
            return objC33 == fim.a.COROUTINE_SUSPENDED ? objC33 : Unit.f186387a;
        }
        if (sVar instanceof sfe.i) {
            Object objD3 = d3(sVar, continuation);
            return objD3 == fim.a.COROUTINE_SUSPENDED ? objD3 : Unit.f186387a;
        }
        if (sVar instanceof sfe.h) {
            Object objC34 = c3(sVar, ((sfe.h) sVar).f262410a, continuation);
            return objC34 == fim.a.COROUTINE_SUSPENDED ? objC34 : Unit.f186387a;
        }
        if (!(sVar instanceof sfe.p)) {
            return ((sVar instanceof sfe.r) && (objC3 = c3(sVar, ((sfe.r) sVar).f262430b, continuation)) == fim.a.COROUTINE_SUSPENDED) ? objC3 : Unit.f186387a;
        }
        Object objC35 = c3(sVar, ((sfe.p) sVar).f262425a, continuation);
        return objC35 == fim.a.COROUTINE_SUSPENDED ? objC35 : Unit.f186387a;
    }

    public final Object c3(sfe.s sVar, ProductAccountId productAccountId, Continuation continuation) {
        ProductAccountId.Payload payload = productAccountId.f89730b;
        ExtendedSubaccountType extendedSubaccountType = payload instanceof ExtendedSubaccountType ? (ExtendedSubaccountType) payload : null;
        boolean z = extendedSubaccountType instanceof ExtendedSubaccountType.Junior;
        pfe.c cVar = this.f1649q;
        if (!z && !(extendedSubaccountType instanceof ExtendedSubaccountType.Teen) && !(extendedSubaccountType instanceof ExtendedSubaccountType.Joint) && !(extendedSubaccountType instanceof ExtendedSubaccountType.Personal) && !(extendedSubaccountType instanceof ExtendedSubaccountType.Group) && !(extendedSubaccountType instanceof ExtendedSubaccountType.Pro) && !(extendedSubaccountType instanceof ExtendedSubaccountType.ProTax)) {
            cVar = extendedSubaccountType instanceof ExtendedSubaccountType.PlanCashback ? this.f1650r : extendedSubaccountType instanceof ExtendedSubaccountType.RevPoints ? this.f1651s : extendedSubaccountType instanceof ExtendedSubaccountType.Collateral ? this.f1652t : null;
        }
        if (cVar != null) {
            Object objB3 = cVar.b3(sVar, continuation);
            return objB3 == fim.a.COROUTINE_SUSPENDED ? objB3 : Unit.f186387a;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Can not handle event: " + sVar);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (r6.f1651s.b3(r7, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(sfe.s r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a6e.m
            if (r0 == 0) goto L13
            r0 = r8
            a6e.m r0 = (a6e.m) r0
            int r1 = r0.f1637x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1637x = r1
            goto L18
        L13:
            a6e.m r0 = new a6e.m
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f1637x
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r8)
            goto L6c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            sfe.s r7 = r0.u
            yhm.o.b(r8)
            goto L5e
        L3b:
            sfe.s r7 = r0.u
            yhm.o.b(r8)
            goto L51
        L41:
            yhm.o.b(r8)
            r0.u = r7
            r0.f1637x = r5
            c7e.g r8 = r6.f1649q
            java.lang.Object r8 = r8.b3(r7, r0)
            if (r8 != r1) goto L51
            goto L6b
        L51:
            r0.u = r7
            r0.f1637x = r4
            pfe.c r8 = r6.f1650r
            java.lang.Object r8 = r8.b3(r7, r0)
            if (r8 != r1) goto L5e
            goto L6b
        L5e:
            r8 = 0
            r0.u = r8
            r0.f1637x = r3
            pfe.c r8 = r6.f1651s
            java.lang.Object r7 = r8.b3(r7, r0)
            if (r7 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a6e.s.d3(sfe.s, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
