package com.revolut.core.ui_kit.internal.views.navbar.preview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.view.ContextThemeWrapper;
import aw0.x8;
import bq7.j;
import bs9.i0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.internal.views.navbar.WallpaperAssetOverlayDrawable;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.core.ui_kit_resources.R$attr;
import ihm.b;
import jh.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0012B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/navbar/preview/WallpaperPreviewView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "initialContext", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground;", "background", "", "setBackground", "(Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground;)V", "", "newScale", "setScale", "(F)V", "Lcom/revolut/core/ui_kit/views/navbar/WallpaperAssetSwitcher;", "a", "Lcom/revolut/core/ui_kit/views/navbar/WallpaperAssetSwitcher;", "getWallpaperAssetSwitcher", "()Lcom/revolut/core/ui_kit/views/navbar/WallpaperAssetSwitcher;", "wallpaperAssetSwitcher", "Companion", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WallpaperPreviewView extends FrameLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final WallpaperAssetSwitcher wallpaperAssetSwitcher;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WallpaperAssetOverlayDrawable f57422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f57423c;
    public final float d;
    public final int e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x8 f57424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f57425h;
    public final MaterialShapeDrawable i;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.navbar.preview.WallpaperPreviewView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WallpaperPreviewView(@NotNull Context initialContext, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(initialContext, "initialContext");
        Intrinsics.checkNotNullParameter(initialContext, "<this>");
        Context context = d.g(initialContext) ? initialContext : null;
        super(context == null ? new ContextThemeWrapper(initialContext, R$style.UiKitTheme_TransparentDayNight) : context, attributeSet);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        WallpaperAssetSwitcher wallpaperAssetSwitcher = new WallpaperAssetSwitcher(context2, null, 6);
        wallpaperAssetSwitcher.setId(R$id.internal_wallpaper_preview_asset_switcher);
        this.wallpaperAssetSwitcher = wallpaperAssetSwitcher;
        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        paintC.setColor(kli.a.s(R$attr.uikit_colorGreyTone10, context3));
        paintC.setStyle(Paint.Style.STROKE);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        paintC.setStrokeWidth(kli.a.l(context4, 2.0f));
        this.f57423c = paintC;
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.d = kli.a.l(context5, 20.0f);
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        this.e = kli.a.k(context6, 200.0f);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(new ShapeAppearanceModel());
        this.i = materialShapeDrawable;
        b bVarE = b.e(materialShapeDrawable.getShapeAppearanceModel());
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f57425h = bVarE;
        setBackground(materialShapeDrawable);
        setClipToOutline(true);
        addView(wallpaperAssetSwitcher, new FrameLayout.LayoutParams(-1, -1));
        wallpaperAssetSwitcher.h().subscribe(new i0(7, new j(this, 11)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        WallpaperAssetOverlayDrawable wallpaperAssetOverlayDrawable = this.f57422b;
        if (wallpaperAssetOverlayDrawable != null) {
            wallpaperAssetOverlayDrawable.draw(canvas);
        }
        float width = getWidth();
        float height = getHeight();
        float f = this.d * this.f;
        canvas.drawRoundRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height, f, f, this.f57423c);
    }

    @NotNull
    public final WallpaperAssetSwitcher getWallpaperAssetSwitcher() {
        return this.wallpaperAssetSwitcher;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        setScale(i / this.e);
        WallpaperAssetOverlayDrawable wallpaperAssetOverlayDrawable = this.f57422b;
        if (wallpaperAssetOverlayDrawable != null) {
            wallpaperAssetOverlayDrawable.setBounds(0, 0, i, i2 - getPaddingBottom());
        }
    }

    public final void setBackground(NavBarWithContainerBackground background) {
        this.wallpaperAssetSwitcher.setBackground(background, null);
    }

    public final void setScale(float newScale) {
        if (newScale == this.f) {
            return;
        }
        this.f = newScale;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        knm.b.v(kli.a.k(context, 92.0f * newScale), this);
        float f = this.d * newScale;
        MaterialShapeDrawable materialShapeDrawable = this.i;
        ShapeAppearanceModel shapeAppearanceModelBuild = materialShapeDrawable.getShapeAppearanceModel().toBuilder().setAllCornerSizes(f).build();
        Intrinsics.checkNotNullExpressionValue(shapeAppearanceModelBuild, "build(...)");
        this.f57425h.onNext(shapeAppearanceModelBuild);
        materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelBuild);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        WallpaperAssetOverlayDrawable wallpaperAssetOverlayDrawable = new WallpaperAssetOverlayDrawable(context2, 60.0f * newScale, newScale * 100.0f);
        wallpaperAssetOverlayDrawable.f57373j = true;
        wallpaperAssetOverlayDrawable.invalidateSelf();
        x8 x8Var = this.f57424g;
        wallpaperAssetOverlayDrawable.a(x8Var != null ? x8Var.d : null, false);
        this.f57422b = wallpaperAssetOverlayDrawable;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WallpaperPreviewView(@NotNull Context initialContext) {
        this(initialContext, null);
        Intrinsics.checkNotNullParameter(initialContext, "initialContext");
    }
}
