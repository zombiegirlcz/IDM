package androidx.camera.camera2.pipe.compat;

import a0.d;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.core.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001&B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidOutputConfiguration;", "Landroidx/camera/camera2/pipe/compat/OutputConfigurationWrapper;", "Landroid/hardware/camera2/params/OutputConfiguration;", "output", "", "surfaceSharing", "", "maxSharedSurfaceCount", "Landroidx/camera/camera2/pipe/CameraId;", "physicalCameraId", "<init>", "(Landroid/hardware/camera2/params/OutputConfiguration;ZILjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/view/Surface;", "surface", "", "addSurface", "(Landroid/view/Surface;)V", "", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Landroid/hardware/camera2/params/OutputConfiguration;", "Z", "getSurfaceSharing", "()Z", "I", "getMaxSharedSurfaceCount", "()I", "Ljava/lang/String;", "getPhysicalCameraId-1LO98Z0", "Landroid/view/Surface;", "getSurface", "()Landroid/view/Surface;", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidOutputConfiguration implements OutputConfigurationWrapper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int maxSharedSurfaceCount;

    @NotNull
    private final OutputConfiguration output;
    private final String physicalCameraId;
    private final Surface surface;
    private final boolean surfaceSharing;

    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\t*\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u009b\u0001\u0010(\u001a\u0004\u0018\u00010%2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u00132\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidOutputConfiguration$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "Ljava/lang/Class;", "toKlass", "(Landroidx/camera/camera2/pipe/OutputStream$OutputType;)Ljava/lang/Class;", "Landroid/hardware/camera2/params/OutputConfiguration;", "", "enableSurfaceSharingCompat", "(Landroid/hardware/camera2/params/OutputConfiguration;)V", "Landroidx/camera/camera2/pipe/CameraId;", "physicalCameraId", "setPhysicalCameraIdCompat-8Ri2elo", "(Landroid/hardware/camera2/params/OutputConfiguration;Ljava/lang/String;)V", "setPhysicalCameraIdCompat", "Landroid/view/Surface;", "surface", "", "format", "outputType", "Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "mirrorMode", "Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "timestampBase", "Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "dynamicRangeProfile", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "streamUseCase", "", "sensorPixelModes", "Landroid/util/Size;", "size", "", "surfaceSharing", "surfaceGroupId", "Landroidx/camera/camera2/pipe/compat/OutputConfigurationWrapper;", "create-gWWoySg", "(Landroid/view/Surface;Ljava/lang/Integer;Landroidx/camera/camera2/pipe/OutputStream$OutputType;Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;Ljava/util/List;Landroid/util/Size;ZILjava/lang/String;)Landroidx/camera/camera2/pipe/compat/OutputConfigurationWrapper;", "create", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: create-gWWoySg$default, reason: not valid java name */
        public static OutputConfigurationWrapper m374creategWWoySg$default(Companion companion, Surface surface, Integer num, OutputStream.OutputType outputType, OutputStream.MirrorMode mirrorMode, OutputStream.TimestampBase timestampBase, OutputStream.DynamicRangeProfile dynamicRangeProfile, OutputStream.StreamUseCase streamUseCase, List list, Size size, boolean z, int i, String str, int i2, Object obj2) {
            if ((i2 & 2) != 0) {
                num = null;
            }
            if ((i2 & 4) != 0) {
                outputType = OutputStream.OutputType.INSTANCE.getSURFACE();
            }
            if ((i2 & 8) != 0) {
                mirrorMode = null;
            }
            if ((i2 & 16) != 0) {
                timestampBase = null;
            }
            if ((i2 & 32) != 0) {
                dynamicRangeProfile = null;
            }
            if ((i2 & 64) != 0) {
                streamUseCase = null;
            }
            if ((i2 & 128) != 0) {
                list = f0.f322471a;
            }
            if ((i2 & 256) != 0) {
                size = null;
            }
            if ((i2 & 512) != 0) {
                z = false;
            }
            if ((i2 & 1024) != 0) {
                i = -1;
            }
            if ((i2 & 2048) != 0) {
                str = null;
            }
            return companion.m376creategWWoySg(surface, num, outputType, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, list, size, z, i, str);
        }

        private final void enableSurfaceSharingCompat(OutputConfiguration outputConfiguration) {
            Api26Compat.enableSurfaceSharing(outputConfiguration);
        }

        /* JADX INFO: renamed from: setPhysicalCameraIdCompat-8Ri2elo, reason: not valid java name */
        private final void m375setPhysicalCameraIdCompat8Ri2elo(OutputConfiguration outputConfiguration, String str) {
            Api28Compat.setPhysicalCameraId(outputConfiguration, str);
        }

        private final Class<? extends Object> toKlass(OutputStream.OutputType outputType) {
            OutputStream.OutputType.Companion companion = OutputStream.OutputType.INSTANCE;
            if (Intrinsics.f(outputType, companion.getSURFACE_TEXTURE())) {
                return SurfaceTexture.class;
            }
            if (Intrinsics.f(outputType, companion.getSURFACE_VIEW())) {
                return SurfaceHolder.class;
            }
            if (Intrinsics.f(outputType, companion.getMEDIA_CODEC())) {
                if (Build.VERSION.SDK_INT >= 35) {
                    return MediaCodec.class;
                }
                throw new IllegalStateException("OutputType.MEDIA_CODEC requires API 35 or higher.");
            }
            if (Intrinsics.f(outputType, companion.getMEDIA_RECORDER())) {
                if (Build.VERSION.SDK_INT >= 35) {
                    return MediaRecorder.class;
                }
                throw new IllegalStateException("OutputType.MEDIA_RECORDER requires API 35 or higher.");
            }
            throw new IllegalStateException("Unsupported OutputType: " + outputType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [android.view.Surface] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v20 */
        /* JADX WARN: Type inference failed for: r10v21 */
        /* JADX WARN: Type inference failed for: r10v22 */
        /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v10, types: [android.hardware.camera2.params.OutputConfiguration] */
        /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r9v0, types: [androidx.camera.camera2.pipe.compat.AndroidOutputConfiguration$Companion] */
        /* JADX INFO: renamed from: create-gWWoySg, reason: not valid java name */
        public final OutputConfigurationWrapper m376creategWWoySg(Surface surface, Integer format, @NotNull OutputStream.OutputType outputType, OutputStream.MirrorMode mirrorMode, OutputStream.TimestampBase timestampBase, OutputStream.DynamicRangeProfile dynamicRangeProfile, OutputStream.StreamUseCase streamUseCase, @NotNull List<Object> sensorPixelModes, Size size, boolean surfaceSharing, int surfaceGroupId, String physicalCameraId) {
            ?? NewOutputConfiguration;
            Intrinsics.checkNotNullParameter(outputType, "outputType");
            Intrinsics.checkNotNullParameter(sensorPixelModes, "sensorPixelModes");
            OutputStream.OutputType.Companion companion = OutputStream.OutputType.INSTANCE;
            if (!Intrinsics.f(outputType, companion.getSURFACE_DEFERRED_FOR_QUERY_ONLY$camera_camera2_pipe()) || Build.VERSION.SDK_INT < 35) {
                if (Intrinsics.f(outputType, companion.getSURFACE())) {
                    if (surface == 0) {
                        Objects.toString(companion.getSURFACE());
                        throw new IllegalStateException("non-null surface!");
                    }
                    try {
                        surface = surfaceGroupId != -1 ? new OutputConfiguration(surfaceGroupId, (Surface) surface) : new OutputConfiguration(surface);
                        NewOutputConfiguration = surface;
                    } catch (Throwable th10) {
                        if (!Log.INSTANCE.getWARN_LOGGABLE()) {
                            return null;
                        }
                        String str = "Failed to create an OutputConfiguration for " + surface + '!';
                        return null;
                    }
                } else {
                    if (size == null) {
                        throw new IllegalStateException("Size must defined when creating a deferred OutputConfiguration.");
                    }
                    NewOutputConfiguration = Api26Compat.newOutputConfiguration(size, toKlass(outputType));
                }
            } else {
                if (format == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (size == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                NewOutputConfiguration = Api35Compat.newImageReaderOutputConfiguration(format.intValue(), size);
            }
            ?? r112 = NewOutputConfiguration;
            if (surfaceSharing) {
                enableSurfaceSharingCompat(r112);
            }
            if (physicalCameraId != null) {
                m375setPhysicalCameraIdCompat8Ri2elo(r112, physicalCameraId);
            }
            if (mirrorMode != null) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    Api33Compat.setMirrorMode(r112, mirrorMode.getValue());
                } else {
                    if (!OutputStream.MirrorMode.m290equalsimpl0(mirrorMode.getValue(), OutputStream.MirrorMode.INSTANCE.m294getMIRROR_MODE_AUTODrUKqn0()) && Log.INSTANCE.getWARN_LOGGABLE()) {
                        StringBuilder sbW = d.w(i, "Cannot set mirrorMode to a non-default value on API ", ". This may result in unexpected behavior. Requested ");
                        sbW.append((Object) OutputStream.MirrorMode.m292toStringimpl(mirrorMode.getValue()));
                        sbW.toString();
                    }
                }
            }
            if (dynamicRangeProfile != null) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    Api33Compat.setDynamicRangeProfile(r112, dynamicRangeProfile.getValue());
                } else {
                    if (!OutputStream.DynamicRangeProfile.m282equalsimpl0(dynamicRangeProfile.getValue(), OutputStream.DynamicRangeProfile.INSTANCE.m286getSTANDARDfFAQAUE()) && Log.INSTANCE.getWARN_LOGGABLE()) {
                        StringBuilder sbW2 = d.w(i2, "Cannot set dynamicRangeProfile to a non-default value on API ", ". This may result in unexpected behavior. Requested ");
                        sbW2.append((Object) OutputStream.DynamicRangeProfile.m284toStringimpl(dynamicRangeProfile.getValue()));
                        sbW2.toString();
                    }
                }
            }
            if (streamUseCase != null && Build.VERSION.SDK_INT >= 33) {
                Api33Compat.setStreamUseCase(r112, streamUseCase.getValue());
            }
            if (!sensorPixelModes.isEmpty()) {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 31) {
                    Iterator<Object> it8 = sensorPixelModes.iterator();
                    if (it8.hasNext()) {
                        throw v0.a.e(it8);
                    }
                } else if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    String str2 = "Cannot add sensorPixelModeUsed value on API " + i3 + ". This may result in unexpected behavior. Requested " + sensorPixelModes;
                }
            }
            return new AndroidOutputConfiguration(r112, surfaceSharing, Api28Compat.getMaxSharedSurfaceCount(r112), physicalCameraId, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ AndroidOutputConfiguration(OutputConfiguration outputConfiguration, boolean z, int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(outputConfiguration, z, i, str);
    }

    @Override // androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper
    public void addSurface(@NotNull Surface surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Api26Compat.addSurfaces(this.output, surface);
    }

    @NotNull
    public String toString() {
        return this.output.toString();
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public <T> T unwrapAs(@NotNull KClass type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!Intrinsics.f(type, o0.f186429a.b(OutputConfiguration.class))) {
            return null;
        }
        T t2 = (T) this.output;
        Intrinsics.i(t2, "null cannot be cast to non-null type T of androidx.camera.camera2.pipe.compat.AndroidOutputConfiguration.unwrapAs");
        return t2;
    }

    private AndroidOutputConfiguration(OutputConfiguration output, boolean z, int i, String str) {
        Intrinsics.checkNotNullParameter(output, "output");
        this.output = output;
        this.surfaceSharing = z;
        this.maxSharedSurfaceCount = i;
        this.physicalCameraId = str;
        this.surface = output.getSurface();
    }
}
