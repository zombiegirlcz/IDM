package com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.datepicker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.feature.retail.restaurants.impl.R$layout;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.datepicker.ReservationDatePickerContract$InputData;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.datepicker.ReservationDatePickerScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import jeb.b;
import jeb.c;
import jeb.e;
import jeb.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sdb.a;
import vc.s;
import vdb.g;
import vdb.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/ui/reservationcreation/datepicker/ReservationDatePickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljeb/b;", "Lcli/w;", "Ljeb/c;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReservationDatePickerScreen extends ViewController<b> implements w {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(ReservationDatePickerScreen.class, "binding", "getBinding()Lcom/revolut/feature/retail/restaurants/impl/databinding/ScreenReservationDatePickerBinding;", 0))};
    public final ReservationDatePickerContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public ReservationDatePickerScreen(ReservationDatePickerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_reservation_date_picker;
        this.M = s.t(this, e.f);
        final int i = 0;
        this.N = te0.w.y0(new Function0(this) { // from class: jeb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationDatePickerScreen f173255b;

            {
                this.f173255b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ReservationDatePickerScreen reservationDatePickerScreen = this.f173255b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ReservationDatePickerScreen.Q;
                        return n14.e.a(reservationDatePickerScreen, (f) reservationDatePickerScreen.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = ReservationDatePickerScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(reservationDatePickerScreen.m2()).a().get(j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", j.class, " is not found"));
                        }
                        j jVar = ((j) aVar2.b()).i;
                        ReservationDatePickerContract$InputData reservationDatePickerContract$InputData = reservationDatePickerScreen.K;
                        reservationDatePickerContract$InputData.getClass();
                        return new vdb.g(jVar, reservationDatePickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ReservationDatePickerScreen.Q;
                        return (f) ((vdb.g) reservationDatePickerScreen.O.getValue()).f287849b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: jeb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationDatePickerScreen f173255b;

            {
                this.f173255b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ReservationDatePickerScreen reservationDatePickerScreen = this.f173255b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReservationDatePickerScreen.Q;
                        return n14.e.a(reservationDatePickerScreen, (f) reservationDatePickerScreen.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = ReservationDatePickerScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(reservationDatePickerScreen.m2()).a().get(j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", j.class, " is not found"));
                        }
                        j jVar = ((j) aVar2.b()).i;
                        ReservationDatePickerContract$InputData reservationDatePickerContract$InputData = reservationDatePickerScreen.K;
                        reservationDatePickerContract$InputData.getClass();
                        return new vdb.g(jVar, reservationDatePickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ReservationDatePickerScreen.Q;
                        return (f) ((vdb.g) reservationDatePickerScreen.O.getValue()).f287849b.get();
                }
            }
        });
        final int i3 = 2;
        this.P = te0.w.y0(new Function0(this) { // from class: jeb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationDatePickerScreen f173255b;

            {
                this.f173255b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ReservationDatePickerScreen reservationDatePickerScreen = this.f173255b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReservationDatePickerScreen.Q;
                        return n14.e.a(reservationDatePickerScreen, (f) reservationDatePickerScreen.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = ReservationDatePickerScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(reservationDatePickerScreen.m2()).a().get(j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", j.class, " is not found"));
                        }
                        j jVar = ((j) aVar2.b()).i;
                        ReservationDatePickerContract$InputData reservationDatePickerContract$InputData = reservationDatePickerScreen.K;
                        reservationDatePickerContract$InputData.getClass();
                        return new vdb.g(jVar, reservationDatePickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ReservationDatePickerScreen.Q;
                        return (f) ((vdb.g) reservationDatePickerScreen.O.getValue()).f287849b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f261845b.setCalendarData(uiState.f173251a, uiState.f173252b, uiState.f173253c, uiState.d, uiState.e, uiState.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f261846c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f261846c.f59410q), new j2c.b(this, null, 20), 3);
        ViewController.P2(this, rd0.e.b(d3().f261845b.b()), new j82.q(this, null, 16), 3);
    }

    public final a d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.N.getValue();
    }
}
