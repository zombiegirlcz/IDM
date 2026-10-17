package ip0;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ks extends koi.b {
    public final AppCompatTextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f165066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f165067h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.internalDelegateLargeSliderLoading_startLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (AppCompatTextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.internalDelegateLargeSliderLoading_midLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165066g = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.internalDelegateLargeSliderLoading_endLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f165067h = (AppCompatTextView) viewFindViewById3;
    }
}
