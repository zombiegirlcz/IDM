package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import uz8.s;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0085\u0001\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0014\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\" \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "primary", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "Landroidx/compose/material/Colors;", "lightColors-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material/Colors;", "lightColors", "backgroundColor", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material/Colors;J)J", "contentColorFor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class ColorsKt {

    @NotNull
    private static final ProvidableCompositionLocal<Colors> LocalColors = CompositionLocalKt.staticCompositionLocalOf(new s(7));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Colors LocalColors$lambda$0() {
        return m1199lightColors2qZNXz8$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
    }

    /* JADX INFO: renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m1196contentColorFor4WTKRHQ(@NotNull Colors colors, long j2) {
        if (!Color.m1978equalsimpl0(j2, colors.m1191getPrimary0d7_KjU()) && !Color.m1978equalsimpl0(j2, colors.m1192getPrimaryVariant0d7_KjU())) {
            if (!Color.m1978equalsimpl0(j2, colors.m1193getSecondary0d7_KjU()) && !Color.m1978equalsimpl0(j2, colors.m1194getSecondaryVariant0d7_KjU())) {
                return Color.m1978equalsimpl0(j2, colors.m1184getBackground0d7_KjU()) ? colors.m1186getOnBackground0d7_KjU() : Color.m1978equalsimpl0(j2, colors.m1195getSurface0d7_KjU()) ? colors.m1190getOnSurface0d7_KjU() : Color.m1978equalsimpl0(j2, colors.m1185getError0d7_KjU()) ? colors.m1187getOnError0d7_KjU() : Color.INSTANCE.m1994getUnspecified0d7_KjU();
            }
            return colors.m1189getOnSecondary0d7_KjU();
        }
        return colors.m1188getOnPrimary0d7_KjU();
    }

    /* JADX INFO: renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m1197contentColorForek8zF_U(long j2, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441849991, i, -1, "androidx.compose.material.contentColorFor (Colors.kt:310)");
        }
        composer.startReplaceGroup(-583917585);
        long jM1196contentColorFor4WTKRHQ = m1196contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColors(composer, 6), j2);
        if (jM1196contentColorFor4WTKRHQ == 16) {
            jM1196contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).getValue();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM1196contentColorFor4WTKRHQ;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Colors> getLocalColors() {
        return LocalColors;
    }

    @NotNull
    /* JADX INFO: renamed from: lightColors-2qZNXz8, reason: not valid java name */
    public static final Colors m1198lightColors2qZNXz8(long j2, long j3, long j5, long j16, long j22, long j42, long j46, long j47, long j57, long j58, long j65, long j69) {
        return new Colors(j2, j3, j5, j16, j22, j42, j46, j47, j57, j58, j65, j69, true, null);
    }

    /* JADX INFO: renamed from: lightColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ Colors m1199lightColors2qZNXz8$default(long j2, long j3, long j5, long j16, long j22, long j42, long j46, long j47, long j57, long j58, long j65, long j69, int i, Object obj2) {
        long jColor = (i & 1) != 0 ? ColorKt.Color(4284612846L) : j2;
        long jColor2 = (i & 2) != 0 ? ColorKt.Color(4281794739L) : j3;
        long jColor3 = (i & 4) != 0 ? ColorKt.Color(4278442694L) : j5;
        long jColor4 = (i & 8) != 0 ? ColorKt.Color(4278290310L) : j16;
        long jM1995getWhite0d7_KjU = (i & 16) != 0 ? Color.INSTANCE.m1995getWhite0d7_KjU() : j22;
        long jM1995getWhite0d7_KjU2 = (i & 32) != 0 ? Color.INSTANCE.m1995getWhite0d7_KjU() : j42;
        long jColor5 = (i & 64) != 0 ? ColorKt.Color(4289724448L) : j46;
        long jM1995getWhite0d7_KjU3 = (i & 128) != 0 ? Color.INSTANCE.m1995getWhite0d7_KjU() : j47;
        long j76 = jColor;
        long jM1987getBlack0d7_KjU = (i & 256) != 0 ? Color.INSTANCE.m1987getBlack0d7_KjU() : j57;
        long jM1987getBlack0d7_KjU2 = (i & 512) != 0 ? Color.INSTANCE.m1987getBlack0d7_KjU() : j58;
        long jM1987getBlack0d7_KjU3 = (i & 1024) != 0 ? Color.INSTANCE.m1987getBlack0d7_KjU() : j65;
        if ((i & 2048) != 0) {
            j69 = Color.INSTANCE.m1995getWhite0d7_KjU();
        }
        return m1198lightColors2qZNXz8(j76, jColor2, jColor3, jColor4, jM1995getWhite0d7_KjU, jM1995getWhite0d7_KjU2, jColor5, jM1995getWhite0d7_KjU3, jM1987getBlack0d7_KjU, jM1987getBlack0d7_KjU2, jM1987getBlack0d7_KjU3, j69);
    }
}
