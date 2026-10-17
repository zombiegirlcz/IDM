package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.Quirk;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTimeConstants;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/camera/camera2/compat/quirk/SmallDisplaySizeQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "displaySize", "Landroid/util/Size;", "getDisplaySize", "()Landroid/util/Size;", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SmallDisplaySizeQuirk implements Quirk {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<String, Size> MODEL_TO_DISPLAY_SIZE_MAP = r0.k(new Pair("REDMI NOTE 8", new Size(1080, 2340)), new Pair("REDMI NOTE 7", new Size(1080, 2340)), new Pair("SM-A207M", new Size(720, 1560)), new Pair("REDMI NOTE 7S", new Size(1080, 2340)), new Pair("SM-A127F", new Size(720, 1600)), new Pair("SM-A536E", new Size(1080, 2400)), new Pair("220233L2I", new Size(720, 1600)), new Pair("V2149", new Size(720, 1600)), new Pair("VIVO 1920", new Size(1080, 2340)), new Pair("CPH2223", new Size(1080, 2400)), new Pair("V2029", new Size(720, 1600)), new Pair("CPH1901", new Size(720, 1520)), new Pair("REDMI Y3", new Size(720, 1520)), new Pair("SM-A045M", new Size(720, 1600)), new Pair("SM-A146U", new Size(1080, 2408)), new Pair("CPH1909", new Size(720, 1520)), new Pair("NOKIA 4.2", new Size(720, 1520)), new Pair("SM-G960U1", new Size(DateTimeConstants.MINUTES_PER_DAY, 2960)), new Pair("SM-A137F", new Size(1080, 2408)), new Pair("VIVO 1816", new Size(720, 1520)), new Pair("INFINIX X6817", new Size(720, 1612)), new Pair("SM-A037F", new Size(720, 1600)), new Pair("NOKIA 2.4", new Size(720, 1600)), new Pair("SM-A125M", new Size(720, 1600)), new Pair("INFINIX X670", new Size(1080, 2400)));

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/camera/camera2/compat/quirk/SmallDisplaySizeQuirk$Companion;", "", "<init>", "()V", "MODEL_TO_DISPLAY_SIZE_MAP", "", "", "Landroid/util/Size;", "load", "", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean load() {
            Map map = SmallDisplaySizeQuirk.MODEL_TO_DISPLAY_SIZE_MAP;
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            String upperCase = MODEL.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return map.containsKey(upperCase);
        }

        private Companion() {
        }
    }

    @NotNull
    public final Size getDisplaySize() {
        Map<String, Size> map = MODEL_TO_DISPLAY_SIZE_MAP;
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String upperCase = MODEL.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        Size size = map.get(upperCase);
        Intrinsics.h(size);
        return size;
    }
}
