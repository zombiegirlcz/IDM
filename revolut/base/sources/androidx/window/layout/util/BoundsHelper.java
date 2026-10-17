package androidx.window.layout.util;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/window/layout/util/BoundsHelper;", "", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "currentWindowBounds", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "Companion", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface BoundsHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/window/layout/util/BoundsHelper$Companion;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getInstance", "Landroidx/window/layout/util/BoundsHelper;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final String TAG;

        static {
            Intrinsics.checkNotNullExpressionValue("BoundsHelper", "getSimpleName(...)");
            TAG = "BoundsHelper";
        }

        private Companion() {
        }

        @NotNull
        public final BoundsHelper getInstance() {
            int i = Build.VERSION.SDK_INT;
            return i >= 30 ? BoundsHelperApi30Impl.INSTANCE : i >= 29 ? BoundsHelperApi29Impl.INSTANCE : BoundsHelperApi28Impl.INSTANCE;
        }

        @NotNull
        public final String getTAG() {
            return TAG;
        }
    }

    @NotNull
    Rect currentWindowBounds(@NotNull Activity activity);
}
