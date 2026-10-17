package q90;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010*\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u00100\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00101\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b\u0019\u0010)R\u001c\u00103\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010 \u001a\u0004\b\u001f\u0010\"R\"\u00106\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b5\u0010)R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b7\u0010\u0004R\u001c\u00109\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u0014\u001a\u0004\b,\u0010\u0016R\u001c\u0010=\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b2\u0010<R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004¨\u0006?"}, d2 = {"Lq90/q1;", "Lq90/m4;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getId", "id", "b", "o", "previousViewId", "c", "t", "title", "d", "r", "subtitle", "Lq90/t1;", "e", "Lq90/t1;", "s", "()Lq90/t1;", "subtitleHtml", "Lq90/d3;", "f", "Lq90/d3;", "q", "()Lq90/d3;", "secondaryDescription", "", "g", "Ljava/lang/Boolean;", "p", "()Ljava/lang/Boolean;", "required", "", "Lq90/v;", "h", "Ljava/util/List;", "l", "()Ljava/util/List;", "items", "Lq90/a;", "i", "Lq90/a;", "j", "()Lq90/a;", "headerAction", "actions", "k", "disableScrollToBottom", "Lq90/h4;", "m", "next", "n", "nextText", "footer", "Lq90/a2;", "Lq90/a2;", "()Lq90/a2;", "infoMessage", "analyticsName", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q1 extends m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("previousViewId")
    private final String previousViewId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("subtitle")
    private final String subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("subtitleHtml")
    private final t1 subtitleHtml;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("secondaryDescription")
    private final d3 secondaryDescription;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final Boolean required;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<v> items;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("headerAction")
    private final a headerAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("actions")
    private final List<a> actions;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("disableScrollToBottom")
    private final Boolean disableScrollToBottom;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("next")
    private final List<h4> next;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextText")
    private final String nextText;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("footer")
    private final t1 footer;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("infoMessage")
    private final a2 infoMessage;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("analyticsScreenName")
    private final String analyticsName;

    public q1(String id10, String str, String str2, String str3, t1 t1Var, d3 d3Var, Boolean bool, ArrayList items, a aVar, ArrayList arrayList, Boolean bool2, ArrayList arrayList2, String str4, t1 t1Var2, a2 a2Var, String str5) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = id10;
        this.previousViewId = str;
        this.title = str2;
        this.subtitle = str3;
        this.subtitleHtml = t1Var;
        this.secondaryDescription = d3Var;
        this.required = bool;
        this.items = items;
        this.headerAction = aVar;
        this.actions = arrayList;
        this.disableScrollToBottom = bool2;
        this.next = arrayList2;
        this.nextText = str4;
        this.footer = t1Var2;
        this.infoMessage = a2Var;
        this.analyticsName = str5;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Override // xl2.g0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj2;
        return Intrinsics.f(this.id, q1Var.id) && Intrinsics.f(this.previousViewId, q1Var.previousViewId) && Intrinsics.f(this.title, q1Var.title) && Intrinsics.f(this.subtitle, q1Var.subtitle) && Intrinsics.f(this.subtitleHtml, q1Var.subtitleHtml) && Intrinsics.f(this.secondaryDescription, q1Var.secondaryDescription) && Intrinsics.f(this.required, q1Var.required) && Intrinsics.f(this.items, q1Var.items) && Intrinsics.f(this.headerAction, q1Var.headerAction) && Intrinsics.f(this.actions, q1Var.actions) && Intrinsics.f(this.disableScrollToBottom, q1Var.disableScrollToBottom) && Intrinsics.f(this.next, q1Var.next) && Intrinsics.f(this.nextText, q1Var.nextText) && Intrinsics.f(this.footer, q1Var.footer) && Intrinsics.f(this.infoMessage, q1Var.infoMessage) && Intrinsics.f(this.analyticsName, q1Var.analyticsName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getActions() {
        return this.actions;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getDisableScrollToBottom() {
        return this.disableScrollToBottom;
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.previousViewId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        t1 t1Var = this.subtitleHtml;
        int iHashCode5 = (iHashCode4 + (t1Var == null ? 0 : t1Var.hashCode())) * 31;
        d3 d3Var = this.secondaryDescription;
        int iHashCode6 = (iHashCode5 + (d3Var == null ? 0 : d3Var.hashCode())) * 31;
        Boolean bool = this.required;
        int iD = p.a.d((iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.items);
        a aVar = this.headerAction;
        int iHashCode7 = (iD + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List<a> list = this.actions;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.disableScrollToBottom;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<h4> list2 = this.next;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.nextText;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        t1 t1Var2 = this.footer;
        int iHashCode12 = (iHashCode11 + (t1Var2 == null ? 0 : t1Var2.hashCode())) * 31;
        a2 a2Var = this.infoMessage;
        int iHashCode13 = (iHashCode12 + (a2Var == null ? 0 : a2Var.hashCode())) * 31;
        String str5 = this.analyticsName;
        return iHashCode13 + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final t1 getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final a getHeaderAction() {
        return this.headerAction;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final a2 getInfoMessage() {
        return this.infoMessage;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final List getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getNextText() {
        return this.nextText;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getPreviousViewId() {
        return this.previousViewId;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final d3 getSecondaryDescription() {
        return this.secondaryDescription;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final t1 getSubtitleHtml() {
        return this.subtitleHtml;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
