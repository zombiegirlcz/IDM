package com.onfido.android.sdk.capture.ui.proofOfAddress.host;

import android.content.Context;
import com.onfido.android.sdk.capture.common.SdkController;
import com.onfido.android.sdk.capture.ui.proofOfAddress.di.PoaComponent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/di/PoaComponent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class PoaHostFragment$poaComponent$2 extends u implements Function0<PoaComponent> {
    final /* synthetic */ PoaHostFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoaHostFragment$poaComponent$2(PoaHostFragment poaHostFragment) {
        super(0);
        this.this$0 = poaHostFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final PoaComponent invoke() {
        SdkController companion = SdkController.INSTANCE.getInstance();
        Context contextRequireContext = this.this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return SdkController.getSdkComponent$default(companion, contextRequireContext, null, 2, null).poaComponentFactory$onfido_capture_sdk_core_release().create();
    }
}
