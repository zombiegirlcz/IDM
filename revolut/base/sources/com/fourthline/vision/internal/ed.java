package com.fourthline.vision.internal;

import android.content.Context;
import android.hardware.SensorManager;
import android.media.ImageReader;
import android.os.Handler;
import androidx.view.result.ActivityResultRegistry;
import com.fourthline.core.location.FourthlineLocationHelper;
import com.fourthline.core.location.LocationProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f36147a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @NotNull
    public final com.fourthline.vision.internal.a provideAccelerometerFlow(@NotNull CoroutineContext coroutineContext, @NotNull SensorManager sensorManager) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
        return new com.fourthline.vision.internal.a(sensorManager, 0, coroutineContext, 2, null);
    }

    @NotNull
    public final e2 provideDebugConsumer() {
        return new e2();
    }

    @NotNull
    public final y6 provideGyroscopeFlow(@NotNull CoroutineContext coroutineContext, @NotNull SensorManager sensorManager) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
        return new y6(sensorManager, 0, coroutineContext, 2, null);
    }

    @NotNull
    public final k7 provideImageDataSource(@NotNull ImageReader imageReader, @NotNull Handler handler, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(imageReader, "imageReader");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return new k7(imageReader, handler, coroutineContext);
    }

    @NotNull
    public final ImageReader provideImageReader(@NotNull b0 cameraInfoProvider) {
        Intrinsics.checkNotNullParameter(cameraInfoProvider, "cameraInfoProvider");
        ImageReader imageReaderNewInstance = ImageReader.newInstance(cameraInfoProvider.getImageReaderSize().getWidth(), cameraInfoProvider.getImageReaderSize().getHeight(), 35, 5);
        Intrinsics.checkNotNullExpressionValue(imageReaderNewInstance, "newInstance(...)");
        return imageReaderNewInstance;
    }

    @NotNull
    public final t7 provideIsSteadyDataSource(@NotNull CoroutineContext coroutineContext, @NotNull y6 gyroscopeFlow, @NotNull com.fourthline.vision.internal.a accelerometerFlow) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(gyroscopeFlow, "gyroscopeFlow");
        Intrinsics.checkNotNullParameter(accelerometerFlow, "accelerometerFlow");
        return new t7(gyroscopeFlow, accelerometerFlow, 0L, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, coroutineContext.plus(skm.e0.d()), 28, null);
    }

    @NotNull
    public final LocationProvider provideLocationProvider(@NotNull Context context, @NotNull ActivityResultRegistry registry) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(registry, "registry");
        return FourthlineLocationHelper.getLocationProvider(context, registry);
    }

    @NotNull
    public final a9 provideMetadataRepository() {
        return new a9();
    }

    @NotNull
    public final be provideTriggerRepository() {
        return new be();
    }
}
