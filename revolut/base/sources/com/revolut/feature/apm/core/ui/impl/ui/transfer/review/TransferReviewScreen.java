package com.revolut.feature.apm.core.ui.impl.ui.transfer.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.impl.R$id;
import com.revolut.feature.apm.core.ui.impl.R$layout;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.review.TransferReviewContract$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.review.TransferReviewScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import i52.d;
import i52.g;
import i52.i;
import i52.q;
import i52.r;
import i52.t;
import i52.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.c7;
import p12.l0;
import p12.w0;
import pd.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/review/TransferReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Li52/g;", "Ldli/a;", "Li52/h;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferReviewScreen extends ViewController<g> implements dli.a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(TransferReviewScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/core/ui/impl/databinding/ScreenApmTransferReviewBinding;", 0))};
    public final TransferReviewContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;

    public TransferReviewScreen(TransferReviewContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_apm_transfer_review;
        this.M = true;
        this.N = s.t(this, q.f);
        this.O = w.y0(new hzl.a(24));
        this.P = w.y0(new hzl.a(25));
        this.Q = w.y0(new hzl.a(26));
        this.R = w.y0(new hzl.a(27));
        this.S = w.y0(new hzl.a(28));
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: i52.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReviewScreen f158578b;

            {
                this.f158578b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransferReviewScreen transferReviewScreen = this.f158578b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReviewScreen.W;
                        TransferReviewScreen transferReviewScreen2 = this.f158578b;
                        return dli.f.a(transferReviewScreen2, transferReviewScreen2.d(), zhm.v.k(new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new CenteredAmountDelegate(null), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextWarningDelegate(), new RowLoadingDelegate(), new SimpleMediaDelegate(), new TextDelegate(), (CellDetailsActionDelegate) transferReviewScreen2.O.getValue(), (CellDetailsSwitcherDelegate) transferReviewScreen2.P.getValue(), (RowDelegate) transferReviewScreen2.Q.getValue()), R$id.transferScreenReview_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferReviewScreen.W;
                        qji.b bVarU2 = transferReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.transfer.review.di.TransferReviewScreenInjector");
                        l0 l0Var = (l0) bVarU2;
                        p12.v vVar = l0Var.f231717b;
                        l0 l0Var2 = l0Var.f231718c;
                        TransferReviewContract$InputData transferReviewContract$InputData = transferReviewScreen.K;
                        transferReviewContract$InputData.getClass();
                        return new w0(vVar, l0Var2, transferReviewScreen, transferReviewContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TransferReviewScreen.W;
                        return (i) ((w0) transferReviewScreen.U.getValue()).k.get();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: i52.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReviewScreen f158578b;

            {
                this.f158578b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransferReviewScreen transferReviewScreen = this.f158578b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReviewScreen.W;
                        TransferReviewScreen transferReviewScreen2 = this.f158578b;
                        return dli.f.a(transferReviewScreen2, transferReviewScreen2.d(), zhm.v.k(new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new CenteredAmountDelegate(null), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextWarningDelegate(), new RowLoadingDelegate(), new SimpleMediaDelegate(), new TextDelegate(), (CellDetailsActionDelegate) transferReviewScreen2.O.getValue(), (CellDetailsSwitcherDelegate) transferReviewScreen2.P.getValue(), (RowDelegate) transferReviewScreen2.Q.getValue()), R$id.transferScreenReview_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferReviewScreen.W;
                        qji.b bVarU2 = transferReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.transfer.review.di.TransferReviewScreenInjector");
                        l0 l0Var = (l0) bVarU2;
                        p12.v vVar = l0Var.f231717b;
                        l0 l0Var2 = l0Var.f231718c;
                        TransferReviewContract$InputData transferReviewContract$InputData = transferReviewScreen.K;
                        transferReviewContract$InputData.getClass();
                        return new w0(vVar, l0Var2, transferReviewScreen, transferReviewContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TransferReviewScreen.W;
                        return (i) ((w0) transferReviewScreen.U.getValue()).k.get();
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: i52.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReviewScreen f158578b;

            {
                this.f158578b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransferReviewScreen transferReviewScreen = this.f158578b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReviewScreen.W;
                        TransferReviewScreen transferReviewScreen2 = this.f158578b;
                        return dli.f.a(transferReviewScreen2, transferReviewScreen2.d(), zhm.v.k(new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new CenteredAmountDelegate(null), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextWarningDelegate(), new RowLoadingDelegate(), new SimpleMediaDelegate(), new TextDelegate(), (CellDetailsActionDelegate) transferReviewScreen2.O.getValue(), (CellDetailsSwitcherDelegate) transferReviewScreen2.P.getValue(), (RowDelegate) transferReviewScreen2.Q.getValue()), R$id.transferScreenReview_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferReviewScreen.W;
                        qji.b bVarU2 = transferReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.transfer.review.di.TransferReviewScreenInjector");
                        l0 l0Var = (l0) bVarU2;
                        p12.v vVar = l0Var.f231717b;
                        l0 l0Var2 = l0Var.f231718c;
                        TransferReviewContract$InputData transferReviewContract$InputData = transferReviewScreen.K;
                        transferReviewContract$InputData.getClass();
                        return new w0(vVar, l0Var2, transferReviewScreen, transferReviewContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TransferReviewScreen.W;
                        return (i) ((w0) transferReviewScreen.U.getValue()).k.get();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i52.h uiState = (i52.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f201202c;
        TextLocalisedClause textLocalisedClause = uiState.f158561c;
        Clause clause = uiState.d;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.j0(false);
        i52.a aVar = uiState.f158560b;
        LargeActionButton largeActionButton = d3().d;
        largeActionButton.setEnabled(aVar.f158543b);
        largeActionButton.setText((Clause) aVar.f158542a);
        FooterTextView transferScreenReviewFooterText = d3().f201201b;
        Intrinsics.checkNotNullExpressionValue(transferScreenReviewFooterText, "transferScreenReviewFooterText");
        transferScreenReviewFooterText.setVisibility(clause != null ? 0 : 8);
        if (clause != null) {
            d3().f201201b.setContent(new c7(clause, false, null, 6));
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        a aVar = (a) d();
        aVar.C2(new d(aVar.o.f62468c));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w0) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r06 = this.U;
        ((w0) r06.getValue()).getClass();
        b.p(view, this.K.e);
        ((j60.a) ((w0) r06.getValue()).f.get()).d(v.k((TextDelegate) this.R.getValue(), (CellDetailsDelegate) this.S.getValue()));
        d3().f201202c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().d.setLoadingButtonTag("APM_TRANSFER_REVIEW_CTA_BUTTON_TAG");
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f201202c.f59410q), null, new r(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f201202c.f59409p.f57336l), null, new r(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.o), null, new r(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionDelegate) this.O.getValue()).d), null, new i52.s(this, null), 3);
        ?? r56 = this.P;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsSwitcherDelegate) r56.getValue()).f51912c), null, new t(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsSwitcherDelegate) r56.getValue()).d), null, new u(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.Q.getValue()).k), null, new i52.v(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsDelegate) this.S.getValue()).d), null, new i52.w(this, null), 3);
    }

    public final m12.e d3() {
        ViewBinding value = this.N.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m12.e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.V.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
