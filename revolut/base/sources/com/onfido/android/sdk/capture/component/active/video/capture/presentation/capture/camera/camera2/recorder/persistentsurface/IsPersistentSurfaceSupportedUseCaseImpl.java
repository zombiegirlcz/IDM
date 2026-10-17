package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.persistentsurface;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.util.ApiLevel;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.util.ApiLevelUtil;
import com.onfido.android.sdk.capture.utils.DeviceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\f\u001a\u00020\nH\u0096\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/recorder/persistentsurface/IsPersistentSurfaceSupportedUseCaseImpl;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/recorder/persistentsurface/IsPersistentSurfaceSupportedUseCase;", "apiLevelUtil", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/util/ApiLevelUtil;", "deviceUtils", "Lcom/onfido/android/sdk/capture/utils/DeviceUtils;", "repository", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/recorder/persistentsurface/PersistentRecorderSurfaceRepository;", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/util/ApiLevelUtil;Lcom/onfido/android/sdk/capture/utils/DeviceUtils;Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/recorder/persistentsurface/PersistentRecorderSurfaceRepository;)V", "isPersistentSurfaceSupported", "", "Ljava/lang/Boolean;", "invoke", "isInUnsupportedDeviceList", "isSupported", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IsPersistentSurfaceSupportedUseCaseImpl implements IsPersistentSurfaceSupportedUseCase {

    @NotNull
    private final ApiLevelUtil apiLevelUtil;

    @NotNull
    private final DeviceUtils deviceUtils;
    private Boolean isPersistentSurfaceSupported;

    @NotNull
    private final PersistentRecorderSurfaceRepository repository;

    public IsPersistentSurfaceSupportedUseCaseImpl(@NotNull ApiLevelUtil apiLevelUtil, @NotNull DeviceUtils deviceUtils, @NotNull PersistentRecorderSurfaceRepository repository) {
        Intrinsics.checkNotNullParameter(apiLevelUtil, "apiLevelUtil");
        Intrinsics.checkNotNullParameter(deviceUtils, "deviceUtils");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.apiLevelUtil = apiLevelUtil;
        this.deviceUtils = deviceUtils;
        this.repository = repository;
    }

    private final boolean isInUnsupportedDeviceList() {
        List<String> unsupportedDeviceList = this.repository.getUnsupportedDeviceList();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : unsupportedDeviceList) {
            if (!d0.W((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            String lowerCase = ((String) it8.next()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            arrayList2.add(lowerCase);
        }
        ArrayList<String> arrayList3 = new ArrayList(w.t(arrayList2, 10));
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            arrayList3.add(d0.F0((String) it9.next()).toString());
        }
        if (!arrayList3.isEmpty()) {
            for (String str : arrayList3) {
                String lowerCase2 = this.deviceUtils.getDeviceModel$onfido_capture_sdk_core_release().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (d0.J(lowerCase2, str, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean isSupported() {
        return this.apiLevelUtil.isApiAtLeast(ApiLevel.MARSHMALLOW) && !isInUnsupportedDeviceList();
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.persistentsurface.IsPersistentSurfaceSupportedUseCase
    public boolean invoke() {
        Boolean bool = this.isPersistentSurfaceSupported;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zIsSupported = isSupported();
        this.isPersistentSurfaceSupported = Boolean.valueOf(zIsSupported);
        return zIsSupported;
    }
}
