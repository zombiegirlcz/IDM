package com.revolut.feature.view.image.core;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.navigable.screen.BaseScreen;
import hrg.d;
import hrg.e;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import vc.s;
import yy0.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/view/image/core/BaseViewImageScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Lhrg/d;", "Lcom/revolut/feature/view/image/core/BaseViewImageContract$InputData;", "Laii/q;", "feature_view_image_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseViewImageScreen extends BaseScreen<d, BaseViewImageContract$InputData, q> {
    public static final /* synthetic */ KProperty[] O = {o0.f186429a.j(new h0(BaseViewImageScreen.class, "binding", "getBinding()Lcom/revolut/feature/view/image/core/databinding/ScreenViewImageBinding;", 0))};
    public final h M;
    public final int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewImageScreen(BaseViewImageContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.M = s.t(this, e.f);
        this.N = R$layout.screen_view_image;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        d uiState = (d) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        f fVarQ = jh.d.f(m2()).Q();
        ?? r110 = uiState.f154824a;
        ViewBinding value = this.M.getValue(this, O[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ImageViewTouch screenViewImageImageView = ((irg.a) value).f168046b;
        Intrinsics.checkNotNullExpressionValue(screenViewImageImageView, "screenViewImageImageView");
        f.e(fVarQ, r110, screenViewImageImageView, null, null, 12);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, O[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        BasicNavBar screenViewImageToolbar = ((irg.a) value).f168047c;
        Intrinsics.checkNotNullExpressionValue(screenViewImageToolbar, "screenViewImageToolbar");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(screenViewImageToolbar.f59211b), null, new hbg.h(this, null, 21), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.N;
    }
}
