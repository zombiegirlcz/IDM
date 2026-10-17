package androidx.camera.camera2.pipe.compat;

import aim.f;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.compat.AndroidOutputConfiguration;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.media.AndroidMultiResolutionImageReader;
import androidx.camera.camera2.pipe.media.ImageSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001\u001a0\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\f"}, d2 = {"buildOutputConfigurations", "Landroidx/camera/camera2/pipe/compat/OutputConfigurations;", "graphConfig", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "streamGraph", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "surfaces", "", "Landroidx/camera/camera2/pipe/StreamId;", "Landroid/view/Surface;", "buildSimpleOutputSurfaceMap", "Landroidx/camera/camera2/pipe/OutputId;", "camera-camera2-pipe"}, k = 2, mv = {2, 1, 0}, xi = 48)
public abstract class CaptureSessionFactoryKt {
    @NotNull
    public static final OutputConfigurations buildOutputConfigurations(@NotNull CameraGraph.Config graphConfig, @NotNull StreamGraphImpl streamGraph, @NotNull Map<StreamId, ? extends Surface> surfaces) {
        Intrinsics.checkNotNullParameter(graphConfig, "graphConfig");
        Intrinsics.checkNotNullParameter(streamGraph, "streamGraph");
        Intrinsics.checkNotNullParameter(surfaces, "surfaces");
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry<StreamId, ImageSource> entry : streamGraph.getImageSourceMap$camera_camera2_pipe().entrySet()) {
            int value = entry.getKey().getValue();
            ImageSource value2 = entry.getValue();
            CameraStream cameraStreamM353getaKI5c8E = streamGraph.m353getaKI5c8E(value);
            if (cameraStreamM353getaKI5c8E == null) {
                throw new IllegalStateException("Required value was null.");
            }
            List<OutputStream> outputs = cameraStreamM353getaKI5c8E.getOutputs();
            if (outputs.size() != 1) {
                if (Build.VERSION.SDK_INT < 31) {
                    throw new IllegalArgumentException("Cannot configure multiple outputs pre-S!");
                }
                Object objUnwrapAs = value2.unwrapAs(o0.f186429a.b(AndroidMultiResolutionImageReader.class));
                if (objUnwrapAs == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                List<OutputConfiguration> outputConfigurations$camera_camera2_pipe = ((AndroidMultiResolutionImageReader) objUnwrapAs).getOutputConfigurations$camera_camera2_pipe();
                if (outputConfigurations$camera_camera2_pipe.size() != outputs.size()) {
                    throw new IllegalStateException("Check failed.");
                }
                int size = outputs.size();
                for (int i = 0; i < size; i++) {
                    OutputStream outputStream = outputs.get(i);
                    OutputConfiguration outputConfiguration = outputConfigurations$camera_camera2_pipe.get(i);
                    StreamGraphImpl.OutputConfig outputConfig = streamGraph.getOutputConfigMap$camera_camera2_pipe().get(outputStream);
                    if (outputConfig == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    StreamGraphImpl.OutputConfig outputConfig2 = outputConfig;
                    if (outputConfig2.getExternalOutputConfig() != null) {
                        throw new IllegalStateException("External OutputConfiguration shouldn't be set in multi-output streams configured with ImageSource.Config");
                    }
                    linkedHashMap3.put(outputConfig2, outputConfiguration);
                }
            }
        }
        for (CameraStream cameraStream : streamGraph.getStreams()) {
            List<OutputStream> outputs2 = cameraStream.getOutputs();
            if (outputs2.size() == 1) {
                Surface surface = surfaces.get(StreamId.m355boximpl(cameraStream.getId()));
                if (surface != null) {
                    linkedHashMap2.put(OutputId.m244boximpl(((OutputStream) d0.K0(outputs2)).getId()), surface);
                }
            } else {
                for (OutputStream outputStream2 : outputs2) {
                    StreamGraphImpl.OutputConfig outputConfig3 = streamGraph.getOutputConfigMap$camera_camera2_pipe().get(outputStream2);
                    if (outputConfig3 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    StreamGraphImpl.OutputConfig outputConfig4 = outputConfig3;
                    OutputConfiguration externalOutputConfig = outputConfig4.getExternalOutputConfig();
                    if (externalOutputConfig == null) {
                        externalOutputConfig = (OutputConfiguration) linkedHashMap3.get(outputConfig4);
                    }
                    Surface surface2 = externalOutputConfig != null ? externalOutputConfig.getSurface() : surfaces.get(StreamId.m355boximpl(cameraStream.getId()));
                    if (surface2 != null) {
                        linkedHashMap2.put(OutputId.m244boximpl(outputStream2.getId()), surface2);
                    }
                }
            }
        }
        OutputConfigurationWrapper outputConfigurationWrapper = null;
        for (StreamGraphImpl.OutputConfig outputConfig5 : streamGraph.getOutputConfigs$camera_camera2_pipe()) {
            List<CameraStream> streams = outputConfig5.getStreams();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it8 = streams.iterator();
            while (it8.hasNext()) {
                Surface surface3 = surfaces.get(StreamId.m355boximpl(((CameraStream) it8.next()).getId()));
                if (surface3 != null) {
                    arrayList2.add(surface3);
                }
            }
            OutputConfiguration externalOutputConfig2 = outputConfig5.getExternalOutputConfig();
            if (externalOutputConfig2 == null) {
                externalOutputConfig2 = (OutputConfiguration) linkedHashMap3.get(outputConfig5);
            }
            OutputConfiguration outputConfiguration2 = externalOutputConfig2;
            if (outputConfiguration2 != null) {
                if (arrayList2.size() != outputConfig5.getStreams().size()) {
                    List<CameraStream> streams2 = outputConfig5.getStreams();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : streams2) {
                        if (!surfaces.containsKey(StreamId.m355boximpl(((CameraStream) obj2).getId()))) {
                            arrayList3.add(obj2);
                        }
                    }
                    throw new IllegalStateException(("Surfaces are not yet available for " + outputConfig5 + "! Missing surfaces for " + arrayList3 + '!').toString());
                }
                arrayList.add(new AndroidOutputConfiguration(outputConfiguration2, false, 1, null, null));
            } else if (outputConfig5.getDeferrable() && arrayList2.size() != outputConfig5.getStreams().size()) {
                AndroidOutputConfiguration.Companion companion = AndroidOutputConfiguration.INSTANCE;
                Size size2 = outputConfig5.getSize();
                OutputStream.OutputType deferredOutputType = outputConfig5.getDeferredOutputType();
                Intrinsics.h(deferredOutputType);
                OutputStream.MirrorMode mirrorMode = outputConfig5.getMirrorMode();
                outputConfig5.m484getTimestampBasepcPfPbY();
                OutputStream.DynamicRangeProfile dynamicRangeProfile = outputConfig5.getDynamicRangeProfile();
                OutputStream.StreamUseCase streamUseCase = outputConfig5.getStreamUseCase();
                List<Object> sensorPixelModes = outputConfig5.getSensorPixelModes();
                boolean surfaceSharing = outputConfig5.getSurfaceSharing();
                Integer groupNumber = outputConfig5.getGroupNumber();
                OutputConfigurationWrapper outputConfigurationWrapperM374creategWWoySg$default = AndroidOutputConfiguration.Companion.m374creategWWoySg$default(companion, null, null, deferredOutputType, mirrorMode, null, dynamicRangeProfile, streamUseCase, sensorPixelModes, size2, surfaceSharing, groupNumber != null ? groupNumber.intValue() : -1, !CameraId.m184equalsimpl0(outputConfig5.getCamera(), graphConfig.getCamera()) ? outputConfig5.getCamera() : null, 2, null);
                if (outputConfigurationWrapperM374creategWWoySg$default != null) {
                    arrayList.add(outputConfigurationWrapperM374creategWWoySg$default);
                    Iterator<CameraStream> it9 = outputConfig5.getStreamBuilder$camera_camera2_pipe().iterator();
                    while (it9.hasNext()) {
                        linkedHashMap.put(StreamId.m355boximpl(it9.next().getId()), outputConfigurationWrapperM374creategWWoySg$default);
                    }
                } else if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    String str = "Failed to create AndroidOutputConfiguration for " + outputConfig5;
                }
            } else {
                if (arrayList2.size() != outputConfig5.getStreams().size()) {
                    List<CameraStream> streams3 = outputConfig5.getStreams();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : streams3) {
                        if (!surfaces.containsKey(StreamId.m355boximpl(((CameraStream) obj3).getId()))) {
                            arrayList4.add(obj3);
                        }
                    }
                    throw new IllegalStateException(("Surfaces are not yet available for " + outputConfig5 + "! Missing surfaces for " + arrayList4 + '!').toString());
                }
                AndroidOutputConfiguration.Companion companion2 = AndroidOutputConfiguration.INSTANCE;
                Surface surface4 = (Surface) d0.b0(arrayList2);
                OutputStream.MirrorMode mirrorMode2 = outputConfig5.getMirrorMode();
                outputConfig5.m484getTimestampBasepcPfPbY();
                OutputStream.DynamicRangeProfile dynamicRangeProfile2 = outputConfig5.getDynamicRangeProfile();
                OutputStream.StreamUseCase streamUseCase2 = outputConfig5.getStreamUseCase();
                List<Object> sensorPixelModes2 = outputConfig5.getSensorPixelModes();
                Size size3 = outputConfig5.getSize();
                boolean surfaceSharing2 = outputConfig5.getSurfaceSharing();
                Integer groupNumber2 = outputConfig5.getGroupNumber();
                OutputConfigurationWrapper outputConfigurationWrapperM374creategWWoySg$default2 = AndroidOutputConfiguration.Companion.m374creategWWoySg$default(companion2, surface4, null, null, mirrorMode2, null, dynamicRangeProfile2, streamUseCase2, sensorPixelModes2, size3, surfaceSharing2, groupNumber2 != null ? groupNumber2.intValue() : -1, !CameraId.m184equalsimpl0(outputConfig5.getCamera(), graphConfig.getCamera()) ? outputConfig5.getCamera() : null, 6, null);
                if (outputConfigurationWrapperM374creategWWoySg$default2 != null) {
                    Iterator it10 = d0.V(arrayList2, 1).iterator();
                    while (it10.hasNext()) {
                        outputConfigurationWrapperM374creategWWoySg$default2.addSurface((Surface) it10.next());
                    }
                    if (graphConfig.getPostviewStream() != null) {
                        CameraStream cameraStream2 = streamGraph.get(graphConfig.getPostviewStream());
                        if (cameraStream2 == null) {
                            throw new IllegalStateException("Postview Stream in StreamGraph cannot be null for reprocessing request");
                        }
                        if (outputConfigurationWrapper == null && outputConfig5.getStreams().contains(cameraStream2)) {
                            outputConfigurationWrapper = outputConfigurationWrapperM374creategWWoySg$default2;
                        } else {
                            arrayList.add(outputConfigurationWrapperM374creategWWoySg$default2);
                        }
                    } else {
                        arrayList.add(outputConfigurationWrapperM374creategWWoySg$default2);
                    }
                } else if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    String str2 = "Failed to create AndroidOutputConfiguration for " + outputConfig5;
                }
            }
        }
        return new OutputConfigurations(arrayList, linkedHashMap, outputConfigurationWrapper, linkedHashMap2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<OutputId, Surface> buildSimpleOutputSurfaceMap(Map<StreamId, ? extends Surface> map, StreamGraphImpl streamGraphImpl) {
        f builder = new f();
        for (CameraStream cameraStream : streamGraphImpl.getStreams()) {
            Surface surface = map.get(StreamId.m355boximpl(cameraStream.getId()));
            if (surface != null) {
                Iterator<OutputStream> it8 = cameraStream.getOutputs().iterator();
                while (it8.hasNext()) {
                    builder.put(OutputId.m244boximpl(it8.next().getId()), surface);
                }
            }
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }
}
