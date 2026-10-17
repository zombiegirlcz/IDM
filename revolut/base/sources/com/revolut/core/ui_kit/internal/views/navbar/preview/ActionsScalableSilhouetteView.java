package com.revolut.core.ui_kit.internal.views.navbar.preview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/navbar/preview/ActionsScalableSilhouetteView;", "Lcom/revolut/core/ui_kit/internal/views/navbar/preview/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "f", "F", "getOriginalHeight", "()F", "originalHeight", "g", "getScalablePaddingBottom", "scalablePaddingBottom", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActionsScalableSilhouetteView extends a {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final float originalHeight;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final float scalablePaddingBottom;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionsScalableSilhouetteView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.revolut.core.ui_kit.internal.views.navbar.preview.a
    public float getOriginalHeight() {
        return this.originalHeight;
    }

    @Override // com.revolut.core.ui_kit.internal.views.navbar.preview.a
    public float getScalablePaddingBottom() {
        return this.scalablePaddingBottom;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float viewScale = getViewScale() * (getOriginalHeight() / 2.0f);
        float width = getWidth() - ((getViewScale() * getScalablePaddingRight()) + viewScale);
        float viewScale2 = (getViewScale() * getScalablePaddingLeft()) + viewScale;
        float f = (width - viewScale2) / 3;
        float viewScale3 = getViewScale() * (getOriginalHeight() / 2.0f);
        canvas.drawCircle(viewScale2, viewScale3, viewScale, getSilhouettePaint());
        canvas.drawCircle(viewScale2 + f, viewScale3, viewScale, getSilhouettePaint());
        canvas.drawCircle(width - f, viewScale3, viewScale, getSilhouettePaint());
        canvas.drawCircle(width, viewScale3, viewScale, getSilhouettePaint());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionsScalableSilhouetteView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionsScalableSilhouetteView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.originalHeight = kli.a.l(context, 24.0f);
        this.scalablePaddingBottom = kli.a.l(context, 12.0f);
    }

    public /* synthetic */ ActionsScalableSilhouetteView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
