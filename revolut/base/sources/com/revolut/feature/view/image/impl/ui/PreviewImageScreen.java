package com.revolut.feature.view.image.impl.ui;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.view.image.core.BaseViewImageContract$InputData;
import com.revolut.feature.view.image.core.BaseViewImageScreen;
import irg.a;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import jki.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ofm.q;
import pe2.c;
import pgk.f;
import sji.b;
import te0.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/view/image/impl/ui/PreviewImageScreen;", "Lcom/revolut/feature/view/image/core/BaseViewImageScreen;", "feature_view_image_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PreviewImageScreen extends BaseViewImageScreen {
    public static final /* synthetic */ int S = 0;
    public final boolean P;
    public final Object Q;
    public final Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewImageScreen(BaseViewImageContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = true;
        this.Q = w.y0(new c(this, inputData, 26));
        this.R = w.y0(new f(this, 18));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (mrg.b) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (hrg.b) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = BaseViewImageScreen.O;
        KProperty kProperty = kPropertyArr[0];
        ao.h hVar = this.M;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        BasicNavBar screenViewImageToolbar = ((a) value).f168047c;
        Intrinsics.checkNotNullExpressionValue(screenViewImageToolbar, "screenViewImageToolbar");
        screenViewImageToolbar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ImageViewTouch screenViewImageImageView = ((a) value2).f168046b;
        Intrinsics.checkNotNullExpressionValue(screenViewImageImageView, "screenViewImageImageView");
        screenViewImageImageView.setScaleEnabled(false);
        screenViewImageImageView.setScrollEnabled(false);
        screenViewImageImageView.setDoubleTapEnabled(false);
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}
