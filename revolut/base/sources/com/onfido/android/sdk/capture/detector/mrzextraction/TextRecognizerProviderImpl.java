package com.onfido.android.sdk.capture.detector.mrzextraction;

import com.google.mlkit.vision.text.TextRecognizer;
import g4i.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rh.f;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/detector/mrzextraction/TextRecognizerProviderImpl;", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/TextRecognizerProvider;", "()V", "provide", "Lcom/google/mlkit/vision/text/TextRecognizer;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextRecognizerProviderImpl implements TextRecognizerProvider {
    @Override // com.onfido.android.sdk.capture.detector.mrzextraction.TextRecognizerProvider
    @NotNull
    public TextRecognizer provide() {
        f fVarG = a.g(new th.a());
        Intrinsics.checkNotNullExpressionValue(fVarG, "getClient(...)");
        return fVarG;
    }
}
