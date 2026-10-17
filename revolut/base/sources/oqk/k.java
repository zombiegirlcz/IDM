package oqk;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.nh;
import com.revolut.core.ui_kit.internal.views.SuggestionViewStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.transactions.api.filter.TransactionsFilterWithContext;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter;
import com.revolut.feature.unified_transactions.api.navigation.UnifiedPagerInput;
import com.revolut.feature.unified_transactions.models.UnifiedTransaction;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.actions.impl.R$string;
import ip0.jh0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import rp0.l0;
import tof.a3;
import tof.i7;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends ssi.m {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ujf.h f227957l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f227958m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l0 f227959n;
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qhf.a f227960p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g8i.a f227961q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nm1.c f227962r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qm1.h f227963s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ugc.a f227964t;

    public k(ujf.h transactionSwipeActionHandler, j60.a expandableControllerExtension, l0 popupMenuDialogDisplayer, b retailAccountCustomizationInteractor, qhf.a transactionActionsMapper, g8i.a transactionDetailsNavigationChecker, nm1.c boletoFinderNavigationProvider, qm1.h boletoFinderSearchErrorDialogProvider, ugc.a investTransactionsNavigationProvider) {
        Intrinsics.checkNotNullParameter(transactionSwipeActionHandler, "transactionSwipeActionHandler");
        Intrinsics.checkNotNullParameter(expandableControllerExtension, "expandableControllerExtension");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(retailAccountCustomizationInteractor, "retailAccountCustomizationInteractor");
        Intrinsics.checkNotNullParameter(transactionActionsMapper, "transactionActionsMapper");
        Intrinsics.checkNotNullParameter(transactionDetailsNavigationChecker, "transactionDetailsNavigationChecker");
        Intrinsics.checkNotNullParameter(boletoFinderNavigationProvider, "boletoFinderNavigationProvider");
        Intrinsics.checkNotNullParameter(boletoFinderSearchErrorDialogProvider, "boletoFinderSearchErrorDialogProvider");
        Intrinsics.checkNotNullParameter(investTransactionsNavigationProvider, "investTransactionsNavigationProvider");
        this.f227957l = transactionSwipeActionHandler;
        this.f227958m = expandableControllerExtension;
        this.f227959n = popupMenuDialogDisplayer;
        this.o = retailAccountCustomizationInteractor;
        this.f227960p = transactionActionsMapper;
        this.f227961q = transactionDetailsNavigationChecker;
        this.f227962r = boletoFinderNavigationProvider;
        this.f227963s = boletoFinderSearchErrorDialogProvider;
        this.f227964t = investTransactionsNavigationProvider;
    }

    public static ssi.e d3(PopupMenuItem popupMenuItem, a3 a3Var) {
        if (a3Var == null) {
            Object k = popupMenuItem.getF52731b();
            a3Var = k instanceof a3 ? (a3) k : null;
        }
        if (Intrinsics.f(popupMenuItem.getF52730a(), "OLD_TRANSACTION_AMOUNT_POP_UP_ITEM_LIST_ID")) {
            return new ssi.e(popupMenuItem.getF52730a(), popupMenuItem.getF52731b());
        }
        if (kotlin.text.a0.H(popupMenuItem.getF52730a(), "TRANSACTION_AMOUNT_", false) && (popupMenuItem.getF52731b() instanceof Integer)) {
            return new ssi.e(popupMenuItem.getF52730a(), popupMenuItem.getF52731b());
        }
        if (!j3(popupMenuItem.getF52730a()) || a3Var == null) {
            return null;
        }
        return new ssi.e(popupMenuItem.getF52730a(), a3Var);
    }

    public static ArrayList e3(int i) {
        IntRange intRange = new IntRange(1, 5, 1);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            int iNextInt = it8.nextInt();
            arrayList.add(new d(a0.d.n("TRANSACTION_AMOUNT_", iNextInt), new TextClause(String.valueOf(iNextInt), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), i == iNextInt, Integer.valueOf(iNextInt)));
        }
        return arrayList;
    }

    public static boolean j3(String str) {
        EnumEntries<uhf.c> enumEntriesA = uhf.c.a();
        if (enumEntriesA != null && enumEntriesA.isEmpty()) {
            return false;
        }
        for (uhf.c action : enumEntriesA) {
            uhf.c.Companion.getClass();
            Intrinsics.checkNotNullParameter(action, "action");
            if (Intrinsics.f(action.name(), str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ssi.m
    public final Object Z2(ssi.k kVar, Continuation continuation) {
        Object objL3;
        if (kVar instanceof ssi.a) {
            A2(((ssi.a) kVar).f265402a);
        } else if (kVar instanceof ssi.b) {
            ssi.b bVar = (ssi.b) kVar;
            i3(bVar.f265403a, bVar.f265404b, bVar.f265405c);
        } else {
            Object[] objArr = 0;
            if (kVar instanceof ssi.g) {
                ssi.l lVar = ((ssi.g) kVar).f265414a;
                h0 h0Var = lVar instanceof h0 ? (h0) lVar : null;
                if (h0Var != null) {
                    UnifiedTransactionsFilter unifiedTransactionsFilter = h0Var.f227950b;
                    UnifiedTransaction unifiedTransaction = h0Var.f227949a;
                    if (this.f227961q.a()) {
                        yji.n.P2(this, o2(new rhf.e(new UnifiedPagerInput(unifiedTransaction, unifiedTransactionsFilter), null, null, 14)), ModalDestination.Style.FullscreenPaged.f98310a, null, 2);
                    } else if (unifiedTransaction instanceof UnifiedTransaction.Standard) {
                        a3 a3Var = ((UnifiedTransaction.Standard) unifiedTransaction).f94574a;
                        TransactionsFilterWithContext transactionsFilterWithContext = unifiedTransactionsFilter.f94567a;
                        i3(a3Var, transactionsFilterWithContext != null ? transactionsFilterWithContext.f91956a : null, transactionsFilterWithContext != null ? transactionsFilterWithContext.f91957b : null);
                    } else {
                        if (!(unifiedTransaction instanceof UnifiedTransaction.Invest)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        A2(this.f227964t.q(((UnifiedTransaction.Invest) unifiedTransaction).f94571a));
                    }
                }
            } else {
                boolean z = kVar instanceof ssi.h;
                l0 l0Var = this.f227959n;
                if (z) {
                    ssi.h hVar = (ssi.h) kVar;
                    ssi.l lVar2 = hVar.f265415a;
                    String str = hVar.f265416b;
                    h0 h0Var2 = lVar2 instanceof h0 ? (h0) lVar2 : null;
                    if (h0Var2 == null) {
                        objL3 = Unit.f186387a;
                    } else {
                        UnifiedTransaction unifiedTransaction2 = h0Var2.f227949a;
                        if (unifiedTransaction2 instanceof UnifiedTransaction.Standard) {
                            objL3 = l3(((UnifiedTransaction.Standard) unifiedTransaction2).f94574a, h0Var2.f227951c, str, continuation);
                            if (objL3 != fim.a.COROUTINE_SUSPENDED) {
                                objL3 = Unit.f186387a;
                            }
                        } else {
                            if (!(unifiedTransaction2 instanceof UnifiedTransaction.Invest)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            l0Var.e(str, zi0.c.c(zhm.v.l(f3()), null, null), mw0.o.VIEW_BOUNDS, new mw0.l(true));
                            objL3 = Unit.f186387a;
                        }
                    }
                    return objL3 == fim.a.COROUTINE_SUSPENDED ? objL3 : Unit.f186387a;
                }
                if (kVar instanceof ssi.c) {
                    A2(u0.c(new TransactionsFeatureConfig.Details(((ssi.c) kVar).f265406a, null, null, null, 126)));
                } else {
                    if (kVar instanceof ssi.f) {
                        ssi.f fVar = (ssi.f) kVar;
                        Object objH3 = h3(fVar.f265413b, fVar.f265412a, continuation);
                        return objH3 == fim.a.COROUTINE_SUSPENDED ? objH3 : Unit.f186387a;
                    }
                    if (kVar instanceof ssi.d) {
                        ssi.d dVar = (ssi.d) kVar;
                        Object objL32 = l3(dVar.f265407a, dVar.f265408b, dVar.f265409c, continuation);
                        return objL32 == fim.a.COROUTINE_SUSPENDED ? objL32 : Unit.f186387a;
                    }
                    if (kVar instanceof ssi.e) {
                        ssi.e eVar = (ssi.e) kVar;
                        Object objG3 = g3(eVar.f265411b, eVar.f265410a, continuation);
                        return objG3 == fim.a.COROUTINE_SUSPENDED ? objG3 : Unit.f186387a;
                    }
                    if (kVar instanceof ssi.i) {
                        ssi.r rVar = ((ssi.i) kVar).f265417a;
                        if (rVar instanceof ssi.q) {
                            A2(new BridgeDestination(((ssi.q) rVar).f265425a));
                        } else {
                            if (!(rVar instanceof ssi.p)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int i = 0;
                            x2(new i((Object) this, (Object) rVar, (Continuation) (objArr == true ? 1 : 0), i), new c(this, i));
                        }
                        Unit unit = Unit.f186387a;
                        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                        return unit;
                    }
                    if (!(kVar instanceof ssi.j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l0Var.e(((ssi.j) kVar).f265418a, zi0.c.c(zhm.v.l(f3()), null, null), mw0.o.VIEW_BOUNDS, new mw0.l(true));
                }
            }
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (Y2(r0, r9) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009c, code lost:
    
        if (Y2(r0, r10) == r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ssi.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oqk.k.b3(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016d  */
    @Override // ssi.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ssi.k c3(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oqk.k.c3(java.lang.Object):ssi.k");
    }

    public final List f3() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transaction_widgets_recent_transactions_show_up_to, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_menu, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        ArrayList<d> arrayListE3 = e3(this.o.a());
        ArrayList arrayList = new ArrayList(zhm.w.t(arrayListE3, 10));
        for (d dVar : arrayListE3) {
            arrayList.add(PopupMenuItem.Companion.a(PopupMenuItem.INSTANCE, dVar.f227929a, dVar.f227930b, dVar.f227931c, null, dVar.d, null, null, 232));
        }
        return zhm.u.c(new PopupMenuItem.NestedParent("TRANSACTION_AMOUNT_POP_UP_ITEM_LIST_ID", textLocalisedClause, resourceImage, arrayList, null, null, null, 112));
    }

    public final Object g3(Object obj2, String str, Continuation continuation) {
        boolean zF = Intrinsics.f(str, "OLD_TRANSACTION_AMOUNT_POP_UP_ITEM_LIST_ID");
        b bVar = this.o;
        if (zF) {
            k3(bVar.a());
        } else {
            if (kotlin.text.a0.H(str, "TRANSACTION_AMOUNT_", false) && (obj2 instanceof Integer)) {
                Object objA = nim.a.a(bVar.c(((Number) obj2).intValue()), continuation);
                return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
            }
            if (j3(str) && (obj2 instanceof a3)) {
                Object objH3 = h3((a3) obj2, str, continuation);
                return objH3 == fim.a.COROUTINE_SUSPENDED ? objH3 : Unit.f186387a;
            }
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h3(tof.a3 r11, java.lang.String r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof oqk.g
            if (r0 == 0) goto L13
            r0 = r13
            oqk.g r0 = (oqk.g) r0
            int r1 = r0.f227936w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f227936w = r1
            goto L18
        L13:
            oqk.g r0 = new oqk.g
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f227936w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r13)
            r5 = r10
            goto L46
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            yhm.o.b(r13)
            oqk.h r4 = new oqk.h
            r9 = 0
            r8 = 0
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f227936w = r3
            java.lang.Object r13 = r10.Y2(r0, r4)
            if (r13 != r1) goto L46
            return r1
        L46:
            uhf.e r13 = (uhf.e) r13
            boolean r11 = r13 instanceof uhf.g
            if (r11 == 0) goto L56
            uhf.g r13 = (uhf.g) r13
            rp0.y r11 = r13.f280225a
            j60.a r12 = r5.f227958m
            r12.x(r11)
            goto L66
        L56:
            boolean r11 = r13 instanceof uhf.f
            if (r11 == 0) goto L66
            com.revolut.kompot.bridge.navigation.BridgeDestination r11 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            uhf.f r13 = (uhf.f) r13
            com.revolut.retail.core.navigation.NaviCommand r12 = r13.f280224a
            r11.<init>(r12)
            r10.A2(r11)
        L66:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: oqk.k.h3(tof.a3, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void i3(a3 a3Var, i7 i7Var, TransactionContext transactionContext) {
        if (this.f227961q.a()) {
            yji.n.P2(this, o2(new rhf.e(a3Var, i7Var, transactionContext, (String) null, 24)), ModalDestination.Style.FullscreenPaged.f98310a, null, 2);
            return;
        }
        A2(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.g(a3Var), null, null, null, 126))));
    }

    public final void k3(int i) {
        boolean z = this.o.a() != i;
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.retail_accounts_transacions_amount_pop_up_title, null, null, 14), new TextLocalisedClause(R$string.retail_accounts_transacions_amount_bottom_dialog_title, null, null, 14), null, 28);
        RowDelegate.Model model = new RowDelegate.Model("TRANSACTION_AMOUNT_SUBTITLE_LIST_ID", null, new TextLocalisedClause(R$string.retail_accounts_transacions_amount_bottom_dialog_amount_block, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
        jh0 jh0Var = jh0.HORIZONTAL_SCROLLER;
        ArrayList<d> arrayListE3 = e3(i);
        ArrayList arrayList = new ArrayList(zhm.w.t(arrayListE3, 10));
        for (d dVar : arrayListE3) {
            arrayList.add(new SuggestionsBarDelegate.Suggestion(dVar.f227929a, dVar.f227930b, null, null, dVar.f227931c ? new SuggestionViewStyle.Accent((Object) null) : new SuggestionViewStyle.Semiaccent((Object) null), false, dVar.d, null, 364));
        }
        List listK = zhm.v.k(model, new nh("TRANSACTION_AMOUNT_ACTION_LIST_ID", arrayList, null, jh0Var, 0, 0, 0, 0, 0, 32756));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.pocket_details.api.R$string.revolut_accounts_home_quantity_transactions_save, null, null, 14);
        int i2 = R$attr.uikit_dp16;
        int i3 = R$attr.uikit_dp24;
        this.f227958m.x(new rp0.y(zhm.d0.F0(new LargeActionButtonDelegate.Model("TRANSACTION_AMOUNT_SAVE_LIST_ID", defaultFilledButton, null, textLocalisedClause, z, null, Integer.valueOf(i), i3, i3, i2, i2, 352), listK), tVar, rp0.l.WINDOW, null, null, null, 1016));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x02ee, code lost:
    
        if (g3(r2, r1, r9) == r10) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r26v0, types: [oqk.k] */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l3(tof.a3 r27, java.util.List r28, java.lang.String r29, kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oqk.k.l3(tof.a3, java.util.List, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
