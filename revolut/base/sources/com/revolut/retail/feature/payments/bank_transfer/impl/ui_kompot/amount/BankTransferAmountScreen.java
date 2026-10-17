package com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$id;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$layout;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreen;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.tracking.v3.BaseContext;
import e4k.d0;
import e4k.f;
import e4k.g0;
import e4k.i;
import e4k.j;
import e4k.j0;
import e4k.m;
import e4k.n;
import e4k.o;
import e4k.p;
import e4k.q;
import efm.r;
import h30.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mga.i0;
import no.k;
import o2k.c;
import p2k.g;
import qd0.b;
import rd0.e;
import te0.w;
import vc.s;
import wp5.y;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/amount/BankTransferAmountScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Le4k/j0;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/amount/BankTransferAmountScreenContract$InputData;", "Le4k/g0;", "Lmga/i0;", "Lno/k;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankTransferAmountScreen extends BaseRecyclerViewScreen<j0, BankTransferAmountScreenContract$InputData, g0> implements i0, k {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f102060r0 = {o0.f186429a.j(new h0(BankTransferAmountScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/payments/bank_transfer/impl/databinding/ScreenTransferBankAmountBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final boolean X;
    public b Y;
    public n5k.b Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public AnalyticsContext f102061a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f102062b0;
    public final InputTextDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final RowLoadingDelegate f102063d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final SuggestionsBarDelegate f102064e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f102065h0;
    public final Object i0;
    public final Object j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f102066k0;
    public final Object l0;
    public final Object m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final Object f102067n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final Object f102068o0;
    public final Object p0;
    public final Object q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankTransferAmountScreen(BankTransferAmountScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$id.transferScreen_recyclerView;
        this.V = R$layout.screen_transfer_bank_amount;
        this.W = s.t(this, i.f);
        this.X = true;
        final int i = 0;
        this.f102062b0 = w.y0(new Function0(this) { // from class: e4k.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankTransferAmountScreen f122597b;

            {
                this.f122597b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BankTransferAmountScreen bankTransferAmountScreen = this.f122597b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BankTransferAmountScreen.f102060r0;
                        qd0.b bVar = bankTransferAmountScreen.Y;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = BankTransferAmountScreen.f102060r0;
                        return new CenteredAmountDelegate(new h(bankTransferAmountScreen, 1));
                    case 2:
                        KProperty[] kPropertyArr3 = BankTransferAmountScreen.f102060r0;
                        return (h0) ((p2k.g) bankTransferAmountScreen.p0.getValue()).Y.get();
                    default:
                        KProperty[] kPropertyArr4 = BankTransferAmountScreen.f102060r0;
                        return new SelectableDelegate((RowDelegate) bankTransferAmountScreen.j0.getValue());
                }
            }
        });
        this.c0 = new InputTextDelegate(new e4k.h(this, 0));
        this.f102063d0 = new RowLoadingDelegate();
        this.f102064e0 = new SuggestionsBarDelegate();
        this.f0 = w.y0(new e18.i(10));
        this.g0 = w.y0(new e18.i(11));
        this.f102065h0 = w.y0(new e18.i(12));
        this.i0 = w.y0(new e18.i(13));
        this.j0 = w.y0(new e18.i(14));
        final int i2 = 3;
        this.f102066k0 = w.y0(new Function0(this) { // from class: e4k.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankTransferAmountScreen f122597b;

            {
                this.f122597b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BankTransferAmountScreen bankTransferAmountScreen = this.f122597b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankTransferAmountScreen.f102060r0;
                        qd0.b bVar = bankTransferAmountScreen.Y;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = BankTransferAmountScreen.f102060r0;
                        return new CenteredAmountDelegate(new h(bankTransferAmountScreen, 1));
                    case 2:
                        KProperty[] kPropertyArr3 = BankTransferAmountScreen.f102060r0;
                        return (h0) ((p2k.g) bankTransferAmountScreen.p0.getValue()).Y.get();
                    default:
                        KProperty[] kPropertyArr4 = BankTransferAmountScreen.f102060r0;
                        return new SelectableDelegate((RowDelegate) bankTransferAmountScreen.j0.getValue());
                }
            }
        });
        this.l0 = w.y0(new e18.i(15));
        this.m0 = w.y0(new e18.i(16));
        this.f102067n0 = w.y0(new e18.i(9));
        final int i3 = 1;
        this.f102068o0 = w.y0(new Function0(this) { // from class: e4k.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankTransferAmountScreen f122597b;

            {
                this.f122597b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BankTransferAmountScreen bankTransferAmountScreen = this.f122597b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankTransferAmountScreen.f102060r0;
                        qd0.b bVar = bankTransferAmountScreen.Y;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = BankTransferAmountScreen.f102060r0;
                        return new CenteredAmountDelegate(new h(bankTransferAmountScreen, 1));
                    case 2:
                        KProperty[] kPropertyArr3 = BankTransferAmountScreen.f102060r0;
                        return (h0) ((p2k.g) bankTransferAmountScreen.p0.getValue()).Y.get();
                    default:
                        KProperty[] kPropertyArr4 = BankTransferAmountScreen.f102060r0;
                        return new SelectableDelegate((RowDelegate) bankTransferAmountScreen.j0.getValue());
                }
            }
        });
        this.p0 = w.y0(new dgg.b(this, inputData, 29));
        final int i5 = 2;
        this.q0 = w.y0(new Function0(this) { // from class: e4k.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankTransferAmountScreen f122597b;

            {
                this.f122597b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                BankTransferAmountScreen bankTransferAmountScreen = this.f122597b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankTransferAmountScreen.f102060r0;
                        qd0.b bVar = bankTransferAmountScreen.Y;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = BankTransferAmountScreen.f102060r0;
                        return new CenteredAmountDelegate(new h(bankTransferAmountScreen, 1));
                    case 2:
                        KProperty[] kPropertyArr3 = BankTransferAmountScreen.f102060r0;
                        return (h0) ((p2k.g) bankTransferAmountScreen.p0.getValue()).Y.get();
                    default:
                        KProperty[] kPropertyArr4 = BankTransferAmountScreen.f102060r0;
                        return new SelectableDelegate((RowDelegate) bankTransferAmountScreen.j0.getValue());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        a aVar = (a) T2();
        j60.a aVar2 = aVar.E;
        if (aVar2.j()) {
            j60.a.v(aVar2, false, null, 3);
            return true;
        }
        aVar.F.Q();
        aVar.v2(d0.f122584a);
        return true;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.f102061a0 = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.i0
    public final r N0() {
        return ((HighlightTileDelegate) this.m0.getValue()).f52437c;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getF102061a0() {
        return this.f102061a0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (g) this.p0.getValue();
    }

    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v89, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().d.f59338a), null, new o(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().d.f59339b), null, new o(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().e.o), null, new o(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().f.o), null, new o(this, continuation, 5), 3);
        r map = i3().f221657c.f58608l.map(new e31.e(14, new e1d.h(29)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(map), null, new j(this, continuation, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().d.f121375b), null, new j(this, continuation, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(h3().f.f121375b, new f(7))), null, new j(this, continuation, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((FixedTabsDelegate) this.f102067n0.getValue()).f52339c.f121375b), null, new j(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, l.y(h3().e.f121375b, h3().f51966j.f121375b, "merge(...)"), null, new e4k.k(this, null), 3);
        ihm.f fVar = h3().f51967l.f121375b;
        InputTextDelegate inputTextDelegate = this.c0;
        com.revolut.kompot.navigable.a.g2(this, l.y(fVar, inputTextDelegate.f.f121375b, "merge(...)"), null, new j(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(inputTextDelegate.e.f121375b), null, new e4k.l(this, null), 3);
        e01.a aVar = inputTextDelegate.f52575g;
        com.revolut.kompot.navigable.a.g2(this, y.x(aVar.f121375b, inputTextDelegate.i.f121375b, "mergeWith(...)"), null, new m(this, null), 3);
        r rVarFilter = aVar.f121375b.filter(new e31.e(15, new f(8)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter), null, new n(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(this.f102064e0.p().d, new f(0))), null, new j(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(((SelectableDelegate) this.f102066k0.getValue()).r(), new f(1))), null, new j(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(((RowDelegate) this.j0.getValue()).f53226s, new f(2))), null, new j(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(j3().d.f121375b, new f(3))), null, new o(this, continuation, 1), 3);
        r rVarFilter2 = j3().d.f121375b.filter(new e31.e(11, new f(4)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter2), null, new p(this, null), 3);
        r rVarFilter3 = j3().d.f121375b.filter(new e31.e(12, new f(5)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter3, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter3), null, new q(this, null), 3);
        r rVarFilter4 = j3().d.f121375b.filter(new e31.e(13, new f(6)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter4, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter4), null, new e4k.r(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((j60.a) ((g) this.p0.getValue()).f232340n.get()).E()), null, new o(this, continuation, 3), 3);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ?? r2 = this.p0;
        g gVar = (g) r2.getValue();
        b bVarN = gVar.f232334c.f232399b.n();
        s.j(bVarN);
        this.Y = bVarN;
        this.Z = (n5k.b) gVar.M.get();
        pd.b.p(view, new TextLocalisedClause(R$string.payments_descriptor_transfer_bank_amount_title, null, null, 14));
        j60.a aVar = (j60.a) ((g) r2.getValue()).f232340n.get();
        LargeActionButtonDelegate largeActionButtonDelegateJ3 = j3();
        ?? r3 = this.g0;
        CellDetailsDelegate cellDetailsDelegate = (CellDetailsDelegate) r3.getValue();
        ?? r56 = this.f102065h0;
        CellDetailsActionDelegate cellDetailsActionDelegate = (CellDetailsActionDelegate) r56.getValue();
        ?? r87 = this.i0;
        CellDetailsNoteDelegate cellDetailsNoteDelegate = (CellDetailsNoteDelegate) r87.getValue();
        ?? r102 = this.j0;
        RowDelegate rowDelegate = (RowDelegate) r102.getValue();
        ?? r122 = this.l0;
        TextDelegate textDelegate = (TextDelegate) r122.getValue();
        SelectableDelegate selectableDelegate = (SelectableDelegate) this.f102066k0.getValue();
        ?? r152 = this.m0;
        aVar.d(v.k(largeActionButtonDelegateJ3, cellDetailsDelegate, cellDetailsActionDelegate, cellDetailsNoteDelegate, rowDelegate, textDelegate, selectableDelegate, (HighlightTileDelegate) r152.getValue(), new PlainTextDelegate()));
        n5k.b bVar = this.Z;
        if (bVar == null) {
            Intrinsics.r("paymentFeesDialogExtension");
            throw null;
        }
        ((n5k.p) bVar).Z2((CellDetailsDelegate) r3.getValue(), (CellDetailsActionDelegate) r56.getValue(), (CellDetailsNoteDelegate) r87.getValue(), j3(), (TextDelegate) r122.getValue(), (RowDelegate) r102.getValue(), (HighlightTileDelegate) r152.getValue());
        i3().d.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        i3().e.setIcon(new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.i0
    public final r a2() {
        return ((RowDelegate) this.j0.getValue()).f53218h;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF101501a0() {
        return v.k(this.f102063d0, h3(), this.c0, this.f102064e0, (FixedTabsDelegate) this.f102067n0.getValue());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.U;
    }

    @Override // mga.l0
    public final View g0() {
        ControllerContainerConstraintLayout controllerContainerConstraintLayout = i3().f221655a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerConstraintLayout, "getRoot(...)");
        return controllerContainerConstraintLayout;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j0 uiState, jki.o oVar) {
        AnalyticsContext analyticsContext;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        f2k.h hVar = uiState.d;
        e4k.s sVar = uiState.f122612c;
        if (hVar != null) {
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            BaseContext.a aVarNewBuilder = BaseContext.newBuilder();
            aVarNewBuilder.c();
            ((BaseContext) aVarNewBuilder.f49761b).setContextType("price_comparison_widget");
            w0 w0VarA = aVarNewBuilder.a();
            companion.getClass();
            analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        } else {
            analyticsContext = null;
        }
        this.f102061a0 = analyticsContext;
        i3().d.setModel(uiState.f122611b);
        LegacyButtonContainerConstraintLayout transferScreenFooterContainer = i3().f221656b;
        Intrinsics.checkNotNullExpressionValue(transferScreenFooterContainer, "transferScreenFooterContainer");
        transferScreenFooterContainer.setVisibility(sVar != null ? 0 : 8);
        if (sVar != null) {
            Clause clause = sVar.e;
            LargeActionButton largeActionButton = i3().e;
            largeActionButton.setVisibility(sVar.f122634c ? 0 : 8);
            largeActionButton.setEnabled(sVar.d);
            largeActionButton.setLoadingButtonTag("BANK_TRANSFER_SCHEDULE_AMOUNT_CTA_BUTTON_TAG");
            LargeActionButton largeActionButton2 = i3().f;
            largeActionButton2.setEnabled(sVar.f122633b);
            largeActionButton2.setText(sVar.f122632a);
            largeActionButton2.setLoadingButtonTag("BANK_TRANSFER_PROCEED_AMOUNT_CTA_BUTTON_TAG");
            FooterTextView footerTextView = i3().f221657c;
            footerTextView.setVisibility(clause != null ? 0 : 8);
            footerTextView.setTextClause(clause);
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final CenteredAmountDelegate h3() {
        return (CenteredAmountDelegate) this.f102068o0.getValue();
    }

    public final c i3() {
        ViewBinding value = this.W.getValue(this, f102060r0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final LargeActionButtonDelegate j3() {
        return (LargeActionButtonDelegate) this.f0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: k3, reason: merged with bridge method [inline-methods] */
    public final e4k.h0 T2() {
        return (e4k.h0) this.q0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
