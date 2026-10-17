package com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.transfer_assets;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.transfer_assets.DeFiTransferAssetsScreen;
import com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.transfer_assets.DeFiTransferAssetsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import g56.j;
import g56.k;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m3g.c;
import m56.b;
import m56.e;
import m56.f;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/remittances/impl/ui/defi_to_cefi/transfer_assets/DeFiTransferAssetsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lm56/e;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeFiTransferAssetsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(DeFiTransferAssetsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final DeFiTransferAssetsScreenContract$InputData K;
    public final h L;
    public final Object M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public DeFiTransferAssetsScreen(DeFiTransferAssetsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = w.y0(new c(4));
        this.N = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: m56.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiTransferAssetsScreen f202841b;

            {
                this.f202841b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DeFiTransferAssetsScreen deFiTransferAssetsScreen = this.f202841b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiTransferAssetsScreen.R;
                        qji.b bVarR1 = deFiTransferAssetsScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.transfer_assets.di.DeFiTransferAssetsScreenComponentInjector");
                        j jVar = (j) bVarR1;
                        g56.d dVar = jVar.f140662b;
                        j jVar2 = jVar.f140663c;
                        DeFiTransferAssetsScreenContract$InputData deFiTransferAssetsScreenContract$InputData = deFiTransferAssetsScreen.K;
                        deFiTransferAssetsScreenContract$InputData.getClass();
                        return new k(dVar, jVar2, deFiTransferAssetsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiTransferAssetsScreen.R;
                        return (f) ((k) deFiTransferAssetsScreen.O.getValue()).f140665b.get();
                    default:
                        KProperty[] kPropertyArr3 = DeFiTransferAssetsScreen.R;
                        DeFiTransferAssetsScreen deFiTransferAssetsScreen2 = this.f202841b;
                        return dli.f.a(deFiTransferAssetsScreen2, (f) deFiTransferAssetsScreen2.P.getValue(), v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) deFiTransferAssetsScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: m56.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiTransferAssetsScreen f202841b;

            {
                this.f202841b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DeFiTransferAssetsScreen deFiTransferAssetsScreen = this.f202841b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiTransferAssetsScreen.R;
                        qji.b bVarR1 = deFiTransferAssetsScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.transfer_assets.di.DeFiTransferAssetsScreenComponentInjector");
                        j jVar = (j) bVarR1;
                        g56.d dVar = jVar.f140662b;
                        j jVar2 = jVar.f140663c;
                        DeFiTransferAssetsScreenContract$InputData deFiTransferAssetsScreenContract$InputData = deFiTransferAssetsScreen.K;
                        deFiTransferAssetsScreenContract$InputData.getClass();
                        return new k(dVar, jVar2, deFiTransferAssetsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiTransferAssetsScreen.R;
                        return (f) ((k) deFiTransferAssetsScreen.O.getValue()).f140665b.get();
                    default:
                        KProperty[] kPropertyArr3 = DeFiTransferAssetsScreen.R;
                        DeFiTransferAssetsScreen deFiTransferAssetsScreen2 = this.f202841b;
                        return dli.f.a(deFiTransferAssetsScreen2, (f) deFiTransferAssetsScreen2.P.getValue(), v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) deFiTransferAssetsScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: m56.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiTransferAssetsScreen f202841b;

            {
                this.f202841b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DeFiTransferAssetsScreen deFiTransferAssetsScreen = this.f202841b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiTransferAssetsScreen.R;
                        qji.b bVarR1 = deFiTransferAssetsScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.transfer_assets.di.DeFiTransferAssetsScreenComponentInjector");
                        j jVar = (j) bVarR1;
                        g56.d dVar = jVar.f140662b;
                        j jVar2 = jVar.f140663c;
                        DeFiTransferAssetsScreenContract$InputData deFiTransferAssetsScreenContract$InputData = deFiTransferAssetsScreen.K;
                        deFiTransferAssetsScreenContract$InputData.getClass();
                        return new k(dVar, jVar2, deFiTransferAssetsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiTransferAssetsScreen.R;
                        return (f) ((k) deFiTransferAssetsScreen.O.getValue()).f140665b.get();
                    default:
                        KProperty[] kPropertyArr3 = DeFiTransferAssetsScreen.R;
                        DeFiTransferAssetsScreen deFiTransferAssetsScreen2 = this.f202841b;
                        return dli.f.a(deFiTransferAssetsScreen2, (f) deFiTransferAssetsScreen2.P.getValue(), v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) deFiTransferAssetsScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
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
        return (k) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((m) value).f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new lpl.c(this, null, 20), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.M.getValue()).f52371h.f121375b), new m56.c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
