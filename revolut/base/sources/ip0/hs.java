package ip0;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.slider.LargeSliderView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class hs extends koi.b {
    public final LargeSliderView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f164592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f164593h;
    public final AppCompatTextView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.internalDelegateLargeSlider_largeSlider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (LargeSliderView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.internalDelegateLargeSlider_startLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164592g = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.internalDelegateLargeSlider_midLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164593h = (AppCompatTextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.internalDelegateLargeSlider_endLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (AppCompatTextView) viewFindViewById4;
    }
}
