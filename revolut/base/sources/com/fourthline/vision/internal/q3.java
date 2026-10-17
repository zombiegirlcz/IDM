package com.fourthline.vision.internal;

import com.fourthline.vision.document.DocumentScannerConfig;

/* JADX INFO: loaded from: classes23.dex */
public abstract class q3 implements e4m.e {
    public static ne a(o3 o3Var, qa qaVar, qa qaVar2, DocumentScannerConfig documentScannerConfig, pe peVar) {
        ne neVarProvideDocumentAnalytics = o3Var.provideDocumentAnalytics(qaVar, qaVar2, documentScannerConfig, peVar);
        vc.s.k(neVarProvideDocumentAnalytics);
        return neVarProvideDocumentAnalytics;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
