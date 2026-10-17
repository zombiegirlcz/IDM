package com.fourthline.orca.core.flavor;

import com.fourthline.orca.core.flavor.OrcaColors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010!R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u000b\"\u0004\b$\u0010!R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010\u000b\"\u0004\b'\u0010!R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010\u000b\"\u0004\b*\u0010!R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001e\u001a\u0004\b,\u0010\u000b\"\u0004\b-\u0010!¨\u0006."}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaCell;", "Lcom/fourthline/orca/core/flavor/OrcaElement;", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "backgroundColor", "textColor", "iconColor", "borderColor", "dividerColor", "<init>", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)V", "component1", "()Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "component2", "component3", "component4", "component5", "copy", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)Lcom/fourthline/orca/core/flavor/OrcaCell;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "getBackgroundColor", "setBackgroundColor", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)V", "b", "getTextColor", "setTextColor", "c", "getIconColor", "setIconColor", "d", "getBorderColor", "setBorderColor", "e", "getDividerColor", "setDividerColor", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrcaCell implements OrcaElement {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private OrcaColors.OrcaColor backgroundColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private OrcaColors.OrcaColor textColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private OrcaColors.OrcaColor iconColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private OrcaColors.OrcaColor borderColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private OrcaColors.OrcaColor dividerColor;

    public OrcaCell(@NotNull OrcaColors.OrcaColor backgroundColor, @NotNull OrcaColors.OrcaColor textColor, @NotNull OrcaColors.OrcaColor iconColor, @NotNull OrcaColors.OrcaColor borderColor, @NotNull OrcaColors.OrcaColor dividerColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        Intrinsics.checkNotNullParameter(dividerColor, "dividerColor");
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
        this.iconColor = iconColor;
        this.borderColor = borderColor;
        this.dividerColor = dividerColor;
    }

    public static /* synthetic */ OrcaCell copy$default(OrcaCell orcaCell, OrcaColors.OrcaColor orcaColor, OrcaColors.OrcaColor orcaColor2, OrcaColors.OrcaColor orcaColor3, OrcaColors.OrcaColor orcaColor4, OrcaColors.OrcaColor orcaColor5, int i, Object obj2) {
        if ((i & 1) != 0) {
            orcaColor = orcaCell.backgroundColor;
        }
        if ((i & 2) != 0) {
            orcaColor2 = orcaCell.textColor;
        }
        if ((i & 4) != 0) {
            orcaColor3 = orcaCell.iconColor;
        }
        if ((i & 8) != 0) {
            orcaColor4 = orcaCell.borderColor;
        }
        if ((i & 16) != 0) {
            orcaColor5 = orcaCell.dividerColor;
        }
        OrcaColors.OrcaColor orcaColor6 = orcaColor5;
        OrcaColors.OrcaColor orcaColor7 = orcaColor3;
        return orcaCell.copy(orcaColor, orcaColor2, orcaColor7, orcaColor4, orcaColor6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrcaColors.OrcaColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrcaColors.OrcaColor getTextColor() {
        return this.textColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OrcaColors.OrcaColor getIconColor() {
        return this.iconColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OrcaColors.OrcaColor getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OrcaColors.OrcaColor getDividerColor() {
        return this.dividerColor;
    }

    @NotNull
    public final OrcaCell copy(@NotNull OrcaColors.OrcaColor backgroundColor, @NotNull OrcaColors.OrcaColor textColor, @NotNull OrcaColors.OrcaColor iconColor, @NotNull OrcaColors.OrcaColor borderColor, @NotNull OrcaColors.OrcaColor dividerColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        Intrinsics.checkNotNullParameter(dividerColor, "dividerColor");
        return new OrcaCell(backgroundColor, textColor, iconColor, borderColor, dividerColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaCell)) {
            return false;
        }
        OrcaCell orcaCell = (OrcaCell) other;
        return Intrinsics.f(this.backgroundColor, orcaCell.backgroundColor) && Intrinsics.f(this.textColor, orcaCell.textColor) && Intrinsics.f(this.iconColor, orcaCell.iconColor) && Intrinsics.f(this.borderColor, orcaCell.borderColor) && Intrinsics.f(this.dividerColor, orcaCell.dividerColor);
    }

    @NotNull
    public final OrcaColors.OrcaColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final OrcaColors.OrcaColor getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final OrcaColors.OrcaColor getDividerColor() {
        return this.dividerColor;
    }

    @NotNull
    public final OrcaColors.OrcaColor getIconColor() {
        return this.iconColor;
    }

    @NotNull
    public final OrcaColors.OrcaColor getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return (((((((this.backgroundColor.hashCode() * 31) + this.textColor.hashCode()) * 31) + this.iconColor.hashCode()) * 31) + this.borderColor.hashCode()) * 31) + this.dividerColor.hashCode();
    }

    public final void setBackgroundColor(@NotNull OrcaColors.OrcaColor orcaColor) {
        Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
        this.backgroundColor = orcaColor;
    }

    public final void setBorderColor(@NotNull OrcaColors.OrcaColor orcaColor) {
        Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
        this.borderColor = orcaColor;
    }

    public final void setDividerColor(@NotNull OrcaColors.OrcaColor orcaColor) {
        Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
        this.dividerColor = orcaColor;
    }

    public final void setIconColor(@NotNull OrcaColors.OrcaColor orcaColor) {
        Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
        this.iconColor = orcaColor;
    }

    public final void setTextColor(@NotNull OrcaColors.OrcaColor orcaColor) {
        Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
        this.textColor = orcaColor;
    }

    @NotNull
    public String toString() {
        return "OrcaCell(backgroundColor=" + this.backgroundColor + ", textColor=" + this.textColor + ", iconColor=" + this.iconColor + ", borderColor=" + this.borderColor + ", dividerColor=" + this.dividerColor + ")";
    }
}
