package nx4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0005\u0010\u0004R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\f\u0010\u001dR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010$\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0013\u0010#R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b!\u0010#¨\u0006("}, d2 = {"Lnx4/w2;", "Lnx4/m0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "name", "b", "h", "title", "c", "g", "subtitle", "d", "getAction$annotations", "()V", "action", "e", "getActionType$annotations", "actionType", "", "Ljava/lang/Boolean;", "k", "()Ljava/lang/Boolean;", "valueUpdated", "Lnx4/s1;", "Lnx4/s1;", "()Lnx4/s1;", "info", "label", "Lnx4/n;", "i", "Lnx4/n;", "()Lnx4/n;", "labelAction", "j", "titleIcon", "titleAction", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w2 implements m0 {

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
    @lg.b("labelAction")
    private final n labelAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("titleIcon")
    private final String titleIcon;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("titleAction")
    private final n titleAction;

    public w2(String name, String title, String subtitle, Boolean bool, String str, n nVar, String str2, n nVar2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.name = name;
        this.title = title;
        this.subtitle = subtitle;
        this.action = null;
        this.actionType = null;
        this.valueUpdated = bool;
        this.info = null;
        this.label = str;
        this.labelAction = nVar;
        this.titleIcon = str2;
        this.titleAction = nVar2;
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
    public final s1 getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final n getLabelAction() {
        return this.labelAction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj2;
        return Intrinsics.f(this.name, w2Var.name) && Intrinsics.f(this.title, w2Var.title) && Intrinsics.f(this.subtitle, w2Var.subtitle) && Intrinsics.f(this.action, w2Var.action) && Intrinsics.f(this.actionType, w2Var.actionType) && Intrinsics.f(this.valueUpdated, w2Var.valueUpdated) && Intrinsics.f(this.info, w2Var.info) && Intrinsics.f(this.label, w2Var.label) && Intrinsics.f(this.labelAction, w2Var.labelAction) && Intrinsics.f(this.titleIcon, w2Var.titleIcon) && Intrinsics.f(this.titleAction, w2Var.titleAction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
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
        n nVar = this.labelAction;
        int iHashCode6 = (iHashCode5 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        String str4 = this.titleIcon;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        n nVar2 = this.titleAction;
        return iHashCode7 + (nVar2 != null ? nVar2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final n getTitleAction() {
        return this.titleAction;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTitleIcon() {
        return this.titleIcon;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Boolean getValueUpdated() {
        return this.valueUpdated;
    }
}
