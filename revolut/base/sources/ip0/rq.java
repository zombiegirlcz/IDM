package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.InputDualTextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class rq extends koi.b {
    public final tr f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tr f166225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InputDualTextView f166226h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq(InputDualTextView itemView, tr inputViewHolder1, tr inputViewHolder2) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(inputViewHolder1, "inputViewHolder1");
        Intrinsics.checkNotNullParameter(inputViewHolder2, "inputViewHolder2");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = inputViewHolder1;
        this.f166225g = inputViewHolder2;
        View viewFindViewById = itemView.findViewById(R$id.inputDualText_input);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f166226h = (InputDualTextView) viewFindViewById;
    }
}
