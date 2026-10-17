package androidx.camera.camera2.compat.quirk;

import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.Quirks;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CaptureIntentPreviewQuirk;", "Landroidx/camera/core/impl/Quirk;", "workaroundByCaptureIntentPreview", "", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CaptureIntentPreviewQuirk extends Quirk {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CaptureIntentPreviewQuirk$Companion;", "", "<init>", "()V", "workaroundByCaptureIntentPreview", "", "quirks", "Landroidx/camera/core/impl/Quirks;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final boolean workaroundByCaptureIntentPreview(@NotNull Quirks quirks) {
            Intrinsics.checkNotNullParameter(quirks, "quirks");
            Iterator it8 = quirks.getAll(CaptureIntentPreviewQuirk.class).iterator();
            while (it8.hasNext()) {
                if (((CaptureIntentPreviewQuirk) it8.next()).workaroundByCaptureIntentPreview()) {
                    return true;
                }
            }
            return false;
        }
    }

    default boolean workaroundByCaptureIntentPreview() {
        return true;
    }
}
