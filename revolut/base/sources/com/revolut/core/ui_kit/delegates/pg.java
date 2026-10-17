package com.revolut.core.ui_kit.delegates;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.internal.drawables.StaticBorderGradientDrawable;
import com.revolut.core.ui_kit.internal.views.CircleProgressBar;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.internal.views.stories.StoriesHorizontalStepsProgressView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.timer.CountDownTextView;
import com.revolut.core.ui_kit.views.BadgeStatusView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class pg extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f54596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f54597h;
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f54598j;
    public final UiKitMediaView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f54599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final StoriesHorizontalStepsProgressView f54600m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SmallActionButton f54601n;
    public final ImageView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f54602p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CircleProgressBar f54603q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ConstraintLayout f54604r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CountDownTextView f54605s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final BadgeStatusView f54606t;
    public final TagView u;
    public StaticBorderGradientDrawable v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Float f54607w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f54608x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float[] f54609y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f54596g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById3;
        this.f54597h = textView;
        View viewFindViewById4 = itemView.findViewById(R$id.smallCard_descriptionContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.descriptionIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById5;
        this.f54598j = imageView;
        View viewFindViewById6 = itemView.findViewById(R$id.backgroundImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        UiKitMediaView uiKitMediaView = (UiKitMediaView) viewFindViewById6;
        this.k = uiKitMediaView;
        View viewFindViewById7 = itemView.findViewById(R$id.backgroundImageGradientOverlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f54599l = viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.horizontalProgress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f54600m = (StoriesHorizontalStepsProgressView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.action);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f54601n = (SmallActionButton) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.smallCard_topRightIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.o = (ImageView) viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(R$id.topRightText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f54602p = (TextView) viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(R$id.imageProgress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f54603q = (CircleProgressBar) viewFindViewById12;
        View viewFindViewById13 = itemView.findViewById(R$id.constraintLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.f54604r = (ConstraintLayout) viewFindViewById13;
        View viewFindViewById14 = itemView.findViewById(R$id.smallCard_countDown);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.f54605s = (CountDownTextView) viewFindViewById14;
        View viewFindViewById15 = itemView.findViewById(R$id.smallCard_topLeftBadge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        this.f54606t = (BadgeStatusView) viewFindViewById15;
        View viewFindViewById16 = itemView.findViewById(R$id.smallCard_topLeftTag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        this.u = (TagView) viewFindViewById16;
        this.f54608x = new int[]{0, 0, io0.a.b(0.2f, -1), io0.a.b(0.75f, -1)};
        this.f54609y = new float[]{BitmapDescriptorFactory.HUE_RED, 0.4f, 0.65f, 1.0f};
        uiKitMediaView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
        uiKitMediaView.setVideoScaleType(oz0.b.CENTER_CROP);
        textView.setAlpha(0.8f);
        imageView.setAlpha(0.8f);
    }

    public final boolean F() {
        return this.f54597h.getVisibility() == 8 && this.f54598j.getVisibility() == 8 && this.i.getVisibility() == 8 && this.f54605s.getVisibility() == 8;
    }

    public final void H(SmallCardDelegate.Model data) {
        StaticBorderGradientDrawable staticBorderGradientDrawable;
        qv0.h hVarA;
        boolean z;
        Intrinsics.checkNotNullParameter(data, "data");
        SmallCardDelegate.c cVar = data.f53363n;
        boolean z3 = cVar instanceof SmallCardDelegate.c.a;
        SmallCardDelegate.c.b bVar = SmallCardDelegate.c.b.f53376a;
        if (z3) {
            staticBorderGradientDrawable = null;
        } else {
            if (!Intrinsics.f(cVar, bVar)) {
                throw new NoWhenBranchMatchedException();
            }
            Object obj2 = data.f53366r;
            qv0.a aVar = obj2 instanceof qv0.a ? (qv0.a) obj2 : null;
            float fA = (aVar == null || (hVarA = aVar.a()) == null) ? BitmapDescriptorFactory.HUE_RED : hVarA.a();
            staticBorderGradientDrawable = this.v;
            if (staticBorderGradientDrawable == null || !Intrinsics.d(this.f54607w, fA)) {
                staticBorderGradientDrawable = new StaticBorderGradientDrawable(new dr0.r(com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", fA), com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 2.0f)), this.f54608x, this.f54609y, GradientDrawable.Orientation.BL_TR);
                this.v = staticBorderGradientDrawable;
                this.f54607w = Float.valueOf(fA);
            }
        }
        this.f54604r.setForeground(staticBorderGradientDrawable);
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        boolean z4 = cVar instanceof SmallCardDelegate.c.a;
        boolean z6 = true;
        if (z4) {
            z = ((SmallCardDelegate.c.a) cVar).f53375a;
        } else {
            if (!Intrinsics.f(cVar, bVar)) {
                throw new NoWhenBranchMatchedException();
            }
            z = true;
        }
        if (z4) {
            z6 = false;
        } else if (!Intrinsics.f(cVar, bVar)) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter(itemView, "<this>");
        if (pd.b.l(itemView).a(z ? new gq0.k(z6) : null)) {
            itemView.sendAccessibilityEvent(2048);
        }
    }
}
