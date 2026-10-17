package ar9;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0006\u0010\u0004R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\r\u0010\u0014¨\u0006\u0017"}, d2 = {"Lar9/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "d", "()J", "totalSpentByGroup", "b", "totalSpentByCurrentMember", "c", "Ljava/lang/String;", "currency", "", "Lar9/b;", "Ljava/util/List;", "e", "()Ljava/util/List;", "totalSpentByGroupByCurrency", "totalSpentByCurrentMemberByCurrency", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalSpentByGroup")
    private final long totalSpentByGroup;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalSpentByCurrentMember")
    private final long totalSpentByCurrentMember;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("totalSpentByGroupByCurrency")
    private final List<b> totalSpentByGroupByCurrency;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("totalSpentByCurrentMemberByCurrency")
    private final List<b> totalSpentByCurrentMemberByCurrency;

    public a(long j2, long j3, String currency, List list, List list2) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.totalSpentByGroup = j2;
        this.totalSpentByCurrentMember = j3;
        this.currency = currency;
        this.totalSpentByGroupByCurrency = list;
        this.totalSpentByCurrentMemberByCurrency = list2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTotalSpentByCurrentMember() {
        return this.totalSpentByCurrentMember;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getTotalSpentByCurrentMemberByCurrency() {
        return this.totalSpentByCurrentMemberByCurrency;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getTotalSpentByGroup() {
        return this.totalSpentByGroup;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getTotalSpentByGroupByCurrency() {
        return this.totalSpentByGroupByCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.totalSpentByGroup == aVar.totalSpentByGroup && this.totalSpentByCurrentMember == aVar.totalSpentByCurrentMember && Intrinsics.f(this.currency, aVar.currency) && Intrinsics.f(this.totalSpentByGroupByCurrency, aVar.totalSpentByGroupByCurrency) && Intrinsics.f(this.totalSpentByCurrentMemberByCurrency, aVar.totalSpentByCurrentMemberByCurrency);
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c(Long.hashCode(this.totalSpentByGroup) * 31, 31, this.totalSpentByCurrentMember), 31, this.currency);
        List<b> list = this.totalSpentByGroupByCurrency;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        List<b> list2 = this.totalSpentByCurrentMemberByCurrency;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }
}
