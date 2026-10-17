package com.revolut.feature.recurring_buys.schedule.impl.ui;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.recurring_buys.schedule.api.R$string;
import com.revolut.feature.recurring_buys.schedule.impl.ui.RecurringSettingsController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import iua.b;
import jii.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lkf.f0;
import lua.c;
import lua.e;
import lua.f;
import lua.g;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/recurring_buys/schedule/impl/ui/RecurringSettingsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Liua/b;", "Ldli/a;", "Llua/c;", "feature_recurring_buys_schedule_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecurringSettingsController extends ViewController<b> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(RecurringSettingsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final iua.a K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;
    public final Object P;
    public final h Q;

    public RecurringSettingsController(iua.a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: lua.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecurringSettingsController f200207b;

            {
                this.f200207b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RecurringSettingsController recurringSettingsController = this.f200207b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RecurringSettingsController.R;
                        return (b) ((kua.c) recurringSettingsController.M.getValue()).f189765b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RecurringSettingsController.R;
                        phm.a aVar = (phm.a) ue0.e.j(recurringSettingsController.m2()).a().get(kua.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", kua.b.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.recurring_buys.schedule.impl.ui.di.RecurringSettingsControllerInjector");
                        kua.b bVar = ((kua.b) objB).f189763a;
                        iua.a aVar3 = recurringSettingsController.K;
                        aVar3.getClass();
                        return new kua.c(bVar, aVar3);
                    default:
                        KProperty[] kPropertyArr3 = RecurringSettingsController.R;
                        RecurringSettingsController recurringSettingsController2 = this.f200207b;
                        return dli.f.a(recurringSettingsController2, (b) recurringSettingsController2.L.getValue(), v.k(new PlainTextDelegate(), (InputTextDelegate) recurringSettingsController2.O.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: lua.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecurringSettingsController f200207b;

            {
                this.f200207b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RecurringSettingsController recurringSettingsController = this.f200207b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RecurringSettingsController.R;
                        return (b) ((kua.c) recurringSettingsController.M.getValue()).f189765b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RecurringSettingsController.R;
                        phm.a aVar = (phm.a) ue0.e.j(recurringSettingsController.m2()).a().get(kua.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", kua.b.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.recurring_buys.schedule.impl.ui.di.RecurringSettingsControllerInjector");
                        kua.b bVar = ((kua.b) objB).f189763a;
                        iua.a aVar3 = recurringSettingsController.K;
                        aVar3.getClass();
                        return new kua.c(bVar, aVar3);
                    default:
                        KProperty[] kPropertyArr3 = RecurringSettingsController.R;
                        RecurringSettingsController recurringSettingsController2 = this.f200207b;
                        return dli.f.a(recurringSettingsController2, (b) recurringSettingsController2.L.getValue(), v.k(new PlainTextDelegate(), (InputTextDelegate) recurringSettingsController2.O.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar_action_footer;
        this.O = w.y0(new f0(25));
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: lua.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecurringSettingsController f200207b;

            {
                this.f200207b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RecurringSettingsController recurringSettingsController = this.f200207b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RecurringSettingsController.R;
                        return (b) ((kua.c) recurringSettingsController.M.getValue()).f189765b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RecurringSettingsController.R;
                        phm.a aVar = (phm.a) ue0.e.j(recurringSettingsController.m2()).a().get(kua.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", kua.b.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.recurring_buys.schedule.impl.ui.di.RecurringSettingsControllerInjector");
                        kua.b bVar = ((kua.b) objB).f189763a;
                        iua.a aVar3 = recurringSettingsController.K;
                        aVar3.getClass();
                        return new kua.c(bVar, aVar3);
                    default:
                        KProperty[] kPropertyArr3 = RecurringSettingsController.R;
                        RecurringSettingsController recurringSettingsController2 = this.f200207b;
                        return dli.f.a(recurringSettingsController2, (b) recurringSettingsController2.L.getValue(), v.k(new PlainTextDelegate(), (InputTextDelegate) recurringSettingsController2.O.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = s.t(this, e.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174533b.setModel(uiState.f200205b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (kua.c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (lua.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wealthcore_recurringbuys_order_period_set_schedule_header_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new f(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new f(this, null, 1), 3);
        ?? r72 = this.O;
        ViewController.P2(this, vkm.q.J(rd0.e.b(((InputTextDelegate) r72.getValue()).i.f121375b), rd0.e.b(((InputTextDelegate) r72.getValue()).f52575g.f121375b)), new g(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.Q.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
