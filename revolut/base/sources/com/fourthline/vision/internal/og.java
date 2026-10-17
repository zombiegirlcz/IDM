package com.fourthline.vision.internal;

import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import com.fourthline.vision.internal.e5;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class og implements e5.a, ImageAnalysis.Analyzer, OnSuccessListener, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f36640a;

    public /* synthetic */ og(Object obj2) {
        this.f36640a = obj2;
    }

    @Override // com.fourthline.vision.internal.e5.a
    public void a(d5 d5Var) {
        f5.mrzDetectionHandler$lambda$1((f5) this.f36640a, d5Var);
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(ImageProxy imageProxy) {
        p0.initializeCameraProvider$lambda$0$0((p0) this.f36640a, imageProxy);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc2) {
        yd.setupInterpreter$lambda$2((yd) this.f36640a, exc2);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
    public void onSuccess(Object obj2) {
        ((Function1) this.f36640a).invoke(obj2);
    }
}
