package com.revolut.feature.card_design.impl.card_design.card_video_preview;

import aii.q;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_design.impl.R$id;
import com.revolut.feature.card_design.impl.R$layout;
import com.revolut.feature.card_design.impl.card_design.card_video_preview.CardVideoPreviewController;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jh.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.c9;
import no.m;
import qx2.b;
import qx2.c;
import qx2.e;
import te0.w;
import vc.s;
import yy0.f;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/card_design/impl/card_design/card_video_preview/CardVideoPreviewController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lqx2/e;", "Lno/m;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardVideoPreviewController extends ViewController<q> implements a, m {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(CardVideoPreviewController.class, "binding", "getBinding()Lcom/revolut/feature/card_design/impl/databinding/ScreenCardVideoPreviewBinding;", 0))};
    public final int K;
    public final h L;
    public final AnalyticsProduct M;
    public final Object N;
    public final Object O;
    public final Object P;

    public CardVideoPreviewController(CardVideoPreviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_card_video_preview;
        this.L = s.t(this, b.f);
        this.M = inputData.f64680b;
        this.N = w.y0(new qvf.a(this, inputData, 5));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: qx2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardVideoPreviewController f250010b;

            {
                this.f250010b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CardVideoPreviewController.Q;
                        return (c) ((gy2.h) this.f250010b.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = CardVideoPreviewController.Q;
                        CardVideoPreviewController cardVideoPreviewController = this.f250010b;
                        return dli.f.a(cardVideoPreviewController, (c) cardVideoPreviewController.O.getValue(), u.c(new SimpleMediaDelegate()), R$id.screenCardVideoPreview_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: qx2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardVideoPreviewController f250010b;

            {
                this.f250010b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CardVideoPreviewController.Q;
                        return (c) ((gy2.h) this.f250010b.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = CardVideoPreviewController.Q;
                        CardVideoPreviewController cardVideoPreviewController = this.f250010b;
                        return dli.f.a(cardVideoPreviewController, (c) cardVideoPreviewController.O.getValue(), u.c(new SimpleMediaDelegate()), R$id.screenCardVideoPreview_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((e) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getN() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (gy2.h) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = d3().f121054a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        f fVarQ = d.f(context).Q();
        LayeredImage layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_cross, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorWidgetBackground_10, 6.0f, Float.valueOf(24.0f), null, 32);
        AppCompatImageView screenCardVideoPreviewCloseIcon = d3().f121055b;
        Intrinsics.checkNotNullExpressionValue(screenCardVideoPreviewCloseIcon, "screenCardVideoPreviewCloseIcon");
        f.e(fVarQ, layeredImageB, screenCardVideoPreviewCloseIcon, null, null, 12);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f121055b.setOnClickListener(new c9(this, 12));
    }

    public final dy2.b d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (dy2.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
