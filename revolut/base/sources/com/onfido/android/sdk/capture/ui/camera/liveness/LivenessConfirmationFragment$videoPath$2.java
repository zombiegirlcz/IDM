package com.onfido.android.sdk.capture.ui.camera.liveness;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class LivenessConfirmationFragment$videoPath$2 extends u implements Function0<String> {
    final /* synthetic */ LivenessConfirmationFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivenessConfirmationFragment$videoPath$2(LivenessConfirmationFragment livenessConfirmationFragment) {
        super(0);
        this.this$0 = livenessConfirmationFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final String invoke() {
        String string = this.this$0.requireArguments().getString("VIDEO_PATH");
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
