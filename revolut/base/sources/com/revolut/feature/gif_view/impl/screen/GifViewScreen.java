package com.revolut.feature.gif_view.impl.screen;

import aii.q;
import android.view.View;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.w;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.gif_view.impl.R$layout;
import com.revolut.feature.gif_view.impl.screen.GifViewScreen;
import com.revolut.feature.gif_view.impl.screen.GifViewScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import jh.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import n67.a;
import p67.b;
import q3d.i;
import q67.c;
import q67.e;
import vc.s;
import yy0.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/gif_view/impl/screen/GifViewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Lq67/e;", "feature_gif_view_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GifViewScreen extends ViewController<q> implements w {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(GifViewScreen.class, "binding", "getBinding()Lcom/revolut/feature/gif_view/impl/databinding/ScreenGifViewBinding;", 0))};
    public final GifViewScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public GifViewScreen(GifViewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_gif_view;
        this.M = s.t(this, c.f);
        final int i = 0;
        this.N = te0.w.y0(new Function0(this) { // from class: q67.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GifViewScreen f242520b;

            {
                this.f242520b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                GifViewScreen gifViewScreen = this.f242520b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = GifViewScreen.Q;
                        return n14.e.a(gifViewScreen, (f) gifViewScreen.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = GifViewScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(gifViewScreen.m2()).a().get(p67.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p67.a.class, " is not found"));
                        }
                        p67.a aVar3 = ((p67.a) aVar2.b()).f233219a;
                        GifViewScreenContract$InputData gifViewScreenContract$InputData = gifViewScreen.K;
                        gifViewScreenContract$InputData.getClass();
                        return new p67.b(aVar3, gifViewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = GifViewScreen.Q;
                        return (f) ((p67.b) gifViewScreen.O.getValue()).f233222b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: q67.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GifViewScreen f242520b;

            {
                this.f242520b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                GifViewScreen gifViewScreen = this.f242520b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GifViewScreen.Q;
                        return n14.e.a(gifViewScreen, (f) gifViewScreen.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = GifViewScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(gifViewScreen.m2()).a().get(p67.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p67.a.class, " is not found"));
                        }
                        p67.a aVar3 = ((p67.a) aVar2.b()).f233219a;
                        GifViewScreenContract$InputData gifViewScreenContract$InputData = gifViewScreen.K;
                        gifViewScreenContract$InputData.getClass();
                        return new p67.b(aVar3, gifViewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = GifViewScreen.Q;
                        return (f) ((p67.b) gifViewScreen.O.getValue()).f233222b.get();
                }
            }
        });
        final int i3 = 2;
        this.P = te0.w.y0(new Function0(this) { // from class: q67.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GifViewScreen f242520b;

            {
                this.f242520b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                GifViewScreen gifViewScreen = this.f242520b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GifViewScreen.Q;
                        return n14.e.a(gifViewScreen, (f) gifViewScreen.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = GifViewScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(gifViewScreen.m2()).a().get(p67.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p67.a.class, " is not found"));
                        }
                        p67.a aVar3 = ((p67.a) aVar2.b()).f233219a;
                        GifViewScreenContract$InputData gifViewScreenContract$InputData = gifViewScreen.K;
                        gifViewScreenContract$InputData.getClass();
                        return new p67.b(aVar3, gifViewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = GifViewScreen.Q;
                        return (f) ((p67.b) gifViewScreen.O.getValue()).f233222b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a aVarD3 = d3();
        f fVarQ = d.f(m2()).Q();
        UrlImage urlImage = uiState.f242522a;
        ImageView gifImage = aVarD3.f212715c;
        Intrinsics.checkNotNullExpressionValue(gifImage, "gifImage");
        f.e(fVarQ, urlImage, gifImage, null, null, 12);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (q67.f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ImageView gifImage = d3().f212715c;
        Intrinsics.checkNotNullExpressionValue(gifImage, "gifImage");
        edl.a.s(gifImage, new i(23));
        ControllerContainerConstraintLayout gifViewContainer = d3().d;
        Intrinsics.checkNotNullExpressionValue(gifViewContainer, "gifViewContainer");
        final int i = 0;
        edl.a.s(gifViewContainer, new Function1(this) { // from class: q67.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GifViewScreen f242518b;

            {
                this.f242518b = this;
            }

            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                GifViewScreen gifViewScreen = this.f242518b;
                KProperty[] kPropertyArr = GifViewScreen.Q;
                switch (i2) {
                    case 0:
                        ((f) gifViewScreen.P.getValue()).B2();
                        break;
                    default:
                        ((f) gifViewScreen.P.getValue()).B2();
                        break;
                }
                return Unit.f186387a;
            }
        });
        ImageView closeButton = d3().f212714b;
        Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
        final int i2 = 1;
        edl.a.s(closeButton, new Function1(this) { // from class: q67.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GifViewScreen f242518b;

            {
                this.f242518b = this;
            }

            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                GifViewScreen gifViewScreen = this.f242518b;
                KProperty[] kPropertyArr = GifViewScreen.Q;
                switch (i22) {
                    case 0:
                        ((f) gifViewScreen.P.getValue()).B2();
                        break;
                    default:
                        ((f) gifViewScreen.P.getValue()).B2();
                        break;
                }
                return Unit.f186387a;
            }
        });
    }

    public final a d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.N.getValue();
    }
}
