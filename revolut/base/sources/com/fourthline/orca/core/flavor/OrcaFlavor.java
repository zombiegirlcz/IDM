package com.fourthline.orca.core.flavor;

import com.fourthline.orca.core.flavor.OrcaColors;
import com.fourthline.orca.core.flavor.OrcaFonts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B;\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0015¨\u00060"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaFlavor;", "", "Lcom/fourthline/orca/core/flavor/OrcaColors;", "colorsLight", "colorsDark", "Lcom/fourthline/orca/core/flavor/OrcaLayouts;", "layouts", "Lcom/fourthline/orca/core/flavor/OrcaFonts;", "fonts", "Lcom/fourthline/orca/core/flavor/OrcaLocalization;", "localization", "<init>", "(Lcom/fourthline/orca/core/flavor/OrcaColors;Lcom/fourthline/orca/core/flavor/OrcaColors;Lcom/fourthline/orca/core/flavor/OrcaLayouts;Lcom/fourthline/orca/core/flavor/OrcaFonts;Lcom/fourthline/orca/core/flavor/OrcaLocalization;)V", "component1", "()Lcom/fourthline/orca/core/flavor/OrcaColors;", "component2", "component3", "()Lcom/fourthline/orca/core/flavor/OrcaLayouts;", "component4", "()Lcom/fourthline/orca/core/flavor/OrcaFonts;", "component5", "()Lcom/fourthline/orca/core/flavor/OrcaLocalization;", "copy", "(Lcom/fourthline/orca/core/flavor/OrcaColors;Lcom/fourthline/orca/core/flavor/OrcaColors;Lcom/fourthline/orca/core/flavor/OrcaLayouts;Lcom/fourthline/orca/core/flavor/OrcaFonts;Lcom/fourthline/orca/core/flavor/OrcaLocalization;)Lcom/fourthline/orca/core/flavor/OrcaFlavor;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/core/flavor/OrcaColors;", "getColorsLight", "b", "getColorsDark", "c", "Lcom/fourthline/orca/core/flavor/OrcaLayouts;", "getLayouts", "d", "Lcom/fourthline/orca/core/flavor/OrcaFonts;", "getFonts", "e", "Lcom/fourthline/orca/core/flavor/OrcaLocalization;", "getLocalization", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrcaFlavor {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OrcaColors colorsLight;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final OrcaColors colorsDark;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final OrcaLayouts layouts;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final OrcaFonts fonts;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final OrcaLocalization localization;

    public OrcaFlavor() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ OrcaFlavor copy$default(OrcaFlavor orcaFlavor, OrcaColors orcaColors, OrcaColors orcaColors2, OrcaLayouts orcaLayouts, OrcaFonts orcaFonts, OrcaLocalization orcaLocalization, int i, Object obj2) {
        if ((i & 1) != 0) {
            orcaColors = orcaFlavor.colorsLight;
        }
        if ((i & 2) != 0) {
            orcaColors2 = orcaFlavor.colorsDark;
        }
        if ((i & 4) != 0) {
            orcaLayouts = orcaFlavor.layouts;
        }
        if ((i & 8) != 0) {
            orcaFonts = orcaFlavor.fonts;
        }
        if ((i & 16) != 0) {
            orcaLocalization = orcaFlavor.localization;
        }
        OrcaLocalization orcaLocalization2 = orcaLocalization;
        OrcaLayouts orcaLayouts2 = orcaLayouts;
        return orcaFlavor.copy(orcaColors, orcaColors2, orcaLayouts2, orcaFonts, orcaLocalization2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrcaColors getColorsLight() {
        return this.colorsLight;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrcaColors getColorsDark() {
        return this.colorsDark;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OrcaLayouts getLayouts() {
        return this.layouts;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OrcaFonts getFonts() {
        return this.fonts;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OrcaLocalization getLocalization() {
        return this.localization;
    }

    @NotNull
    public final OrcaFlavor copy(@NotNull OrcaColors colorsLight, @NotNull OrcaColors colorsDark, @NotNull OrcaLayouts layouts, @NotNull OrcaFonts fonts, @NotNull OrcaLocalization localization) {
        Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
        Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
        Intrinsics.checkNotNullParameter(layouts, "layouts");
        Intrinsics.checkNotNullParameter(fonts, "fonts");
        Intrinsics.checkNotNullParameter(localization, "localization");
        return new OrcaFlavor(colorsLight, colorsDark, layouts, fonts, localization);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaFlavor)) {
            return false;
        }
        OrcaFlavor orcaFlavor = (OrcaFlavor) other;
        return Intrinsics.f(this.colorsLight, orcaFlavor.colorsLight) && Intrinsics.f(this.colorsDark, orcaFlavor.colorsDark) && Intrinsics.f(this.layouts, orcaFlavor.layouts) && Intrinsics.f(this.fonts, orcaFlavor.fonts) && Intrinsics.f(this.localization, orcaFlavor.localization);
    }

    @NotNull
    public final OrcaColors getColorsDark() {
        return this.colorsDark;
    }

    @NotNull
    public final OrcaColors getColorsLight() {
        return this.colorsLight;
    }

    @NotNull
    public final OrcaFonts getFonts() {
        return this.fonts;
    }

    @NotNull
    public final OrcaLayouts getLayouts() {
        return this.layouts;
    }

    @NotNull
    public final OrcaLocalization getLocalization() {
        return this.localization;
    }

    public int hashCode() {
        return (((((((this.colorsLight.hashCode() * 31) + this.colorsDark.hashCode()) * 31) + this.layouts.hashCode()) * 31) + this.fonts.hashCode()) * 31) + this.localization.hashCode();
    }

    @NotNull
    public String toString() {
        return "OrcaFlavor(colorsLight=" + this.colorsLight + ", colorsDark=" + this.colorsDark + ", layouts=" + this.layouts + ", fonts=" + this.fonts + ", localization=" + this.localization + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrcaFlavor(@NotNull OrcaColors colorsLight) {
        this(colorsLight, null, null, null, null, 30, null);
        Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrcaFlavor(@NotNull OrcaColors colorsLight, @NotNull OrcaColors colorsDark) {
        this(colorsLight, colorsDark, null, null, null, 28, null);
        Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
        Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrcaFlavor(@NotNull OrcaColors colorsLight, @NotNull OrcaColors colorsDark, @NotNull OrcaLayouts layouts) {
        this(colorsLight, colorsDark, layouts, null, null, 24, null);
        Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
        Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
        Intrinsics.checkNotNullParameter(layouts, "layouts");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrcaFlavor(@NotNull OrcaColors colorsLight, @NotNull OrcaColors colorsDark, @NotNull OrcaLayouts layouts, @NotNull OrcaFonts fonts) {
        this(colorsLight, colorsDark, layouts, fonts, null, 16, null);
        Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
        Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
        Intrinsics.checkNotNullParameter(layouts, "layouts");
        Intrinsics.checkNotNullParameter(fonts, "fonts");
    }

    public OrcaFlavor(@NotNull OrcaColors colorsLight, @NotNull OrcaColors colorsDark, @NotNull OrcaLayouts layouts, @NotNull OrcaFonts fonts, @NotNull OrcaLocalization localization) {
        Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
        Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
        Intrinsics.checkNotNullParameter(layouts, "layouts");
        Intrinsics.checkNotNullParameter(fonts, "fonts");
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.colorsLight = colorsLight;
        this.colorsDark = colorsDark;
        this.layouts = layouts;
        this.fonts = fonts;
        this.localization = localization;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OrcaFlavor(OrcaColors orcaColors, OrcaColors orcaColors2, OrcaLayouts orcaLayouts, OrcaFonts orcaFonts, OrcaLocalization orcaLocalization, int i, DefaultConstructorMarker defaultConstructorMarker) {
        OrcaColors orcaColors3;
        OrcaFonts orcaFonts2;
        OrcaColors orcaColorsDefaultLightColors$default = (i & 1) != 0 ? OrcaColors.Companion.defaultLightColors$default(OrcaColors.INSTANCE, null, 1, null) : orcaColors;
        OrcaColors orcaColorsDefaultDarkColors$default = (i & 2) != 0 ? OrcaColors.Companion.defaultDarkColors$default(OrcaColors.INSTANCE, null, 1, null) : orcaColors2;
        OrcaLayouts orcaLayouts2 = (i & 4) != 0 ? new OrcaLayouts(0, 1, null) : orcaLayouts;
        if ((i & 8) != 0) {
            try {
                orcaFonts2 = new OrcaFonts(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
                orcaColors3 = orcaColorsDefaultLightColors$default;
            } catch (Throwable unused) {
                orcaColors3 = orcaColorsDefaultLightColors$default;
                orcaFonts2 = new OrcaFonts(new OrcaFonts.SystemFont(24), new OrcaFonts.SystemFont(18), new OrcaFonts.SystemFont(16), new OrcaFonts.SystemFont(24), new OrcaFonts.SystemFont(16), new OrcaFonts.SystemFont(18), new OrcaFonts.SystemFont(18), new OrcaFonts.SystemFont(18), new OrcaFonts.SystemFont(18), new OrcaFonts.SystemFont(18), new OrcaFonts.SystemFont(14), new OrcaFonts.SystemFont(12), new OrcaFonts.SystemFont(18), new OrcaFonts.SystemFont(20), new OrcaFonts.SystemFont(16), new OrcaFonts.SystemFont(18), new OrcaFonts.SystemFont(14), new OrcaFonts.SystemFont(14), new OrcaFonts.SystemFont(14));
            }
        } else {
            orcaColors3 = orcaColorsDefaultLightColors$default;
            orcaFonts2 = orcaFonts;
        }
        this(orcaColors3, orcaColorsDefaultDarkColors$default, orcaLayouts2, orcaFonts2, (i & 16) != 0 ? new OrcaLocalization(null, null, 3, null) : orcaLocalization);
    }
}
