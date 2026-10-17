package com.revolut.feature.slot_manager.impl.ui.screen.prompt;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt;
import com.revolut.feature.slot_manager.impl.ui.screen.prompt.SlotManagerPromptController;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import rgf.b;
import rk9.d;
import rld.f;
import rld.g;
import rld.i;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/slot_manager/impl/ui/screen/prompt/SlotManagerPromptController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lrld/i;", "Lno/m;", "feature_slot_manager_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SlotManagerPromptController extends ViewController<q> implements a, m {
    public final int K;
    public final AnalyticsProduct L;
    public final Integer M;
    public final PromptMarketingContentDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public SlotManagerPromptController(SlotManagerPromptControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_view;
        this.L = inputData.f87377b;
        this.M = inputData.f87376a.f87320b.d == SlotDefaultPrompt.LayoutType.HERO ? Integer.valueOf(R$style.UiKitTheme_Mono) : null;
        this.N = new PromptMarketingContentDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: rld.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SlotManagerPromptController f255016b;

            {
                this.f255016b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SlotManagerPromptController slotManagerPromptController = this.f255016b;
                        return dli.f.a(slotManagerPromptController, slotManagerPromptController.R2(), u.c(slotManagerPromptController.N), 0, null, null, null, 60);
                    default:
                        return (m) ((rkd.i) this.f255016b.Q.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: rld.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SlotManagerPromptController f255016b;

            {
                this.f255016b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        SlotManagerPromptController slotManagerPromptController = this.f255016b;
                        return dli.f.a(slotManagerPromptController, slotManagerPromptController.R2(), u.c(slotManagerPromptController.N), 0, null, null, null, 60);
                    default:
                        return (m) ((rkd.i) this.f255016b.Q.getValue()).d.get();
                }
            }
        });
        this.Q = w.y0(new b(this, inputData, 7));
        this.R = w.y0(new r1a.a(inputData, 16));
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getM() {
        return this.M;
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((i) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (rkd.i) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.z = false;
        RecyclerView recyclerViewH = ((c) this.O.getValue()).h();
        ScreenContentRecyclerView screenContentRecyclerView = recyclerViewH instanceof ScreenContentRecyclerView ? (ScreenContentRecyclerView) recyclerViewH : null;
        if (screenContentRecyclerView != null) {
            screenContentRecyclerView.setModel((goi.i) this.R.getValue());
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.N;
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new rld.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53080g.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.d), new d(this, null, 3), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final rld.m R2() {
        return (rld.m) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }
}
