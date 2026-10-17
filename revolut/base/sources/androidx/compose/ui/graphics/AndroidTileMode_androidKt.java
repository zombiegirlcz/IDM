package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.TileMode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/TileMode;", "Landroid/graphics/Shader$TileMode;", "toAndroidTileMode-0vamqd0", "(I)Landroid/graphics/Shader$TileMode;", "toAndroidTileMode", "ui-graphics"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class AndroidTileMode_androidKt {
    @NotNull
    /* JADX INFO: renamed from: toAndroidTileMode-0vamqd0, reason: not valid java name */
    public static final Shader.TileMode m1918toAndroidTileMode0vamqd0(int i) {
        TileMode.Companion companion = TileMode.INSTANCE;
        if (TileMode.m2125equalsimpl0(i, companion.m2128getClamp3opZhB0())) {
            return Shader.TileMode.CLAMP;
        }
        if (TileMode.m2125equalsimpl0(i, companion.m2131getRepeated3opZhB0())) {
            return Shader.TileMode.REPEAT;
        }
        if (TileMode.m2125equalsimpl0(i, companion.m2130getMirror3opZhB0())) {
            return Shader.TileMode.MIRROR;
        }
        if (TileMode.m2125equalsimpl0(i, companion.m2129getDecal3opZhB0()) && Build.VERSION.SDK_INT >= 31) {
            return TileModeVerificationHelper.INSTANCE.getFrameworkTileModeDecal();
        }
        return Shader.TileMode.CLAMP;
    }
}
