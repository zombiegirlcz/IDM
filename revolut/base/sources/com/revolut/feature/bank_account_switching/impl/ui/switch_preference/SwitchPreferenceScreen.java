package com.revolut.feature.bank_account_switching.impl.ui.switch_preference;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bq2.c;
import bq2.d;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.ui.switch_preference.SwitchPreferenceScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import tx0.j0;
import vc.s;
import vn2.c0;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_preference/SwitchPreferenceScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbq2/c;", "Ldli/a;", "Lbq2/d;", "<init>", "()V", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwitchPreferenceScreen extends ViewController<c> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(SwitchPreferenceScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object M;
    public final Object O;
    public final Object P;
    public final int K = R$layout.screen_recycler_navbar;
    public final RowDelegate L = new RowDelegate(null, null, 7);
    public final h N = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
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

    public SwitchPreferenceScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: bq2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwitchPreferenceScreen f17668b;

            {
                this.f17668b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SwitchPreferenceScreen switchPreferenceScreen = this.f17668b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SwitchPreferenceScreen.Q;
                        SwitchPreferenceScreen switchPreferenceScreen2 = this.f17668b;
                        return dli.f.a(switchPreferenceScreen2, (e) switchPreferenceScreen2.P.getValue(), u.c(switchPreferenceScreen2.L), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SwitchPreferenceScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(switchPreferenceScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        c0 c0Var = new c0();
                        c0Var.f290650a = e4m.b.b(new v4d.a(c0Var, 1, 22));
                        c0Var.f290651b = e4m.b.b(new v4d.a(c0Var, 0, 22));
                        return c0Var;
                    default:
                        KProperty[] kPropertyArr3 = SwitchPreferenceScreen.Q;
                        return (e) ((c0) switchPreferenceScreen.O.getValue()).f290651b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: bq2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwitchPreferenceScreen f17668b;

            {
                this.f17668b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SwitchPreferenceScreen switchPreferenceScreen = this.f17668b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SwitchPreferenceScreen.Q;
                        SwitchPreferenceScreen switchPreferenceScreen2 = this.f17668b;
                        return dli.f.a(switchPreferenceScreen2, (e) switchPreferenceScreen2.P.getValue(), u.c(switchPreferenceScreen2.L), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SwitchPreferenceScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(switchPreferenceScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        c0 c0Var = new c0();
                        c0Var.f290650a = e4m.b.b(new v4d.a(c0Var, 1, 22));
                        c0Var.f290651b = e4m.b.b(new v4d.a(c0Var, 0, 22));
                        return c0Var;
                    default:
                        KProperty[] kPropertyArr3 = SwitchPreferenceScreen.Q;
                        return (e) ((c0) switchPreferenceScreen.O.getValue()).f290651b.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: bq2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwitchPreferenceScreen f17668b;

            {
                this.f17668b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SwitchPreferenceScreen switchPreferenceScreen = this.f17668b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SwitchPreferenceScreen.Q;
                        SwitchPreferenceScreen switchPreferenceScreen2 = this.f17668b;
                        return dli.f.a(switchPreferenceScreen2, (e) switchPreferenceScreen2.P.getValue(), u.c(switchPreferenceScreen2.L), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SwitchPreferenceScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(switchPreferenceScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        c0 c0Var = new c0();
                        c0Var.f290650a = e4m.b.b(new v4d.a(c0Var, 1, 22));
                        c0Var.f290651b = e4m.b.b(new v4d.a(c0Var, 0, 22));
                        return c0Var;
                    default:
                        KProperty[] kPropertyArr3 = SwitchPreferenceScreen.Q;
                        return (e) ((c0) switchPreferenceScreen.O.getValue()).f290651b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (bq2.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.account_switch_switch_preference_elcimai_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.account_switch_switch_preference_elcimai_title, null, null, 14), null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new bf5.a(this, null, 26), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f53218h), null, new bq2.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
