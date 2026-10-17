package com.onfido.android.sdk.capture.ui.camera.util;

import com.onfido.android.sdk.capture.common.permissions.RuntimePermissionsManager;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class CameraPermissionsUtils_MembersInjector implements MembersInjector {
    private final Provider permissionsManagerProvider;

    public CameraPermissionsUtils_MembersInjector(Provider provider) {
        this.permissionsManagerProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new CameraPermissionsUtils_MembersInjector(provider);
    }

    public static void injectPermissionsManager(CameraPermissionsUtils cameraPermissionsUtils, RuntimePermissionsManager runtimePermissionsManager) {
        cameraPermissionsUtils.permissionsManager = runtimePermissionsManager;
    }

    public void injectMembers(CameraPermissionsUtils cameraPermissionsUtils) {
        injectPermissionsManager(cameraPermissionsUtils, (RuntimePermissionsManager) this.permissionsManagerProvider.get());
    }
}
