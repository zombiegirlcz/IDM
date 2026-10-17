package com.revolut.core.ui_kit.views.navbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import aw0.v1;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\r2\b\b\u0001\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/NavBarNavigationButtonView;", "Landroidx/appcompat/widget/AppCompatImageButton;", "Lur0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Law0/v1;", "colorScheme", "", "setReflectiveSurfaceColorScheme", "(Law0/v1;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "color", "setBackgroundColor", "(I)V", "setDrawableTint", "", "enabled", "setReflectiveOuterBorderEnabled$ui_kit_components_release", "(Z)V", "setReflectiveOuterBorderEnabled", "Lfp0/p;", "g", "Lfp0/p;", "getClickHandler", "()Lfp0/p;", "clickHandler", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NavBarNavigationButtonView extends AppCompatImageButton implements ur0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f59311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f59312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59313c;
    public v1 d;
    public Integer e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final fp0.p clickHandler;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavBarNavigationButtonView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setReflectiveSurfaceColorScheme(v1 colorScheme) {
        Drawable background = getBackground();
        RoundedBackgroundDrawable roundedBackgroundDrawable = background instanceof RoundedBackgroundDrawable ? (RoundedBackgroundDrawable) background : null;
        if (roundedBackgroundDrawable != null) {
            roundedBackgroundDrawable.a(colorScheme);
        }
        invalidate();
    }

    public final void a(RoundedBackgroundDrawable roundedBackgroundDrawable) {
        int i = this.f;
        Integer num = this.e;
        roundedBackgroundDrawable.d(i, num != null ? num.intValue() : roundedBackgroundDrawable.d);
    }

    public final void b() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorForeground, context);
        this.f = iS;
        this.e = null;
        rd0.e.q(this, Integer.valueOf(iS));
        RoundedBackgroundDrawable.Companion companion = RoundedBackgroundDrawable.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        RoundedBackgroundDrawable roundedBackgroundDrawableB = RoundedBackgroundDrawable.Companion.b(companion, context2, this.f, 4);
        roundedBackgroundDrawableB.q(this.f59313c);
        setBackground(roundedBackgroundDrawableB);
        a(roundedBackgroundDrawableB);
    }

    public final void c() {
        if ((getBackground() instanceof RoundedBackgroundDrawable) || getDrawable() == null) {
            return;
        }
        RoundedBackgroundDrawable.Companion companion = RoundedBackgroundDrawable.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RoundedBackgroundDrawable roundedBackgroundDrawableB = RoundedBackgroundDrawable.Companion.b(companion, context, this.f, 4);
        setBackground(roundedBackgroundDrawableB);
        roundedBackgroundDrawableB.q(this.f59313c);
        a(roundedBackgroundDrawableB);
    }

    @NotNull
    public final fp0.p getClickHandler() {
        return this.clickHandler;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f59312b) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float f = this.f59311a;
        int iK = kli.a.k(context, f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = iK;
        layoutParams.height = iK;
        setLayoutParams(layoutParams);
        int i = ((int) (f - 24)) / 2;
        setPaddingRelative(i, i, i, i);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        or0.u.z(this, kli.a.k(context2, 16.0f), 0, 0, 0, false, 30);
        this.f59312b = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        if (this.d == colorScheme) {
            return;
        }
        this.d = colorScheme;
        if (((Boolean) jo0.g.D.getValue()).booleanValue()) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iS = kli.a.s(colorScheme.a(), context);
            setReflectiveSurfaceColorScheme(colorScheme);
            setDrawableTint(iS);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        Integer num = this.e;
        if (num != null && color == num.intValue()) {
            return;
        }
        this.e = Integer.valueOf(color);
        c();
        Drawable background = getBackground();
        RoundedBackgroundDrawable roundedBackgroundDrawable = background instanceof RoundedBackgroundDrawable ? (RoundedBackgroundDrawable) background : null;
        if (roundedBackgroundDrawable != null) {
            a(roundedBackgroundDrawable);
        }
    }

    public final void setDrawableTint(int color) {
        if (color == this.f) {
            return;
        }
        this.f = color;
        rd0.e.q(this, Integer.valueOf(color));
        Drawable background = getBackground();
        RoundedBackgroundDrawable roundedBackgroundDrawable = background instanceof RoundedBackgroundDrawable ? (RoundedBackgroundDrawable) background : null;
        if (roundedBackgroundDrawable != null) {
            a(roundedBackgroundDrawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        rd0.e.q(this, Integer.valueOf(this.f));
        c();
    }

    public final void setReflectiveOuterBorderEnabled$ui_kit_components_release(boolean enabled) {
        this.f59313c = enabled;
        c();
        Drawable background = getBackground();
        RoundedBackgroundDrawable roundedBackgroundDrawable = background instanceof RoundedBackgroundDrawable ? (RoundedBackgroundDrawable) background : null;
        if (roundedBackgroundDrawable != null) {
            roundedBackgroundDrawable.q(enabled);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavBarNavigationButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarNavigationButtonView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f59311a = 44.0f;
        this.f59313c = true;
        this.f = kli.a.s(R$attr.uikit_colorForeground, context);
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(0);
        mVar.getClass();
        this.clickHandler = fp0.m.a(this, gVar);
        setTag(R$id.internal_is_nav_bar_navigation_button, Boolean.TRUE);
    }

    public /* synthetic */ NavBarNavigationButtonView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
