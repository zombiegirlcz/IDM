package androidx.camera.camera2.pipe.graph;

import android.content.res.TypedArray;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.MediaMetadataRetriever;
import android.util.Size;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.InputStream;
import androidx.camera.camera2.pipe.InputStreamId;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.camera.camera2.pipe.StreamGraph;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.media.ImageSource;
import androidx.camera.camera2.pipe.media.ImageSources;
import ch.qos.logback.core.CoreConstants;
import hx7.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import phm.a;
import rkm.d;
import zhm.a0;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u000b\b\u0001\u0018\u0000 W2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0004XYZWB/\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010&J#\u0010)\u001a\b\u0012\u0004\u0012\u00020$0'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0'H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020+2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010-J#\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110'2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110'H\u0002¢\u0006\u0004\b/\u0010*J#\u00101\u001a\b\u0012\u0004\u0012\u00020\u00110'2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00110'H\u0002¢\u0006\u0004\b1\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u00107R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010;R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00110<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R \u0010@\u001a\b\u0012\u0004\u0012\u00020?0'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR&\u0010E\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020?0<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010>\u001a\u0004\bF\u0010GR&\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020H0<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010>\u001a\u0004\bJ\u0010GR \u0010L\u001a\b\u0012\u0004\u0012\u00020K0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010A\u001a\u0004\bM\u0010CR \u0010N\u001a\b\u0012\u0004\u0012\u00020\u00110'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010A\u001a\u0004\bO\u0010CR \u0010U\u001a\b\u0012\u0004\u0012\u00020\u00140P8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR \u0010(\u001a\b\u0012\u0004\u0012\u00020D0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010A\u001a\u0004\bV\u0010C¨\u0006["}, d2 = {"Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "Landroidx/camera/camera2/pipe/StreamGraph;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "graphConfig", "Landroidx/camera/camera2/pipe/media/ImageSources;", "imageSources", "Lphm/a;", "Landroidx/camera/camera2/pipe/CameraController;", "cameraControllerProvider", "<init>", "(Landroidx/camera/camera2/pipe/CameraMetadata;Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/media/ImageSources;Lphm/a;)V", "Landroidx/camera/camera2/pipe/CameraStream$Config;", "config", "Landroidx/camera/camera2/pipe/CameraStream;", "get", "(Landroidx/camera/camera2/pipe/CameraStream$Config;)Landroidx/camera/camera2/pipe/CameraStream;", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "getCameraStreamConfig-aKI5c8E", "(I)Landroidx/camera/camera2/pipe/CameraStream$Config;", "getCameraStreamConfig", "", "toString", "()Ljava/lang/String;", "", "close", "()V", "Landroidx/camera/camera2/pipe/OutputStream$Config;", "outputConfig", "Landroid/hardware/camera2/params/OutputConfiguration;", "getOutputConfigurationOrNull", "(Landroidx/camera/camera2/pipe/OutputStream$Config;)Landroid/hardware/camera2/params/OutputConfiguration;", "", "computeNextSurfaceGroupId", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;)I", "", "outputs", "readExistingGroupNumbers", "(Ljava/util/List;)Ljava/util/List;", "", "computeIfDeferredStreamsAreSupported", "(Landroidx/camera/camera2/pipe/CameraMetadata;Landroidx/camera/camera2/pipe/CameraGraph$Config;)Z", "unsortedStreams", "sortOutputsByPreviewStream", "unsortedOutputs", "sortOutputsByVideoStream", "Landroidx/camera/camera2/pipe/CameraMetadata;", "getCameraMetadata", "()Landroidx/camera/camera2/pipe/CameraMetadata;", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "getGraphConfig", "()Landroidx/camera/camera2/pipe/CameraGraph$Config;", "Landroidx/camera/camera2/pipe/media/ImageSources;", "getImageSources", "()Landroidx/camera/camera2/pipe/media/ImageSources;", "Lphm/a;", "", "_streamMap", "Ljava/util/Map;", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl$OutputConfig;", "outputConfigs", "Ljava/util/List;", "getOutputConfigs$camera_camera2_pipe", "()Ljava/util/List;", "Landroidx/camera/camera2/pipe/OutputStream;", "outputConfigMap", "getOutputConfigMap$camera_camera2_pipe", "()Ljava/util/Map;", "Landroidx/camera/camera2/pipe/media/ImageSource;", "imageSourceMap", "getImageSourceMap$camera_camera2_pipe", "Landroidx/camera/camera2/pipe/InputStream;", "inputs", "getInputs", "streams", "getStreams", "", "streamIds$1", "Ljava/util/Set;", "getStreamIds", "()Ljava/util/Set;", "streamIds", "getOutputs", "Companion", "OutputConfig", "OutputStreamImpl", "InputStreamImpl", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StreamGraphImpl implements StreamGraph, AutoCloseable {

    @NotNull
    private static final Comparator<CameraStream> previewFormatComparator;

    @NotNull
    private static final List<StreamFormat> previewFormats;

    @NotNull
    private static final List<OutputStream.OutputType> previewOutputTypes;

    @NotNull
    private static final Comparator<CameraStream> previewOutputTypesComparator;

    @NotNull
    private final Map<CameraStream.Config, CameraStream> _streamMap;

    @NotNull
    private final a cameraControllerProvider;

    @NotNull
    private final CameraMetadata cameraMetadata;

    @NotNull
    private final CameraGraph.Config graphConfig;

    @NotNull
    private final Map<StreamId, ImageSource> imageSourceMap;

    @NotNull
    private final ImageSources imageSources;

    @NotNull
    private final List<InputStream> inputs;

    @NotNull
    private final Map<OutputStream, OutputConfig> outputConfigMap;

    @NotNull
    private final List<OutputConfig> outputConfigs;

    @NotNull
    private final List<OutputStream> outputs;

    /* JADX INFO: renamed from: streamIds$1, reason: from kotlin metadata */
    @NotNull
    private final Set<StreamId> streamIds;

    @NotNull
    private final List<CameraStream> streams;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final d streamIds = b.h(0);

    @NotNull
    private static final d outputIds = b.h(0);

    @NotNull
    private static final d inputIds = b.h(0);

    @NotNull
    private static final d configIds = b.h(0);

    @NotNull
    private static final d groupIds = b.h(0);

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\r\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001eR$\u0010&\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010#¨\u0006'"}, d2 = {"Landroidx/camera/camera2/pipe/graph/StreamGraphImpl$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/StreamId;", "nextStreamId-ptHMqGs$camera_camera2_pipe", "()I", "nextStreamId", "Landroidx/camera/camera2/pipe/OutputId;", "nextOutputId-4LaLFng$camera_camera2_pipe", "nextOutputId", "Landroidx/camera/camera2/pipe/InputStreamId;", "nextInputId-m1bwn9M$camera_camera2_pipe", "nextInputId", "Landroidx/camera/camera2/pipe/graph/OutputConfigId;", "nextConfigId-hoCEiqs$camera_camera2_pipe", "nextConfigId", "", "nextGroupId$camera_camera2_pipe", "nextGroupId", "Lrkm/d;", "streamIds", "Lrkm/d;", "outputIds", "inputIds", "configIds", "groupIds", "", "Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "previewOutputTypes", "Ljava/util/List;", "Ljava/util/Comparator;", "Landroidx/camera/camera2/pipe/CameraStream;", "Lkotlin/Comparator;", "previewOutputTypesComparator", "Ljava/util/Comparator;", "Landroidx/camera/camera2/pipe/StreamFormat;", "previewFormats", "previewFormatComparator", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: nextConfigId-hoCEiqs$camera_camera2_pipe, reason: not valid java name */
        public final int m474nextConfigIdhoCEiqs$camera_camera2_pipe() {
            d dVar = StreamGraphImpl.configIds;
            dVar.getClass();
            return OutputConfigId.m464constructorimpl(d.f254895b.incrementAndGet(dVar));
        }

        public final int nextGroupId$camera_camera2_pipe() {
            d dVar = StreamGraphImpl.groupIds;
            dVar.getClass();
            return d.f254895b.incrementAndGet(dVar);
        }

        /* JADX INFO: renamed from: nextInputId-m1bwn9M$camera_camera2_pipe, reason: not valid java name */
        public final int m475nextInputIdm1bwn9M$camera_camera2_pipe() {
            d dVar = StreamGraphImpl.inputIds;
            dVar.getClass();
            return InputStreamId.m232constructorimpl(d.f254895b.incrementAndGet(dVar));
        }

        /* JADX INFO: renamed from: nextOutputId-4LaLFng$camera_camera2_pipe, reason: not valid java name */
        public final int m476nextOutputId4LaLFng$camera_camera2_pipe() {
            d dVar = StreamGraphImpl.outputIds;
            dVar.getClass();
            return OutputId.m245constructorimpl(d.f254895b.incrementAndGet(dVar));
        }

        /* JADX INFO: renamed from: nextStreamId-ptHMqGs$camera_camera2_pipe, reason: not valid java name */
        public final int m477nextStreamIdptHMqGs$camera_camera2_pipe() {
            d dVar = StreamGraphImpl.streamIds;
            dVar.getClass();
            return StreamId.m356constructorimpl(d.f254895b.incrementAndGet(dVar));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/camera/camera2/pipe/graph/StreamGraphImpl$InputStreamImpl;", "Landroidx/camera/camera2/pipe/InputStream;", "id", "Landroidx/camera/camera2/pipe/InputStreamId;", "maxImages", "", "format", "Landroidx/camera/camera2/pipe/StreamFormat;", "<init>", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getId-m1bwn9M", "()I", "I", "getMaxImages", "getFormat-8FPWQzE", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputStreamImpl implements InputStream {
        private final int format;
        private final int id;
        private final int maxImages;

        public /* synthetic */ InputStreamImpl(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, i3);
        }

        @Override // androidx.camera.camera2.pipe.InputStream
        /* JADX INFO: renamed from: getFormat-8FPWQzE, reason: from getter */
        public int getFormat() {
            return this.format;
        }

        @Override // androidx.camera.camera2.pipe.InputStream
        /* JADX INFO: renamed from: getId-m1bwn9M, reason: from getter */
        public int getId() {
            return this.id;
        }

        @Override // androidx.camera.camera2.pipe.InputStream
        public int getMaxImages() {
            return this.maxImages;
        }

        private InputStreamImpl(int i, int i2, int i3) {
            this.id = i;
            this.maxImages = i2;
            this.format = i3;
        }
    }

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b'\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010?\u001a\u0004\b@\u0010AR \u0010D\u001a\b\u0012\u0004\u0012\u00020C0B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010AR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020C0\u001a8F¢\u0006\u0006\u001a\u0004\bI\u0010AR\u0011\u0010N\u001a\u00020K8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010P\u001a\u00020K8F¢\u0006\u0006\u001a\u0004\bO\u0010M¨\u0006Q"}, d2 = {"Landroidx/camera/camera2/pipe/graph/StreamGraphImpl$OutputConfig;", "", "Landroidx/camera/camera2/pipe/graph/OutputConfigId;", "id", "Landroid/util/Size;", "size", "Landroidx/camera/camera2/pipe/StreamFormat;", "format", "Landroidx/camera/camera2/pipe/CameraId;", "camera", "", "groupNumber", "Landroid/hardware/camera2/params/OutputConfiguration;", "externalOutputConfig", "Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "deferredOutputType", "Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "mirrorMode", "Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "timestampBase", "Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "dynamicRangeProfile", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "streamUseCase", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "streamUseHint", "", "sensorPixelModes", "<init>", "(ILandroid/util/Size;ILjava/lang/String;Ljava/lang/Integer;Landroid/hardware/camera2/params/OutputConfiguration;Landroidx/camera/camera2/pipe/OutputStream$OutputType;Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "I", "getId-hoCEiqs", "()I", "Landroid/util/Size;", "getSize", "()Landroid/util/Size;", "getFormat-8FPWQzE", "Ljava/lang/String;", "getCamera-Dz_R5H8", "Ljava/lang/Integer;", "getGroupNumber", "()Ljava/lang/Integer;", "Landroid/hardware/camera2/params/OutputConfiguration;", "getExternalOutputConfig", "()Landroid/hardware/camera2/params/OutputConfiguration;", "Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "getDeferredOutputType", "()Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "getMirrorMode-dO1_9xk", "()Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "getDynamicRangeProfile-OoVcG5w", "()Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "getStreamUseCase-8x2ez34", "()Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "getStreamUseHint-HIPxoCc", "()Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "Ljava/util/List;", "getSensorPixelModes", "()Ljava/util/List;", "", "Landroidx/camera/camera2/pipe/CameraStream;", "streamBuilder", "getStreamBuilder$camera_camera2_pipe", "Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "getTimestampBase-pcPfPbY", "()Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "getStreams", "streams", "", "getDeferrable", "()Z", "deferrable", "getSurfaceSharing", "surfaceSharing", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OutputConfig {

        @NotNull
        private final String camera;
        private final OutputStream.OutputType deferredOutputType;
        private final OutputStream.DynamicRangeProfile dynamicRangeProfile;
        private final OutputConfiguration externalOutputConfig;
        private final int format;
        private final Integer groupNumber;
        private final int id;
        private final OutputStream.MirrorMode mirrorMode;

        @NotNull
        private final List<Object> sensorPixelModes;

        @NotNull
        private final Size size;

        @NotNull
        private final List<CameraStream> streamBuilder;
        private final OutputStream.StreamUseCase streamUseCase;
        private final OutputStream.StreamUseHint streamUseHint;

        public /* synthetic */ OutputConfig(int i, Size size, int i2, String str, Integer num, OutputConfiguration outputConfiguration, OutputStream.OutputType outputType, OutputStream.MirrorMode mirrorMode, OutputStream.TimestampBase timestampBase, OutputStream.DynamicRangeProfile dynamicRangeProfile, OutputStream.StreamUseCase streamUseCase, OutputStream.StreamUseHint streamUseHint, List list, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, size, i2, str, num, outputConfiguration, outputType, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, list);
        }

        @NotNull
        /* JADX INFO: renamed from: getCamera-Dz_R5H8, reason: not valid java name and from getter */
        public final String getCamera() {
            return this.camera;
        }

        public final boolean getDeferrable() {
            return this.deferredOutputType != null;
        }

        public final OutputStream.OutputType getDeferredOutputType() {
            return this.deferredOutputType;
        }

        /* JADX INFO: renamed from: getDynamicRangeProfile-OoVcG5w, reason: not valid java name and from getter */
        public final OutputStream.DynamicRangeProfile getDynamicRangeProfile() {
            return this.dynamicRangeProfile;
        }

        public final OutputConfiguration getExternalOutputConfig() {
            return this.externalOutputConfig;
        }

        /* JADX INFO: renamed from: getFormat-8FPWQzE, reason: not valid java name and from getter */
        public final int getFormat() {
            return this.format;
        }

        public final Integer getGroupNumber() {
            return this.groupNumber;
        }

        /* JADX INFO: renamed from: getMirrorMode-dO1_9xk, reason: not valid java name and from getter */
        public final OutputStream.MirrorMode getMirrorMode() {
            return this.mirrorMode;
        }

        @NotNull
        public final List<Object> getSensorPixelModes() {
            return this.sensorPixelModes;
        }

        @NotNull
        public final Size getSize() {
            return this.size;
        }

        @NotNull
        public final List<CameraStream> getStreamBuilder$camera_camera2_pipe() {
            return this.streamBuilder;
        }

        /* JADX INFO: renamed from: getStreamUseCase-8x2ez34, reason: not valid java name and from getter */
        public final OutputStream.StreamUseCase getStreamUseCase() {
            return this.streamUseCase;
        }

        /* JADX INFO: renamed from: getStreamUseHint-HIPxoCc, reason: not valid java name and from getter */
        public final OutputStream.StreamUseHint getStreamUseHint() {
            return this.streamUseHint;
        }

        @NotNull
        public final List<CameraStream> getStreams() {
            return this.streamBuilder;
        }

        public final boolean getSurfaceSharing() {
            return this.streamBuilder.size() > 1;
        }

        /* JADX INFO: renamed from: getTimestampBase-pcPfPbY, reason: not valid java name */
        public final OutputStream.TimestampBase m484getTimestampBasepcPfPbY() {
            return null;
        }

        @NotNull
        public String toString() {
            return OutputConfigId.m465toStringimpl(this.id);
        }

        private OutputConfig(int i, Size size, int i2, String camera, Integer num, OutputConfiguration outputConfiguration, OutputStream.OutputType outputType, OutputStream.MirrorMode mirrorMode, OutputStream.TimestampBase timestampBase, OutputStream.DynamicRangeProfile dynamicRangeProfile, OutputStream.StreamUseCase streamUseCase, OutputStream.StreamUseHint streamUseHint, List<Object> sensorPixelModes) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(camera, "camera");
            Intrinsics.checkNotNullParameter(sensorPixelModes, "sensorPixelModes");
            this.id = i;
            this.size = size;
            this.format = i2;
            this.camera = camera;
            this.groupNumber = num;
            this.externalOutputConfig = outputConfiguration;
            this.deferredOutputType = outputType;
            this.mirrorMode = mirrorMode;
            this.dynamicRangeProfile = dynamicRangeProfile;
            this.streamUseCase = streamUseCase;
            this.streamUseHint = streamUseHint;
            this.sensorPixelModes = sensorPixelModes;
            this.streamBuilder = new ArrayList();
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b1\u00102R\"\u00104\u001a\u0002038\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Landroidx/camera/camera2/pipe/graph/StreamGraphImpl$OutputStreamImpl;", "Landroidx/camera/camera2/pipe/OutputStream;", "Landroidx/camera/camera2/pipe/OutputId;", "id", "Landroid/util/Size;", "size", "Landroidx/camera/camera2/pipe/StreamFormat;", "format", "Landroidx/camera/camera2/pipe/CameraId;", "camera", "Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "mirrorMode", "Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "timestampBase", "Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "dynamicRangeProfile", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "streamUseCase", "Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "outputType", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "streamUseHint", "<init>", "(ILandroid/util/Size;ILjava/lang/String;Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;Landroidx/camera/camera2/pipe/OutputStream$OutputType;Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "I", "getId-4LaLFng", "()I", "Landroid/util/Size;", "getSize", "()Landroid/util/Size;", "getFormat-8FPWQzE", "Ljava/lang/String;", "getCamera-Dz_R5H8", "Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "getMirrorMode-dO1_9xk", "()Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "getDynamicRangeProfile-OoVcG5w", "()Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "getStreamUseCase-8x2ez34", "()Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "getOutputType", "()Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "getStreamUseHint-HIPxoCc", "()Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "Landroidx/camera/camera2/pipe/CameraStream;", "stream", "Landroidx/camera/camera2/pipe/CameraStream;", "getStream", "()Landroidx/camera/camera2/pipe/CameraStream;", "setStream", "(Landroidx/camera/camera2/pipe/CameraStream;)V", "Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "getTimestampBase-pcPfPbY", "()Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OutputStreamImpl implements OutputStream {

        @NotNull
        private final String camera;
        private final OutputStream.DynamicRangeProfile dynamicRangeProfile;
        private final int format;
        private final int id;
        private final OutputStream.MirrorMode mirrorMode;
        private final OutputStream.OutputType outputType;

        @NotNull
        private final Size size;
        public CameraStream stream;
        private final OutputStream.StreamUseCase streamUseCase;
        private final OutputStream.StreamUseHint streamUseHint;

        public /* synthetic */ OutputStreamImpl(int i, Size size, int i2, String str, OutputStream.MirrorMode mirrorMode, OutputStream.TimestampBase timestampBase, OutputStream.DynamicRangeProfile dynamicRangeProfile, OutputStream.StreamUseCase streamUseCase, OutputStream.OutputType outputType, OutputStream.StreamUseHint streamUseHint, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, size, i2, str, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, outputType, streamUseHint);
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        @NotNull
        /* JADX INFO: renamed from: getCamera-Dz_R5H8, reason: from getter */
        public String getCamera() {
            return this.camera;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* JADX INFO: renamed from: getDynamicRangeProfile-OoVcG5w, reason: from getter */
        public OutputStream.DynamicRangeProfile getDynamicRangeProfile() {
            return this.dynamicRangeProfile;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* JADX INFO: renamed from: getFormat-8FPWQzE, reason: from getter */
        public int getFormat() {
            return this.format;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* JADX INFO: renamed from: getId-4LaLFng, reason: from getter */
        public int getId() {
            return this.id;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* JADX INFO: renamed from: getMirrorMode-dO1_9xk, reason: from getter */
        public OutputStream.MirrorMode getMirrorMode() {
            return this.mirrorMode;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        public OutputStream.OutputType getOutputType() {
            return this.outputType;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        @NotNull
        public Size getSize() {
            return this.size;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        @NotNull
        public CameraStream getStream() {
            CameraStream cameraStream = this.stream;
            if (cameraStream != null) {
                return cameraStream;
            }
            Intrinsics.r("stream");
            throw null;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* JADX INFO: renamed from: getStreamUseCase-8x2ez34, reason: from getter */
        public OutputStream.StreamUseCase getStreamUseCase() {
            return this.streamUseCase;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* JADX INFO: renamed from: getStreamUseHint-HIPxoCc, reason: from getter */
        public OutputStream.StreamUseHint getStreamUseHint() {
            return this.streamUseHint;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* JADX INFO: renamed from: getTimestampBase-pcPfPbY */
        public OutputStream.TimestampBase mo269getTimestampBasepcPfPbY() {
            return null;
        }

        public void setStream(@NotNull CameraStream cameraStream) {
            Intrinsics.checkNotNullParameter(cameraStream, "<set-?>");
            this.stream = cameraStream;
        }

        @NotNull
        public String toString() {
            return OutputId.m249toStringimpl(getId());
        }

        private OutputStreamImpl(int i, Size size, int i2, String camera, OutputStream.MirrorMode mirrorMode, OutputStream.TimestampBase timestampBase, OutputStream.DynamicRangeProfile dynamicRangeProfile, OutputStream.StreamUseCase streamUseCase, OutputStream.OutputType outputType, OutputStream.StreamUseHint streamUseHint) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(camera, "camera");
            this.id = i;
            this.size = size;
            this.format = i2;
            this.camera = camera;
            this.mirrorMode = mirrorMode;
            this.dynamicRangeProfile = dynamicRangeProfile;
            this.streamUseCase = streamUseCase;
            this.outputType = outputType;
            this.streamUseHint = streamUseHint;
        }
    }

    static {
        OutputStream.OutputType.Companion companion = OutputStream.OutputType.INSTANCE;
        previewOutputTypes = v.k(companion.getSURFACE_VIEW(), companion.getSURFACE_TEXTURE());
        previewOutputTypesComparator = new Comparator() { // from class: androidx.camera.camera2.pipe.graph.StreamGraphImpl$special$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                Iterator<T> it8 = ((CameraStream) t2).getOutputs().iterator();
                if (!it8.hasNext()) {
                    throw new NoSuchElementException();
                }
                OutputStream outputStream = (OutputStream) it8.next();
                Integer numValueOf = Integer.valueOf(d0.g0(outputStream.getOutputType(), StreamGraphImpl.previewOutputTypes));
                while (it8.hasNext()) {
                    OutputStream outputStream2 = (OutputStream) it8.next();
                    Integer numValueOf2 = Integer.valueOf(d0.g0(outputStream2.getOutputType(), StreamGraphImpl.previewOutputTypes));
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                Iterator<T> it9 = ((CameraStream) t3).getOutputs().iterator();
                if (!it9.hasNext()) {
                    throw new NoSuchElementException();
                }
                OutputStream outputStream3 = (OutputStream) it9.next();
                Integer numValueOf3 = Integer.valueOf(d0.g0(outputStream3.getOutputType(), StreamGraphImpl.previewOutputTypes));
                while (it9.hasNext()) {
                    OutputStream outputStream4 = (OutputStream) it9.next();
                    Integer numValueOf4 = Integer.valueOf(d0.g0(outputStream4.getOutputType(), StreamGraphImpl.previewOutputTypes));
                    if (numValueOf3.compareTo(numValueOf4) < 0) {
                        numValueOf3 = numValueOf4;
                    }
                }
                return cim.b.b(numValueOf, numValueOf3);
            }
        };
        StreamFormat.Companion companion2 = StreamFormat.INSTANCE;
        previewFormats = v.k(StreamFormat.m343boximpl(companion2.m352getUNKNOWN8FPWQzE()), StreamFormat.m343boximpl(companion2.m351getPRIVATE8FPWQzE()));
        previewFormatComparator = new Comparator() { // from class: androidx.camera.camera2.pipe.graph.StreamGraphImpl$special$$inlined$compareBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                Iterator<T> it8 = ((CameraStream) t2).getOutputs().iterator();
                if (!it8.hasNext()) {
                    throw new NoSuchElementException();
                }
                Integer numValueOf = Integer.valueOf(StreamGraphImpl.previewFormats.indexOf(StreamFormat.m343boximpl(((OutputStream) it8.next()).getFormat())));
                while (it8.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(StreamGraphImpl.previewFormats.indexOf(StreamFormat.m343boximpl(((OutputStream) it8.next()).getFormat())));
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                Iterator<T> it9 = ((CameraStream) t3).getOutputs().iterator();
                if (!it9.hasNext()) {
                    throw new NoSuchElementException();
                }
                Integer numValueOf3 = Integer.valueOf(StreamGraphImpl.previewFormats.indexOf(StreamFormat.m343boximpl(((OutputStream) it9.next()).getFormat())));
                while (it9.hasNext()) {
                    Integer numValueOf4 = Integer.valueOf(StreamGraphImpl.previewFormats.indexOf(StreamFormat.m343boximpl(((OutputStream) it9.next()).getFormat())));
                    if (numValueOf3.compareTo(numValueOf4) < 0) {
                        numValueOf3 = numValueOf4;
                    }
                }
                return cim.b.b(numValueOf, numValueOf3);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARN: Type inference failed for: r28v0, types: [androidx.camera.camera2.pipe.graph.StreamGraphImpl] */
    /* JADX WARN: Type inference failed for: r4v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List<androidx.camera.camera2.pipe.InputStream>] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StreamGraphImpl(@org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.CameraMetadata r29, @org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.CameraGraph.Config r30, @org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.media.ImageSources r31, @org.jetbrains.annotations.NotNull phm.a r32) {
        /*
            Method dump skipped, instruction units count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.graph.StreamGraphImpl.<init>(androidx.camera.camera2.pipe.CameraMetadata, androidx.camera.camera2.pipe.CameraGraph$Config, androidx.camera.camera2.pipe.media.ImageSources, phm.a):void");
    }

    private final boolean computeIfDeferredStreamsAreSupported(CameraMetadata cameraMetadata, CameraGraph.Config graphConfig) {
        if (!CameraGraph.OperatingMode.m170equalsimpl0(graphConfig.getSessionMode(), CameraGraph.OperatingMode.INSTANCE.m176getNORMAL2uNL3no())) {
            return false;
        }
        CameraMetadata.Companion companion = CameraMetadata.INSTANCE;
        return (companion.isHardwareLevelLegacy(cameraMetadata) || companion.isHardwareLevelLimited(cameraMetadata) || companion.isHardwareLevelExternal(cameraMetadata)) ? false : true;
    }

    private final int computeNextSurfaceGroupId(CameraGraph.Config graphConfig) {
        List<Integer> existingGroupNumbers = readExistingGroupNumbers(graphConfig.getStreams());
        int iNextGroupId$camera_camera2_pipe = INSTANCE.nextGroupId$camera_camera2_pipe();
        while (existingGroupNumbers.contains(Integer.valueOf(iNextGroupId$camera_camera2_pipe))) {
            iNextGroupId$camera_camera2_pipe = INSTANCE.nextGroupId$camera_camera2_pipe();
        }
        return iNextGroupId$camera_camera2_pipe;
    }

    private final OutputConfiguration getOutputConfigurationOrNull(OutputStream.Config outputConfig) {
        return null;
    }

    private final List<Integer> readExistingGroupNumbers(List<CameraStream.Config> outputs) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it8 = outputs.iterator();
        while (it8.hasNext()) {
            a0.x(((CameraStream.Config) it8.next()).getOutputs(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            it9.next();
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it10 = arrayList2.iterator();
        if (it10.hasNext()) {
            throw v0.a.e(it10);
        }
        return arrayList3;
    }

    private final List<CameraStream> sortOutputsByPreviewStream(List<CameraStream> unsortedStreams) {
        boolean z;
        boolean z3;
        List<CameraStream> list = unsortedStreams;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it8 = list.iterator();
        while (true) {
            boolean z4 = true;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            List<OutputStream> outputs = ((CameraStream) next).getOutputs();
            if ((outputs instanceof Collection) && outputs.isEmpty()) {
                z4 = false;
            } else {
                Iterator<T> it9 = outputs.iterator();
                while (it9.hasNext()) {
                    OutputStream.StreamUseCase streamUseCase = ((OutputStream) it9.next()).getStreamUseCase();
                    if (streamUseCase == null ? false : OutputStream.StreamUseCase.m298equalsimpl0(streamUseCase.getValue(), OutputStream.StreamUseCase.INSTANCE.m303getPREVIEWvrKr8v8())) {
                        break;
                    }
                }
                z4 = false;
            }
            if (z4) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            return d0.E0(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            List<OutputStream> outputs2 = ((CameraStream) obj2).getOutputs();
            if ((outputs2 instanceof Collection) && outputs2.isEmpty()) {
                z3 = false;
            } else {
                Iterator<T> it10 = outputs2.iterator();
                while (it10.hasNext()) {
                    if (d0.T(previewOutputTypes, ((OutputStream) it10.next()).getOutputType())) {
                        z3 = true;
                        break;
                    }
                }
                z3 = false;
            }
            if (z3) {
                arrayList3.add(obj2);
            } else {
                arrayList4.add(obj2);
            }
        }
        if (!arrayList3.isEmpty()) {
            return d0.E0(arrayList4, d0.P0(arrayList3, previewOutputTypesComparator));
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        for (Object obj3 : list) {
            List<OutputStream> outputs3 = ((CameraStream) obj3).getOutputs();
            if ((outputs3 instanceof Collection) && outputs3.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it11 = outputs3.iterator();
                while (it11.hasNext()) {
                    if (previewFormats.contains(StreamFormat.m343boximpl(((OutputStream) it11.next()).getFormat()))) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            if (z) {
                arrayList5.add(obj3);
            } else {
                arrayList6.add(obj3);
            }
        }
        return !arrayList5.isEmpty() ? d0.E0(arrayList6, d0.P0(arrayList5, previewFormatComparator)) : unsortedStreams;
    }

    private final List<CameraStream> sortOutputsByVideoStream(List<CameraStream> unsortedOutputs) {
        boolean z;
        List<CameraStream> list = unsortedOutputs;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it8 = list.iterator();
        while (true) {
            boolean z3 = true;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            List<OutputStream> outputs = ((CameraStream) next).getOutputs();
            if ((outputs instanceof Collection) && outputs.isEmpty()) {
                z3 = false;
            } else {
                Iterator<T> it9 = outputs.iterator();
                while (it9.hasNext()) {
                    OutputStream.StreamUseCase streamUseCase = ((OutputStream) it9.next()).getStreamUseCase();
                    if (streamUseCase == null ? false : OutputStream.StreamUseCase.m298equalsimpl0(streamUseCase.getValue(), OutputStream.StreamUseCase.INSTANCE.m304getVIDEO_RECORDvrKr8v8())) {
                        break;
                    }
                }
                z3 = false;
            }
            if (z3) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            return d0.E0(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            List<OutputStream> outputs2 = ((CameraStream) obj2).getOutputs();
            if ((outputs2 instanceof Collection) && outputs2.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it10 = outputs2.iterator();
                while (it10.hasNext()) {
                    OutputStream.StreamUseHint streamUseHint = ((OutputStream) it10.next()).getStreamUseHint();
                    if (streamUseHint == null ? false : OutputStream.StreamUseHint.m308equalsimpl0(streamUseHint.getValue(), OutputStream.StreamUseHint.INSTANCE.m313getVIDEO_RECORD4VYZOf8())) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            if (z) {
                arrayList3.add(obj2);
            } else {
                arrayList4.add(obj2);
            }
        }
        return !arrayList3.isEmpty() ? d0.E0(arrayList3, arrayList4) : unsortedOutputs;
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        boolean zIsTerminated;
        for (AutoCloseable autoCloseable : this.imageSourceMap.values()) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else {
                if (!(autoCloseable instanceof MediaMetadataRetriever)) {
                    throw new IllegalArgumentException();
                }
                ((MediaMetadataRetriever) autoCloseable).release();
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.StreamGraph
    public CameraStream get(@NotNull CameraStream.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return this._streamMap.get(config);
    }

    /* JADX INFO: renamed from: getCameraStreamConfig-aKI5c8E, reason: not valid java name */
    public final CameraStream.Config m473getCameraStreamConfigaKI5c8E(int streamId) {
        Object next;
        Iterator<T> it8 = this._streamMap.entrySet().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (StreamId.m358equalsimpl0(((CameraStream) ((Map.Entry) next).getValue()).getId(), streamId)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (CameraStream.Config) entry.getKey();
        }
        return null;
    }

    @NotNull
    public final Map<StreamId, ImageSource> getImageSourceMap$camera_camera2_pipe() {
        return this.imageSourceMap;
    }

    @Override // androidx.camera.camera2.pipe.StreamGraph
    @NotNull
    public List<InputStream> getInputs() {
        return this.inputs;
    }

    @NotNull
    public final Map<OutputStream, OutputConfig> getOutputConfigMap$camera_camera2_pipe() {
        return this.outputConfigMap;
    }

    @NotNull
    public final List<OutputConfig> getOutputConfigs$camera_camera2_pipe() {
        return this.outputConfigs;
    }

    @Override // androidx.camera.camera2.pipe.StreamGraph
    @NotNull
    public List<OutputStream> getOutputs() {
        return this.outputs;
    }

    @Override // androidx.camera.camera2.pipe.StreamGraph
    @NotNull
    public List<CameraStream> getStreams() {
        return this.streams;
    }

    @NotNull
    public String toString() {
        return "StreamGraph(" + this._streamMap + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
