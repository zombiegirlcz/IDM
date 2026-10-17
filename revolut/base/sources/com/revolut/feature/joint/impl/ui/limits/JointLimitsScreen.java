package com.revolut.feature.joint.impl.ui.limits;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.joint.impl.R$id;
import com.revolut.feature.joint.impl.R$layout;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.feature.joint.impl.ui.limits.JointLimitsScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import e48.n;
import e48.o;
import e48.p;
import e58.c;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/limits/JointLimitsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Le58/c;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "Lno/m;", "<init>", "()V", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JointLimitsScreen extends BaseRecyclerViewScreen<c, IOData$EmptyInput, q> implements m {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(JointLimitsScreen.class, "binding", "getBinding()Lcom/revolut/feature/joint/impl/databinding/ScreenJointLimitsBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final RowDelegate X;
    public final AnalyticsProduct.Retail Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f76589a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f76590b0;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, d48.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/joint/impl/databinding/ScreenJointLimitsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.screenJointLimits_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.screenJointLimits_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new d48.c((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public JointLimitsScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_joint_limits;
        this.V = R$id.screenJointLimits_recyclerView;
        this.W = s.t(this, a.f);
        this.X = new RowDelegate(null, null, 7);
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137508w;
        this.Y = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        final int i = 0;
        this.Z = w.y0(new Function0(this) { // from class: e58.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointLimitsScreen f122784b;

            {
                this.f122784b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JointLimitsScreen jointLimitsScreen = this.f122784b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JointLimitsScreen.c0;
                        return (b) ((p) jointLimitsScreen.f76590b0.getValue()).f122465a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = JointLimitsScreen.c0;
                        return v.k(new TextDelegate(), jointLimitsScreen.X);
                    default:
                        KProperty[] kPropertyArr3 = JointLimitsScreen.c0;
                        qji.b bVarQ2 = jointLimitsScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.joint.impl.ui.limits.di.JointLimitsScreenInjector");
                        n nVar = (n) ((f58.a) bVarQ2);
                        e48.g gVar = nVar.f122461b;
                        n nVar2 = nVar.f122462c;
                        p pVar = new p();
                        pVar.f122465a = e4m.b.b(new o(gVar, nVar2));
                        return pVar;
                }
            }
        });
        final int i2 = 1;
        this.f76589a0 = w.y0(new Function0(this) { // from class: e58.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointLimitsScreen f122784b;

            {
                this.f122784b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JointLimitsScreen jointLimitsScreen = this.f122784b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JointLimitsScreen.c0;
                        return (b) ((p) jointLimitsScreen.f76590b0.getValue()).f122465a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = JointLimitsScreen.c0;
                        return v.k(new TextDelegate(), jointLimitsScreen.X);
                    default:
                        KProperty[] kPropertyArr3 = JointLimitsScreen.c0;
                        qji.b bVarQ2 = jointLimitsScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.joint.impl.ui.limits.di.JointLimitsScreenInjector");
                        n nVar = (n) ((f58.a) bVarQ2);
                        e48.g gVar = nVar.f122461b;
                        n nVar2 = nVar.f122462c;
                        p pVar = new p();
                        pVar.f122465a = e4m.b.b(new o(gVar, nVar2));
                        return pVar;
                }
            }
        });
        final int i3 = 2;
        this.f76590b0 = w.y0(new Function0(this) { // from class: e58.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointLimitsScreen f122784b;

            {
                this.f122784b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JointLimitsScreen jointLimitsScreen = this.f122784b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JointLimitsScreen.c0;
                        return (b) ((p) jointLimitsScreen.f76590b0.getValue()).f122465a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = JointLimitsScreen.c0;
                        return v.k(new TextDelegate(), jointLimitsScreen.X);
                    default:
                        KProperty[] kPropertyArr3 = JointLimitsScreen.c0;
                        qji.b bVarQ2 = jointLimitsScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.joint.impl.ui.limits.di.JointLimitsScreenInjector");
                        n nVar = (n) ((f58.a) bVarQ2);
                        e48.g gVar = nVar.f122461b;
                        n nVar2 = nVar.f122462c;
                        p pVar = new p();
                        pVar.f122465a = e4m.b.b(new o(gVar, nVar2));
                        return pVar;
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.Y;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (p) this.f76590b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (e58.b) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.W.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(((d48.c) value).f111249b.f59410q), null, new dze.n(this, null, 11), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.X.f53218h), null, new e58.h(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.W.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((d48.c) value).f111249b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.joint_home_action_limits, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF86820d0() {
        return (List) this.f76589a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.U;
    }
}
