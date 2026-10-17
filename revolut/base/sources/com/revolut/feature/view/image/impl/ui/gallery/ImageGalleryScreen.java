package com.revolut.feature.view.image.impl.ui.gallery;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LightboxGalleryView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.view.image.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.List;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import rgf.b;
import rrg.a;
import rrg.c;
import rrg.d;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/view/image/impl/ui/gallery/ImageGalleryScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Lrrg/c;", "Lcom/revolut/feature/view/image/impl/ui/gallery/ImageGalleryScreenContract$InputData;", "Laii/q;", "feature_view_image_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ImageGalleryScreen extends BaseScreen<c, ImageGalleryScreenContract$InputData, q> {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(ImageGalleryScreen.class, "binding", "getBinding()Lcom/revolut/feature/view/image/impl/databinding/ScreenImageGalleryBinding;", 0))};
    public final int M;
    public final boolean N;
    public final h O;
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageGalleryScreen(ImageGalleryScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.M = R$layout.screen_image_gallery;
        this.N = true;
        this.O = s.t(this, a.f);
        this.P = w.y0(new b(this, inputData, 19));
        this.Q = w.y0(new r1a.a(this, 25));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        c uiState = (c) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        LightboxGalleryView lightboxGalleryView = Z2().f188868b;
        lightboxGalleryView.setGalleryItems(uiState.f256835a);
        lightboxGalleryView.setViewPagerToPosition(uiState.f256837c, false);
        lightboxGalleryView.setMenuItems(uiState.f256836b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (mrg.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (d) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        LightboxGalleryView lightboxGalleryView = Z2().f188868b;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(lightboxGalleryView.h0()), null, new rlh.c(this, continuation, 14), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(lightboxGalleryView.i), null, new rk9.d(this, continuation, 24), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Z2().f188868b.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    public final krg.a Z2() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (krg.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
