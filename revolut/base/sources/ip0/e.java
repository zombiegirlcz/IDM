package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.layout.UIKitConstraintLayout;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends koi.b {
    public final UIKitConstraintLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f163982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f163983h;
    public final ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TagView f163984j;
    public final TextView k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (UIKitConstraintLayout) itemView;
        View viewFindViewById = itemView.findViewById(R$id.actionCard_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f163982g = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.actionCard_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163983h = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.actionCard_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById3;
        this.i = imageView;
        View viewFindViewById4 = itemView.findViewById(R$id.actionCard_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f163984j = (TagView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.actionCard_amount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.k = (TextView) viewFindViewById5;
        rd0.e.r(imageView, new yp0.o(yp0.n.FACTOR_80, 0));
    }
}
