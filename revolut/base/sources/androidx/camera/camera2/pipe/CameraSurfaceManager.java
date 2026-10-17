package androidx.camera.camera2.pipe;

import android.view.Surface;
import androidx.camera.camera2.pipe.core.Log;
import hx7.b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rkm.d;
import zhm.d0;

/* JADX INFO: loaded from: classes15.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0003\u0019\u001a\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0019\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u0013\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0014J\u0019\u0010\u0015\u001a\u00020\r2\n\u0010\u0016\u001a\u00060\u0017R\u00020\u0000H\u0000¢\u0006\u0002\b\u0018R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "", "<init>", "()V", "lock", "useCountMap", "", "Landroid/view/Surface;", "", "listeners", "", "Landroidx/camera/camera2/pipe/CameraSurfaceManager$SurfaceListener;", "addListener", "", "listener", "removeListener", "registerSurface", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "surface", "registerSurface$camera_camera2_pipe", "onTokenClosed", "surfaceToken", "Landroidx/camera/camera2/pipe/CameraSurfaceManager$SurfaceToken;", "onTokenClosed$camera_camera2_pipe", "SurfaceToken", "SurfaceListener", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraSurfaceManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final d surfaceTokenDebugIds = b.h(0);

    @NotNull
    private final Object lock = new Object();

    @NotNull
    private final Map<Surface, Integer> useCountMap = new LinkedHashMap();

    @NotNull
    private final Set<SurfaceListener> listeners = new LinkedHashSet();

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/camera/camera2/pipe/CameraSurfaceManager$Companion;", "", "<init>", "()V", "Lrkm/d;", "surfaceTokenDebugIds", "Lrkm/d;", "getSurfaceTokenDebugIds$camera_camera2_pipe", "()Lrkm/d;", "", "DEBUG", "Z", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final d getSurfaceTokenDebugIds$camera_camera2_pipe() {
            return CameraSurfaceManager.surfaceTokenDebugIds;
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/CameraSurfaceManager$SurfaceListener;", "", "onSurfaceActive", "", "surface", "Landroid/view/Surface;", "onSurfaceInactive", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface SurfaceListener {
        void onSurfaceActive(@NotNull Surface surface);

        void onSurfaceInactive(@NotNull Surface surface);
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/camera/camera2/pipe/CameraSurfaceManager$SurfaceToken;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Landroid/view/Surface;", "surface", "<init>", "(Landroidx/camera/camera2/pipe/CameraSurfaceManager;Landroid/view/Surface;)V", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "Landroid/view/Surface;", "getSurface$camera_camera2_pipe", "()Landroid/view/Surface;", "", "debugId", "I", "Lrkm/b;", "closed", "Lrkm/b;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class SurfaceToken implements AutoCloseable {

        @NotNull
        private final rkm.b closed;
        private final int debugId;

        @NotNull
        private final Surface surface;
        final /* synthetic */ CameraSurfaceManager this$0;

        public SurfaceToken(@NotNull CameraSurfaceManager cameraSurfaceManager, Surface surface) {
            Intrinsics.checkNotNullParameter(surface, "surface");
            this.this$0 = cameraSurfaceManager;
            this.surface = surface;
            d surfaceTokenDebugIds$camera_camera2_pipe = CameraSurfaceManager.INSTANCE.getSurfaceTokenDebugIds$camera_camera2_pipe();
            surfaceTokenDebugIds$camera_camera2_pipe.getClass();
            this.debugId = d.f254895b.incrementAndGet(surfaceTokenDebugIds$camera_camera2_pipe);
            this.closed = b.g(false);
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (this.closed.a()) {
                this.this$0.onTokenClosed$camera_camera2_pipe(this);
            }
        }

        @NotNull
        /* JADX INFO: renamed from: getSurface$camera_camera2_pipe, reason: from getter */
        public final Surface getSurface() {
            return this.surface;
        }

        @NotNull
        public String toString() {
            return "SurfaceToken-" + this.debugId;
        }
    }

    public final void addListener(@NotNull SurfaceListener listener) {
        Set setKeySet;
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.lock) {
            try {
                this.listeners.add(listener);
                Map<Surface, Integer> map = this.useCountMap;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Surface, Integer> entry : map.entrySet()) {
                    if (entry.getValue().intValue() > 0) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                setKeySet = linkedHashMap.keySet();
            } catch (Throwable th10) {
                throw th10;
            }
        }
        Iterator it8 = setKeySet.iterator();
        while (it8.hasNext()) {
            listener.onSurfaceActive((Surface) it8.next());
        }
    }

    public final void onTokenClosed$camera_camera2_pipe(@NotNull SurfaceToken surfaceToken) {
        Surface surface;
        List listD1;
        Intrinsics.checkNotNullParameter(surfaceToken, "surfaceToken");
        synchronized (this.lock) {
            try {
                surface = surfaceToken.getSurface();
                Integer num = this.useCountMap.get(surface);
                if (num == null) {
                    throw new IllegalStateException(("Surface " + surface + " (" + surfaceToken + ") has no use count").toString());
                }
                int iIntValue = num.intValue() - 1;
                this.useCountMap.put(surface, Integer.valueOf(iIntValue));
                if (iIntValue == 0) {
                    listD1 = d0.d1(this.listeners);
                    this.useCountMap.remove(surface);
                } else {
                    listD1 = null;
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (listD1 != null) {
            Iterator it8 = listD1.iterator();
            while (it8.hasNext()) {
                ((SurfaceListener) it8.next()).onSurfaceInactive(surface);
            }
        }
    }

    @NotNull
    public final AutoCloseable registerSurface$camera_camera2_pipe(@NotNull Surface surface) {
        SurfaceToken surfaceToken;
        List listD1;
        Intrinsics.checkNotNullParameter(surface, "surface");
        if (!surface.isValid() && Log.INSTANCE.getWARN_LOGGABLE()) {
            String str = "registerSurface: Surface " + surface + " isn't valid!";
        }
        synchronized (this.lock) {
            try {
                surfaceToken = new SurfaceToken(this, surface);
                Integer num = this.useCountMap.get(surface);
                int iIntValue = (num != null ? num.intValue() : 0) + 1;
                this.useCountMap.put(surface, Integer.valueOf(iIntValue));
                listD1 = iIntValue == 1 ? d0.d1(this.listeners) : null;
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (listD1 != null) {
            Iterator it8 = listD1.iterator();
            while (it8.hasNext()) {
                ((SurfaceListener) it8.next()).onSurfaceActive(surface);
            }
        }
        return surfaceToken;
    }

    public final void removeListener(@NotNull SurfaceListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.lock) {
            this.listeners.remove(listener);
        }
    }
}
