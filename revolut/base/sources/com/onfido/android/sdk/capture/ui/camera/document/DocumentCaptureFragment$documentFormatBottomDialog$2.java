package com.onfido.android.sdk.capture.ui.camera.document;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class DocumentCaptureFragment$documentFormatBottomDialog$2 extends u implements Function0<BottomSheetDialog> {
    final /* synthetic */ DocumentCaptureFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentCaptureFragment$documentFormatBottomDialog$2(DocumentCaptureFragment documentCaptureFragment) {
        super(0);
        this.this$0 = documentCaptureFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final BottomSheetDialog invoke() {
        return new BottomSheetDialog(this.this$0.requireContext());
    }
}
