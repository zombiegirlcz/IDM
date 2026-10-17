package com.onfido.android.sdk.capture.ui.camera;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.utils.ContextUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class OverlayView$videoStrokePaint$2 extends u implements Function0<Paint> {
    final /* synthetic */ OverlayView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayView$videoStrokePaint$2(OverlayView overlayView) {
        super(0);
        this.this$0 = overlayView;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Paint invoke() {
        Paint paint = new Paint();
        OverlayView overlayView = this.this$0;
        Context context = overlayView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        paint.setColor(ContextUtilsKt.colorFromAttr(context, R.attr.onfidoColorContentMainDark));
        paint.setStyle(Paint.Style.STROKE);
        Intrinsics.checkNotNullExpressionValue(overlayView.getContext(), "getContext(...)");
        paint.setStrokeWidth(ContextUtilsKt.dimenInt(r2, R.dimen.onfido_liveness_face_detected_oval_stroke_width));
        paint.setAntiAlias(true);
        paint.setPathEffect(new DashPathEffect(new float[]{overlayView.getOvalDashLength(), overlayView.getOvalDashLength()}, BitmapDescriptorFactory.HUE_RED));
        return paint;
    }
}
