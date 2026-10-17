package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerConfig;

/* JADX INFO: loaded from: classes23.dex */
public abstract class jb implements e4m.e {
    public static m7 a(bb bbVar, SelfieScannerConfig selfieScannerConfig, e2 e2Var, j6 j6Var, e8 e8Var) {
        m7 m7VarProvideImageToFaceDetectionInteractor = bbVar.provideImageToFaceDetectionInteractor(selfieScannerConfig, e2Var, j6Var, e8Var);
        vc.s.k(m7VarProvideImageToFaceDetectionInteractor);
        return m7VarProvideImageToFaceDetectionInteractor;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
