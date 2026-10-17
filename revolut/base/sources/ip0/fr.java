package ip0;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class fr extends koi.b {
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f164305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConstraintLayout f164306h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.inputSliderLoading_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.inputSliderLoading_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164305g = viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.inputSliderLoading_constraintLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164306h = (ConstraintLayout) viewFindViewById3;
    }
}
