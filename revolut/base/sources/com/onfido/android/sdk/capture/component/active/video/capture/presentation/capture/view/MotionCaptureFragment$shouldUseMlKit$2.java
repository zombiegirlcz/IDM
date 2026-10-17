package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class MotionCaptureFragment$shouldUseMlKit$2 extends u implements Function0<Boolean> {
    final /* synthetic */ MotionCaptureFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionCaptureFragment$shouldUseMlKit$2(MotionCaptureFragment motionCaptureFragment) {
        super(0);
        this.this$0 = motionCaptureFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0.requireArguments().getBoolean("should_use_mlkit"));
    }
}
