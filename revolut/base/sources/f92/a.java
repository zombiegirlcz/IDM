package f92;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0015"}, d2 = {"Lf92/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "cardId", "c", "contractNumber", "f", "paymentReference", "e", "label", "", "J", "()J", "creationDate", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardId")
    @NotNull
    private final String cardId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("contractNumber")
    @NotNull
    private final String contractNumber;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("paymentReference")
    @NotNull
    private final String paymentReference;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("label")
    @NotNull
    private final String label;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("creationDate")
    private final long creationDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getContractNumber() {
        return this.contractNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCreationDate() {
        return this.creationDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.cardId, aVar.cardId) && Intrinsics.f(this.contractNumber, aVar.contractNumber) && Intrinsics.f(this.paymentReference, aVar.paymentReference) && Intrinsics.f(this.label, aVar.label) && this.creationDate == aVar.creationDate;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPaymentReference() {
        return this.paymentReference;
    }

    public final int hashCode() {
        return Long.hashCode(this.creationDate) + p.a.c(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.cardId), 31, this.contractNumber), 31, this.paymentReference), 31, this.label);
    }
}
