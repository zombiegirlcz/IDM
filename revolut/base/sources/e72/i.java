package e72;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004¨\u0006\u001d"}, d2 = {"Le72/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "code", "c", "h", "state", "d", "f", "ownerId", "g", "revolutCardId", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "amount", "createdDate", "j", "updatedDate", "i", "expirationDate", "transactionId", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("ownerId")
    @NotNull
    private final String ownerId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("revolutCardId")
    @NotNull
    private final String revolutCardId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    @NotNull
    private final String createdDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("updatedDate")
    @NotNull
    private final String updatedDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("expirationDate")
    @NotNull
    private final String expirationDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionId")
    private final String transactionId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.id, iVar.id) && Intrinsics.f(this.code, iVar.code) && Intrinsics.f(this.state, iVar.state) && Intrinsics.f(this.ownerId, iVar.ownerId) && Intrinsics.f(this.revolutCardId, iVar.revolutCardId) && Intrinsics.f(this.amount, iVar.amount) && Intrinsics.f(this.createdDate, iVar.createdDate) && Intrinsics.f(this.updatedDate, iVar.updatedDate) && Intrinsics.f(this.expirationDate, iVar.expirationDate) && Intrinsics.f(this.transactionId, iVar.transactionId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getOwnerId() {
        return this.ownerId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getRevolutCardId() {
        return this.revolutCardId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(v7.j(this.amount, p.a.c(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.code), 31, this.state), 31, this.ownerId), 31, this.revolutCardId), 31), 31, this.createdDate), 31, this.updatedDate), 31, this.expirationDate);
        String str = this.transactionId;
        return iC + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getUpdatedDate() {
        return this.updatedDate;
    }
}
