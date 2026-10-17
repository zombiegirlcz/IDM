package t04;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\f\u0010\u0015¨\u0006\u0017"}, d2 = {"Lt04/j;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "title", "b", "d", "subtitle", "c", "continueButton", "Lt04/a;", "Lt04/a;", "()Lt04/a;", "addDebtItem", "", "Lt04/g;", "Ljava/util/List;", "()Ljava/util/List;", "debts", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    @NotNull
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("continueButton")
    @NotNull
    private final String continueButton;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("addDebtItem")
    @NotNull
    private final a addDebtItem;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("debts")
    private final List<g> debts;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAddDebtItem() {
        return this.addDebtItem;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getContinueButton() {
        return this.continueButton;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getDebts() {
        return this.debts;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.title, jVar.title) && Intrinsics.f(this.subtitle, jVar.subtitle) && Intrinsics.f(this.continueButton, jVar.continueButton) && Intrinsics.f(this.addDebtItem, jVar.addDebtItem) && Intrinsics.f(this.debts, jVar.debts);
    }

    public final int hashCode() {
        int iHashCode = (this.addDebtItem.hashCode() + p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.subtitle), 31, this.continueButton)) * 31;
        List<g> list = this.debts;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
