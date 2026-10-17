package ip0;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit.views.TagsView;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class nv extends koi.b {
    public final UiKitMediaView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f165571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f165572h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fp0.p f165573j;
    public final fp0.p k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fp0.p f165574l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ProgressBar f165575m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TagsView f165576n;
    public final OverlappedIconsView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FrameLayout f165577p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final FrameLayout f165578q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TagView f165579r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ImageView f165580s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f165581t;
    public final Guideline u;
    public final OverlappedIconsView v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.listingTile_backgroundMedia);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        UiKitMediaView uiKitMediaView = (UiKitMediaView) viewFindViewById;
        this.f = uiKitMediaView;
        View viewFindViewById2 = itemView.findViewById(R$id.listingTile_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165571g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.listingTile_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById3;
        this.f165572h = textView;
        View viewFindViewById4 = itemView.findViewById(R$id.listingTile_secondDescription);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById4;
        this.i = textView2;
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(fp0.b.f137017a);
        mVar.getClass();
        this.f165573j = fp0.m.a(itemView, gVar);
        gp0.b bVar = gp0.b.f145198a;
        this.k = fp0.m.a(textView, bVar);
        this.f165574l = fp0.m.a(textView2, bVar);
        View viewFindViewById5 = itemView.findViewById(R$id.listingTile_progressBar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f165575m = (ProgressBar) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.listingTile_topLeftTagsView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f165576n = (TagsView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.listingTile_topLeftImages);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.o = (OverlappedIconsView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.listingTile_topLeftItemContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f165577p = (FrameLayout) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.listingTile_topRightBadgeContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f165578q = (FrameLayout) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.listingTile_topRightBadge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f165579r = (TagView) viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(R$id.listingTile_topRightIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f165580s = (ImageView) viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(R$id.listingTile_backgroundImageOverlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f165581t = viewFindViewById12;
        View viewFindViewById13 = itemView.findViewById(R$id.listingTile_endOfText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.u = (Guideline) viewFindViewById13;
        View viewFindViewById14 = itemView.findViewById(R$id.listingTile_bottomRightImages);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.v = (OverlappedIconsView) viewFindViewById14;
        uiKitMediaView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
        uiKitMediaView.setVideoScaleType(oz0.b.CENTER_CROP);
        uiKitMediaView.setVideoShutter(VideoShutter.FadeIn.f60094a);
    }
}
