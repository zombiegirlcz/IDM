package androidx.glance.unit;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001a\u001b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, d2 = {"ColorProvider", "Landroidx/glance/unit/ColorProvider;", "color", "Landroidx/compose/ui/graphics/Color;", "ColorProvider-8_81llA", "(J)Landroidx/glance/unit/ColorProvider;", "resId", "", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ColorProviderKt {
    @NotNull
    public static final ColorProvider ColorProvider(int i) {
        return new ResourceColorProvider(i);
    }

    @NotNull
    /* JADX INFO: renamed from: ColorProvider-8_81llA, reason: not valid java name */
    public static final ColorProvider m3584ColorProvider8_81llA(long j2) {
        return new FixedColorProvider(j2, null);
    }
}
