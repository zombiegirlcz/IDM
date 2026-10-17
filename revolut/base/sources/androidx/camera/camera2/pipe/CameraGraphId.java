package androidx.camera.camera2.pipe;

import hx7.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import rkm.d;

/* JADX INFO: loaded from: classes15.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraphId;", "", "name", "", "<init>", "(Ljava/lang/String;)V", "toString", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraGraphId {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final d cameraGraphIds = b.h(0);

    @NotNull
    private final String name;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraphId$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraGraphId;", "nextId", "()Landroidx/camera/camera2/pipe/CameraGraphId;", "Lrkm/d;", "cameraGraphIds", "Lrkm/d;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CameraGraphId nextId() {
            StringBuilder sb6 = new StringBuilder("CameraGraph-");
            d dVar = CameraGraphId.cameraGraphIds;
            dVar.getClass();
            sb6.append(d.f254895b.incrementAndGet(dVar));
            return new CameraGraphId(sb6.toString(), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ CameraGraphId(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getName() {
        return this.name;
    }

    private CameraGraphId(String str) {
        this.name = str;
    }
}
