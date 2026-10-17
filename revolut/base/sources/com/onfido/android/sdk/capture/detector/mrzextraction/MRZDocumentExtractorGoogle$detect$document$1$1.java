package com.onfido.android.sdk.capture.detector.mrzextraction;

import com.google.mlkit.vision.text.Text;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/google/mlkit/vision/text/Text$Line;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class MRZDocumentExtractorGoogle$detect$document$1$1 extends u implements Function1<Text.Line, CharSequence> {
    public static final MRZDocumentExtractorGoogle$detect$document$1$1 INSTANCE = new MRZDocumentExtractorGoogle$detect$document$1$1();

    public MRZDocumentExtractorGoogle$detect$document$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull Text.Line it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        String strJ = it8.j();
        Intrinsics.checkNotNullExpressionValue(strJ, "getText(...)");
        return strJ;
    }
}
