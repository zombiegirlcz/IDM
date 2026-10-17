package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.views.slider.RangeSliderTitledView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t70 extends koi.b {
    public final RangeSliderTitledView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UIKitTextView f166473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UIKitTextView f166474h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t70(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.rangeSlider_slider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (RangeSliderTitledView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.rangeSlider_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166473g = (UIKitTextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.rangeSlider_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166474h = (UIKitTextView) viewFindViewById3;
    }
}
