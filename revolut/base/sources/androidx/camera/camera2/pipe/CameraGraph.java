package androidx.camera.camera2.pipe;

import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.InputStream;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.compat.Camera2Quirks;
import androidx.camera.camera2.pipe.core.Log;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;
import skm.g0;
import vc.s;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007\u0004\u0005\u0006\u0007\b\t\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph;", "Landroidx/camera/camera2/pipe/CameraGraphBase;", "Landroidx/camera/camera2/pipe/CameraGraph$Session;", "Landroidx/camera/camera2/pipe/CameraControls3A;", "Config", "ConcurrentConfig", "RepeatingRequestRequirementsBeforeCapture", "Flags", "OperatingMode", "Constants3A", "Session", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CameraGraph extends CameraGraphBase<Session>, CameraControls3A {

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$ConcurrentConfig;", "", "graphConfigs", "", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "<init>", "(Ljava/util/List;)V", "getGraphConfigs", "()Ljava/util/List;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConcurrentConfig {

        @NotNull
        private final List<Config> graphConfigs;

        /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0053 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:44:? A[LOOP:1: B:10:0x002e->B:44:?, LOOP_END, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ConcurrentConfig(@org.jetbrains.annotations.NotNull java.util.List<androidx.camera.camera2.pipe.CameraGraph.Config> r6) {
            /*
                r5 = this;
                java.lang.String r0 = "graphConfigs"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                r5.<init>()
                r5.graphConfigs = r6
                int r0 = r6.size()
                r1 = 2
                if (r0 < r1) goto La5
                java.lang.Object r0 = zhm.d0.b0(r6)
                androidx.camera.camera2.pipe.CameraGraph$Config r0 = (androidx.camera.camera2.pipe.CameraGraph.Config) r0
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                boolean r1 = r6 instanceof java.util.Collection
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L2a
                r1 = r6
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L2a
            L28:
                r6 = r3
                goto L54
            L2a:
                java.util.Iterator r6 = r6.iterator()
            L2e:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L28
                java.lang.Object r1 = r6.next()
                androidx.camera.camera2.pipe.CameraGraph$Config r1 = (androidx.camera.camera2.pipe.CameraGraph.Config) r1
                java.lang.String r1 = r1.getCameraBackendId()
                java.lang.String r4 = r0.getCameraBackendId()
                if (r1 != 0) goto L4a
                if (r4 != 0) goto L48
                r1 = r3
                goto L51
            L48:
                r1 = r2
                goto L51
            L4a:
                if (r4 != 0) goto L4d
                goto L48
            L4d:
                boolean r1 = androidx.camera.camera2.pipe.CameraBackendId.m108equalsimpl0(r1, r4)
            L51:
                if (r1 != 0) goto L2e
                r6 = r2
            L54:
                if (r6 == 0) goto L9d
                java.util.List<androidx.camera.camera2.pipe.CameraGraph$Config> r6 = r5.graphConfigs
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = zhm.w.t(r6, r1)
                r0.<init>(r1)
                java.util.Iterator r6 = r6.iterator()
            L69:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L81
                java.lang.Object r1 = r6.next()
                androidx.camera.camera2.pipe.CameraGraph$Config r1 = (androidx.camera.camera2.pipe.CameraGraph.Config) r1
                java.lang.String r1 = r1.getCamera()
                androidx.camera.camera2.pipe.CameraId r1 = androidx.camera.camera2.pipe.CameraId.m181boximpl(r1)
                r0.add(r1)
                goto L69
            L81:
                java.util.List r6 = zhm.d0.U(r0)
                int r6 = r6.size()
                java.util.List<androidx.camera.camera2.pipe.CameraGraph$Config> r0 = r5.graphConfigs
                int r0 = r0.size()
                if (r6 != r0) goto L92
                r2 = r3
            L92:
                if (r2 == 0) goto L95
                return
            L95:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Each CameraGraph.Config must have a distinct camera id!"
                r6.<init>(r0)
                throw r6
            L9d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Each CameraGraph.Config must use the same camera backend!"
                r6.<init>(r0)
                throw r6
            La5:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Cannot create ConcurrentGraphConfig without 2 or more CameraGraph.Config(s)"
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.CameraGraph.ConcurrentConfig.<init>(java.util.List):void");
        }

        @NotNull
        public final List<Config> getGraphConfigs() {
            return this.graphConfigs;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010&R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u00102R#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b3\u00102R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b4\u00102R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u00107R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010)R#\u0010\u000e\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b=\u0010)R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b>\u0010)R#\u0010\u0012\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\b?\u0010<R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\b@\u00102R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u00100\u001a\u0004\bA\u00102R#\u0010\u0017\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0017\u0010:\u001a\u0004\bB\u0010<R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010.\u001a\u0004\bC\u0010&R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\bM\u0010&R$\u0010O\u001a\u0004\u0018\u00010N8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006U"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$Config;", "", "Landroidx/camera/camera2/pipe/CameraId;", "camera", "", "Landroidx/camera/camera2/pipe/CameraStream$Config;", "streams", "exclusiveStreamGroups", "Landroidx/camera/camera2/pipe/InputStream$Config;", "input", "postviewStream", "Landroidx/camera/camera2/pipe/RequestTemplate;", "sessionTemplate", "", "sessionParameters", "Landroidx/camera/camera2/pipe/CameraGraph$OperatingMode;", "sessionMode", "defaultTemplate", "defaultParameters", "Landroidx/camera/camera2/pipe/Request$Listener;", "defaultListeners", "Landroidx/camera/camera2/pipe/GraphStateListener;", "graphStateListeners", "requiredParameters", "Landroidx/camera/camera2/pipe/CameraBackendId;", "cameraBackendId", "Landroidx/camera/camera2/pipe/CameraBackendFactory;", "customCameraBackend", "Landroidx/camera/camera2/pipe/MetadataTransform;", "metadataTransform", "Landroidx/camera/camera2/pipe/CameraGraph$Flags;", "flags", "Landroidx/camera/camera2/pipe/CameraColorSpace;", "sessionColorSpace", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/camera2/pipe/CameraStream$Config;ILjava/util/Map;IILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Landroidx/camera/camera2/pipe/CameraBackendFactory;Landroidx/camera/camera2/pipe/MetadataTransform;Landroidx/camera/camera2/pipe/CameraGraph$Flags;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCamera-Dz_R5H8", "Ljava/util/List;", "getStreams", "()Ljava/util/List;", "getExclusiveStreamGroups", "getInput", "Landroidx/camera/camera2/pipe/CameraStream$Config;", "getPostviewStream", "()Landroidx/camera/camera2/pipe/CameraStream$Config;", "I", "getSessionTemplate-fGx8uWA", "Ljava/util/Map;", "getSessionParameters", "()Ljava/util/Map;", "getSessionMode-2uNL3no", "getDefaultTemplate-fGx8uWA", "getDefaultParameters", "getDefaultListeners", "getGraphStateListeners", "getRequiredParameters", "getCameraBackendId-AKmI2lo", "Landroidx/camera/camera2/pipe/CameraBackendFactory;", "getCustomCameraBackend", "()Landroidx/camera/camera2/pipe/CameraBackendFactory;", "Landroidx/camera/camera2/pipe/MetadataTransform;", "getMetadataTransform", "()Landroidx/camera/camera2/pipe/MetadataTransform;", "Landroidx/camera/camera2/pipe/CameraGraph$Flags;", "getFlags", "()Landroidx/camera/camera2/pipe/CameraGraph$Flags;", "getSessionColorSpace-dxVZaPA", "Landroidx/camera/camera2/pipe/ConcurrentCameraGraphs;", "concurrentCameraGraphs", "Landroidx/camera/camera2/pipe/ConcurrentCameraGraphs;", "getConcurrentCameraGraphs$camera_camera2_pipe", "()Landroidx/camera/camera2/pipe/ConcurrentCameraGraphs;", "setConcurrentCameraGraphs$camera_camera2_pipe", "(Landroidx/camera/camera2/pipe/ConcurrentCameraGraphs;)V", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Config {

        @NotNull
        private final String camera;
        private final String cameraBackendId;
        private ConcurrentCameraGraphs concurrentCameraGraphs;
        private final CameraBackendFactory customCameraBackend;

        @NotNull
        private final List<Request.Listener> defaultListeners;

        @NotNull
        private final Map<?, Object> defaultParameters;
        private final int defaultTemplate;

        @NotNull
        private final List<List<CameraStream.Config>> exclusiveStreamGroups;

        @NotNull
        private final Flags flags;

        @NotNull
        private final List<GraphStateListener> graphStateListeners;
        private final List<InputStream.Config> input;

        @NotNull
        private final MetadataTransform metadataTransform;
        private final CameraStream.Config postviewStream;

        @NotNull
        private final Map<?, Object> requiredParameters;
        private final String sessionColorSpace;
        private final int sessionMode;

        @NotNull
        private final Map<?, Object> sessionParameters;
        private final int sessionTemplate;

        @NotNull
        private final List<CameraStream.Config> streams;

        public /* synthetic */ Config(String str, List list, List list2, List list3, CameraStream.Config config, int i, Map map, int i2, int i3, Map map2, List list4, List list5, Map map3, String str2, CameraBackendFactory cameraBackendFactory, MetadataTransform metadataTransform, Flags flags, String str3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, list2, list3, config, i, map, i2, i3, map2, list4, list5, map3, str2, cameraBackendFactory, metadataTransform, flags, str3);
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00dc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r5) {
            /*
                Method dump skipped, instruction units count: 233
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.CameraGraph.Config.equals(java.lang.Object):boolean");
        }

        @NotNull
        /* JADX INFO: renamed from: getCamera-Dz_R5H8, reason: not valid java name and from getter */
        public final String getCamera() {
            return this.camera;
        }

        /* JADX INFO: renamed from: getCameraBackendId-AKmI2lo, reason: not valid java name and from getter */
        public final String getCameraBackendId() {
            return this.cameraBackendId;
        }

        /* JADX INFO: renamed from: getConcurrentCameraGraphs$camera_camera2_pipe, reason: from getter */
        public final ConcurrentCameraGraphs getConcurrentCameraGraphs() {
            return this.concurrentCameraGraphs;
        }

        public final CameraBackendFactory getCustomCameraBackend() {
            return this.customCameraBackend;
        }

        @NotNull
        public final List<Request.Listener> getDefaultListeners() {
            return this.defaultListeners;
        }

        @NotNull
        public final Map<?, Object> getDefaultParameters() {
            return this.defaultParameters;
        }

        /* JADX INFO: renamed from: getDefaultTemplate-fGx8uWA, reason: not valid java name and from getter */
        public final int getDefaultTemplate() {
            return this.defaultTemplate;
        }

        @NotNull
        public final List<List<CameraStream.Config>> getExclusiveStreamGroups() {
            return this.exclusiveStreamGroups;
        }

        @NotNull
        public final Flags getFlags() {
            return this.flags;
        }

        @NotNull
        public final List<GraphStateListener> getGraphStateListeners() {
            return this.graphStateListeners;
        }

        public final List<InputStream.Config> getInput() {
            return this.input;
        }

        public final CameraStream.Config getPostviewStream() {
            return this.postviewStream;
        }

        @NotNull
        public final Map<?, Object> getRequiredParameters() {
            return this.requiredParameters;
        }

        /* JADX INFO: renamed from: getSessionColorSpace-dxVZaPA, reason: not valid java name and from getter */
        public final String getSessionColorSpace() {
            return this.sessionColorSpace;
        }

        /* JADX INFO: renamed from: getSessionMode-2uNL3no, reason: not valid java name and from getter */
        public final int getSessionMode() {
            return this.sessionMode;
        }

        @NotNull
        public final Map<?, Object> getSessionParameters() {
            return this.sessionParameters;
        }

        /* JADX INFO: renamed from: getSessionTemplate-fGx8uWA, reason: not valid java name and from getter */
        public final int getSessionTemplate() {
            return this.sessionTemplate;
        }

        @NotNull
        public final List<CameraStream.Config> getStreams() {
            return this.streams;
        }

        public int hashCode() {
            int iD = a.d(a.d(CameraId.m185hashCodeimpl(this.camera) * 31, 31, this.streams), 31, this.exclusiveStreamGroups);
            List<InputStream.Config> list = this.input;
            int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
            CameraStream.Config config = this.postviewStream;
            int iE = a.e(a.d(a.d(a.e((RequestTemplate.m329hashCodeimpl(this.defaultTemplate) + ((OperatingMode.m171hashCodeimpl(this.sessionMode) + a.e((RequestTemplate.m329hashCodeimpl(this.sessionTemplate) + ((iHashCode + (config == null ? 0 : config.hashCode())) * 31)) * 31, 31, this.sessionParameters)) * 31)) * 31, 31, this.defaultParameters), 31, this.defaultListeners), 31, this.graphStateListeners), 31, this.requiredParameters);
            String str = this.cameraBackendId;
            int iM109hashCodeimpl = (iE + (str == null ? 0 : CameraBackendId.m109hashCodeimpl(str))) * 31;
            CameraBackendFactory cameraBackendFactory = this.customCameraBackend;
            int iHashCode2 = (this.flags.hashCode() + ((this.metadataTransform.hashCode() + ((iM109hashCodeimpl + (cameraBackendFactory == null ? 0 : cameraBackendFactory.hashCode())) * 31)) * 31)) * 31;
            String str2 = this.sessionColorSpace;
            return iHashCode2 + (str2 != null ? CameraColorSpace.m115hashCodeimpl(str2) : 0);
        }

        public final void setConcurrentCameraGraphs$camera_camera2_pipe(ConcurrentCameraGraphs concurrentCameraGraphs) {
            this.concurrentCameraGraphs = concurrentCameraGraphs;
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("Config(camera=");
            sb6.append((Object) CameraId.m186toStringimpl(this.camera));
            sb6.append(", streams=");
            sb6.append(this.streams);
            sb6.append(", exclusiveStreamGroups=");
            sb6.append(this.exclusiveStreamGroups);
            sb6.append(", input=");
            sb6.append(this.input);
            sb6.append(", postviewStream=");
            sb6.append(this.postviewStream);
            sb6.append(", sessionTemplate=");
            sb6.append((Object) RequestTemplate.m330toStringimpl(this.sessionTemplate));
            sb6.append(", sessionParameters=");
            sb6.append(this.sessionParameters);
            sb6.append(", sessionMode=");
            sb6.append((Object) OperatingMode.m172toStringimpl(this.sessionMode));
            sb6.append(", defaultTemplate=");
            sb6.append((Object) RequestTemplate.m330toStringimpl(this.defaultTemplate));
            sb6.append(", defaultParameters=");
            sb6.append(this.defaultParameters);
            sb6.append(", defaultListeners=");
            sb6.append(this.defaultListeners);
            sb6.append(", graphStateListeners=");
            sb6.append(this.graphStateListeners);
            sb6.append(", requiredParameters=");
            sb6.append(this.requiredParameters);
            sb6.append(", cameraBackendId=");
            String str = this.cameraBackendId;
            sb6.append((Object) (str == null ? "null" : CameraBackendId.m110toStringimpl(str)));
            sb6.append(", customCameraBackend=");
            sb6.append(this.customCameraBackend);
            sb6.append(", metadataTransform=");
            sb6.append(this.metadataTransform);
            sb6.append(", flags=");
            sb6.append(this.flags);
            sb6.append(", sessionColorSpace=");
            String str2 = this.sessionColorSpace;
            sb6.append((Object) (str2 != null ? CameraColorSpace.m117toStringimpl(str2) : "null"));
            sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sb6.toString();
        }

        public Config(String str, List list, List list2, List list3, CameraStream.Config config, int i, Map map, int i2, int i3, Map map2, List list4, List list5, Map map3, String str2, CameraBackendFactory cameraBackendFactory, MetadataTransform metadataTransform, Flags flags, String str3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, (i5 & 4) != 0 ? f0.f322471a : list2, (i5 & 8) != 0 ? null : list3, (i5 & 16) != 0 ? null : config, (i5 & 32) != 0 ? RequestTemplate.m325constructorimpl(1) : i, (i5 & 64) != 0 ? r0.g() : map, (i5 & 128) != 0 ? OperatingMode.INSTANCE.m176getNORMAL2uNL3no() : i2, (i5 & 256) != 0 ? RequestTemplate.m325constructorimpl(1) : i3, (i5 & 512) != 0 ? r0.g() : map2, (i5 & 1024) != 0 ? f0.f322471a : list4, (i5 & 2048) != 0 ? f0.f322471a : list5, (i5 & 4096) != 0 ? r0.g() : map3, (i5 & 8192) != 0 ? null : str2, (i5 & 16384) != 0 ? null : cameraBackendFactory, (32768 & i5) != 0 ? new MetadataTransform(0, 0, null, 7, null) : metadataTransform, (65536 & i5) != 0 ? new Flags(false, false, null, null, 0, false, false, false, 255, null) : flags, (i5 & 131072) != 0 ? null : str3, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Config(String camera, List<CameraStream.Config> streams, List<? extends List<CameraStream.Config>> exclusiveStreamGroups, List<InputStream.Config> list, CameraStream.Config config, int i, Map<?, ? extends Object> sessionParameters, int i2, int i3, Map<?, ? extends Object> defaultParameters, List<? extends Request.Listener> defaultListeners, List<? extends GraphStateListener> graphStateListeners, Map<?, ? extends Object> requiredParameters, String str, CameraBackendFactory cameraBackendFactory, MetadataTransform metadataTransform, Flags flags, String str2) {
            Intrinsics.checkNotNullParameter(camera, "camera");
            Intrinsics.checkNotNullParameter(streams, "streams");
            Intrinsics.checkNotNullParameter(exclusiveStreamGroups, "exclusiveStreamGroups");
            Intrinsics.checkNotNullParameter(sessionParameters, "sessionParameters");
            Intrinsics.checkNotNullParameter(defaultParameters, "defaultParameters");
            Intrinsics.checkNotNullParameter(defaultListeners, "defaultListeners");
            Intrinsics.checkNotNullParameter(graphStateListeners, "graphStateListeners");
            Intrinsics.checkNotNullParameter(requiredParameters, "requiredParameters");
            Intrinsics.checkNotNullParameter(metadataTransform, "metadataTransform");
            Intrinsics.checkNotNullParameter(flags, "flags");
            this.camera = camera;
            this.streams = streams;
            this.exclusiveStreamGroups = exclusiveStreamGroups;
            this.input = list;
            this.postviewStream = config;
            this.sessionTemplate = i;
            this.sessionParameters = sessionParameters;
            this.sessionMode = i2;
            this.defaultTemplate = i3;
            this.defaultParameters = defaultParameters;
            this.defaultListeners = defaultListeners;
            this.graphStateListeners = graphStateListeners;
            this.requiredParameters = requiredParameters;
            this.cameraBackendId = str;
            this.customCameraBackend = cameraBackendFactory;
            this.metadataTransform = metadataTransform;
            this.flags = flags;
            this.sessionColorSpace = str2;
            if (str != null && cameraBackendFactory != null) {
                throw new IllegalStateException("Setting both cameraBackendId and customCameraBackend is not supported.");
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$Constants3A;", "", "<init>", "()V", "", "Landroid/hardware/camera2/params/MeteringRectangle;", "METERING_REGIONS_EMPTY", "[Landroid/hardware/camera2/params/MeteringRectangle;", "getMETERING_REGIONS_EMPTY", "()[Landroid/hardware/camera2/params/MeteringRectangle;", "METERING_REGIONS_DEFAULT", "getMETERING_REGIONS_DEFAULT", "Landroidx/camera/camera2/pipe/FrameNumber;", "FRAME_NUMBER_INVALID", "J", "getFRAME_NUMBER_INVALID-Ugla2oM", "()J", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Constants3A {

        @NotNull
        public static final Constants3A INSTANCE = new Constants3A();

        @NotNull
        private static final MeteringRectangle[] METERING_REGIONS_EMPTY = new MeteringRectangle[0];

        @NotNull
        private static final MeteringRectangle[] METERING_REGIONS_DEFAULT = {new MeteringRectangle(0, 0, 0, 0, 0)};
        private static final long FRAME_NUMBER_INVALID = FrameNumber.m222constructorimpl(-1);

        private Constants3A() {
        }

        @NotNull
        public final MeteringRectangle[] getMETERING_REGIONS_DEFAULT() {
            return METERING_REGIONS_DEFAULT;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b$\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b&\u0010\u001a¨\u0006("}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$Flags;", "", "", "configureBlankSessionOnStop", "abortCapturesOnStop", "Landroidx/camera/camera2/pipe/CameraGraph$RepeatingRequestRequirementsBeforeCapture;", "awaitRepeatingRequestBeforeCapture", "awaitRepeatingRequestOnDisconnect", "Landroidx/camera/camera2/pipe/CameraGraph$Flags$FinalizeSessionOnCloseBehavior;", "finalizeSessionOnCloseBehavior", "closeCaptureSessionOnDisconnect", "closeCameraDeviceOnClose", "enableRestartDelays", "<init>", "(ZZLandroidx/camera/camera2/pipe/CameraGraph$RepeatingRequestRequirementsBeforeCapture;Ljava/lang/Boolean;IZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getConfigureBlankSessionOnStop", "()Z", "getAbortCapturesOnStop", "Landroidx/camera/camera2/pipe/CameraGraph$RepeatingRequestRequirementsBeforeCapture;", "getAwaitRepeatingRequestBeforeCapture", "()Landroidx/camera/camera2/pipe/CameraGraph$RepeatingRequestRequirementsBeforeCapture;", "Ljava/lang/Boolean;", "getAwaitRepeatingRequestOnDisconnect", "()Ljava/lang/Boolean;", "I", "getFinalizeSessionOnCloseBehavior-Bm6Tfm4", "getCloseCaptureSessionOnDisconnect", "getCloseCameraDeviceOnClose", "getEnableRestartDelays", "FinalizeSessionOnCloseBehavior", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Flags {
        private final boolean abortCapturesOnStop;

        @NotNull
        private final RepeatingRequestRequirementsBeforeCapture awaitRepeatingRequestBeforeCapture;
        private final Boolean awaitRepeatingRequestOnDisconnect;
        private final boolean closeCameraDeviceOnClose;
        private final boolean closeCaptureSessionOnDisconnect;
        private final boolean configureBlankSessionOnStop;
        private final boolean enableRestartDelays;
        private final int finalizeSessionOnCloseBehavior;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\r"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$Flags$FinalizeSessionOnCloseBehavior;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class FinalizeSessionOnCloseBehavior {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);
            private static final int OFF = m161constructorimpl(0);
            private static final int IMMEDIATE = m161constructorimpl(1);
            private static final int TIMEOUT = m161constructorimpl(2);

            @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$Flags$FinalizeSessionOnCloseBehavior$Companion;", "", "<init>", "()V", "OFF", "Landroidx/camera/camera2/pipe/CameraGraph$Flags$FinalizeSessionOnCloseBehavior;", "getOFF-Bm6Tfm4", "()I", "I", "IMMEDIATE", "getIMMEDIATE-Bm6Tfm4", "TIMEOUT", "getTIMEOUT-Bm6Tfm4", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* JADX INFO: renamed from: getIMMEDIATE-Bm6Tfm4, reason: not valid java name */
                public final int m165getIMMEDIATEBm6Tfm4() {
                    return FinalizeSessionOnCloseBehavior.IMMEDIATE;
                }

                /* JADX INFO: renamed from: getOFF-Bm6Tfm4, reason: not valid java name */
                public final int m166getOFFBm6Tfm4() {
                    return FinalizeSessionOnCloseBehavior.OFF;
                }

                /* JADX INFO: renamed from: getTIMEOUT-Bm6Tfm4, reason: not valid java name */
                public final int m167getTIMEOUTBm6Tfm4() {
                    return FinalizeSessionOnCloseBehavior.TIMEOUT;
                }

                private Companion() {
                }
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            private static int m161constructorimpl(int i) {
                return i;
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m162equalsimpl0(int i, int i2) {
                return i == i2;
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m163hashCodeimpl(int i) {
                return Integer.hashCode(i);
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m164toStringimpl(int i) {
                return a.k(CoreConstants.RIGHT_PARENTHESIS_CHAR, "FinalizeSessionOnCloseBehavior(value=", i);
            }
        }

        public /* synthetic */ Flags(boolean z, boolean z3, RepeatingRequestRequirementsBeforeCapture repeatingRequestRequirementsBeforeCapture, Boolean bool, int i, boolean z4, boolean z6, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, z3, repeatingRequestRequirementsBeforeCapture, bool, i, z4, z6, z11);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Flags)) {
                return false;
            }
            Flags flags = (Flags) other;
            return this.configureBlankSessionOnStop == flags.configureBlankSessionOnStop && this.abortCapturesOnStop == flags.abortCapturesOnStop && Intrinsics.f(this.awaitRepeatingRequestBeforeCapture, flags.awaitRepeatingRequestBeforeCapture) && Intrinsics.f(this.awaitRepeatingRequestOnDisconnect, flags.awaitRepeatingRequestOnDisconnect) && FinalizeSessionOnCloseBehavior.m162equalsimpl0(this.finalizeSessionOnCloseBehavior, flags.finalizeSessionOnCloseBehavior) && this.closeCaptureSessionOnDisconnect == flags.closeCaptureSessionOnDisconnect && this.closeCameraDeviceOnClose == flags.closeCameraDeviceOnClose && this.enableRestartDelays == flags.enableRestartDelays;
        }

        public final boolean getAbortCapturesOnStop() {
            return this.abortCapturesOnStop;
        }

        @NotNull
        public final RepeatingRequestRequirementsBeforeCapture getAwaitRepeatingRequestBeforeCapture() {
            return this.awaitRepeatingRequestBeforeCapture;
        }

        public final Boolean getAwaitRepeatingRequestOnDisconnect() {
            return this.awaitRepeatingRequestOnDisconnect;
        }

        public final boolean getCloseCameraDeviceOnClose() {
            return this.closeCameraDeviceOnClose;
        }

        public final boolean getCloseCaptureSessionOnDisconnect() {
            return this.closeCaptureSessionOnDisconnect;
        }

        public final boolean getEnableRestartDelays() {
            return this.enableRestartDelays;
        }

        /* JADX INFO: renamed from: getFinalizeSessionOnCloseBehavior-Bm6Tfm4, reason: not valid java name and from getter */
        public final int getFinalizeSessionOnCloseBehavior() {
            return this.finalizeSessionOnCloseBehavior;
        }

        public int hashCode() {
            int iHashCode = (this.awaitRepeatingRequestBeforeCapture.hashCode() + j6.a.c(Boolean.hashCode(this.configureBlankSessionOnStop) * 31, 31, this.abortCapturesOnStop)) * 31;
            Boolean bool = this.awaitRepeatingRequestOnDisconnect;
            return Boolean.hashCode(this.enableRestartDelays) + j6.a.c(j6.a.c((FinalizeSessionOnCloseBehavior.m163hashCodeimpl(this.finalizeSessionOnCloseBehavior) + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31, 31, this.closeCaptureSessionOnDisconnect), 31, this.closeCameraDeviceOnClose);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("Flags(configureBlankSessionOnStop=");
            sb6.append(this.configureBlankSessionOnStop);
            sb6.append(", abortCapturesOnStop=");
            sb6.append(this.abortCapturesOnStop);
            sb6.append(", awaitRepeatingRequestBeforeCapture=");
            sb6.append(this.awaitRepeatingRequestBeforeCapture);
            sb6.append(", awaitRepeatingRequestOnDisconnect=");
            sb6.append(this.awaitRepeatingRequestOnDisconnect);
            sb6.append(", finalizeSessionOnCloseBehavior=");
            sb6.append((Object) FinalizeSessionOnCloseBehavior.m164toStringimpl(this.finalizeSessionOnCloseBehavior));
            sb6.append(", closeCaptureSessionOnDisconnect=");
            sb6.append(this.closeCaptureSessionOnDisconnect);
            sb6.append(", closeCameraDeviceOnClose=");
            sb6.append(this.closeCameraDeviceOnClose);
            sb6.append(", enableRestartDelays=");
            return j6.a.x(sb6, this.enableRestartDelays, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        private Flags(boolean z, boolean z3, RepeatingRequestRequirementsBeforeCapture awaitRepeatingRequestBeforeCapture, Boolean bool, int i, boolean z4, boolean z6, boolean z11) {
            Intrinsics.checkNotNullParameter(awaitRepeatingRequestBeforeCapture, "awaitRepeatingRequestBeforeCapture");
            this.configureBlankSessionOnStop = z;
            this.abortCapturesOnStop = z3;
            this.awaitRepeatingRequestBeforeCapture = awaitRepeatingRequestBeforeCapture;
            this.awaitRepeatingRequestOnDisconnect = bool;
            this.finalizeSessionOnCloseBehavior = i;
            this.closeCaptureSessionOnDisconnect = z4;
            this.closeCameraDeviceOnClose = z6;
            this.enableRestartDelays = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Flags(boolean z, boolean z3, RepeatingRequestRequirementsBeforeCapture repeatingRequestRequirementsBeforeCapture, Boolean bool, int i, boolean z4, boolean z6, boolean z11, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? Build.VERSION.SDK_INT >= 30 : z3, (i2 & 4) != 0 ? new RepeatingRequestRequirementsBeforeCapture(0 == true ? 1 : 0, null, 3, 0 == true ? 1 : 0) : repeatingRequestRequirementsBeforeCapture, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? FinalizeSessionOnCloseBehavior.INSTANCE.m166getOFFBm6Tfm4() : i, (i2 & 32) != 0 ? Camera2Quirks.INSTANCE.shouldCloseCaptureSessionOnDisconnect$camera_camera2_pipe() : z4, (i2 & 64) != 0 ? false : z6, (i2 & 128) == 0 ? z11 : false, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\r"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$OperatingMode;", "", "", "mode", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OperatingMode {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final int NORMAL = m169constructorimpl(0);
        private static final int HIGH_SPEED = m169constructorimpl(1);
        private static final int EXTENSION = m169constructorimpl(2);

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007¨\u0006\u0012"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$OperatingMode$Companion;", "", "<init>", "()V", "NORMAL", "Landroidx/camera/camera2/pipe/CameraGraph$OperatingMode;", "getNORMAL-2uNL3no", "()I", "I", "HIGH_SPEED", "getHIGH_SPEED-2uNL3no", "EXTENSION", "getEXTENSION-2uNL3no", "custom", "mode", "", "custom-EP6OhB0", "(I)I", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: custom-EP6OhB0, reason: not valid java name */
            public final int m173customEP6OhB0(int mode) {
                if (mode != m176getNORMAL2uNL3no() && mode != m175getHIGH_SPEED2uNL3no()) {
                    return OperatingMode.m169constructorimpl(mode);
                }
                if (Log.INSTANCE.getERROR_LOGGABLE()) {
                    String str = "Custom operating mode " + mode + " conflicts with standard modes";
                }
                Unit.f186387a.getClass();
                throw new IllegalArgumentException("kotlin.Unit");
            }

            /* JADX INFO: renamed from: getEXTENSION-2uNL3no, reason: not valid java name */
            public final int m174getEXTENSION2uNL3no() {
                return OperatingMode.EXTENSION;
            }

            /* JADX INFO: renamed from: getHIGH_SPEED-2uNL3no, reason: not valid java name */
            public final int m175getHIGH_SPEED2uNL3no() {
                return OperatingMode.HIGH_SPEED;
            }

            /* JADX INFO: renamed from: getNORMAL-2uNL3no, reason: not valid java name */
            public final int m176getNORMAL2uNL3no() {
                return OperatingMode.NORMAL;
            }

            private Companion() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m169constructorimpl(int i) {
            return i;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m170equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m171hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m172toStringimpl(int i) {
            return a.k(CoreConstants.RIGHT_PARENTHESIS_CHAR, "OperatingMode(mode=", i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$RepeatingRequestRequirementsBeforeCapture;", "", "Lyhm/u;", "repeatingFramesToComplete", "Landroidx/camera/camera2/pipe/CameraGraph$RepeatingRequestRequirementsBeforeCapture$CompletionBehavior;", "completionBehavior", "<init>", "(ILandroidx/camera/camera2/pipe/CameraGraph$RepeatingRequestRequirementsBeforeCapture$CompletionBehavior;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "I", "getRepeatingFramesToComplete-pVg5ArA", "()I", "Landroidx/camera/camera2/pipe/CameraGraph$RepeatingRequestRequirementsBeforeCapture$CompletionBehavior;", "getCompletionBehavior", "()Landroidx/camera/camera2/pipe/CameraGraph$RepeatingRequestRequirementsBeforeCapture$CompletionBehavior;", "CompletionBehavior", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RepeatingRequestRequirementsBeforeCapture {

        @NotNull
        private final CompletionBehavior completionBehavior;
        private final int repeatingFramesToComplete;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$RepeatingRequestRequirementsBeforeCapture$CompletionBehavior;", "", "<init>", "(Ljava/lang/String;I)V", "AT_LEAST", "EXACT", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CompletionBehavior {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ CompletionBehavior[] $VALUES;
            public static final CompletionBehavior AT_LEAST = new CompletionBehavior("AT_LEAST", 0);
            public static final CompletionBehavior EXACT = new CompletionBehavior("EXACT", 1);

            private static final /* synthetic */ CompletionBehavior[] $values() {
                return new CompletionBehavior[]{AT_LEAST, EXACT};
            }

            static {
                CompletionBehavior[] completionBehaviorArr$values = $values();
                $VALUES = completionBehaviorArr$values;
                $ENTRIES = s.n(completionBehaviorArr$values);
            }

            private CompletionBehavior(String str, int i) {
            }

            public static CompletionBehavior valueOf(String str) {
                return (CompletionBehavior) Enum.valueOf(CompletionBehavior.class, str);
            }

            public static CompletionBehavior[] values() {
                return (CompletionBehavior[]) $VALUES.clone();
            }
        }

        public /* synthetic */ RepeatingRequestRequirementsBeforeCapture(int i, CompletionBehavior completionBehavior, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, completionBehavior);
        }

        @NotNull
        public final CompletionBehavior getCompletionBehavior() {
            return this.completionBehavior;
        }

        /* JADX INFO: renamed from: getRepeatingFramesToComplete-pVg5ArA, reason: not valid java name and from getter */
        public final int getRepeatingFramesToComplete() {
            return this.repeatingFramesToComplete;
        }

        private RepeatingRequestRequirementsBeforeCapture(int i, CompletionBehavior completionBehavior) {
            Intrinsics.checkNotNullParameter(completionBehavior, "completionBehavior");
            this.repeatingFramesToComplete = i;
            this.completionBehavior = completionBehavior;
        }

        public /* synthetic */ RepeatingRequestRequirementsBeforeCapture(int i, CompletionBehavior completionBehavior, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? CompletionBehavior.AT_LEAST : completionBehavior, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\bg\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH&¢\u0006\u0004\b\r\u0010\u000eJî\u0001\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001e2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001e2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020%H¦@¢\u0006\u0004\b*\u0010+Jf\u00102\u001a\b\u0012\u0004\u0012\u00020)0(2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010 2\u0016\b\u0002\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001e2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u00101\u001a\u00020%H¦@¢\u0006\u0004\b2\u00103J>\u00106\u001a\b\u0012\u0004\u0012\u00020)0(2\b\b\u0002\u00104\u001a\u00020 2\b\b\u0002\u00105\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u00101\u001a\u00020%H¦@¢\u0006\u0004\b6\u00107J \u00109\u001a\b\u0012\u0004\u0012\u00020)0(2\b\b\u0002\u00108\u001a\u00020 H¦@¢\u0006\u0004\b9\u0010:ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006;À\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$Session;", "Landroidx/camera/camera2/pipe/CameraControls3A;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Landroidx/camera/camera2/pipe/Request;", "request", "", "startRepeating", "(Landroidx/camera/camera2/pipe/Request;)V", "stopRepeating", "()V", "", "requests", "submit", "(Ljava/util/List;)V", "Landroidx/camera/camera2/pipe/AeMode;", "aeMode", "Landroidx/camera/camera2/pipe/AfMode;", "afMode", "Landroidx/camera/camera2/pipe/AwbMode;", "awbMode", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "Landroidx/camera/camera2/pipe/Lock3ABehavior;", "aeLockBehavior", "afLockBehavior", "awbLockBehavior", "afTriggerStartAeMode", "Lkotlin/Function1;", "Landroidx/camera/camera2/pipe/FrameMetadata;", "", "convergedCondition", "lockedCondition", "", "frameLimit", "", "convergedTimeLimitNs", "lockedTimeLimitNs", "Lskm/g0;", "Landroidx/camera/camera2/pipe/Result3A;", "lock3A--tS25XM", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/AeMode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lock3A", "ae", "af", "awb", "unlockedCondition", "timeLimitNs", "unlock3A", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "triggerAf", "waitForAwb", "lock3AForCapture", "(ZZIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelAf", "unlock3APostCapture", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Session extends CameraControls3A, AutoCloseable {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: lock3A--tS25XM$default, reason: not valid java name */
        static /* synthetic */ Object m178lock3AtS25XM$default(Session session, AeMode aeMode, AfMode afMode, AwbMode awbMode, List list, List list2, List list3, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode2, Function1 function1, Function1 function12, int i, long j2, long j3, Continuation continuation, int i2, Object obj2) {
            long j5;
            Session session2;
            Continuation continuation2;
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock3A--tS25XM");
            }
            AeMode aeMode3 = (i2 & 1) != 0 ? null : aeMode;
            AfMode afMode2 = (i2 & 2) != 0 ? null : afMode;
            AwbMode awbMode2 = (i2 & 4) != 0 ? null : awbMode;
            List list4 = (i2 & 8) != 0 ? null : list;
            List list5 = (i2 & 16) != 0 ? null : list2;
            List list6 = (i2 & 32) != 0 ? null : list3;
            Lock3ABehavior lock3ABehavior4 = (i2 & 64) != 0 ? null : lock3ABehavior;
            Lock3ABehavior lock3ABehavior5 = (i2 & 128) != 0 ? null : lock3ABehavior2;
            Lock3ABehavior lock3ABehavior6 = (i2 & 256) != 0 ? null : lock3ABehavior3;
            AeMode aeMode4 = (i2 & 512) != 0 ? null : aeMode2;
            Function1 function13 = (i2 & 1024) != 0 ? null : function1;
            Function1 function14 = (i2 & 2048) != 0 ? null : function12;
            int i3 = (i2 & 4096) != 0 ? 60 : i;
            long j16 = (i2 & 8192) != 0 ? 3000000000L : j2;
            if ((i2 & 16384) != 0) {
                j5 = 3000000000L;
                continuation2 = continuation;
                session2 = session;
            } else {
                j5 = j3;
                session2 = session;
                continuation2 = continuation;
            }
            return session2.mo179lock3AtS25XM(aeMode3, afMode2, awbMode2, list4, list5, list6, lock3ABehavior4, lock3ABehavior5, lock3ABehavior6, aeMode4, function13, function14, i3, j16, j5, continuation2);
        }

        static /* synthetic */ Object lock3AForCapture$default(Session session, boolean z, boolean z3, int i, long j2, Continuation continuation, int i2, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock3AForCapture");
            }
            if ((i2 & 1) != 0) {
                z = true;
            }
            if ((i2 & 2) != 0) {
                z3 = false;
            }
            if ((i2 & 4) != 0) {
                i = 60;
            }
            if ((i2 & 8) != 0) {
                j2 = 3000000000L;
            }
            int i3 = i;
            return session.lock3AForCapture(z, z3, i3, j2, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ Object unlock3A$default(Session session, Boolean bool, Boolean bool2, Boolean bool3, Function1 function1, int i, long j2, Continuation continuation, int i2, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock3A");
            }
            if ((i2 & 1) != 0) {
                bool = null;
            }
            if ((i2 & 2) != 0) {
                bool2 = null;
            }
            if ((i2 & 4) != 0) {
                bool3 = null;
            }
            if ((i2 & 8) != 0) {
                function1 = null;
            }
            if ((i2 & 16) != 0) {
                i = 60;
            }
            if ((i2 & 32) != 0) {
                j2 = 3000000000L;
            }
            return session.unlock3A(bool, bool2, bool3, function1, i, j2, continuation);
        }

        /* JADX INFO: renamed from: lock3A--tS25XM, reason: not valid java name */
        Object mo179lock3AtS25XM(AeMode aeMode, AfMode afMode, AwbMode awbMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode2, Function1<? super FrameMetadata, Boolean> function1, Function1<? super FrameMetadata, Boolean> function12, int i, long j2, long j3, @NotNull Continuation<? super g0> continuation);

        Object lock3AForCapture(boolean z, boolean z3, int i, long j2, @NotNull Continuation<? super g0> continuation);

        void startRepeating(@NotNull Request request);

        void stopRepeating();

        void submit(@NotNull List<Request> requests);

        Object unlock3A(Boolean bool, Boolean bool2, Boolean bool3, Function1<? super FrameMetadata, Boolean> function1, int i, long j2, @NotNull Continuation<? super g0> continuation);

        Object unlock3APostCapture(boolean z, @NotNull Continuation<? super g0> continuation);
    }
}
