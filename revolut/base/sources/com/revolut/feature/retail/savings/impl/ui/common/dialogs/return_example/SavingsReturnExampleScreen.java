package com.revolut.feature.retail.savings.impl.ui.common.dialogs.return_example;

import aii.q;
import anb.n;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.return_example.SavingsReturnExampleScreen;
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
import te0.w;
import vc.s;
import vob.b;
import vob.c;
import vob.g;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/ui/common/dialogs/return_example/SavingsReturnExampleScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lvob/h;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SavingsReturnExampleScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(SavingsReturnExampleScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final SavingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData K;
    public final int L;
    public final h M;
    public final boolean N;
    public final LargeActionButtonDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public SavingsReturnExampleScreen(SavingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = s.t(this, b.f);
        this.N = true;
        this.O = new LargeActionButtonDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: vob.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsReturnExampleScreen f290930b;

            {
                this.f290930b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SavingsReturnExampleScreen savingsReturnExampleScreen = this.f290930b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsReturnExampleScreen.S;
                        SavingsReturnExampleScreen savingsReturnExampleScreen2 = this.f290930b;
                        return dli.f.a(savingsReturnExampleScreen2, (g) savingsReturnExampleScreen2.R.getValue(), v.k(new FullScreenStateDelegate(), savingsReturnExampleScreen2.O, new LargeActionButtonLoadingDelegate(), new CellDetailsDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsReturnExampleScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(savingsReturnExampleScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.ui.common.dialogs.return_example.di.SavingsReturnExampleScreenInjector");
                        n nVar = ((n) objB).F;
                        SavingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData savingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData = savingsReturnExampleScreen.K;
                        savingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData.getClass();
                        return new anb.q(nVar, savingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SavingsReturnExampleScreen.S;
                        return (g) ((anb.q) savingsReturnExampleScreen.Q.getValue()).f6690c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: vob.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsReturnExampleScreen f290930b;

            {
                this.f290930b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SavingsReturnExampleScreen savingsReturnExampleScreen = this.f290930b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsReturnExampleScreen.S;
                        SavingsReturnExampleScreen savingsReturnExampleScreen2 = this.f290930b;
                        return dli.f.a(savingsReturnExampleScreen2, (g) savingsReturnExampleScreen2.R.getValue(), v.k(new FullScreenStateDelegate(), savingsReturnExampleScreen2.O, new LargeActionButtonLoadingDelegate(), new CellDetailsDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsReturnExampleScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(savingsReturnExampleScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.ui.common.dialogs.return_example.di.SavingsReturnExampleScreenInjector");
                        n nVar = ((n) objB).F;
                        SavingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData savingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData = savingsReturnExampleScreen.K;
                        savingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData.getClass();
                        return new anb.q(nVar, savingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SavingsReturnExampleScreen.S;
                        return (g) ((anb.q) savingsReturnExampleScreen.Q.getValue()).f6690c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: vob.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsReturnExampleScreen f290930b;

            {
                this.f290930b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SavingsReturnExampleScreen savingsReturnExampleScreen = this.f290930b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsReturnExampleScreen.S;
                        SavingsReturnExampleScreen savingsReturnExampleScreen2 = this.f290930b;
                        return dli.f.a(savingsReturnExampleScreen2, (g) savingsReturnExampleScreen2.R.getValue(), v.k(new FullScreenStateDelegate(), savingsReturnExampleScreen2.O, new LargeActionButtonLoadingDelegate(), new CellDetailsDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsReturnExampleScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(savingsReturnExampleScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.ui.common.dialogs.return_example.di.SavingsReturnExampleScreenInjector");
                        n nVar = ((n) objB).F;
                        SavingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData savingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData = savingsReturnExampleScreen.K;
                        savingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData.getClass();
                        return new anb.q(nVar, savingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SavingsReturnExampleScreen.S;
                        return (g) ((anb.q) savingsReturnExampleScreen.Q.getValue()).f6690c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        vob.h uiState = (vob.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jii.n) value).f174542b.setHeaderModel(uiState.f290937a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (anb.q) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.d.f121375b), null, new c(2, 4, g.class, (g) this.R.getValue(), "onLargeActionButtonClick", "onLargeActionButtonClick(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
