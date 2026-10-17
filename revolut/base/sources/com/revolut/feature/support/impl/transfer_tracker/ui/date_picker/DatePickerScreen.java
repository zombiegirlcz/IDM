package com.revolut.feature.support.impl.transfer_tracker.ui.date_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.support.impl.transfer_tracker.ui.date_picker.DatePickerScreen;
import com.revolut.feature.support.impl.transfer_tracker.ui.date_picker.DatePickerScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import uce.b;
import vc.s;
import y83.d;
import yde.c;
import yde.e;
import yde.f;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/ui/date_picker/DatePickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Luce/b;", "Ldli/a;", "Lyde/e;", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DatePickerScreen extends ViewController<b> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(DatePickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final DatePickerScreenContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final DatePickerDelegate Q;
    public final Object R;

    public DatePickerScreen(DatePickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = true;
        this.N = s.t(this, yde.b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: yde.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DatePickerScreen f312680b;

            {
                this.f312680b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DatePickerScreen datePickerScreen = this.f312680b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DatePickerScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(datePickerScreen.m2()).a().get(tce.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tce.a.class, " is not found"));
                        }
                        rde.h hVar = ((rde.h) aVar2.b()).k;
                        DatePickerScreenContract$InputData datePickerScreenContract$InputData = datePickerScreen.K;
                        datePickerScreenContract$InputData.getClass();
                        return new rde.b(hVar, datePickerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DatePickerScreen.S;
                        return (f) ((rde.b) datePickerScreen.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = DatePickerScreen.S;
                        DatePickerScreen datePickerScreen2 = this.f312680b;
                        return dli.f.a(datePickerScreen2, (f) datePickerScreen2.P.getValue(), u.c(datePickerScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: yde.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DatePickerScreen f312680b;

            {
                this.f312680b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DatePickerScreen datePickerScreen = this.f312680b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DatePickerScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(datePickerScreen.m2()).a().get(tce.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tce.a.class, " is not found"));
                        }
                        rde.h hVar = ((rde.h) aVar2.b()).k;
                        DatePickerScreenContract$InputData datePickerScreenContract$InputData = datePickerScreen.K;
                        datePickerScreenContract$InputData.getClass();
                        return new rde.b(hVar, datePickerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DatePickerScreen.S;
                        return (f) ((rde.b) datePickerScreen.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = DatePickerScreen.S;
                        DatePickerScreen datePickerScreen2 = this.f312680b;
                        return dli.f.a(datePickerScreen2, (f) datePickerScreen2.P.getValue(), u.c(datePickerScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        this.Q = new DatePickerDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: yde.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DatePickerScreen f312680b;

            {
                this.f312680b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DatePickerScreen datePickerScreen = this.f312680b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DatePickerScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(datePickerScreen.m2()).a().get(tce.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tce.a.class, " is not found"));
                        }
                        rde.h hVar = ((rde.h) aVar2.b()).k;
                        DatePickerScreenContract$InputData datePickerScreenContract$InputData = datePickerScreen.K;
                        datePickerScreenContract$InputData.getClass();
                        return new rde.b(hVar, datePickerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DatePickerScreen.S;
                        return (f) ((rde.b) datePickerScreen.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = DatePickerScreen.S;
                        DatePickerScreen datePickerScreen2 = this.f312680b;
                        return dli.f.a(datePickerScreen2, (f) datePickerScreen2.P.getValue(), u.c(datePickerScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (rde.b) this.O.getValue();
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
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        DatePickerScreenContract$InputData datePickerScreenContract$InputData = this.K;
        navBarWithToolbar.setTitle(datePickerScreenContract$InputData.f89402b, null);
        d3().f174565c.setToolbarTitle(datePickerScreenContract$InputData.f89402b);
        d3().f174564b.setText(datePickerScreenContract$InputData.f89403c);
        d3().f174564b.setTag("DATE_PICKER_ACTION_BUTTON");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f52176c.f121375b), null, new d(this, (Continuation) null, 14), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
