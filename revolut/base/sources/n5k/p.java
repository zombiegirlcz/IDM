package n5k;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import ffk.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import n4d.a0;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends yji.n implements b {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f212647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p5k.h f212648m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f212649n;
    public final ylg.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wif.a f212650p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f212651q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f212652r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final dpk.a f212653s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b2k.e f212654t;
    public final mre.c u;
    public final z0h.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p5k.a f212655w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final djb.o f212656x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final q f212657y;

    public p(a provider, p5k.h mapper, t pricingPlanInteractor, ylg.b userInteractor, wif.a userFeaturesChecker, gte.a featureToggleInteractor, j60.a bottomDialog, dpk.a rateDetailsFeatureConfigProvider, b2k.e taxesItemProvider, mre.c termsNavigationFactory, z0h.a wealthClauseDestinationProvider, p5k.a creditCardTransferInterestMapper, djb.o savingsDisclaimersDelegate, q RateExplanationExtension) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(rateDetailsFeatureConfigProvider, "rateDetailsFeatureConfigProvider");
        Intrinsics.checkNotNullParameter(taxesItemProvider, "taxesItemProvider");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(wealthClauseDestinationProvider, "wealthClauseDestinationProvider");
        Intrinsics.checkNotNullParameter(creditCardTransferInterestMapper, "creditCardTransferInterestMapper");
        Intrinsics.checkNotNullParameter(savingsDisclaimersDelegate, "savingsDisclaimersDelegate");
        Intrinsics.checkNotNullParameter(RateExplanationExtension, "RateExplanationExtension");
        this.f212647l = provider;
        this.f212648m = mapper;
        this.f212649n = pricingPlanInteractor;
        this.o = userInteractor;
        this.f212650p = userFeaturesChecker;
        this.f212651q = featureToggleInteractor;
        this.f212652r = bottomDialog;
        this.f212653s = rateDetailsFeatureConfigProvider;
        this.f212654t = taxesItemProvider;
        this.u = termsNavigationFactory;
        this.v = wealthClauseDestinationProvider;
        this.f212655w = creditCardTransferInterestMapper;
        this.f212656x = savingsDisclaimersDelegate;
        this.f212657y = RateExplanationExtension;
    }

    public final void Z2(CellDetailsDelegate cellDetailsDelegate, CellDetailsActionDelegate cellDetailsActionDelegate, CellDetailsNoteDelegate cellDetailsNoteDelegate, LargeActionButtonDelegate largeActionButtonDelegate, TextDelegate textDelegate, RowDelegate rowDelegate, HighlightTileDelegate highlightTileDelegate) {
        ihm.f fVar;
        ihm.f fVar2;
        ihm.f fVar3;
        efm.r rVarA0;
        ihm.f fVar4;
        ihm.f fVar5;
        ihm.f fVar6;
        ihm.f fVar7;
        ihm.f fVar8;
        ihm.f fVar9;
        Continuation continuation = null;
        efm.r[] elements = {(cellDetailsDelegate == null || (fVar9 = cellDetailsDelegate.d) == null) ? null : w.a0(fVar9, new n5i.g(25)), (cellDetailsActionDelegate == null || (fVar8 = cellDetailsActionDelegate.d) == null) ? null : w.a0(fVar8, new n5i.g(29)), (cellDetailsNoteDelegate == null || (fVar7 = cellDetailsNoteDelegate.d) == null) ? null : w.a0(fVar7, new c(0)), (cellDetailsNoteDelegate == null || (fVar6 = cellDetailsNoteDelegate.e) == null) ? null : w.a0(fVar6, new c(1)), (largeActionButtonDelegate == null || (fVar5 = largeActionButtonDelegate.d.f121375b) == null) ? null : w.a0(fVar5, new c(2))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        efm.r rVarMerge = efm.r.merge(kotlin.collections.d.L(elements));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        yji.n.j2(this, rd0.e.b(rVarMerge), null, new e(this, continuation, 0), 3);
        if (textDelegate != null && (fVar4 = textDelegate.d) != null) {
            yji.n.j2(this, rd0.e.b(fVar4), null, new e(this, continuation, 1), 3);
        }
        if (cellDetailsActionDelegate != null && (fVar3 = cellDetailsActionDelegate.f51780c) != null && (rVarA0 = w.a0(fVar3, new c(3))) != null) {
            yji.n.j2(this, rd0.e.b(rVarA0), null, new e(this, continuation, 2), 3);
        }
        efm.r[] elements2 = {(rowDelegate == null || (fVar2 = rowDelegate.f53218h) == null) ? null : fVar2.map(new a0(new c(4), 14)), (highlightTileDelegate == null || (fVar = highlightTileDelegate.f52437c) == null) ? null : fVar.map(new a0(new n5i.g(26), 11))};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        efm.r rVarFilter = efm.r.merge(kotlin.collections.d.L(elements2)).filter(new a0(new n5i.g(28), 13));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        yji.n.j2(this, rd0.e.b(rVarFilter), null, new mta.c(this, continuation, 16), 3);
    }

    public final Object b3(Object obj2, gim.c cVar) {
        if (!(obj2 instanceof ty0.a)) {
            return c3(obj2, cVar);
        }
        Object obj3 = ((ty0.a) obj2).d;
        return obj3 == null ? Boolean.FALSE : c3(obj3, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x02e4, code lost:
    
        if (r1 == r4) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x035e, code lost:
    
        if (r2 == r4) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0360, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(java.lang.Object r28, gim.c r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5k.p.c3(java.lang.Object, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(k5k.k r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5k.p.d3(k5k.k, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof n5k.h
            if (r0 == 0) goto L13
            r0 = r8
            n5k.h r0 = (n5k.h) r0
            int r1 = r0.f212635x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212635x = r1
            goto L18
        L13:
            n5k.h r0 = new n5k.h
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f212635x
            n5k.a r3 = r7.f212647l
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            xi0.b r0 = r0.u
            yhm.o.b(r8)
            goto L56
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            yhm.o.b(r8)
            goto L46
        L3a:
            yhm.o.b(r8)
            r0.f212635x = r5
            java.lang.Object r8 = r3.b(r0)
            if (r8 != r1) goto L46
            goto L52
        L46:
            xi0.b r8 = (xi0.b) r8
            r0.u = r8
            r0.f212635x = r4
            java.lang.Object r0 = r3.c(r0)
            if (r0 != r1) goto L53
        L52:
            return r1
        L53:
            r6 = r0
            r0 = r8
            r8 = r6
        L56:
            xi0.b r8 = (xi0.b) r8
            if (r0 == 0) goto L74
            if (r8 != 0) goto L5d
            goto L74
        L5d:
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r2 = new com.revolut.retail.core.navigation.FeatureCommand
            dpk.a r3 = r7.f212653s
            r4 = 0
            com.revolut.retail.feature.ratedetails.api.navigation.RateDetailsKompotFeatureConfig$RateDetails r8 = dpk.a.a(r3, r0, r8, r4, r4)
            r2.<init>(r8)
            r1.<init>(r2)
            r7.A2(r1)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L74:
            n5k.q r8 = r7.f212657y
            n5k.r r8 = (n5k.r) r8
            r8.Z2()
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n5k.p.e3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (i3(r3) == r4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        if (e3(r3) == r4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f9, code lost:
    
        if (r2 == r4) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(k5k.g0 r29, gim.c r30) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5k.p.f3(k5k.g0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g3(java.lang.Double r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof n5k.k
            if (r0 == 0) goto L13
            r0 = r8
            n5k.k r0 = (n5k.k) r0
            int r1 = r0.f212640x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212640x = r1
            goto L18
        L13:
            n5k.k r0 = new n5k.k
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f212640x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Double r7 = r0.u
            yhm.o.b(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            ylg.b r8 = r6.o
            efm.d0 r8 = ylg.b.a(r8)
            r0.u = r7
            r0.f212640x = r3
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            do3.n r8 = (do3.n) r8
            if (r7 == 0) goto L4c
            int r0 = com.revolut.retail.feature.payments.core.R$string.bank_transfer_fees_rare_currency_title
            goto L4e
        L4c:
            int r0 = com.revolut.retail.feature.payments.core.R$string.bank_transfer_fees_rare_currency_title_without_percent
        L4e:
            java.util.List r1 = zhm.v.l(r7)
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r3 = 0
            r4 = 12
            r2.<init>(r0, r1, r3, r4)
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            kotlin.jvm.internal.Intrinsics.h(r8)
            wi0.a r1 = wi0.b.Companion
            r1.getClass()
            wi0.b r1 = wi0.b.f297770q3
            boolean r5 = te0.w.S(r8, r1)
            if (r5 == 0) goto L71
            if (r7 == 0) goto L71
            int r8 = com.revolut.retail.feature.payments.core.R$string.bank_transfer_fees_rare_currency_description_usa
            goto L81
        L71:
            if (r7 == 0) goto L76
            int r8 = com.revolut.retail.feature.payments.core.R$string.bank_transfer_fees_rare_currency_description
            goto L81
        L76:
            boolean r8 = te0.w.S(r8, r1)
            if (r8 == 0) goto L7f
            int r8 = com.revolut.retail.feature.payments.core.R$string.bank_transfer_fees_rare_currency_description_usa_without_percent
            goto L81
        L7f:
            int r8 = com.revolut.retail.feature.payments.core.R$string.bank_transfer_fees_rare_currency_description_without_percent
        L81:
            java.util.List r7 = zhm.v.l(r7)
            r0.<init>(r8, r7, r3, r4)
            p5k.h r7 = r6.f212648m
            p5k.k r7 = (p5k.k) r7
            rp0.y r7 = r7.b(r2, r0, r3)
            j60.a r8 = r6.f212652r
            r8.x(r7)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n5k.p.g3(java.lang.Double, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h3(com.revolut.feature.terms.api.model.TermsScope r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof n5k.l
            if (r0 == 0) goto L13
            r0 = r6
            n5k.l r0 = (n5k.l) r0
            int r1 = r0.f212641w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212641w = r1
            goto L18
        L13:
            n5k.l r0 = new n5k.l
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f212641w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            mre.c r6 = r4.u
            ufm.i r5 = mre.c.a(r6, r5)
            r0.f212641w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            kotlin.jvm.internal.Intrinsics.h(r6)
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r6)
            r4.A2(r5)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n5k.p.h3(com.revolut.feature.terms.api.model.TermsScope, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i3(gim.c r20) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5k.p.i3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j3(gim.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof n5k.n
            if (r0 == 0) goto L13
            r0 = r10
            n5k.n r0 = (n5k.n) r0
            int r1 = r0.f212644w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212644w = r1
            goto L18
        L13:
            n5k.n r0 = new n5k.n
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f212644w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)
            goto L3d
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L2f:
            yhm.o.b(r10)
            r0.f212644w = r3
            n5k.a r10 = r9.f212647l
            java.lang.Object r10 = r10.d(r0)
            if (r10 != r1) goto L3d
            return r1
        L3d:
            l5k.e r10 = (l5k.e) r10
            if (r10 != 0) goto L44
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L44:
            p5k.h r0 = r9.f212648m
            r3 = r0
            p5k.k r3 = (p5k.k) r3
            r3.getClass()
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            mga.d0 r0 = r10.o
            efm.r r0 = r3.c(r0)
            com.revolut.feature.transfer.core.models.FundingSource r4 = r10.f192325j
            n9l.a r1 = r10.f192321b
            xi0.b r5 = r1.f213662b
            com.revolut.core.ui_kit.models.Clause r6 = r10.f192328n
            kotlinx.coroutines.d r8 = skm.p0.f264003c
            mp6.j r1 = new mp6.j
            r7 = 0
            r2 = 14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            ufm.b r1 = te0.w.o0(r8, r1)
            efm.r r1 = r1.x()
            java.lang.String r2 = "observeDisclaimerData(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            efm.r r0 = te0.w.l(r0, r1)
            p5e.h r1 = new p5e.h
            r2 = 2
            r1.<init>(r3, r10, r2)
            p30.b r10 = new p30.b
            r2 = 28
            r10.<init>(r2, r1)
            efm.r r10 = r0.map(r10)
            java.lang.String r0 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            vkm.d r10 = rd0.e.b(r10)
            n5k.e r0 = new n5k.e
            r1 = 3
            r2 = 0
            r0.<init>(r9, r2, r1)
            yji.n.l2(r9, r10, r2, r0, r1)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n5k.p.j3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (j3(r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        if (j3(r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
    
        if (i3(r0) == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085 A[PHI: r10 r11
      0x0085: PHI (r10v7 xi0.b) = (r10v6 xi0.b), (r10v13 xi0.b) binds: [B:33:0x0082, B:19:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r11v7 java.lang.Object) = (r11v6 java.lang.Object), (r11v1 java.lang.Object) binds: [B:33:0x0082, B:19:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k3(n60.a r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof n5k.o
            if (r0 == 0) goto L13
            r0 = r11
            n5k.o r0 = (n5k.o) r0
            int r1 = r0.f212646x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212646x = r1
            goto L18
        L13:
            n5k.o r0 = new n5k.o
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f212646x
            n5k.a r3 = r9.f212647l
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L50
            if (r2 == r8) goto L4c
            if (r2 == r7) goto L48
            if (r2 == r6) goto L42
            if (r2 == r5) goto L3e
            if (r2 != r4) goto L36
            yhm.o.b(r11)
            goto La7
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            yhm.o.b(r11)
            goto L99
        L42:
            xi0.b r10 = r0.u
            yhm.o.b(r11)
            goto L85
        L48:
            yhm.o.b(r11)
            goto L77
        L4c:
            yhm.o.b(r11)
            goto L6b
        L50:
            yhm.o.b(r11)
            r10.Q()
            com.revolut.feature.payments.api.PaymentsToggles$PaymentsChargesMigration r10 = com.revolut.feature.payments.api.PaymentsToggles$PaymentsChargesMigration.f79158c
            gte.a r11 = r9.f212651q
            jte.d r11 = (jte.d) r11
            boolean r10 = r11.c(r10)
            if (r10 == 0) goto L6e
            r0.f212646x = r8
            java.lang.Object r10 = r9.j3(r0)
            if (r10 != r1) goto L6b
            goto La6
        L6b:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L6e:
            r0.f212646x = r7
            java.lang.Object r11 = r3.b(r0)
            if (r11 != r1) goto L77
            goto La6
        L77:
            r10 = r11
            xi0.b r10 = (xi0.b) r10
            r0.u = r10
            r0.f212646x = r6
            java.lang.Object r11 = r3.c(r0)
            if (r11 != r1) goto L85
            goto La6
        L85:
            xi0.b r11 = (xi0.b) r11
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r10, r11)
            r11 = 0
            if (r10 != 0) goto L9c
            r0.u = r11
            r0.f212646x = r5
            java.lang.Object r10 = r9.j3(r0)
            if (r10 != r1) goto L99
            goto La6
        L99:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L9c:
            r0.u = r11
            r0.f212646x = r4
            java.lang.Object r10 = r9.i3(r0)
            if (r10 != r1) goto La7
        La6:
            return r1
        La7:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n5k.p.k3(n60.a, gim.c):java.lang.Object");
    }
}
