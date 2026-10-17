package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import wyc.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aí\u0003\u00104\u001a\u0002012\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020\u00002\b\b\u0002\u0010&\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\u00002\b\b\u0002\u0010)\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020\u00002\b\b\u0002\u0010+\u001a\u00020\u00002\b\b\u0002\u0010,\u001a\u00020\u00002\b\b\u0002\u0010-\u001a\u00020\u00002\b\b\u0002\u0010.\u001a\u00020\u00002\b\b\u0002\u0010/\u001a\u00020\u00002\b\b\u0002\u00100\u001a\u00020\u0000¢\u0006\u0004\b2\u00103\u001a\u001b\u00108\u001a\u00020\u0000*\u0002012\u0006\u00105\u001a\u00020\u0000H\u0007¢\u0006\u0004\b6\u00107\u001a\u0017\u00108\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0000H\u0007¢\u0006\u0004\b9\u0010:\u001a\u001b\u0010?\u001a\u00020\u0000*\u0002012\u0006\u0010<\u001a\u00020;H\u0007¢\u0006\u0004\b=\u0010>\u001a÷\u0002\u00104\u001a\u0002012\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u0000H\u0007¢\u0006\u0004\b@\u0010A\u001a\u001b\u0010D\u001a\u00020\u0000*\u0002012\u0006\u0010C\u001a\u00020BH\u0001¢\u0006\u0004\bD\u0010E\u001a#\u0010H\u001a\u00020\u0000*\u0002012\u0006\u00105\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;H\u0001¢\u0006\u0004\bF\u0010G\" \u0010J\u001a\b\u0012\u0004\u0012\u0002010I8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020N0I8\u0006¢\u0006\f\n\u0004\bO\u0010K\u001a\u0004\bP\u0010M\"\u0018\u0010C\u001a\u00020\u0000*\u00020B8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006S"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "surfaceDim", "primaryFixed", "primaryFixedDim", "onPrimaryFixed", "onPrimaryFixedVariant", "secondaryFixed", "secondaryFixedDim", "onSecondaryFixed", "onSecondaryFixedVariant", "tertiaryFixed", "tertiaryFixedDim", "onTertiaryFixed", "onTertiaryFixedVariant", "Landroidx/compose/material3/ColorScheme;", "lightColorScheme-_VG5OTI", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "lightColorScheme", "backgroundColor", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material3/ColorScheme;J)J", "contentColorFor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "Landroidx/compose/ui/unit/Dp;", "elevation", "surfaceColorAtElevation-3ABfNKs", "(Landroidx/compose/material3/ColorScheme;F)J", "surfaceColorAtElevation", "lightColorScheme-C-Xl9yA", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "value", "fromToken", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J", "applyTonalElevation-RFCenO8", "(Landroidx/compose/material3/ColorScheme;JFLandroidx/compose/runtime/Composer;I)J", "applyTonalElevation", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalColorScheme", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalColorScheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "LocalTonalElevationEnabled", "getLocalTonalElevationEnabled", "getValue", "(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class ColorSchemeKt {

    @NotNull
    private static final ProvidableCompositionLocal<ColorScheme> LocalColorScheme = CompositionLocalKt.staticCompositionLocalOf(new u(17));

    @NotNull
    private static final ProvidableCompositionLocal<Boolean> LocalTonalElevationEnabled = CompositionLocalKt.staticCompositionLocalOf(new u(18));

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            try {
                iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryFixed.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryFixedDim.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryFixed.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryFixedVariant.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryFixed.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryFixedDim.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryFixed.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryFixedVariant.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryFixed.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryFixedDim.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryFixed.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryFixedVariant.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ColorScheme LocalColorScheme$lambda$1() {
        return m1360lightColorScheme_VG5OTI$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LocalTonalElevationEnabled$lambda$2() {
        return true;
    }

    /* JADX INFO: renamed from: applyTonalElevation-RFCenO8, reason: not valid java name */
    public static final long m1354applyTonalElevationRFCenO8(@NotNull ColorScheme colorScheme, long j2, float f, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1610977682, i, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:1539)");
        }
        boolean zBooleanValue = ((Boolean) composer.consume(LocalTonalElevationEnabled)).booleanValue();
        if (Color.m1978equalsimpl0(j2, colorScheme.getSurface()) && zBooleanValue) {
            j2 = m1361surfaceColorAtElevation3ABfNKs(colorScheme, f);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j2;
    }

    /* JADX INFO: renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m1355contentColorFor4WTKRHQ(@NotNull ColorScheme colorScheme, long j2) {
        if (Color.m1978equalsimpl0(j2, colorScheme.getPrimary())) {
            return colorScheme.getOnPrimary();
        }
        if (Color.m1978equalsimpl0(j2, colorScheme.getSecondary())) {
            return colorScheme.getOnSecondary();
        }
        if (Color.m1978equalsimpl0(j2, colorScheme.getTertiary())) {
            return colorScheme.getOnTertiary();
        }
        if (Color.m1978equalsimpl0(j2, colorScheme.getBackground())) {
            return colorScheme.getOnBackground();
        }
        if (Color.m1978equalsimpl0(j2, colorScheme.getError())) {
            return colorScheme.getOnError();
        }
        if (Color.m1978equalsimpl0(j2, colorScheme.getPrimaryContainer())) {
            return colorScheme.getOnPrimaryContainer();
        }
        if (Color.m1978equalsimpl0(j2, colorScheme.getSecondaryContainer())) {
            return colorScheme.getOnSecondaryContainer();
        }
        if (Color.m1978equalsimpl0(j2, colorScheme.getTertiaryContainer())) {
            return colorScheme.getOnTertiaryContainer();
        }
        if (Color.m1978equalsimpl0(j2, colorScheme.getErrorContainer())) {
            return colorScheme.getOnErrorContainer();
        }
        if (Color.m1978equalsimpl0(j2, colorScheme.getInverseSurface())) {
            return colorScheme.getInverseOnSurface();
        }
        if (Color.m1978equalsimpl0(j2, colorScheme.getSurface())) {
            return colorScheme.getOnSurface();
        }
        if (Color.m1978equalsimpl0(j2, colorScheme.getSurfaceVariant())) {
            return colorScheme.getOnSurfaceVariant();
        }
        if (!Color.m1978equalsimpl0(j2, colorScheme.getSurfaceBright()) && !Color.m1978equalsimpl0(j2, colorScheme.getSurfaceContainer()) && !Color.m1978equalsimpl0(j2, colorScheme.getSurfaceContainerHigh()) && !Color.m1978equalsimpl0(j2, colorScheme.getSurfaceContainerHighest()) && !Color.m1978equalsimpl0(j2, colorScheme.getSurfaceContainerLow()) && !Color.m1978equalsimpl0(j2, colorScheme.getSurfaceContainerLowest()) && !Color.m1978equalsimpl0(j2, colorScheme.getSurfaceDim())) {
            if (!Color.m1978equalsimpl0(j2, colorScheme.getPrimaryFixed()) && !Color.m1978equalsimpl0(j2, colorScheme.getPrimaryFixedDim())) {
                if (!Color.m1978equalsimpl0(j2, colorScheme.getSecondaryFixed()) && !Color.m1978equalsimpl0(j2, colorScheme.getSecondaryFixedDim())) {
                    if (!Color.m1978equalsimpl0(j2, colorScheme.getTertiaryFixed()) && !Color.m1978equalsimpl0(j2, colorScheme.getTertiaryFixedDim())) {
                        return Color.INSTANCE.m1994getUnspecified0d7_KjU();
                    }
                    return colorScheme.getOnTertiaryFixed();
                }
                return colorScheme.getOnSecondaryFixed();
            }
            return colorScheme.getOnPrimaryFixed();
        }
        return colorScheme.getOnSurface();
    }

    /* JADX INFO: renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m1356contentColorForek8zF_U(long j2, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:1112)");
        }
        composer.startReplaceGroup(89374938);
        long jM1355contentColorFor4WTKRHQ = m1355contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j2);
        if (jM1355contentColorFor4WTKRHQ == 16) {
            jM1355contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).getValue();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM1355contentColorFor4WTKRHQ;
    }

    public static final long fromToken(@NotNull ColorScheme colorScheme, @NotNull ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (WhenMappings.$EnumSwitchMapping$0[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return colorScheme.getBackground();
            case 2:
                return colorScheme.getError();
            case 3:
                return colorScheme.getErrorContainer();
            case 4:
                return colorScheme.getInverseOnSurface();
            case 5:
                return colorScheme.getInversePrimary();
            case 6:
                return colorScheme.getInverseSurface();
            case 7:
                return colorScheme.getOnBackground();
            case 8:
                return colorScheme.getOnError();
            case 9:
                return colorScheme.getOnErrorContainer();
            case 10:
                return colorScheme.getOnPrimary();
            case 11:
                return colorScheme.getOnPrimaryContainer();
            case 12:
                return colorScheme.getOnSecondary();
            case 13:
                return colorScheme.getOnSecondaryContainer();
            case 14:
                return colorScheme.getOnSurface();
            case 15:
                return colorScheme.getOnSurfaceVariant();
            case 16:
                return colorScheme.getSurfaceTint();
            case 17:
                return colorScheme.getOnTertiary();
            case 18:
                return colorScheme.getOnTertiaryContainer();
            case 19:
                return colorScheme.getOutline();
            case 20:
                return colorScheme.getOutlineVariant();
            case 21:
                return colorScheme.getPrimary();
            case 22:
                return colorScheme.getPrimaryContainer();
            case 23:
                return colorScheme.getScrim();
            case 24:
                return colorScheme.getSecondary();
            case 25:
                return colorScheme.getSecondaryContainer();
            case 26:
                return colorScheme.getSurface();
            case 27:
                return colorScheme.getSurfaceVariant();
            case 28:
                return colorScheme.getSurfaceBright();
            case 29:
                return colorScheme.getSurfaceContainer();
            case 30:
                return colorScheme.getSurfaceContainerHigh();
            case 31:
                return colorScheme.getSurfaceContainerHighest();
            case 32:
                return colorScheme.getSurfaceContainerLow();
            case 33:
                return colorScheme.getSurfaceContainerLowest();
            case 34:
                return colorScheme.getSurfaceDim();
            case 35:
                return colorScheme.getTertiary();
            case 36:
                return colorScheme.getTertiaryContainer();
            case 37:
                return colorScheme.getPrimaryFixed();
            case 38:
                return colorScheme.getPrimaryFixedDim();
            case 39:
                return colorScheme.getOnPrimaryFixed();
            case 40:
                return colorScheme.getOnPrimaryFixedVariant();
            case 41:
                return colorScheme.getSecondaryFixed();
            case 42:
                return colorScheme.getSecondaryFixedDim();
            case 43:
                return colorScheme.getOnSecondaryFixed();
            case 44:
                return colorScheme.getOnSecondaryFixedVariant();
            case 45:
                return colorScheme.getTertiaryFixed();
            case 46:
                return colorScheme.getTertiaryFixedDim();
            case 47:
                return colorScheme.getOnTertiaryFixed();
            case 48:
                return colorScheme.getOnTertiaryFixedVariant();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal<ColorScheme> getLocalColorScheme() {
        return LocalColorScheme;
    }

    public static final long getValue(@NotNull ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-810780884, i, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1524)");
        }
        long jFromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jFromToken;
    }

    @yhm.d
    /* JADX INFO: renamed from: lightColorScheme-C-Xl9yA, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m1357lightColorSchemeCXl9yA(long j2, long j3, long j5, long j16, long j22, long j42, long j46, long j47, long j57, long j58, long j65, long j69, long j76, long j85, long j100, long j101, long j102, long j103, long j104, long j105, long j106, long j107, long j108, long j109, long j110, long j111, long j112, long j113, long j114, long j115, long j116, long j117, long j118, long j119, long j120, long j121) {
        return m1360lightColorScheme_VG5OTI$default(j2, j3, j5, j16, j22, j42, j46, j47, j57, j58, j65, j69, j76, j85, j100, j101, j102, j103, j104, j105, j106, j107, j108, j109, j110, j111, j112, j113, j114, j115, j116, j117, j118, j119, j120, j121, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, 65520, null);
    }

    /* JADX INFO: renamed from: lightColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1358lightColorSchemeCXl9yA$default(long j2, long j3, long j5, long j16, long j22, long j42, long j46, long j47, long j57, long j58, long j65, long j69, long j76, long j85, long j100, long j101, long j102, long j103, long j104, long j105, long j106, long j107, long j108, long j109, long j110, long j111, long j112, long j113, long j114, long j115, long j116, long j117, long j118, long j119, long j120, long j121, int i, int i2, Object obj2) {
        long jM1465getPrimary0d7_KjU = (i & 1) != 0 ? ColorLightTokens.INSTANCE.m1465getPrimary0d7_KjU() : j2;
        long jM1449getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorLightTokens.INSTANCE.m1449getOnPrimary0d7_KjU() : j3;
        long jM1466getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorLightTokens.INSTANCE.m1466getPrimaryContainer0d7_KjU() : j5;
        long jM1450getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorLightTokens.INSTANCE.m1450getOnPrimaryContainer0d7_KjU() : j16;
        long jM1444getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorLightTokens.INSTANCE.m1444getInversePrimary0d7_KjU() : j22;
        long jM1470getSecondary0d7_KjU = (i & 32) != 0 ? ColorLightTokens.INSTANCE.m1470getSecondary0d7_KjU() : j42;
        long jM1453getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorLightTokens.INSTANCE.m1453getOnSecondary0d7_KjU() : j46;
        long jM1471getSecondaryContainer0d7_KjU = (i & 128) != 0 ? ColorLightTokens.INSTANCE.m1471getSecondaryContainer0d7_KjU() : j47;
        long j122 = jM1465getPrimary0d7_KjU;
        long jM1454getOnSecondaryContainer0d7_KjU = (i & 256) != 0 ? ColorLightTokens.INSTANCE.m1454getOnSecondaryContainer0d7_KjU() : j57;
        long jM1483getTertiary0d7_KjU = (i & 512) != 0 ? ColorLightTokens.INSTANCE.m1483getTertiary0d7_KjU() : j58;
        long jM1459getOnTertiary0d7_KjU = (i & 1024) != 0 ? ColorLightTokens.INSTANCE.m1459getOnTertiary0d7_KjU() : j65;
        long jM1484getTertiaryContainer0d7_KjU = (i & 2048) != 0 ? ColorLightTokens.INSTANCE.m1484getTertiaryContainer0d7_KjU() : j69;
        long jM1460getOnTertiaryContainer0d7_KjU = (i & 4096) != 0 ? ColorLightTokens.INSTANCE.m1460getOnTertiaryContainer0d7_KjU() : j76;
        long jM1440getBackground0d7_KjU = (i & 8192) != 0 ? ColorLightTokens.INSTANCE.m1440getBackground0d7_KjU() : j85;
        long jM1446getOnBackground0d7_KjU = (i & 16384) != 0 ? ColorLightTokens.INSTANCE.m1446getOnBackground0d7_KjU() : j100;
        long jM1474getSurface0d7_KjU = (i & 32768) != 0 ? ColorLightTokens.INSTANCE.m1474getSurface0d7_KjU() : j101;
        long jM1457getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorLightTokens.INSTANCE.m1457getOnSurface0d7_KjU() : j102;
        long jM1482getSurfaceVariant0d7_KjU = (i & 131072) != 0 ? ColorLightTokens.INSTANCE.m1482getSurfaceVariant0d7_KjU() : j103;
        long jM1458getOnSurfaceVariant0d7_KjU = (i & 262144) != 0 ? ColorLightTokens.INSTANCE.m1458getOnSurfaceVariant0d7_KjU() : j104;
        long j123 = (i & 524288) != 0 ? j122 : j105;
        long jM1445getInverseSurface0d7_KjU = (i & PKIFailureInfo.badCertTemplate) != 0 ? ColorLightTokens.INSTANCE.m1445getInverseSurface0d7_KjU() : j106;
        long jM1443getInverseOnSurface0d7_KjU = (i & PKIFailureInfo.badSenderNonce) != 0 ? ColorLightTokens.INSTANCE.m1443getInverseOnSurface0d7_KjU() : j107;
        long jM1441getError0d7_KjU = (i & 4194304) != 0 ? ColorLightTokens.INSTANCE.m1441getError0d7_KjU() : j108;
        long jM1447getOnError0d7_KjU = (i & 8388608) != 0 ? ColorLightTokens.INSTANCE.m1447getOnError0d7_KjU() : j109;
        long jM1442getErrorContainer0d7_KjU = (i & 16777216) != 0 ? ColorLightTokens.INSTANCE.m1442getErrorContainer0d7_KjU() : j110;
        long jM1448getOnErrorContainer0d7_KjU = (i & 33554432) != 0 ? ColorLightTokens.INSTANCE.m1448getOnErrorContainer0d7_KjU() : j111;
        long jM1463getOutline0d7_KjU = (i & 67108864) != 0 ? ColorLightTokens.INSTANCE.m1463getOutline0d7_KjU() : j112;
        long jM1464getOutlineVariant0d7_KjU = (i & 134217728) != 0 ? ColorLightTokens.INSTANCE.m1464getOutlineVariant0d7_KjU() : j113;
        long jM1469getScrim0d7_KjU = (i & 268435456) != 0 ? ColorLightTokens.INSTANCE.m1469getScrim0d7_KjU() : j114;
        long jM1475getSurfaceBright0d7_KjU = (i & PKIFailureInfo.duplicateCertReq) != 0 ? ColorLightTokens.INSTANCE.m1475getSurfaceBright0d7_KjU() : j115;
        long jM1476getSurfaceContainer0d7_KjU = (i & 1073741824) != 0 ? ColorLightTokens.INSTANCE.m1476getSurfaceContainer0d7_KjU() : j116;
        long jM1477getSurfaceContainerHigh0d7_KjU = (i & Integer.MIN_VALUE) != 0 ? ColorLightTokens.INSTANCE.m1477getSurfaceContainerHigh0d7_KjU() : j117;
        long jM1478getSurfaceContainerHighest0d7_KjU = (i2 & 1) != 0 ? ColorLightTokens.INSTANCE.m1478getSurfaceContainerHighest0d7_KjU() : j118;
        long jM1479getSurfaceContainerLow0d7_KjU = (i2 & 2) != 0 ? ColorLightTokens.INSTANCE.m1479getSurfaceContainerLow0d7_KjU() : j119;
        long jM1480getSurfaceContainerLowest0d7_KjU = (i2 & 4) != 0 ? ColorLightTokens.INSTANCE.m1480getSurfaceContainerLowest0d7_KjU() : j120;
        if ((i2 & 8) != 0) {
            j121 = ColorLightTokens.INSTANCE.m1481getSurfaceDim0d7_KjU();
        }
        return m1357lightColorSchemeCXl9yA(j122, jM1449getOnPrimary0d7_KjU, jM1466getPrimaryContainer0d7_KjU, jM1450getOnPrimaryContainer0d7_KjU, jM1444getInversePrimary0d7_KjU, jM1470getSecondary0d7_KjU, jM1453getOnSecondary0d7_KjU, jM1471getSecondaryContainer0d7_KjU, jM1454getOnSecondaryContainer0d7_KjU, jM1483getTertiary0d7_KjU, jM1459getOnTertiary0d7_KjU, jM1484getTertiaryContainer0d7_KjU, jM1460getOnTertiaryContainer0d7_KjU, jM1440getBackground0d7_KjU, jM1446getOnBackground0d7_KjU, jM1474getSurface0d7_KjU, jM1457getOnSurface0d7_KjU, jM1482getSurfaceVariant0d7_KjU, jM1458getOnSurfaceVariant0d7_KjU, j123, jM1445getInverseSurface0d7_KjU, jM1443getInverseOnSurface0d7_KjU, jM1441getError0d7_KjU, jM1447getOnError0d7_KjU, jM1442getErrorContainer0d7_KjU, jM1448getOnErrorContainer0d7_KjU, jM1463getOutline0d7_KjU, jM1464getOutlineVariant0d7_KjU, jM1469getScrim0d7_KjU, jM1475getSurfaceBright0d7_KjU, jM1476getSurfaceContainer0d7_KjU, jM1477getSurfaceContainerHigh0d7_KjU, jM1478getSurfaceContainerHighest0d7_KjU, jM1479getSurfaceContainerLow0d7_KjU, jM1480getSurfaceContainerLowest0d7_KjU, j121);
    }

    @NotNull
    /* JADX INFO: renamed from: lightColorScheme-_VG5OTI, reason: not valid java name */
    public static final ColorScheme m1359lightColorScheme_VG5OTI(long j2, long j3, long j5, long j16, long j22, long j42, long j46, long j47, long j57, long j58, long j65, long j69, long j76, long j85, long j100, long j101, long j102, long j103, long j104, long j105, long j106, long j107, long j108, long j109, long j110, long j111, long j112, long j113, long j114, long j115, long j116, long j117, long j118, long j119, long j120, long j121, long j122, long j123, long j124, long j125, long j126, long j127, long j128, long j129, long j130, long j131, long j132, long j133) {
        return new ColorScheme(j2, j3, j5, j16, j22, j42, j46, j47, j57, j58, j65, j69, j76, j85, j100, j101, j102, j103, j104, j105, j106, j107, j108, j109, j110, j111, j112, j113, j114, j115, j121, j116, j117, j118, j119, j120, j122, j123, j124, j125, j126, j127, j128, j129, j130, j131, j132, j133, null);
    }

    /* JADX INFO: renamed from: lightColorScheme-_VG5OTI$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1360lightColorScheme_VG5OTI$default(long j2, long j3, long j5, long j16, long j22, long j42, long j46, long j47, long j57, long j58, long j65, long j69, long j76, long j85, long j100, long j101, long j102, long j103, long j104, long j105, long j106, long j107, long j108, long j109, long j110, long j111, long j112, long j113, long j114, long j115, long j116, long j117, long j118, long j119, long j120, long j121, long j122, long j123, long j124, long j125, long j126, long j127, long j128, long j129, long j130, long j131, long j132, long j133, int i, int i2, Object obj2) {
        long jM1465getPrimary0d7_KjU = (i & 1) != 0 ? ColorLightTokens.INSTANCE.m1465getPrimary0d7_KjU() : j2;
        long jM1449getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorLightTokens.INSTANCE.m1449getOnPrimary0d7_KjU() : j3;
        long jM1466getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorLightTokens.INSTANCE.m1466getPrimaryContainer0d7_KjU() : j5;
        long jM1450getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorLightTokens.INSTANCE.m1450getOnPrimaryContainer0d7_KjU() : j16;
        long jM1444getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorLightTokens.INSTANCE.m1444getInversePrimary0d7_KjU() : j22;
        long jM1470getSecondary0d7_KjU = (i & 32) != 0 ? ColorLightTokens.INSTANCE.m1470getSecondary0d7_KjU() : j42;
        long jM1453getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorLightTokens.INSTANCE.m1453getOnSecondary0d7_KjU() : j46;
        long j134 = jM1465getPrimary0d7_KjU;
        long jM1471getSecondaryContainer0d7_KjU = (i & 128) != 0 ? ColorLightTokens.INSTANCE.m1471getSecondaryContainer0d7_KjU() : j47;
        long jM1454getOnSecondaryContainer0d7_KjU = (i & 256) != 0 ? ColorLightTokens.INSTANCE.m1454getOnSecondaryContainer0d7_KjU() : j57;
        long jM1483getTertiary0d7_KjU = (i & 512) != 0 ? ColorLightTokens.INSTANCE.m1483getTertiary0d7_KjU() : j58;
        long jM1459getOnTertiary0d7_KjU = (i & 1024) != 0 ? ColorLightTokens.INSTANCE.m1459getOnTertiary0d7_KjU() : j65;
        long jM1484getTertiaryContainer0d7_KjU = (i & 2048) != 0 ? ColorLightTokens.INSTANCE.m1484getTertiaryContainer0d7_KjU() : j69;
        long jM1460getOnTertiaryContainer0d7_KjU = (i & 4096) != 0 ? ColorLightTokens.INSTANCE.m1460getOnTertiaryContainer0d7_KjU() : j76;
        long jM1440getBackground0d7_KjU = (i & 8192) != 0 ? ColorLightTokens.INSTANCE.m1440getBackground0d7_KjU() : j85;
        long jM1446getOnBackground0d7_KjU = (i & 16384) != 0 ? ColorLightTokens.INSTANCE.m1446getOnBackground0d7_KjU() : j100;
        long jM1474getSurface0d7_KjU = (i & 32768) != 0 ? ColorLightTokens.INSTANCE.m1474getSurface0d7_KjU() : j101;
        long jM1457getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorLightTokens.INSTANCE.m1457getOnSurface0d7_KjU() : j102;
        long jM1482getSurfaceVariant0d7_KjU = (i & 131072) != 0 ? ColorLightTokens.INSTANCE.m1482getSurfaceVariant0d7_KjU() : j103;
        long jM1458getOnSurfaceVariant0d7_KjU = (i & 262144) != 0 ? ColorLightTokens.INSTANCE.m1458getOnSurfaceVariant0d7_KjU() : j104;
        long j135 = (i & 524288) != 0 ? j134 : j105;
        long jM1445getInverseSurface0d7_KjU = (i & PKIFailureInfo.badCertTemplate) != 0 ? ColorLightTokens.INSTANCE.m1445getInverseSurface0d7_KjU() : j106;
        long jM1443getInverseOnSurface0d7_KjU = (i & PKIFailureInfo.badSenderNonce) != 0 ? ColorLightTokens.INSTANCE.m1443getInverseOnSurface0d7_KjU() : j107;
        long jM1441getError0d7_KjU = (i & 4194304) != 0 ? ColorLightTokens.INSTANCE.m1441getError0d7_KjU() : j108;
        long jM1447getOnError0d7_KjU = (i & 8388608) != 0 ? ColorLightTokens.INSTANCE.m1447getOnError0d7_KjU() : j109;
        long jM1442getErrorContainer0d7_KjU = (i & 16777216) != 0 ? ColorLightTokens.INSTANCE.m1442getErrorContainer0d7_KjU() : j110;
        long jM1448getOnErrorContainer0d7_KjU = (i & 33554432) != 0 ? ColorLightTokens.INSTANCE.m1448getOnErrorContainer0d7_KjU() : j111;
        long jM1463getOutline0d7_KjU = (i & 67108864) != 0 ? ColorLightTokens.INSTANCE.m1463getOutline0d7_KjU() : j112;
        long jM1464getOutlineVariant0d7_KjU = (i & 134217728) != 0 ? ColorLightTokens.INSTANCE.m1464getOutlineVariant0d7_KjU() : j113;
        long jM1469getScrim0d7_KjU = (i & 268435456) != 0 ? ColorLightTokens.INSTANCE.m1469getScrim0d7_KjU() : j114;
        long jM1475getSurfaceBright0d7_KjU = (i & PKIFailureInfo.duplicateCertReq) != 0 ? ColorLightTokens.INSTANCE.m1475getSurfaceBright0d7_KjU() : j115;
        long jM1476getSurfaceContainer0d7_KjU = (i & 1073741824) != 0 ? ColorLightTokens.INSTANCE.m1476getSurfaceContainer0d7_KjU() : j116;
        long jM1477getSurfaceContainerHigh0d7_KjU = (i & Integer.MIN_VALUE) != 0 ? ColorLightTokens.INSTANCE.m1477getSurfaceContainerHigh0d7_KjU() : j117;
        long jM1478getSurfaceContainerHighest0d7_KjU = (i2 & 1) != 0 ? ColorLightTokens.INSTANCE.m1478getSurfaceContainerHighest0d7_KjU() : j118;
        long jM1479getSurfaceContainerLow0d7_KjU = (i2 & 2) != 0 ? ColorLightTokens.INSTANCE.m1479getSurfaceContainerLow0d7_KjU() : j119;
        long jM1480getSurfaceContainerLowest0d7_KjU = (i2 & 4) != 0 ? ColorLightTokens.INSTANCE.m1480getSurfaceContainerLowest0d7_KjU() : j120;
        long jM1481getSurfaceDim0d7_KjU = (i2 & 8) != 0 ? ColorLightTokens.INSTANCE.m1481getSurfaceDim0d7_KjU() : j121;
        long jM1467getPrimaryFixed0d7_KjU = (i2 & 16) != 0 ? ColorLightTokens.INSTANCE.m1467getPrimaryFixed0d7_KjU() : j122;
        long jM1468getPrimaryFixedDim0d7_KjU = (i2 & 32) != 0 ? ColorLightTokens.INSTANCE.m1468getPrimaryFixedDim0d7_KjU() : j123;
        long jM1451getOnPrimaryFixed0d7_KjU = (i2 & 64) != 0 ? ColorLightTokens.INSTANCE.m1451getOnPrimaryFixed0d7_KjU() : j124;
        long jM1452getOnPrimaryFixedVariant0d7_KjU = (i2 & 128) != 0 ? ColorLightTokens.INSTANCE.m1452getOnPrimaryFixedVariant0d7_KjU() : j125;
        long jM1472getSecondaryFixed0d7_KjU = (i2 & 256) != 0 ? ColorLightTokens.INSTANCE.m1472getSecondaryFixed0d7_KjU() : j126;
        long jM1473getSecondaryFixedDim0d7_KjU = (i2 & 512) != 0 ? ColorLightTokens.INSTANCE.m1473getSecondaryFixedDim0d7_KjU() : j127;
        long jM1455getOnSecondaryFixed0d7_KjU = (i2 & 1024) != 0 ? ColorLightTokens.INSTANCE.m1455getOnSecondaryFixed0d7_KjU() : j128;
        long jM1456getOnSecondaryFixedVariant0d7_KjU = (i2 & 2048) != 0 ? ColorLightTokens.INSTANCE.m1456getOnSecondaryFixedVariant0d7_KjU() : j129;
        long jM1485getTertiaryFixed0d7_KjU = (i2 & 4096) != 0 ? ColorLightTokens.INSTANCE.m1485getTertiaryFixed0d7_KjU() : j130;
        long jM1486getTertiaryFixedDim0d7_KjU = (i2 & 8192) != 0 ? ColorLightTokens.INSTANCE.m1486getTertiaryFixedDim0d7_KjU() : j131;
        long jM1461getOnTertiaryFixed0d7_KjU = (i2 & 16384) != 0 ? ColorLightTokens.INSTANCE.m1461getOnTertiaryFixed0d7_KjU() : j132;
        if ((i2 & 32768) != 0) {
            j133 = ColorLightTokens.INSTANCE.m1462getOnTertiaryFixedVariant0d7_KjU();
        }
        return m1359lightColorScheme_VG5OTI(j134, jM1449getOnPrimary0d7_KjU, jM1466getPrimaryContainer0d7_KjU, jM1450getOnPrimaryContainer0d7_KjU, jM1444getInversePrimary0d7_KjU, jM1470getSecondary0d7_KjU, jM1453getOnSecondary0d7_KjU, jM1471getSecondaryContainer0d7_KjU, jM1454getOnSecondaryContainer0d7_KjU, jM1483getTertiary0d7_KjU, jM1459getOnTertiary0d7_KjU, jM1484getTertiaryContainer0d7_KjU, jM1460getOnTertiaryContainer0d7_KjU, jM1440getBackground0d7_KjU, jM1446getOnBackground0d7_KjU, jM1474getSurface0d7_KjU, jM1457getOnSurface0d7_KjU, jM1482getSurfaceVariant0d7_KjU, jM1458getOnSurfaceVariant0d7_KjU, j135, jM1445getInverseSurface0d7_KjU, jM1443getInverseOnSurface0d7_KjU, jM1441getError0d7_KjU, jM1447getOnError0d7_KjU, jM1442getErrorContainer0d7_KjU, jM1448getOnErrorContainer0d7_KjU, jM1463getOutline0d7_KjU, jM1464getOutlineVariant0d7_KjU, jM1469getScrim0d7_KjU, jM1475getSurfaceBright0d7_KjU, jM1476getSurfaceContainer0d7_KjU, jM1477getSurfaceContainerHigh0d7_KjU, jM1478getSurfaceContainerHighest0d7_KjU, jM1479getSurfaceContainerLow0d7_KjU, jM1480getSurfaceContainerLowest0d7_KjU, jM1481getSurfaceDim0d7_KjU, jM1467getPrimaryFixed0d7_KjU, jM1468getPrimaryFixedDim0d7_KjU, jM1451getOnPrimaryFixed0d7_KjU, jM1452getOnPrimaryFixedVariant0d7_KjU, jM1472getSecondaryFixed0d7_KjU, jM1473getSecondaryFixedDim0d7_KjU, jM1455getOnSecondaryFixed0d7_KjU, jM1456getOnSecondaryFixedVariant0d7_KjU, jM1485getTertiaryFixed0d7_KjU, jM1486getTertiaryFixedDim0d7_KjU, jM1461getOnTertiaryFixed0d7_KjU, j133);
    }

    /* JADX INFO: renamed from: surfaceColorAtElevation-3ABfNKs, reason: not valid java name */
    public static final long m1361surfaceColorAtElevation3ABfNKs(@NotNull ColorScheme colorScheme, float f) {
        if (Dp.m3299equalsimpl0(f, Dp.m3297constructorimpl(0))) {
            return colorScheme.getSurface();
        }
        return ColorKt.m1999compositeOverOWjLjI(Color.m1976copywmQWz5c$default(colorScheme.getSurfaceTint(), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), colorScheme.getSurface());
    }
}
