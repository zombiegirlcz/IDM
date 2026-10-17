package com.onfido.android.sdk.capture.detector.rectangle;

/* JADX INFO: loaded from: classes17.dex */
public final class RectangleTransformer_Factory implements el.b {

    public static final class InstanceHolder {
        private static final RectangleTransformer_Factory INSTANCE = new RectangleTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static RectangleTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static RectangleTransformer newInstance() {
        return new RectangleTransformer();
    }

    @Override // com.onfido.javax.inject.Provider
    public RectangleTransformer get() {
        return newInstance();
    }
}
