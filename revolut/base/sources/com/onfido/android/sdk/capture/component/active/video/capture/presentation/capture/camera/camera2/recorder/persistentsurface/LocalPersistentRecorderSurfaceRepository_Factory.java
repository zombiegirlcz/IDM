package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.persistentsurface;

import com.onfido.android.sdk.capture.utils.RawResourceReader;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class LocalPersistentRecorderSurfaceRepository_Factory implements b {
    private final Provider rawResourceReaderProvider;

    public LocalPersistentRecorderSurfaceRepository_Factory(Provider provider) {
        this.rawResourceReaderProvider = provider;
    }

    public static LocalPersistentRecorderSurfaceRepository_Factory create(Provider provider) {
        return new LocalPersistentRecorderSurfaceRepository_Factory(provider);
    }

    public static LocalPersistentRecorderSurfaceRepository newInstance(RawResourceReader rawResourceReader) {
        return new LocalPersistentRecorderSurfaceRepository(rawResourceReader);
    }

    @Override // com.onfido.javax.inject.Provider
    public LocalPersistentRecorderSurfaceRepository get() {
        return newInstance((RawResourceReader) this.rawResourceReaderProvider.get());
    }
}
