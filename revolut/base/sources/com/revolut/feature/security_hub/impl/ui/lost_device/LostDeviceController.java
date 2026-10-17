package com.revolut.feature.security_hub.impl.ui.lost_device;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.ui.lost_device.LostDeviceController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import cvc.c;
import cvc.d;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import vc.s;
import vn2.l;
import vtc.p;
import vtc.t;
import xki.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/lost_device/LostDeviceController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcvc/c;", "Ldli/a;", "Lcvc/d;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LostDeviceController extends ViewController<c> implements dli.a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(LostDeviceController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final int L = R$layout.screen_recycler_navbar_nextbutton;
    public final Object M;
    public final Object N;
    public final Object O;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public LostDeviceController() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: cvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LostDeviceController f109326b;

            {
                this.f109326b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LostDeviceController lostDeviceController = this.f109326b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LostDeviceController.P;
                        qji.b bVarU2 = lostDeviceController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.lost_device.di.LostDeviceControllerInjector");
                        t tVar = ((vtc.u) bVarU2).f292082b;
                        p pVar = new p();
                        pVar.f292038a = e4m.b.b(new l(tVar, pVar, 1, 13));
                        pVar.f292039b = e4m.b.b(new l(tVar, pVar, 0, 13));
                        return pVar;
                    case 1:
                        KProperty[] kPropertyArr2 = LostDeviceController.P;
                        return (e) ((p) lostDeviceController.M.getValue()).f292039b.get();
                    default:
                        KProperty[] kPropertyArr3 = LostDeviceController.P;
                        LostDeviceController lostDeviceController2 = this.f109326b;
                        return dli.f.a(lostDeviceController2, (e) lostDeviceController2.N.getValue(), m72.b.v(null, null, 7), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: cvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LostDeviceController f109326b;

            {
                this.f109326b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LostDeviceController lostDeviceController = this.f109326b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LostDeviceController.P;
                        qji.b bVarU2 = lostDeviceController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.lost_device.di.LostDeviceControllerInjector");
                        t tVar = ((vtc.u) bVarU2).f292082b;
                        p pVar = new p();
                        pVar.f292038a = e4m.b.b(new l(tVar, pVar, 1, 13));
                        pVar.f292039b = e4m.b.b(new l(tVar, pVar, 0, 13));
                        return pVar;
                    case 1:
                        KProperty[] kPropertyArr2 = LostDeviceController.P;
                        return (e) ((p) lostDeviceController.M.getValue()).f292039b.get();
                    default:
                        KProperty[] kPropertyArr3 = LostDeviceController.P;
                        LostDeviceController lostDeviceController2 = this.f109326b;
                        return dli.f.a(lostDeviceController2, (e) lostDeviceController2.N.getValue(), m72.b.v(null, null, 7), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: cvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LostDeviceController f109326b;

            {
                this.f109326b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LostDeviceController lostDeviceController = this.f109326b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LostDeviceController.P;
                        qji.b bVarU2 = lostDeviceController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.lost_device.di.LostDeviceControllerInjector");
                        t tVar = ((vtc.u) bVarU2).f292082b;
                        p pVar = new p();
                        pVar.f292038a = e4m.b.b(new l(tVar, pVar, 1, 13));
                        pVar.f292039b = e4m.b.b(new l(tVar, pVar, 0, 13));
                        return pVar;
                    case 1:
                        KProperty[] kPropertyArr2 = LostDeviceController.P;
                        return (e) ((p) lostDeviceController.M.getValue()).f292039b.get();
                    default:
                        KProperty[] kPropertyArr3 = LostDeviceController.P;
                        LostDeviceController lostDeviceController2 = this.f109326b;
                        return dli.f.a(lostDeviceController2, (e) lostDeviceController2.N.getValue(), m72.b.v(null, null, 7), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (cvc.e) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.security_hub_lost_device_screen_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.security_hub_lost_device_screen_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.security_hub_lost_device_screen_subtitle, null, null, 14));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        largeActionButton.setText(new TextLocalisedClause(R$string.security_hub_lost_device_screen_action, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new cvc.b(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new cvc.b(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.K.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
