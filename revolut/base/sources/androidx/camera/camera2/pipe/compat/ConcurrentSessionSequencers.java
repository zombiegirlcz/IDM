package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.ConcurrentCameraGraphs;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a1;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/camera/camera2/pipe/compat/ConcurrentSessionSequencers;", "", "<init>", "()V", "lock", "sequencers", "", "Landroidx/camera/camera2/pipe/ConcurrentCameraGraphs;", "Landroidx/camera/camera2/pipe/compat/ConcurrentSessionSequencer;", "pending", "", "Landroidx/camera/camera2/pipe/CameraGraphId;", "getSequencer", "cameraGraphId", "concurrentCameraGraphs", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConcurrentSessionSequencers {

    @NotNull
    private final Object lock = new Object();

    @NotNull
    private final Map<ConcurrentCameraGraphs, ConcurrentSessionSequencer> sequencers = new LinkedHashMap();

    @NotNull
    private final Set<CameraGraphId> pending = new LinkedHashSet();

    @NotNull
    public final ConcurrentSessionSequencer getSequencer(@NotNull CameraGraphId cameraGraphId, @NotNull ConcurrentCameraGraphs concurrentCameraGraphs) {
        ConcurrentSessionSequencer concurrentSessionSequencer;
        Intrinsics.checkNotNullParameter(cameraGraphId, "cameraGraphId");
        Intrinsics.checkNotNullParameter(concurrentCameraGraphs, "concurrentCameraGraphs");
        synchronized (this.lock) {
            try {
                if (!this.sequencers.containsKey(concurrentCameraGraphs)) {
                    ConcurrentSessionSequencer concurrentSessionSequencer2 = new ConcurrentSessionSequencer();
                    this.sequencers.put(concurrentCameraGraphs, concurrentSessionSequencer2);
                    this.pending.addAll(a1.j(concurrentCameraGraphs.getCameraGraphIds(), cameraGraphId));
                    return concurrentSessionSequencer2;
                }
                this.pending.remove(cameraGraphId);
                Set<CameraGraphId> cameraGraphIds = concurrentCameraGraphs.getCameraGraphIds();
                if (!(cameraGraphIds instanceof Collection) || !cameraGraphIds.isEmpty()) {
                    Iterator<T> it8 = cameraGraphIds.iterator();
                    while (it8.hasNext()) {
                        if (this.pending.contains((CameraGraphId) it8.next())) {
                            ConcurrentSessionSequencer concurrentSessionSequencer3 = this.sequencers.get(concurrentCameraGraphs);
                            if (concurrentSessionSequencer3 == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            concurrentSessionSequencer = concurrentSessionSequencer3;
                            return concurrentSessionSequencer;
                        }
                    }
                }
                ConcurrentSessionSequencer concurrentSessionSequencerRemove = this.sequencers.remove(concurrentCameraGraphs);
                if (concurrentSessionSequencerRemove == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                concurrentSessionSequencer = concurrentSessionSequencerRemove;
                return concurrentSessionSequencer;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
