package pq0;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.internal.views.CutoutShapeableImageView;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import ix0.l0;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends koi.b {
    public final CutoutShapeableImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CutoutImageView f238649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CircleBadgeView f238650h;
    public final AppCompatImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f238651j;
    public final GradientDrawable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l0 f238652l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.selectableIconDelegate_imageView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        CutoutShapeableImageView cutoutShapeableImageView = (CutoutShapeableImageView) viewFindViewById;
        this.f = cutoutShapeableImageView;
        View viewFindViewById2 = view.findViewById(R$id.selectableIconDelegate_progressBar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        CutoutImageView cutoutImageView = (CutoutImageView) viewFindViewById2;
        this.f238649g = cutoutImageView;
        View viewFindViewById3 = view.findViewById(R$id.selectableIconDelegate_badgeImageView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f238650h = (CircleBadgeView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.selectableIconDelegate_dot);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewFindViewById4;
        this.i = appCompatImageView;
        View viewFindViewById5 = view.findViewById(R$id.selectableIconDelegate_labelTextView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f238651j = (TextView) viewFindViewById5;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.k = gradientDrawable;
        this.f238652l = new l0((ViewGroup) view, v.k(cutoutShapeableImageView, cutoutImageView));
        cutoutImageView.setBackground(gradientDrawable);
        appCompatImageView.setImageResource(R$drawable.internal_icn_16_new_item);
    }
}
