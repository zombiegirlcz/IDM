package ip0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.NewBadgeView;
import com.revolut.core.ui_kit.internal.views.navbar.preview.WallpaperPreviewView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class bl0 extends koi.b {
    public final WallpaperPreviewView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f163623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f163624h;
    public final NewBadgeView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f163625j;
    public final AppCompatImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MaterialShapeDrawable f163626l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl0(Context parentContext, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(parentContext, "parentContext");
        View viewFindViewById = itemView.findViewById(R$id.thumbnailPreview_wallpaper);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        WallpaperPreviewView wallpaperPreviewView = (WallpaperPreviewView) viewFindViewById;
        this.f = wallpaperPreviewView;
        View viewFindViewById2 = itemView.findViewById(R$id.thumbnailPreview_selectionView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163623g = viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.thumbnailPreview_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById3;
        this.f163624h = textView;
        View viewFindViewById4 = itemView.findViewById(R$id.thumbnailPreview_badge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (NewBadgeView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.thumbnailPreview_lockedStateOverlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f163625j = viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.thumbnailPreview_lockedStateIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewFindViewById6;
        this.k = appCompatImageView;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(io0.a.d(0.7f, kli.a.s(R$attr.uikit_colorBackground, context))));
        this.f163626l = materialShapeDrawable;
        ShapeAppearanceModel shapeAppearanceModel = new ShapeAppearanceModel();
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ShapeAppearanceModel shapeAppearanceModelWithCornerSize = shapeAppearanceModel.withCornerSize(kli.a.l(context2, 16.0f));
        Intrinsics.checkNotNullExpressionValue(shapeAppearanceModelWithCornerSize, "withCornerSize(...)");
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(shapeAppearanceModelWithCornerSize);
        materialShapeDrawable2.setStroke(r6.b.a(itemView, "getContext(...)", 2.0f), kli.a.s(R$attr.uikit_colorAccent, parentContext));
        materialShapeDrawable2.setFillColor(ColorStateList.valueOf(0));
        viewFindViewById2.setBackground(materialShapeDrawable2);
        viewFindViewById5.setBackground(materialShapeDrawable);
        Context context3 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        appCompatImageView.setImageTintList(ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorAccentNeutral, context3)));
        wallpaperPreviewView.f57425h.subscribe(new fg0(new w10(this, 20), 15));
        textView.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, parentContext));
    }
}
