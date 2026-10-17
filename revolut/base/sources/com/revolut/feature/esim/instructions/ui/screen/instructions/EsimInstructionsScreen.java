package com.revolut.feature.esim.instructions.ui.screen.instructions;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardInnerRecyclerItemDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardLoadingItemDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardsHeaderDelegate;
import com.revolut.feature.esim.instructions.R$layout;
import com.revolut.feature.esim.instructions.navigation.EsimInstructionsControllerDescriptor$InputData;
import com.revolut.feature.esim.instructions.ui.screen.instructions.EsimInstructionsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qd6.c;
import sd6.a;
import ud6.b;
import ud6.d;
import ud6.f;
import ud6.g;
import vc.s;
import xki.e;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/esim/instructions/ui/screen/instructions/EsimInstructionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsd6/a;", "Lcli/w;", "Lud6/g;", "feature_esim_instructions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimInstructionsScreen extends ViewController<a> implements w {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(EsimInstructionsScreen.class, "binding", "getBinding()Lcom/revolut/feature/esim/instructions/databinding/ScreenEsimInstructionsBinding;", 0))};
    public final EsimInstructionsControllerDescriptor$InputData K;
    public final int L;
    public final int M;
    public final h N;
    public final FullScreenStateDelegate O;
    public final CellDetailsAccountDelegate P;
    public final j Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public EsimInstructionsScreen(EsimInstructionsControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_esim_instructions;
        this.M = R$style.ShowcaseSystemBarsMarkerTheme;
        this.N = s.t(this, b.f);
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.O = fullScreenStateDelegate;
        CellDetailsAccountDelegate cellDetailsAccountDelegate = new CellDetailsAccountDelegate();
        this.P = cellDetailsAccountDelegate;
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.Q = new j(7, v.k(new SwipeableCardLoadingItemDelegate(), new SwipeableCardInnerRecyclerItemDelegate(v.k(new PlainTextDelegate(), new SimpleMediaDelegate(), fullScreenStateDelegate, cellDetailsAccountDelegate, new SwipeableCardsHeaderDelegate()))), false);
        this.R = te0.w.y0(new Function0(this) { // from class: ud6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimInstructionsScreen f279154b;

            {
                this.f279154b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                EsimInstructionsScreen esimInstructionsScreen = this.f279154b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = EsimInstructionsScreen.U;
                        return n14.e.a(esimInstructionsScreen, esimInstructionsScreen.R2());
                    case 1:
                        KProperty[] kPropertyArr2 = EsimInstructionsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(esimInstructionsScreen.m2()).a().get(qd6.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qd6.a.class, " is not found"));
                        }
                        qd6.a aVar3 = ((qd6.a) aVar2.b()).f244873c;
                        EsimInstructionsControllerDescriptor$InputData esimInstructionsControllerDescriptor$InputData = esimInstructionsScreen.K;
                        esimInstructionsControllerDescriptor$InputData.getClass();
                        return new qd6.c(aVar3, esimInstructionsControllerDescriptor$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimInstructionsScreen.U;
                        return (f) ((qd6.c) esimInstructionsScreen.S.getValue()).f244877b.get();
                }
            }
        });
        this.S = te0.w.y0(new Function0(this) { // from class: ud6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimInstructionsScreen f279154b;

            {
                this.f279154b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                EsimInstructionsScreen esimInstructionsScreen = this.f279154b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = EsimInstructionsScreen.U;
                        return n14.e.a(esimInstructionsScreen, esimInstructionsScreen.R2());
                    case 1:
                        KProperty[] kPropertyArr2 = EsimInstructionsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(esimInstructionsScreen.m2()).a().get(qd6.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qd6.a.class, " is not found"));
                        }
                        qd6.a aVar3 = ((qd6.a) aVar2.b()).f244873c;
                        EsimInstructionsControllerDescriptor$InputData esimInstructionsControllerDescriptor$InputData = esimInstructionsScreen.K;
                        esimInstructionsControllerDescriptor$InputData.getClass();
                        return new qd6.c(aVar3, esimInstructionsControllerDescriptor$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimInstructionsScreen.U;
                        return (f) ((qd6.c) esimInstructionsScreen.S.getValue()).f244877b.get();
                }
            }
        });
        this.T = te0.w.y0(new Function0(this) { // from class: ud6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimInstructionsScreen f279154b;

            {
                this.f279154b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                EsimInstructionsScreen esimInstructionsScreen = this.f279154b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = EsimInstructionsScreen.U;
                        return n14.e.a(esimInstructionsScreen, esimInstructionsScreen.R2());
                    case 1:
                        KProperty[] kPropertyArr2 = EsimInstructionsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(esimInstructionsScreen.m2()).a().get(qd6.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qd6.a.class, " is not found"));
                        }
                        qd6.a aVar3 = ((qd6.a) aVar2.b()).f244873c;
                        EsimInstructionsControllerDescriptor$InputData esimInstructionsControllerDescriptor$InputData = esimInstructionsScreen.K;
                        esimInstructionsControllerDescriptor$InputData.getClass();
                        return new qd6.c(aVar3, esimInstructionsControllerDescriptor$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimInstructionsScreen.U;
                        return (f) ((qd6.c) esimInstructionsScreen.S.getValue()).f244877b.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        this.Q.c(uiState.f279158a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((pd6.a) value).f235113b.setAdapter(this.Q);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((pd6.a) value).f235113b.f0()), null, new u07.b(this, null, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new ud6.c(this, null), 3);
        CellDetailsAccountDelegate cellDetailsAccountDelegate = this.P;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(cellDetailsAccountDelegate.d), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(cellDetailsAccountDelegate.e), null, new d(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final f R2() {
        return (f) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.R.getValue();
    }
}
