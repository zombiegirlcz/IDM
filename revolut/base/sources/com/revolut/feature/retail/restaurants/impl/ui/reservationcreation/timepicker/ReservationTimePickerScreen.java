package com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.timepicker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PickerDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.restaurants.impl.R$string;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.timepicker.ReservationTimePickerContract$InputData;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.timepicker.ReservationTimePickerScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ocb.d;
import oeb.b;
import oeb.c;
import oeb.e;
import oeb.f;
import te0.w;
import vc.s;
import vdb.i;
import vdb.j;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/ui/reservationcreation/timepicker/ReservationTimePickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Loeb/b;", "Ldli/a;", "Loeb/c;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReservationTimePickerScreen extends ViewController<b> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(ReservationTimePickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final ReservationTimePickerContract$InputData K;
    public final int L;
    public final h M;
    public final PickerDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public ReservationTimePickerScreen(ReservationTimePickerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        this.M = s.t(this, e.f);
        this.N = new PickerDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: oeb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationTimePickerScreen f224574b;

            {
                this.f224574b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ReservationTimePickerScreen reservationTimePickerScreen = this.f224574b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ReservationTimePickerScreen.R;
                        ReservationTimePickerScreen reservationTimePickerScreen2 = this.f224574b;
                        return dli.f.a(reservationTimePickerScreen2, (f) reservationTimePickerScreen2.Q.getValue(), u.c(reservationTimePickerScreen2.N), reservationTimePickerScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ReservationTimePickerScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(reservationTimePickerScreen.m2()).a().get(j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", j.class, " is not found"));
                        }
                        j jVar = ((j) aVar2.b()).i;
                        ReservationTimePickerContract$InputData reservationTimePickerContract$InputData = reservationTimePickerScreen.K;
                        reservationTimePickerContract$InputData.getClass();
                        return new i(jVar, reservationTimePickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ReservationTimePickerScreen.R;
                        return (f) ((i) reservationTimePickerScreen.P.getValue()).f287853b.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: oeb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationTimePickerScreen f224574b;

            {
                this.f224574b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ReservationTimePickerScreen reservationTimePickerScreen = this.f224574b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReservationTimePickerScreen.R;
                        ReservationTimePickerScreen reservationTimePickerScreen2 = this.f224574b;
                        return dli.f.a(reservationTimePickerScreen2, (f) reservationTimePickerScreen2.Q.getValue(), u.c(reservationTimePickerScreen2.N), reservationTimePickerScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ReservationTimePickerScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(reservationTimePickerScreen.m2()).a().get(j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", j.class, " is not found"));
                        }
                        j jVar = ((j) aVar2.b()).i;
                        ReservationTimePickerContract$InputData reservationTimePickerContract$InputData = reservationTimePickerScreen.K;
                        reservationTimePickerContract$InputData.getClass();
                        return new i(jVar, reservationTimePickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ReservationTimePickerScreen.R;
                        return (f) ((i) reservationTimePickerScreen.P.getValue()).f287853b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: oeb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationTimePickerScreen f224574b;

            {
                this.f224574b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ReservationTimePickerScreen reservationTimePickerScreen = this.f224574b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReservationTimePickerScreen.R;
                        ReservationTimePickerScreen reservationTimePickerScreen2 = this.f224574b;
                        return dli.f.a(reservationTimePickerScreen2, (f) reservationTimePickerScreen2.Q.getValue(), u.c(reservationTimePickerScreen2.N), reservationTimePickerScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ReservationTimePickerScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(reservationTimePickerScreen.m2()).a().get(j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", j.class, " is not found"));
                        }
                        j jVar = ((j) aVar2.b()).i;
                        ReservationTimePickerContract$InputData reservationTimePickerContract$InputData = reservationTimePickerScreen.K;
                        reservationTimePickerContract$InputData.getClass();
                        return new i(jVar, reservationTimePickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ReservationTimePickerScreen.R;
                        return (f) ((i) reservationTimePickerScreen.P.getValue()).f287853b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174546c.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.retail_restaurants_create_reservation_header_generic, null, null, 14), null, null, null, false, 30));
        d3().f174545b.setText(new TextLocalisedClause(R$string.retail_restaurants_reservation_details_actions_save, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.N.f52922c), new o95.c(this, null, 15), 3);
        ViewController.P2(this, rd0.e.b(d3().f174545b.o), new d(this, null, 2), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
