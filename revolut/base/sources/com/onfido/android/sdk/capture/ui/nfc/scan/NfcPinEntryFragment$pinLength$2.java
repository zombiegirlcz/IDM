package com.onfido.android.sdk.capture.ui.nfc.scan;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class NfcPinEntryFragment$pinLength$2 extends u implements Function0<Integer> {
    final /* synthetic */ NfcPinEntryFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcPinEntryFragment$pinLength$2(NfcPinEntryFragment nfcPinEntryFragment) {
        super(0);
        this.this$0 = nfcPinEntryFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Integer invoke() {
        return Integer.valueOf(this.this$0.requireArguments().getInt("pin_length"));
    }
}
