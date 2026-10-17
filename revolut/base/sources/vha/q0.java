package vha;

import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.acquiring.card_reader.ui.api.navigation.CardReaderFlowDestination;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig;
import com.revolut.feature.shared.branding.api.destination.BrandingParams;
import com.revolut.feature.shared.branding.api.destination.BrandingSharedDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import et6.k3;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class q0 extends pfe.c {

    @NotNull
    public static final u Companion = new u();
    public final tha.a A;
    public final cfa.g B;
    public final gr6.m C;
    public final gr6.a D;
    public final xea.c E;
    public final ua7.f F;
    public final l80.e G;
    public final gte.a H;
    public final AccountCellItemDelegate I;
    public final LargeActionButtonDelegate J;
    public final TwinHorizontalButtonDelegate K;
    public final SuggestionsBarDelegate L;
    public final Set M;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jr6.m f289416m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jr6.o f289417n;
    public final s o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hr6.l f289418p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jf1.a f289419q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final oqk.k f289420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f289421s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final rea.m f289422t;
    public final jr6.r u;
    public final jr6.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f289423w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final fia.a f289424x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final fia.g f289425y;
    public final k3 z;

    public q0(sha.c proOnboardingCommandFactory, jr6.m freelancerDialogFactory, jr6.o freelancerNaviCommandPermissionWrapper, s proAccountsInteractor, hr6.l freelancerCommandFactory, jf1.a proMerchantTogglesInteractor, oqk.k transactionsWidgetActionExtension, j60.a bottomDialogExtension, rea.m pocketDetailsInteractor, jr6.r freelancerPendingPromptFactory, jr6.h freelancerCashbackPromptFactory, l proAccountActionHandler, fia.a proAccountProductShownHandler, fia.g proAccountWidgetHandler, k3 freelancerSettingsInteractor, tha.a proAccountsCommandFactory, cfa.g removePocketExtension, gr6.m freelancerPocketsInteractor, gr6.a freelancerAccountDetailsInteractorImpl, xea.c pocketItemMapper, ua7.f hiddenAccountsActionsExtension, l80.e dateProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(proOnboardingCommandFactory, "proOnboardingCommandFactory");
        Intrinsics.checkNotNullParameter(freelancerDialogFactory, "freelancerDialogFactory");
        Intrinsics.checkNotNullParameter(freelancerNaviCommandPermissionWrapper, "freelancerNaviCommandPermissionWrapper");
        Intrinsics.checkNotNullParameter(proAccountsInteractor, "proAccountsInteractor");
        Intrinsics.checkNotNullParameter(freelancerCommandFactory, "freelancerCommandFactory");
        Intrinsics.checkNotNullParameter(proMerchantTogglesInteractor, "proMerchantTogglesInteractor");
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtension, "transactionsWidgetActionExtension");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerPendingPromptFactory, "freelancerPendingPromptFactory");
        Intrinsics.checkNotNullParameter(freelancerCashbackPromptFactory, "freelancerCashbackPromptFactory");
        Intrinsics.checkNotNullParameter(proAccountActionHandler, "proAccountActionHandler");
        Intrinsics.checkNotNullParameter(proAccountProductShownHandler, "proAccountProductShownHandler");
        Intrinsics.checkNotNullParameter(proAccountWidgetHandler, "proAccountWidgetHandler");
        Intrinsics.checkNotNullParameter(freelancerSettingsInteractor, "freelancerSettingsInteractor");
        Intrinsics.checkNotNullParameter(proAccountsCommandFactory, "proAccountsCommandFactory");
        Intrinsics.checkNotNullParameter(removePocketExtension, "removePocketExtension");
        Intrinsics.checkNotNullParameter(freelancerPocketsInteractor, "freelancerPocketsInteractor");
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractorImpl, "freelancerAccountDetailsInteractorImpl");
        Intrinsics.checkNotNullParameter(pocketItemMapper, "pocketItemMapper");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsExtension, "hiddenAccountsActionsExtension");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f289416m = freelancerDialogFactory;
        this.f289417n = freelancerNaviCommandPermissionWrapper;
        this.o = proAccountsInteractor;
        this.f289418p = freelancerCommandFactory;
        this.f289419q = proMerchantTogglesInteractor;
        this.f289420r = transactionsWidgetActionExtension;
        this.f289421s = bottomDialogExtension;
        this.f289422t = pocketDetailsInteractor;
        this.u = freelancerPendingPromptFactory;
        this.v = freelancerCashbackPromptFactory;
        this.f289423w = proAccountActionHandler;
        this.f289424x = proAccountProductShownHandler;
        this.f289425y = proAccountWidgetHandler;
        this.z = freelancerSettingsInteractor;
        this.A = proAccountsCommandFactory;
        this.B = removePocketExtension;
        this.C = freelancerPocketsInteractor;
        this.D = freelancerAccountDetailsInteractorImpl;
        this.E = pocketItemMapper;
        this.F = hiddenAccountsActionsExtension;
        this.G = dateProvider;
        this.H = featureToggleInteractor;
        this.I = new AccountCellItemDelegate();
        this.J = new LargeActionButtonDelegate();
        this.K = new TwinHorizontalButtonDelegate();
        this.L = new SuggestionsBarDelegate();
        yji.n[] elements = {transactionsWidgetActionExtension, proAccountActionHandler, proAccountProductShownHandler, proAccountWidgetHandler, removePocketExtension, hiddenAccountsActionsExtension};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.M = kotlin.collections.d.y0(elements);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c3(vha.q0 r6, com.revolut.shared.feature.move_money.api.navigation.Action r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof vha.l0
            if (r0 == 0) goto L13
            r0 = r8
            vha.l0 r0 = (vha.l0) r0
            int r1 = r0.f289404w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f289404w = r1
            goto L18
        L13:
            vha.l0 r0 = new vha.l0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289404w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L4b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r8)
            com.revolut.feature_move_money.api.navigation.MoveMoneyDestination r8 = new com.revolut.feature_move_money.api.navigation.MoveMoneyDestination
            com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData r2 = new com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData
            r4 = 6
            r5 = 0
            r2.<init>(r7, r5, r4)
            r8.<init>(r2, r5)
            jr6.o r7 = r6.f289417n
            r0.f289404w = r3
            s17.d r7 = (s17.d) r7
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            aii.u r8 = (aii.u) r8
            r6.A2(r8)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vha.q0.c3(vha.q0, com.revolut.shared.feature.move_money.api.navigation.Action, gim.c):java.lang.Object");
    }

    public static io3.d f3(sfe.m mVar) {
        Object obj2 = mVar.f262421c;
        bia.e eVar = obj2 instanceof bia.e ? (bia.e) obj2 : null;
        if (eVar != null) {
            return eVar.f15463a;
        }
        if (obj2 instanceof io3.d) {
            return (io3.d) obj2;
        }
        return null;
    }

    @Override // yji.n
    public final void D2() {
        this.f289421s.d(zhm.v.k(this.I, new RowDelegate(null, null, 7), new CellDetailsDelegate(), this.J, this.K, this.L));
        T2(new y(this, null, 0), new yi5.b(27));
    }

    @Override // yji.n
    public final void H2() {
        LargeActionButtonDelegate largeActionButtonDelegate = this.J;
        yji.n.l2(this, h30.l.y(largeActionButtonDelegate.d.f121375b, this.L.p().d, "merge(...)"), null, new rch.o(2, this.f289420r, ssi.m.class, "handleBottomSheetAction", "handleBottomSheetAction(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 17), 3);
        yji.n.l2(this, rd0.e.b(this.I.f51551c.f53218h), null, new c0(this, null), 3);
        int i = 2;
        yji.n.l2(this, rd0.e.b(largeActionButtonDelegate.d.f121375b), null, new d0(2, 4, l.class, this.f289423w, "handleLargeActionButtonClick", "handleLargeActionButtonClick(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.K;
        int i2 = 4;
        yji.n.l2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new u36.g(i, this.f289423w, l.class, "handleTwinHorizontalPrimaryButtonClick", "handleTwinHorizontalPrimaryButtonClick(Lcom/revolut/core/ui_kit/delegates/TwinHorizontalButtonDelegate$Model;)V", i2, 12), 3);
        yji.n.l2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), null, new u36.g(i, this.f289423w, l.class, "handleTwinHorizontalSecondaryButtonClick", "handleTwinHorizontalSecondaryButtonClick(Lcom/revolut/core/ui_kit/delegates/TwinHorizontalButtonDelegate$Model;)V", i2, 13), 3);
    }

    @Override // pfe.a
    public final Set Z2() {
        return this.M;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0282 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x024a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // pfe.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(sfe.s r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vha.q0.b3(sfe.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Unit d3(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Continuation continuation = null;
        j60.a.v(this.f289421s, false, null, 3);
        int iHashCode = listId.hashCode();
        tha.a aVar = this.A;
        switch (iHashCode) {
            case -2030321050:
                if (listId.equals("CATALOGUE_LIST_ID")) {
                    V2(new y(this, continuation, 1), new yi5.b(29));
                    return Unit.f186387a;
                }
                return null;
            case -1400683478:
                if (listId.equals("ECOMMERCE_SALES_LIST_ID")) {
                    ((aia.b) aVar).getClass();
                    A2(new FreelancerBizFeatureConfig.AcquiringOrders(new FreelancerBizFeatureConfig.AcquiringOrders.InitialStep.EcommerceOrders(null)));
                    return Unit.f186387a;
                }
                return null;
            case -1211500679:
                if (listId.equals("IN_PERSON_SALES_LIST_ID")) {
                    ((aia.b) aVar).getClass();
                    A2(new FreelancerBizFeatureConfig.AcquiringOrders(new FreelancerBizFeatureConfig.AcquiringOrders.InitialStep.InPersonOrders(null)));
                    return Unit.f186387a;
                }
                return null;
            case -988426472:
                if (listId.equals("BRANDING_LIST_ID")) {
                    A2(new BrandingSharedDestination(new BrandingSharedDestination.InputData(BrandingParams.RetailBrandingParams.f86062a)));
                    return Unit.f186387a;
                }
                return null;
            case -858692785:
                if (listId.equals("ECOMMERCE_PLUGIN_LIST_ID")) {
                    aVar.getClass();
                    A2(FreelancerBizFeatureConfig.ManageEcommercePlugin.f73215a);
                    return Unit.f186387a;
                }
                return null;
            case -563269311:
                if (listId.equals("LEARN_LIST_ID")) {
                    A2(new LearnKompotFeatureConfig.Home.Destination(u09.v.PRO));
                    return Unit.f186387a;
                }
                return null;
            case -454553992:
                if (listId.equals("MANAGE_CARD_READERS_LIST_ID")) {
                    A2(new BridgeDestination(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) CardReaderFlowDestination.CardReaderSettingsBridge.f60611b, false, (Integer) null, 0, 61))));
                    return Unit.f186387a;
                }
                return null;
            case -19849025:
                if (listId.equals("SEE_ALL_SALES_LIST_ID")) {
                    A2(hr6.l.a(this.f289418p));
                    return Unit.f186387a;
                }
                return null;
            case 68553731:
                if (listId.equals("INVOICES_LIST_ID")) {
                    A2(new FreelancerBizFeatureConfig.InvoiceListDestination(0));
                    return Unit.f186387a;
                }
                return null;
            case 352101303:
                if (listId.equals("CASHBACK_LIST_ID")) {
                    A2(new FreelancerBizFeatureConfig.Cashback(com.revolut.feature.freelancer.api.navigation.a.DETAILS));
                    return Unit.f186387a;
                }
                return null;
            case 1049406122:
                if (listId.equals("ORDER_INIT_PAGE_LIST_ID")) {
                    A2(FreelancerBizFeatureConfig.OrderInitPageListDestination.f73224a);
                    return Unit.f186387a;
                }
                return null;
            case 1258101961:
                if (listId.equals("LIST_ID_CASHBACK_WIDGET_LEARN_MORE")) {
                    V2(new y(this, continuation, 4), new yi5.b(29));
                    return Unit.f186387a;
                }
                return null;
            case 1753561866:
                if (listId.equals("ID_ACCOUNT_PENDING_BANNER")) {
                    V2(new p0(this, null), new yi5.b(29));
                    return Unit.f186387a;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r14 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r15 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(sfe.m r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof vha.f0
            if (r0 == 0) goto L13
            r0 = r15
            vha.f0 r0 = (vha.f0) r0
            int r1 = r0.f289364x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f289364x = r1
            goto L18
        L13:
            vha.f0 r0 = new vha.f0
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289364x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            sfe.m r14 = r0.u
            yhm.o.b(r15)
            goto L78
        L2c:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L34:
            yhm.o.b(r15)
            goto L64
        L38:
            yhm.o.b(r15)
            com.revolut.feature.tab.accounts.models.ProductAccountId r15 = r14.f262420b
            java.lang.String r15 = r15.f89729a
            vha.r0 r2 = vha.t0.Companion
            r2.getClass()
            java.lang.String r2 = vha.t0.d
            boolean r15 = kotlin.jvm.internal.Intrinsics.f(r15, r2)
            if (r15 == 0) goto L67
            r14 = 0
            r0.u = r14
            r0.f289364x = r4
            vha.x r15 = new vha.x
            java.lang.String r2 = "HOME_ACTION_DETAILS_ID"
            r15.<init>(r13, r2, r14)
            java.lang.Object r14 = r13.Y2(r0, r15)
            if (r14 != r1) goto L5f
            goto L61
        L5f:
            kotlin.Unit r14 = kotlin.Unit.f186387a
        L61:
            if (r14 != r1) goto L64
            goto L77
        L64:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        L67:
            r0.u = r14
            r0.f289364x = r3
            gr6.a r15 = r13.D
            et6.g r15 = (et6.g) r15
            w4l.h r2 = w4l.h.f294642c
            java.lang.Object r15 = r15.b(r2, r0)
            if (r15 != r1) goto L78
        L77:
            return r1
        L78:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r4 = r15.booleanValue()
            io3.d r1 = f3(r14)
            if (r1 != 0) goto L87
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        L87:
            com.revolut.feature.pockets.api.navigation.PocketDetailsDestination r14 = new com.revolut.feature.pockets.api.navigation.PocketDetailsDestination
            com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData r0 = new com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData
            r11 = 0
            r12 = 4016(0xfb0, float:5.628E-42)
            com.revolut.core.model.account.AccountId$Personal r2 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r3 = 1
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r7 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14.<init>(r0)
            r13.A2(r14)
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: vha.q0.e3(sfe.m, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
