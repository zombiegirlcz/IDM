package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector;

import android.graphics.Bitmap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionImage;
import fgm.q;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements q, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FaceDetectorAvcMLKit f49886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MotionImage f49887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bitmap f49888c;

    public /* synthetic */ a(Bitmap bitmap, FaceDetectorAvcMLKit faceDetectorAvcMLKit, MotionImage motionImage) {
        this.f49888c = bitmap;
        this.f49886a = faceDetectorAvcMLKit;
        this.f49887b = motionImage;
    }

    @Override // fgm.q
    public void c(tgm.a aVar) {
        FaceDetectorAvcMLKit.detect$lambda$3(this.f49888c, this.f49886a, this.f49887b, aVar);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FaceDetectorAvcMLKit.detect$lambda$3$lambda$2(this.f49886a, this.f49887b, this.f49888c, task);
    }

    public /* synthetic */ a(FaceDetectorAvcMLKit faceDetectorAvcMLKit, MotionImage motionImage, Bitmap bitmap) {
        this.f49886a = faceDetectorAvcMLKit;
        this.f49887b = motionImage;
        this.f49888c = bitmap;
    }
}
