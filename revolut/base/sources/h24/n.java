package h24;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0007\u0010\nR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u0016\u0010\u001aR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\f\u0010\u001e¨\u0006 "}, d2 = {"Lh24/n;", "", "", "toString", "()Ljava/lang/String;", "", "Lh24/r;", "a", "Ljava/util/List;", "f", "()Ljava/util/List;", "widgetSections", "b", "Ljava/lang/String;", "c", "disclaimer", "Lh24/q;", "Lh24/q;", "e", "()Lh24/q;", "headerSection", "Lh24/a;", "d", "actionsSection", "Lh24/o;", "Lh24/o;", "()Lh24/o;", "eligibilityCriteriaSection", "Lh24/f;", "Lh24/f;", "()Lh24/f;", "cardCollectionSection", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("widgetSections")
    @NotNull
    private final List<r> widgetSections;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("disclaimer")
    private final String disclaimer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("headerSection")
    private final q headerSection;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("actionsSection")
    private final List<a> actionsSection;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("eligibilityCriteriaSection")
    private final o eligibilityCriteriaSection;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("cardCollectionSection")
    private final f cardCollectionSection;

    public n(ArrayList widgetSections, String str, q qVar, ArrayList arrayList, o oVar, f fVar) {
        Intrinsics.checkNotNullParameter(widgetSections, "widgetSections");
        this.widgetSections = widgetSections;
        this.disclaimer = str;
        this.headerSection = qVar;
        this.actionsSection = arrayList;
        this.eligibilityCriteriaSection = oVar;
        this.cardCollectionSection = fVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getActionsSection() {
        return this.actionsSection;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getCardCollectionSection() {
        return this.cardCollectionSection;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final o getEligibilityCriteriaSection() {
        return this.eligibilityCriteriaSection;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final q getHeaderSection() {
        return this.headerSection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.widgetSections, nVar.widgetSections) && Intrinsics.f(this.disclaimer, nVar.disclaimer) && Intrinsics.f(this.headerSection, nVar.headerSection) && Intrinsics.f(this.actionsSection, nVar.actionsSection) && Intrinsics.f(this.eligibilityCriteriaSection, nVar.eligibilityCriteriaSection) && Intrinsics.f(this.cardCollectionSection, nVar.cardCollectionSection);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getWidgetSections() {
        return this.widgetSections;
    }

    public final int hashCode() {
        int iHashCode = this.widgetSections.hashCode() * 31;
        String str = this.disclaimer;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        q qVar = this.headerSection;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        List<a> list = this.actionsSection;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        o oVar = this.eligibilityCriteriaSection;
        int iHashCode5 = (iHashCode4 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        f fVar = this.cardCollectionSection;
        return iHashCode5 + (fVar != null ? fVar.hashCode() : 0);
    }
}
