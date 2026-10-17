package bjk;

import bjk.g2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\n\u0010\u0019R\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u000f\u0010\u001eR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u0005\u0010\u001e¨\u0006\""}, d2 = {"Lbjk/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "Lbjk/g2$b;", "b", "Lbjk/g2$b;", "f", "()Lbjk/g2$b;", "navigation", "c", "g", "title", "Lbjk/g2$d$q;", "d", "Lbjk/g2$d$q;", "()Lbjk/g2$d$q;", "header", "Lbjk/g2$d$h;", "Lbjk/g2$d$h;", "()Lbjk/g2$d$h;", "billingOptions", "", "Lbjk/g2$a;", "Ljava/util/List;", "()Ljava/util/List;", "buttons", "Lbjk/g2$d$c;", "benefitCategories", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("navigation")
    private final g2.b navigation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("header")
    private final g2.d.q header;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("billingOptions")
    private final g2.d.h billingOptions;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("buttons")
    private final List<g2.a> buttons;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("benefitCategories")
    private final List<g2.d.c> benefitCategories;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getBenefitCategories() {
        return this.benefitCategories;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g2.d.h getBillingOptions() {
        return this.billingOptions;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getButtons() {
        return this.buttons;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final g2.d.q getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.id, kVar.id) && Intrinsics.f(this.navigation, kVar.navigation) && Intrinsics.f(this.title, kVar.title) && Intrinsics.f(this.header, kVar.header) && Intrinsics.f(this.billingOptions, kVar.billingOptions) && Intrinsics.f(this.buttons, kVar.buttons) && Intrinsics.f(this.benefitCategories, kVar.benefitCategories);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final g2.b getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        g2.b bVar = this.navigation;
        int iC = p.a.c((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.title);
        g2.d.q qVar = this.header;
        int iHashCode2 = (iC + (qVar == null ? 0 : qVar.hashCode())) * 31;
        g2.d.h hVar = this.billingOptions;
        int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        List<g2.a> list = this.buttons;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<g2.d.c> list2 = this.benefitCategories;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }
}
