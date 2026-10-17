package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.BadgesPanel;
import com.revolut.core.ui_kit.internal.views.RatingCell;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d70 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f163851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f163852h;
    public final RatingCell i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BadgesPanel f163853j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d70(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.propertyCard_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.propertyCard_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163851g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.propertyCard_subtitleImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f163852h = (ImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.propertyCard_rating);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        RatingCell ratingCell = (RatingCell) viewFindViewById4;
        this.i = ratingCell;
        View viewFindViewById5 = itemView.findViewById(R$id.propertyCard_badges);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f163853j = (BadgesPanel) viewFindViewById5;
        ratingCell.setEditable$ui_kit_components_release(false);
    }
}
