package com.revolut.feature.devicemanagement.impl.ui.details;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.MapDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.devicemanagement.api.navigation.DeviceManagementDestination;
import com.revolut.feature.devicemanagement.impl.ui.details.DeviceDetailsController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import pki.b;
import s86.c;
import s86.d;
import s86.g;
import s86.h;
import s86.i;
import s86.n;
import s86.p;
import te0.w;
import tx0.t3;
import vc.s;
import xki.e;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/devicemanagement/impl/ui/details/DeviceDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ls86/h;", "Ldli/a;", "Ls86/i;", "Lno/m;", "feature_device_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeviceDetailsController extends ViewController<h> implements a, m {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(DeviceDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final ao.h L;
    public final MapDelegate M;
    public final FullScreenStateDelegate N;
    public final AnalyticsProduct.Retail O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public DeviceDetailsController(DeviceManagementDestination.Config.DeviceDetails input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, c.f);
        this.M = new MapDelegate();
        this.N = new FullScreenStateDelegate();
        k9 k9Var = k9.FinCrime;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.O = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        final int i = 0;
        this.P = w.y0(new s86.a(this, input, i));
        this.Q = w.y0(new Function0(this) { // from class: s86.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceDetailsController f260904b;

            {
                this.f260904b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = DeviceDetailsController.S;
                        n86.b bVar = (n86.b) ((t86.a) this.f260904b.P.getValue());
                        DeviceManagementDestination.Config.DeviceDetails deviceDetails = bVar.f213228a;
                        q qVar = new q(deviceDetails, new r86.d(new r86.b()));
                        n86.d dVar = bVar.f213229b;
                        kdh.b bVarD = dVar.d();
                        dj3.a aVarA = dVar.f213234g.a();
                        s.j(aVarA);
                        return new l(deviceDetails, qVar, bVarD, aVarA);
                    default:
                        KProperty[] kPropertyArr2 = DeviceDetailsController.S;
                        DeviceDetailsController deviceDetailsController = this.f260904b;
                        return dli.f.a(deviceDetailsController, (g) deviceDetailsController.Q.getValue(), v.k(deviceDetailsController.M, deviceDetailsController.N, new ListSubheaderDelegate(), new CellDetailsDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: s86.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceDetailsController f260904b;

            {
                this.f260904b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DeviceDetailsController.S;
                        n86.b bVar = (n86.b) ((t86.a) this.f260904b.P.getValue());
                        DeviceManagementDestination.Config.DeviceDetails deviceDetails = bVar.f213228a;
                        q qVar = new q(deviceDetails, new r86.d(new r86.b()));
                        n86.d dVar = bVar.f213229b;
                        kdh.b bVarD = dVar.d();
                        dj3.a aVarA = dVar.f213234g.a();
                        s.j(aVarA);
                        return new l(deviceDetails, qVar, bVarD, aVarA);
                    default:
                        KProperty[] kPropertyArr2 = DeviceDetailsController.S;
                        DeviceDetailsController deviceDetailsController = this.f260904b;
                        return dli.f.a(deviceDetailsController, (g) deviceDetailsController.Q.getValue(), v.k(deviceDetailsController.M, deviceDetailsController.N, new ListSubheaderDelegate(), new CellDetailsDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        p pVar = uiState.f260907a;
        if (pVar instanceof s86.m) {
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            navBarWithToolbar.l0();
            navBarWithToolbar.setTitleVisible(true);
            navBarWithToolbar.setSecondDescriptionVisible(true);
            s86.m mVar = (s86.m) pVar;
            ?? r110 = mVar.f260916a;
            navBarWithToolbar.setTitle(r110, null);
            navBarWithToolbar.setToolbarTitle(r110);
            navBarWithToolbar.setSecondDescriptionText(mVar.d);
            navBarWithToolbar.setEndIconImage(mVar.f260917b);
            navBarWithToolbar.setFilters(mVar.f260918c);
            return;
        }
        if (!pVar.equals(n.f260919a) && !pVar.equals(s86.o.f260920a)) {
            throw new NoWhenBranchMatchedException();
        }
        NavBarWithToolbar navBarWithToolbar2 = d3().f174539b;
        if (pVar instanceof s86.o) {
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar2.I0(t3Var, false);
        }
        if (pVar instanceof n) {
            navBarWithToolbar2.l0();
        }
        navBarWithToolbar2.setTitleVisible(false);
        navBarWithToolbar2.setSecondDescriptionVisible(false);
        navBarWithToolbar2.setFilters(f0.f322471a);
        navBarWithToolbar2.setEndIconImage(null);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t86.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (g) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new s1k.b(this, continuation, 15), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.s0()), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52762c), new s56.i(this, continuation, 12), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new s86.e(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
