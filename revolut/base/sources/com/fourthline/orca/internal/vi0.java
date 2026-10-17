package com.fourthline.orca.internal;

import com.fourthline.vision.selfie.SelfieScannerError;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class vi0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(SelfieScannerError selfieScannerError) {
        String lowerCase = selfieScannerError.toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
