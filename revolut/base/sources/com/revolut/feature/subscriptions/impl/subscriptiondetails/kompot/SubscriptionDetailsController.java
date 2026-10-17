package com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionableIconDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsGifDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPhotoDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.SubscriptionDetailsController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dce.d;
import dce.f;
import dce.g;
import dce.i;
import dce.i0;
import dce.j;
import dce.k;
import dce.l;
import dce.m;
import dce.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ltki/c;", "Ldce/q;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubscriptionDetailsController extends ViewController<Object> implements tki.c {
    public static final /* synthetic */ KProperty[] j0 = {o0.f186429a.j(new h0(SubscriptionDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f89242a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f89243b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f89244d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f89245e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f89246h0;
    public final Object i0;

    public SubscriptionDetailsController(SubscriptionDetailsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, dce.c.f);
        this.M = w.y0(new cvi.b(this, inputData, 23));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: dce.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionDetailsController f112856b;

            {
                this.f112856b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SubscriptionDetailsController subscriptionDetailsController = this.f112856b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SubscriptionDetailsController.j0;
                        return (o) ((i9e.q) ((ece.c) subscriptionDetailsController.M.getValue())).I.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SubscriptionDetailsController.j0;
                        SubscriptionDetailsController subscriptionDetailsController2 = this.f112856b;
                        return tki.g.a(subscriptionDetailsController2, subscriptionDetailsController2.R2(), zhm.v.k((CellDetailsGifDelegate) subscriptionDetailsController2.T.getValue(), (ActionsDelegate) subscriptionDetailsController2.V.getValue(), (CellDetailsActionDelegate) subscriptionDetailsController2.P.getValue(), (CellDetailsDelegate) subscriptionDetailsController2.U.getValue(), (CellDetailsNoteDelegate) subscriptionDetailsController2.Q.getValue(), (CellDetailsPhotoDelegate) subscriptionDetailsController2.f89242a0.getValue(), (CellDetailsChevronDelegate) subscriptionDetailsController2.R.getValue(), (CellDetailsSwitcherDelegate) subscriptionDetailsController2.S.getValue(), (ListSubheaderDelegate) subscriptionDetailsController2.O.getValue(), (CellDetailsActionableIconDelegate) subscriptionDetailsController2.f89243b0.getValue(), (RowDelegate) subscriptionDetailsController2.W.getValue(), (PlainTextDelegate) subscriptionDetailsController2.Y.getValue(), (PlainTextWarningDelegate) subscriptionDetailsController2.c0.getValue(), (SwipeToActionDelegate) subscriptionDetailsController2.Z.getValue(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), (FullScreenStateDelegate) subscriptionDetailsController2.f89244d0.getValue(), (LargeActionButtonDelegate) subscriptionDetailsController2.f0.getValue(), new IconDelegate(), (CellDetailsAccountDelegate) subscriptionDetailsController2.g0.getValue(), (AccountCellItemDelegate) subscriptionDetailsController2.X.getValue(), (DatePickerDelegate) subscriptionDetailsController2.f89245e0.getValue(), (ActionWidgetDelegate) subscriptionDetailsController2.f89246h0.getValue()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr3 = SubscriptionDetailsController.j0;
                        return new SwipeToActionDelegate((RowDelegate) subscriptionDetailsController.W.getValue(), false);
                }
            }
        });
        this.O = w.y0(new d8j.b(16));
        this.P = w.y0(new d8j.b(17));
        this.Q = w.y0(new d8j.b(18));
        this.R = w.y0(new d8j.b(19));
        this.S = w.y0(new d8j.b(20));
        this.T = w.y0(new d8j.b(22));
        this.U = w.y0(new d8j.b(23));
        this.V = w.y0(new d8j.b(24));
        this.W = w.y0(new d8j.b(21));
        this.X = w.y0(new d8j.b(25));
        this.Y = w.y0(new d8j.b(26));
        final int i2 = 2;
        this.Z = w.y0(new Function0(this) { // from class: dce.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionDetailsController f112856b;

            {
                this.f112856b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SubscriptionDetailsController subscriptionDetailsController = this.f112856b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SubscriptionDetailsController.j0;
                        return (o) ((i9e.q) ((ece.c) subscriptionDetailsController.M.getValue())).I.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SubscriptionDetailsController.j0;
                        SubscriptionDetailsController subscriptionDetailsController2 = this.f112856b;
                        return tki.g.a(subscriptionDetailsController2, subscriptionDetailsController2.R2(), zhm.v.k((CellDetailsGifDelegate) subscriptionDetailsController2.T.getValue(), (ActionsDelegate) subscriptionDetailsController2.V.getValue(), (CellDetailsActionDelegate) subscriptionDetailsController2.P.getValue(), (CellDetailsDelegate) subscriptionDetailsController2.U.getValue(), (CellDetailsNoteDelegate) subscriptionDetailsController2.Q.getValue(), (CellDetailsPhotoDelegate) subscriptionDetailsController2.f89242a0.getValue(), (CellDetailsChevronDelegate) subscriptionDetailsController2.R.getValue(), (CellDetailsSwitcherDelegate) subscriptionDetailsController2.S.getValue(), (ListSubheaderDelegate) subscriptionDetailsController2.O.getValue(), (CellDetailsActionableIconDelegate) subscriptionDetailsController2.f89243b0.getValue(), (RowDelegate) subscriptionDetailsController2.W.getValue(), (PlainTextDelegate) subscriptionDetailsController2.Y.getValue(), (PlainTextWarningDelegate) subscriptionDetailsController2.c0.getValue(), (SwipeToActionDelegate) subscriptionDetailsController2.Z.getValue(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), (FullScreenStateDelegate) subscriptionDetailsController2.f89244d0.getValue(), (LargeActionButtonDelegate) subscriptionDetailsController2.f0.getValue(), new IconDelegate(), (CellDetailsAccountDelegate) subscriptionDetailsController2.g0.getValue(), (AccountCellItemDelegate) subscriptionDetailsController2.X.getValue(), (DatePickerDelegate) subscriptionDetailsController2.f89245e0.getValue(), (ActionWidgetDelegate) subscriptionDetailsController2.f89246h0.getValue()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr3 = SubscriptionDetailsController.j0;
                        return new SwipeToActionDelegate((RowDelegate) subscriptionDetailsController.W.getValue(), false);
                }
            }
        });
        this.f89242a0 = w.y0(new d8j.b(27));
        this.f89243b0 = w.y0(new d8j.b(28));
        this.c0 = w.y0(new d8j.b(29));
        this.f89244d0 = w.y0(new dce.b(0));
        this.f89245e0 = w.y0(new dce.b(1));
        this.f0 = w.y0(new d8j.b(13));
        this.g0 = w.y0(new d8j.b(14));
        this.f89246h0 = w.y0(new d8j.b(15));
        final int i3 = 1;
        this.i0 = w.y0(new Function0(this) { // from class: dce.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionDetailsController f112856b;

            {
                this.f112856b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SubscriptionDetailsController subscriptionDetailsController = this.f112856b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SubscriptionDetailsController.j0;
                        return (o) ((i9e.q) ((ece.c) subscriptionDetailsController.M.getValue())).I.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SubscriptionDetailsController.j0;
                        SubscriptionDetailsController subscriptionDetailsController2 = this.f112856b;
                        return tki.g.a(subscriptionDetailsController2, subscriptionDetailsController2.R2(), zhm.v.k((CellDetailsGifDelegate) subscriptionDetailsController2.T.getValue(), (ActionsDelegate) subscriptionDetailsController2.V.getValue(), (CellDetailsActionDelegate) subscriptionDetailsController2.P.getValue(), (CellDetailsDelegate) subscriptionDetailsController2.U.getValue(), (CellDetailsNoteDelegate) subscriptionDetailsController2.Q.getValue(), (CellDetailsPhotoDelegate) subscriptionDetailsController2.f89242a0.getValue(), (CellDetailsChevronDelegate) subscriptionDetailsController2.R.getValue(), (CellDetailsSwitcherDelegate) subscriptionDetailsController2.S.getValue(), (ListSubheaderDelegate) subscriptionDetailsController2.O.getValue(), (CellDetailsActionableIconDelegate) subscriptionDetailsController2.f89243b0.getValue(), (RowDelegate) subscriptionDetailsController2.W.getValue(), (PlainTextDelegate) subscriptionDetailsController2.Y.getValue(), (PlainTextWarningDelegate) subscriptionDetailsController2.c0.getValue(), (SwipeToActionDelegate) subscriptionDetailsController2.Z.getValue(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), (FullScreenStateDelegate) subscriptionDetailsController2.f89244d0.getValue(), (LargeActionButtonDelegate) subscriptionDetailsController2.f0.getValue(), new IconDelegate(), (CellDetailsAccountDelegate) subscriptionDetailsController2.g0.getValue(), (AccountCellItemDelegate) subscriptionDetailsController2.X.getValue(), (DatePickerDelegate) subscriptionDetailsController2.f89245e0.getValue(), (ActionWidgetDelegate) subscriptionDetailsController2.f89246h0.getValue()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr3 = SubscriptionDetailsController.j0;
                        return new SwipeToActionDelegate((RowDelegate) subscriptionDetailsController.W.getValue(), false);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        dce.q uiState = (dce.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        i0 i0Var = qVar instanceof i0 ? (i0) qVar : null;
        hce.a aVar = uiState.f112889b;
        if (!pd.b.k(i0Var != null ? Boolean.valueOf(i0Var.f112867a) : null) || aVar == null) {
            return;
        }
        Object obj2 = aVar.f150882g;
        Clause clause = aVar.f150880b;
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(aVar.f150879a, null);
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(clause);
        Clause clause2 = aVar.f150881c;
        navBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
        if (clause2 != null) {
            navBarWithToolbar.setSecondDescriptionText(clause2);
        }
        navBarWithToolbar.setEndIconImage(aVar.d);
        navBarWithToolbar.setEndIconBadgeImage(aVar.e);
        if (obj2 != null) {
            navBarWithToolbar.setDescriptionClickPayload(obj2);
        }
        navBarWithToolbar.setDescriptionClickable(obj2 != null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ece.c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ((j60.a) ((i9e.q) ((ece.c) this.M.getValue())).f.get()).d(v.k((PlainTextDelegate) this.Y.getValue(), (LargeActionButtonDelegate) this.f0.getValue(), (CellDetailsNoteDelegate) this.Q.getValue(), (RowDelegate) this.W.getValue(), new RowLoadingDelegate()));
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ActionsDelegate) this.V.getValue()).f51611c.f121375b), null, new dce.e(this, null, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsChevronDelegate) this.R.getValue()).f51821c), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.W.getValue()).f53218h), null, new j(this, null), 3);
        ?? r72 = this.P;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionDelegate) r72.getValue()).d), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsDelegate) this.U.getValue()).d), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.f89244d0.getValue()).f52371h.f121375b), null, new m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.f0.getValue()).d.f121375b), null, new n(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PlainTextWarningDelegate) this.c0.getValue()).d.f121375b), null, new dce.e(this, null, 6), 3);
        ?? r06 = this.Q;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsNoteDelegate) r06.getValue()).e), null, new dce.e(this, null, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsNoteDelegate) r06.getValue()).d), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsAccountDelegate) this.g0.getValue()).d), null, new dce.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionableIconDelegate) this.f89243b0.getValue()).f51807c), null, new dce.e(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionDelegate) r72.getValue()).f51780c), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.q0()), null, new dce.e(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.x0()), null, new dce.e(this, null, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ListSubheaderDelegate) this.O.getValue()).f52707c), null, new dce.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ActionWidgetDelegate) this.f89246h0.getValue()).f51589c.f121375b), null, new dce.e(this, null, 4), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.L.getValue(this, j0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final dce.o R2() {
        return (dce.o) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.i0.getValue();
    }
}
