package com.revolut.feature.devicemanagement.impl.ui.list;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.devicemanagement.impl.R$string;
import com.revolut.feature.devicemanagement.impl.ui.list.DeviceListController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import n86.c;
import no.m;
import pki.b;
import te0.w;
import vc.s;
import w86.d;
import w86.f;
import w86.i;
import w86.j;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/devicemanagement/impl/ui/list/DeviceListController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lw86/i;", "Ldli/a;", "Lw86/j;", "Lno/m;", "<init>", "()V", "feature_device_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeviceListController extends ViewController<i> implements dli.a, m {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(DeviceListController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final RowDelegate N;
    public final SwipeToActionDelegate O;
    public final AnalyticsProduct.Retail P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, jii.m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return jii.m.a(p0);
        }
    }

    public DeviceListController() {
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.N = rowDelegate;
        final int i = 0;
        this.O = new SwipeToActionDelegate(rowDelegate, false);
        k9 k9Var = k9.FinCrime;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.P = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.Q = w.y0(new Function0(this) { // from class: w86.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceListController f295592b;

            {
                this.f295592b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DeviceListController deviceListController = this.f295592b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DeviceListController.T;
                        phm.a aVar = (phm.a) ue0.e.j(deviceListController.m2()).a().get(n86.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n86.h.class, " is not found"));
                        }
                        kdh.b bVarB = ((n86.h) aVar2.b()).b();
                        bVarB.f182900c = deviceListController;
                        return (n86.c) bVarB.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = DeviceListController.T;
                        n86.c cVar = (n86.c) deviceListController.Q.getValue();
                        cVar.getClass();
                        return new k(new qee.s(new r86.d(new r86.b())), cVar.f213230a.d());
                    default:
                        KProperty[] kPropertyArr3 = DeviceListController.T;
                        DeviceListController deviceListController2 = this.f295592b;
                        return dli.f.a(deviceListController2, (f) deviceListController2.R.getValue(), v.k(deviceListController2.M, deviceListController2.N, deviceListController2.O, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: w86.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceListController f295592b;

            {
                this.f295592b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DeviceListController deviceListController = this.f295592b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeviceListController.T;
                        phm.a aVar = (phm.a) ue0.e.j(deviceListController.m2()).a().get(n86.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n86.h.class, " is not found"));
                        }
                        kdh.b bVarB = ((n86.h) aVar2.b()).b();
                        bVarB.f182900c = deviceListController;
                        return (n86.c) bVarB.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = DeviceListController.T;
                        n86.c cVar = (n86.c) deviceListController.Q.getValue();
                        cVar.getClass();
                        return new k(new qee.s(new r86.d(new r86.b())), cVar.f213230a.d());
                    default:
                        KProperty[] kPropertyArr3 = DeviceListController.T;
                        DeviceListController deviceListController2 = this.f295592b;
                        return dli.f.a(deviceListController2, (f) deviceListController2.R.getValue(), v.k(deviceListController2.M, deviceListController2.N, deviceListController2.O, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: w86.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceListController f295592b;

            {
                this.f295592b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DeviceListController deviceListController = this.f295592b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeviceListController.T;
                        phm.a aVar = (phm.a) ue0.e.j(deviceListController.m2()).a().get(n86.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n86.h.class, " is not found"));
                        }
                        kdh.b bVarB = ((n86.h) aVar2.b()).b();
                        bVarB.f182900c = deviceListController;
                        return (n86.c) bVarB.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = DeviceListController.T;
                        n86.c cVar = (n86.c) deviceListController.Q.getValue();
                        cVar.getClass();
                        return new k(new qee.s(new r86.d(new r86.b())), cVar.f213230a.d());
                    default:
                        KProperty[] kPropertyArr3 = DeviceListController.T;
                        DeviceListController deviceListController2 = this.f295592b;
                        return dli.f.a(deviceListController2, (f) deviceListController2.R.getValue(), v.k(deviceListController2.M, deviceListController2.N, deviceListController2.O, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((j) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.devices_title, null, null, 14);
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.devices_subtitle, null, null, 14));
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), new w65.c(this, null, 8), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new w86.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f), new w86.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
