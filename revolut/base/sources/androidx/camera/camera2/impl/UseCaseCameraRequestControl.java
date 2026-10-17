package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import skm.g0;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\u0001EJA\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\fJA\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\fJ1\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H'¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u0002H'¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\tH'¢\u0006\u0004\b \u0010!J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\t2\u0006\u0010#\u001a\u00020\"H'¢\u0006\u0004\b$\u0010%J\u0085\u0001\u00104\u001a\b\u0012\u0004\u0012\u00020\u001f0\t2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000e2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000e2\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000e2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\"2\b\b\u0002\u00101\u001a\u000200H'¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\b\u0012\u0004\u0012\u00020\u001f0\tH'¢\u0006\u0004\b5\u0010!JC\u0010=\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010<0\t0\u000e2\f\u00107\u001a\b\u0012\u0004\u0012\u0002060\u000e2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u0002082\u0006\u0010;\u001a\u000208H'¢\u0006\u0004\b=\u0010>JK\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001f0\t2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000e2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000e2\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000eH'¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0012H¦@¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\nH&¢\u0006\u0004\bC\u0010Dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006FÀ\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "values", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl$Type;", "type", "Landroidx/camera/core/impl/Config$OptionPriority;", "optionPriority", "Lskm/g0;", "", "setParametersAsync", "(Ljava/util/Map;Landroidx/camera/camera2/impl/UseCaseCameraRequestControl$Type;Landroidx/camera/core/impl/Config$OptionPriority;)Lskm/g0;", "submitParameters", "", "keys", "removeParametersAsync", "(Ljava/util/List;Landroidx/camera/camera2/impl/UseCaseCameraRequestControl$Type;)Lskm/g0;", "", "isPrimary", "", "Landroidx/camera/core/UseCase;", "runningUseCases", "updateRepeatingRequestAsync", "(ZLjava/util/Collection;)Lskm/g0;", "Landroidx/camera/core/impl/Config;", "config", "", "tags", "updateCamera2ConfigAsync", "(Landroidx/camera/core/impl/Config;Ljava/util/Map;)Lskm/g0;", "Landroidx/camera/camera2/pipe/Result3A;", "setTorchOnAsync", "()Lskm/g0;", "Landroidx/camera/camera2/pipe/AeMode;", "aeMode", "setTorchOffAsync-MtizInI", "(I)Lskm/g0;", "setTorchOffAsync", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "Landroidx/camera/camera2/pipe/Lock3ABehavior;", "aeLockBehavior", "afLockBehavior", "awbLockBehavior", "afTriggerStartAeMode", "", "timeLimitNs", "startFocusAndMeteringAsync-NxRnBj4", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/AeMode;J)Lskm/g0;", "startFocusAndMeteringAsync", "cancelFocusAndMeteringAsync", "Landroidx/camera/core/impl/CaptureConfig;", "captureSequence", "", "captureMode", "flashType", "flashMode", "Ljava/lang/Void;", "issueSingleCaptureAsync", "(Ljava/util/List;III)Ljava/util/List;", "update3aRegions", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lskm/g0;", "awaitSurfaceSetup", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", "Type", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface UseCaseCameraRequestControl {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseCameraRequestControl$Type;", "", "<init>", "(Ljava/lang/String;I)V", "SESSION_CONFIG", "DEFAULT", "CAMERA2_CAMERA_CONTROL", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type SESSION_CONFIG = new Type("SESSION_CONFIG", 0);
        public static final Type DEFAULT = new Type("DEFAULT", 1);
        public static final Type CAMERA2_CAMERA_CONTROL = new Type("CAMERA2_CAMERA_CONTROL", 2);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{SESSION_CONFIG, DEFAULT, CAMERA2_CAMERA_CONTROL};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = s.n(typeArr$values);
        }

        private Type(String str, int i) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    static /* synthetic */ g0 removeParametersAsync$default(UseCaseCameraRequestControl useCaseCameraRequestControl, List list, Type type, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeParametersAsync");
        }
        if ((i & 2) != 0) {
            type = Type.DEFAULT;
        }
        return useCaseCameraRequestControl.removeParametersAsync(list, type);
    }

    static /* synthetic */ g0 setParametersAsync$default(UseCaseCameraRequestControl useCaseCameraRequestControl, Map map, Type type, Config.OptionPriority optionPriority, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setParametersAsync");
        }
        if ((i & 2) != 0) {
            type = Type.DEFAULT;
        }
        if ((i & 4) != 0) {
            optionPriority = UseCaseCameraKt.getDefaultOptionPriority();
        }
        return useCaseCameraRequestControl.setParametersAsync(map, type, optionPriority);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: startFocusAndMeteringAsync-NxRnBj4$default, reason: not valid java name */
    static /* synthetic */ g0 m56startFocusAndMeteringAsyncNxRnBj4$default(UseCaseCameraRequestControl useCaseCameraRequestControl, List list, List list2, List list3, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode, long j2, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startFocusAndMeteringAsync-NxRnBj4");
        }
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            list2 = null;
        }
        if ((i & 4) != 0) {
            list3 = null;
        }
        if ((i & 8) != 0) {
            lock3ABehavior = null;
        }
        if ((i & 16) != 0) {
            lock3ABehavior2 = null;
        }
        if ((i & 32) != 0) {
            lock3ABehavior3 = null;
        }
        if ((i & 64) != 0) {
            aeMode = null;
        }
        if ((i & 128) != 0) {
            j2 = 3000000000L;
        }
        return useCaseCameraRequestControl.mo35startFocusAndMeteringAsyncNxRnBj4(list, list2, list3, lock3ABehavior, lock3ABehavior2, lock3ABehavior3, aeMode, j2);
    }

    static /* synthetic */ g0 submitParameters$default(UseCaseCameraRequestControl useCaseCameraRequestControl, Map map, Type type, Config.OptionPriority optionPriority, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitParameters");
        }
        if ((i & 2) != 0) {
            type = Type.DEFAULT;
        }
        if ((i & 4) != 0) {
            optionPriority = UseCaseCameraKt.getDefaultOptionPriority();
        }
        return useCaseCameraRequestControl.submitParameters(map, type, optionPriority);
    }

    Object awaitSurfaceSetup(@NotNull Continuation<? super Boolean> continuation);

    @NotNull
    g0 cancelFocusAndMeteringAsync();

    void close();

    @NotNull
    List<g0> issueSingleCaptureAsync(@NotNull List<CaptureConfig> captureSequence, int captureMode, int flashType, int flashMode);

    @NotNull
    g0 removeParametersAsync(@NotNull List<? extends CaptureRequest.Key<?>> keys, @NotNull Type type);

    @NotNull
    g0 setParametersAsync(@NotNull Map<CaptureRequest.Key<?>, ? extends Object> values, @NotNull Type type, @NotNull Config.OptionPriority optionPriority);

    @NotNull
    /* JADX INFO: renamed from: setTorchOffAsync-MtizInI */
    g0 mo34setTorchOffAsyncMtizInI(int aeMode);

    @NotNull
    g0 setTorchOnAsync();

    @NotNull
    /* JADX INFO: renamed from: startFocusAndMeteringAsync-NxRnBj4 */
    g0 mo35startFocusAndMeteringAsyncNxRnBj4(List<MeteringRectangle> aeRegions, List<MeteringRectangle> afRegions, List<MeteringRectangle> awbRegions, Lock3ABehavior aeLockBehavior, Lock3ABehavior afLockBehavior, Lock3ABehavior awbLockBehavior, AeMode afTriggerStartAeMode, long timeLimitNs);

    @NotNull
    g0 submitParameters(@NotNull Map<CaptureRequest.Key<?>, ? extends Object> values, @NotNull Type type, @NotNull Config.OptionPriority optionPriority);

    @NotNull
    g0 update3aRegions(List<MeteringRectangle> aeRegions, List<MeteringRectangle> afRegions, List<MeteringRectangle> awbRegions);

    @NotNull
    g0 updateCamera2ConfigAsync(@NotNull Config config, @NotNull Map<String, ? extends Object> tags);

    @NotNull
    g0 updateRepeatingRequestAsync(boolean isPrimary, @NotNull Collection<? extends UseCase> runningUseCases);
}
