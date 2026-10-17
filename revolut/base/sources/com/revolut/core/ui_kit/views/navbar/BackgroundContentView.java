package com.revolut.core.ui_kit.views.navbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.internal.views.navbar.WallpaperView;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tx0.d5;
import tx0.u2;
import tx0.x2;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0017B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/BackgroundContentView;", "Landroid/widget/FrameLayout;", "Ltx0/x2;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "offset", "", "setBackgroundOffset", "(I)V", "Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground;", "background", "setBackground", "(Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground;)V", "Ltx0/u2;", "listener", "setColorSchemeListener", "(Ltx0/u2;)V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BackgroundContentView extends FrameLayout implements x2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WallpaperView f59207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f59209c;
    public u2 d;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.navbar.BackgroundContentView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundContentView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        WallpaperView wallpaperView = new WallpaperView(context, null, null, false, 62);
        this.f59207a = wallpaperView;
        this.f59208b = kli.a.k(context, 24.0f);
        addView(wallpaperView, new FrameLayout.LayoutParams(-1, -1));
        wallpaperView.c();
    }

    @Override // tx0.x2
    public final void H(int i) {
    }

    @Override // tx0.x2
    public final ViewGroup.LayoutParams N(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ViewGroup.LayoutParams(-1, -2);
    }

    @Override // tx0.x2
    public final void d(float f, int i) {
        this.f59207a.d(f, i);
    }

    @Override // tx0.x2
    public final void d0(int i) {
        WallpaperView wallpaperView = this.f59207a;
        ViewGroup.LayoutParams layoutParams = wallpaperView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i2 = i + this.f59208b;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        layoutParams.height = d5.c(context) + i2;
        wallpaperView.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f59209c = this.f59207a.f57381b.h().subscribe(new twl.h(20, new tpl.o(this, 23)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ifm.c cVar = this.f59209c;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public final void setBackground(@NotNull NavBarWithContainerBackground background) {
        Intrinsics.checkNotNullParameter(background, "background");
        this.f59207a.setBackground(background, null);
    }

    @Override // tx0.x2
    public void setBackgroundOffset(int offset) {
        setClipChildren(offset == 0);
        this.f59207a.setOffset(offset);
    }

    @Override // tx0.x2
    public void setColorSchemeListener(@NotNull u2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.d = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackgroundContentView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
