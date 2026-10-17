package com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.date_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.date_picker.DatePickerContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.date_picker.DatePickerController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.f;
import jpd.b;
import jpd.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ppd.a0;
import ppd.l;
import ppd.n;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/custom_period/date_picker/DatePickerController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/custom_period/date_picker/DatePickerContract$OutputData;", "Ldli/a;", "Ljpd/b;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DatePickerController extends ViewController<DatePickerContract$OutputData> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(DatePickerController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final DatePickerContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final DatePickerDelegate P;
    public final Object Q;

    public DatePickerController(DatePickerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_bottom_sheet_list;
        this.M = s.t(this, d.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: jpd.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DatePickerController f177263b;

            {
                this.f177263b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DatePickerController datePickerController = this.f177263b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DatePickerController.R;
                        qji.b bVarU2 = datePickerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.date_picker.di.DatePickerScreenInjector");
                        l lVar = (l) bVarU2;
                        n nVar = lVar.f238466b;
                        l lVar2 = lVar.f238467c;
                        DatePickerContract$InputData datePickerContract$InputData = datePickerController.K;
                        datePickerContract$InputData.getClass();
                        return new a0(nVar, lVar2, datePickerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DatePickerController.R;
                        return (e) ((a0) datePickerController.N.getValue()).f238372c.get();
                    default:
                        KProperty[] kPropertyArr3 = DatePickerController.R;
                        DatePickerController datePickerController2 = this.f177263b;
                        return dli.f.a(datePickerController2, (e) datePickerController2.O.getValue(), u.c(datePickerController2.P), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: jpd.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DatePickerController f177263b;

            {
                this.f177263b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DatePickerController datePickerController = this.f177263b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DatePickerController.R;
                        qji.b bVarU2 = datePickerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.date_picker.di.DatePickerScreenInjector");
                        l lVar = (l) bVarU2;
                        n nVar = lVar.f238466b;
                        l lVar2 = lVar.f238467c;
                        DatePickerContract$InputData datePickerContract$InputData = datePickerController.K;
                        datePickerContract$InputData.getClass();
                        return new a0(nVar, lVar2, datePickerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DatePickerController.R;
                        return (e) ((a0) datePickerController.N.getValue()).f238372c.get();
                    default:
                        KProperty[] kPropertyArr3 = DatePickerController.R;
                        DatePickerController datePickerController2 = this.f177263b;
                        return dli.f.a(datePickerController2, (e) datePickerController2.O.getValue(), u.c(datePickerController2.P), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new DatePickerDelegate();
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: jpd.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DatePickerController f177263b;

            {
                this.f177263b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DatePickerController datePickerController = this.f177263b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DatePickerController.R;
                        qji.b bVarU2 = datePickerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.date_picker.di.DatePickerScreenInjector");
                        l lVar = (l) bVarU2;
                        n nVar = lVar.f238466b;
                        l lVar2 = lVar.f238467c;
                        DatePickerContract$InputData datePickerContract$InputData = datePickerController.K;
                        datePickerContract$InputData.getClass();
                        return new a0(nVar, lVar2, datePickerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DatePickerController.R;
                        return (e) ((a0) datePickerController.N.getValue()).f238372c.get();
                    default:
                        KProperty[] kPropertyArr3 = DatePickerController.R;
                        DatePickerController datePickerController2 = this.f177263b;
                        return dli.f.a(datePickerController2, (e) datePickerController2.O.getValue(), u.c(datePickerController2.P), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((b) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (jpd.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((f) value).f174519b.setHeaderModel(new lw0.a(this.K.f87665a, null, null, null, false, 30));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52176c.f121375b), null, new jij.h(this, (Continuation) null, 14), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
