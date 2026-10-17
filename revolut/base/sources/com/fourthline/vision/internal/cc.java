package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerConfig;

/* JADX INFO: loaded from: classes23.dex */
public abstract class cc implements e4m.e {
    public static xc a(bb bbVar, SelfieScannerConfig selfieScannerConfig, td tdVar, td tdVar2, td tdVar3, td tdVar4) {
        xc xcVarProvideStepsDataSource = bbVar.provideStepsDataSource(selfieScannerConfig, tdVar, tdVar2, tdVar3, tdVar4);
        vc.s.k(xcVarProvideStepsDataSource);
        return xcVarProvideStepsDataSource;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
