package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import au0.o5;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 \u001e2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001fJ8\u0010\u000b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001c\u0010\n\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006H\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\t2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/revolut/core/ui_kit/views/BackgroundWallpaperView;", "Landroid/widget/FrameLayout;", "Lau0/o5;", "Lny0/h;", "Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground;", "background", "Lkotlin/Function1;", "Lyhm/m;", "Landroid/graphics/drawable/Drawable;", "", "onRenderResultAction", "setBackground", "(Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground;Lkotlin/jvm/functions/Function1;)V", "", "color", "setDefaultBackgroundColor", "(I)V", "backgroundDrawable", "setAverageColorAsBackground", "(Landroid/graphics/drawable/Drawable;)V", "", "enabled", "setScreenshotDrawingMode", "(Z)V", "getFitsReadableArea", "()Z", "fitsReadableArea", "getCurrentBackground", "()Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground;", "currentBackground", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BackgroundWallpaperView extends FrameLayout implements o5, ny0.h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WallpaperAssetSwitcher f58363a;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.BackgroundWallpaperView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackgroundWallpaperView(@NotNull Context context) {
        this(context, null, 6);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // au0.o5
    public NavBarWithContainerBackground getCurrentBackground() {
        return this.f58363a.getCurrentBackground();
    }

    @Override // ny0.h
    public boolean getFitsReadableArea() {
        return false;
    }

    public void setAverageColorAsBackground(Drawable backgroundDrawable) {
        this.f58363a.setAverageColorAsBackground(backgroundDrawable);
    }

    @Override // au0.o5
    public void setBackground(NavBarWithContainerBackground background, Function1<? super yhm.m<? extends Drawable>, Unit> onRenderResultAction) throws Throwable {
        this.f58363a.setBackground(background, onRenderResultAction);
    }

    public void setDefaultBackgroundColor(int color) {
        this.f58363a.setDefaultBackgroundColor(color);
    }

    public void setScreenshotDrawingMode(boolean enabled) {
        this.f58363a.setScreenshotDrawingMode(enabled);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackgroundWallpaperView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public BackgroundWallpaperView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        WallpaperAssetSwitcher wallpaperAssetSwitcher = new WallpaperAssetSwitcher(context, null, 6);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wallpaperAssetSwitcher, "wallpaperAssetSwitcher");
        super(context, attributeSet);
        this.f58363a = wallpaperAssetSwitcher;
        setTag(Integer.valueOf(R$id.internal_app_entry_wallpaper_tag));
        addView(wallpaperAssetSwitcher, new FrameLayout.LayoutParams(-1, -1));
        Drawable colorDrawable = new ColorDrawable(0);
        setForeground(colorDrawable);
        wallpaperAssetSwitcher.h().subscribe(new mv9.h(18, new mqi.a(colorDrawable, 24)));
    }
}
