package com.revolut.feature.pay_with_smile.impl.ui.fallback_confirmation;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.timer.TimerDelegate;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.feature.pay_with_smile.impl.R$id;
import com.revolut.feature.pay_with_smile.impl.R$layout;
import com.revolut.feature.pay_with_smile.impl.ui.fallback_confirmation.FallbackConfirmationScreen;
import com.revolut.feature.pay_with_smile.impl.ui.fallback_confirmation.FallbackConfirmationScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tl9.b;
import xki.e;
import yl9.f;
import yl9.k;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pay_with_smile/impl/ui/fallback_confirmation/FallbackConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyl9/f;", "Ldli/a;", "Lyl9/g;", "Lin0/g;", "feature_pay_with_smile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FallbackConfirmationScreen extends ViewController<f> implements a, g {
    public final FallbackConfirmationScreenContract$InputData K;
    public final int L;
    public final boolean M;
    public final Object N;
    public final Object O;
    public final Object P;

    public FallbackConfirmationScreen(FallbackConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_fallback_confirmation;
        this.M = true;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: yl9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FallbackConfirmationScreen f314666b;

            {
                this.f314666b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FallbackConfirmationScreen fallbackConfirmationScreen = this.f314666b;
                switch (i2) {
                    case 0:
                        FallbackConfirmationScreen fallbackConfirmationScreen2 = this.f314666b;
                        return dli.f.a(fallbackConfirmationScreen2, (k) fallbackConfirmationScreen2.P.getValue(), v.k(new TimerDelegate(), new CellDetailsDelegate(), new RowDelegate(null, null, 7)), R$id.fallbackConfirmation_recyclerView, null, null, null, 56);
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(fallbackConfirmationScreen.m2()).a().get(tl9.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tl9.g.class, " is not found"));
                        }
                        tl9.c cVar = ((tl9.c) ((tl9.g) aVar2.b())).k;
                        FallbackConfirmationScreenContract$InputData fallbackConfirmationScreenContract$InputData = fallbackConfirmationScreen.K;
                        fallbackConfirmationScreenContract$InputData.getClass();
                        return new tl9.b(cVar, fallbackConfirmationScreenContract$InputData);
                    default:
                        return (k) ((tl9.b) fallbackConfirmationScreen.O.getValue()).f272024c.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: yl9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FallbackConfirmationScreen f314666b;

            {
                this.f314666b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FallbackConfirmationScreen fallbackConfirmationScreen = this.f314666b;
                switch (i22) {
                    case 0:
                        FallbackConfirmationScreen fallbackConfirmationScreen2 = this.f314666b;
                        return dli.f.a(fallbackConfirmationScreen2, (k) fallbackConfirmationScreen2.P.getValue(), v.k(new TimerDelegate(), new CellDetailsDelegate(), new RowDelegate(null, null, 7)), R$id.fallbackConfirmation_recyclerView, null, null, null, 56);
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(fallbackConfirmationScreen.m2()).a().get(tl9.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tl9.g.class, " is not found"));
                        }
                        tl9.c cVar = ((tl9.c) ((tl9.g) aVar2.b())).k;
                        FallbackConfirmationScreenContract$InputData fallbackConfirmationScreenContract$InputData = fallbackConfirmationScreen.K;
                        fallbackConfirmationScreenContract$InputData.getClass();
                        return new tl9.b(cVar, fallbackConfirmationScreenContract$InputData);
                    default:
                        return (k) ((tl9.b) fallbackConfirmationScreen.O.getValue()).f272024c.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: yl9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FallbackConfirmationScreen f314666b;

            {
                this.f314666b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FallbackConfirmationScreen fallbackConfirmationScreen = this.f314666b;
                switch (i22) {
                    case 0:
                        FallbackConfirmationScreen fallbackConfirmationScreen2 = this.f314666b;
                        return dli.f.a(fallbackConfirmationScreen2, (k) fallbackConfirmationScreen2.P.getValue(), v.k(new TimerDelegate(), new CellDetailsDelegate(), new RowDelegate(null, null, 7)), R$id.fallbackConfirmation_recyclerView, null, null, null, 56);
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(fallbackConfirmationScreen.m2()).a().get(tl9.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tl9.g.class, " is not found"));
                        }
                        tl9.c cVar = ((tl9.c) ((tl9.g) aVar2.b())).k;
                        FallbackConfirmationScreenContract$InputData fallbackConfirmationScreenContract$InputData = fallbackConfirmationScreen.K;
                        fallbackConfirmationScreenContract$InputData.getClass();
                        return new tl9.b(cVar, fallbackConfirmationScreenContract$InputData);
                    default:
                        return (k) ((tl9.b) fallbackConfirmationScreen.O.getValue()).f272024c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        yl9.g uiState = (yl9.g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        View viewFindViewById = D2().findViewById(R$id.fallbackConfirmation_actionFooterView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ((ActionFooterView) viewFindViewById).setModel(uiState.f314671b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = D2().findViewById(R$id.fallbackConfirmation_actionFooterView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewController.P2(this, rd0.e.b(((ActionFooterView) viewFindViewById).f), new yl9.b(this, null, 0), 3);
        View viewFindViewById2 = D2().findViewById(R$id.fallbackConfirmation_actionFooterView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ViewController.P2(this, rd0.e.b(((ActionFooterView) viewFindViewById2).f58955g), new yl9.b(this, null, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
