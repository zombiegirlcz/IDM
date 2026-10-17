package com.onfido.android.sdk.capture.ui.nfc.scan;

import android.content.Context;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.utils.CountryCode;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class NfcScanFragment$nfcScanBottomDialog$2 extends u implements Function0<NfcScanBottomDialog> {
    final /* synthetic */ NfcScanFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcScanFragment$nfcScanBottomDialog$2(NfcScanFragment nfcScanFragment) {
        super(0);
        this.this$0 = nfcScanFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final NfcScanBottomDialog invoke() {
        Context contextRequireContext = this.this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Serializable serializable = this.this$0.requireArguments().getSerializable("document_type_key");
        Intrinsics.i(serializable, "null cannot be cast to non-null type com.onfido.android.sdk.capture.DocumentType");
        CountryCode countryCode = (CountryCode) this.this$0.requireArguments().getSerializable("country_code_key");
        NfcScanFragment nfcScanFragment = this.this$0;
        return new NfcScanBottomDialog(contextRequireContext, (DocumentType) serializable, countryCode, nfcScanFragment, nfcScanFragment.getAnnouncementService$onfido_capture_sdk_core_release(), this.this$0.getNfcViewModel().getInstructionVideoPath(false));
    }
}
