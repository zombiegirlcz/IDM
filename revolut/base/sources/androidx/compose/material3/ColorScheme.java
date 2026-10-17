package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u000e\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0087\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020\u0002\u0012\u0006\u00100\u001a\u00020\u0002\u0012\u0006\u00101\u001a\u00020\u0002\u0012\u0006\u00102\u001a\u00020\u0002¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b;\u0010:R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b<\u0010:R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b=\u0010:R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b>\u0010:R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b?\u0010:R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b@\u0010:R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\bA\u0010:R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\bB\u0010:R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\bC\u0010:R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\bD\u0010:R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\bE\u0010:R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\bF\u0010:R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\bG\u0010:R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\bH\u0010:R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\bI\u0010:R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\bJ\u0010:R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\bK\u0010:R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\bL\u0010:R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u00108\u001a\u0004\bM\u0010:R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u00108\u001a\u0004\bN\u0010:R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u00108\u001a\u0004\bO\u0010:R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u00108\u001a\u0004\bP\u0010:R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u00108\u001a\u0004\bQ\u0010:R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u00108\u001a\u0004\bR\u0010:R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u00108\u001a\u0004\bS\u0010:R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u00108\u001a\u0004\bT\u0010:R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u00108\u001a\u0004\bU\u0010:R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u00108\u001a\u0004\bV\u0010:R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u00108\u001a\u0004\bW\u0010:R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u00108\u001a\u0004\bX\u0010:R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u00108\u001a\u0004\bY\u0010:R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u00108\u001a\u0004\bZ\u0010:R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u00108\u001a\u0004\b[\u0010:R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u00108\u001a\u0004\b\\\u0010:R\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u00108\u001a\u0004\b]\u0010:R\u0017\u0010'\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u00108\u001a\u0004\b^\u0010:R\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u00108\u001a\u0004\b_\u0010:R\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u00108\u001a\u0004\b`\u0010:R\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u00108\u001a\u0004\ba\u0010:R\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u00108\u001a\u0004\bb\u0010:R\u0017\u0010,\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u00108\u001a\u0004\bc\u0010:R\u0017\u0010-\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u00108\u001a\u0004\bd\u0010:R\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u00108\u001a\u0004\be\u0010:R\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u00108\u001a\u0004\bf\u0010:R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00108\u001a\u0004\bg\u0010:R\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00108\u001a\u0004\bh\u0010:R\u0017\u00102\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u00108\u001a\u0004\bi\u0010:R$\u0010k\u001a\u0004\u0018\u00010j8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR$\u0010q\u001a\u0004\u0018\u00010j8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bq\u0010l\u001a\u0004\br\u0010n\"\u0004\bs\u0010pR$\u0010u\u001a\u0004\u0018\u00010t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR&\u0010|\u001a\u0004\u0018\u00010{8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001¨\u0006\u0082\u0001"}, d2 = {"Landroidx/compose/material3/ColorScheme;", "", "Landroidx/compose/ui/graphics/Color;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceDim", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "primaryFixed", "primaryFixedDim", "onPrimaryFixed", "onPrimaryFixedVariant", "secondaryFixed", "secondaryFixedDim", "onSecondaryFixed", "onSecondaryFixedVariant", "tertiaryFixed", "tertiaryFixedDim", "onTertiaryFixed", "onTertiaryFixedVariant", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "J", "getPrimary-0d7_KjU", "()J", "getOnPrimary-0d7_KjU", "getPrimaryContainer-0d7_KjU", "getOnPrimaryContainer-0d7_KjU", "getInversePrimary-0d7_KjU", "getSecondary-0d7_KjU", "getOnSecondary-0d7_KjU", "getSecondaryContainer-0d7_KjU", "getOnSecondaryContainer-0d7_KjU", "getTertiary-0d7_KjU", "getOnTertiary-0d7_KjU", "getTertiaryContainer-0d7_KjU", "getOnTertiaryContainer-0d7_KjU", "getBackground-0d7_KjU", "getOnBackground-0d7_KjU", "getSurface-0d7_KjU", "getOnSurface-0d7_KjU", "getSurfaceVariant-0d7_KjU", "getOnSurfaceVariant-0d7_KjU", "getSurfaceTint-0d7_KjU", "getInverseSurface-0d7_KjU", "getInverseOnSurface-0d7_KjU", "getError-0d7_KjU", "getOnError-0d7_KjU", "getErrorContainer-0d7_KjU", "getOnErrorContainer-0d7_KjU", "getOutline-0d7_KjU", "getOutlineVariant-0d7_KjU", "getScrim-0d7_KjU", "getSurfaceBright-0d7_KjU", "getSurfaceDim-0d7_KjU", "getSurfaceContainer-0d7_KjU", "getSurfaceContainerHigh-0d7_KjU", "getSurfaceContainerHighest-0d7_KjU", "getSurfaceContainerLow-0d7_KjU", "getSurfaceContainerLowest-0d7_KjU", "getPrimaryFixed-0d7_KjU", "getPrimaryFixedDim-0d7_KjU", "getOnPrimaryFixed-0d7_KjU", "getOnPrimaryFixedVariant-0d7_KjU", "getSecondaryFixed-0d7_KjU", "getSecondaryFixedDim-0d7_KjU", "getOnSecondaryFixed-0d7_KjU", "getOnSecondaryFixedVariant-0d7_KjU", "getTertiaryFixed-0d7_KjU", "getTertiaryFixedDim-0d7_KjU", "getOnTertiaryFixed-0d7_KjU", "getOnTertiaryFixedVariant-0d7_KjU", "Landroidx/compose/material3/ButtonColors;", "defaultButtonColorsCached", "Landroidx/compose/material3/ButtonColors;", "getDefaultButtonColorsCached$material3", "()Landroidx/compose/material3/ButtonColors;", "setDefaultButtonColorsCached$material3", "(Landroidx/compose/material3/ButtonColors;)V", "defaultTextButtonColorsCached", "getDefaultTextButtonColorsCached$material3", "setDefaultTextButtonColorsCached$material3", "Landroidx/compose/material3/CardColors;", "defaultCardColorsCached", "Landroidx/compose/material3/CardColors;", "getDefaultCardColorsCached$material3", "()Landroidx/compose/material3/CardColors;", "setDefaultCardColorsCached$material3", "(Landroidx/compose/material3/CardColors;)V", "Landroidx/compose/material3/TextFieldColors;", "defaultOutlinedTextFieldColorsCached", "Landroidx/compose/material3/TextFieldColors;", "getDefaultOutlinedTextFieldColorsCached$material3", "()Landroidx/compose/material3/TextFieldColors;", "setDefaultOutlinedTextFieldColorsCached$material3", "(Landroidx/compose/material3/TextFieldColors;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ColorScheme {
    private final long background;
    private ButtonColors defaultButtonColorsCached;
    private CardColors defaultCardColorsCached;
    private TextFieldColors defaultOutlinedTextFieldColorsCached;
    private ButtonColors defaultTextButtonColorsCached;
    private final long error;
    private final long errorContainer;
    private final long inverseOnSurface;
    private final long inversePrimary;
    private final long inverseSurface;
    private final long onBackground;
    private final long onError;
    private final long onErrorContainer;
    private final long onPrimary;
    private final long onPrimaryContainer;
    private final long onPrimaryFixed;
    private final long onPrimaryFixedVariant;
    private final long onSecondary;
    private final long onSecondaryContainer;
    private final long onSecondaryFixed;
    private final long onSecondaryFixedVariant;
    private final long onSurface;
    private final long onSurfaceVariant;
    private final long onTertiary;
    private final long onTertiaryContainer;
    private final long onTertiaryFixed;
    private final long onTertiaryFixedVariant;
    private final long outline;
    private final long outlineVariant;
    private final long primary;
    private final long primaryContainer;
    private final long primaryFixed;
    private final long primaryFixedDim;
    private final long scrim;
    private final long secondary;
    private final long secondaryContainer;
    private final long secondaryFixed;
    private final long secondaryFixedDim;
    private final long surface;
    private final long surfaceBright;
    private final long surfaceContainer;
    private final long surfaceContainerHigh;
    private final long surfaceContainerHighest;
    private final long surfaceContainerLow;
    private final long surfaceContainerLowest;
    private final long surfaceDim;
    private final long surfaceTint;
    private final long surfaceVariant;
    private final long tertiary;
    private final long tertiaryContainer;
    private final long tertiaryFixed;
    private final long tertiaryFixedDim;

    public /* synthetic */ ColorScheme(long j2, long j3, long j5, long j16, long j22, long j42, long j46, long j47, long j57, long j58, long j65, long j69, long j76, long j85, long j100, long j101, long j102, long j103, long j104, long j105, long j106, long j107, long j108, long j109, long j110, long j111, long j112, long j113, long j114, long j115, long j116, long j117, long j118, long j119, long j120, long j121, long j122, long j123, long j124, long j125, long j126, long j127, long j128, long j129, long j130, long j131, long j132, long j133, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j5, j16, j22, j42, j46, j47, j57, j58, j65, j69, j76, j85, j100, j101, j102, j103, j104, j105, j106, j107, j108, j109, j110, j111, j112, j113, j114, j115, j116, j117, j118, j119, j120, j121, j122, j123, j124, j125, j126, j127, j128, j129, j130, j131, j132, j133);
    }

    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: getDefaultButtonColorsCached$material3, reason: from getter */
    public final ButtonColors getDefaultButtonColorsCached() {
        return this.defaultButtonColorsCached;
    }

    /* JADX INFO: renamed from: getDefaultCardColorsCached$material3, reason: from getter */
    public final CardColors getDefaultCardColorsCached() {
        return this.defaultCardColorsCached;
    }

    /* JADX INFO: renamed from: getDefaultOutlinedTextFieldColorsCached$material3, reason: from getter */
    public final TextFieldColors getDefaultOutlinedTextFieldColorsCached() {
        return this.defaultOutlinedTextFieldColorsCached;
    }

    /* JADX INFO: renamed from: getDefaultTextButtonColorsCached$material3, reason: from getter */
    public final ButtonColors getDefaultTextButtonColorsCached() {
        return this.defaultTextButtonColorsCached;
    }

    /* JADX INFO: renamed from: getError-0d7_KjU, reason: not valid java name and from getter */
    public final long getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: getErrorContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorContainer() {
        return this.errorContainer;
    }

    /* JADX INFO: renamed from: getInverseOnSurface-0d7_KjU, reason: not valid java name and from getter */
    public final long getInverseOnSurface() {
        return this.inverseOnSurface;
    }

    /* JADX INFO: renamed from: getInversePrimary-0d7_KjU, reason: not valid java name and from getter */
    public final long getInversePrimary() {
        return this.inversePrimary;
    }

    /* JADX INFO: renamed from: getInverseSurface-0d7_KjU, reason: not valid java name and from getter */
    public final long getInverseSurface() {
        return this.inverseSurface;
    }

    /* JADX INFO: renamed from: getOnBackground-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnBackground() {
        return this.onBackground;
    }

    /* JADX INFO: renamed from: getOnError-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnError() {
        return this.onError;
    }

    /* JADX INFO: renamed from: getOnErrorContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnErrorContainer() {
        return this.onErrorContainer;
    }

    /* JADX INFO: renamed from: getOnPrimary-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnPrimary() {
        return this.onPrimary;
    }

    /* JADX INFO: renamed from: getOnPrimaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnPrimaryContainer() {
        return this.onPrimaryContainer;
    }

    /* JADX INFO: renamed from: getOnPrimaryFixed-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnPrimaryFixed() {
        return this.onPrimaryFixed;
    }

    /* JADX INFO: renamed from: getOnPrimaryFixedVariant-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnPrimaryFixedVariant() {
        return this.onPrimaryFixedVariant;
    }

    /* JADX INFO: renamed from: getOnSecondary-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSecondary() {
        return this.onSecondary;
    }

    /* JADX INFO: renamed from: getOnSecondaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSecondaryContainer() {
        return this.onSecondaryContainer;
    }

    /* JADX INFO: renamed from: getOnSecondaryFixed-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSecondaryFixed() {
        return this.onSecondaryFixed;
    }

    /* JADX INFO: renamed from: getOnSecondaryFixedVariant-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSecondaryFixedVariant() {
        return this.onSecondaryFixedVariant;
    }

    /* JADX INFO: renamed from: getOnSurface-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSurface() {
        return this.onSurface;
    }

    /* JADX INFO: renamed from: getOnSurfaceVariant-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSurfaceVariant() {
        return this.onSurfaceVariant;
    }

    /* JADX INFO: renamed from: getOnTertiary-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnTertiary() {
        return this.onTertiary;
    }

    /* JADX INFO: renamed from: getOnTertiaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnTertiaryContainer() {
        return this.onTertiaryContainer;
    }

    /* JADX INFO: renamed from: getOnTertiaryFixed-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnTertiaryFixed() {
        return this.onTertiaryFixed;
    }

    /* JADX INFO: renamed from: getOnTertiaryFixedVariant-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnTertiaryFixedVariant() {
        return this.onTertiaryFixedVariant;
    }

    /* JADX INFO: renamed from: getOutline-0d7_KjU, reason: not valid java name and from getter */
    public final long getOutline() {
        return this.outline;
    }

    /* JADX INFO: renamed from: getOutlineVariant-0d7_KjU, reason: not valid java name and from getter */
    public final long getOutlineVariant() {
        return this.outlineVariant;
    }

    /* JADX INFO: renamed from: getPrimary-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimary() {
        return this.primary;
    }

    /* JADX INFO: renamed from: getPrimaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimaryContainer() {
        return this.primaryContainer;
    }

    /* JADX INFO: renamed from: getPrimaryFixed-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimaryFixed() {
        return this.primaryFixed;
    }

    /* JADX INFO: renamed from: getPrimaryFixedDim-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimaryFixedDim() {
        return this.primaryFixedDim;
    }

    /* JADX INFO: renamed from: getScrim-0d7_KjU, reason: not valid java name and from getter */
    public final long getScrim() {
        return this.scrim;
    }

    /* JADX INFO: renamed from: getSecondary-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondary() {
        return this.secondary;
    }

    /* JADX INFO: renamed from: getSecondaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondaryContainer() {
        return this.secondaryContainer;
    }

    /* JADX INFO: renamed from: getSecondaryFixed-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondaryFixed() {
        return this.secondaryFixed;
    }

    /* JADX INFO: renamed from: getSecondaryFixedDim-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondaryFixedDim() {
        return this.secondaryFixedDim;
    }

    /* JADX INFO: renamed from: getSurface-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: getSurfaceBright-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceBright() {
        return this.surfaceBright;
    }

    /* JADX INFO: renamed from: getSurfaceContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainer() {
        return this.surfaceContainer;
    }

    /* JADX INFO: renamed from: getSurfaceContainerHigh-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainerHigh() {
        return this.surfaceContainerHigh;
    }

    /* JADX INFO: renamed from: getSurfaceContainerHighest-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainerHighest() {
        return this.surfaceContainerHighest;
    }

    /* JADX INFO: renamed from: getSurfaceContainerLow-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainerLow() {
        return this.surfaceContainerLow;
    }

    /* JADX INFO: renamed from: getSurfaceContainerLowest-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainerLowest() {
        return this.surfaceContainerLowest;
    }

    /* JADX INFO: renamed from: getSurfaceDim-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceDim() {
        return this.surfaceDim;
    }

    /* JADX INFO: renamed from: getSurfaceTint-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceTint() {
        return this.surfaceTint;
    }

    /* JADX INFO: renamed from: getSurfaceVariant-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceVariant() {
        return this.surfaceVariant;
    }

    /* JADX INFO: renamed from: getTertiary-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiary() {
        return this.tertiary;
    }

    /* JADX INFO: renamed from: getTertiaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiaryContainer() {
        return this.tertiaryContainer;
    }

    /* JADX INFO: renamed from: getTertiaryFixed-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiaryFixed() {
        return this.tertiaryFixed;
    }

    /* JADX INFO: renamed from: getTertiaryFixedDim-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiaryFixedDim() {
        return this.tertiaryFixedDim;
    }

    public final void setDefaultButtonColorsCached$material3(ButtonColors buttonColors) {
        this.defaultButtonColorsCached = buttonColors;
    }

    public final void setDefaultCardColorsCached$material3(CardColors cardColors) {
        this.defaultCardColorsCached = cardColors;
    }

    public final void setDefaultOutlinedTextFieldColorsCached$material3(TextFieldColors textFieldColors) {
        this.defaultOutlinedTextFieldColorsCached = textFieldColors;
    }

    public final void setDefaultTextButtonColorsCached$material3(ButtonColors buttonColors) {
        this.defaultTextButtonColorsCached = buttonColors;
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("ColorScheme(primary=");
        com.revolut.data.database.models.openbanking.d.A(this.primary, "onPrimary=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.onPrimary, "primaryContainer=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.primaryContainer, "onPrimaryContainer=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.onPrimaryContainer, "inversePrimary=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.inversePrimary, "secondary=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.secondary, "onSecondary=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.onSecondary, "secondaryContainer=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.secondaryContainer, "onSecondaryContainer=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.onSecondaryContainer, "tertiary=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.tertiary, "onTertiary=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.onTertiary, "tertiaryContainer=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.tertiaryContainer, "onTertiaryContainer=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.onTertiaryContainer, "background=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.background, "onBackground=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.onBackground, "surface=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.surface, "onSurface=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.onSurface, "surfaceVariant=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.surfaceVariant, "onSurfaceVariant=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.onSurfaceVariant, "surfaceTint=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.surfaceTint, "inverseSurface=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.inverseSurface, "inverseOnSurface=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.inverseOnSurface, "error=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.error, "onError=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.onError, "errorContainer=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.errorContainer, "onErrorContainer=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.onErrorContainer, "outline=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.outline, "outlineVariant=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.outlineVariant, "scrim=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.scrim, "surfaceBright=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.surfaceBright, "surfaceDim=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.surfaceDim, "surfaceContainer=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.surfaceContainer, "surfaceContainerHigh=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.surfaceContainerHigh, "surfaceContainerHighest=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.surfaceContainerHighest, "surfaceContainerLow=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.surfaceContainerLow, "surfaceContainerLowest=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.surfaceContainerLowest, "primaryFixed=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.primaryFixed, "primaryFixedDim=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.primaryFixedDim, "onPrimaryFixed=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.onPrimaryContainer, "onPrimaryFixedVariant=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.onPrimaryFixedVariant, "secondaryFixed=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.secondaryFixed, "secondaryFixedDim=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.secondaryFixedDim, "onSecondaryFixed=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.onSecondaryFixed, "onSecondaryFixedVariant=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.onSecondaryFixedVariant, "tertiaryFixed=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.tertiaryFixed, "tertiaryFixedDim=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.tertiaryFixedDim, "onTertiaryFixed=", sb6);
        com.revolut.data.database.models.openbanking.d.A(this.onTertiaryFixed, "onTertiaryFixedVariant=", sb6);
        sb6.append((Object) Color.m1985toStringimpl(this.onTertiaryFixedVariant));
        sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb6.toString();
    }

    private ColorScheme(long j2, long j3, long j5, long j16, long j22, long j42, long j46, long j47, long j57, long j58, long j65, long j69, long j76, long j85, long j100, long j101, long j102, long j103, long j104, long j105, long j106, long j107, long j108, long j109, long j110, long j111, long j112, long j113, long j114, long j115, long j116, long j117, long j118, long j119, long j120, long j121, long j122, long j123, long j124, long j125, long j126, long j127, long j128, long j129, long j130, long j131, long j132, long j133) {
        this.primary = j2;
        this.onPrimary = j3;
        this.primaryContainer = j5;
        this.onPrimaryContainer = j16;
        this.inversePrimary = j22;
        this.secondary = j42;
        this.onSecondary = j46;
        this.secondaryContainer = j47;
        this.onSecondaryContainer = j57;
        this.tertiary = j58;
        this.onTertiary = j65;
        this.tertiaryContainer = j69;
        this.onTertiaryContainer = j76;
        this.background = j85;
        this.onBackground = j100;
        this.surface = j101;
        this.onSurface = j102;
        this.surfaceVariant = j103;
        this.onSurfaceVariant = j104;
        this.surfaceTint = j105;
        this.inverseSurface = j106;
        this.inverseOnSurface = j107;
        this.error = j108;
        this.onError = j109;
        this.errorContainer = j110;
        this.onErrorContainer = j111;
        this.outline = j112;
        this.outlineVariant = j113;
        this.scrim = j114;
        this.surfaceBright = j115;
        this.surfaceDim = j116;
        this.surfaceContainer = j117;
        this.surfaceContainerHigh = j118;
        this.surfaceContainerHighest = j119;
        this.surfaceContainerLow = j120;
        this.surfaceContainerLowest = j121;
        this.primaryFixed = j122;
        this.primaryFixedDim = j123;
        this.onPrimaryFixed = j124;
        this.onPrimaryFixedVariant = j125;
        this.secondaryFixed = j126;
        this.secondaryFixedDim = j127;
        this.onSecondaryFixed = j128;
        this.onSecondaryFixedVariant = j129;
        this.tertiaryFixed = j130;
        this.tertiaryFixedDim = j131;
        this.onTertiaryFixed = j132;
        this.onTertiaryFixedVariant = j133;
    }
}
