package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public abstract class kc implements e4m.e {
    public static hf a(bb bbVar, SelfieScannerConfig selfieScannerConfig, Map map) {
        hf hfVarProvideVisionSelfieAnalyticsContext = bbVar.provideVisionSelfieAnalyticsContext(selfieScannerConfig, map);
        vc.s.k(hfVarProvideVisionSelfieAnalyticsContext);
        return hfVarProvideVisionSelfieAnalyticsContext;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
