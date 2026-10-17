package com.onfido.android.sdk.capture.component.active.video.capture.di.host;

import com.onfido.android.sdk.capture.common.di.SdkComponent;
import com.onfido.android.sdk.capture.ui.options.MotionCaptureVariantOptions;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0006\u0010\u000e\u001a\u00020\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/di/host/MotionHostComponentHolder;", "", "()V", "component", "Lcom/onfido/android/sdk/capture/component/active/video/capture/di/host/MotionHostComponent;", "getComponent", "sdkComponent", "Lcom/onfido/android/sdk/capture/common/di/SdkComponent;", "motionOptions", "Lcom/onfido/android/sdk/capture/ui/options/MotionCaptureVariantOptions;", "getComponent$onfido_capture_sdk_core_release", "init", "", "hostComponent", "onDestroy", "Companion", "Holder", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MotionHostComponentHolder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy instance$delegate = j.b(MotionHostComponentHolder$Companion$instance$2.INSTANCE);
    private MotionHostComponent component;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/di/host/MotionHostComponentHolder$Companion;", "", "()V", "instance", "Lcom/onfido/android/sdk/capture/component/active/video/capture/di/host/MotionHostComponentHolder;", "getInstance$annotations", "getInstance", "()Lcom/onfido/android/sdk/capture/component/active/video/capture/di/host/MotionHostComponentHolder;", "instance$delegate", "Lkotlin/Lazy;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        @NotNull
        public final MotionHostComponentHolder getInstance() {
            return (MotionHostComponentHolder) MotionHostComponentHolder.instance$delegate.getValue();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u0004¢\u0006\n\n\u0002\b\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/di/host/MotionHostComponentHolder$Holder;", "", "()V", "INSTANCE", "Lcom/onfido/android/sdk/capture/component/active/video/capture/di/host/MotionHostComponentHolder;", "getINSTANCE", "()Lcom/onfido/android/sdk/capture/component/active/video/capture/di/host/MotionHostComponentHolder;", "INSTANCE$1", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Holder {

        @NotNull
        public static final Holder INSTANCE = new Holder();

        /* JADX INFO: renamed from: INSTANCE$1, reason: from kotlin metadata */
        @NotNull
        private static final MotionHostComponentHolder INSTANCE = new MotionHostComponentHolder(null);

        private Holder() {
        }

        @NotNull
        public final MotionHostComponentHolder getINSTANCE() {
            return INSTANCE;
        }
    }

    private MotionHostComponentHolder() {
    }

    @NotNull
    public static final MotionHostComponentHolder getInstance() {
        return INSTANCE.getInstance();
    }

    private final void init(SdkComponent sdkComponent, MotionCaptureVariantOptions motionOptions) {
        this.component = DaggerMotionHostComponent.builder().sdkComponent(sdkComponent).motionHostModule(new MotionHostModule(motionOptions)).build();
    }

    @NotNull
    public final MotionHostComponent getComponent$onfido_capture_sdk_core_release(@NotNull SdkComponent sdkComponent, @NotNull MotionCaptureVariantOptions motionOptions) {
        Intrinsics.checkNotNullParameter(sdkComponent, "sdkComponent");
        Intrinsics.checkNotNullParameter(motionOptions, "motionOptions");
        MotionHostComponent motionHostComponent = this.component;
        if (motionHostComponent != null) {
            return motionHostComponent;
        }
        init(sdkComponent, motionOptions);
        MotionHostComponent motionHostComponent2 = this.component;
        Intrinsics.h(motionHostComponent2);
        return motionHostComponent2;
    }

    public final void onDestroy() {
        this.component = null;
    }

    public /* synthetic */ MotionHostComponentHolder(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void init(@NotNull MotionHostComponent hostComponent) {
        Intrinsics.checkNotNullParameter(hostComponent, "hostComponent");
        this.component = hostComponent;
    }
}
