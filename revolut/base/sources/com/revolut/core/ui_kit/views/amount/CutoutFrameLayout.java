package com.revolut.core.ui_kit.views.amount;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$styleable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nx0.j;
import nx0.k;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/views/amount/CutoutFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "nx0/j", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CutoutFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f58947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f58948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f58949c;
    public final float d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CutoutFrameLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float height;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Path path = this.f58947a;
        path.reset();
        int i = k.f220052a[this.f58948b.ordinal()];
        float f = this.d;
        if (i == 1) {
            height = -f;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            height = getHeight() + f;
        }
        path.addCircle(getWidth() / 2, height, this.f58949c, Path.Direction.CW);
        path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        canvas.clipPath(path);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CutoutFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutoutFrameLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        j jVar;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58947a = new Path();
        setWillNotDraw(false);
        if (attributeSet == null) {
            this.f58948b = j.BOTTOM;
            this.f58949c = BitmapDescriptorFactory.HUE_RED;
            this.d = BitmapDescriptorFactory.HUE_RED;
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.uikit_CutoutFrameLayout);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.uikit_CutoutFrameLayout_uikit_cutoutSide, 0);
            if (i2 == 0) {
                jVar = j.BOTTOM;
            } else if (i2 != 1) {
                jVar = j.BOTTOM;
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected cutout side: " + i2);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(c.ERROR, null, null, illegalArgumentException, h0Var);
            } else {
                jVar = j.TOP;
            }
            this.f58948b = jVar;
            this.f58949c = typedArrayObtainStyledAttributes.getDimension(R$styleable.uikit_CutoutFrameLayout_uikit_clipRadius, BitmapDescriptorFactory.HUE_RED);
            this.d = typedArrayObtainStyledAttributes.getDimension(R$styleable.uikit_CutoutFrameLayout_uikit_clipOffset, BitmapDescriptorFactory.HUE_RED);
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th10) {
            typedArrayObtainStyledAttributes.recycle();
            throw th10;
        }
    }

    public /* synthetic */ CutoutFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
