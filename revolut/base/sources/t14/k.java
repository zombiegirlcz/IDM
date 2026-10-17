package t14;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx4.g2;
import nx4.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0005\u0010\u0004R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u000f\u0010\u001eR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b \u0010$R\u001c\u0010)\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b\u0017\u0010(R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\u0004R\u001c\u0010-\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b*\u0010(R\u001c\u00102\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101R\u001c\u00103\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\f\u0010\u001a¨\u00064"}, d2 = {"Lt14/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "name", "b", "j", "title", "c", "i", "subtitle", "d", "getAction$annotations", "()V", "action", "e", "getActionType$annotations", "actionType", "", "f", "Ljava/lang/Boolean;", "n", "()Ljava/lang/Boolean;", "valueUpdated", "Lnx4/s1;", "Lnx4/s1;", "()Lnx4/s1;", "info", "h", "label", "Lnx4/g2;", "Lnx4/g2;", "()Lnx4/g2;", "richLabel", "Lnx4/n;", "Lnx4/n;", "()Lnx4/n;", "labelAction", "k", "l", "titleIcon", "titleAction", "Lt14/k$a;", "m", "Lt14/k$a;", "()Lt14/k$a;", "titleValue", "hideNavigationIcon", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    @NotNull
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("action")
    private final String action;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("actionType")
    private final String actionType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("valueUpdated")
    private final Boolean valueUpdated;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("info")
    private final s1 info;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("label")
    private final String label;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("richLabel")
    private final g2 richLabel;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("labelAction")
    private final nx4.n labelAction;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("titleIcon")
    private final String titleIcon;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("titleAction")
    private final nx4.n titleAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("titleValue")
    private final a titleValue;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("hideNavigationIcon")
    private final Boolean hideNavigationIcon;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lt14/k$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "text", "Lnx4/c;", "Lnx4/c;", "()Lnx4/c;", "action", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("text")
        @NotNull
        private final String text;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("action")
        @NotNull
        private final nx4.c action;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final nx4.c getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.text, aVar.text) && Intrinsics.f(this.action, aVar.action);
        }

        public final int hashCode() {
            return this.action.hashCode() + (this.text.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getActionType() {
        return this.actionType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getHideNavigationIcon() {
        return this.hideNavigationIcon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final s1 getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.name, kVar.name) && Intrinsics.f(this.title, kVar.title) && Intrinsics.f(this.subtitle, kVar.subtitle) && Intrinsics.f(this.action, kVar.action) && Intrinsics.f(this.actionType, kVar.actionType) && Intrinsics.f(this.valueUpdated, kVar.valueUpdated) && Intrinsics.f(this.info, kVar.info) && Intrinsics.f(this.label, kVar.label) && Intrinsics.f(this.richLabel, kVar.richLabel) && Intrinsics.f(this.labelAction, kVar.labelAction) && Intrinsics.f(this.titleIcon, kVar.titleIcon) && Intrinsics.f(this.titleAction, kVar.titleAction) && Intrinsics.f(this.titleValue, kVar.titleValue) && Intrinsics.f(this.hideNavigationIcon, kVar.hideNavigationIcon);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final nx4.n getLabelAction() {
        return this.labelAction;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final g2 getRichLabel() {
        return this.richLabel;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.name.hashCode() * 31, 31, this.title), 31, this.subtitle);
        String str = this.action;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.actionType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.valueUpdated;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        s1 s1Var = this.info;
        int iHashCode4 = (iHashCode3 + (s1Var == null ? 0 : s1Var.hashCode())) * 31;
        String str3 = this.label;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        g2 g2Var = this.richLabel;
        int iHashCode6 = (iHashCode5 + (g2Var == null ? 0 : g2Var.hashCode())) * 31;
        nx4.n nVar = this.labelAction;
        int iHashCode7 = (iHashCode6 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        String str4 = this.titleIcon;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        nx4.n nVar2 = this.titleAction;
        int iHashCode9 = (iHashCode8 + (nVar2 == null ? 0 : nVar2.hashCode())) * 31;
        a aVar = this.titleValue;
        int iHashCode10 = (iHashCode9 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Boolean bool2 = this.hideNavigationIcon;
        return iHashCode10 + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final nx4.n getTitleAction() {
        return this.titleAction;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTitleIcon() {
        return this.titleIcon;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final a getTitleValue() {
        return this.titleValue;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Boolean getValueUpdated() {
        return this.valueUpdated;
    }
}
