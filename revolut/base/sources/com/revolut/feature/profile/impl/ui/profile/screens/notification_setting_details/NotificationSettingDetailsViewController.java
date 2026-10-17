package com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.NotificationSettingDetailsContract$InputData;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.NotificationSettingDetailsViewController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ff4.z;
import fma.a0;
import fma.c0;
import fma.d0;
import fna.f;
import foa.d;
import foa.r;
import foa.t;
import foa.u;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.c7;
import te0.w;
import tki.c;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/screens/notification_setting_details/NotificationSettingDetailsViewController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lfoa/d;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NotificationSettingDetailsViewController extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(NotificationSettingDetailsViewController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterBinding;", 0))};
    public final NotificationSettingDetailsContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final Object Q;
    public final List R;
    public final h S;

    public NotificationSettingDetailsViewController(NotificationSettingDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: foa.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotificationSettingDetailsViewController f136881b;

            {
                this.f136881b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                NotificationSettingDetailsViewController notificationSettingDetailsViewController = this.f136881b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = NotificationSettingDetailsViewController.T;
                        qji.b bVarU2 = notificationSettingDetailsViewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.di.NotificationSettingDetailsControllerComponentInjector");
                        d0 d0Var = (d0) bVarU2;
                        c0 c0Var = d0Var.f136085b;
                        d0 d0Var2 = d0Var.f136086c;
                        NotificationSettingDetailsContract$InputData notificationSettingDetailsContract$InputData = notificationSettingDetailsViewController.K;
                        notificationSettingDetailsContract$InputData.getClass();
                        return new fma.a0(c0Var, d0Var2, notificationSettingDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = NotificationSettingDetailsViewController.T;
                        return (c) ((fma.a0) notificationSettingDetailsViewController.M.getValue()).f136041h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = NotificationSettingDetailsViewController.T;
                        NotificationSettingDetailsViewController notificationSettingDetailsViewController2 = this.f136881b;
                        return tki.g.a(notificationSettingDetailsViewController2, notificationSettingDetailsViewController2.R2(), notificationSettingDetailsViewController2.R, R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = NotificationSettingDetailsViewController.T;
                        return new SelectableDelegate(notificationSettingDetailsViewController.P);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: foa.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotificationSettingDetailsViewController f136881b;

            {
                this.f136881b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                NotificationSettingDetailsViewController notificationSettingDetailsViewController = this.f136881b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NotificationSettingDetailsViewController.T;
                        qji.b bVarU2 = notificationSettingDetailsViewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.di.NotificationSettingDetailsControllerComponentInjector");
                        d0 d0Var = (d0) bVarU2;
                        c0 c0Var = d0Var.f136085b;
                        d0 d0Var2 = d0Var.f136086c;
                        NotificationSettingDetailsContract$InputData notificationSettingDetailsContract$InputData = notificationSettingDetailsViewController.K;
                        notificationSettingDetailsContract$InputData.getClass();
                        return new fma.a0(c0Var, d0Var2, notificationSettingDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = NotificationSettingDetailsViewController.T;
                        return (c) ((fma.a0) notificationSettingDetailsViewController.M.getValue()).f136041h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = NotificationSettingDetailsViewController.T;
                        NotificationSettingDetailsViewController notificationSettingDetailsViewController2 = this.f136881b;
                        return tki.g.a(notificationSettingDetailsViewController2, notificationSettingDetailsViewController2.R2(), notificationSettingDetailsViewController2.R, R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = NotificationSettingDetailsViewController.T;
                        return new SelectableDelegate(notificationSettingDetailsViewController.P);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: foa.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotificationSettingDetailsViewController f136881b;

            {
                this.f136881b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                NotificationSettingDetailsViewController notificationSettingDetailsViewController = this.f136881b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NotificationSettingDetailsViewController.T;
                        qji.b bVarU2 = notificationSettingDetailsViewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.di.NotificationSettingDetailsControllerComponentInjector");
                        d0 d0Var = (d0) bVarU2;
                        c0 c0Var = d0Var.f136085b;
                        d0 d0Var2 = d0Var.f136086c;
                        NotificationSettingDetailsContract$InputData notificationSettingDetailsContract$InputData = notificationSettingDetailsViewController.K;
                        notificationSettingDetailsContract$InputData.getClass();
                        return new fma.a0(c0Var, d0Var2, notificationSettingDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = NotificationSettingDetailsViewController.T;
                        return (c) ((fma.a0) notificationSettingDetailsViewController.M.getValue()).f136041h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = NotificationSettingDetailsViewController.T;
                        NotificationSettingDetailsViewController notificationSettingDetailsViewController2 = this.f136881b;
                        return tki.g.a(notificationSettingDetailsViewController2, notificationSettingDetailsViewController2.R2(), notificationSettingDetailsViewController2.R, R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = NotificationSettingDetailsViewController.T;
                        return new SelectableDelegate(notificationSettingDetailsViewController.P);
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        final int i5 = 3;
        Lazy lazyY0 = w.y0(new Function0(this) { // from class: foa.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotificationSettingDetailsViewController f136881b;

            {
                this.f136881b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                NotificationSettingDetailsViewController notificationSettingDetailsViewController = this.f136881b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NotificationSettingDetailsViewController.T;
                        qji.b bVarU2 = notificationSettingDetailsViewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.di.NotificationSettingDetailsControllerComponentInjector");
                        d0 d0Var = (d0) bVarU2;
                        c0 c0Var = d0Var.f136085b;
                        d0 d0Var2 = d0Var.f136086c;
                        NotificationSettingDetailsContract$InputData notificationSettingDetailsContract$InputData = notificationSettingDetailsViewController.K;
                        notificationSettingDetailsContract$InputData.getClass();
                        return new fma.a0(c0Var, d0Var2, notificationSettingDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = NotificationSettingDetailsViewController.T;
                        return (c) ((fma.a0) notificationSettingDetailsViewController.M.getValue()).f136041h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = NotificationSettingDetailsViewController.T;
                        NotificationSettingDetailsViewController notificationSettingDetailsViewController2 = this.f136881b;
                        return tki.g.a(notificationSettingDetailsViewController2, notificationSettingDetailsViewController2.R2(), notificationSettingDetailsViewController2.R, R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = NotificationSettingDetailsViewController.T;
                        return new SelectableDelegate(notificationSettingDetailsViewController.P);
                }
            }
        });
        this.Q = lazyY0;
        this.R = v.k(rowDelegate, new FooterTextDelegate(), (SelectableDelegate) lazyY0.getValue());
        this.S = s.t(this, foa.q.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174555c;
        TextLocalisedClause textLocalisedClause = uiState.f136864a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(uiState.f136865b);
        FooterTextView footerTextView = d3().f174554b;
        Clause clause = uiState.d;
        footerTextView.setVisibility(clause != null ? 0 : 8);
        if (clause != null) {
            footerTextView.setContent(new c7(clause, false, null, 6));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a0) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174555c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174555c.f59410q), new z(this, null, 23), 3);
        ViewController.P2(this, rd0.e.b(d3().f174555c.x0()), new f(this, null, 3), 3);
        RowDelegate rowDelegate = this.P;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53225r), new r(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new foa.s(this, null), 3);
        ViewController.P2(this, rd0.e.b(((SelectableDelegate) this.Q.getValue()).r()), new t(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53224q), new u(this, null), 3);
    }

    public final jii.r d3() {
        ViewBinding value = this.S.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.r) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final foa.c R2() {
        return (foa.c) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.O.getValue();
    }
}
