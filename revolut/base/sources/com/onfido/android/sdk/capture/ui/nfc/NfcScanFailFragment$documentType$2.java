package com.onfido.android.sdk.capture.ui.nfc;

import com.onfido.android.sdk.capture.DocumentType;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/onfido/android/sdk/capture/DocumentType;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class NfcScanFailFragment$documentType$2 extends u implements Function0<DocumentType> {
    final /* synthetic */ NfcScanFailFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcScanFailFragment$documentType$2(NfcScanFailFragment nfcScanFailFragment) {
        super(0);
        this.this$0 = nfcScanFailFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final DocumentType invoke() {
        Serializable serializable = this.this$0.requireArguments().getSerializable("document_type_key");
        Intrinsics.i(serializable, "null cannot be cast to non-null type com.onfido.android.sdk.capture.DocumentType");
        return (DocumentType) serializable;
    }
}
