package com.fourthline.vision.internal;

import com.fourthline.vision.document.DocumentScannerConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public abstract class a5 implements e4m.e {
    public static pe a(o3 o3Var, DocumentScannerConfig documentScannerConfig, Map map) {
        pe peVarProvideVisionDocumentAnalyticsContext = o3Var.provideVisionDocumentAnalyticsContext(documentScannerConfig, map);
        vc.s.k(peVarProvideVisionDocumentAnalyticsContext);
        return peVarProvideVisionDocumentAnalyticsContext;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
