package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerConfig;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ub implements e4m.e {
    public static ne a(bb bbVar, SelfieScannerConfig selfieScannerConfig, qa qaVar, hf hfVar) {
        ne neVarProvideSelfieAnalytics = bbVar.provideSelfieAnalytics(selfieScannerConfig, qaVar, hfVar);
        vc.s.k(neVarProvideSelfieAnalytics);
        return neVarProvideSelfieAnalytics;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
