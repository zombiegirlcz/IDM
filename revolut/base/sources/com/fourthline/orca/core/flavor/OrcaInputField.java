package com.fourthline.orca.core.flavor;

import com.fourthline.orca.core.flavor.OrcaColors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010Jt\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010+R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u0010\"\u0004\b.\u0010+R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010(\u001a\u0004\b0\u0010\u0010\"\u0004\b1\u0010+R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010(\u001a\u0004\b3\u0010\u0010\"\u0004\b4\u0010+R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010(\u001a\u0004\b6\u0010\u0010\"\u0004\b7\u0010+R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010(\u001a\u0004\b9\u0010\u0010\"\u0004\b:\u0010+R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010(\u001a\u0004\b<\u0010\u0010\"\u0004\b=\u0010+R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010(\u001a\u0004\b?\u0010\u0010\"\u0004\b@\u0010+R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010(\u001a\u0004\bB\u0010\u0010\"\u0004\bC\u0010+R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010(\u001a\u0004\bE\u0010\u0010\"\u0004\bF\u0010+¨\u0006G"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaInputField;", "Lcom/fourthline/orca/core/flavor/OrcaElement;", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "textColor", "backgroundColor", "borderColor", "disabledTextColor", "disabledBackgroundColor", "disabledBorderColor", "placeholderColor", "titleColor", "statusColor", "errorColor", "<init>", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)V", "component1", "()Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)Lcom/fourthline/orca/core/flavor/OrcaInputField;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "getTextColor", "setTextColor", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)V", "b", "getBackgroundColor", "setBackgroundColor", "c", "getBorderColor", "setBorderColor", "d", "getDisabledTextColor", "setDisabledTextColor", "e", "getDisabledBackgroundColor", "setDisabledBackgroundColor", "f", "getDisabledBorderColor", "setDisabledBorderColor", "g", "getPlaceholderColor", "setPlaceholderColor", "h", "getTitleColor", "setTitleColor", "i", "getStatusColor", "setStatusColor", "j", "getErrorColor", "setErrorColor", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrcaInputField implements OrcaElement {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private OrcaColors.OrcaColor textColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private OrcaColors.OrcaColor backgroundColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private OrcaColors.OrcaColor borderColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private OrcaColors.OrcaColor disabledTextColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private OrcaColors.OrcaColor disabledBackgroundColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private OrcaColors.OrcaColor disabledBorderColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private OrcaColors.OrcaColor placeholderColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private OrcaColors.OrcaColor titleColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private OrcaColors.OrcaColor statusColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private OrcaColors.OrcaColor errorColor;

    public OrcaInputField(@NotNull OrcaColors.OrcaColor textColor, @NotNull OrcaColors.OrcaColor backgroundColor, @NotNull OrcaColors.OrcaColor borderColor, @NotNull OrcaColors.OrcaColor disabledTextColor, @NotNull OrcaColors.OrcaColor disabledBackgroundColor, @NotNull OrcaColors.OrcaColor disabledBorderColor, @NotNull OrcaColors.OrcaColor placeholderColor, @NotNull OrcaColors.OrcaColor titleColor, @NotNull OrcaColors.OrcaColor statusColor, @NotNull OrcaColors.OrcaColor errorColor) {
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        Intrinsics.checkNotNullParameter(disabledTextColor, "disabledTextColor");
        Intrinsics.checkNotNullParameter(disabledBackgroundColor, "disabledBackgroundColor");
        Intrinsics.checkNotNullParameter(disabledBorderColor, "disabledBorderColor");
        Intrinsics.checkNotNullParameter(placeholderColor, "placeholderColor");
        Intrinsics.checkNotNullParameter(titleColor, "titleColor");
        Intrinsics.checkNotNullParameter(statusColor, "statusColor");
        Intrinsics.checkNotNullParameter(errorColor, "errorColor");
        this.textColor = textColor;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
        this.disabledTextColor = disabledTextColor;
        this.disabledBackgroundColor = disabledBackgroundColor;
        this.disabledBorderColor = disabledBorderColor;
        this.placeholderColor = placeholderColor;
        this.titleColor = titleColor;
        this.statusColor = statusColor;
        this.errorColor = errorColor;
    }

    public static /* synthetic */ OrcaInputField copy$default(OrcaInputField orcaInputField, OrcaColors.OrcaColor orcaColor, OrcaColors.OrcaColor orcaColor2, OrcaColors.OrcaColor orcaColor3, OrcaColors.OrcaColor orcaColor4, OrcaColors.OrcaColor orcaColor5, OrcaColors.OrcaColor orcaColor6, OrcaColors.OrcaColor orcaColor7, OrcaColors.OrcaColor orcaColor8, OrcaColors.OrcaColor orcaColor9, OrcaColors.OrcaColor orcaColor10, int i, Object obj2) {
        if ((i & 1) != 0) {
            orcaColor = orcaInputField.textColor;
        }
        if ((i & 2) != 0) {
            orcaColor2 = orcaInputField.backgroundColor;
        }
        if ((i & 4) != 0) {
            orcaColor3 = orcaInputField.borderColor;
        }
        if ((i & 8) != 0) {
            orcaColor4 = orcaInputField.disabledTextColor;
        }
        if ((i & 16) != 0) {
            orcaColor5 = orcaInputField.disabledBackgroundColor;
        }
        if ((i & 32) != 0) {
            orcaColor6 = orcaInputField.disabledBorderColor;
        }
        if ((i & 64) != 0) {
            orcaColor7 = orcaInputField.placeholderColor;
        }
        if ((i & 128) != 0) {
            orcaColor8 = orcaInputField.titleColor;
        }
        if ((i & 256) != 0) {
            orcaColor9 = orcaInputField.statusColor;
        }
        if ((i & 512) != 0) {
            orcaColor10 = orcaInputField.errorColor;
        }
        OrcaColors.OrcaColor orcaColor11 = orcaColor9;
        OrcaColors.OrcaColor orcaColor12 = orcaColor10;
        OrcaColors.OrcaColor orcaColor13 = orcaColor7;
        OrcaColors.OrcaColor orcaColor14 = orcaColor8;
        OrcaColors.OrcaColor orcaColor15 = orcaColor5;
        OrcaColors.OrcaColor orcaColor16 = orcaColor6;
        return orcaInputField.copy(orcaColor, orcaColor2, orcaColor3, orcaColor4, orcaColor15, orcaColor16, orcaColor13, orcaColor14, orcaColor11, orcaColor12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrcaColors.OrcaColor getTextColor() {
        return this.textColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final OrcaColors.OrcaColor getErrorColor() {
        return this.errorColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrcaColors.OrcaColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OrcaColors.OrcaColor getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OrcaColors.OrcaColor getDisabledTextColor() {
        return this.disabledTextColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OrcaColors.OrcaColor getDisabledBackgroundColor() {
        return this.disabledBackgroundColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OrcaColors.OrcaColor getDisabledBorderColor() {
        return this.disabledBorderColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final OrcaColors.OrcaColor getPlaceholderColor() {
        return this.placeholderColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final OrcaColors.OrcaColor getTitleColor() {
        return this.titleColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final OrcaColors.OrcaColor getStatusColor() {
        return this.statusColor;
    }

    @NotNull
    public final OrcaInputField copy(@NotNull OrcaColors.OrcaColor textColor, @NotNull OrcaColors.OrcaColor backgroundColor, @NotNull OrcaColors.OrcaColor borderColor, @NotNull OrcaColors.OrcaColor disabledTextColor, @NotNull OrcaColors.OrcaColor disabledBackgroundColor, @NotNull OrcaColors.OrcaColor disabledBorderColor, @NotNull OrcaColors.OrcaColor placeholderColor, @NotNull OrcaColors.OrcaColor titleColor, @NotNull OrcaColors.OrcaColor statusColor, @NotNull OrcaColors.OrcaColor errorColor) {
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        Intrinsics.checkNotNullParameter(disabledTextColor, "disabledTextColor");
        Intrinsics.checkNotNullParameter(disabledBackgroundColor, "disabledBackgroundColor");
        Intrinsics.checkNotNullParameter(disabledBorderColor, "disabledBorderColor");
        Intrinsics.checkNotNullParameter(placeholderColor, "placeholderColor");
        Intrinsics.checkNotNullParameter(titleColor, "titleColor");
        Intrinsics.checkNotNullParameter(statusColor, "statusColor");
        Intrinsics.checkNotNullParameter(errorColor, "errorColor");
        return new OrcaInputField(textColor, backgroundColor, borderColor, disabledTextColor, disabledBackgroundColor, disabledBorderColor, placeholderColor, titleColor, statusColor, errorColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaInputField)) {
            return false;
        }
        OrcaInputField orcaInputField = (OrcaInputField) other;
        return Intrinsics.f(this.textColor, orcaInputField.textColor) && Intrinsics.f(this.backgroundColor, orcaInputField.backgroundColor) && Intrinsics.f(this.borderColor, orcaInputField.borderColor) && Intrinsics.f(this.disabledTextColor, orcaInputField.disabledTextColor) && Intrinsics.f(this.disabledBackgroundColor, orcaInputField.disabledBackgroundColor) && Intrinsics.f(this.disabledBorderColor, orcaInputField.disabledBorderColor) && Intrinsics.f(this.placeholderColor, orcaInputField.placeholderColor) && Intrinsics.f(this.titleColor, orcaInputField.titleColor) && Intrinsics.f(this.statusColor, orcaInputField.statusColor) && Intrinsics.f(this.errorColor, orcaInputField.errorColor);
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
    public final OrcaColors.OrcaColor getDisabledBackgroundColor() {
        return this.disabledBackgroundColor;
    }

    @NotNull
    public final OrcaColors.OrcaColor getDisabledBorderColor() {
        return this.disabledBorderColor;
    }

    @NotNull
    public final OrcaColors.OrcaColor getDisabledTextColor() {
        return this.disabledTextColor;
    }

    @NotNull
    public final OrcaColors.OrcaColor getErrorColor() {
        return this.errorColor;
    }

    @NotNull
    public final OrcaColors.OrcaColor getPlaceholderColor() {
        return this.placeholderColor;
    }

    @NotNull
    public final OrcaColors.OrcaColor getStatusColor() {
        return this.statusColor;
    }

    @NotNull
    public final OrcaColors.OrcaColor getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final OrcaColors.OrcaColor getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        return (((((((((((((((((this.textColor.hashCode() * 31) + this.backgroundColor.hashCode()) * 31) + this.borderColor.hashCode()) * 31) + this.disabledTextColor.hashCode()) * 31) + this.disabledBackgroundColor.hashCode()) * 31) + this.disabledBorderColor.hashCode()) * 31) + this.placeholderColor.hashCode()) * 31) + this.titleColor.hashCode()) * 31) + this.statusColor.hashCode()) * 31) + this.errorColor.hashCode();
    }

    public final void setBackgroundColor(@NotNull OrcaColors.OrcaColor orcaColor) {
        Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
        this.backgroundColor = orcaColor;
    }

    public final void setBorderColor(@NotNull OrcaColors.OrcaColor orcaColor) {
        Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
        this.borderColor = orcaColor;
    }

    public final void setDisabledBackgroundColor(@NotNull OrcaColors.OrcaColor orcaColor) {
        Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
        this.disabledBackgroundColor = orcaColor;
    }

    public final void setDisabledBorderColor(@NotNull OrcaColors.OrcaColor orcaColor) {
        Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
        this.disabledBorderColor = orcaColor;
    }

    public final void setDisabledTextColor(@NotNull OrcaColors.OrcaColor orcaColor) {
        Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
        this.disabledTextColor = orcaColor;
    }

    public final void setErrorColor(@NotNull OrcaColors.OrcaColor orcaColor) {
        Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
        this.errorColor = orcaColor;
    }

    public final void setPlaceholderColor(@NotNull OrcaColors.OrcaColor orcaColor) {
        Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
        this.placeholderColor = orcaColor;
    }

    public final void setStatusColor(@NotNull OrcaColors.OrcaColor orcaColor) {
        Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
        this.statusColor = orcaColor;
    }

    public final void setTextColor(@NotNull OrcaColors.OrcaColor orcaColor) {
        Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
        this.textColor = orcaColor;
    }

    public final void setTitleColor(@NotNull OrcaColors.OrcaColor orcaColor) {
        Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
        this.titleColor = orcaColor;
    }

    @NotNull
    public String toString() {
        return "OrcaInputField(textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", borderColor=" + this.borderColor + ", disabledTextColor=" + this.disabledTextColor + ", disabledBackgroundColor=" + this.disabledBackgroundColor + ", disabledBorderColor=" + this.disabledBorderColor + ", placeholderColor=" + this.placeholderColor + ", titleColor=" + this.titleColor + ", statusColor=" + this.statusColor + ", errorColor=" + this.errorColor + ")";
    }
}
