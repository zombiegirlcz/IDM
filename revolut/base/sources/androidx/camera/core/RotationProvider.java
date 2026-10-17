package androidx.camera.core;

import android.content.Context;
import android.view.OrientationEventListener;
import androidx.camera.core.RotationProvider;
import au6.z0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 *2\u00020\u0001:\u0003+,*B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020!0 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R$\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Landroidx/camera/core/RotationProvider;", "", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "", "ignoreCanDetectForTest", "(Landroid/content/Context;Z)V", "", "newRotation", "", "updateRotation", "(I)V", "orientation", "orientationToSurfaceRotation", "(I)I", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/camera/core/RotationProvider$Listener;", "listener", "addListener", "(Ljava/util/concurrent/Executor;Landroidx/camera/core/RotationProvider$Listener;)Z", "removeListener", "(Landroidx/camera/core/RotationProvider$Listener;)V", "shutdown", "()V", "lock", "Ljava/lang/Object;", "Landroid/view/OrientationEventListener;", "orientationListener", "Landroid/view/OrientationEventListener;", "", "Landroidx/camera/core/RotationProvider$ListenerWrapper;", "listeners", "Ljava/util/Map;", "rotation", "I", "Z", "value", "isShutdown", "()Z", "Companion", "Listener", "ListenerWrapper", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RotationProvider {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final boolean ignoreCanDetectForTest;
    private boolean isShutdown;

    @NotNull
    private final Map<Listener, ListenerWrapper> listeners;

    @NotNull
    private final Object lock;

    @NotNull
    private final OrientationEventListener orientationListener;
    private volatile int rotation;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/camera/core/RotationProvider$Companion;", "", "<init>", "()V", "TAG", "", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/camera/core/RotationProvider$Listener;", "", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Listener {
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/camera/core/RotationProvider$ListenerWrapper;", "", "listener", "Landroidx/camera/core/RotationProvider$Listener;", "executor", "Ljava/util/concurrent/Executor;", "<init>", "(Landroidx/camera/core/RotationProvider$Listener;Ljava/util/concurrent/Executor;)V", "enabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "onRotationChanged", "", "rotation", "", "disable", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ListenerWrapper {

        @NotNull
        private final AtomicBoolean enabled;

        @NotNull
        private final Executor executor;

        @NotNull
        private final Listener listener;

        public ListenerWrapper(@NotNull Listener listener, @NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.listener = listener;
            this.executor = executor;
            this.enabled = new AtomicBoolean(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onRotationChanged$lambda$0(ListenerWrapper listenerWrapper, int i) {
            if (listenerWrapper.enabled.get()) {
                ((UseCase) ((z0) listenerWrapper.listener).f9673b).onProviderRotationChanged(i);
            }
        }

        public final void disable() {
            this.enabled.set(false);
        }

        public final void onRotationChanged(final int rotation) {
            if (this.enabled.get()) {
                try {
                    this.executor.execute(new Runnable() { // from class: androidx.camera.core.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            RotationProvider.ListenerWrapper.onRotationChanged$lambda$0(this.f6846a, rotation);
                        }
                    });
                } catch (RejectedExecutionException unused) {
                    Logger.w("RotationProvider", "Failed to execute the command. Maybe the executor has been shutdown.");
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RotationProvider(@NotNull Context appContext) {
        this(appContext, false);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int orientationToSurfaceRotation(int orientation) {
        if (this.rotation == -1) {
            if (orientation >= 0 && orientation < 45) {
                return 0;
            }
            if (45 <= orientation && orientation < 135) {
                return 3;
            }
            if (135 > orientation || orientation >= 225) {
                return (225 > orientation || orientation >= 315) ? 0 : 1;
            }
            return 2;
        }
        if ((orientation >= 0 && orientation < 40) || (320 <= orientation && orientation < 360)) {
            return 0;
        }
        if (50 <= orientation && orientation < 130) {
            return 3;
        }
        if (140 <= orientation && orientation < 220) {
            return 2;
        }
        if (230 > orientation || orientation >= 310) {
            return this.rotation;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateRotation(int newRotation) {
        List listD1;
        if (this.rotation != newRotation) {
            this.rotation = newRotation;
            synchronized (this.lock) {
                listD1 = d0.d1(this.listeners.values());
                Unit unit = Unit.f186387a;
            }
            Iterator it8 = listD1.iterator();
            while (it8.hasNext()) {
                ((ListenerWrapper) it8.next()).onRotationChanged(newRotation);
            }
        }
    }

    public final boolean addListener(@NotNull Executor executor, @NotNull Listener listener) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.lock) {
            if (!this.ignoreCanDetectForTest && !this.orientationListener.canDetectOrientation()) {
                return false;
            }
            ListenerWrapper listenerWrapper = new ListenerWrapper(listener, executor);
            this.listeners.put(listener, listenerWrapper);
            if (this.rotation != -1) {
                listenerWrapper.onRotationChanged(this.rotation);
            }
            if (this.listeners.size() == 1) {
                this.orientationListener.enable();
            }
            Unit unit = Unit.f186387a;
            return true;
        }
    }

    public final void removeListener(@NotNull Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.lock) {
            try {
                ListenerWrapper listenerWrapper = this.listeners.get(listener);
                if (listenerWrapper != null) {
                    listenerWrapper.disable();
                    this.listeners.remove(listener);
                }
                if (this.listeners.isEmpty()) {
                    this.orientationListener.disable();
                    this.rotation = -1;
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void shutdown() {
        synchronized (this.lock) {
            this.orientationListener.disable();
            this.listeners.clear();
            this.isShutdown = true;
            this.rotation = -1;
            Unit unit = Unit.f186387a;
        }
    }

    public RotationProvider(@NotNull Context appContext, boolean z) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.lock = new Object();
        this.listeners = new LinkedHashMap();
        this.rotation = -1;
        this.ignoreCanDetectForTest = z;
        this.orientationListener = new OrientationEventListener(appContext) { // from class: androidx.camera.core.RotationProvider.1
            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int orientation) {
                if (orientation == -1) {
                    return;
                }
                this.updateRotation(this.orientationToSurfaceRotation(orientation));
            }
        };
    }
}
