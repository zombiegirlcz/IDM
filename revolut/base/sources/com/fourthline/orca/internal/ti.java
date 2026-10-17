package com.fourthline.orca.internal;

import com.fourthline.vision.document.DocumentScannerError;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ti {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(DocumentScannerError documentScannerError) {
        String strName = documentScannerError.name();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
