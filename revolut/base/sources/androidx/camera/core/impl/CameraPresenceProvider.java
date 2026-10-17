package androidx.camera.core.impl;

import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.CameraPresenceListener;
import androidx.camera.core.CameraState;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraPresenceProvider;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import b0.d;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.a1;
import zhm.b0;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.u0;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \\2\u00020\u0001:\u0003]^\\B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b \u0010!J+\u0010%\u001a\u00020\u000e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\"H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000eH\u0002¢\u0006\u0004\b/\u0010\u0012J%\u00103\u001a\u00020\u000e2\u0006\u00101\u001a\u0002002\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b5\u0010*J\u000f\u00106\u001a\u00020\u000eH\u0002¢\u0006\u0004\b6\u0010\u0012J\u001d\u00108\u001a\u00020\u000e2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001e0\"H\u0002¢\u0006\u0004\b8\u00109J\u001d\u0010;\u001a\u00020\u000e2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001e0\"H\u0002¢\u0006\u0004\b;\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010=R\u0014\u0010>\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u001c\u0010B\u001a\b\u0012\u0002\b\u0003\u0018\u00010A8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010DR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010ER$\u0010G\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010IR\u0018\u0010K\u001a\u00060JR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00130R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020U0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010TR&\u0010Z\u001a\u0014\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0X0W8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006_"}, d2 = {"Landroidx/camera/core/impl/CameraPresenceProvider;", "", "Ljava/util/concurrent/Executor;", "backgroundExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutor", "<init>", "(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V", "Landroidx/camera/core/impl/CameraValidator;", "cameraValidator", "Landroidx/camera/core/impl/CameraFactory;", "cameraFactory", "Landroidx/camera/core/impl/CameraRepository;", "cameraRepository", "", "startup", "(Landroidx/camera/core/impl/CameraValidator;Landroidx/camera/core/impl/CameraFactory;Landroidx/camera/core/impl/CameraRepository;)V", "shutdown", "()V", "Landroidx/camera/core/impl/InternalCameraPresenceListener;", "listener", "addDependentInternalListener", "(Landroidx/camera/core/impl/InternalCameraPresenceListener;)V", "Landroidx/camera/core/CameraPresenceListener;", "executor", "addCameraPresenceListener", "(Landroidx/camera/core/CameraPresenceListener;Ljava/util/concurrent/Executor;)V", "removeCameraPresenceListener", "(Landroidx/camera/core/CameraPresenceListener;)V", "", "Landroidx/camera/core/CameraIdentifier;", "newFilteredIdentifiers", "processFilteredCameraIdUpdate", "(Ljava/util/List;)V", "", "addedCameras", "removedCameras", "notifyPublicListeners", "(Ljava/util/Set;Ljava/util/Set;)V", "", "systemCameraId", "conditionallySetupCameraStateObserver", "(Ljava/lang/String;)V", "Landroidx/camera/core/impl/CameraInfoInternal;", "cameraInfoInternal", "setupCameraStateObserver", "(Landroidx/camera/core/impl/CameraInfoInternal;)V", "triggerRefreshWithRetries", "", "attemptsLeft", "initialIds", "scheduleRetryAttempt", "(ILjava/util/List;)V", "removeCameraStateObserver", "clearAllCameraStateObservers", "addedIds", "notifyPublicCamerasAdded", "(Ljava/util/Set;)V", "removedIds", "notifyPublicCamerasRemoved", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/ScheduledExecutorService;", "observerLock", "Ljava/lang/Object;", "retryLock", "Ljava/util/concurrent/ScheduledFuture;", "retryScanFuture", "Ljava/util/concurrent/ScheduledFuture;", "Landroidx/camera/core/impl/CameraFactory;", "Landroidx/camera/core/impl/CameraRepository;", "Landroidx/camera/core/impl/Observable;", "sourcePresenceObservable", "Landroidx/camera/core/impl/Observable;", "Landroidx/camera/core/impl/CameraValidator;", "Landroidx/camera/core/impl/CameraPresenceProvider$SourceObservableObserver;", "sourceObserver", "Landroidx/camera/core/impl/CameraPresenceProvider$SourceObservableObserver;", "currentFilteredIds", "Ljava/util/List;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isMonitoring", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "dependentInternalListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/camera/core/impl/CameraPresenceProvider$ListenerWrapper;", "publicApiListeners", "", "Landroidx/lifecycle/Observer;", "Landroidx/camera/core/CameraState;", "cameraStateObservers", "Ljava/util/Map;", "Companion", "ListenerWrapper", "SourceObservableObserver", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraPresenceProvider {

    @NotNull
    private final Executor backgroundExecutor;
    private CameraFactory cameraFactory;
    private CameraRepository cameraRepository;

    @NotNull
    private final Map<String, Observer<CameraState>> cameraStateObservers;
    private CameraValidator cameraValidator;

    @NotNull
    private volatile List<CameraIdentifier> currentFilteredIds;

    @NotNull
    private final CopyOnWriteArrayList<InternalCameraPresenceListener> dependentInternalListeners;

    @NotNull
    private final AtomicBoolean isMonitoring;

    @NotNull
    private final Object observerLock;

    @NotNull
    private final CopyOnWriteArrayList<ListenerWrapper> publicApiListeners;

    @NotNull
    private final Object retryLock;
    private ScheduledFuture<?> retryScanFuture;

    @NotNull
    private final ScheduledExecutorService scheduledExecutor;

    @NotNull
    private final SourceObservableObserver sourceObserver;
    private Observable<List<CameraIdentifier>> sourcePresenceObservable;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/camera/core/impl/CameraPresenceProvider$ListenerWrapper;", "", "Landroidx/camera/core/CameraPresenceListener;", "listener", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Landroidx/camera/core/CameraPresenceListener;Ljava/util/concurrent/Executor;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/camera/core/CameraPresenceListener;", "getListener", "()Landroidx/camera/core/CameraPresenceListener;", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ListenerWrapper {

        @NotNull
        private final Executor executor;

        @NotNull
        private final CameraPresenceListener listener;

        public ListenerWrapper(@NotNull CameraPresenceListener listener, @NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.listener = listener;
            this.executor = executor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListenerWrapper)) {
                return false;
            }
            ListenerWrapper listenerWrapper = (ListenerWrapper) other;
            return Intrinsics.f(this.listener, listenerWrapper.listener) && Intrinsics.f(this.executor, listenerWrapper.executor);
        }

        @NotNull
        public final Executor getExecutor() {
            return this.executor;
        }

        @NotNull
        public final CameraPresenceListener getListener() {
            return this.listener;
        }

        public int hashCode() {
            return this.executor.hashCode() + (this.listener.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ListenerWrapper(listener=" + this.listener + ", executor=" + this.executor + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/camera/core/impl/CameraPresenceProvider$SourceObservableObserver;", "Landroidx/camera/core/impl/Observable$Observer;", "", "Landroidx/camera/core/CameraIdentifier;", "<init>", "(Landroidx/camera/core/impl/CameraPresenceProvider;)V", "onNewData", "", "rawCameraIdentifiers", "onError", "t", "", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class SourceObservableObserver implements Observable.Observer<List<? extends CameraIdentifier>> {
        public SourceObservableObserver() {
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onError(@NotNull Throwable t2) {
            Intrinsics.checkNotNullParameter(t2, "t");
            if (CameraPresenceProvider.this.isMonitoring.get()) {
                Logger.e("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", t2);
                Observable observable = CameraPresenceProvider.this.sourcePresenceObservable;
                if (observable != null) {
                    observable.fetchData();
                }
            }
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public /* bridge */ /* synthetic */ void onNewData(List<? extends CameraIdentifier> list) {
            onNewData2((List<CameraIdentifier>) list);
        }

        /* JADX INFO: renamed from: onNewData, reason: avoid collision after fix types in other method */
        public void onNewData2(List<CameraIdentifier> rawCameraIdentifiers) {
            CameraFactory cameraFactory;
            CameraRepository cameraRepository;
            CameraValidator cameraValidator;
            List<String> arrayList;
            if (!CameraPresenceProvider.this.isMonitoring.get() || (cameraFactory = CameraPresenceProvider.this.cameraFactory) == null || (cameraRepository = CameraPresenceProvider.this.cameraRepository) == null || (cameraValidator = CameraPresenceProvider.this.cameraValidator) == null) {
                return;
            }
            if (rawCameraIdentifiers != null) {
                List<CameraIdentifier> list = rawCameraIdentifiers;
                arrayList = new ArrayList<>(w.t(list, 10));
                Iterator<T> it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((CameraIdentifier) it8.next()).getInternalId());
                }
            } else {
                arrayList = f0.f322471a;
            }
            if (cameraFactory instanceof CameraFactory.Interrogator) {
                try {
                    List list2 = CameraPresenceProvider.this.currentFilteredIds;
                    List<String> availableCameraIds = ((CameraFactory.Interrogator) cameraFactory).getAvailableCameraIds(arrayList);
                    Intrinsics.checkNotNullExpressionValue(availableCameraIds, "getAvailableCameraIds(...)");
                    List<String> list3 = availableCameraIds;
                    ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                    for (String str : list3) {
                        Intrinsics.h(str);
                        arrayList2.add(CameraIdentifier.Factory.create$default(str, null, null, 6, null));
                    }
                    Set<CameraIdentifier> setK = a1.k(d0.i1(list2), d0.i1(arrayList2));
                    if (!setK.isEmpty()) {
                        LinkedHashSet<CameraInternal> cameras = cameraRepository.getCameras();
                        Intrinsics.checkNotNullExpressionValue(cameras, "getCameras(...)");
                        if (cameraValidator.isChangeInvalid(cameras, setK)) {
                            Logger.w("CameraPresencePrvdr", "Camera removal update invalid. Aborting.");
                            return;
                        }
                    }
                } catch (Exception e) {
                    Logger.w("CameraPresencePrvdr", "Failed to interrogate camera factory. Falling back to full update.", e);
                }
            }
            try {
                cameraFactory.onCameraIdsUpdated(arrayList);
                Set<String> availableCameraIds2 = cameraFactory.getAvailableCameraIds();
                Intrinsics.checkNotNullExpressionValue(availableCameraIds2, "getAvailableCameraIds(...)");
                Set<String> set = availableCameraIds2;
                ArrayList arrayList3 = new ArrayList(w.t(set, 10));
                for (String str2 : set) {
                    Intrinsics.h(str2);
                    arrayList3.add(CameraIdentifier.Factory.create$default(str2, null, null, 6, null));
                }
                if (arrayList3.equals(CameraPresenceProvider.this.currentFilteredIds)) {
                    return;
                }
                CameraPresenceProvider.this.processFilteredCameraIdUpdate(arrayList3);
            } catch (Exception e2) {
                Logger.w("CameraPresencePrvdr", "CameraFactory failed to update. The camera list may be stale until the next update.", e2);
            }
        }
    }

    public CameraPresenceProvider(@NotNull Executor backgroundExecutor, @NotNull ScheduledExecutorService scheduledExecutor) {
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        Intrinsics.checkNotNullParameter(scheduledExecutor, "scheduledExecutor");
        this.backgroundExecutor = backgroundExecutor;
        this.scheduledExecutor = scheduledExecutor;
        this.observerLock = new Object();
        this.retryLock = new Object();
        this.sourceObserver = new SourceObservableObserver();
        this.currentFilteredIds = f0.f322471a;
        this.isMonitoring = new AtomicBoolean(false);
        this.dependentInternalListeners = new CopyOnWriteArrayList<>();
        this.publicApiListeners = new CopyOnWriteArrayList<>();
        this.cameraStateObservers = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addCameraPresenceListener$lambda$0(CameraPresenceProvider cameraPresenceProvider, CameraPresenceListener cameraPresenceListener) {
        Set<CameraIdentifier> setI1 = d0.i1(cameraPresenceProvider.currentFilteredIds);
        if (setI1.isEmpty()) {
            return;
        }
        cameraPresenceListener.onCamerasAdded(setI1);
    }

    private final void clearAllCameraStateObservers() {
        synchronized (this.observerLock) {
            if (this.cameraStateObservers.isEmpty()) {
                return;
            }
            Map mapU = r0.u(this.cameraStateObservers);
            this.cameraStateObservers.clear();
            Unit unit = Unit.f186387a;
            CameraRepository cameraRepository = this.cameraRepository;
            if (cameraRepository != null) {
                LinkedHashSet<CameraInternal> cameras = cameraRepository.getCameras();
                Intrinsics.checkNotNullExpressionValue(cameras, "getCameras(...)");
                ArrayList arrayList = new ArrayList();
                for (CameraInternal cameraInternal : cameras) {
                    CameraInfoInternal cameraInfoInternal = cameraInternal != null ? cameraInternal.getCameraInfoInternal() : null;
                    if (cameraInfoInternal != null) {
                        arrayList.add(cameraInfoInternal);
                    }
                }
                Logger.d("CameraPresencePrvdr", "Clearing all " + mapU.size() + " state observers.");
                for (Map.Entry entry : mapU.entrySet()) {
                    CameraXExecutors.mainThreadExecutor().execute(new d(arrayList, 6, (Observer) entry.getValue(), (String) entry.getKey()));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearAllCameraStateObservers$lambda$2$0(List list, Observer observer, String str) {
        Object next;
        LiveData<CameraState> cameraState;
        try {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it8.next();
                    if (Intrinsics.f(((CameraInfoInternal) next).getCameraId(), str)) {
                        break;
                    }
                }
            }
            CameraInfoInternal cameraInfoInternal = (CameraInfoInternal) next;
            if (cameraInfoInternal == null || (cameraState = cameraInfoInternal.getCameraState()) == null) {
                return;
            }
            cameraState.removeObserver(observer);
        } catch (IllegalArgumentException unused) {
        }
    }

    private final void conditionallySetupCameraStateObserver(String systemCameraId) {
        CameraRepository cameraRepository = this.cameraRepository;
        if (cameraRepository == null) {
            return;
        }
        try {
            CameraInternal camera = cameraRepository.getCamera(systemCameraId);
            Intrinsics.checkNotNullExpressionValue(camera, "getCamera(...)");
            CameraInfoInternal cameraInfoInternal = camera.getCameraInfoInternal();
            Intrinsics.checkNotNullExpressionValue(cameraInfoInternal, "getCameraInfoInternal(...)");
            setupCameraStateObserver(cameraInfoInternal);
        } catch (IllegalArgumentException unused) {
            Logger.w("CameraPresencePrvdr", "CameraInternal not found for " + systemCameraId + ". Cannot setup state observer.");
        }
    }

    private final void notifyPublicCamerasAdded(Set<CameraIdentifier> addedIds) {
        for (ListenerWrapper listenerWrapper : this.publicApiListeners) {
            listenerWrapper.getExecutor().execute(new b(listenerWrapper, addedIds, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyPublicCamerasAdded$lambda$0$0(ListenerWrapper listenerWrapper, Set set) {
        listenerWrapper.getListener().onCamerasAdded(set);
    }

    private final void notifyPublicCamerasRemoved(Set<CameraIdentifier> removedIds) {
        for (ListenerWrapper listenerWrapper : this.publicApiListeners) {
            listenerWrapper.getExecutor().execute(new b(listenerWrapper, removedIds, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyPublicCamerasRemoved$lambda$0$0(ListenerWrapper listenerWrapper, Set set) {
        listenerWrapper.getListener().onCamerasRemoved(set);
    }

    private final void notifyPublicListeners(Set<CameraIdentifier> addedCameras, Set<CameraIdentifier> removedCameras) {
        if (!addedCameras.isEmpty()) {
            Logger.i("CameraPresencePrvdr", "Notifying " + addedCameras.size() + " cameras added.");
            notifyPublicCamerasAdded(addedCameras);
        }
        if (removedCameras.isEmpty()) {
            return;
        }
        Logger.i("CameraPresencePrvdr", "Notifying " + removedCameras.size() + " cameras removed.");
        notifyPublicCamerasRemoved(removedCameras);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processFilteredCameraIdUpdate(List<CameraIdentifier> newFilteredIdentifiers) {
        List listD1 = d0.d1(this.currentFilteredIds);
        if (Intrinsics.f(newFilteredIdentifiers, listD1)) {
            return;
        }
        synchronized (this.retryLock) {
            try {
                if (this.retryScanFuture != null) {
                    Logger.d("CameraPresencePrvdr", "Camera list updated. Cancelling any pending retries.");
                    ScheduledFuture<?> scheduledFuture = this.retryScanFuture;
                    Intrinsics.h(scheduledFuture);
                    scheduledFuture.cancel(false);
                    this.retryScanFuture = null;
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        List list = listD1;
        Set setI1 = d0.i1(list);
        List<CameraIdentifier> list2 = newFilteredIdentifiers;
        Set setI12 = d0.i1(list2);
        Set<CameraIdentifier> setK = a1.k(setI12, setI1);
        Set<CameraIdentifier> setK2 = a1.k(setI1, setI12);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        Iterator<T> it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((CameraIdentifier) it8.next()).getInternalId());
        }
        try {
            Iterator<T> it9 = setK2.iterator();
            while (it9.hasNext()) {
                removeCameraStateObserver(((CameraIdentifier) it9.next()).getInternalId());
            }
            CameraRepository cameraRepository = this.cameraRepository;
            if (cameraRepository != null) {
                Logger.d("CameraPresencePrvdr", "Updating CameraRepository...");
                cameraRepository.onCamerasUpdated(arrayList2);
                arrayList.add(cameraRepository);
                Logger.d("CameraPresencePrvdr", "CameraRepository updated successfully.");
            }
            if (!this.dependentInternalListeners.isEmpty()) {
                Logger.d("CameraPresencePrvdr", "Updating " + this.dependentInternalListeners.size() + " dependent listeners...");
                for (InternalCameraPresenceListener internalCameraPresenceListener : this.dependentInternalListeners) {
                    internalCameraPresenceListener.onCamerasUpdated(arrayList2);
                    arrayList.add(internalCameraPresenceListener);
                }
            }
            this.currentFilteredIds = newFilteredIdentifiers;
            Iterator<T> it10 = setK.iterator();
            while (it10.hasNext()) {
                conditionallySetupCameraStateObserver(((CameraIdentifier) it10.next()).getInternalId());
            }
            notifyPublicListeners(setK, setK2);
        } catch (Exception e) {
            Logger.e("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e);
            ArrayList arrayList3 = new ArrayList(w.t(list, 10));
            Iterator it11 = list.iterator();
            while (it11.hasNext()) {
                arrayList3.add(((CameraIdentifier) it11.next()).getInternalId());
            }
            Iterator it12 = b0.M(arrayList).iterator();
            while (true) {
                u0 u0Var = (u0) it12;
                if (!u0Var.f322480a.hasPrevious()) {
                    break;
                }
                InternalCameraPresenceListener internalCameraPresenceListener2 = (InternalCameraPresenceListener) u0Var.f322480a.previous();
                try {
                    internalCameraPresenceListener2.onCamerasUpdated(arrayList3);
                } catch (Exception e2) {
                    Logger.e("CameraPresencePrvdr", "Failed to rollback listener: " + internalCameraPresenceListener2, e2);
                }
            }
            Iterator<T> it13 = setK2.iterator();
            while (it13.hasNext()) {
                conditionallySetupCameraStateObserver(((CameraIdentifier) it13.next()).getInternalId());
            }
            Iterator<T> it14 = setK.iterator();
            while (it14.hasNext()) {
                removeCameraStateObserver(((CameraIdentifier) it14.next()).getInternalId());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeCameraPresenceListener$lambda$0(CameraPresenceListener cameraPresenceListener, ListenerWrapper listenerWrapper) {
        return Intrinsics.f(listenerWrapper.getListener(), cameraPresenceListener);
    }

    private final void removeCameraStateObserver(String systemCameraId) {
        synchronized (this.observerLock) {
            Observer<CameraState> observerRemove = this.cameraStateObservers.remove(systemCameraId);
            CameraRepository cameraRepository = this.cameraRepository;
            if (observerRemove != null && cameraRepository != null) {
                try {
                    CameraInternal camera = cameraRepository.getCamera(systemCameraId);
                    Intrinsics.checkNotNullExpressionValue(camera, "getCamera(...)");
                    CameraXExecutors.mainThreadExecutor().execute(new d0.c(camera, observerRemove, 3));
                    Logger.d("CameraPresencePrvdr", "Removed state observer for: " + systemCameraId);
                } catch (IllegalArgumentException unused) {
                }
            }
            Unit unit = Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeCameraStateObserver$lambda$0$0(CameraInternal cameraInternal, Observer observer) {
        cameraInternal.getCameraInfoInternal().getCameraState().removeObserver(observer);
    }

    private final void scheduleRetryAttempt(int attemptsLeft, List<CameraIdentifier> initialIds) {
        if (attemptsLeft > 0 && this.isMonitoring.get()) {
            this.retryScanFuture = this.scheduledExecutor.schedule(new e0.d(this, initialIds, attemptsLeft, 1), attemptsLeft == 3 ? 0L : 400L, TimeUnit.MILLISECONDS);
        } else if (attemptsLeft <= 0) {
            Logger.w("CameraPresencePrvdr", "Exhausted all retries for camera list refresh.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleRetryAttempt$lambda$0(CameraPresenceProvider cameraPresenceProvider, List list, int i) {
        cameraPresenceProvider.backgroundExecutor.execute(new e0.d(cameraPresenceProvider, list, i, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleRetryAttempt$lambda$0$0(CameraPresenceProvider cameraPresenceProvider, List list, int i) {
        if (cameraPresenceProvider.isMonitoring.get() && Intrinsics.f(cameraPresenceProvider.currentFilteredIds, list)) {
            Logger.d("CameraPresencePrvdr", "Triggering refresh. Attempts left: " + i);
            Observable<List<CameraIdentifier>> observable = cameraPresenceProvider.sourcePresenceObservable;
            if (observable != null) {
                observable.fetchData();
            }
            cameraPresenceProvider.scheduleRetryAttempt(i - 1, list);
        }
    }

    private final void setupCameraStateObserver(CameraInfoInternal cameraInfoInternal) {
        final String cameraId = cameraInfoInternal.getCameraId();
        Intrinsics.checkNotNullExpressionValue(cameraId, "getCameraId(...)");
        if (this.isMonitoring.get()) {
            synchronized (this.observerLock) {
                if (this.cameraStateObservers.containsKey(cameraId)) {
                    return;
                }
                Observer<CameraState> observer = new Observer() { // from class: e0.e
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj2) {
                        CameraPresenceProvider.setupCameraStateObserver$lambda$0$0(this.f121365a, cameraId, (CameraState) obj2);
                    }
                };
                CameraXExecutors.mainThreadExecutor().execute(new d0.c(cameraInfoInternal, observer, 5));
                this.cameraStateObservers.put(cameraId, observer);
                Logger.d("CameraPresencePrvdr", "Registered state observer for camera: " + cameraId);
                Unit unit = Unit.f186387a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCameraStateObserver$lambda$0$0(CameraPresenceProvider cameraPresenceProvider, String str, CameraState cameraState) {
        if (!cameraPresenceProvider.isMonitoring.get()) {
            Logger.d("CameraPresencePrvdr", "Ignore camera state change handling since already stop monitoring");
            return;
        }
        if (cameraState.getError() != null) {
            StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Camera ", str, " state changed to ");
            sbX.append(cameraState.getType());
            sbX.append(" with error: ");
            CameraState.StateError error = cameraState.getError();
            sbX.append(error != null ? Integer.valueOf(error.getCode()) : null);
            sbX.append(". Triggering refresh.");
            Logger.w("CameraPresencePrvdr", sbX.toString());
            cameraPresenceProvider.backgroundExecutor.execute(new e0.c(cameraPresenceProvider, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCameraStateObserver$lambda$0$1(CameraInfoInternal cameraInfoInternal, Observer observer) {
        cameraInfoInternal.getCameraState().observeForever(observer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startup$lambda$1(CameraPresenceProvider cameraPresenceProvider) {
        Iterator<T> it8 = cameraPresenceProvider.currentFilteredIds.iterator();
        while (it8.hasNext()) {
            cameraPresenceProvider.conditionallySetupCameraStateObserver(((CameraIdentifier) it8.next()).getInternalId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void triggerRefreshWithRetries() {
        synchronized (this.retryLock) {
            try {
                ScheduledFuture<?> scheduledFuture = this.retryScanFuture;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                Logger.d("CameraPresencePrvdr", "Starting new refresh-with-retries sequence.");
                scheduleRetryAttempt(3, this.currentFilteredIds);
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void addCameraPresenceListener(@NotNull CameraPresenceListener listener, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.publicApiListeners.add(new ListenerWrapper(listener, executor));
        executor.execute(new d0.c(this, listener, 4));
    }

    public final void addDependentInternalListener(@NotNull InternalCameraPresenceListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.dependentInternalListeners.add(listener);
    }

    public final void removeCameraPresenceListener(@NotNull final CameraPresenceListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        a0.E(this.publicApiListeners, new Function1() { // from class: androidx.camera.core.impl.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(CameraPresenceProvider.removeCameraPresenceListener$lambda$0(listener, (CameraPresenceProvider.ListenerWrapper) obj2));
            }
        });
    }

    public final void shutdown() {
        if (!this.isMonitoring.getAndSet(false)) {
            Logger.d("CameraPresencePrvdr", "Shutdown called when not monitoring. Ignoring.");
            return;
        }
        Logger.i("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
        synchronized (this.retryLock) {
            try {
                ScheduledFuture<?> scheduledFuture = this.retryScanFuture;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.retryScanFuture = null;
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        Observable<List<CameraIdentifier>> observable = this.sourcePresenceObservable;
        if (observable != null) {
            observable.removeObserver(this.sourceObserver);
        }
        clearAllCameraStateObservers();
        this.cameraValidator = null;
        this.dependentInternalListeners.clear();
        this.publicApiListeners.clear();
        this.currentFilteredIds = f0.f322471a;
        this.cameraFactory = null;
        this.cameraRepository = null;
    }

    public final void startup(@NotNull CameraValidator cameraValidator, @NotNull CameraFactory cameraFactory, @NotNull CameraRepository cameraRepository) {
        Intrinsics.checkNotNullParameter(cameraValidator, "cameraValidator");
        Intrinsics.checkNotNullParameter(cameraFactory, "cameraFactory");
        Intrinsics.checkNotNullParameter(cameraRepository, "cameraRepository");
        if (this.isMonitoring.compareAndSet(false, true)) {
            Logger.i("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
            this.cameraValidator = cameraValidator;
            Set<String> availableCameraIds = cameraFactory.getAvailableCameraIds();
            Intrinsics.checkNotNullExpressionValue(availableCameraIds, "getAvailableCameraIds(...)");
            Set<String> set = availableCameraIds;
            ArrayList arrayList = new ArrayList(w.t(set, 10));
            for (String str : set) {
                Intrinsics.h(str);
                arrayList.add(CameraIdentifier.Factory.create$default(str, null, null, 6, null));
            }
            this.currentFilteredIds = arrayList;
            this.cameraFactory = cameraFactory;
            this.cameraRepository = cameraRepository;
            this.sourcePresenceObservable = cameraFactory.getCameraPresenceSource();
            this.backgroundExecutor.execute(new e0.c(this, 0));
            Observable<List<CameraIdentifier>> observable = this.sourcePresenceObservable;
            if (observable != null) {
                observable.addObserver(CameraXExecutors.newSequentialExecutor(this.backgroundExecutor), this.sourceObserver);
            }
        }
    }
}
