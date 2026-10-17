package androidx.compose.material;

import androidx.compose.ui.text.PlatformTextStyle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u001a\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/PlatformTextStyle;", "defaultPlatformTextStyle", "()Landroidx/compose/ui/text/PlatformTextStyle;", "DefaultPlatformTextStyle", "Landroidx/compose/ui/text/PlatformTextStyle;", "getDefaultPlatformTextStyle$annotations", "()V", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class DefaultPlatformTextStyle_androidKt {

    @NotNull
    private static final PlatformTextStyle DefaultPlatformTextStyle = new PlatformTextStyle(false);

    public static final PlatformTextStyle defaultPlatformTextStyle() {
        return DefaultPlatformTextStyle;
    }
}
