package com.revolut.core.ui_kit.click.animator.ripple;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import fp0.i;
import hp0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/click/animator/ripple/UIKitRippleDrawable;", "Landroid/graphics/drawable/RippleDrawable;", "Lhp0/a;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UIKitRippleDrawable extends RippleDrawable implements a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIKitRippleDrawable(Context context, ColorStateList colorStateList, Drawable drawable, Drawable drawable2, Integer num) {
        super(colorStateList, drawable, drawable2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(colorStateList, "colorStateList");
        if (num != null) {
            setId(0, num.intValue());
        }
    }

    @Override // hp0.a
    public final Drawable b() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UIKitRippleDrawable(Context context, i surface, Drawable drawable, Drawable drawable2, Integer num) {
        this(context, surface.c(context), drawable, drawable2, num);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(surface, "surface");
    }
}
