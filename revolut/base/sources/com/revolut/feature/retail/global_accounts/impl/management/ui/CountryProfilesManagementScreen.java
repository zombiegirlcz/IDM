package com.revolut.feature.retail.global_accounts.impl.management.ui;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.global_accounts.impl.R$string;
import com.revolut.feature.retail.global_accounts.impl.management.ui.CountryProfilesManagementScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import n9b.b;
import s9b.c;
import s9b.i;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/global_accounts/impl/management/ui/CountryProfilesManagementScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ls9b/i;", "<init>", "()V", "feature_retail_global_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CountryProfilesManagementScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CountryProfilesManagementScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final RowDelegate N = new RowDelegate(null, null, 7);
    public final Object O;
    public final Object P;
    public final Object Q;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public CountryProfilesManagementScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: s9b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CountryProfilesManagementScreen f261150b;

            {
                this.f261150b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CountryProfilesManagementScreen countryProfilesManagementScreen = this.f261150b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CountryProfilesManagementScreen.R;
                        CountryProfilesManagementScreen countryProfilesManagementScreen2 = this.f261150b;
                        return dli.f.a(countryProfilesManagementScreen2, (h) countryProfilesManagementScreen2.Q.getValue(), v.k(countryProfilesManagementScreen2.M, new RowLoadingDelegate(), new ListSubheaderDelegate(), countryProfilesManagementScreen2.N), countryProfilesManagementScreen2.d3().f174540c.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CountryProfilesManagementScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(countryProfilesManagementScreen.m2()).a().get(n9b.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new n9b.b(((n9b.c) ((n9b.e) aVar2.b())).i, countryProfilesManagementScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", n9b.e.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = CountryProfilesManagementScreen.R;
                        return (h) ((n9b.b) countryProfilesManagementScreen.P.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: s9b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CountryProfilesManagementScreen f261150b;

            {
                this.f261150b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CountryProfilesManagementScreen countryProfilesManagementScreen = this.f261150b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CountryProfilesManagementScreen.R;
                        CountryProfilesManagementScreen countryProfilesManagementScreen2 = this.f261150b;
                        return dli.f.a(countryProfilesManagementScreen2, (h) countryProfilesManagementScreen2.Q.getValue(), v.k(countryProfilesManagementScreen2.M, new RowLoadingDelegate(), new ListSubheaderDelegate(), countryProfilesManagementScreen2.N), countryProfilesManagementScreen2.d3().f174540c.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CountryProfilesManagementScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(countryProfilesManagementScreen.m2()).a().get(n9b.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new n9b.b(((n9b.c) ((n9b.e) aVar2.b())).i, countryProfilesManagementScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", n9b.e.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = CountryProfilesManagementScreen.R;
                        return (h) ((n9b.b) countryProfilesManagementScreen.P.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: s9b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CountryProfilesManagementScreen f261150b;

            {
                this.f261150b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CountryProfilesManagementScreen countryProfilesManagementScreen = this.f261150b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CountryProfilesManagementScreen.R;
                        CountryProfilesManagementScreen countryProfilesManagementScreen2 = this.f261150b;
                        return dli.f.a(countryProfilesManagementScreen2, (h) countryProfilesManagementScreen2.Q.getValue(), v.k(countryProfilesManagementScreen2.M, new RowLoadingDelegate(), new ListSubheaderDelegate(), countryProfilesManagementScreen2.N), countryProfilesManagementScreen2.d3().f174540c.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CountryProfilesManagementScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(countryProfilesManagementScreen.m2()).a().get(n9b.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new n9b.b(((n9b.c) ((n9b.e) aVar2.b())).i, countryProfilesManagementScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", n9b.e.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = CountryProfilesManagementScreen.R;
                        return (h) ((n9b.b) countryProfilesManagementScreen.P.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (s9b.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.user_country_profiles_country_profiles_manage_screen_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.user_country_profiles_country_profiles_manage_screen_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new s1k.b(this, null, 18), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f53218h), null, new s9b.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52371h.f121375b), null, new c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
