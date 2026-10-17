package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.CircleProgressBar;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class vx extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f166902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f166903h;
    public final ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TagView f166904j;
    public final TagView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CircleProgressBar f166905l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.newProduct_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.newProduct_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166902g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.newProduct_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166903h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.newProduct_productImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (ImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.newProduct_firstTag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f166904j = (TagView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.newProduct_secondTag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (TagView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.newProduct_imageProgress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f166905l = (CircleProgressBar) viewFindViewById7;
    }
}
