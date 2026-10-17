package ip0;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e7 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f164028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f164029h;
    public final TagView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.cellDetailsHeadline_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.cellDetailsHeadline_headline);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164028g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.cellDetailsHeadline_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164029h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.cellDetailsHeadline_badge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TagView) viewFindViewById4;
    }
}
