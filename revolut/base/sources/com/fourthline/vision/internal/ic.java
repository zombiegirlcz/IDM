package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerConfig;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ic implements e4m.e {
    public static k8 a(bb bbVar, a9 a9Var, SelfieScannerConfig selfieScannerConfig) {
        k8 k8VarProvideVideoIntervalDataSource = bbVar.provideVideoIntervalDataSource(a9Var, selfieScannerConfig);
        vc.s.k(k8VarProvideVideoIntervalDataSource);
        return k8VarProvideVideoIntervalDataSource;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
