package com.onfido.android.sdk.capture.internal.ui.overlay;

import android.content.res.Resources;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.CaptureType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class OverlayViewPositionHelper$rectangleTopMargin$2 extends u implements Function0<Float> {
    final /* synthetic */ OverlayViewPositionHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayViewPositionHelper$rectangleTopMargin$2(OverlayViewPositionHelper overlayViewPositionHelper) {
        super(0);
        this.this$0 = overlayViewPositionHelper;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Float invoke() {
        Resources resources;
        int i;
        if (this.this$0.captureType == CaptureType.DOCUMENT) {
            resources = this.this$0.context.getResources();
            i = R.dimen.onfido_document_capture_rectangle_top_margin;
        } else {
            resources = this.this$0.context.getResources();
            i = R.dimen.onfido_face_capture_rectangle_top_margin;
        }
        return Float.valueOf(resources.getDimension(i));
    }
}
