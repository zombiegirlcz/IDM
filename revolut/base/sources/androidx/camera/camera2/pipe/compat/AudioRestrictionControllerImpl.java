package androidx.camera.camera2.pipe.compat;

import android.os.Build;
import androidx.camera.camera2.pipe.AudioRestrictionMode;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.compat.AudioRestrictionController;
import androidx.camera.camera2.pipe.core.CoroutineMutex;
import androidx.camera.camera2.pipe.core.MutexesKt;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import skm.b0;
import skm.c2;
import skm.e0;
import t70.x;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B#\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\r\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R.\u0010&\u001a\u0004\u0018\u00010\n2\b\u0010%\u001a\u0004\u0018\u00010\n8V@VX\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u0011R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00170-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AudioRestrictionControllerImpl;", "Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/internal/CameraPipeLifetime;", "cameraPipeLifetime", "Lkotlinx/coroutines/Job;", "cameraPipeJob", "<init>", "(Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/internal/CameraPipeLifetime;Lkotlinx/coroutines/Job;)V", "Landroidx/camera/camera2/pipe/AudioRestrictionMode;", "computeAudioRestrictionMode-4o0Og1A", "()Landroidx/camera/camera2/pipe/AudioRestrictionMode;", "computeAudioRestrictionMode", "previousMode", "", "updateListenersMode-3NUV5dA", "(Landroidx/camera/camera2/pipe/AudioRestrictionMode;)V", "updateListenersMode", "Landroidx/camera/camera2/pipe/CameraGraph;", "cameraGraph", "removeCameraGraph", "(Landroidx/camera/camera2/pipe/CameraGraph;)V", "Landroidx/camera/camera2/pipe/compat/AudioRestrictionController$Listener;", "listener", "addListener", "(Landroidx/camera/camera2/pipe/compat/AudioRestrictionController$Listener;)V", "removeListener", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/camera/camera2/pipe/core/CoroutineMutex;", "coroutineMutex", "Landroidx/camera/camera2/pipe/core/CoroutineMutex;", "", "lock", "Ljava/lang/Object;", "value", "globalAudioRestrictionMode", "Landroidx/camera/camera2/pipe/AudioRestrictionMode;", "getGlobalAudioRestrictionMode-4o0Og1A", "setGlobalAudioRestrictionMode-3NUV5dA", "", "audioRestrictionModeMap", "Ljava/util/Map;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "activeListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AudioRestrictionControllerImpl implements AudioRestrictionController {

    @NotNull
    private final CopyOnWriteArrayList<AudioRestrictionController.Listener> activeListeners;

    @NotNull
    private final Map<CameraGraph, AudioRestrictionMode> audioRestrictionModeMap;

    @NotNull
    private final CoroutineMutex coroutineMutex;
    private AudioRestrictionMode globalAudioRestrictionMode;

    @NotNull
    private final Object lock;

    @NotNull
    private final CoroutineScope scope;

    public AudioRestrictionControllerImpl(@NotNull Threads threads, @NotNull CameraPipeLifetime cameraPipeLifetime, @NotNull Job cameraPipeJob) {
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(cameraPipeLifetime, "cameraPipeLifetime");
        Intrinsics.checkNotNullParameter(cameraPipeJob, "cameraPipeJob");
        this.scope = e0.c(e.d(new c2(cameraPipeJob), threads.getLightweightDispatcher().plus(new b0("CXCP-AudioRestrictionControllerImpl"))));
        this.coroutineMutex = new CoroutineMutex();
        this.lock = new Object();
        this.audioRestrictionModeMap = new LinkedHashMap();
        this.activeListeners = new CopyOnWriteArrayList<>();
        cameraPipeLifetime.addShutdownAction(CameraPipeLifetime.ShutdownType.SCOPE, new x(this, 22));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(AudioRestrictionControllerImpl audioRestrictionControllerImpl) {
        e0.k(audioRestrictionControllerImpl.scope, null);
    }

    /* JADX INFO: renamed from: computeAudioRestrictionMode-4o0Og1A, reason: not valid java name */
    private final AudioRestrictionMode m377computeAudioRestrictionMode4o0Og1A() {
        Map<CameraGraph, AudioRestrictionMode> map = this.audioRestrictionModeMap;
        AudioRestrictionMode.Companion companion = AudioRestrictionMode.INSTANCE;
        if (!map.containsValue(AudioRestrictionMode.m84boximpl(companion.m93getAUDIO_RESTRICTION_VIBRATION_SOUND_b5Q8KE()))) {
            AudioRestrictionMode audioRestrictionModeM379getGlobalAudioRestrictionMode4o0Og1A = m379getGlobalAudioRestrictionMode4o0Og1A();
            if (!(audioRestrictionModeM379getGlobalAudioRestrictionMode4o0Og1A == null ? false : AudioRestrictionMode.m87equalsimpl0(audioRestrictionModeM379getGlobalAudioRestrictionMode4o0Og1A.getValue(), companion.m93getAUDIO_RESTRICTION_VIBRATION_SOUND_b5Q8KE()))) {
                if (!this.audioRestrictionModeMap.containsValue(AudioRestrictionMode.m84boximpl(companion.m92getAUDIO_RESTRICTION_VIBRATION_b5Q8KE()))) {
                    AudioRestrictionMode audioRestrictionModeM379getGlobalAudioRestrictionMode4o0Og1A2 = m379getGlobalAudioRestrictionMode4o0Og1A();
                    if (!(audioRestrictionModeM379getGlobalAudioRestrictionMode4o0Og1A2 == null ? false : AudioRestrictionMode.m87equalsimpl0(audioRestrictionModeM379getGlobalAudioRestrictionMode4o0Og1A2.getValue(), companion.m92getAUDIO_RESTRICTION_VIBRATION_b5Q8KE()))) {
                        if (!this.audioRestrictionModeMap.containsValue(AudioRestrictionMode.m84boximpl(companion.m91getAUDIO_RESTRICTION_NONE_b5Q8KE()))) {
                            AudioRestrictionMode audioRestrictionModeM379getGlobalAudioRestrictionMode4o0Og1A3 = m379getGlobalAudioRestrictionMode4o0Og1A();
                            if (!(audioRestrictionModeM379getGlobalAudioRestrictionMode4o0Og1A3 != null ? AudioRestrictionMode.m87equalsimpl0(audioRestrictionModeM379getGlobalAudioRestrictionMode4o0Og1A3.getValue(), companion.m91getAUDIO_RESTRICTION_NONE_b5Q8KE()) : false)) {
                                return null;
                            }
                        }
                        return AudioRestrictionMode.m84boximpl(companion.m91getAUDIO_RESTRICTION_NONE_b5Q8KE());
                    }
                }
                return AudioRestrictionMode.m84boximpl(companion.m92getAUDIO_RESTRICTION_VIBRATION_b5Q8KE());
            }
        }
        return AudioRestrictionMode.m84boximpl(companion.m93getAUDIO_RESTRICTION_VIBRATION_SOUND_b5Q8KE());
    }

    /* JADX INFO: renamed from: updateListenersMode-3NUV5dA, reason: not valid java name */
    private final void m378updateListenersMode3NUV5dA(AudioRestrictionMode previousMode) {
        AudioRestrictionMode audioRestrictionModeM377computeAudioRestrictionMode4o0Og1A = m377computeAudioRestrictionMode4o0Og1A();
        if (audioRestrictionModeM377computeAudioRestrictionMode4o0Og1A == null || audioRestrictionModeM377computeAudioRestrictionMode4o0Og1A.equals(previousMode)) {
            return;
        }
        MutexesKt.withLockLaunch(this.coroutineMutex, this.scope, new AudioRestrictionControllerImpl$updateListenersMode$1(this, audioRestrictionModeM377computeAudioRestrictionMode4o0Og1A, null));
    }

    @Override // androidx.camera.camera2.pipe.compat.AudioRestrictionController
    public void addListener(@NotNull AudioRestrictionController.Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        synchronized (this.lock) {
            try {
                this.activeListeners.add(listener);
                AudioRestrictionMode audioRestrictionModeM377computeAudioRestrictionMode4o0Og1A = m377computeAudioRestrictionMode4o0Og1A();
                if (audioRestrictionModeM377computeAudioRestrictionMode4o0Og1A != null) {
                    MutexesKt.withLockLaunch(this.coroutineMutex, this.scope, new AudioRestrictionControllerImpl$addListener$1$1(listener, audioRestrictionModeM377computeAudioRestrictionMode4o0Og1A, null));
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    /* JADX INFO: renamed from: getGlobalAudioRestrictionMode-4o0Og1A, reason: not valid java name */
    public AudioRestrictionMode m379getGlobalAudioRestrictionMode4o0Og1A() {
        AudioRestrictionMode audioRestrictionMode;
        synchronized (this.lock) {
            audioRestrictionMode = this.globalAudioRestrictionMode;
        }
        return audioRestrictionMode;
    }

    @Override // androidx.camera.camera2.pipe.compat.AudioRestrictionController
    public void removeCameraGraph(@NotNull CameraGraph cameraGraph) {
        Intrinsics.checkNotNullParameter(cameraGraph, "cameraGraph");
        synchronized (this.lock) {
            AudioRestrictionMode audioRestrictionModeM377computeAudioRestrictionMode4o0Og1A = m377computeAudioRestrictionMode4o0Og1A();
            this.audioRestrictionModeMap.remove(cameraGraph);
            m378updateListenersMode3NUV5dA(audioRestrictionModeM377computeAudioRestrictionMode4o0Og1A);
            Unit unit = Unit.f186387a;
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.AudioRestrictionController
    public void removeListener(@NotNull AudioRestrictionController.Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        this.activeListeners.remove(listener);
    }
}
