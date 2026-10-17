package dz1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\t\u0010\u001d¨\u0006\u001f"}, d2 = {"Ldz1/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "g", "state", "", "c", "J", "()J", "createdDate", "f", "paymentMethod", "e", "Ljava/lang/Long;", "()Ljava/lang/Long;", "acceptanceExpirationDate", "Lk02/e;", "Lk02/e;", "()Lk02/e;", "paymentAuthorisation", "Ldz1/m;", "Ldz1/m;", "()Ldz1/m;", "changes", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("acceptanceExpirationDate")
    private final Long acceptanceExpirationDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("paymentAuthorisation")
    @NotNull
    private final k02.e paymentAuthorisation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("changes")
    @NotNull
    private final m changes;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getAcceptanceExpirationDate() {
        return this.acceptanceExpirationDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final m getChanges() {
        return this.changes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final k02.e getPaymentAuthorisation() {
        return this.paymentAuthorisation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.state, aVar.state) && this.createdDate == aVar.createdDate && Intrinsics.f(this.paymentMethod, aVar.paymentMethod) && Intrinsics.f(this.acceptanceExpirationDate, aVar.acceptanceExpirationDate) && Intrinsics.f(this.paymentAuthorisation, aVar.paymentAuthorisation) && Intrinsics.f(this.changes, aVar.changes);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.createdDate), 31, this.paymentMethod);
        Long l2 = this.acceptanceExpirationDate;
        return this.changes.hashCode() + ((this.paymentAuthorisation.hashCode() + ((iC + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31);
    }
}
