package com.onfido.android.sdk.capture.ui.camera.document;

import com.onfido.android.sdk.capture.common.permissions.RuntimePermissionsManager;
import com.onfido.android.sdk.capture.internal.camera.factory.CameraFactory;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.service.VibratorService;
import com.onfido.android.sdk.capture.utils.ImageUtils;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class DocumentCaptureFragment_MembersInjector implements MembersInjector {
    private final Provider announcementServiceProvider;
    private final Provider cameraFactoryProvider;
    private final Provider imageUtilsProvider;
    private final Provider permissionsManagerProvider;
    private final Provider vibratorServiceProvider;
    private final Provider viewModelProvider;

    public DocumentCaptureFragment_MembersInjector(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.viewModelProvider = provider;
        this.permissionsManagerProvider = provider2;
        this.announcementServiceProvider = provider3;
        this.vibratorServiceProvider = provider4;
        this.imageUtilsProvider = provider5;
        this.cameraFactoryProvider = provider6;
    }

    public static MembersInjector create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new DocumentCaptureFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static void injectAnnouncementService(DocumentCaptureFragment documentCaptureFragment, AnnouncementService announcementService) {
        documentCaptureFragment.announcementService = announcementService;
    }

    public static void injectCameraFactory(DocumentCaptureFragment documentCaptureFragment, CameraFactory cameraFactory) {
        documentCaptureFragment.cameraFactory = cameraFactory;
    }

    public static void injectImageUtils(DocumentCaptureFragment documentCaptureFragment, ImageUtils imageUtils) {
        documentCaptureFragment.imageUtils = imageUtils;
    }

    public static void injectPermissionsManager(DocumentCaptureFragment documentCaptureFragment, RuntimePermissionsManager runtimePermissionsManager) {
        documentCaptureFragment.permissionsManager = runtimePermissionsManager;
    }

    public static void injectVibratorService(DocumentCaptureFragment documentCaptureFragment, VibratorService vibratorService) {
        documentCaptureFragment.vibratorService = vibratorService;
    }

    public static void injectViewModelProvider(DocumentCaptureFragment documentCaptureFragment, Provider provider) {
        documentCaptureFragment.viewModelProvider = provider;
    }

    public void injectMembers(DocumentCaptureFragment documentCaptureFragment) {
        injectViewModelProvider(documentCaptureFragment, this.viewModelProvider);
        injectPermissionsManager(documentCaptureFragment, (RuntimePermissionsManager) this.permissionsManagerProvider.get());
        injectAnnouncementService(documentCaptureFragment, (AnnouncementService) this.announcementServiceProvider.get());
        injectVibratorService(documentCaptureFragment, (VibratorService) this.vibratorServiceProvider.get());
        injectImageUtils(documentCaptureFragment, (ImageUtils) this.imageUtilsProvider.get());
        injectCameraFactory(documentCaptureFragment, (CameraFactory) this.cameraFactoryProvider.get());
    }
}
