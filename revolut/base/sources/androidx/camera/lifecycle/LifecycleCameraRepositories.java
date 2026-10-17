package androidx.camera.lifecycle;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/camera/lifecycle/LifecycleCameraRepositories;", "", "<init>", "()V", "", "deviceId", "Landroidx/camera/lifecycle/LifecycleCameraRepository;", "getInstance$camera_lifecycle", "(I)Landroidx/camera/lifecycle/LifecycleCameraRepository;", "getInstance", "", "repositoryMap", "Ljava/util/Map;", "camera-lifecycle"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LifecycleCameraRepositories {

    @NotNull
    public static final LifecycleCameraRepositories INSTANCE = new LifecycleCameraRepositories();

    @NotNull
    private static final Map<Integer, LifecycleCameraRepository> repositoryMap = new LinkedHashMap();

    private LifecycleCameraRepositories() {
    }

    @NotNull
    public static final LifecycleCameraRepository getInstance$camera_lifecycle(int deviceId) {
        LifecycleCameraRepository lifecycleCameraRepository;
        Map<Integer, LifecycleCameraRepository> map = repositoryMap;
        synchronized (map) {
            try {
                Integer numValueOf = Integer.valueOf(deviceId);
                LifecycleCameraRepository lifecycleCameraRepository2 = map.get(numValueOf);
                if (lifecycleCameraRepository2 == null) {
                    lifecycleCameraRepository2 = new LifecycleCameraRepository(deviceId);
                    map.put(numValueOf, lifecycleCameraRepository2);
                }
                lifecycleCameraRepository = lifecycleCameraRepository2;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return lifecycleCameraRepository;
    }
}
