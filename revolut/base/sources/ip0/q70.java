package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.slider.RadialSliderView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q70 extends koi.b {
    public final RadialSliderView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q70(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.internalDelegateRadialSlider_radialSlider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (RadialSliderView) viewFindViewById;
    }
}
