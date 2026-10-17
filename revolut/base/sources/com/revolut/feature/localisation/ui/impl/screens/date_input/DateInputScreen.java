package com.revolut.feature.localisation.ui.impl.screens.date_input;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.localisation.ui.api.navigation.DateInputInputData;
import com.revolut.feature.localisation.ui.impl.R$layout;
import com.revolut.feature.localisation.ui.impl.screens.date_input.DateInputScreen;
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
import o39.d;
import s39.b;
import s39.c;
import s39.e;
import s39.f;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/localisation/ui/impl/screens/date_input/DateInputScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lo39/d;", "Lcli/w;", "Ls39/e;", "feature_localisation_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DateInputScreen extends ViewController<d> implements w {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(DateInputScreen.class, "binding", "getBinding()Lcom/revolut/feature/localisation/ui/impl/databinding/ScreenDateInputBinding;", 0))};
    public final int K;
    public final Object L;
    public final h M;
    public final Object N;
    public final Object O;

    public DateInputScreen(DateInputInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_date_input;
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: s39.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DateInputScreen f259476b;

            {
                this.f259476b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DateInputScreen dateInputScreen = this.f259476b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DateInputScreen.P;
                        return n14.e.a(dateInputScreen, (f) dateInputScreen.O.getValue());
                    default:
                        KProperty[] kPropertyArr2 = DateInputScreen.P;
                        return (f) ((r39.b) dateInputScreen.N.getValue()).f251227c.get();
                }
            }
        });
        this.M = s.t(this, b.f);
        this.N = te0.w.y0(new rxe.b(this, inputData, 17));
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: s39.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DateInputScreen f259476b;

            {
                this.f259476b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DateInputScreen dateInputScreen = this.f259476b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DateInputScreen.P;
                        return n14.e.a(dateInputScreen, (f) dateInputScreen.O.getValue());
                    default:
                        KProperty[] kPropertyArr2 = DateInputScreen.P;
                        return (f) ((r39.b) dateInputScreen.N.getValue()).f251227c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        LocalDate localDate = uiState.f259479a;
        if (localDate != null && !localDate.equals(d3().f232702c.getDate())) {
            d3().f232702c.setDate(localDate);
        }
        NavBarWithToolbar dateInputScreenNavBar = d3().d;
        Intrinsics.checkNotNullExpressionValue(dateInputScreenNavBar, "dateInputScreenNavBar");
        dateInputScreenNavBar.setTitle(uiState.f259480b, null);
        d3().f232701b.setEnabled(uiState.f259481c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r39.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((r39.b) this.N.getValue()).getClass();
        d3().d.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        l.A(R.string.common_action_continue, null, null, 14, d3().f232701b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, rd0.e.b(d3().d.f59410q), null, new c(this, null, 0), 3);
        a.g2(this, rd0.e.b(d3().f232701b.o), null, new c(this, null, 1), 3);
        a.g2(this, rd0.e.b(d3().f232702c.k), null, new rt4.o(this, null, 23), 3);
    }

    public final p39.a d3() {
        ViewBinding value = this.M.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (p39.a) value;
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
