package androidx.glance;

import android.content.Context;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.unit.DpSize;
import androidx.glance.color.ColorProviders;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\" \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005\"\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\u0005\"\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\u0005\" \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/unit/DpSize;", "LocalSize", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalSize", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroid/content/Context;", "LocalContext", "getLocalContext", "", "LocalState", "getLocalState", "Landroidx/glance/GlanceId;", "LocalGlanceId", "getLocalGlanceId", "Landroidx/glance/color/ColorProviders;", "LocalColors", "getLocalColors", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class CompositionLocalsKt {

    @NotNull
    private static final ProvidableCompositionLocal<DpSize> LocalSize = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalSize$1.INSTANCE);

    @NotNull
    private static final ProvidableCompositionLocal<Context> LocalContext = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalContext$1.INSTANCE);

    @NotNull
    private static final ProvidableCompositionLocal<Object> LocalState = CompositionLocalKt.compositionLocalOf$default(null, CompositionLocalsKt$LocalState$1.INSTANCE, 1, null);

    @NotNull
    private static final ProvidableCompositionLocal<GlanceId> LocalGlanceId = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalGlanceId$1.INSTANCE);

    @NotNull
    private static final ProvidableCompositionLocal<ColorProviders> LocalColors = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalColors$1.INSTANCE);

    @NotNull
    public static final ProvidableCompositionLocal<Context> getLocalContext() {
        return LocalContext;
    }

    @NotNull
    public static final ProvidableCompositionLocal<GlanceId> getLocalGlanceId() {
        return LocalGlanceId;
    }

    @NotNull
    public static final ProvidableCompositionLocal<DpSize> getLocalSize() {
        return LocalSize;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Object> getLocalState() {
        return LocalState;
    }
}
