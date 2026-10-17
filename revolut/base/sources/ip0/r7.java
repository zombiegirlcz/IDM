package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.views.TagsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r7 extends koi.b implements qq0.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinearLayout f166127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TagView f166128h;
    public TagsView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.cellDetailsList_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.cellDetailsList_titleValuesContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166127g = (LinearLayout) viewFindViewById2;
    }

    @Override // qq0.b
    public final View k() {
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            return imageView;
        }
        return null;
    }
}
