package androidx.camera.camera2.config;

import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import androidx.camera.camera2.adapter.CameraStateAdapter;
import androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import phm.a;
import q97.p1;
import yhm.j;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001BW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u0002\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR&\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u00030\u00030\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R'\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b%\u0010&*\u0004\b'\u0010(¨\u0006*"}, d2 = {"Landroidx/camera/camera2/config/UseCaseGraphContext;", "", "Lphm/a;", "Landroidx/camera/camera2/pipe/CameraGraph;", "cameraGraphProvider", "Landroidx/camera/camera2/adapter/CameraStateAdapter;", "cameraStateAdapter", "Landroidx/camera/camera2/adapter/GraphStateToCameraStateAdapter;", "graphStateToCameraStateAdapter", "", "Landroidx/camera/camera2/pipe/CameraStream$Config;", "Landroidx/camera/core/impl/DeferrableSurface;", "streamConfigMapProvider", "Landroidx/camera/camera2/pipe/StreamId;", "defaultSurfaceToStreamMap", "<init>", "(Lphm/a;Landroidx/camera/camera2/adapter/CameraStateAdapter;Landroidx/camera/camera2/adapter/GraphStateToCameraStateAdapter;Lphm/a;Ljava/util/Map;)V", "", "closeGraph", "()V", "", "deferrableSurfaces", "", "getStreamIdsFromSurfaces", "(Ljava/util/Collection;)Ljava/util/Set;", "configureCameraStateListener", "Lphm/a;", "Landroidx/camera/camera2/adapter/CameraStateAdapter;", "Landroidx/camera/camera2/adapter/GraphStateToCameraStateAdapter;", "Lkotlin/Lazy;", "kotlin.jvm.PlatformType", "_graph", "Lkotlin/Lazy;", "surfaceToStreamMap$delegate", "getSurfaceToStreamMap", "()Ljava/util/Map;", "surfaceToStreamMap", "getGraph", "()Landroidx/camera/camera2/pipe/CameraGraph;", "getGraph$delegate", "(Landroidx/camera/camera2/config/UseCaseGraphContext;)Ljava/lang/Object;", "graph", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UseCaseGraphContext {

    @NotNull
    private final Lazy _graph;

    @NotNull
    private final a cameraGraphProvider;

    @NotNull
    private final CameraStateAdapter cameraStateAdapter;

    @NotNull
    private final GraphStateToCameraStateAdapter graphStateToCameraStateAdapter;

    @NotNull
    private final a streamConfigMapProvider;

    /* JADX INFO: renamed from: surfaceToStreamMap$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy surfaceToStreamMap;

    public UseCaseGraphContext(@NotNull a cameraGraphProvider, @NotNull CameraStateAdapter cameraStateAdapter, @NotNull GraphStateToCameraStateAdapter graphStateToCameraStateAdapter, @NotNull a streamConfigMapProvider, Map<DeferrableSurface, StreamId> map) {
        Intrinsics.checkNotNullParameter(cameraGraphProvider, "cameraGraphProvider");
        Intrinsics.checkNotNullParameter(cameraStateAdapter, "cameraStateAdapter");
        Intrinsics.checkNotNullParameter(graphStateToCameraStateAdapter, "graphStateToCameraStateAdapter");
        Intrinsics.checkNotNullParameter(streamConfigMapProvider, "streamConfigMapProvider");
        this.cameraGraphProvider = cameraGraphProvider;
        this.cameraStateAdapter = cameraStateAdapter;
        this.graphStateToCameraStateAdapter = graphStateToCameraStateAdapter;
        this.streamConfigMapProvider = streamConfigMapProvider;
        this._graph = j.b(new p1(this, 26));
        this.surfaceToStreamMap = j.b(new qvf.a(map, this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraGraph _graph$lambda$0(UseCaseGraphContext useCaseGraphContext) {
        return (CameraGraph) useCaseGraphContext.cameraGraphProvider.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map surfaceToStreamMap_delegate$lambda$0(Map map, UseCaseGraphContext useCaseGraphContext) {
        if (map != null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj2 = useCaseGraphContext.streamConfigMapProvider.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        for (Map.Entry entry : ((Map) obj2).entrySet()) {
            CameraStream.Config config = (CameraStream.Config) entry.getKey();
            DeferrableSurface deferrableSurface = (DeferrableSurface) entry.getValue();
            CameraStream cameraStream = useCaseGraphContext.getGraph().getStreams().get(config);
            if (cameraStream != null) {
                linkedHashMap.put(deferrableSurface, StreamId.m355boximpl(cameraStream.getId()));
            }
        }
        return r0.u(linkedHashMap);
    }

    public final void closeGraph() throws Exception {
        boolean zIsTerminated;
        if (this._graph.isInitialized()) {
            AutoCloseable graph = getGraph();
            if (graph instanceof AutoCloseable) {
                graph.close();
                return;
            }
            if (!(graph instanceof ExecutorService)) {
                if (graph instanceof TypedArray) {
                    ((TypedArray) graph).recycle();
                    return;
                } else {
                    if (!(graph instanceof MediaMetadataRetriever)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaMetadataRetriever) graph).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) graph;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
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
    }

    public final void configureCameraStateListener() {
        this.graphStateToCameraStateAdapter.setCameraGraph(getGraph());
        this.cameraStateAdapter.onGraphUpdated(getGraph());
    }

    @NotNull
    public final CameraGraph getGraph() {
        Object value = this._graph.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (CameraGraph) value;
    }

    @NotNull
    public final Set<StreamId> getStreamIdsFromSurfaces(@NotNull Collection<? extends DeferrableSurface> deferrableSurfaces) {
        Intrinsics.checkNotNullParameter(deferrableSurfaces, "deferrableSurfaces");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it8 = deferrableSurfaces.iterator();
        while (it8.hasNext()) {
            StreamId streamId = getSurfaceToStreamMap().get((DeferrableSurface) it8.next());
            if (streamId != null) {
                linkedHashSet.add(StreamId.m355boximpl(streamId.getValue()));
            }
        }
        return linkedHashSet;
    }

    @NotNull
    public final Map<DeferrableSurface, StreamId> getSurfaceToStreamMap() {
        return (Map) this.surfaceToStreamMap.getValue();
    }

    public /* synthetic */ UseCaseGraphContext(a aVar, CameraStateAdapter cameraStateAdapter, GraphStateToCameraStateAdapter graphStateToCameraStateAdapter, a aVar2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, cameraStateAdapter, graphStateToCameraStateAdapter, aVar2, (i & 16) != 0 ? null : map);
    }
}
