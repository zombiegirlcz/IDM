package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector;

/* JADX INFO: loaded from: classes17.dex */
public final class FaceDetectorAvcResultMapperTestImpl_Factory<T> implements el.b {

    public static final class InstanceHolder {
        private static final FaceDetectorAvcResultMapperTestImpl_Factory INSTANCE = new FaceDetectorAvcResultMapperTestImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static <T> FaceDetectorAvcResultMapperTestImpl_Factory<T> create() {
        return InstanceHolder.INSTANCE;
    }

    public static <T> FaceDetectorAvcResultMapperTestImpl<T> newInstance() {
        return new FaceDetectorAvcResultMapperTestImpl<>();
    }

    @Override // com.onfido.javax.inject.Provider
    public FaceDetectorAvcResultMapperTestImpl<T> get() {
        return newInstance();
    }
}
