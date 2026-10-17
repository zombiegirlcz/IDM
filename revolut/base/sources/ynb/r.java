package ynb;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.j2;
import com.revolut.core.ui_kit.delegates.widgets.SimpleTileWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.account_selector.AccountSelectionDialogScreen;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.account_selector.AccountSelectionDialogScreenContract$InputData;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.vaults.R$string;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import d9.e1;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pcd.e0;
import pcd.g0;
import pcd.s;
import rnb.w;
import rp0.d2;
import wli.x;
import yjh.b0;
import zh9.u0;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends pfe.c {

    @NotNull
    public static final f Companion = new f();
    public final gjb.b A;
    public final kkb.b B;
    public final LargeActionButtonDelegate C;
    public final SuggestionsBarDelegate D;
    public final CellDetailsDelegate E;
    public final Set F;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f315418m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final oqk.k f315419n;
    public final j60.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f315420p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wob.a f315421q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w5i.b f315422r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w f315423s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final djb.n f315424t;
    public final oob.c u;
    public final ua7.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r10.r f315425w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final x f315426x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ugc.a f315427y;
    public final y8k.b z;

    public r(c addNewEventHandler, oqk.k transactionsWidgetActionExtension, j60.a bottomDialogExtension, d actionsHandler, wob.a earningDetailsSheetProvider, w5i.b moveMoneyAccountEligibilityChecker, w savingsVaultInteractor, djb.n savingsAccountsDetailsInteractor, oob.c savingsAutomationsExtension, ua7.f hiddenAccountsActionsExtension, r10.r infoSheetDeeplinkHandler, x deeplinkHandler, ugc.a savingsChallengeInteractor, y8k.b peerToPeerFeatureConfigProvider, gjb.b teenSavingsAccountIdResolver, kkb.b savingsChallengeGoalDetailsBottomSheetProvider) {
        Intrinsics.checkNotNullParameter(addNewEventHandler, "addNewEventHandler");
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtension, "transactionsWidgetActionExtension");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(actionsHandler, "actionsHandler");
        Intrinsics.checkNotNullParameter(earningDetailsSheetProvider, "earningDetailsSheetProvider");
        Intrinsics.checkNotNullParameter(moveMoneyAccountEligibilityChecker, "moveMoneyAccountEligibilityChecker");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(savingsAutomationsExtension, "savingsAutomationsExtension");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsExtension, "hiddenAccountsActionsExtension");
        Intrinsics.checkNotNullParameter(infoSheetDeeplinkHandler, "infoSheetDeeplinkHandler");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(savingsChallengeInteractor, "savingsChallengeInteractor");
        Intrinsics.checkNotNullParameter(peerToPeerFeatureConfigProvider, "peerToPeerFeatureConfigProvider");
        Intrinsics.checkNotNullParameter(teenSavingsAccountIdResolver, "teenSavingsAccountIdResolver");
        Intrinsics.checkNotNullParameter(savingsChallengeGoalDetailsBottomSheetProvider, "savingsChallengeGoalDetailsBottomSheetProvider");
        this.f315418m = addNewEventHandler;
        this.f315419n = transactionsWidgetActionExtension;
        this.o = bottomDialogExtension;
        this.f315420p = actionsHandler;
        this.f315421q = earningDetailsSheetProvider;
        this.f315422r = moveMoneyAccountEligibilityChecker;
        this.f315423s = savingsVaultInteractor;
        this.f315424t = savingsAccountsDetailsInteractor;
        this.u = savingsAutomationsExtension;
        this.v = hiddenAccountsActionsExtension;
        this.f315425w = infoSheetDeeplinkHandler;
        this.f315426x = deeplinkHandler;
        this.f315427y = savingsChallengeInteractor;
        this.z = peerToPeerFeatureConfigProvider;
        this.A = teenSavingsAccountIdResolver;
        this.B = savingsChallengeGoalDetailsBottomSheetProvider;
        this.C = new LargeActionButtonDelegate();
        this.D = new SuggestionsBarDelegate();
        this.E = new CellDetailsDelegate();
        yji.n[] elements = {addNewEventHandler, transactionsWidgetActionExtension, actionsHandler, savingsAutomationsExtension, hiddenAccountsActionsExtension};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.F = kotlin.collections.d.y0(elements);
    }

    public static String c3(s sVar) {
        pcd.a aVar;
        g0 g0Var = sVar.f234885h;
        e0 e0Var = g0Var instanceof e0 ? (e0) g0Var : null;
        if (e0Var == null || (aVar = e0Var.d) == null) {
            return null;
        }
        return aVar.f234844g;
    }

    public static final Object j3(r rVar, SimpleTileWidgetDelegate.Model model, l lVar) {
        Object obj2 = model.i;
        if (obj2 instanceof String) {
            Object objD3 = rVar.d3((String) obj2, lVar);
            return objD3 == fim.a.COROUTINE_SUSPENDED ? objD3 : (s) objD3;
        }
        if (!(obj2 instanceof zpb.g)) {
            return null;
        }
        Object objD32 = rVar.d3(((zpb.g) obj2).f324228a, lVar);
        return objD32 == fim.a.COROUTINE_SUSPENDED ? objD32 : (s) objD32;
    }

    public static void q3(r rVar, rob.i iVar, rob.e eVar, String str, int i) {
        boolean z = (i & 4) == 0;
        if ((i & 8) != 0) {
            str = null;
        }
        rVar.N2(new AccountSelectionDialogScreen(new AccountSelectionDialogScreenContract$InputData(iVar, eVar, str)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new wo5.a(rVar, iVar, z, 4));
    }

    @Override // yji.n
    public final void D2() {
        LargeActionButtonDelegate largeActionButtonDelegate = this.C;
        SuggestionsBarDelegate suggestionsBarDelegate = this.D;
        CellDetailsDelegate cellDetailsDelegate = this.E;
        this.o.d(v.k(new RowDelegate(null, null, 7), largeActionButtonDelegate, suggestionsBarDelegate, cellDetailsDelegate));
        efm.r rVarMerge = efm.r.merge(v.k(largeActionButtonDelegate.d.f121375b, suggestionsBarDelegate.p().d, cellDetailsDelegate.d));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        yji.n.j2(this, rd0.e.b(rVarMerge), null, new yg6.v(this, null, 15), 3);
    }

    @Override // pfe.a
    public final Set Z2() {
        return this.F;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x046e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x046f  */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [pcd.b] */
    @Override // pfe.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(sfe.s r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instruction units count: 1364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ynb.r.b3(sfe.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object d3(String str, gim.c cVar) {
        return vkm.q.x(mo3.a.g(this.f315423s.c(str, w4l.h.f294642c), null, new b0(16), 1), cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (l3(r8, r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(java.lang.String r6, sib.a r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ynb.h
            if (r0 == 0) goto L13
            r0 = r8
            ynb.h r0 = (ynb.h) r0
            int r1 = r0.f315402x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f315402x = r1
            goto L18
        L13:
            ynb.h r0 = new ynb.h
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f315402x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L69
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            sib.a r7 = r0.u
            yhm.o.b(r8)
            goto L46
        L38:
            yhm.o.b(r8)
            r0.u = r7
            r0.f315402x = r4
            java.lang.Object r8 = r5.d3(r6, r0)
            if (r8 != r1) goto L46
            goto L68
        L46:
            pcd.s r8 = (pcd.s) r8
            java.lang.String r6 = c3(r8)
            if (r6 != 0) goto L51
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L51:
            int[] r2 = ynb.g.f315400b
            int r7 = r7.ordinal()
            r7 = r2[r7]
            r2 = 0
            if (r7 == r4) goto L72
            if (r7 != r3) goto L6c
            r0.u = r2
            r0.f315402x = r3
            java.lang.Object r6 = r5.l3(r8, r6, r0)
            if (r6 != r1) goto L69
        L68:
            return r1
        L69:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L6c:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L72:
            yg6.v r7 = new yg6.v
            r8 = 14
            r7.<init>(r5, r6, r2, r8)
            yi5.b r6 = new yi5.b
            r8 = 27
            r6.<init>(r8)
            r5.T2(r7, r6)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ynb.r.e3(java.lang.String, sib.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void f3(djb.d dVar) {
        int i;
        if (dVar instanceof djb.b) {
            A2(new aii.e0(((djb.b) dVar).f115275a, com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE), false, 4));
            return;
        }
        if (!(dVar instanceof djb.c)) {
            throw new NoWhenBranchMatchedException();
        }
        ejb.a info = ((djb.c) dVar).f115276a;
        FeatureCommand featureCommand = info.f126834b;
        SavingsProductData savingsProductData = info.d;
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        if (savingsProductData.f86683a.f86622j.isEmpty() && ocd.c.g(savingsProductData).isEmpty()) {
            A2(u0.b(featureCommand));
            return;
        }
        this.f315421q.getClass();
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        ProductGroup.Tax tax = (ProductGroup.Tax) d0.d0(ocd.c.g(savingsProductData));
        Double dE = opg.a.e(savingsProductData);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.mmf_info_sheets_earnings_cells_gross_interest, null, null, 14);
        ejb.f fVar = info.f126833a;
        ej0.b bVar = fVar.f126845b;
        ej0.b bVar2 = fVar.f126846c;
        ej0.b bVar3 = fVar.f126844a;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("GROSS_INTEREST_ITEM_LIST_ID", textLocalisedClause, wob.a.a(mif.a.Q(bVar3)), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        CellDetailsDelegate.Model model2 = tax != null ? new CellDetailsDelegate.Model("TAX_ITEM_LIST_ID", new TextClause(tax.f86582a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), wob.a.a(mif.a.Q(bVar2).l()), null, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, new njb.c(savingsProductData), null, null, 0, null, false, null, 0, 0, 0, 0, 1048008) : null;
        CellDetailsDelegate.Model model3 = pd.b.j(dE != null ? Boolean.valueOf(e1.G(new BigDecimal(String.valueOf(dE.doubleValue())))) : null) ? new CellDetailsDelegate.Model("SERVICE_FEE_INTEREST_ITEM_LIST_ID", new TextLocalisedClause(R$string.mmf_info_sheets_interest_rate_explanation_cells_service_fees, null, null, 14), wob.a.a(mif.a.Q(bVar).l()), null, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048520) : null;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.mmf_info_sheets_earnings_cells_net_interest, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        CellDetailsDelegate.Model[] elements = {model, model2, model3, new CellDetailsDelegate.Model("NET_INTEREST_ITEM_LIST_ID", textLocalisedClause2, wob.a.a(mif.a.Q(mif.a.r(mif.a.r(bVar3, bVar), bVar2))), null, null, false, 0, null, null, j2.H6, null, 0, null, false, null, 0, 0, 0, 0, 1047528)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        int i2 = wob.b.f298908a[info.f126835c.ordinal()];
        if (i2 == 1) {
            i = R$string.mmf_info_sheets_earnings_all_time_title;
        } else if (i2 == 2) {
            i = R$string.mmf_info_sheets_earnings_month_title;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = com.revolut.feature.retail.savings.api.R$string.mmf_info_sheets_earnings_year_title;
        }
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        Integer numValueOf = ocd.a.d(savingsProductData) ? Integer.valueOf(R$string.mmf_info_sheets_earnings_subtitle) : null;
        d2 primaryButton = new d2("PRIMARY_BUTTON", new TextLocalisedClause(R$string.mmf_selecting_a_currency_explanation_got_it, null, null, 14), null, 60);
        d2 secondaryButton = new d2("SECONDARY_BUTTON", new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_common_action_see_transactions, null, null, 14), featureCommand, 56);
        v77.a aVar = new v77.a(listL, 15);
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        this.o.x(rp0.d0.c(new TextLocalisedClause(i, null, null, 14), numValueOf != null ? new TextLocalisedClause(numValueOf.intValue(), null, null, 14) : null, primaryButton, secondaryButton, aVar));
        Unit unit = Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g3(java.lang.String r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ynb.r.g3(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h3(com.revolut.feature.tab.accounts.models.ProductAccountId r5, zpb.h r6, gim.c r7) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ynb.r.h3(com.revolut.feature.tab.accounts.models.ProductAccountId, zpb.h, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r2 == r4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00aa, code lost:
    
        if (k3(r2, true, r1, r3) == r4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d6, code lost:
    
        if (r28.u.Z2(r1, r12, r3) == r4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010b, code lost:
    
        if (h3(r1, (zpb.h) r2, r3) == r4) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i3(sfe.r r29, kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instruction units count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ynb.r.i3(sfe.r, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k3(pcd.s r5, boolean r6, com.revolut.kompot.common.transition.ZoomTransitionAnimation.Widgets r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ynb.r.k3(pcd.s, boolean, com.revolut.kompot.common.transition.ZoomTransitionAnimation$Widgets, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l3(pcd.s r12, java.lang.String r13, gim.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof ynb.n
            if (r0 == 0) goto L13
            r0 = r14
            ynb.n r0 = (ynb.n) r0
            int r1 = r0.f315414x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f315414x = r1
            goto L18
        L13:
            ynb.n r0 = new ynb.n
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f315414x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            pcd.s r12 = r0.u
            yhm.o.b(r14)
            goto L53
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            yhm.o.b(r14)
            r0.u = r12
            r0.f315414x = r3
            ugc.a r14 = r11.f315427y
            w4l.h r2 = w4l.h.f294642c
            vkm.d r13 = r14.j(r13, r2)
            yjh.b0 r14 = new yjh.b0
            r2 = 18
            r14.<init>(r2)
            jhi.b r13 = mo3.a.g(r13, r4, r14, r3)
            java.lang.Object r14 = vkm.q.x(r13, r0)
            if (r14 != r1) goto L53
            return r1
        L53:
            qib.i r14 = (qib.i) r14
            qib.g r13 = r14.f246693c
            dj0.d r7 = r13.f246687c
            if (r7 != 0) goto L5e
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L5e:
            com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData r13 = new com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData
            com.revolut.shared.feature.move_money.api.navigation.Action$Topup r5 = new com.revolut.shared.feature.move_money.api.navigation.Action$Topup
            com.revolut.shared.feature.move_money.api.navigation.StartUpPocket$SavingsAccount r6 = new com.revolut.shared.feature.move_money.api.navigation.StartUpPocket$SavingsAccount
            java.lang.String r12 = r12.f()
            r6.<init>(r12)
            grl.k9 r12 = grl.k9.Savings
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r14 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r14 = "value"
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r8 = com.google.android.gms.internal.mlkit_vision_face.a.h(r12, r14, r12)
            r10 = 1
            r9 = 1
            r5.<init>(r6, r7, r8, r9, r10)
            com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData$ExtraConfiguration$LockAmount r12 = com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData.ExtraConfiguration.LockAmount.f104838a
            java.util.Set r12 = zhm.y0.b(r12)
            r14 = 2
            r13.<init>(r5, r12, r14)
            com.revolut.feature_move_money.api.navigation.MoveMoneyDestination r12 = new com.revolut.feature_move_money.api.navigation.MoveMoneyDestination
            r12.<init>(r13, r4)
            r11.A2(r12)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ynb.r.l3(pcd.s, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ynb.o
            if (r0 == 0) goto L13
            r0 = r6
            ynb.o r0 = (ynb.o) r0
            int r1 = r0.f315415w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f315415w = r1
            goto L18
        L13:
            ynb.o r0 = new ynb.o
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f315415w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f315415w = r3
            java.lang.Object r6 = r4.d3(r5, r0)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            pcd.s r6 = (pcd.s) r6
            java.lang.String r5 = c3(r6)
            if (r5 != 0) goto L46
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L46:
            com.revolut.feature.retail.savings.impl.challenge.presentation.tracking.SavingsChallengeTrackerController r6 = new com.revolut.feature.retail.savings.impl.challenge.presentation.tracking.SavingsChallengeTrackerController
            com.revolut.feature.retail.savings.impl.challenge.presentation.tracking.SavingsChallengeTrackerContract$InputData r0 = new com.revolut.feature.retail.savings.impl.challenge.presentation.tracking.SavingsChallengeTrackerContract$InputData
            r0.<init>(r5)
            r6.<init>(r0)
            r5 = 0
            r0 = 2
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r1 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            yji.n.P2(r4, r6, r1, r5, r0)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ynb.r.m3(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object n3(sfe.m mVar, Continuation continuation) {
        ProductAccountId productAccountId = mVar.f262420b;
        String str = productAccountId.f89729a;
        tnb.e0.Companion.getClass();
        if (Intrinsics.f(str, tnb.b0.f272369b)) {
            q3(this, rob.i.WITHDRAW, rob.e.PERSONAL_SAVINGS, null, 12);
        } else {
            if (!Intrinsics.f(productAccountId.f89729a, tnb.b0.f272370c)) {
                String str2 = productAccountId.f89729a;
                this.A.getClass();
                if (gjb.b.b(str2)) {
                    throw new IllegalArgumentException("Teen savings does not support withdraw action");
                }
                Object objK3 = k3(p3(mVar.f262421c), false, null, continuation);
                return objK3 == fim.a.COROUTINE_SUSPENDED ? objK3 : Unit.f186387a;
            }
            q3(this, rob.i.WITHDRAW, rob.e.JOINT_SAVINGS, null, 12);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        if (r6 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o3(java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ynb.p
            if (r0 == 0) goto L13
            r0 = r7
            ynb.p r0 = (ynb.p) r0
            int r1 = r0.f315416w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f315416w = r1
            goto L18
        L13:
            ynb.p r0 = new ynb.p
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f315416w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L7e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L36
            goto L44
        L36:
            r6 = move-exception
            goto L47
        L38:
            yhm.o.b(r7)
            r0.f315416w = r4     // Catch: java.lang.Exception -> L36
            java.lang.Object r7 = r5.d3(r6, r0)     // Catch: java.lang.Exception -> L36
            if (r7 != r1) goto L44
            goto L7d
        L44:
            pcd.s r7 = (pcd.s) r7     // Catch: java.lang.Exception -> L36
            goto L52
        L47:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            r4 = 0
            rd0.d.a(r2, r4, r4, r6, r7)
            r7 = r4
        L52:
            if (r7 != 0) goto L57
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L57:
            java.lang.String r6 = c3(r7)
            if (r6 != 0) goto L60
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L60:
            r0.f315416w = r3
            ugc.a r7 = r5.f315427y
            java.lang.Object r7 = r7.f279998b
            tjb.g r7 = (tjb.g) r7
            x4l.c r7 = r7.f
            r2 = 0
            java.lang.Object r6 = r7.d(r6, r2, r0)
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            if (r6 != r7) goto L74
            goto L76
        L74:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L76:
            if (r6 != r7) goto L79
            goto L7b
        L79:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L7b:
            if (r6 != r1) goto L7e
        L7d:
            return r1
        L7e:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ynb.r.o3(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final s p3(Object obj2) {
        s sVar = obj2 instanceof s ? (s) obj2 : null;
        if (sVar != null) {
            return sVar;
        }
        throw new ClassCastException("Event " + this + " must have payload as Vault}");
    }
}
