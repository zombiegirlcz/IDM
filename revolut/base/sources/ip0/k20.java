package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k20 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f164944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f164945h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f164946j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f164947l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TagView f164948m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final UiKitMediaView f164949n;
    public final View o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f164950p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fp0.p f164951q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k20(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.planTile_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.planTile_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164944g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.planTile_titleImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164945h = (ImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.planTile_caption);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById4;
        this.i = textView;
        View viewFindViewById5 = itemView.findViewById(R$id.planTile_amountDescription);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f164946j = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.planTile_endText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.planTile_endTextDescription);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f164947l = (TextView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.planTile_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f164948m = (TagView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.planTile_backgroundMedia);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f164949n = (UiKitMediaView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.planTile_gradient);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.o = viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(R$id.planTile_foregroundRipple);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f164950p = viewFindViewById11;
        fp0.p.Companion.getClass();
        this.f164951q = fp0.m.a(textView, gp0.b.f145198a);
    }
}
