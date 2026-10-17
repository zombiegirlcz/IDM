package com.onfido.android.sdk.capture.ui.camera;

import com.onfido.android.sdk.capture.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class OverlayView$ovalDashLength$2 extends u implements Function0<Float> {
    final /* synthetic */ OverlayView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayView$ovalDashLength$2(OverlayView overlayView) {
        super(0);
        this.this$0 = overlayView;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Float invoke() {
        return Float.valueOf(this.this$0.getResources().getDimensionPixelSize(R.dimen.onfido_liveness_face_detection_oval_dash_length));
    }
}
