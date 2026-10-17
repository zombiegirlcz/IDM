package com.revolut.feature.transport.impl.ui.transit_checkout.date_input;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transport.impl.R$layout;
import com.revolut.feature.transport.impl.ui.transit_checkout.date_input.DateInputScreen;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import h30.l;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l80.e;
import rwf.b;
import rwf.c;
import rwf.f;
import rwf.g;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/impl/ui/transit_checkout/date_input/DateInputScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrwf/f;", "Lcli/w;", "Lrwf/h;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DateInputScreen extends ViewController<f> implements w {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(DateInputScreen.class, "binding", "getBinding()Lcom/revolut/feature/transport/impl/databinding/ScreenDateInputBinding;", 0))};
    public final int K;
    public final Object L;
    public final h M;
    public final Object N;
    public final Object O;

    public DateInputScreen(DateInputScreenContract$InputData inputData, e dateProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.K = R$layout.screen_date_input;
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: rwf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DateInputScreen f257896b;

            {
                this.f257896b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DateInputScreen dateInputScreen = this.f257896b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DateInputScreen.P;
                        return n14.e.a(dateInputScreen, (g) dateInputScreen.O.getValue());
                    default:
                        KProperty[] kPropertyArr2 = DateInputScreen.P;
                        return (g) ((hvf.e) dateInputScreen.N.getValue()).d.get();
                }
            }
        });
        this.M = s.t(this, b.f);
        this.N = te0.w.y0(new rgf.b(this, inputData, 29));
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: rwf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DateInputScreen f257896b;

            {
                this.f257896b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DateInputScreen dateInputScreen = this.f257896b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DateInputScreen.P;
                        return n14.e.a(dateInputScreen, (g) dateInputScreen.O.getValue());
                    default:
                        KProperty[] kPropertyArr2 = DateInputScreen.P;
                        return (g) ((hvf.e) dateInputScreen.N.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        rwf.h uiState = (rwf.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        LocalDate localDate = uiState.f257901a;
        if (localDate != null && !localDate.equals(d3().f129789c.getDate())) {
            d3().f129789c.setDate(uiState.f257901a);
        }
        NavBarWithToolbar dateInputScreenNavBar = d3().d;
        Intrinsics.checkNotNullExpressionValue(dateInputScreenNavBar, "dateInputScreenNavBar");
        dateInputScreenNavBar.setTitle(uiState.f257902b, null);
        d3().f129788b.setEnabled(uiState.f257903c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (hvf.e) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().d.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        l.A(R.string.common_action_continue, null, null, 14, d3().f129788b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, rd0.e.b(d3().d.f59410q), null, new c(this, null, 0), 3);
        a.g2(this, rd0.e.b(d3().f129788b.o), null, new c(this, null, 1), 3);
        a.g2(this, rd0.e.b(d3().f129789c.k), null, new rt4.o(this, null, 8), 3);
    }

    public final evf.b d3() {
        ViewBinding value = this.M.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (evf.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.L.getValue();
    }
}
