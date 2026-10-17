package com.fourthline.orca.core.flavor;

import com.fourthline.orca.core.flavor.OrcaColors;
import com.fourthline.orca.internal.h30;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012Jj\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0003\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b1\u0010\u0012R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010(\u001a\u0004\b5\u0010\u0012R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u0010\u0012R\u001a\u0010=\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaPalette;", "", "", "isLight", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "primary", "accent", "dark", "darkLight", "darkLighter", "darkSoft", "light", "gray", "<init>", "(ZLcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)V", "component1", "()Z", "component2", "()Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)Lcom/fourthline/orca/core/flavor/OrcaPalette;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "getPrimary", "c", "getAccent", "d", "getDark", "e", "getDarkLight", "f", "getDarkLighter", "g", "getDarkSoft", "h", "getLight", "i", "getGray", "Lcom/fourthline/orca/internal/h30;", "j", "Lcom/fourthline/orca/internal/h30;", "getInternalPalette$fourthline_sdk_release", "()Lcom/fourthline/orca/internal/h30;", "internalPalette", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrcaPalette {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isLight;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final OrcaColors.OrcaColor primary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final OrcaColors.OrcaColor accent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final OrcaColors.OrcaColor dark;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final OrcaColors.OrcaColor darkLight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final OrcaColors.OrcaColor darkLighter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final OrcaColors.OrcaColor darkSoft;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final OrcaColors.OrcaColor light;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final OrcaColors.OrcaColor gray;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final h30 internalPalette;

    public OrcaPalette() {
        this(false, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ OrcaPalette copy$default(OrcaPalette orcaPalette, boolean z, OrcaColors.OrcaColor orcaColor, OrcaColors.OrcaColor orcaColor2, OrcaColors.OrcaColor orcaColor3, OrcaColors.OrcaColor orcaColor4, OrcaColors.OrcaColor orcaColor5, OrcaColors.OrcaColor orcaColor6, OrcaColors.OrcaColor orcaColor7, OrcaColors.OrcaColor orcaColor8, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = orcaPalette.isLight;
        }
        if ((i & 2) != 0) {
            orcaColor = orcaPalette.primary;
        }
        if ((i & 4) != 0) {
            orcaColor2 = orcaPalette.accent;
        }
        if ((i & 8) != 0) {
            orcaColor3 = orcaPalette.dark;
        }
        if ((i & 16) != 0) {
            orcaColor4 = orcaPalette.darkLight;
        }
        if ((i & 32) != 0) {
            orcaColor5 = orcaPalette.darkLighter;
        }
        if ((i & 64) != 0) {
            orcaColor6 = orcaPalette.darkSoft;
        }
        if ((i & 128) != 0) {
            orcaColor7 = orcaPalette.light;
        }
        if ((i & 256) != 0) {
            orcaColor8 = orcaPalette.gray;
        }
        OrcaColors.OrcaColor orcaColor9 = orcaColor7;
        OrcaColors.OrcaColor orcaColor10 = orcaColor8;
        OrcaColors.OrcaColor orcaColor11 = orcaColor5;
        OrcaColors.OrcaColor orcaColor12 = orcaColor6;
        OrcaColors.OrcaColor orcaColor13 = orcaColor4;
        OrcaColors.OrcaColor orcaColor14 = orcaColor2;
        return orcaPalette.copy(z, orcaColor, orcaColor14, orcaColor3, orcaColor13, orcaColor11, orcaColor12, orcaColor9, orcaColor10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLight() {
        return this.isLight;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrcaColors.OrcaColor getPrimary() {
        return this.primary;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OrcaColors.OrcaColor getAccent() {
        return this.accent;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OrcaColors.OrcaColor getDark() {
        return this.dark;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OrcaColors.OrcaColor getDarkLight() {
        return this.darkLight;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OrcaColors.OrcaColor getDarkLighter() {
        return this.darkLighter;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final OrcaColors.OrcaColor getDarkSoft() {
        return this.darkSoft;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final OrcaColors.OrcaColor getLight() {
        return this.light;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final OrcaColors.OrcaColor getGray() {
        return this.gray;
    }

    @NotNull
    public final OrcaPalette copy(boolean isLight, @NotNull OrcaColors.OrcaColor primary, @NotNull OrcaColors.OrcaColor accent, @NotNull OrcaColors.OrcaColor dark, @NotNull OrcaColors.OrcaColor darkLight, @NotNull OrcaColors.OrcaColor darkLighter, @NotNull OrcaColors.OrcaColor darkSoft, @NotNull OrcaColors.OrcaColor light, @NotNull OrcaColors.OrcaColor gray) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(accent, "accent");
        Intrinsics.checkNotNullParameter(dark, "dark");
        Intrinsics.checkNotNullParameter(darkLight, "darkLight");
        Intrinsics.checkNotNullParameter(darkLighter, "darkLighter");
        Intrinsics.checkNotNullParameter(darkSoft, "darkSoft");
        Intrinsics.checkNotNullParameter(light, "light");
        Intrinsics.checkNotNullParameter(gray, "gray");
        return new OrcaPalette(isLight, primary, accent, dark, darkLight, darkLighter, darkSoft, light, gray);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaPalette)) {
            return false;
        }
        OrcaPalette orcaPalette = (OrcaPalette) other;
        return this.isLight == orcaPalette.isLight && Intrinsics.f(this.primary, orcaPalette.primary) && Intrinsics.f(this.accent, orcaPalette.accent) && Intrinsics.f(this.dark, orcaPalette.dark) && Intrinsics.f(this.darkLight, orcaPalette.darkLight) && Intrinsics.f(this.darkLighter, orcaPalette.darkLighter) && Intrinsics.f(this.darkSoft, orcaPalette.darkSoft) && Intrinsics.f(this.light, orcaPalette.light) && Intrinsics.f(this.gray, orcaPalette.gray);
    }

    @NotNull
    public final OrcaColors.OrcaColor getAccent() {
        return this.accent;
    }

    @NotNull
    public final OrcaColors.OrcaColor getDark() {
        return this.dark;
    }

    @NotNull
    public final OrcaColors.OrcaColor getDarkLight() {
        return this.darkLight;
    }

    @NotNull
    public final OrcaColors.OrcaColor getDarkLighter() {
        return this.darkLighter;
    }

    @NotNull
    public final OrcaColors.OrcaColor getDarkSoft() {
        return this.darkSoft;
    }

    @NotNull
    public final OrcaColors.OrcaColor getGray() {
        return this.gray;
    }

    @NotNull
    /* JADX INFO: renamed from: getInternalPalette$fourthline_sdk_release, reason: from getter */
    public final h30 getInternalPalette() {
        return this.internalPalette;
    }

    @NotNull
    public final OrcaColors.OrcaColor getLight() {
        return this.light;
    }

    @NotNull
    public final OrcaColors.OrcaColor getPrimary() {
        return this.primary;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isLight) * 31) + this.primary.hashCode()) * 31) + this.accent.hashCode()) * 31) + this.dark.hashCode()) * 31) + this.darkLight.hashCode()) * 31) + this.darkLighter.hashCode()) * 31) + this.darkSoft.hashCode()) * 31) + this.light.hashCode()) * 31) + this.gray.hashCode();
    }

    public final boolean isLight() {
        return this.isLight;
    }

    @NotNull
    public String toString() {
        return "OrcaPalette(isLight=" + this.isLight + ", primary=" + this.primary + ", accent=" + this.accent + ", dark=" + this.dark + ", darkLight=" + this.darkLight + ", darkLighter=" + this.darkLighter + ", darkSoft=" + this.darkSoft + ", light=" + this.light + ", gray=" + this.gray + ")";
    }

    public OrcaPalette(boolean z, @NotNull OrcaColors.OrcaColor primary, @NotNull OrcaColors.OrcaColor accent, @NotNull OrcaColors.OrcaColor dark, @NotNull OrcaColors.OrcaColor darkLight, @NotNull OrcaColors.OrcaColor darkLighter, @NotNull OrcaColors.OrcaColor darkSoft, @NotNull OrcaColors.OrcaColor light, @NotNull OrcaColors.OrcaColor gray) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(accent, "accent");
        Intrinsics.checkNotNullParameter(dark, "dark");
        Intrinsics.checkNotNullParameter(darkLight, "darkLight");
        Intrinsics.checkNotNullParameter(darkLighter, "darkLighter");
        Intrinsics.checkNotNullParameter(darkSoft, "darkSoft");
        Intrinsics.checkNotNullParameter(light, "light");
        Intrinsics.checkNotNullParameter(gray, "gray");
        this.isLight = z;
        this.primary = primary;
        this.accent = accent;
        this.dark = dark;
        this.darkLight = darkLight;
        this.darkLighter = darkLighter;
        this.darkSoft = darkSoft;
        this.light = light;
        this.gray = gray;
        this.internalPalette = z ? new h30.b(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE, null) : new h30.a(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OrcaPalette(boolean z, OrcaColors.OrcaColor orcaColor, OrcaColors.OrcaColor orcaColor2, OrcaColors.OrcaColor orcaColor3, OrcaColors.OrcaColor orcaColor4, OrcaColors.OrcaColor orcaColor5, OrcaColors.OrcaColor orcaColor6, OrcaColors.OrcaColor orcaColor7, OrcaColors.OrcaColor orcaColor8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        z = (i & 1) != 0 ? true : z;
        orcaColor = (i & 2) != 0 ? z ? new OrcaColors.OrcaColor.FromInt(5068267) : new OrcaColors.OrcaColor.FromInt(12106743) : orcaColor;
        if ((i & 4) != 0) {
            orcaColor2 = z ? new OrcaColors.OrcaColor.FromInt(57442) : new OrcaColors.OrcaColor.FromInt(57442);
        }
        this(z, orcaColor, orcaColor2, (i & 8) != 0 ? z ? new OrcaColors.OrcaColor.FromInt(3355443) : new OrcaColors.OrcaColor.FromInt(16777215) : orcaColor3, (i & 16) != 0 ? z ? new OrcaColors.OrcaColor.FromInt(5789784) : new OrcaColors.OrcaColor.FromInt(12832216) : orcaColor4, (i & 32) != 0 ? z ? new OrcaColors.OrcaColor.FromInt(5789784) : new OrcaColors.OrcaColor.FromInt(12832216) : orcaColor5, (i & 64) != 0 ? z ? new OrcaColors.OrcaColor.FromInt(14079702) : new OrcaColors.OrcaColor.FromInt(2503748) : orcaColor6, (i & 128) != 0 ? z ? new OrcaColors.OrcaColor.FromInt(16777215) : new OrcaColors.OrcaColor.FromInt(1517111) : orcaColor7, (i & 256) != 0 ? z ? new OrcaColors.OrcaColor.FromInt(11776947) : new OrcaColors.OrcaColor.FromInt(6323091) : orcaColor8);
    }
}
