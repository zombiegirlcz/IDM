package com.revolut.core.ui_kit.internal.drawables;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.revolut.core.ui_kit.drawables.RevolutDrawableWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/internal/drawables/BottomGradientDrawable;", "Lcom/revolut/core/ui_kit/drawables/RevolutDrawableWrapper;", "dr0/g", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BottomGradientDrawable extends RevolutDrawableWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f55941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f55942c;
    public ColorStateList d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomGradientDrawable(Context context) {
        super(null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f55940a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033 A[PHI: r4
      0x0033: PHI (r4v9 android.graphics.drawable.Drawable) = 
      (r4v5 android.graphics.drawable.Drawable)
      (r4v8 android.graphics.drawable.Drawable)
      (r4v11 android.graphics.drawable.Drawable)
      (r4v14 android.graphics.drawable.Drawable)
     binds: [B:26:0x003d, B:34:0x0054, B:13:0x001a, B:21:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(dr0.g r4) {
        /*
            r3 = this;
            r0 = -1
            if (r4 != 0) goto L5
            r4 = r0
            goto Ld
        L5:
            int[] r1 = dr0.h.f117051a
            int r4 = r4.ordinal()
            r4 = r1[r4]
        Ld:
            r1 = 0
            if (r4 == r0) goto L57
            r0 = 1
            android.content.Context r2 = r3.f55940a
            if (r4 == r0) goto L3b
            r0 = 2
            if (r4 != r0) goto L35
            android.graphics.drawable.Drawable r4 = r3.f55941b
            if (r4 != 0) goto L33
            int r4 = com.revolut.core.ui_kit_resources.R$drawable.uikit_bottom_button_gradient
            android.graphics.drawable.Drawable r4 = r2.getDrawable(r4)
            if (r4 == 0) goto L57
            android.graphics.drawable.Drawable r4 = r4.mutate()
            if (r4 == 0) goto L57
            android.content.res.ColorStateList r0 = r3.d
            if (r0 == 0) goto L31
            r4.setTintList(r0)
        L31:
            r3.f55941b = r4
        L33:
            r1 = r4
            goto L57
        L35:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L3b:
            android.graphics.drawable.Drawable r4 = r3.f55942c
            if (r4 != 0) goto L33
            int r4 = com.revolut.core.ui_kit_resources.R$drawable.uikit_bottom_container_gradient
            android.graphics.drawable.Drawable r4 = r2.getDrawable(r4)
            if (r4 == 0) goto L57
            android.graphics.drawable.Drawable r4 = r4.mutate()
            if (r4 == 0) goto L57
            android.content.res.ColorStateList r0 = r3.d
            if (r0 == 0) goto L54
            r4.setTintList(r0)
        L54:
            r3.f55942c = r4
            goto L33
        L57:
            android.graphics.drawable.Drawable r4 = r3.getDrawable()
            if (r4 == r1) goto L60
            r3.setDrawable(r1)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.drawables.BottomGradientDrawable.c(dr0.g):void");
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.d = colorStateList;
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }
}
