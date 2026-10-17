package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerWarning;
import java.util.List;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class m6 implements q7 {
    @Override // com.fourthline.vision.internal.q7
    public /* bridge */ /* synthetic */ Object process(Object obj2, Continuation continuation) {
        return process((List<? extends h6>) obj2, (Continuation<? super List<? extends SelfieScannerWarning>>) continuation);
    }

    @Override // com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public /* bridge */ void start() {
        super.start();
    }

    @Override // com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public /* bridge */ void stop() {
        super.stop();
    }

    public Object process(@NotNull List<? extends h6> list, @NotNull Continuation<? super List<? extends SelfieScannerWarning>> continuation) {
        return list.isEmpty() ? zhm.u.c(SelfieScannerWarning.FACE_NOT_DETECTED) : zhm.f0.f322471a;
    }
}
