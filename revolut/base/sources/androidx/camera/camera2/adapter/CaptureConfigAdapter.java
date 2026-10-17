package androidx.camera.camera2.adapter;

import aim.e;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import androidx.camera.camera2.compat.workaround.TemplateParamsOverride;
import androidx.camera.camera2.config.UseCaseGraphContext;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.Camera2ImplConfigKt;
import androidx.camera.camera2.impl.CameraCallbackMap;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.TagsKt;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.InputRequest;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.media.AndroidImage;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraCaptureResults;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;
import zhm.q0;
import zhm.r0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Landroidx/camera/camera2/adapter/CaptureConfigAdapter;", "", "cameraProperties", "Landroidx/camera/camera2/impl/CameraProperties;", "useCaseGraphContext", "Landroidx/camera/camera2/config/UseCaseGraphContext;", "zslControl", "Landroidx/camera/camera2/adapter/ZslControl;", "threads", "Landroidx/camera/camera2/impl/UseCaseThreads;", "templateParamsOverride", "Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride;", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;Landroidx/camera/camera2/config/UseCaseGraphContext;Landroidx/camera/camera2/adapter/ZslControl;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride;)V", "isLegacyDevice", "", "mapToRequest", "Landroidx/camera/camera2/pipe/Request;", "captureConfig", "Landroidx/camera/core/impl/CaptureConfig;", "requestTemplate", "Landroidx/camera/camera2/pipe/RequestTemplate;", "sessionConfigOptions", "Landroidx/camera/core/impl/Config;", "additionalListeners", "", "Landroidx/camera/camera2/pipe/Request$Listener;", "mapToRequest-nAberiA", "(Landroidx/camera/core/impl/CaptureConfig;ILandroidx/camera/core/impl/Config;Ljava/util/List;)Landroidx/camera/camera2/pipe/Request;", "buildImageClosingRequestListener", "imageProxy", "Landroidx/camera/core/ImageProxy;", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CaptureConfigAdapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isLegacyDevice;

    @NotNull
    private final TemplateParamsOverride templateParamsOverride;

    @NotNull
    private final UseCaseThreads threads;

    @NotNull
    private final UseCaseGraphContext useCaseGraphContext;

    @NotNull
    private final ZslControl zslControl;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/camera/camera2/adapter/CaptureConfigAdapter$Companion;", "", "<init>", "()V", "getStillCaptureTemplate", "Landroidx/camera/camera2/pipe/RequestTemplate;", "Landroidx/camera/core/impl/CaptureConfig;", "sessionTemplate", "isLegacyDevice", "", "getStillCaptureTemplate-CMLptTo$camera_camera2", "(Landroidx/camera/core/impl/CaptureConfig;IZ)I", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getStillCaptureTemplate-CMLptTo$camera_camera2, reason: not valid java name */
        public final int m5getStillCaptureTemplateCMLptTo$camera_camera2(@NotNull CaptureConfig getStillCaptureTemplate, int i, boolean z) {
            Intrinsics.checkNotNullParameter(getStillCaptureTemplate, "$this$getStillCaptureTemplate");
            int i2 = (!RequestTemplate.m327equalsimpl0(i, RequestTemplate.m325constructorimpl(3)) || z) ? (getStillCaptureTemplate.getTemplateType() == -1 || getStillCaptureTemplate.getTemplateType() == 5) ? 2 : -1 : 4;
            return i2 != -1 ? RequestTemplate.m325constructorimpl(i2) : RequestTemplate.m325constructorimpl(getStillCaptureTemplate.getTemplateType());
        }

        private Companion() {
        }
    }

    public CaptureConfigAdapter(@NotNull CameraProperties cameraProperties, @NotNull UseCaseGraphContext useCaseGraphContext, @NotNull ZslControl zslControl, @NotNull UseCaseThreads threads, @NotNull TemplateParamsOverride templateParamsOverride) {
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(useCaseGraphContext, "useCaseGraphContext");
        Intrinsics.checkNotNullParameter(zslControl, "zslControl");
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(templateParamsOverride, "templateParamsOverride");
        this.useCaseGraphContext = useCaseGraphContext;
        this.zslControl = zslControl;
        this.threads = threads;
        this.templateParamsOverride = templateParamsOverride;
        this.isLegacyDevice = CameraMetadata.INSTANCE.isHardwareLevelLegacy(cameraProperties.getMetadata());
    }

    private final Request.Listener buildImageClosingRequestListener(ImageProxy imageProxy) {
        final AtomicReference atomicReference = new AtomicReference(imageProxy);
        return new Request.Listener() { // from class: androidx.camera.camera2.adapter.CaptureConfigAdapter.buildImageClosingRequestListener.1
            @Override // androidx.camera.camera2.pipe.Request.Listener
            public void onAborted(Request request) {
                Intrinsics.checkNotNullParameter(request, "request");
                CaptureConfigAdapter.buildImageClosingRequestListener$closeImageProxy(atomicReference);
            }

            @Override // androidx.camera.camera2.pipe.Request.Listener
            /* JADX INFO: renamed from: onComplete-CcXjc1I, reason: not valid java name */
            public void mo6onCompleteCcXjc1I(RequestMetadata requestMetadata, long frameNumber, FrameInfo result) {
                Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
                Intrinsics.checkNotNullParameter(result, "result");
                CaptureConfigAdapter.buildImageClosingRequestListener$closeImageProxy(atomicReference);
            }

            @Override // androidx.camera.camera2.pipe.Request.Listener
            /* JADX INFO: renamed from: onFailed-CcXjc1I, reason: not valid java name */
            public void mo7onFailedCcXjc1I(RequestMetadata requestMetadata, long frameNumber, RequestFailure requestFailure) {
                Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
                Intrinsics.checkNotNullParameter(requestFailure, "requestFailure");
                CaptureConfigAdapter.buildImageClosingRequestListener$closeImageProxy(atomicReference);
            }

            @Override // androidx.camera.camera2.pipe.Request.Listener
            /* JADX INFO: renamed from: onTotalCaptureResult-CcXjc1I, reason: not valid java name */
            public void mo8onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long frameNumber, FrameInfo totalCaptureResult) {
                Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
                Intrinsics.checkNotNullParameter(totalCaptureResult, "totalCaptureResult");
                CaptureConfigAdapter.buildImageClosingRequestListener$closeImageProxy(atomicReference);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildImageClosingRequestListener$closeImageProxy(AtomicReference<ImageProxy> atomicReference) {
        ImageProxy andSet = atomicReference.getAndSet(null);
        if (andSet != null) {
            andSet.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: mapToRequest-nAberiA, reason: not valid java name */
    public final Request m4mapToRequestnAberiA(@NotNull CaptureConfig captureConfig, int requestTemplate, @NotNull Config sessionConfigOptions, @NotNull List<? extends Request.Listener> additionalListeners) {
        InputRequest inputRequest;
        ImageProxy imageProxyDequeueImageFromBuffer;
        Request.Listener listenerBuildImageClosingRequestListener;
        Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
        Intrinsics.checkNotNullParameter(sessionConfigOptions, "sessionConfigOptions");
        Intrinsics.checkNotNullParameter(additionalListeners, "additionalListeners");
        List<DeferrableSurface> surfaces = captureConfig.getSurfaces();
        Intrinsics.checkNotNullExpressionValue(surfaces, "getSurfaces(...)");
        if (surfaces.isEmpty()) {
            throw new IllegalStateException(("Attempted to issue a capture without surfaces using " + captureConfig).toString());
        }
        List<DeferrableSurface> list = surfaces;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (DeferrableSurface deferrableSurface : list) {
            StreamId streamId = this.useCaseGraphContext.getSurfaceToStreamMap().get(deferrableSurface);
            if (streamId == null) {
                throw new IllegalStateException(("Attempted to issue a capture with an unrecognized surface: " + deferrableSurface).toString());
            }
            arrayList.add(StreamId.m355boximpl(streamId.getValue()));
        }
        CameraCallbackMap cameraCallbackMap = new CameraCallbackMap();
        List<CameraCaptureCallback> cameraCaptureCallbacks = captureConfig.getCameraCaptureCallbacks();
        Intrinsics.checkNotNullExpressionValue(cameraCaptureCallbacks, "getCameraCaptureCallbacks(...)");
        for (CameraCaptureCallback cameraCaptureCallback : cameraCaptureCallbacks) {
            Intrinsics.h(cameraCaptureCallback);
            cameraCallbackMap.addCaptureCallback(cameraCaptureCallback, this.threads.getSequentialExecutor());
        }
        Config implementationOptions = captureConfig.getImplementationOptions();
        Intrinsics.checkNotNullExpressionValue(implementationOptions, "getImplementationOptions(...)");
        Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
        builder.insertAllOptions(sessionConfigOptions);
        builder.insertAllOptions(implementationOptions);
        Config.Option<Integer> option = CaptureConfig.OPTION_ROTATION;
        if (implementationOptions.containsOption(option)) {
            CaptureRequest.Key JPEG_ORIENTATION = CaptureRequest.JPEG_ORIENTATION;
            Intrinsics.checkNotNullExpressionValue(JPEG_ORIENTATION, "JPEG_ORIENTATION");
            Object objRetrieveOption = implementationOptions.retrieveOption(option);
            Intrinsics.h(objRetrieveOption);
            builder.setCaptureRequestOption(JPEG_ORIENTATION, objRetrieveOption);
        }
        Config.Option<Integer> option2 = CaptureConfig.OPTION_JPEG_QUALITY;
        if (implementationOptions.containsOption(option2)) {
            CaptureRequest.Key JPEG_QUALITY = CaptureRequest.JPEG_QUALITY;
            Intrinsics.checkNotNullExpressionValue(JPEG_QUALITY, "JPEG_QUALITY");
            Object objRetrieveOption2 = implementationOptions.retrieveOption(option2);
            Intrinsics.h(objRetrieveOption2);
            builder.setCaptureRequestOption(JPEG_QUALITY, Byte.valueOf((byte) ((Number) objRetrieveOption2).intValue()));
        }
        int iM325constructorimpl = RequestTemplate.m325constructorimpl(captureConfig.getTemplateType());
        Object obj2 = null;
        if (captureConfig.getTemplateType() != 5 || this.zslControl.getIsZslDisabledByUseCaseConfig() || this.zslControl.getIsZslDisabledByFlashMode() || (imageProxyDequeueImageFromBuffer = this.zslControl.dequeueImageFromBuffer()) == null) {
            inputRequest = 0;
        } else {
            CameraCaptureResult cameraCaptureResultRetrieveCameraCaptureResult = CameraCaptureResults.retrieveCameraCaptureResult(imageProxyDequeueImageFromBuffer.getImageInfo());
            if (cameraCaptureResultRetrieveCameraCaptureResult == null) {
                listenerBuildImageClosingRequestListener = null;
            } else {
                if (!(cameraCaptureResultRetrieveCameraCaptureResult instanceof CaptureResultAdapter)) {
                    throw new IllegalStateException(("Unexpected capture result type: " + cameraCaptureResultRetrieveCameraCaptureResult.getClass()).toString());
                }
                Image image = imageProxyDequeueImageFromBuffer.getImage();
                if (image == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                AndroidImage androidImage = new AndroidImage(image);
                Object objUnwrapAs = ((CaptureResultAdapter) cameraCaptureResultRetrieveCameraCaptureResult).unwrapAs(o0.f186429a.b(FrameInfo.class));
                if (objUnwrapAs == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                InputRequest inputRequest2 = new InputRequest(androidImage, (FrameInfo) objUnwrapAs);
                listenerBuildImageClosingRequestListener = buildImageClosingRequestListener(imageProxyDequeueImageFromBuffer);
                obj2 = inputRequest2;
            }
            inputRequest = obj2;
            obj2 = listenerBuildImageClosingRequestListener;
        }
        if (inputRequest == 0) {
            iM325constructorimpl = INSTANCE.m5getStillCaptureTemplateCMLptTo$camera_camera2(captureConfig, requestTemplate, this.isLegacyDevice);
        }
        LinkedHashMap linkedHashMapP = r0.p(this.templateParamsOverride.mo13getOverrideParamsxlOpshk(RequestTemplate.m324boximpl(iM325constructorimpl)), Camera2ImplConfigKt.toParameters(builder.build()));
        e eVarB = u.b();
        eVarB.add(cameraCallbackMap);
        if (obj2 != null) {
            eVarB.add(obj2);
        }
        eVarB.addAll(additionalListeners);
        return new Request(arrayList, linkedHashMapP, q0.c(new Pair(TagsKt.getCAMERAX_TAG_BUNDLE(), captureConfig.getTagBundle())), u.a(eVarB), RequestTemplate.m324boximpl(iM325constructorimpl), inputRequest, null);
    }
}
