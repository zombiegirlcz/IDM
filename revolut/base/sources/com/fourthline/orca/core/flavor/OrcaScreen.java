package com.fourthline.orca.core.flavor;

import com.fourthline.orca.core.flavor.OrcaColors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JL\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010%R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010%R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010\r\"\u0004\b+\u0010%R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010\r\"\u0004\b.\u0010%R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\"\u001a\u0004\b0\u0010\r\"\u0004\b1\u0010%R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0013\"\u0004\b5\u00106¨\u00067"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaScreen;", "Lcom/fourthline/orca/core/flavor/OrcaElement;", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "backgroundColor", "headerColor", "titleColor", "messageColor", "dividerColor", "Lcom/fourthline/orca/core/flavor/OrcaCells;", "tableCells", "<init>", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaCells;)V", "component1", "()Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "component2", "component3", "component4", "component5", "component6", "()Lcom/fourthline/orca/core/flavor/OrcaCells;", "copy", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaCells;)Lcom/fourthline/orca/core/flavor/OrcaScreen;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "getBackgroundColor", "setBackgroundColor", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)V", "b", "getHeaderColor", "setHeaderColor", "c", "getTitleColor", "setTitleColor", "d", "getMessageColor", "setMessageColor", "e", "getDividerColor", "setDividerColor", "f", "Lcom/fourthline/orca/core/flavor/OrcaCells;", "getTableCells", "setTableCells", "(Lcom/fourthline/orca/core/flavor/OrcaCells;)V", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrcaScreen implements OrcaElement {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private OrcaColors.OrcaColor backgroundColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private OrcaColors.OrcaColor headerColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private OrcaColors.OrcaColor titleColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private OrcaColors.OrcaColor messageColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private OrcaColors.OrcaColor dividerColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private OrcaCells tableCells;

    public OrcaScreen(@NotNull OrcaColors.OrcaColor backgroundColor, @NotNull OrcaColors.OrcaColor headerColor, @NotNull OrcaColors.OrcaColor titleColor, @NotNull OrcaColors.OrcaColor messageColor, @NotNull OrcaColors.OrcaColor dividerColor, @NotNull OrcaCells tableCells) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(headerColor, "headerColor");
        Intrinsics.checkNotNullParameter(titleColor, "titleColor");
        Intrinsics.checkNotNullParameter(messageColor, "messageColor");
        Intrinsics.checkNotNullParameter(dividerColor, "dividerColor");
        Intrinsics.checkNotNullParameter(tableCells, "tableCells");
        this.backgroundColor = backgroundColor;
        this.headerColor = headerColor;
        this.titleColor = titleColor;
        this.messageColor = messageColor;
        this.dividerColor = dividerColor;
        this.tableCells = tableCells;
    }

    public static /* synthetic */ OrcaScreen copy$default(OrcaScreen orcaScreen, OrcaColors.OrcaColor orcaColor, OrcaColors.OrcaColor orcaColor2, OrcaColors.OrcaColor orcaColor3, OrcaColors.OrcaColor orcaColor4, OrcaColors.OrcaColor orcaColor5, OrcaCells orcaCells, int i, Object obj2) {
        if ((i & 1) != 0) {
            orcaColor = orcaScreen.backgroundColor;
        }
        if ((i & 2) != 0) {
            orcaColor2 = orcaScreen.headerColor;
        }
        if ((i & 4) != 0) {
            orcaColor3 = orcaScreen.titleColor;
        }
        if ((i & 8) != 0) {
            orcaColor4 = orcaScreen.messageColor;
        }
        if ((i & 16) != 0) {
            orcaColor5 = orcaScreen.dividerColor;
        }
        if ((i & 32) != 0) {
            orcaCells = orcaScreen.tableCells;
        }
        OrcaColors.OrcaColor orcaColor6 = orcaColor5;
        OrcaCells orcaCells2 = orcaCells;
        return orcaScreen.copy(orcaColor, orcaColor2, orcaColor3, orcaColor4, orcaColor6, orcaCells2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrcaColors.OrcaColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrcaColors.OrcaColor getHeaderColor() {
        return this.headerColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OrcaColors.OrcaColor getTitleColor() {
        return this.titleColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OrcaColors.OrcaColor getMessageColor() {
        return this.messageColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OrcaColors.OrcaColor getDividerColor() {
        return this.dividerColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OrcaCells getTableCells() {
        return this.tableCells;
    }

    @NotNull
    public final OrcaScreen copy(@NotNull OrcaColors.OrcaColor backgroundColor, @NotNull OrcaColors.OrcaColor headerColor, @NotNull OrcaColors.OrcaColor titleColor, @NotNull OrcaColors.OrcaColor messageColor, @NotNull OrcaColors.OrcaColor dividerColor, @NotNull OrcaCells tableCells) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(headerColor, "headerColor");
        Intrinsics.checkNotNullParameter(titleColor, "titleColor");
        Intrinsics.checkNotNullParameter(messageColor, "messageColor");
        Intrinsics.checkNotNullParameter(dividerColor, "dividerColor");
        Intrinsics.checkNotNullParameter(tableCells, "tableCells");
        return new OrcaScreen(backgroundColor, headerColor, titleColor, messageColor, dividerColor, tableCells);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaScreen)) {
            return false;
        }
        OrcaScreen orcaScreen = (OrcaScreen) other;
        return Intrinsics.f(this.backgroundColor, orcaScreen.backgroundColor) && Intrinsics.f(this.headerColor, orcaScreen.headerColor) && Intrinsics.f(this.titleColor, orcaScreen.titleColor) && Intrinsics.f(this.messageColor, orcaScreen.messageColor) && Intrinsics.f(this.dividerColor, orcaScreen.dividerColor) && Intrinsics.f(this.tableCells, orcaScreen.tableCells);
    }

    @NotNull
    public final OrcaColors.OrcaColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final OrcaColors.OrcaColor getDividerColor() {
        return this.dividerColor;
    }

    @NotNull
    public final OrcaColors.OrcaColor getHeaderColor() {
        return this.headerColor;
    }

    @NotNull
    public final OrcaColors.OrcaColor getMessageColor() {
        return this.messageColor;
    }

    @NotNull
    public final OrcaCells getTableCells() {
        return this.tableCells;
    }

    @NotNull
    public final OrcaColors.OrcaColor getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        return (((((((((this.backgroundColor.hashCode() * 31) + this.headerColor.hashCode()) * 31) + this.titleColor.hashCode()) * 31) + this.messageColor.hashCode()) * 31) + this.dividerColor.hashCode()) * 31) + this.tableCells.hashCode();
    }

    public final void setBackgroundColor(@NotNull OrcaColors.OrcaColor orcaColor) {
        Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
        this.backgroundColor = orcaColor;
    }

    public final void setDividerColor(@NotNull OrcaColors.OrcaColor orcaColor) {
        Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
        this.dividerColor = orcaColor;
    }

    public final void setHeaderColor(@NotNull OrcaColors.OrcaColor orcaColor) {
        Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
        this.headerColor = orcaColor;
    }

    public final void setMessageColor(@NotNull OrcaColors.OrcaColor orcaColor) {
        Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
        this.messageColor = orcaColor;
    }

    public final void setTableCells(@NotNull OrcaCells orcaCells) {
        Intrinsics.checkNotNullParameter(orcaCells, "<set-?>");
        this.tableCells = orcaCells;
    }

    public final void setTitleColor(@NotNull OrcaColors.OrcaColor orcaColor) {
        Intrinsics.checkNotNullParameter(orcaColor, "<set-?>");
        this.titleColor = orcaColor;
    }

    @NotNull
    public String toString() {
        return "OrcaScreen(backgroundColor=" + this.backgroundColor + ", headerColor=" + this.headerColor + ", titleColor=" + this.titleColor + ", messageColor=" + this.messageColor + ", dividerColor=" + this.dividerColor + ", tableCells=" + this.tableCells + ")";
    }
}
