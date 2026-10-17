package com.revolut.feature.bank_account_switching.impl.ui.link_list;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.bank_account_switching.impl.ui.link_list.BankAccountSwitchingLinkListScreen;
import com.revolut.feature.bank_account_switching.impl.ui.link_list.BankAccountSwitchingLinkListScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mo2.b;
import mo2.c;
import mo2.e;
import mo2.f;
import te0.w;
import vc.s;
import vn2.j;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/link_list/BankAccountSwitchingLinkListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lmo2/e;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankAccountSwitchingLinkListScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(BankAccountSwitchingLinkListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final BankAccountSwitchingLinkListScreenContract$InputData K;
    public final int L;
    public final RowDelegate M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public BankAccountSwitchingLinkListScreen(BankAccountSwitchingLinkListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = new RowDelegate(null, null, 7);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: mo2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingLinkListScreen f207537b;

            {
                this.f207537b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BankAccountSwitchingLinkListScreen bankAccountSwitchingLinkListScreen = this.f207537b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingLinkListScreen.R;
                        BankAccountSwitchingLinkListScreen bankAccountSwitchingLinkListScreen2 = this.f207537b;
                        return dli.f.a(bankAccountSwitchingLinkListScreen2, (f) bankAccountSwitchingLinkListScreen2.Q.getValue(), u.c(bankAccountSwitchingLinkListScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingLinkListScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingLinkListScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingLinkListScreenContract$InputData bankAccountSwitchingLinkListScreenContract$InputData = bankAccountSwitchingLinkListScreen.K;
                        bankAccountSwitchingLinkListScreenContract$InputData.getClass();
                        return new j(hVar, bankAccountSwitchingLinkListScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingLinkListScreen.R;
                        return (f) ((j) bankAccountSwitchingLinkListScreen.P.getValue()).f290690c.get();
                }
            }
        });
        this.O = s.t(this, b.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: mo2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingLinkListScreen f207537b;

            {
                this.f207537b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BankAccountSwitchingLinkListScreen bankAccountSwitchingLinkListScreen = this.f207537b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingLinkListScreen.R;
                        BankAccountSwitchingLinkListScreen bankAccountSwitchingLinkListScreen2 = this.f207537b;
                        return dli.f.a(bankAccountSwitchingLinkListScreen2, (f) bankAccountSwitchingLinkListScreen2.Q.getValue(), u.c(bankAccountSwitchingLinkListScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingLinkListScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingLinkListScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingLinkListScreenContract$InputData bankAccountSwitchingLinkListScreenContract$InputData = bankAccountSwitchingLinkListScreen.K;
                        bankAccountSwitchingLinkListScreenContract$InputData.getClass();
                        return new j(hVar, bankAccountSwitchingLinkListScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingLinkListScreen.R;
                        return (f) ((j) bankAccountSwitchingLinkListScreen.P.getValue()).f290690c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: mo2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingLinkListScreen f207537b;

            {
                this.f207537b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BankAccountSwitchingLinkListScreen bankAccountSwitchingLinkListScreen = this.f207537b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingLinkListScreen.R;
                        BankAccountSwitchingLinkListScreen bankAccountSwitchingLinkListScreen2 = this.f207537b;
                        return dli.f.a(bankAccountSwitchingLinkListScreen2, (f) bankAccountSwitchingLinkListScreen2.Q.getValue(), u.c(bankAccountSwitchingLinkListScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingLinkListScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingLinkListScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingLinkListScreenContract$InputData bankAccountSwitchingLinkListScreenContract$InputData = bankAccountSwitchingLinkListScreen.K;
                        bankAccountSwitchingLinkListScreenContract$InputData.getClass();
                        return new j(hVar, bankAccountSwitchingLinkListScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingLinkListScreen.R;
                        return (f) ((j) bankAccountSwitchingLinkListScreen.P.getValue()).f290690c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        BankAccountSwitchingLinkListScreenContract$InputData bankAccountSwitchingLinkListScreenContract$InputData = this.K;
        navBarWithToolbar.setToolbarTitle(bankAccountSwitchingLinkListScreenContract$InputData.f63949a);
        navBarWithToolbar.setTitle(bankAccountSwitchingLinkListScreenContract$InputData.f63949a, null);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53218h), null, new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
