package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.m3;
import ms0.n3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/ProgressStepVerticalIndicatorView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProgressStepVerticalIndicatorView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m3 f56329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56331c;
    public final int d;
    public final Paint e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressStepVerticalIndicatorView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int i = n3.f208338a[this.f56329a.ordinal()];
        Paint paint = this.e;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            float width = getWidth();
            float height = getHeight();
            int i2 = this.d;
            canvas.drawRoundRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height, i2, i2, paint);
            return;
        }
        int height2 = getHeight();
        int i3 = this.f56330b;
        int i5 = this.f56331c;
        int i6 = i3 + i5;
        int i21 = height2 / i6;
        if (height2 % i6 >= i3) {
            i21++;
        }
        int height3 = (getHeight() - v0.a.a(i21, 1, i5, i21 * i3)) / 2;
        float f = i3 / 2.0f;
        for (int i22 = 0; i22 < i21; i22++) {
            canvas.drawCircle(f, ((i3 + i5) * i22) + f + height3, f, paint);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressStepVerticalIndicatorView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressStepVerticalIndicatorView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56329a = m3.LINE;
        this.f56330b = kli.a.k(context, 4.0f);
        this.f56331c = kli.a.k(context, 4.0f);
        this.d = kli.a.k(context, 2.0f);
        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        paintC.setStyle(Paint.Style.FILL);
        paintC.setColor(-16776961);
        this.e = paintC;
    }

    public /* synthetic */ ProgressStepVerticalIndicatorView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
