package com.onfido.android.sdk.capture.detector.mrzextraction;

import com.google.mlkit.vision.text.TextRecognizer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/mlkit/vision/text/TextRecognizer;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class MRZDocumentExtractorGoogle$textRecognizer$2 extends u implements Function0<TextRecognizer> {
    final /* synthetic */ MRZDocumentExtractorGoogle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MRZDocumentExtractorGoogle$textRecognizer$2(MRZDocumentExtractorGoogle mRZDocumentExtractorGoogle) {
        super(0);
        this.this$0 = mRZDocumentExtractorGoogle;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final TextRecognizer invoke() {
        return this.this$0.textRecognizerProvider.provide();
    }
}
