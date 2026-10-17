package com.fourthline.vision.internal;

import com.google.mlkit.vision.text.TextRecognizer;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes23.dex */
public abstract class w4 implements e4m.e {
    public static t5 a(o3 o3Var, na naVar, w5 w5Var, o7 o7Var, w7 w7Var, j3 j3Var, sa saVar, g8 g8Var, g8 g8Var2, l7 l7Var, ae aeVar, p9 p9Var, TextRecognizer textRecognizer, CoroutineContext coroutineContext, VisionDocumentScannerFeatureConfig visionDocumentScannerFeatureConfig) {
        t5 t5VarProvideStepsDataSource$fourthline_vision_release = o3Var.provideStepsDataSource$fourthline_vision_release(naVar, w5Var, o7Var, w7Var, j3Var, saVar, g8Var, g8Var2, l7Var, aeVar, p9Var, textRecognizer, coroutineContext, visionDocumentScannerFeatureConfig);
        vc.s.k(t5VarProvideStepsDataSource$fourthline_vision_release);
        return t5VarProvideStepsDataSource$fourthline_vision_release;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
