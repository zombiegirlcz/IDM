package androidx.camera.camera2.adapter;

import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.internal.CameraCompatibilityFilter;
import androidx.camera.camera2.pipe.CameraDevices;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.CameraUpdateException;
import androidx.camera.core.impl.InternalCameraPresenceListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010\u001fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R*\u0010&\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b&\u0010'\u0012\u0004\b+\u0010\u001f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\rR4\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0,8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b.\u0010/\u0012\u0004\b4\u0010\u001f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R:\u00106\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b6\u00107\u0012\u0004\b<\u0010\u001f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R.\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b=\u0010>\u0012\u0004\bB\u0010\u001f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010\u0012R(\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0C8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010>\u001a\u0004\bE\u0010@\"\u0004\bF\u0010\u0012R(\u0010G\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bG\u0010H\u0012\u0004\bK\u0010\u001f\u001a\u0004\bI\u0010\u001a\"\u0004\bJ\u0010\u001dR(\u0010M\u001a\u00020L8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bM\u0010N\u0012\u0004\bS\u0010\u001f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Landroidx/camera/camera2/adapter/CameraCoordinatorAdapter;", "Landroidx/camera/core/concurrent/CameraCoordinator;", "Landroidx/camera/core/impl/InternalCameraPresenceListener;", "Landroidx/camera/camera2/pipe/CameraPipe;", "cameraPipe", "Landroidx/camera/camera2/pipe/CameraDevices;", "cameraDevices", "<init>", "(Landroidx/camera/camera2/pipe/CameraPipe;Landroidx/camera/camera2/pipe/CameraDevices;)V", "Landroidx/camera/core/impl/CameraRepository;", "repository", "", "init", "(Landroidx/camera/core/impl/CameraRepository;)V", "", "", "cameraIds", "onCamerasUpdated", "(Ljava/util/List;)V", "Landroidx/camera/core/CameraInfo;", "cameraInfo", "addPendingCameraInfo", "(Landroidx/camera/core/CameraInfo;)V", "removePendingCameraInfo", "", "getCameraOperatingMode", "()I", "cameraOperatingMode", "setCameraOperatingMode", "(I)V", "shutdown", "()V", "tryStartConcurrentGraph", "Landroidx/camera/camera2/pipe/CameraPipe;", "Landroidx/camera/camera2/pipe/CameraDevices;", "", "lock", "Ljava/lang/Object;", "cameraRepository", "Landroidx/camera/core/impl/CameraRepository;", "getCameraRepository", "()Landroidx/camera/core/impl/CameraRepository;", "setCameraRepository", "getCameraRepository$annotations", "", "Landroidx/camera/camera2/pipe/CameraId;", "concurrentCameraIdsSet", "Ljava/util/Set;", "getConcurrentCameraIdsSet", "()Ljava/util/Set;", "setConcurrentCameraIdsSet", "(Ljava/util/Set;)V", "getConcurrentCameraIdsSet$annotations", "", "concurrentCameraIdMap", "Ljava/util/Map;", "getConcurrentCameraIdMap", "()Ljava/util/Map;", "setConcurrentCameraIdMap", "(Ljava/util/Map;)V", "getConcurrentCameraIdMap$annotations", "activeConcurrentCameraInfosList", "Ljava/util/List;", "getActiveConcurrentCameraInfosList", "()Ljava/util/List;", "setActiveConcurrentCameraInfosList", "getActiveConcurrentCameraInfosList$annotations", "", "pendingCameraIds", "getPendingCameraIds", "setPendingCameraIds", "concurrentMode", "I", "getConcurrentMode", "setConcurrentMode", "getConcurrentMode$annotations", "", "concurrentModeOn", "Z", "getConcurrentModeOn", "()Z", "setConcurrentModeOn", "(Z)V", "getConcurrentModeOn$annotations", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraCoordinatorAdapter implements CameraCoordinator, InternalCameraPresenceListener {

    @NotNull
    private List<? extends CameraInfo> activeConcurrentCameraInfosList;

    @NotNull
    private final CameraDevices cameraDevices;
    private CameraPipe cameraPipe;
    private CameraRepository cameraRepository;

    @NotNull
    private Map<String, ? extends List<String>> concurrentCameraIdMap;

    @NotNull
    private Set<? extends Set<CameraId>> concurrentCameraIdsSet;
    private int concurrentMode;
    private boolean concurrentModeOn;

    @NotNull
    private final Object lock;

    @NotNull
    private List<String> pendingCameraIds;

    public CameraCoordinatorAdapter(CameraPipe cameraPipe, @NotNull CameraDevices cameraDevices) {
        Intrinsics.checkNotNullParameter(cameraDevices, "cameraDevices");
        this.cameraPipe = cameraPipe;
        this.cameraDevices = cameraDevices;
        this.lock = new Object();
        this.concurrentCameraIdsSet = h0.f322473a;
        this.concurrentCameraIdMap = r0.g();
        this.activeConcurrentCameraInfosList = f0.f322471a;
        this.pendingCameraIds = new ArrayList();
    }

    private final void tryStartConcurrentGraph() {
        CameraInternal camera;
        synchronized (this.lock) {
            try {
                if (!this.activeConcurrentCameraInfosList.isEmpty() && !this.pendingCameraIds.isEmpty()) {
                    List<? extends CameraInfo> list = this.activeConcurrentCameraInfosList;
                    ArrayList arrayList = new ArrayList(w.t(list, 10));
                    Iterator<T> it8 = list.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            if (Intrinsics.f(d0.i1(arrayList), d0.i1(this.pendingCameraIds))) {
                                this.pendingCameraIds.clear();
                                List<? extends CameraInfo> list2 = this.activeConcurrentCameraInfosList;
                                synchronized (this.lock) {
                                    CameraRepository cameraRepository = this.cameraRepository;
                                    if (cameraRepository == null) {
                                        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                                        if (Logger.isErrorEnabled("CXCP")) {
                                            String unused = Camera2Logger.TRUNCATED_TAG;
                                        }
                                        return;
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator<T> it9 = list2.iterator();
                                    while (it9.hasNext()) {
                                        try {
                                            String strM1getCameraIdzjxgSG8 = CameraInfoAdapter.INSTANCE.m1getCameraIdzjxgSG8((CameraInfo) it9.next());
                                            Intrinsics.h(strM1getCameraIdzjxgSG8);
                                            camera = cameraRepository.getCamera(strM1getCameraIdzjxgSG8);
                                        } catch (IllegalArgumentException unused2) {
                                        }
                                        CameraInternalAdapter cameraInternalAdapter = camera instanceof CameraInternalAdapter ? (CameraInternalAdapter) camera : null;
                                        if (cameraInternalAdapter != null) {
                                            arrayList2.add(cameraInternalAdapter);
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                                    Iterator it10 = arrayList2.iterator();
                                    while (it10.hasNext()) {
                                        CameraGraph.Config deferredCameraGraphConfig$camera_camera2 = ((CameraInternalAdapter) it10.next()).getDeferredCameraGraphConfig$camera_camera2();
                                        if (deferredCameraGraphConfig$camera_camera2 == null) {
                                            throw new IllegalStateException("Every CameraInternal instance is expected to have a deferred CameraGraph config");
                                        }
                                        arrayList3.add(deferredCameraGraphConfig$camera_camera2);
                                    }
                                    CameraPipe cameraPipe = this.cameraPipe;
                                    if (cameraPipe == null) {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                    List<CameraGraph> listCreateCameraGraphs = cameraPipe.createCameraGraphs(new CameraGraph.ConcurrentConfig(arrayList3));
                                    if (listCreateCameraGraphs.size() != arrayList3.size()) {
                                        throw new IllegalStateException("Check failed.");
                                    }
                                    for (Pair pair : d0.l1(arrayList2, listCreateCameraGraphs)) {
                                        ((CameraInternalAdapter) pair.f186385a).resumeDeferredCameraGraphCreation$camera_camera2((CameraGraph) pair.f186386b);
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                        String strM1getCameraIdzjxgSG82 = CameraInfoAdapter.INSTANCE.m1getCameraIdzjxgSG8((CameraInfo) it8.next());
                        CameraId cameraIdM181boximpl = strM1getCameraIdzjxgSG82 != null ? CameraId.m181boximpl(strM1getCameraIdzjxgSG82) : null;
                        if (cameraIdM181boximpl == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        arrayList.add(cameraIdM181boximpl.getValue());
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void addPendingCameraInfo(@NotNull CameraInfo cameraInfo) {
        Intrinsics.checkNotNullParameter(cameraInfo, "cameraInfo");
        synchronized (this.lock) {
            try {
                if (this.concurrentModeOn) {
                    List<String> list = this.pendingCameraIds;
                    String strM1getCameraIdzjxgSG8 = CameraInfoAdapter.INSTANCE.m1getCameraIdzjxgSG8(cameraInfo);
                    CameraId cameraIdM181boximpl = strM1getCameraIdzjxgSG8 != null ? CameraId.m181boximpl(strM1getCameraIdzjxgSG8) : null;
                    if (cameraIdM181boximpl == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    list.add(cameraIdM181boximpl.getValue());
                    tryStartConcurrentGraph();
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public int getCameraOperatingMode() {
        int i;
        synchronized (this.lock) {
            i = this.concurrentMode;
        }
        return i;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void init(@NotNull CameraRepository repository) throws CameraUpdateException {
        List<String> arrayList;
        Intrinsics.checkNotNullParameter(repository, "repository");
        synchronized (this.lock) {
            this.cameraRepository = repository;
            Unit unit = Unit.f186387a;
        }
        List listM121awaitCameraIdsSeavPBo$default = CameraDevices.m121awaitCameraIdsSeavPBo$default(this.cameraDevices, null, 1, null);
        if (listM121awaitCameraIdsSeavPBo$default != null) {
            List list = listM121awaitCameraIdsSeavPBo$default;
            arrayList = new ArrayList<>(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(((CameraId) it8.next()).getValue());
            }
        } else {
            arrayList = f0.f322471a;
        }
        onCamerasUpdated(arrayList);
    }

    @Override // androidx.camera.core.impl.InternalCameraPresenceListener
    public void onCamerasUpdated(@NotNull List<String> cameraIds) throws CameraUpdateException {
        Intrinsics.checkNotNullParameter(cameraIds, "cameraIds");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Set<Set> setM123awaitConcurrentCameraIdsSeavPBo$default = CameraDevices.m123awaitConcurrentCameraIdsSeavPBo$default(this.cameraDevices, null, 1, null);
            if (setM123awaitConcurrentCameraIdsSeavPBo$default == null) {
                setM123awaitConcurrentCameraIdsSeavPBo$default = h0.f322473a;
            }
            for (Set set : setM123awaitConcurrentCameraIdsSeavPBo$default) {
                Set set2 = set;
                ArrayList arrayList = new ArrayList(w.t(set2, 10));
                Iterator it8 = set2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((CameraId) it8.next()).getValue());
                }
                Set setI1 = d0.i1(arrayList);
                if (cameraIds.containsAll(setI1)) {
                    List listD1 = d0.d1(set);
                    if (listD1.size() >= 2) {
                        String value = ((CameraId) listD1.get(0)).getValue();
                        String value2 = ((CameraId) listD1.get(1)).getValue();
                        try {
                            if (CameraCompatibilityFilter.isBackwardCompatible(value, this.cameraDevices) && CameraCompatibilityFilter.isBackwardCompatible(value2, this.cameraDevices)) {
                                linkedHashSet.add(set);
                                if (!linkedHashMap.containsKey(value)) {
                                    linkedHashMap.put(value, new ArrayList());
                                }
                                Object obj2 = linkedHashMap.get(value);
                                Intrinsics.h(obj2);
                                ((List) obj2).add(value2);
                                if (!linkedHashMap.containsKey(value2)) {
                                    linkedHashMap.put(value2, new ArrayList());
                                }
                                Object obj3 = linkedHashMap.get(value2);
                                Intrinsics.h(obj3);
                                ((List) obj3).add(value);
                            }
                        } catch (InitializationException e) {
                            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                            if (Logger.isWarnEnabled("CXCP")) {
                                String unused = Camera2Logger.TRUNCATED_TAG;
                                String str = "Skipping incompatible concurrent pair: " + set + " due to " + e.getMessage();
                            }
                        }
                    }
                } else {
                    Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
                    if (Logger.isWarnEnabled("CXCP")) {
                        String unused2 = Camera2Logger.TRUNCATED_TAG;
                        String str2 = "Failed to retrieve concurrent camera: " + setI1 + " from " + cameraIds;
                    }
                }
            }
            synchronized (this.lock) {
                this.concurrentCameraIdsSet = linkedHashSet;
                this.concurrentCameraIdMap = linkedHashMap;
                Unit unit = Unit.f186387a;
            }
        } catch (Exception e2) {
            throw new CameraUpdateException("Failed to retrieve concurrent camera id info for camera-pipe.", e2);
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void removePendingCameraInfo(@NotNull CameraInfo cameraInfo) {
        Intrinsics.checkNotNullParameter(cameraInfo, "cameraInfo");
        synchronized (this.lock) {
            try {
                if (this.concurrentModeOn) {
                    List<String> list = this.pendingCameraIds;
                    String strM1getCameraIdzjxgSG8 = CameraInfoAdapter.INSTANCE.m1getCameraIdzjxgSG8(cameraInfo);
                    CameraId cameraIdM181boximpl = strM1getCameraIdzjxgSG8 != null ? CameraId.m181boximpl(strM1getCameraIdzjxgSG8) : null;
                    if (cameraIdM181boximpl == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    list.remove(cameraIdM181boximpl.getValue());
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void setCameraOperatingMode(int cameraOperatingMode) {
        CameraRepository cameraRepository;
        synchronized (this.lock) {
            this.concurrentMode = cameraOperatingMode;
            cameraRepository = this.cameraRepository;
        }
        if (cameraRepository == null) {
            return;
        }
        boolean z = cameraOperatingMode == 2;
        this.concurrentModeOn = z;
        if (!z) {
            this.activeConcurrentCameraInfosList = f0.f322471a;
        }
        Iterator<CameraInternal> it8 = cameraRepository.getCameras().iterator();
        Intrinsics.checkNotNullExpressionValue(it8, "iterator(...)");
        while (it8.hasNext()) {
            CameraInternal next = it8.next();
            CameraInternalAdapter cameraInternalAdapter = next instanceof CameraInternalAdapter ? (CameraInternalAdapter) next : null;
            if (cameraInternalAdapter != null) {
                if (cameraOperatingMode == 1) {
                    cameraInternalAdapter.setCameraGraphCreationMode$camera_camera2(true);
                } else if (cameraOperatingMode == 2) {
                    cameraInternalAdapter.setCameraGraphCreationMode$camera_camera2(false);
                }
            }
        }
    }

    public void shutdown() {
        this.cameraPipe = null;
        this.concurrentModeOn = false;
        synchronized (this.lock) {
            this.cameraRepository = null;
            this.concurrentCameraIdsSet = h0.f322473a;
            this.concurrentCameraIdMap = r0.g();
            this.activeConcurrentCameraInfosList = f0.f322471a;
            this.concurrentMode = 0;
            this.pendingCameraIds.clear();
            Unit unit = Unit.f186387a;
        }
    }
}
