package com.revolut.feature.push_to_card.impl.ui.amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.push_to_card.impl.R$id;
import com.revolut.feature.push_to_card.impl.R$layout;
import com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreen;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.retail.feature.payments.core.R$string;
import efm.r;
import h30.l;
import j60.a;
import java.util.List;
import jki.o;
import jqa.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mga.i0;
import n5k.p;
import qd0.b;
import rd0.e;
import te0.w;
import vc.s;
import yna.j1;
import ypd.i;
import yra.c;
import yra.d;
import yra.g;
import yra.m;
import yra.n;
import yra.q;
import yra.x;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/ui/amount/PushToCardTransferAmountScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lyra/q;", "Lcom/revolut/feature/push_to_card/impl/ui/amount/PushToCardTransferAmountScreenContract$InputData;", "Lyra/n;", "Lmga/i0;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PushToCardTransferAmountScreen extends BaseRecyclerViewScreen<q, PushToCardTransferAmountScreenContract$InputData, n> implements i0 {
    public static final /* synthetic */ KProperty[] p0 = {o0.f186429a.j(new h0(PushToCardTransferAmountScreen.class, "binding", "getBinding()Lcom/revolut/feature/push_to_card/impl/databinding/ScreenTransferCardAmountBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final boolean X;
    public b Y;
    public n5k.b Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f81588a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final InputTextDelegate f81589b0;
    public final RowLoadingDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final SuggestionsBarDelegate f81590d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f81591e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f81592h0;
    public final Object i0;
    public final Object j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f81593k0;
    public final Object l0;
    public final Object m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final Object f81594n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final Object f81595o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushToCardTransferAmountScreen(PushToCardTransferAmountScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$id.transferScreen_recyclerView;
        this.V = R$layout.screen_transfer_card_amount;
        this.W = s.t(this, c.f);
        this.X = true;
        final int i = 2;
        this.f81588a0 = w.y0(new Function0(this) { // from class: yra.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PushToCardTransferAmountScreen f316171b;

            {
                this.f316171b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PushToCardTransferAmountScreen pushToCardTransferAmountScreen = this.f316171b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PushToCardTransferAmountScreen.p0;
                        return new SelectableDelegate((RowDelegate) pushToCardTransferAmountScreen.i0.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PushToCardTransferAmountScreen.p0;
                        return new CenteredAmountDelegate(new yi3.d(pushToCardTransferAmountScreen, 13));
                    case 2:
                        KProperty[] kPropertyArr3 = PushToCardTransferAmountScreen.p0;
                        qd0.b bVar = pushToCardTransferAmountScreen.Y;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    default:
                        KProperty[] kPropertyArr4 = PushToCardTransferAmountScreen.p0;
                        return (p) ((jqa.f) pushToCardTransferAmountScreen.f81594n0.getValue()).N.get();
                }
            }
        });
        this.f81589b0 = new InputTextDelegate(null);
        this.c0 = new RowLoadingDelegate();
        this.f81590d0 = new SuggestionsBarDelegate();
        this.f81591e0 = w.y0(new j1(8));
        this.f0 = w.y0(new j1(9));
        this.g0 = w.y0(new j1(10));
        this.f81592h0 = w.y0(new j1(11));
        this.i0 = w.y0(new j1(12));
        this.j0 = w.y0(new j1(13));
        final int i2 = 0;
        this.f81593k0 = w.y0(new Function0(this) { // from class: yra.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PushToCardTransferAmountScreen f316171b;

            {
                this.f316171b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PushToCardTransferAmountScreen pushToCardTransferAmountScreen = this.f316171b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PushToCardTransferAmountScreen.p0;
                        return new SelectableDelegate((RowDelegate) pushToCardTransferAmountScreen.i0.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PushToCardTransferAmountScreen.p0;
                        return new CenteredAmountDelegate(new yi3.d(pushToCardTransferAmountScreen, 13));
                    case 2:
                        KProperty[] kPropertyArr3 = PushToCardTransferAmountScreen.p0;
                        qd0.b bVar = pushToCardTransferAmountScreen.Y;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    default:
                        KProperty[] kPropertyArr4 = PushToCardTransferAmountScreen.p0;
                        return (p) ((jqa.f) pushToCardTransferAmountScreen.f81594n0.getValue()).N.get();
                }
            }
        });
        this.l0 = w.y0(new j1(7));
        final int i3 = 1;
        this.m0 = w.y0(new Function0(this) { // from class: yra.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PushToCardTransferAmountScreen f316171b;

            {
                this.f316171b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PushToCardTransferAmountScreen pushToCardTransferAmountScreen = this.f316171b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PushToCardTransferAmountScreen.p0;
                        return new SelectableDelegate((RowDelegate) pushToCardTransferAmountScreen.i0.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PushToCardTransferAmountScreen.p0;
                        return new CenteredAmountDelegate(new yi3.d(pushToCardTransferAmountScreen, 13));
                    case 2:
                        KProperty[] kPropertyArr3 = PushToCardTransferAmountScreen.p0;
                        qd0.b bVar = pushToCardTransferAmountScreen.Y;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    default:
                        KProperty[] kPropertyArr4 = PushToCardTransferAmountScreen.p0;
                        return (p) ((jqa.f) pushToCardTransferAmountScreen.f81594n0.getValue()).N.get();
                }
            }
        });
        this.f81594n0 = w.y0(new yff.b(this, inputData, 19));
        final int i5 = 3;
        this.f81595o0 = w.y0(new Function0(this) { // from class: yra.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PushToCardTransferAmountScreen f316171b;

            {
                this.f316171b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PushToCardTransferAmountScreen pushToCardTransferAmountScreen = this.f316171b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PushToCardTransferAmountScreen.p0;
                        return new SelectableDelegate((RowDelegate) pushToCardTransferAmountScreen.i0.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PushToCardTransferAmountScreen.p0;
                        return new CenteredAmountDelegate(new yi3.d(pushToCardTransferAmountScreen, 13));
                    case 2:
                        KProperty[] kPropertyArr3 = PushToCardTransferAmountScreen.p0;
                        qd0.b bVar = pushToCardTransferAmountScreen.Y;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    default:
                        KProperty[] kPropertyArr4 = PushToCardTransferAmountScreen.p0;
                        return (p) ((jqa.f) pushToCardTransferAmountScreen.f81594n0.getValue()).N.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        x xVar = (x) T2();
        a aVar = xVar.f316206y;
        if (aVar.j()) {
            a.v(aVar, false, null, 3);
            return true;
        }
        xVar.v2(m.f316182a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.i0
    public final r N0() {
        return ((HighlightTileDelegate) this.j0.getValue()).f52437c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (f) this.f81594n0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().f167812c.f59338a), null, new yra.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().f167812c.f59339b), null, new yra.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().d.o), null, new yra.e(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().d.f121375b), null, new yra.f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(h3().f.f121375b, new i(14))), null, new yra.f(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, l.y(h3().e.f121375b, h3().f51966j.f121375b, "merge(...)"), null, new g(this, null), 3);
        ihm.f fVar = h3().f51967l.f121375b;
        InputTextDelegate inputTextDelegate = this.f81589b0;
        com.revolut.kompot.navigable.a.g2(this, l.y(fVar, inputTextDelegate.f.f121375b, "merge(...)"), null, new yra.f(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(inputTextDelegate.e.f121375b), null, new yra.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f81590d0.p().d), null, new d(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ?? r2 = this.f81594n0;
        f fVar = (f) r2.getValue();
        b bVarN = fVar.f177559c.f177542c.n();
        s.j(bVarN);
        this.Y = bVarN;
        this.Z = (n5k.b) fVar.B.get();
        pd.b.p(view, new TextLocalisedClause(R$string.payments_descriptor_transfer_p2c_amount_title, null, null, 14));
        a aVar = (a) ((f) r2.getValue()).f177560g.get();
        ?? r23 = this.f81591e0;
        LargeActionButtonDelegate largeActionButtonDelegate = (LargeActionButtonDelegate) r23.getValue();
        ?? r4 = this.f0;
        CellDetailsDelegate cellDetailsDelegate = (CellDetailsDelegate) r4.getValue();
        ?? r72 = this.g0;
        CellDetailsActionDelegate cellDetailsActionDelegate = (CellDetailsActionDelegate) r72.getValue();
        ?? r92 = this.f81592h0;
        CellDetailsNoteDelegate cellDetailsNoteDelegate = (CellDetailsNoteDelegate) r92.getValue();
        ?? r112 = this.i0;
        RowDelegate rowDelegate = (RowDelegate) r112.getValue();
        ?? r132 = this.j0;
        HighlightTileDelegate highlightTileDelegate = (HighlightTileDelegate) r132.getValue();
        ?? r152 = this.l0;
        aVar.d(v.k(largeActionButtonDelegate, cellDetailsDelegate, cellDetailsActionDelegate, cellDetailsNoteDelegate, rowDelegate, highlightTileDelegate, (TextDelegate) r152.getValue(), (SelectableDelegate) this.f81593k0.getValue()));
        n5k.b bVar = this.Z;
        if (bVar == null) {
            Intrinsics.r("paymentFeesDialogExtension");
            throw null;
        }
        ((p) bVar).Z2((CellDetailsDelegate) r4.getValue(), (CellDetailsActionDelegate) r72.getValue(), (CellDetailsNoteDelegate) r92.getValue(), (LargeActionButtonDelegate) r23.getValue(), (TextDelegate) r152.getValue(), (RowDelegate) r112.getValue(), (HighlightTileDelegate) r132.getValue());
        i3().f167812c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        i3().f167811b.setTextClause(new TextLocalisedClause(com.revolut.feature.push_to_card.impl.R$string.push2card_amount_eta, u.c(new TextLocalisedClause(com.revolut.feature.push_to_card.impl.R$string.push2card_review_eta_value, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.i0
    public final r a2() {
        return ((RowDelegate) this.i0.getValue()).f53218h;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF92555b0() {
        return v.k(this.c0, h3(), this.f81589b0, this.f81590d0);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getU() {
        return this.U;
    }

    @Override // mga.l0
    public final View g0() {
        ControllerContainerConstraintLayout controllerContainerConstraintLayout = i3().f167810a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerConstraintLayout, "getRoot(...)");
        return controllerContainerConstraintLayout;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(q uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        i3().f167812c.setModel(uiState.f316186b);
        yra.i iVar = uiState.f316187c;
        if (iVar != null) {
            LargeActionButton largeActionButton = i3().d;
            largeActionButton.setEnabled(iVar.f316174b);
            largeActionButton.setText(iVar.f316173a);
            largeActionButton.setLoadingButtonTag("PUSH_TO_CARD_AMOUNT_CTA_BUTTON_TAG");
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final CenteredAmountDelegate h3() {
        return (CenteredAmountDelegate) this.m0.getValue();
    }

    public final iqa.a i3() {
        ViewBinding value = this.W.getValue(this, p0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (iqa.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: j3, reason: merged with bridge method [inline-methods] */
    public final yra.p T2() {
        return (yra.p) this.f81595o0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
