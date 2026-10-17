package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i20 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f164628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f164629h;
    public final ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f164630j;
    public final TagView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final UiKitMediaView f164631l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f164632m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i20(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.planLarge_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.planLarge_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164628g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.planLarge_caption);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164629h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.planLarge_endBottomIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (ImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.planLarge_foregroundRipple);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f164630j = viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.planLarge_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (TagView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.planLarge_backgroundView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        UiKitMediaView uiKitMediaView = (UiKitMediaView) viewFindViewById7;
        this.f164631l = uiKitMediaView;
        View viewFindViewById8 = itemView.findViewById(R$id.planLarge_gradient);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f164632m = viewFindViewById8;
        uiKitMediaView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
        uiKitMediaView.setVideoScaleType(oz0.b.CENTER_CROP);
    }
}
