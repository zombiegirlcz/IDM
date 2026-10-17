package ip0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class en extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f164128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ViewGroup f164129h;
    public final ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TagView f164130j;
    public final TagView k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.highlightTile_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.highlightTile_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164128g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.highlightTile_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164129h = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.highlightTile_chevronIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (ImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.highlightTile_primaryBadge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f164130j = (TagView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.highlightTile_secondaryBadge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (TagView) viewFindViewById6;
    }
}
