package com.revolut.feature.retail.global_accounts.impl.registered_identities;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.global_accounts.impl.R$string;
import com.revolut.feature.retail.global_accounts.impl.registered_identities.RegisteredIdentitiesBottomSheetScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lw0.k;
import n9b.d;
import pki.b;
import te0.w;
import vc.s;
import x9b.e;
import x9b.g;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/global_accounts/impl/registered_identities/RegisteredIdentitiesBottomSheetScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lx9b/e;", "<init>", "()V", "feature_retail_global_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RegisteredIdentitiesBottomSheetScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(RegisteredIdentitiesBottomSheetScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_bottomsheet;
    public final h L = s.t(this, a.f);
    public final RowLoadingDelegate M = new RowLoadingDelegate();
    public final RowDelegate N = new RowDelegate(null, null, 7);
    public final AccountCellItemDelegate O = new AccountCellItemDelegate();
    public final Object P;
    public final Object Q;
    public final Object R;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, n.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return n.a(p0);
        }
    }

    public RegisteredIdentitiesBottomSheetScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: x9b.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisteredIdentitiesBottomSheetScreen f303655b;

            {
                this.f303655b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RegisteredIdentitiesBottomSheetScreen registeredIdentitiesBottomSheetScreen = this.f303655b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RegisteredIdentitiesBottomSheetScreen.S;
                        RegisteredIdentitiesBottomSheetScreen registeredIdentitiesBottomSheetScreen2 = this.f303655b;
                        return dli.f.a(registeredIdentitiesBottomSheetScreen2, (d) registeredIdentitiesBottomSheetScreen2.R.getValue(), v.k(registeredIdentitiesBottomSheetScreen2.M, registeredIdentitiesBottomSheetScreen2.N, registeredIdentitiesBottomSheetScreen2.O), registeredIdentitiesBottomSheetScreen2.d3().f174543c.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RegisteredIdentitiesBottomSheetScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(registeredIdentitiesBottomSheetScreen.m2()).a().get(n9b.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n9b.e.class, " is not found"));
                        }
                        n9b.c cVar = ((n9b.c) ((n9b.e) aVar2.b())).i;
                        n9b.d dVar = new n9b.d();
                        dVar.f213628a = e4m.b.b(new n51.b(cVar, 3));
                        return dVar;
                    default:
                        KProperty[] kPropertyArr3 = RegisteredIdentitiesBottomSheetScreen.S;
                        return (d) ((n9b.d) registeredIdentitiesBottomSheetScreen.Q.getValue()).f213628a.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: x9b.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisteredIdentitiesBottomSheetScreen f303655b;

            {
                this.f303655b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RegisteredIdentitiesBottomSheetScreen registeredIdentitiesBottomSheetScreen = this.f303655b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RegisteredIdentitiesBottomSheetScreen.S;
                        RegisteredIdentitiesBottomSheetScreen registeredIdentitiesBottomSheetScreen2 = this.f303655b;
                        return dli.f.a(registeredIdentitiesBottomSheetScreen2, (d) registeredIdentitiesBottomSheetScreen2.R.getValue(), v.k(registeredIdentitiesBottomSheetScreen2.M, registeredIdentitiesBottomSheetScreen2.N, registeredIdentitiesBottomSheetScreen2.O), registeredIdentitiesBottomSheetScreen2.d3().f174543c.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RegisteredIdentitiesBottomSheetScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(registeredIdentitiesBottomSheetScreen.m2()).a().get(n9b.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n9b.e.class, " is not found"));
                        }
                        n9b.c cVar = ((n9b.c) ((n9b.e) aVar2.b())).i;
                        n9b.d dVar = new n9b.d();
                        dVar.f213628a = e4m.b.b(new n51.b(cVar, 3));
                        return dVar;
                    default:
                        KProperty[] kPropertyArr3 = RegisteredIdentitiesBottomSheetScreen.S;
                        return (d) ((n9b.d) registeredIdentitiesBottomSheetScreen.Q.getValue()).f213628a.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: x9b.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisteredIdentitiesBottomSheetScreen f303655b;

            {
                this.f303655b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RegisteredIdentitiesBottomSheetScreen registeredIdentitiesBottomSheetScreen = this.f303655b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RegisteredIdentitiesBottomSheetScreen.S;
                        RegisteredIdentitiesBottomSheetScreen registeredIdentitiesBottomSheetScreen2 = this.f303655b;
                        return dli.f.a(registeredIdentitiesBottomSheetScreen2, (d) registeredIdentitiesBottomSheetScreen2.R.getValue(), v.k(registeredIdentitiesBottomSheetScreen2.M, registeredIdentitiesBottomSheetScreen2.N, registeredIdentitiesBottomSheetScreen2.O), registeredIdentitiesBottomSheetScreen2.d3().f174543c.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RegisteredIdentitiesBottomSheetScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(registeredIdentitiesBottomSheetScreen.m2()).a().get(n9b.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n9b.e.class, " is not found"));
                        }
                        n9b.c cVar = ((n9b.c) ((n9b.e) aVar2.b())).i;
                        n9b.d dVar = new n9b.d();
                        dVar.f213628a = e4m.b.b(new n51.b(cVar, 3));
                        return dVar;
                    default:
                        KProperty[] kPropertyArr3 = RegisteredIdentitiesBottomSheetScreen.S;
                        return (d) ((n9b.d) registeredIdentitiesBottomSheetScreen.Q.getValue()).f213628a.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (x9b.d) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174542b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.user_country_profiles_country_profiles_manage_screen_title, null, null, 14), null, null, new k(new TextLocalisedClause(R$string.user_country_profiles_country_profiles_sheet_bar_manage, null, null, 14), "ID_MENU_ITEM_MANAGE"), false, 22));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.O.f51551c.f53218h), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174542b.E), new x64.b(this, null, 7), 3);
    }

    public final n d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (n) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
