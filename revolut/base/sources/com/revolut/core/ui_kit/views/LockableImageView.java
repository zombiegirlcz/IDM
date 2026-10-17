package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.imageview.ShapeableImageView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/revolut/core/ui_kit/views/LockableImageView;", "Lcom/google/android/material/imageview/ShapeableImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/views/LockableImageView$b;", "state", "", "setState", "(Lcom/revolut/core/ui_kit/views/LockableImageView$b;)V", "Companion", "b", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LockableImageView extends ShapeableImageView {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ColorMatrixColorFilter f58755r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Drawable f58756t;
    public final ColorStateList u;

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f58757a = new a();

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.LockableImageView$b$b, reason: collision with other inner class name */
        public static final class C0440b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0440b f58758a = new C0440b();

            private C0440b() {
            }
        }

        private b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LockableImageView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setState(@NotNull b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (Intrinsics.f(state, b.a.f58757a)) {
            setColorFilter((ColorFilter) null);
            setForeground(null);
        } else {
            if (!Intrinsics.f(state, b.C0440b.f58758a)) {
                throw new NoWhenBranchMatchedException();
            }
            setColorFilter(this.f58755r);
            setForeground(this.f58756t);
            setForegroundGravity(17);
            setForegroundTintList(this.u);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LockableImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockableImageView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(BitmapDescriptorFactory.HUE_RED);
        this.f58755r = new ColorMatrixColorFilter(colorMatrix);
        this.f58756t = context.getDrawable(R$drawable.uikit_icn_24_lock_closed);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorWhite, context));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        this.u = colorStateListValueOf;
    }

    public /* synthetic */ LockableImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
