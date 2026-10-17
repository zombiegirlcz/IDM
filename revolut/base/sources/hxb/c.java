package hxb;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0011\u0010\fR\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004¨\u0006!"}, d2 = {"Lhxb/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "amount", "c", "i", "utilisedAmount", "d", "expiredAmount", "Lhxb/m0;", "Lhxb/m0;", "f", "()Lhxb/m0;", "period", "Lhxb/e;", "Lhxb/e;", "g", "()Lhxb/e;", "source", "expirationDate", "h", "createdDate", "updatedDate", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("utilisedAmount")
    @NotNull
    private final jo3.a utilisedAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("expiredAmount")
    @NotNull
    private final jo3.a expiredAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("period")
    @NotNull
    private final m0 period;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("source")
    @NotNull
    private final e source;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("expirationDate")
    @NotNull
    private final String expirationDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    @NotNull
    private final String createdDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("updatedDate")
    @NotNull
    private final String updatedDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getExpiredAmount() {
        return this.expiredAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.amount, cVar.amount) && Intrinsics.f(this.utilisedAmount, cVar.utilisedAmount) && Intrinsics.f(this.expiredAmount, cVar.expiredAmount) && Intrinsics.f(this.period, cVar.period) && Intrinsics.f(this.source, cVar.source) && Intrinsics.f(this.expirationDate, cVar.expirationDate) && Intrinsics.f(this.createdDate, cVar.createdDate) && Intrinsics.f(this.updatedDate, cVar.updatedDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final m0 getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final e getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getUpdatedDate() {
        return this.updatedDate;
    }

    public final int hashCode() {
        return this.updatedDate.hashCode() + p.a.c(p.a.c((this.source.hashCode() + ((this.period.hashCode() + v7.j(this.expiredAmount, v7.j(this.utilisedAmount, v7.j(this.amount, this.id.hashCode() * 31, 31), 31), 31)) * 31)) * 31, 31, this.expirationDate), 31, this.createdDate);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final jo3.a getUtilisedAmount() {
        return this.utilisedAmount;
    }
}
