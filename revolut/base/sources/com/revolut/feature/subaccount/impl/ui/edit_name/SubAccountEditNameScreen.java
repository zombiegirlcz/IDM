package com.revolut.feature.subaccount.impl.ui.edit_name;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subaccount.impl.R$string;
import com.revolut.feature.subaccount.impl.ui.edit_name.SubAccountEditNameContract$InputData;
import com.revolut.feature.subaccount.impl.ui.edit_name.SubAccountEditNameScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import i83.b;
import i8e.a;
import i8e.d;
import i8e.g;
import i8e.i;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import r6e.l;
import r6e.o;
import te0.w;
import vc.s;
import xki.e;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/edit_name/SubAccountEditNameScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Li8e/a;", "Ldli/a;", "Li8e/d;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubAccountEditNameScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(SubAccountEditNameScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final SubAccountEditNameContract$InputData K;
    public final h L;
    public final Lazy M;
    public final boolean N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public SubAccountEditNameScreen(SubAccountEditNameContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, g.f);
        this.M = j.b(new b(3));
        this.N = true;
        this.O = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: i8e.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubAccountEditNameScreen f159521b;

            {
                this.f159521b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SubAccountEditNameScreen subAccountEditNameScreen = this.f159521b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SubAccountEditNameScreen.S;
                        return (b) ((l) subAccountEditNameScreen.R.getValue()).f251764b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SubAccountEditNameScreen.S;
                        SubAccountEditNameScreen subAccountEditNameScreen2 = this.f159521b;
                        return dli.f.a(subAccountEditNameScreen2, (b) subAccountEditNameScreen2.P.getValue(), u.c((InputTextDelegate) subAccountEditNameScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SubAccountEditNameScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(subAccountEditNameScreen.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).K;
                        SubAccountEditNameContract$InputData subAccountEditNameContract$InputData = subAccountEditNameScreen.K;
                        subAccountEditNameContract$InputData.getClass();
                        return new l(oVar, subAccountEditNameContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: i8e.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubAccountEditNameScreen f159521b;

            {
                this.f159521b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SubAccountEditNameScreen subAccountEditNameScreen = this.f159521b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SubAccountEditNameScreen.S;
                        return (b) ((l) subAccountEditNameScreen.R.getValue()).f251764b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SubAccountEditNameScreen.S;
                        SubAccountEditNameScreen subAccountEditNameScreen2 = this.f159521b;
                        return dli.f.a(subAccountEditNameScreen2, (b) subAccountEditNameScreen2.P.getValue(), u.c((InputTextDelegate) subAccountEditNameScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SubAccountEditNameScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(subAccountEditNameScreen.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).K;
                        SubAccountEditNameContract$InputData subAccountEditNameContract$InputData = subAccountEditNameScreen.K;
                        subAccountEditNameContract$InputData.getClass();
                        return new l(oVar, subAccountEditNameContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: i8e.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubAccountEditNameScreen f159521b;

            {
                this.f159521b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SubAccountEditNameScreen subAccountEditNameScreen = this.f159521b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SubAccountEditNameScreen.S;
                        return (b) ((l) subAccountEditNameScreen.R.getValue()).f251764b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SubAccountEditNameScreen.S;
                        SubAccountEditNameScreen subAccountEditNameScreen2 = this.f159521b;
                        return dli.f.a(subAccountEditNameScreen2, (b) subAccountEditNameScreen2.P.getValue(), u.c((InputTextDelegate) subAccountEditNameScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SubAccountEditNameScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(subAccountEditNameScreen.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).K;
                        SubAccountEditNameContract$InputData subAccountEditNameContract$InputData = subAccountEditNameScreen.K;
                        subAccountEditNameContract$InputData.getClass();
                        return new l(oVar, subAccountEditNameContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f159519b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (i8e.b) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.bill_account_edit_name_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        d3().f174564b.setText(new TextLocalisedClause(R$string.bill_accounts_common_action_confirm, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.M.getValue()).e.f121375b), null, new i8e.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new i(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new i(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
