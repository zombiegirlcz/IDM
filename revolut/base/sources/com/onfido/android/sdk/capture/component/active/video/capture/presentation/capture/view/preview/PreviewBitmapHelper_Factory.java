package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.preview;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class PreviewBitmapHelper_Factory implements b {

    public static final class InstanceHolder {
        private static final PreviewBitmapHelper_Factory INSTANCE = new PreviewBitmapHelper_Factory();

        private InstanceHolder() {
        }
    }

    public static PreviewBitmapHelper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PreviewBitmapHelper newInstance() {
        return new PreviewBitmapHelper();
    }

    @Override // com.onfido.javax.inject.Provider
    public PreviewBitmapHelper get() {
        return newInstance();
    }
}
