package hfk;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\bR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\f\u0010\b¨\u0006\u000e"}, d2 = {"Lhfk/h;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "benefits", "b", "cards", "c", "memberships", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("benefits")
    @NotNull
    private final List<String> benefits;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("cards")
    private final List<String> cards;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("memberships")
    private final List<String> memberships;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getBenefits() {
        return this.benefits;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getCards() {
        return this.cards;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getMemberships() {
        return this.memberships;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.benefits, hVar.benefits) && Intrinsics.f(this.cards, hVar.cards) && Intrinsics.f(this.memberships, hVar.memberships);
    }

    public final int hashCode() {
        int iHashCode = this.benefits.hashCode() * 31;
        List<String> list = this.cards;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.memberships;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }
}
