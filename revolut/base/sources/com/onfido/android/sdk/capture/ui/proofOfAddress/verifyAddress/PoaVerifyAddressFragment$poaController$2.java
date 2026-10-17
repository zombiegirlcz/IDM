package com.onfido.android.sdk.capture.ui.proofOfAddress.verifyAddress;

import androidx.lifecycle.LifecycleOwner;
import com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaFlowController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaFlowController;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class PoaVerifyAddressFragment$poaController$2 extends u implements Function0<PoaFlowController> {
    final /* synthetic */ PoaVerifyAddressFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoaVerifyAddressFragment$poaController$2(PoaVerifyAddressFragment poaVerifyAddressFragment) {
        super(0);
        this.this$0 = poaVerifyAddressFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final PoaFlowController invoke() {
        LifecycleOwner parentFragment = this.this$0.getParentFragment();
        Intrinsics.i(parentFragment, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaFlowController");
        return (PoaFlowController) parentFragment;
    }
}
