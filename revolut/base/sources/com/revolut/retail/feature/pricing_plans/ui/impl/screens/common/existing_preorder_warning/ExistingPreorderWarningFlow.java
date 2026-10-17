package com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.existing_preorder_warning;

import a07.d;
import agh.b;
import akk.h;
import akk.j;
import android.view.View;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.existing_preorder_warning.ExistingPreorderWarningFlow;
import j60.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qgk.g;
import te0.w;
import xki.e;
import yki.c;
import yki.f;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/common/existing_preorder_warning/ExistingPreorderWarningFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lakk/j;", "Lyki/f;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExistingPreorderWarningFlow extends ViewController<j> implements f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final LargeActionButtonDelegate P;

    public ExistingPreorderWarningFlow(h inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: akk.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExistingPreorderWarningFlow f5971b;

            {
                this.f5971b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ExistingPreorderWarningFlow existingPreorderWarningFlow = this.f5971b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, existingPreorderWarningFlow, (g) existingPreorderWarningFlow.N.getValue());
                    case 1:
                        return (g) ((qgk.g) this.f5971b.M.getValue()).f245962h.get();
                    default:
                        return (j60.a) ((qgk.g) this.f5971b.M.getValue()).f245961g.get();
                }
            }
        });
        this.M = w.y0(new b(this, inputData, 11));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: akk.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExistingPreorderWarningFlow f5971b;

            {
                this.f5971b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ExistingPreorderWarningFlow existingPreorderWarningFlow = this.f5971b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, existingPreorderWarningFlow, (g) existingPreorderWarningFlow.N.getValue());
                    case 1:
                        return (g) ((qgk.g) this.f5971b.M.getValue()).f245962h.get();
                    default:
                        return (j60.a) ((qgk.g) this.f5971b.M.getValue()).f245961g.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: akk.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExistingPreorderWarningFlow f5971b;

            {
                this.f5971b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ExistingPreorderWarningFlow existingPreorderWarningFlow = this.f5971b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, existingPreorderWarningFlow, (g) existingPreorderWarningFlow.N.getValue());
                    case 1:
                        return (g) ((qgk.g) this.f5971b.M.getValue()).f245962h.get();
                    default:
                        return (j60.a) ((qgk.g) this.f5971b.M.getValue()).f245961g.get();
                }
            }
        });
        this.P = new LargeActionButtonDelegate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ?? r06 = this.O;
        if (((a) r06.getValue()).j()) {
            a.v((a) r06.getValue(), false, null, 3);
        }
        return super.F2();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (akk.g) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((a) this.O.getValue()).d(u.c(this.P));
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.d.f121375b), null, new akk.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((a) this.O.getValue()).E()), null, new d(this, null, 29), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.L.getValue();
    }
}
