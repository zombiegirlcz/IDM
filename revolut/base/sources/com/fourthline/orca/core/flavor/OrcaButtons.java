package com.fourthline.orca.core.flavor;

import com.fourthline.orca.core.flavor.OrcaColors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001:\u0002@AB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016JV\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u000f\"\u0004\b(\u0010)R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010)R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010&\u001a\u0004\b.\u0010\u000f\"\u0004\b/\u0010)R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010&\u001a\u0004\b1\u0010\u000f\"\u0004\b2\u0010)R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0014\"\u0004\b6\u00107R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u0016\"\u0004\b;\u0010<R\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00109\u001a\u0004\b>\u0010\u0016\"\u0004\b?\u0010<¨\u0006B"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaButtons;", "Lcom/fourthline/orca/core/flavor/OrcaElement;", "Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaButton;", "primary", "secondary", "scannerPrimary", "scannerSecondary", "Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaCheckbox;", "checkbox", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "backButtonColor", "linkButtonColor", "<init>", "(Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaButton;Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaButton;Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaButton;Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaButton;Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaCheckbox;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)V", "component1", "()Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaButton;", "component2", "component3", "component4", "component5", "()Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaCheckbox;", "component6", "()Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "component7", "copy", "(Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaButton;Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaButton;Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaButton;Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaButton;Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaCheckbox;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)Lcom/fourthline/orca/core/flavor/OrcaButtons;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaButton;", "getPrimary", "setPrimary", "(Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaButton;)V", "b", "getSecondary", "setSecondary", "c", "getScannerPrimary", "setScannerPrimary", "d", "getScannerSecondary", "setScannerSecondary", "e", "Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaCheckbox;", "getCheckbox", "setCheckbox", "(Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaCheckbox;)V", "f", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "getBackButtonColor", "setBackButtonColor", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)V", "g", "getLinkButtonColor", "setLinkButtonColor", "OrcaButton", "OrcaCheckbox", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrcaButtons implements OrcaElement {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private OrcaButton primary;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private OrcaButton secondary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private OrcaButton scannerPrimary;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private OrcaButton scannerSecondary;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private OrcaCheckbox checkbox;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private OrcaColors.OrcaColor backButtonColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private OrcaColors.OrcaColor linkButtonColor;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\t\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u001dR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u001d¨\u0006$"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaButton;", "Lcom/fourthline/orca/core/flavor/OrcaElement;", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "textColor", "backgroundColor", "borderColor", "<init>", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)V", "component1", "()Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "component2", "component3", "copy", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaButton;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "getTextColor", "setTextColor", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)V", "b", "getBackgroundColor", "setBackgroundColor", "c", "getBorderColor", "setBorderColor", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrcaButton implements OrcaElement {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private OrcaColors.OrcaColor textColor;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private OrcaColors.OrcaColor backgroundColor;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private OrcaColors.OrcaColor borderColor;

        public OrcaButton(@NotNull OrcaColors.OrcaColor textColor, @NotNull OrcaColors.OrcaColor backgroundColor, @NotNull OrcaColors.OrcaColor borderColor) {
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(borderColor, "borderColor");
            this.textColor = textColor;
            this.backgroundColor = backgroundColor;
            this.borderColor = borderColor;
        }

        public static /* synthetic */ OrcaButton copy$default(OrcaButton orcaButton, OrcaColors.OrcaColor orcaColor, OrcaColors.OrcaColor orcaColor2, OrcaColors.OrcaColor orcaColor3, int i, Object obj2) {
            if ((i & 1) != 0) {
                orcaColor = orcaButton.textColor;
            }
            if ((i & 2) != 0) {
                orcaColor2 = orcaButton.backgroundColor;
            }
            if ((i & 4) != 0) {
                orcaColor3 = orcaButton.borderColor;
            }
            return orcaButton.copy(orcaColor, orcaColor2, orcaColor3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final OrcaColors.OrcaColor getTextColor() {
            return this.textColor;
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
        public final OrcaButton copy(@NotNull OrcaColors.OrcaColor textColor, @NotNull OrcaColors.OrcaColor backgroundColor, @NotNull OrcaColors.OrcaColor borderColor) {
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(borderColor, "borderColor");
            return new OrcaButton(textColor, backgroundColor, borderColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrcaButton)) {
                return false;
            }
            OrcaButton orcaButton = (OrcaButton) other;
            return Intrinsics.f(this.textColor, orcaButton.textColor) && Intrinsics.f(this.backgroundColor, orcaButton.backgroundColor) && Intrinsics.f(this.borderColor, orcaButton.borderColor);
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
        public final OrcaColors.OrcaColor getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            return (((this.textColor.hashCode() * 31) + this.backgroundColor.hashCode()) * 31) + this.borderColor.hashCode();
        }

        public final void setBackgroundColor(@NotNull OrcaColors.OrcaColor orcaColor) {
            Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
            this.backgroundColor = orcaColor;
        }

        public final void setBorderColor(@NotNull OrcaColors.OrcaColor orcaColor) {
            Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
            this.borderColor = orcaColor;
        }

        public final void setTextColor(@NotNull OrcaColors.OrcaColor orcaColor) {
            Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
            this.textColor = orcaColor;
        }

        @NotNull
        public String toString() {
            return "OrcaButton(textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", borderColor=" + this.borderColor + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaCheckbox;", "Lcom/fourthline/orca/core/flavor/OrcaElement;", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "tintColor", "iconColor", "<init>", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)V", "component1", "()Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "component2", "copy", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaCheckbox;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "getTintColor", "setTintColor", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)V", "b", "getIconColor", "setIconColor", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrcaCheckbox implements OrcaElement {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private OrcaColors.OrcaColor tintColor;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private OrcaColors.OrcaColor iconColor;

        public OrcaCheckbox(@NotNull OrcaColors.OrcaColor tintColor, @NotNull OrcaColors.OrcaColor iconColor) {
            Intrinsics.checkNotNullParameter(tintColor, "tintColor");
            Intrinsics.checkNotNullParameter(iconColor, "iconColor");
            this.tintColor = tintColor;
            this.iconColor = iconColor;
        }

        public static /* synthetic */ OrcaCheckbox copy$default(OrcaCheckbox orcaCheckbox, OrcaColors.OrcaColor orcaColor, OrcaColors.OrcaColor orcaColor2, int i, Object obj2) {
            if ((i & 1) != 0) {
                orcaColor = orcaCheckbox.tintColor;
            }
            if ((i & 2) != 0) {
                orcaColor2 = orcaCheckbox.iconColor;
            }
            return orcaCheckbox.copy(orcaColor, orcaColor2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final OrcaColors.OrcaColor getTintColor() {
            return this.tintColor;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final OrcaColors.OrcaColor getIconColor() {
            return this.iconColor;
        }

        @NotNull
        public final OrcaCheckbox copy(@NotNull OrcaColors.OrcaColor tintColor, @NotNull OrcaColors.OrcaColor iconColor) {
            Intrinsics.checkNotNullParameter(tintColor, "tintColor");
            Intrinsics.checkNotNullParameter(iconColor, "iconColor");
            return new OrcaCheckbox(tintColor, iconColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrcaCheckbox)) {
                return false;
            }
            OrcaCheckbox orcaCheckbox = (OrcaCheckbox) other;
            return Intrinsics.f(this.tintColor, orcaCheckbox.tintColor) && Intrinsics.f(this.iconColor, orcaCheckbox.iconColor);
        }

        @NotNull
        public final OrcaColors.OrcaColor getIconColor() {
            return this.iconColor;
        }

        @NotNull
        public final OrcaColors.OrcaColor getTintColor() {
            return this.tintColor;
        }

        public int hashCode() {
            return (this.tintColor.hashCode() * 31) + this.iconColor.hashCode();
        }

        public final void setIconColor(@NotNull OrcaColors.OrcaColor orcaColor) {
            Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
            this.iconColor = orcaColor;
        }

        public final void setTintColor(@NotNull OrcaColors.OrcaColor orcaColor) {
            Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
            this.tintColor = orcaColor;
        }

        @NotNull
        public String toString() {
            return "OrcaCheckbox(tintColor=" + this.tintColor + ", iconColor=" + this.iconColor + ")";
        }
    }

    public OrcaButtons(@NotNull OrcaButton primary, @NotNull OrcaButton secondary, @NotNull OrcaButton scannerPrimary, @NotNull OrcaButton scannerSecondary, @NotNull OrcaCheckbox checkbox, @NotNull OrcaColors.OrcaColor backButtonColor, @NotNull OrcaColors.OrcaColor linkButtonColor) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(secondary, "secondary");
        Intrinsics.checkNotNullParameter(scannerPrimary, "scannerPrimary");
        Intrinsics.checkNotNullParameter(scannerSecondary, "scannerSecondary");
        Intrinsics.checkNotNullParameter(checkbox, "checkbox");
        Intrinsics.checkNotNullParameter(backButtonColor, "backButtonColor");
        Intrinsics.checkNotNullParameter(linkButtonColor, "linkButtonColor");
        this.primary = primary;
        this.secondary = secondary;
        this.scannerPrimary = scannerPrimary;
        this.scannerSecondary = scannerSecondary;
        this.checkbox = checkbox;
        this.backButtonColor = backButtonColor;
        this.linkButtonColor = linkButtonColor;
    }

    public static /* synthetic */ OrcaButtons copy$default(OrcaButtons orcaButtons, OrcaButton orcaButton, OrcaButton orcaButton2, OrcaButton orcaButton3, OrcaButton orcaButton4, OrcaCheckbox orcaCheckbox, OrcaColors.OrcaColor orcaColor, OrcaColors.OrcaColor orcaColor2, int i, Object obj2) {
        if ((i & 1) != 0) {
            orcaButton = orcaButtons.primary;
        }
        if ((i & 2) != 0) {
            orcaButton2 = orcaButtons.secondary;
        }
        if ((i & 4) != 0) {
            orcaButton3 = orcaButtons.scannerPrimary;
        }
        if ((i & 8) != 0) {
            orcaButton4 = orcaButtons.scannerSecondary;
        }
        if ((i & 16) != 0) {
            orcaCheckbox = orcaButtons.checkbox;
        }
        if ((i & 32) != 0) {
            orcaColor = orcaButtons.backButtonColor;
        }
        if ((i & 64) != 0) {
            orcaColor2 = orcaButtons.linkButtonColor;
        }
        OrcaColors.OrcaColor orcaColor3 = orcaColor;
        OrcaColors.OrcaColor orcaColor4 = orcaColor2;
        OrcaCheckbox orcaCheckbox2 = orcaCheckbox;
        OrcaButton orcaButton5 = orcaButton3;
        return orcaButtons.copy(orcaButton, orcaButton2, orcaButton5, orcaButton4, orcaCheckbox2, orcaColor3, orcaColor4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrcaButton getPrimary() {
        return this.primary;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrcaButton getSecondary() {
        return this.secondary;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OrcaButton getScannerPrimary() {
        return this.scannerPrimary;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OrcaButton getScannerSecondary() {
        return this.scannerSecondary;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OrcaCheckbox getCheckbox() {
        return this.checkbox;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OrcaColors.OrcaColor getBackButtonColor() {
        return this.backButtonColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final OrcaColors.OrcaColor getLinkButtonColor() {
        return this.linkButtonColor;
    }

    @NotNull
    public final OrcaButtons copy(@NotNull OrcaButton primary, @NotNull OrcaButton secondary, @NotNull OrcaButton scannerPrimary, @NotNull OrcaButton scannerSecondary, @NotNull OrcaCheckbox checkbox, @NotNull OrcaColors.OrcaColor backButtonColor, @NotNull OrcaColors.OrcaColor linkButtonColor) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(secondary, "secondary");
        Intrinsics.checkNotNullParameter(scannerPrimary, "scannerPrimary");
        Intrinsics.checkNotNullParameter(scannerSecondary, "scannerSecondary");
        Intrinsics.checkNotNullParameter(checkbox, "checkbox");
        Intrinsics.checkNotNullParameter(backButtonColor, "backButtonColor");
        Intrinsics.checkNotNullParameter(linkButtonColor, "linkButtonColor");
        return new OrcaButtons(primary, secondary, scannerPrimary, scannerSecondary, checkbox, backButtonColor, linkButtonColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaButtons)) {
            return false;
        }
        OrcaButtons orcaButtons = (OrcaButtons) other;
        return Intrinsics.f(this.primary, orcaButtons.primary) && Intrinsics.f(this.secondary, orcaButtons.secondary) && Intrinsics.f(this.scannerPrimary, orcaButtons.scannerPrimary) && Intrinsics.f(this.scannerSecondary, orcaButtons.scannerSecondary) && Intrinsics.f(this.checkbox, orcaButtons.checkbox) && Intrinsics.f(this.backButtonColor, orcaButtons.backButtonColor) && Intrinsics.f(this.linkButtonColor, orcaButtons.linkButtonColor);
    }

    @NotNull
    public final OrcaColors.OrcaColor getBackButtonColor() {
        return this.backButtonColor;
    }

    @NotNull
    public final OrcaCheckbox getCheckbox() {
        return this.checkbox;
    }

    @NotNull
    public final OrcaColors.OrcaColor getLinkButtonColor() {
        return this.linkButtonColor;
    }

    @NotNull
    public final OrcaButton getPrimary() {
        return this.primary;
    }

    @NotNull
    public final OrcaButton getScannerPrimary() {
        return this.scannerPrimary;
    }

    @NotNull
    public final OrcaButton getScannerSecondary() {
        return this.scannerSecondary;
    }

    @NotNull
    public final OrcaButton getSecondary() {
        return this.secondary;
    }

    public int hashCode() {
        return (((((((((((this.primary.hashCode() * 31) + this.secondary.hashCode()) * 31) + this.scannerPrimary.hashCode()) * 31) + this.scannerSecondary.hashCode()) * 31) + this.checkbox.hashCode()) * 31) + this.backButtonColor.hashCode()) * 31) + this.linkButtonColor.hashCode();
    }

    public final void setBackButtonColor(@NotNull OrcaColors.OrcaColor orcaColor) {
        Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
        this.backButtonColor = orcaColor;
    }

    public final void setCheckbox(@NotNull OrcaCheckbox orcaCheckbox) {
        Intrinsics.checkNotNullParameter(orcaCheckbox, "<set-?>");
        this.checkbox = orcaCheckbox;
    }

    public final void setLinkButtonColor(@NotNull OrcaColors.OrcaColor orcaColor) {
        Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
        this.linkButtonColor = orcaColor;
    }

    public final void setPrimary(@NotNull OrcaButton orcaButton) {
        Intrinsics.checkNotNullParameter(orcaButton, "<set-?>");
        this.primary = orcaButton;
    }

    public final void setScannerPrimary(@NotNull OrcaButton orcaButton) {
        Intrinsics.checkNotNullParameter(orcaButton, "<set-?>");
        this.scannerPrimary = orcaButton;
    }

    public final void setScannerSecondary(@NotNull OrcaButton orcaButton) {
        Intrinsics.checkNotNullParameter(orcaButton, "<set-?>");
        this.scannerSecondary = orcaButton;
    }

    public final void setSecondary(@NotNull OrcaButton orcaButton) {
        Intrinsics.checkNotNullParameter(orcaButton, "<set-?>");
        this.secondary = orcaButton;
    }

    @NotNull
    public String toString() {
        return "OrcaButtons(primary=" + this.primary + ", secondary=" + this.secondary + ", scannerPrimary=" + this.scannerPrimary + ", scannerSecondary=" + this.scannerSecondary + ", checkbox=" + this.checkbox + ", backButtonColor=" + this.backButtonColor + ", linkButtonColor=" + this.linkButtonColor + ")";
    }
}
