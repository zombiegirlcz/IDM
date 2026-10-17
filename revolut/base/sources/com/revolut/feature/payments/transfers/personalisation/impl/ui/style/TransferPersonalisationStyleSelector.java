package com.revolut.feature.payments.transfers.personalisation.impl.ui.style;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.TransferAmountPageLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TransferAmountPagePreviewDelegate;
import com.revolut.core.ui_kit.recycler.CenterScrollableLinearLayoutManager;
import com.revolut.feature.payments.transfers.personalisation.impl.R$id;
import com.revolut.feature.payments.transfers.personalisation.impl.R$layout;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.style.TransferPersonalisationStyleSelector;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.style.TransferPersonalisationStyleSelectorContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import g2a.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l2a.c;
import org.jetbrains.annotations.NotNull;
import pki.b;
import te0.w;
import tw0.a0;
import vc.s;
import xki.e;
import z1i.n;
import z2a.g;
import z2a.j;
import z2a.k;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/payments/transfers/personalisation/impl/ui/style/TransferPersonalisationStyleSelector;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg2a/f;", "Ldli/a;", "Lz2a/j;", "Companion", "a", "feature_payments_transfers_personalisation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferPersonalisationStyleSelector extends ViewController<f> implements a {
    public final TransferPersonalisationStyleSelectorContract$InputData K;
    public final h L;
    public final int M;
    public final TransferAmountPagePreviewDelegate N;
    public final z2a.a O;
    public final Object P;
    public boolean Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(TransferPersonalisationStyleSelector.class, "binding", "getBinding()Lcom/revolut/feature/payments/transfers/personalisation/impl/databinding/TransferPersonalisationStyleScreenBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.payments.transfers.personalisation.impl.ui.style.TransferPersonalisationStyleSelector$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public TransferPersonalisationStyleSelector(TransferPersonalisationStyleSelectorContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, z2a.f.f);
        this.M = R$layout.transfer_personalisation_style_screen;
        this.N = new TransferAmountPagePreviewDelegate();
        this.O = new z2a.a();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: z2a.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferPersonalisationStyleSelector f319042b;

            {
                this.f319042b = this;
            }

            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransferPersonalisationStyleSelector transferPersonalisationStyleSelector = this.f319042b;
                switch (i2) {
                    case 0:
                        TransferPersonalisationStyleSelector.Companion companion = TransferPersonalisationStyleSelector.INSTANCE;
                        return new CenterScrollableLinearLayoutManager(transferPersonalisationStyleSelector.m2());
                    case 1:
                        TransferPersonalisationStyleSelector.Companion companion2 = TransferPersonalisationStyleSelector.INSTANCE;
                        TransferPersonalisationStyleSelector transferPersonalisationStyleSelector2 = this.f319042b;
                        return dli.f.a(transferPersonalisationStyleSelector2, (k) transferPersonalisationStyleSelector2.T.getValue(), v.k(transferPersonalisationStyleSelector2.N, new TransferAmountPageLoadingDelegate()), R$id.personalisationStyle_recyclerView, new z2.a(transferPersonalisationStyleSelector2, 3), null, null, 48);
                    case 2:
                        TransferPersonalisationStyleSelector.Companion companion3 = TransferPersonalisationStyleSelector.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(transferPersonalisationStyleSelector.m2()).a().get(o2a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o2a.b.class, " is not found"));
                        }
                        o2a.b bVar = ((o2a.b) aVar2.b()).e;
                        TransferPersonalisationStyleSelectorContract$InputData transferPersonalisationStyleSelectorContract$InputData = transferPersonalisationStyleSelector.K;
                        transferPersonalisationStyleSelectorContract$InputData.getClass();
                        return new o2a.f(bVar, transferPersonalisationStyleSelectorContract$InputData);
                    default:
                        TransferPersonalisationStyleSelector.Companion companion4 = TransferPersonalisationStyleSelector.INSTANCE;
                        return (k) ((o2a.f) transferPersonalisationStyleSelector.S.getValue()).f221611c.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: z2a.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferPersonalisationStyleSelector f319042b;

            {
                this.f319042b = this;
            }

            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransferPersonalisationStyleSelector transferPersonalisationStyleSelector = this.f319042b;
                switch (i22) {
                    case 0:
                        TransferPersonalisationStyleSelector.Companion companion = TransferPersonalisationStyleSelector.INSTANCE;
                        return new CenterScrollableLinearLayoutManager(transferPersonalisationStyleSelector.m2());
                    case 1:
                        TransferPersonalisationStyleSelector.Companion companion2 = TransferPersonalisationStyleSelector.INSTANCE;
                        TransferPersonalisationStyleSelector transferPersonalisationStyleSelector2 = this.f319042b;
                        return dli.f.a(transferPersonalisationStyleSelector2, (k) transferPersonalisationStyleSelector2.T.getValue(), v.k(transferPersonalisationStyleSelector2.N, new TransferAmountPageLoadingDelegate()), R$id.personalisationStyle_recyclerView, new z2.a(transferPersonalisationStyleSelector2, 3), null, null, 48);
                    case 2:
                        TransferPersonalisationStyleSelector.Companion companion3 = TransferPersonalisationStyleSelector.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(transferPersonalisationStyleSelector.m2()).a().get(o2a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o2a.b.class, " is not found"));
                        }
                        o2a.b bVar = ((o2a.b) aVar2.b()).e;
                        TransferPersonalisationStyleSelectorContract$InputData transferPersonalisationStyleSelectorContract$InputData = transferPersonalisationStyleSelector.K;
                        transferPersonalisationStyleSelectorContract$InputData.getClass();
                        return new o2a.f(bVar, transferPersonalisationStyleSelectorContract$InputData);
                    default:
                        TransferPersonalisationStyleSelector.Companion companion4 = TransferPersonalisationStyleSelector.INSTANCE;
                        return (k) ((o2a.f) transferPersonalisationStyleSelector.S.getValue()).f221611c.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: z2a.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferPersonalisationStyleSelector f319042b;

            {
                this.f319042b = this;
            }

            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransferPersonalisationStyleSelector transferPersonalisationStyleSelector = this.f319042b;
                switch (i22) {
                    case 0:
                        TransferPersonalisationStyleSelector.Companion companion = TransferPersonalisationStyleSelector.INSTANCE;
                        return new CenterScrollableLinearLayoutManager(transferPersonalisationStyleSelector.m2());
                    case 1:
                        TransferPersonalisationStyleSelector.Companion companion2 = TransferPersonalisationStyleSelector.INSTANCE;
                        TransferPersonalisationStyleSelector transferPersonalisationStyleSelector2 = this.f319042b;
                        return dli.f.a(transferPersonalisationStyleSelector2, (k) transferPersonalisationStyleSelector2.T.getValue(), v.k(transferPersonalisationStyleSelector2.N, new TransferAmountPageLoadingDelegate()), R$id.personalisationStyle_recyclerView, new z2.a(transferPersonalisationStyleSelector2, 3), null, null, 48);
                    case 2:
                        TransferPersonalisationStyleSelector.Companion companion3 = TransferPersonalisationStyleSelector.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(transferPersonalisationStyleSelector.m2()).a().get(o2a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o2a.b.class, " is not found"));
                        }
                        o2a.b bVar = ((o2a.b) aVar2.b()).e;
                        TransferPersonalisationStyleSelectorContract$InputData transferPersonalisationStyleSelectorContract$InputData = transferPersonalisationStyleSelector.K;
                        transferPersonalisationStyleSelectorContract$InputData.getClass();
                        return new o2a.f(bVar, transferPersonalisationStyleSelectorContract$InputData);
                    default:
                        TransferPersonalisationStyleSelector.Companion companion4 = TransferPersonalisationStyleSelector.INSTANCE;
                        return (k) ((o2a.f) transferPersonalisationStyleSelector.S.getValue()).f221611c.get();
                }
            }
        });
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: z2a.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferPersonalisationStyleSelector f319042b;

            {
                this.f319042b = this;
            }

            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TransferPersonalisationStyleSelector transferPersonalisationStyleSelector = this.f319042b;
                switch (i22) {
                    case 0:
                        TransferPersonalisationStyleSelector.Companion companion = TransferPersonalisationStyleSelector.INSTANCE;
                        return new CenterScrollableLinearLayoutManager(transferPersonalisationStyleSelector.m2());
                    case 1:
                        TransferPersonalisationStyleSelector.Companion companion2 = TransferPersonalisationStyleSelector.INSTANCE;
                        TransferPersonalisationStyleSelector transferPersonalisationStyleSelector2 = this.f319042b;
                        return dli.f.a(transferPersonalisationStyleSelector2, (k) transferPersonalisationStyleSelector2.T.getValue(), v.k(transferPersonalisationStyleSelector2.N, new TransferAmountPageLoadingDelegate()), R$id.personalisationStyle_recyclerView, new z2.a(transferPersonalisationStyleSelector2, 3), null, null, 48);
                    case 2:
                        TransferPersonalisationStyleSelector.Companion companion3 = TransferPersonalisationStyleSelector.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(transferPersonalisationStyleSelector.m2()).a().get(o2a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o2a.b.class, " is not found"));
                        }
                        o2a.b bVar = ((o2a.b) aVar2.b()).e;
                        TransferPersonalisationStyleSelectorContract$InputData transferPersonalisationStyleSelectorContract$InputData = transferPersonalisationStyleSelector.K;
                        transferPersonalisationStyleSelectorContract$InputData.getClass();
                        return new o2a.f(bVar, transferPersonalisationStyleSelectorContract$InputData);
                    default:
                        TransferPersonalisationStyleSelector.Companion companion4 = TransferPersonalisationStyleSelector.INSTANCE;
                        return (k) ((o2a.f) transferPersonalisationStyleSelector.S.getValue()).f221611c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f191726b.setTotalPages(uiState.f319046a.size());
        Integer num = uiState.f319047b;
        if (num == null || this.Q) {
            return;
        }
        this.Q = true;
        d3().f191727c.scrollToPosition(num.intValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o2a.f) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (k) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView screenContentRecyclerView = d3().f191727c;
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper();
        linearSnapHelper.attachToRecyclerView(screenContentRecyclerView);
        screenContentRecyclerView.setClipToPadding(false);
        int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(view, "getContext(...)", 16.0f);
        screenContentRecyclerView.addItemDecoration(new a0(iA, iA, 0, 0));
        screenContentRecyclerView.addOnScrollListener(new g(linearSnapHelper, this));
        ViewCompat.setOnApplyWindowInsetsListener(d3().f191725a, new n(this, 18));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.N.f53556c), new z2a.h(this, null), 3);
    }

    public final c d3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
