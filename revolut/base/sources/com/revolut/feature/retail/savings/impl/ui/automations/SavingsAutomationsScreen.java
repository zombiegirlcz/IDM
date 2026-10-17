package com.revolut.feature.retail.savings.impl.ui.automations;

import aii.q;
import anb.n;
import anb.o;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.savings.impl.ui.automations.SavingsAutomationsScreen;
import com.revolut.feature.retail.savings.impl.ui.automations.SavingsAutomationsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nn7.d;
import nob.c;
import nob.i;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/ui/automations/SavingsAutomationsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lnob/h;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SavingsAutomationsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(SavingsAutomationsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final SavingsAutomationsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final FullScreenStateDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public SavingsAutomationsScreen(SavingsAutomationsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = s.t(this, c.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = new FullScreenStateDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: nob.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsAutomationsScreen f217962b;

            {
                this.f217962b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SavingsAutomationsScreen savingsAutomationsScreen = this.f217962b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsAutomationsScreen.S;
                        SavingsAutomationsScreen savingsAutomationsScreen2 = this.f217962b;
                        return dli.f.a(savingsAutomationsScreen2, (i) savingsAutomationsScreen2.R.getValue(), v.k(savingsAutomationsScreen2.O, savingsAutomationsScreen2.N, new CellDetailsLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsAutomationsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(savingsAutomationsScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        SavingsAutomationsScreenContract$InputData savingsAutomationsScreenContract$InputData = savingsAutomationsScreen.K;
                        savingsAutomationsScreenContract$InputData.getClass();
                        return new o(nVar, savingsAutomationsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SavingsAutomationsScreen.S;
                        return (i) ((o) savingsAutomationsScreen.Q.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: nob.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsAutomationsScreen f217962b;

            {
                this.f217962b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SavingsAutomationsScreen savingsAutomationsScreen = this.f217962b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsAutomationsScreen.S;
                        SavingsAutomationsScreen savingsAutomationsScreen2 = this.f217962b;
                        return dli.f.a(savingsAutomationsScreen2, (i) savingsAutomationsScreen2.R.getValue(), v.k(savingsAutomationsScreen2.O, savingsAutomationsScreen2.N, new CellDetailsLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsAutomationsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(savingsAutomationsScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        SavingsAutomationsScreenContract$InputData savingsAutomationsScreenContract$InputData = savingsAutomationsScreen.K;
                        savingsAutomationsScreenContract$InputData.getClass();
                        return new o(nVar, savingsAutomationsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SavingsAutomationsScreen.S;
                        return (i) ((o) savingsAutomationsScreen.Q.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: nob.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsAutomationsScreen f217962b;

            {
                this.f217962b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SavingsAutomationsScreen savingsAutomationsScreen = this.f217962b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsAutomationsScreen.S;
                        SavingsAutomationsScreen savingsAutomationsScreen2 = this.f217962b;
                        return dli.f.a(savingsAutomationsScreen2, (i) savingsAutomationsScreen2.R.getValue(), v.k(savingsAutomationsScreen2.O, savingsAutomationsScreen2.N, new CellDetailsLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsAutomationsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(savingsAutomationsScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        SavingsAutomationsScreenContract$InputData savingsAutomationsScreenContract$InputData = savingsAutomationsScreen.K;
                        savingsAutomationsScreenContract$InputData.getClass();
                        return new o(nVar, savingsAutomationsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SavingsAutomationsScreen.S;
                        return (i) ((o) savingsAutomationsScreen.Q.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        nob.h uiState = (nob.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jii.n) value).f174542b.setHeaderModel(uiState.f217967a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (i) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new njj.n(rd0.e.b(this.N.f53218h), 8), new d(this, null, 6), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new nob.e(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
