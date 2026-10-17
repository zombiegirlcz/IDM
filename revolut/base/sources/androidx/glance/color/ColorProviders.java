package androidx.glance.color;

import a10.b;
import androidx.glance.unit.ColorProvider;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001BÙ\u0001\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b.\u0010+R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b/\u0010+R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b0\u0010+R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b1\u0010+R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b2\u0010+R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b3\u0010+R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b4\u0010+R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b5\u0010+R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b6\u0010+R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b7\u0010+R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b8\u0010+R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b9\u0010+R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010)\u001a\u0004\b:\u0010+R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b;\u0010+R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010)\u001a\u0004\b<\u0010+R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010)\u001a\u0004\b=\u0010+R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b>\u0010+R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010)\u001a\u0004\b?\u0010+R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b@\u0010+R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010)\u001a\u0004\bA\u0010+R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010)\u001a\u0004\bB\u0010+R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010)\u001a\u0004\bC\u0010+R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010)\u001a\u0004\bD\u0010+\u0082\u0001\u0001E¨\u0006F"}, d2 = {"Landroidx/glance/color/ColorProviders;", "", "Landroidx/glance/unit/ColorProvider;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "error", "errorContainer", "onError", "onErrorContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "outline", "inverseOnSurface", "inverseSurface", "inversePrimary", "<init>", "(Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/glance/unit/ColorProvider;", "getPrimary", "()Landroidx/glance/unit/ColorProvider;", "getOnPrimary", "getPrimaryContainer", "getOnPrimaryContainer", "getSecondary", "getOnSecondary", "getSecondaryContainer", "getOnSecondaryContainer", "getTertiary", "getOnTertiary", "getTertiaryContainer", "getOnTertiaryContainer", "getError", "getErrorContainer", "getOnError", "getOnErrorContainer", "getBackground", "getOnBackground", "getSurface", "getOnSurface", "getSurfaceVariant", "getOnSurfaceVariant", "getOutline", "getInverseOnSurface", "getInverseSurface", "getInversePrimary", "Landroidx/glance/color/DynamicThemeColorProviders;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ColorProviders {

    @NotNull
    private final ColorProvider background;

    @NotNull
    private final ColorProvider error;

    @NotNull
    private final ColorProvider errorContainer;

    @NotNull
    private final ColorProvider inverseOnSurface;

    @NotNull
    private final ColorProvider inversePrimary;

    @NotNull
    private final ColorProvider inverseSurface;

    @NotNull
    private final ColorProvider onBackground;

    @NotNull
    private final ColorProvider onError;

    @NotNull
    private final ColorProvider onErrorContainer;

    @NotNull
    private final ColorProvider onPrimary;

    @NotNull
    private final ColorProvider onPrimaryContainer;

    @NotNull
    private final ColorProvider onSecondary;

    @NotNull
    private final ColorProvider onSecondaryContainer;

    @NotNull
    private final ColorProvider onSurface;

    @NotNull
    private final ColorProvider onSurfaceVariant;

    @NotNull
    private final ColorProvider onTertiary;

    @NotNull
    private final ColorProvider onTertiaryContainer;

    @NotNull
    private final ColorProvider outline;

    @NotNull
    private final ColorProvider primary;

    @NotNull
    private final ColorProvider primaryContainer;

    @NotNull
    private final ColorProvider secondary;

    @NotNull
    private final ColorProvider secondaryContainer;

    @NotNull
    private final ColorProvider surface;

    @NotNull
    private final ColorProvider surfaceVariant;

    @NotNull
    private final ColorProvider tertiary;

    @NotNull
    private final ColorProvider tertiaryContainer;

    public /* synthetic */ ColorProviders(ColorProvider colorProvider, ColorProvider colorProvider2, ColorProvider colorProvider3, ColorProvider colorProvider4, ColorProvider colorProvider5, ColorProvider colorProvider6, ColorProvider colorProvider7, ColorProvider colorProvider8, ColorProvider colorProvider9, ColorProvider colorProvider10, ColorProvider colorProvider11, ColorProvider colorProvider12, ColorProvider colorProvider13, ColorProvider colorProvider14, ColorProvider colorProvider15, ColorProvider colorProvider16, ColorProvider colorProvider17, ColorProvider colorProvider18, ColorProvider colorProvider19, ColorProvider colorProvider20, ColorProvider colorProvider21, ColorProvider colorProvider22, ColorProvider colorProvider23, ColorProvider colorProvider24, ColorProvider colorProvider25, ColorProvider colorProvider26, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorProvider, colorProvider2, colorProvider3, colorProvider4, colorProvider5, colorProvider6, colorProvider7, colorProvider8, colorProvider9, colorProvider10, colorProvider11, colorProvider12, colorProvider13, colorProvider14, colorProvider15, colorProvider16, colorProvider17, colorProvider18, colorProvider19, colorProvider20, colorProvider21, colorProvider22, colorProvider23, colorProvider24, colorProvider25, colorProvider26);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!getClass().equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.i(other, "null cannot be cast to non-null type androidx.glance.color.ColorProviders");
        ColorProviders colorProviders = (ColorProviders) other;
        return Intrinsics.f(this.primary, colorProviders.primary) && Intrinsics.f(this.onPrimary, colorProviders.onPrimary) && Intrinsics.f(this.primaryContainer, colorProviders.primaryContainer) && Intrinsics.f(this.onPrimaryContainer, colorProviders.onPrimaryContainer) && Intrinsics.f(this.secondary, colorProviders.secondary) && Intrinsics.f(this.onSecondary, colorProviders.onSecondary) && Intrinsics.f(this.secondaryContainer, colorProviders.secondaryContainer) && Intrinsics.f(this.onSecondaryContainer, colorProviders.onSecondaryContainer) && Intrinsics.f(this.tertiary, colorProviders.tertiary) && Intrinsics.f(this.onTertiary, colorProviders.onTertiary) && Intrinsics.f(this.tertiaryContainer, colorProviders.tertiaryContainer) && Intrinsics.f(this.onTertiaryContainer, colorProviders.onTertiaryContainer) && Intrinsics.f(this.error, colorProviders.error) && Intrinsics.f(this.errorContainer, colorProviders.errorContainer) && Intrinsics.f(this.onError, colorProviders.onError) && Intrinsics.f(this.onErrorContainer, colorProviders.onErrorContainer) && Intrinsics.f(this.background, colorProviders.background) && Intrinsics.f(this.onBackground, colorProviders.onBackground) && Intrinsics.f(this.surface, colorProviders.surface) && Intrinsics.f(this.onSurface, colorProviders.onSurface) && Intrinsics.f(this.surfaceVariant, colorProviders.surfaceVariant) && Intrinsics.f(this.onSurfaceVariant, colorProviders.onSurfaceVariant) && Intrinsics.f(this.outline, colorProviders.outline) && Intrinsics.f(this.inverseOnSurface, colorProviders.inverseOnSurface) && Intrinsics.f(this.inverseSurface, colorProviders.inverseSurface) && Intrinsics.f(this.inversePrimary, colorProviders.inversePrimary);
    }

    public int hashCode() {
        return this.inversePrimary.hashCode() + b.b(this.inverseSurface, b.b(this.inverseOnSurface, b.b(this.outline, b.b(this.onSurfaceVariant, b.b(this.surfaceVariant, b.b(this.onSurface, b.b(this.surface, b.b(this.onBackground, b.b(this.background, b.b(this.onErrorContainer, b.b(this.onError, b.b(this.errorContainer, b.b(this.error, b.b(this.onTertiaryContainer, b.b(this.tertiaryContainer, b.b(this.onTertiary, b.b(this.tertiary, b.b(this.onSecondaryContainer, b.b(this.secondaryContainer, b.b(this.onSecondary, b.b(this.secondary, b.b(this.onPrimaryContainer, b.b(this.primaryContainer, b.b(this.onPrimary, this.primary.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        return "ColorProviders(primary=" + this.primary + ", onPrimary=" + this.onPrimary + ", primaryContainer=" + this.primaryContainer + ", onPrimaryContainer=" + this.onPrimaryContainer + ", secondary=" + this.secondary + ", onSecondary=" + this.onSecondary + ", secondaryContainer=" + this.secondaryContainer + ", onSecondaryContainer=" + this.onSecondaryContainer + ", tertiary=" + this.tertiary + ", onTertiary=" + this.onTertiary + ", tertiaryContainer=" + this.tertiaryContainer + ", onTertiaryContainer=" + this.onTertiaryContainer + ", error=" + this.error + ", errorContainer=" + this.errorContainer + ", onError=" + this.onError + ", onErrorContainer=" + this.onErrorContainer + ", background=" + this.background + ", onBackground=" + this.onBackground + ", surface=" + this.surface + ", onSurface=" + this.onSurface + ", surfaceVariant=" + this.surfaceVariant + ", onSurfaceVariant=" + this.onSurfaceVariant + ", outline=" + this.outline + ", inverseOnSurface=" + this.inverseOnSurface + ", inverseSurface=" + this.inverseSurface + ", inversePrimary=" + this.inversePrimary + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private ColorProviders(ColorProvider colorProvider, ColorProvider colorProvider2, ColorProvider colorProvider3, ColorProvider colorProvider4, ColorProvider colorProvider5, ColorProvider colorProvider6, ColorProvider colorProvider7, ColorProvider colorProvider8, ColorProvider colorProvider9, ColorProvider colorProvider10, ColorProvider colorProvider11, ColorProvider colorProvider12, ColorProvider colorProvider13, ColorProvider colorProvider14, ColorProvider colorProvider15, ColorProvider colorProvider16, ColorProvider colorProvider17, ColorProvider colorProvider18, ColorProvider colorProvider19, ColorProvider colorProvider20, ColorProvider colorProvider21, ColorProvider colorProvider22, ColorProvider colorProvider23, ColorProvider colorProvider24, ColorProvider colorProvider25, ColorProvider colorProvider26) {
        this.primary = colorProvider;
        this.onPrimary = colorProvider2;
        this.primaryContainer = colorProvider3;
        this.onPrimaryContainer = colorProvider4;
        this.secondary = colorProvider5;
        this.onSecondary = colorProvider6;
        this.secondaryContainer = colorProvider7;
        this.onSecondaryContainer = colorProvider8;
        this.tertiary = colorProvider9;
        this.onTertiary = colorProvider10;
        this.tertiaryContainer = colorProvider11;
        this.onTertiaryContainer = colorProvider12;
        this.error = colorProvider13;
        this.errorContainer = colorProvider14;
        this.onError = colorProvider15;
        this.onErrorContainer = colorProvider16;
        this.background = colorProvider17;
        this.onBackground = colorProvider18;
        this.surface = colorProvider19;
        this.onSurface = colorProvider20;
        this.surfaceVariant = colorProvider21;
        this.onSurfaceVariant = colorProvider22;
        this.outline = colorProvider23;
        this.inverseOnSurface = colorProvider24;
        this.inverseSurface = colorProvider25;
        this.inversePrimary = colorProvider26;
    }
}
