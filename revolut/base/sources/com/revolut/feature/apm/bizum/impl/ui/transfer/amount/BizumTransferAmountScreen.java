package com.revolut.feature.apm.bizum.impl.ui.transfer.amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountScreen;
import com.revolut.feature.apm.core.ui.api.R$id;
import com.revolut.feature.apm.core.ui.api.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import jt1.d;
import jt1.f;
import jt1.g;
import jt1.h;
import jt1.k;
import jt1.l;
import jt1.m;
import jt1.n;
import jt1.o;
import jt1.z;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ms1.r;
import rd0.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bizum/impl/ui/transfer/amount/BizumTransferAmountScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ljt1/h;", "Lcom/revolut/feature/apm/bizum/impl/ui/transfer/amount/BizumTransferAmountContract$InputData;", "Ljt1/f;", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BizumTransferAmountScreen extends BaseRecyclerViewScreen<h, BizumTransferAmountContract$InputData, f> {
    public static final /* synthetic */ KProperty[] l0 = {o0.f186429a.j(new h0(BizumTransferAmountScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/core/ui/api/databinding/ScreenTransferAmountBinding;", 0))};
    public final boolean U;
    public final int V;
    public final int W;
    public final ao.h X;
    public final Object Y;
    public qd0.b Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f61607a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final InputTextDelegate f61608b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f61609d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f61610e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f61611h0;
    public final Object i0;
    public final Object j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f61612k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizumTransferAmountScreen(BizumTransferAmountContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = true;
        this.V = R$layout.screen_transfer_amount;
        this.W = R$id.transferScreenAmount_recyclerView;
        this.X = s.t(this, k.f);
        this.Y = w.y0(new jnf.a(this, inputData, 5));
        final int i = 1;
        this.f61607a0 = w.y0(new Function0(this) { // from class: jt1.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BizumTransferAmountScreen f178288b;

            {
                this.f178288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BizumTransferAmountScreen bizumTransferAmountScreen = this.f178288b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BizumTransferAmountScreen.l0;
                        return (g) ((ms1.r) bizumTransferAmountScreen.Y.getValue()).u.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BizumTransferAmountScreen.l0;
                        qd0.b bVar = bizumTransferAmountScreen.Z;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 2:
                        KProperty[] kPropertyArr3 = BizumTransferAmountScreen.l0;
                        return new CenteredAmountDelegate(new jnf.d(bizumTransferAmountScreen, 7));
                    default:
                        KProperty[] kPropertyArr4 = BizumTransferAmountScreen.l0;
                        return new SelectableDelegate((RowDelegate) bizumTransferAmountScreen.f61611h0.getValue());
                }
            }
        });
        this.f61608b0 = new InputTextDelegate(null);
        final int i2 = 2;
        this.c0 = w.y0(new Function0(this) { // from class: jt1.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BizumTransferAmountScreen f178288b;

            {
                this.f178288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BizumTransferAmountScreen bizumTransferAmountScreen = this.f178288b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BizumTransferAmountScreen.l0;
                        return (g) ((ms1.r) bizumTransferAmountScreen.Y.getValue()).u.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BizumTransferAmountScreen.l0;
                        qd0.b bVar = bizumTransferAmountScreen.Z;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 2:
                        KProperty[] kPropertyArr3 = BizumTransferAmountScreen.l0;
                        return new CenteredAmountDelegate(new jnf.d(bizumTransferAmountScreen, 7));
                    default:
                        KProperty[] kPropertyArr4 = BizumTransferAmountScreen.l0;
                        return new SelectableDelegate((RowDelegate) bizumTransferAmountScreen.f61611h0.getValue());
                }
            }
        });
        this.f61609d0 = w.y0(new jsl.b(8));
        this.f61610e0 = w.y0(new jsl.b(9));
        this.f0 = w.y0(new jsl.b(10));
        this.g0 = w.y0(new jsl.b(11));
        this.f61611h0 = w.y0(new jsl.b(12));
        final int i3 = 3;
        this.i0 = w.y0(new Function0(this) { // from class: jt1.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BizumTransferAmountScreen f178288b;

            {
                this.f178288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BizumTransferAmountScreen bizumTransferAmountScreen = this.f178288b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BizumTransferAmountScreen.l0;
                        return (g) ((ms1.r) bizumTransferAmountScreen.Y.getValue()).u.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BizumTransferAmountScreen.l0;
                        qd0.b bVar = bizumTransferAmountScreen.Z;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 2:
                        KProperty[] kPropertyArr3 = BizumTransferAmountScreen.l0;
                        return new CenteredAmountDelegate(new jnf.d(bizumTransferAmountScreen, 7));
                    default:
                        KProperty[] kPropertyArr4 = BizumTransferAmountScreen.l0;
                        return new SelectableDelegate((RowDelegate) bizumTransferAmountScreen.f61611h0.getValue());
                }
            }
        });
        this.j0 = w.y0(new jsl.b(7));
        final int i5 = 0;
        this.f61612k0 = w.y0(new Function0(this) { // from class: jt1.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BizumTransferAmountScreen f178288b;

            {
                this.f178288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                BizumTransferAmountScreen bizumTransferAmountScreen = this.f178288b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BizumTransferAmountScreen.l0;
                        return (g) ((ms1.r) bizumTransferAmountScreen.Y.getValue()).u.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BizumTransferAmountScreen.l0;
                        qd0.b bVar = bizumTransferAmountScreen.Z;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 2:
                        KProperty[] kPropertyArr3 = BizumTransferAmountScreen.l0;
                        return new CenteredAmountDelegate(new jnf.d(bizumTransferAmountScreen, 7));
                    default:
                        KProperty[] kPropertyArr4 = BizumTransferAmountScreen.l0;
                        return new SelectableDelegate((RowDelegate) bizumTransferAmountScreen.f61611h0.getValue());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        z zVar = (z) T2();
        zVar.f178310w.Q();
        zVar.v2(d.f178280a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (r) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().d.f59338a), null, new l(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().d.f59339b), null, new l(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().f293623g.o), null, new l(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().d.f121375b), null, new m(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(h3().f.f121375b, new jpl.e(25))), null, new m(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, h30.l.y(h3().e.f121375b, h3().f51966j.f121375b, "merge(...)"), null, new n(this, null), 3);
        ihm.f fVar = h3().f51967l.f121375b;
        InputTextDelegate inputTextDelegate = this.f61608b0;
        com.revolut.kompot.navigable.a.g2(this, h30.l.y(fVar, inputTextDelegate.f.f121375b, "merge(...)"), null, new m(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(inputTextDelegate.e.f121375b), null, new o(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ?? r06 = this.Y;
        qd0.b bVarN = ((r) r06.getValue()).f208572b.f208535c.n();
        s.j(bVarN);
        this.Z = bVarN;
        pd.b.p(view, new TextLocalisedClause(R$string.apm_descriptor_transfer_bizum_amount_title, null, null, 14));
        ((j60.a) ((r) r06.getValue()).f208576j.get()).d(v.k((LargeActionButtonDelegate) this.f61609d0.getValue(), (CellDetailsDelegate) this.f61610e0.getValue(), (CellDetailsActionDelegate) this.f0.getValue(), (CellDetailsNoteDelegate) this.g0.getValue(), (RowDelegate) this.f61611h0.getValue(), (TextDelegate) this.j0.getValue(), (SelectableDelegate) this.i0.getValue()));
        i3().d.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        LargeActionButton largeActionButton = i3().f293623g;
        largeActionButton.setLoadingButtonTag("BIZUM_TRANSFER_AMOUNT_CTA_BUTTON_TAG");
        h30.l.A(R.string.common_action_continue, null, null, 14, largeActionButton);
        largeActionButton.setVisibility(0);
        largeActionButton.setEnabled(false);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF60649d0() {
        return v.k(h3(), this.f61608b0, new RowLoadingDelegate());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(h uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        i3().d.setModel(uiState.f178284b);
        i3().f293623g.setEnabled(uiState.f178285c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final CenteredAmountDelegate h3() {
        return (CenteredAmountDelegate) this.c0.getValue();
    }

    public final w02.b i3() {
        ViewBinding value = this.X.getValue(this, l0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w02.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: j3, reason: merged with bridge method [inline-methods] */
    public final g T2() {
        return (g) this.f61612k0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.U);
    }
}
