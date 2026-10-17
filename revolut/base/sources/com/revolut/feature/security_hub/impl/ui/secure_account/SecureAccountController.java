package com.revolut.feature.security_hub.impl.ui.secure_account;

import an9.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.d;
import aw0.e;
import aw0.n6;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.core.ui_kit.delegates.ExpandableCellLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.impl.ui.secure_account.SecureAccountController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.common.ui.R$string;
import dli.c;
import gu7.v1;
import gul.f;
import gul.n;
import gvc.i;
import gvc.j;
import java.util.List;
import jii.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import yp0.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/secure_account/SecureAccountController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgvc/i;", "Ldli/a;", "Lgvc/j;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SecureAccountController extends ViewController<i> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(SecureAccountController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final Object L;
    public final Object M;
    public final Object O;
    public final Object P;
    public final Object R;
    public final Object S;
    public final Object T;
    public final h K = s.t(this, a.f);
    public final Object N = w.y0(new v1(29));
    public final int Q = R$layout.screen_recycler_navbar_action_footer;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, k.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return k.a(p0);
        }
    }

    public SecureAccountController() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: gvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SecureAccountController f147122b;

            {
                this.f147122b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SecureAccountController secureAccountController = this.f147122b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SecureAccountController.U;
                        return secureAccountController.d3().f174534c;
                    case 1:
                        KProperty[] kPropertyArr2 = SecureAccountController.U;
                        return secureAccountController.d3().f174533b;
                    case 2:
                        KProperty[] kPropertyArr3 = SecureAccountController.U;
                        return new SelectableDelegate((RowDelegate) secureAccountController.N.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = SecureAccountController.U;
                        return secureAccountController.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = SecureAccountController.U;
                        qji.b bVarU2 = secureAccountController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.secure_account.di.SecureAccountControllerInjector");
                        vtc.u uVar = (vtc.u) bVarU2;
                        return new vtc.s(uVar.f292082b, uVar.f292083c);
                    case 5:
                        KProperty[] kPropertyArr6 = SecureAccountController.U;
                        return (h) ((vtc.s) secureAccountController.R.getValue()).f292056c.get();
                    default:
                        KProperty[] kPropertyArr7 = SecureAccountController.U;
                        SecureAccountController secureAccountController2 = this.f147122b;
                        return dli.f.a(secureAccountController2, secureAccountController2.R2(), zhm.v.k(new ExpandableCellDelegate(), new ExpandableCellLoadingDelegate(), (RowDelegate) secureAccountController2.N.getValue(), (SelectableDelegate) secureAccountController2.O.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: gvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SecureAccountController f147122b;

            {
                this.f147122b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SecureAccountController secureAccountController = this.f147122b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SecureAccountController.U;
                        return secureAccountController.d3().f174534c;
                    case 1:
                        KProperty[] kPropertyArr2 = SecureAccountController.U;
                        return secureAccountController.d3().f174533b;
                    case 2:
                        KProperty[] kPropertyArr3 = SecureAccountController.U;
                        return new SelectableDelegate((RowDelegate) secureAccountController.N.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = SecureAccountController.U;
                        return secureAccountController.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = SecureAccountController.U;
                        qji.b bVarU2 = secureAccountController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.secure_account.di.SecureAccountControllerInjector");
                        vtc.u uVar = (vtc.u) bVarU2;
                        return new vtc.s(uVar.f292082b, uVar.f292083c);
                    case 5:
                        KProperty[] kPropertyArr6 = SecureAccountController.U;
                        return (h) ((vtc.s) secureAccountController.R.getValue()).f292056c.get();
                    default:
                        KProperty[] kPropertyArr7 = SecureAccountController.U;
                        SecureAccountController secureAccountController2 = this.f147122b;
                        return dli.f.a(secureAccountController2, secureAccountController2.R2(), zhm.v.k(new ExpandableCellDelegate(), new ExpandableCellLoadingDelegate(), (RowDelegate) secureAccountController2.N.getValue(), (SelectableDelegate) secureAccountController2.O.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: gvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SecureAccountController f147122b;

            {
                this.f147122b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SecureAccountController secureAccountController = this.f147122b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SecureAccountController.U;
                        return secureAccountController.d3().f174534c;
                    case 1:
                        KProperty[] kPropertyArr2 = SecureAccountController.U;
                        return secureAccountController.d3().f174533b;
                    case 2:
                        KProperty[] kPropertyArr3 = SecureAccountController.U;
                        return new SelectableDelegate((RowDelegate) secureAccountController.N.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = SecureAccountController.U;
                        return secureAccountController.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = SecureAccountController.U;
                        qji.b bVarU2 = secureAccountController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.secure_account.di.SecureAccountControllerInjector");
                        vtc.u uVar = (vtc.u) bVarU2;
                        return new vtc.s(uVar.f292082b, uVar.f292083c);
                    case 5:
                        KProperty[] kPropertyArr6 = SecureAccountController.U;
                        return (h) ((vtc.s) secureAccountController.R.getValue()).f292056c.get();
                    default:
                        KProperty[] kPropertyArr7 = SecureAccountController.U;
                        SecureAccountController secureAccountController2 = this.f147122b;
                        return dli.f.a(secureAccountController2, secureAccountController2.R2(), zhm.v.k(new ExpandableCellDelegate(), new ExpandableCellLoadingDelegate(), (RowDelegate) secureAccountController2.N.getValue(), (SelectableDelegate) secureAccountController2.O.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.P = w.y0(new Function0(this) { // from class: gvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SecureAccountController f147122b;

            {
                this.f147122b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                SecureAccountController secureAccountController = this.f147122b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SecureAccountController.U;
                        return secureAccountController.d3().f174534c;
                    case 1:
                        KProperty[] kPropertyArr2 = SecureAccountController.U;
                        return secureAccountController.d3().f174533b;
                    case 2:
                        KProperty[] kPropertyArr3 = SecureAccountController.U;
                        return new SelectableDelegate((RowDelegate) secureAccountController.N.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = SecureAccountController.U;
                        return secureAccountController.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = SecureAccountController.U;
                        qji.b bVarU2 = secureAccountController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.secure_account.di.SecureAccountControllerInjector");
                        vtc.u uVar = (vtc.u) bVarU2;
                        return new vtc.s(uVar.f292082b, uVar.f292083c);
                    case 5:
                        KProperty[] kPropertyArr6 = SecureAccountController.U;
                        return (h) ((vtc.s) secureAccountController.R.getValue()).f292056c.get();
                    default:
                        KProperty[] kPropertyArr7 = SecureAccountController.U;
                        SecureAccountController secureAccountController2 = this.f147122b;
                        return dli.f.a(secureAccountController2, secureAccountController2.R2(), zhm.v.k(new ExpandableCellDelegate(), new ExpandableCellLoadingDelegate(), (RowDelegate) secureAccountController2.N.getValue(), (SelectableDelegate) secureAccountController2.O.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.R = w.y0(new Function0(this) { // from class: gvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SecureAccountController f147122b;

            {
                this.f147122b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                SecureAccountController secureAccountController = this.f147122b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SecureAccountController.U;
                        return secureAccountController.d3().f174534c;
                    case 1:
                        KProperty[] kPropertyArr2 = SecureAccountController.U;
                        return secureAccountController.d3().f174533b;
                    case 2:
                        KProperty[] kPropertyArr3 = SecureAccountController.U;
                        return new SelectableDelegate((RowDelegate) secureAccountController.N.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = SecureAccountController.U;
                        return secureAccountController.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = SecureAccountController.U;
                        qji.b bVarU2 = secureAccountController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.secure_account.di.SecureAccountControllerInjector");
                        vtc.u uVar = (vtc.u) bVarU2;
                        return new vtc.s(uVar.f292082b, uVar.f292083c);
                    case 5:
                        KProperty[] kPropertyArr6 = SecureAccountController.U;
                        return (h) ((vtc.s) secureAccountController.R.getValue()).f292056c.get();
                    default:
                        KProperty[] kPropertyArr7 = SecureAccountController.U;
                        SecureAccountController secureAccountController2 = this.f147122b;
                        return dli.f.a(secureAccountController2, secureAccountController2.R2(), zhm.v.k(new ExpandableCellDelegate(), new ExpandableCellLoadingDelegate(), (RowDelegate) secureAccountController2.N.getValue(), (SelectableDelegate) secureAccountController2.O.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i21 = 5;
        this.S = w.y0(new Function0(this) { // from class: gvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SecureAccountController f147122b;

            {
                this.f147122b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                SecureAccountController secureAccountController = this.f147122b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SecureAccountController.U;
                        return secureAccountController.d3().f174534c;
                    case 1:
                        KProperty[] kPropertyArr2 = SecureAccountController.U;
                        return secureAccountController.d3().f174533b;
                    case 2:
                        KProperty[] kPropertyArr3 = SecureAccountController.U;
                        return new SelectableDelegate((RowDelegate) secureAccountController.N.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = SecureAccountController.U;
                        return secureAccountController.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = SecureAccountController.U;
                        qji.b bVarU2 = secureAccountController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.secure_account.di.SecureAccountControllerInjector");
                        vtc.u uVar = (vtc.u) bVarU2;
                        return new vtc.s(uVar.f292082b, uVar.f292083c);
                    case 5:
                        KProperty[] kPropertyArr6 = SecureAccountController.U;
                        return (h) ((vtc.s) secureAccountController.R.getValue()).f292056c.get();
                    default:
                        KProperty[] kPropertyArr7 = SecureAccountController.U;
                        SecureAccountController secureAccountController2 = this.f147122b;
                        return dli.f.a(secureAccountController2, secureAccountController2.R2(), zhm.v.k(new ExpandableCellDelegate(), new ExpandableCellLoadingDelegate(), (RowDelegate) secureAccountController2.N.getValue(), (SelectableDelegate) secureAccountController2.O.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i22 = 6;
        this.T = w.y0(new Function0(this) { // from class: gvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SecureAccountController f147122b;

            {
                this.f147122b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i22;
                SecureAccountController secureAccountController = this.f147122b;
                switch (i222) {
                    case 0:
                        KProperty[] kPropertyArr = SecureAccountController.U;
                        return secureAccountController.d3().f174534c;
                    case 1:
                        KProperty[] kPropertyArr2 = SecureAccountController.U;
                        return secureAccountController.d3().f174533b;
                    case 2:
                        KProperty[] kPropertyArr3 = SecureAccountController.U;
                        return new SelectableDelegate((RowDelegate) secureAccountController.N.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = SecureAccountController.U;
                        return secureAccountController.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = SecureAccountController.U;
                        qji.b bVarU2 = secureAccountController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.secure_account.di.SecureAccountControllerInjector");
                        vtc.u uVar = (vtc.u) bVarU2;
                        return new vtc.s(uVar.f292082b, uVar.f292083c);
                    case 5:
                        KProperty[] kPropertyArr6 = SecureAccountController.U;
                        return (h) ((vtc.s) secureAccountController.R.getValue()).f292056c.get();
                    default:
                        KProperty[] kPropertyArr7 = SecureAccountController.U;
                        SecureAccountController secureAccountController2 = this.f147122b;
                        return dli.f.a(secureAccountController2, secureAccountController2.R2(), zhm.v.k(new ExpandableCellDelegate(), new ExpandableCellLoadingDelegate(), (RowDelegate) secureAccountController2.N.getValue(), (SelectableDelegate) secureAccountController2.O.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    public static void f3(ActionFooterView actionFooterView, boolean z, Clause clause) {
        actionFooterView.setModel(new e(false, clause, null, new n6(new TextLocalisedClause(R$string.common_action_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, z, null, null, 988), new d(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), null, 37));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        Integer num = uiState.f147132b;
        if (num != null) {
            ((ScreenContentRecyclerView) this.P.getValue()).smoothScrollToPosition(num.intValue());
        }
        f3((ActionFooterView) this.M.getValue(), !uiState.f147133c, uiState.d);
        com.revolut.feature.security_hub.impl.ui.secure_account.a aVar = (com.revolut.feature.security_hub.impl.ui.secure_account.a) R2();
        aVar.H2(aVar.f85635t, new f(28));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (vtc.s) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.L.getValue();
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_secure_account_screen_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_secure_account_screen_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_secure_account_screen_subtitle, null, null, 14));
        ActionFooterView actionFooterView = (ActionFooterView) this.M.getValue();
        m70.a.t(t0.f186434a);
        f3(actionFooterView, true, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        ((ScreenContentRecyclerView) this.P.getValue()).setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((NavBarWithToolbar) this.L.getValue()).f59410q), new gvc.d(this, continuation, 0), 3);
        ?? r92 = this.M;
        int i = 1;
        ViewController.P2(this, rd0.e.b(((ActionFooterView) r92.getValue()).f), new gvc.d(this, continuation, i), 3);
        ?? r06 = this.N;
        ViewController.P2(this, new exe.j(new g(vkm.q.J(rd0.e.b(((RowDelegate) r06.getValue()).f53218h), rd0.e.b(((SelectableDelegate) this.O.getValue()).r())), 13), 10), new n(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) r06.getValue()).f53224q), new gvc.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(((ActionFooterView) r92.getValue()).f58956h), new gvc.f(this, null), 3);
        y.b((ScreenContentRecyclerView) this.P.getValue(), new gmk.j(this, 26));
    }

    public final k d3() {
        ViewBinding value = this.K.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final gvc.h R2() {
        return (gvc.h) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.T.getValue();
    }
}
