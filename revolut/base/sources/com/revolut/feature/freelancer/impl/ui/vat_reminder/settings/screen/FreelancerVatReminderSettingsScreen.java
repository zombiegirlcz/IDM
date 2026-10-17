package com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.FreelancerVatReminderSettingsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import g57.b;
import g57.c;
import g57.d;
import g57.k;
import g57.l;
import g57.m;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/vat_reminder/settings/screen/FreelancerVatReminderSettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg57/k;", "Ldli/a;", "Lg57/o;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerVatReminderSettingsScreen extends ViewController<k> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(FreelancerVatReminderSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_nextbutton;
    public final h L = s.t(this, a.f);
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final PlainTextDelegate N = new PlainTextDelegate();
    public final RowDelegate O = new RowDelegate(null, null, 7);
    public final Object P;
    public final Object Q;
    public final Object R;

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

    public FreelancerVatReminderSettingsScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: g57.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerVatReminderSettingsScreen f140667b;

            {
                this.f140667b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerVatReminderSettingsScreen freelancerVatReminderSettingsScreen = this.f140667b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerVatReminderSettingsScreen.S;
                        qji.b bVarU2 = freelancerVatReminderSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.di.FreelancerVatReminderSettingsScreenInjector");
                        bt6.g gVar = (bt6.g) bVarU2;
                        return new bt6.h(gVar.f18345a, gVar.f18346b);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerVatReminderSettingsScreen.S;
                        return (l) ((bt6.h) freelancerVatReminderSettingsScreen.P.getValue()).f18350b.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerVatReminderSettingsScreen.S;
                        FreelancerVatReminderSettingsScreen freelancerVatReminderSettingsScreen2 = this.f140667b;
                        return dli.f.a(freelancerVatReminderSettingsScreen2, freelancerVatReminderSettingsScreen2.d(), v.k(freelancerVatReminderSettingsScreen2.M, freelancerVatReminderSettingsScreen2.N, freelancerVatReminderSettingsScreen2.O, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: g57.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerVatReminderSettingsScreen f140667b;

            {
                this.f140667b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerVatReminderSettingsScreen freelancerVatReminderSettingsScreen = this.f140667b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerVatReminderSettingsScreen.S;
                        qji.b bVarU2 = freelancerVatReminderSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.di.FreelancerVatReminderSettingsScreenInjector");
                        bt6.g gVar = (bt6.g) bVarU2;
                        return new bt6.h(gVar.f18345a, gVar.f18346b);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerVatReminderSettingsScreen.S;
                        return (l) ((bt6.h) freelancerVatReminderSettingsScreen.P.getValue()).f18350b.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerVatReminderSettingsScreen.S;
                        FreelancerVatReminderSettingsScreen freelancerVatReminderSettingsScreen2 = this.f140667b;
                        return dli.f.a(freelancerVatReminderSettingsScreen2, freelancerVatReminderSettingsScreen2.d(), v.k(freelancerVatReminderSettingsScreen2.M, freelancerVatReminderSettingsScreen2.N, freelancerVatReminderSettingsScreen2.O, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: g57.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerVatReminderSettingsScreen f140667b;

            {
                this.f140667b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerVatReminderSettingsScreen freelancerVatReminderSettingsScreen = this.f140667b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerVatReminderSettingsScreen.S;
                        qji.b bVarU2 = freelancerVatReminderSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.di.FreelancerVatReminderSettingsScreenInjector");
                        bt6.g gVar = (bt6.g) bVarU2;
                        return new bt6.h(gVar.f18345a, gVar.f18346b);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerVatReminderSettingsScreen.S;
                        return (l) ((bt6.h) freelancerVatReminderSettingsScreen.P.getValue()).f18350b.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerVatReminderSettingsScreen.S;
                        FreelancerVatReminderSettingsScreen freelancerVatReminderSettingsScreen2 = this.f140667b;
                        return dli.f.a(freelancerVatReminderSettingsScreen2, freelancerVatReminderSettingsScreen2.d(), v.k(freelancerVatReminderSettingsScreen2.M, freelancerVatReminderSettingsScreen2.N, freelancerVatReminderSettingsScreen2.O, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g57.o uiState = (g57.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f140680a.f140679a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        LargeActionButton largeActionButton = d3().f174564b;
        m mVar = uiState.f140682c;
        largeActionButton.setText(mVar.f140677a);
        largeActionButton.setEnabled(mVar.f140678b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (bt6.h) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setLoadingButtonTag("BUTTON_TAG_UPDATE");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new b(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new b(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.d.f121375b), new g06.k(this, continuation, 15), 3);
        RowDelegate rowDelegate = this.O;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53225r), new g57.e(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
