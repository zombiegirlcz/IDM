package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.picker.date_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.DoublePickerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PickerDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.picker.date_picker.DatePickerBottomSheetController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jrd.c;
import jrd.d;
import jrd.f;
import jrd.g;
import jrd.j;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ppd.n;
import ppd.u0;
import ppd.z;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/picker/date_picker/DatePickerBottomSheetController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/picker/date_picker/DatePickerBottomSheetContract$OutputData;", "Ldli/a;", "Ljrd/d;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DatePickerBottomSheetController extends ViewController<DatePickerBottomSheetContract$OutputData> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(DatePickerBottomSheetController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final c K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final PickerDelegate P;
    public final DoublePickerDelegate Q;
    public final LargeActionButtonDelegate R;
    public final Object S;

    public DatePickerBottomSheetController(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_bottom_sheet_list;
        this.M = s.t(this, f.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: jrd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DatePickerBottomSheetController f177998b;

            {
                this.f177998b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DatePickerBottomSheetController datePickerBottomSheetController = this.f177998b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DatePickerBottomSheetController.T;
                        qji.b bVarU2 = datePickerBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.picker.date_picker.di.DatePickerBottomSheetInjector");
                        u0 u0Var = (u0) bVarU2;
                        n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        c cVar = datePickerBottomSheetController.K;
                        cVar.getClass();
                        return new z(nVar, u0Var2, cVar);
                    case 1:
                        KProperty[] kPropertyArr2 = DatePickerBottomSheetController.T;
                        return (j) ((z) datePickerBottomSheetController.N.getValue()).f238584b.get();
                    default:
                        KProperty[] kPropertyArr3 = DatePickerBottomSheetController.T;
                        DatePickerBottomSheetController datePickerBottomSheetController2 = this.f177998b;
                        return dli.f.a(datePickerBottomSheetController2, datePickerBottomSheetController2.R2(), v.k(datePickerBottomSheetController2.P, datePickerBottomSheetController2.Q, datePickerBottomSheetController2.R), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: jrd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DatePickerBottomSheetController f177998b;

            {
                this.f177998b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DatePickerBottomSheetController datePickerBottomSheetController = this.f177998b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DatePickerBottomSheetController.T;
                        qji.b bVarU2 = datePickerBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.picker.date_picker.di.DatePickerBottomSheetInjector");
                        u0 u0Var = (u0) bVarU2;
                        n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        c cVar = datePickerBottomSheetController.K;
                        cVar.getClass();
                        return new z(nVar, u0Var2, cVar);
                    case 1:
                        KProperty[] kPropertyArr2 = DatePickerBottomSheetController.T;
                        return (j) ((z) datePickerBottomSheetController.N.getValue()).f238584b.get();
                    default:
                        KProperty[] kPropertyArr3 = DatePickerBottomSheetController.T;
                        DatePickerBottomSheetController datePickerBottomSheetController2 = this.f177998b;
                        return dli.f.a(datePickerBottomSheetController2, datePickerBottomSheetController2.R2(), v.k(datePickerBottomSheetController2.P, datePickerBottomSheetController2.Q, datePickerBottomSheetController2.R), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new PickerDelegate();
        this.Q = new DoublePickerDelegate();
        this.R = new LargeActionButtonDelegate();
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: jrd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DatePickerBottomSheetController f177998b;

            {
                this.f177998b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DatePickerBottomSheetController datePickerBottomSheetController = this.f177998b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DatePickerBottomSheetController.T;
                        qji.b bVarU2 = datePickerBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.picker.date_picker.di.DatePickerBottomSheetInjector");
                        u0 u0Var = (u0) bVarU2;
                        n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        c cVar = datePickerBottomSheetController.K;
                        cVar.getClass();
                        return new z(nVar, u0Var2, cVar);
                    case 1:
                        KProperty[] kPropertyArr2 = DatePickerBottomSheetController.T;
                        return (j) ((z) datePickerBottomSheetController.N.getValue()).f238584b.get();
                    default:
                        KProperty[] kPropertyArr3 = DatePickerBottomSheetController.T;
                        DatePickerBottomSheetController datePickerBottomSheetController2 = this.f177998b;
                        return dli.f.a(datePickerBottomSheetController2, datePickerBottomSheetController2.R2(), v.k(datePickerBottomSheetController2.P, datePickerBottomSheetController2.Q, datePickerBottomSheetController2.R), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jii.f) value).f174519b.setHeaderModel(new lw0.a(this.K.f177993a, null, null, null, false, 30));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52922c), null, new g(this, continuation, 0), 3);
        DoublePickerDelegate doublePickerDelegate = this.Q;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(doublePickerDelegate.f52193c), null, new g(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(doublePickerDelegate.d), null, new g(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.d.f121375b), null, new jrd.h(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
