package y14;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx4.l2;
import nx4.m0;
import nx4.m2;
import nx4.u1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\"\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\f\u0010\u001bR$\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u000f\u0010\u001b¨\u0006\u001f"}, d2 = {"Ly14/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "title", "b", "f", "subtitle", "c", "buttonTitle", "Lnx4/u1;", "d", "Lnx4/u1;", "()Lnx4/u1;", "confirmScreen", "Lnx4/m2;", "e", "Lnx4/m2;", "()Lnx4/m2;", "secondSubtitle", "", "Lnx4/m0;", "Ljava/util/List;", "()Ljava/util/List;", "items", "Lnx4/l2$a;", "itemsDetails", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    @NotNull
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("confirmButtonTitle")
    @NotNull
    private final String buttonTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("confirmScreen")
    private final u1 confirmScreen;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("secondSubtitle")
    private final m2 secondSubtitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<m0> items;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("itemsDetails")
    private final List<l2.a> itemsDetails;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final u1 getConfirmScreen() {
        return this.confirmScreen;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getItemsDetails() {
        return this.itemsDetails;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final m2 getSecondSubtitle() {
        return this.secondSubtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.subtitle, aVar.subtitle) && Intrinsics.f(this.buttonTitle, aVar.buttonTitle) && Intrinsics.f(this.confirmScreen, aVar.confirmScreen) && Intrinsics.f(this.secondSubtitle, aVar.secondSubtitle) && Intrinsics.f(this.items, aVar.items) && Intrinsics.f(this.itemsDetails, aVar.itemsDetails);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.subtitle), 31, this.buttonTitle);
        u1 u1Var = this.confirmScreen;
        int iHashCode = (iC + (u1Var == null ? 0 : u1Var.hashCode())) * 31;
        m2 m2Var = this.secondSubtitle;
        int iD = p.a.d((iHashCode + (m2Var == null ? 0 : m2Var.hashCode())) * 31, 31, this.items);
        List<l2.a> list = this.itemsDetails;
        return iD + (list != null ? list.hashCode() : 0);
    }
}
