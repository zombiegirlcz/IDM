package androidx.camera.core.impl.utils;

import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.stabilization.VideoStabilization;
import com.google.android.gms.internal.mlkit_vision_face.a;
import ewh.x;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0012\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0014\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/camera/core/impl/utils/UseCaseUtil;", "", "<init>", "()V", "", "Landroidx/camera/core/UseCase;", "", "containsVideoCapture", "(Ljava/util/Collection;)Z", "isVideoCapture", "(Landroidx/camera/core/UseCase;)Z", "Lkotlin/Function1;", "Landroidx/camera/core/impl/UseCaseConfig;", "configProvider", "Landroidx/camera/core/impl/stabilization/VideoStabilization;", "getVideoStabilization", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Landroidx/camera/core/impl/stabilization/VideoStabilization;", "", "getPreviewStabilizationMode", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)I", "getVideoStabilizationMode", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UseCaseUtil {

    @NotNull
    public static final UseCaseUtil INSTANCE = new UseCaseUtil();

    private UseCaseUtil() {
    }

    public static final boolean containsVideoCapture(@NotNull Collection<? extends UseCase> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        for (UseCase useCase : collection) {
            if (useCase != null && isVideoCapture(useCase)) {
                return true;
            }
        }
        return false;
    }

    private final int getPreviewStabilizationMode(Collection<? extends UseCase> collection, Function1<? super UseCase, ? extends UseCaseConfig<?>> function1) {
        Iterator<T> it8 = collection.iterator();
        int i = 0;
        while (it8.hasNext()) {
            int previewStabilizationMode = ((UseCaseConfig) function1.invoke((UseCase) it8.next())).getPreviewStabilizationMode();
            if (previewStabilizationMode != 0) {
                if (i != previewStabilizationMode && i != 0) {
                    Logger.w("UseCaseUtil", a.m("Unexpected configurations: Overwriting current previewStabilizationMode(", i, previewStabilizationMode, ") with useCasePreviewStabilization(", ")!"));
                }
                i = previewStabilizationMode;
            }
        }
        return i;
    }

    @NotNull
    public static final VideoStabilization getVideoStabilization(@NotNull Collection<? extends UseCase> collection, @NotNull Function1<? super UseCase, ? extends UseCaseConfig<?>> configProvider) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        VideoStabilization.Companion companion = VideoStabilization.INSTANCE;
        UseCaseUtil useCaseUtil = INSTANCE;
        return companion.from$camera_core(useCaseUtil.getPreviewStabilizationMode(collection, configProvider), useCaseUtil.getVideoStabilizationMode(collection, configProvider));
    }

    public static /* synthetic */ VideoStabilization getVideoStabilization$default(Collection collection, Function1 function1, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = new x(26);
        }
        return getVideoStabilization(collection, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UseCaseConfig getVideoStabilization$lambda$0(UseCase it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.getCurrentConfig();
    }

    private final int getVideoStabilizationMode(Collection<? extends UseCase> collection, Function1<? super UseCase, ? extends UseCaseConfig<?>> function1) {
        Iterator<T> it8 = collection.iterator();
        int i = 0;
        while (it8.hasNext()) {
            int videoStabilizationMode = ((UseCaseConfig) function1.invoke((UseCase) it8.next())).getVideoStabilizationMode();
            if (videoStabilizationMode != 0) {
                if (i != videoStabilizationMode && i != 0) {
                    Logger.w("UseCaseUtil", a.m("Unexpected configurations: Overwriting current videoStabilizationMode(", i, videoStabilizationMode, ") with useCaseVideoStabilization(", ")!"));
                }
                i = videoStabilizationMode;
            }
        }
        return i;
    }

    public static final boolean isVideoCapture(@NotNull UseCase useCase) {
        Intrinsics.checkNotNullParameter(useCase, "<this>");
        if (useCase.getCurrentConfig().containsOption(UseCaseConfig.OPTION_CAPTURE_TYPE)) {
            return useCase.getCurrentConfig().getCaptureType() == UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
        }
        Logger.e("UseCaseUtil", useCase + " UseCase does not have capture type.");
        return false;
    }
}
