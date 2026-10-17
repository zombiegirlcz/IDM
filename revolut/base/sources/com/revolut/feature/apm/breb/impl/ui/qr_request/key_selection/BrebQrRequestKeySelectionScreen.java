package com.revolut.feature.apm.breb.impl.ui.qr_request.key_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.breb.impl.ui.qr_request.key_selection.BrebQrRequestKeySelectionScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mw1.c;
import mw1.d;
import mw1.f;
import mw1.g;
import mw1.i;
import nv1.p;
import nv1.q;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/ui/qr_request/key_selection/BrebQrRequestKeySelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmw1/g;", "Ldli/a;", "Lmw1/i;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrebQrRequestKeySelectionScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(BrebQrRequestKeySelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final f K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public BrebQrRequestKeySelectionScreen(f inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = true;
        this.N = s.t(this, c.f);
        final int i = 0;
        this.O = w.y0(new mw1.a(0));
        this.P = w.y0(new Function0(this) { // from class: mw1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebQrRequestKeySelectionScreen f209301b;

            {
                this.f209301b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BrebQrRequestKeySelectionScreen brebQrRequestKeySelectionScreen = this.f209301b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BrebQrRequestKeySelectionScreen.S;
                        BrebQrRequestKeySelectionScreen brebQrRequestKeySelectionScreen2 = this.f209301b;
                        return dli.f.a(brebQrRequestKeySelectionScreen2, (h) brebQrRequestKeySelectionScreen2.R.getValue(), u.c((RowDelegate) brebQrRequestKeySelectionScreen2.O.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BrebQrRequestKeySelectionScreen.S;
                        qji.b bVarU2 = brebQrRequestKeySelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.qr_request.key_selection.di.BrebQrRequestKeySelectionScreenInjector");
                        p pVar = (p) bVarU2;
                        nv1.g gVar = pVar.f219437b;
                        p pVar2 = pVar.f219438c;
                        f fVar = brebQrRequestKeySelectionScreen.K;
                        fVar.getClass();
                        return new q(gVar, pVar2, fVar);
                    default:
                        KProperty[] kPropertyArr3 = BrebQrRequestKeySelectionScreen.S;
                        return (h) ((q) brebQrRequestKeySelectionScreen.Q.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: mw1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebQrRequestKeySelectionScreen f209301b;

            {
                this.f209301b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BrebQrRequestKeySelectionScreen brebQrRequestKeySelectionScreen = this.f209301b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrebQrRequestKeySelectionScreen.S;
                        BrebQrRequestKeySelectionScreen brebQrRequestKeySelectionScreen2 = this.f209301b;
                        return dli.f.a(brebQrRequestKeySelectionScreen2, (h) brebQrRequestKeySelectionScreen2.R.getValue(), u.c((RowDelegate) brebQrRequestKeySelectionScreen2.O.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BrebQrRequestKeySelectionScreen.S;
                        qji.b bVarU2 = brebQrRequestKeySelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.qr_request.key_selection.di.BrebQrRequestKeySelectionScreenInjector");
                        p pVar = (p) bVarU2;
                        nv1.g gVar = pVar.f219437b;
                        p pVar2 = pVar.f219438c;
                        f fVar = brebQrRequestKeySelectionScreen.K;
                        fVar.getClass();
                        return new q(gVar, pVar2, fVar);
                    default:
                        KProperty[] kPropertyArr3 = BrebQrRequestKeySelectionScreen.S;
                        return (h) ((q) brebQrRequestKeySelectionScreen.Q.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: mw1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebQrRequestKeySelectionScreen f209301b;

            {
                this.f209301b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BrebQrRequestKeySelectionScreen brebQrRequestKeySelectionScreen = this.f209301b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrebQrRequestKeySelectionScreen.S;
                        BrebQrRequestKeySelectionScreen brebQrRequestKeySelectionScreen2 = this.f209301b;
                        return dli.f.a(brebQrRequestKeySelectionScreen2, (h) brebQrRequestKeySelectionScreen2.R.getValue(), u.c((RowDelegate) brebQrRequestKeySelectionScreen2.O.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BrebQrRequestKeySelectionScreen.S;
                        qji.b bVarU2 = brebQrRequestKeySelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.qr_request.key_selection.di.BrebQrRequestKeySelectionScreenInjector");
                        p pVar = (p) bVarU2;
                        nv1.g gVar = pVar.f219437b;
                        p pVar2 = pVar.f219438c;
                        f fVar = brebQrRequestKeySelectionScreen.K;
                        fVar.getClass();
                        return new q(gVar, pVar2, fVar);
                    default:
                        KProperty[] kPropertyArr3 = BrebQrRequestKeySelectionScreen.S;
                        return (h) ((q) brebQrRequestKeySelectionScreen.Q.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(uiState.f209308b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (mw1.h) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.O.getValue()).f53218h), null, new d(this, null), 3);
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

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
