package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.util;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class CoordinatesTransformer_Factory implements b {

    public static final class InstanceHolder {
        private static final CoordinatesTransformer_Factory INSTANCE = new CoordinatesTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static CoordinatesTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CoordinatesTransformer newInstance() {
        return new CoordinatesTransformer();
    }

    @Override // com.onfido.javax.inject.Provider
    public CoordinatesTransformer get() {
        return newInstance();
    }
}
