package ip0;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.NewBadgeView;
import com.revolut.core.ui_kit.views.AvatarView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n9 extends koi.b {
    public final ConstraintLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AvatarView f165474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f165475h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final NewBadgeView f165476j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.centeredContentTile_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.centeredContentTile_avatar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165474g = (AvatarView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.centeredContentTile_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f165475h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.centeredContentTile_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.centeredContentTile_notification);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f165476j = (NewBadgeView) viewFindViewById5;
    }
}
