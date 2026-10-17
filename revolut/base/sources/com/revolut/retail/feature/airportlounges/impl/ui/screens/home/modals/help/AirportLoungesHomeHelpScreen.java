package com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.help;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.help.AirportLoungesHomeHelpScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.help.AirportLoungesHomeHelpScreenContract$InputData;
import cwi.x0;
import cwi.y0;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ox5.p;
import oxi.b;
import oxi.c;
import oxi.d;
import oxi.f;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/modals/help/AirportLoungesHomeHelpScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Loxi/d;", "Ldli/a;", "Loxi/f;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungesHomeHelpScreen extends ViewController<d> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AirportLoungesHomeHelpScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final AirportLoungesHomeHelpScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public AirportLoungesHomeHelpScreen(AirportLoungesHomeHelpScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_bottom_sheet_list;
        this.M = s.t(this, b.f);
        this.N = w.y0(new p(20));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: oxi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesHomeHelpScreen f230844b;

            {
                this.f230844b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AirportLoungesHomeHelpScreen airportLoungesHomeHelpScreen = this.f230844b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesHomeHelpScreen.R;
                        AirportLoungesHomeHelpScreen airportLoungesHomeHelpScreen2 = this.f230844b;
                        return dli.f.a(airportLoungesHomeHelpScreen2, (e) airportLoungesHomeHelpScreen2.Q.getValue(), u.c((RowDelegate) airportLoungesHomeHelpScreen2.N.getValue()), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungesHomeHelpScreen.R;
                        qji.b bVarU2 = airportLoungesHomeHelpScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.help.di.AirportLoungesHomeHelpScreenInjector");
                        }
                        x0 x0Var = (x0) ((pxi.a) bVarU2).b().mo3808a(airportLoungesHomeHelpScreen);
                        AirportLoungesHomeHelpScreenContract$InputData airportLoungesHomeHelpScreenContract$InputData = airportLoungesHomeHelpScreen.K;
                        switch (x0Var.f109813a) {
                            case 0:
                                airportLoungesHomeHelpScreenContract$InputData.getClass();
                                x0Var.d = airportLoungesHomeHelpScreenContract$InputData;
                                break;
                            default:
                                airportLoungesHomeHelpScreenContract$InputData.getClass();
                                x0Var.d = airportLoungesHomeHelpScreenContract$InputData;
                                break;
                        }
                        return (y0) x0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungesHomeHelpScreen.R;
                        y0 y0Var = (y0) airportLoungesHomeHelpScreen.P.getValue();
                        switch (y0Var.f109819a) {
                            case 0:
                                return (e) y0Var.f109822g.get();
                            default:
                                return (e) y0Var.f109822g.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: oxi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesHomeHelpScreen f230844b;

            {
                this.f230844b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AirportLoungesHomeHelpScreen airportLoungesHomeHelpScreen = this.f230844b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesHomeHelpScreen.R;
                        AirportLoungesHomeHelpScreen airportLoungesHomeHelpScreen2 = this.f230844b;
                        return dli.f.a(airportLoungesHomeHelpScreen2, (e) airportLoungesHomeHelpScreen2.Q.getValue(), u.c((RowDelegate) airportLoungesHomeHelpScreen2.N.getValue()), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungesHomeHelpScreen.R;
                        qji.b bVarU2 = airportLoungesHomeHelpScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.help.di.AirportLoungesHomeHelpScreenInjector");
                        }
                        x0 x0Var = (x0) ((pxi.a) bVarU2).b().mo3808a(airportLoungesHomeHelpScreen);
                        AirportLoungesHomeHelpScreenContract$InputData airportLoungesHomeHelpScreenContract$InputData = airportLoungesHomeHelpScreen.K;
                        switch (x0Var.f109813a) {
                            case 0:
                                airportLoungesHomeHelpScreenContract$InputData.getClass();
                                x0Var.d = airportLoungesHomeHelpScreenContract$InputData;
                                break;
                            default:
                                airportLoungesHomeHelpScreenContract$InputData.getClass();
                                x0Var.d = airportLoungesHomeHelpScreenContract$InputData;
                                break;
                        }
                        return (y0) x0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungesHomeHelpScreen.R;
                        y0 y0Var = (y0) airportLoungesHomeHelpScreen.P.getValue();
                        switch (y0Var.f109819a) {
                            case 0:
                                return (e) y0Var.f109822g.get();
                            default:
                                return (e) y0Var.f109822g.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: oxi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesHomeHelpScreen f230844b;

            {
                this.f230844b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AirportLoungesHomeHelpScreen airportLoungesHomeHelpScreen = this.f230844b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesHomeHelpScreen.R;
                        AirportLoungesHomeHelpScreen airportLoungesHomeHelpScreen2 = this.f230844b;
                        return dli.f.a(airportLoungesHomeHelpScreen2, (e) airportLoungesHomeHelpScreen2.Q.getValue(), u.c((RowDelegate) airportLoungesHomeHelpScreen2.N.getValue()), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungesHomeHelpScreen.R;
                        qji.b bVarU2 = airportLoungesHomeHelpScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.help.di.AirportLoungesHomeHelpScreenInjector");
                        }
                        x0 x0Var = (x0) ((pxi.a) bVarU2).b().mo3808a(airportLoungesHomeHelpScreen);
                        AirportLoungesHomeHelpScreenContract$InputData airportLoungesHomeHelpScreenContract$InputData = airportLoungesHomeHelpScreen.K;
                        switch (x0Var.f109813a) {
                            case 0:
                                airportLoungesHomeHelpScreenContract$InputData.getClass();
                                x0Var.d = airportLoungesHomeHelpScreenContract$InputData;
                                break;
                            default:
                                airportLoungesHomeHelpScreenContract$InputData.getClass();
                                x0Var.d = airportLoungesHomeHelpScreenContract$InputData;
                                break;
                        }
                        return (y0) x0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungesHomeHelpScreen.R;
                        y0 y0Var = (y0) airportLoungesHomeHelpScreen.P.getValue();
                        switch (y0Var.f109819a) {
                            case 0:
                                return (e) y0Var.f109822g.get();
                            default:
                                return (e) y0Var.f109822g.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (oxi.e) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jii.f) value).f174519b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.airport_lounges_get_help_title, null, null, 14), null, null, null, false, 30));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.N.getValue()).f53218h), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getS() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
