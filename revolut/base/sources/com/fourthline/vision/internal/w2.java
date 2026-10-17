package com.fourthline.vision.internal;

import com.google.mlkit.vision.text.Text;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface w2 {
    void onBarcodeDetected(@NotNull List<? extends fh.a> list);

    void onTextDetected(@NotNull Text text);
}
