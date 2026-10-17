package com.onfido.android.sdk.capture.ui.camera;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class CaptureUploadService$uploadDocumentVideo$1 extends q implements Function1<String, Unit> {
    public CaptureUploadService$uploadDocumentVideo$1(Object obj2) {
        super(1, 0, CaptureUploadServiceListener.class, obj2, "onDocumentVideoUploaded", "onDocumentVideoUploaded(Ljava/lang/String;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((String) obj2);
        return Unit.f186387a;
    }

    public final void invoke(@NotNull String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CaptureUploadServiceListener) this.receiver).onDocumentVideoUploaded(p0);
    }
}
