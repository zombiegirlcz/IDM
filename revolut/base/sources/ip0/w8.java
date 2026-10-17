package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.TwoTextSwitcherView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w8 extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f166949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f166950h;
    public final TwoTextSwitcherView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SmallActionButton f166951j;
    public final SmallActionButton k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.cellIncrement_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.cellIncrement_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166949g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.cellIncrement_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166950h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.cellIncrement_value);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TwoTextSwitcherView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.cellIncrement_increment_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f166951j = (SmallActionButton) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.cellIncrement_decrement_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (SmallActionButton) viewFindViewById6;
    }
}
