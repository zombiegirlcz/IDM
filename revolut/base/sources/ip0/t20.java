package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.views.TagsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t20 extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UiKitMediaView f166422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f166423h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TagsView f166424j;
    public final ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final rr0.g f166425l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t20(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.productSelection_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.productSelection_media);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        UiKitMediaView uiKitMediaView = (UiKitMediaView) viewFindViewById2;
        this.f166422g = uiKitMediaView;
        View viewFindViewById3 = itemView.findViewById(R$id.productSelection_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166423h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.productSelection_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.productSelection_tagsView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f166424j = (TagsView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.productSelection_arrowImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (ImageView) viewFindViewById6;
        this.f166425l = vc.s.d(this, new nq0.e(itemView), null, 12);
        uiKitMediaView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
        uiKitMediaView.setVideoScaleType(oz0.b.CENTER_CROP);
    }
}
