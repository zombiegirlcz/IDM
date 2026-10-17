package jt6;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 /2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017R \u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b\u000f\u0010$R\u001a\u0010&\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010*\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b\n\u0010)R\u001c\u0010.\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010,\u001a\u0004\b\u001f\u0010-¨\u00060"}, d2 = {"Ljt6/j;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "", "b", "J", "h", "()J", "startedAt", "c", "j", "updatedAt", "i", "state", "Ljo3/a;", "e", "Ljo3/a;", "()Ljo3/a;", "amount", "", "f", "Ljava/lang/Boolean;", "k", "()Ljava/lang/Boolean;", "isRefundable", "g", "refundedAmount", "", "Ljt6/f;", "Ljava/util/List;", "()Ljava/util/List;", "fees", "paymentMethod", "Ljt6/a;", "Ljt6/a;", "()Ljt6/a;", "card", "Llt6/e;", "Llt6/e;", "()Llt6/e;", "sepaDirectDebit", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("startedDate")
    private final long startedAt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("updatedDate")
    private final long updatedAt;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("isRefundable")
    private final Boolean isRefundable;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("refundedAmount")
    private final jo3.a refundedAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("fees")
    @NotNull
    private final List<f> fees;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("card")
    private final a card;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("sepaDd")
    private final lt6.e sepaDirectDebit;

    public j(String id10, long j2, long j3, String state, jo3.a amount, Boolean bool, jo3.a aVar, ArrayList fees, String paymentMethod, a aVar2, lt6.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.id = id10;
        this.startedAt = j2;
        this.updatedAt = j3;
        this.state = state;
        this.amount = amount;
        this.isRefundable = bool;
        this.refundedAmount = aVar;
        this.fees = fees;
        this.paymentMethod = paymentMethod;
        this.card = aVar2;
        this.sepaDirectDebit = eVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getCard() {
        return this.card;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getFees() {
        return this.fees;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.id, jVar.id) && this.startedAt == jVar.startedAt && this.updatedAt == jVar.updatedAt && Intrinsics.f(this.state, jVar.state) && Intrinsics.f(this.amount, jVar.amount) && Intrinsics.f(this.isRefundable, jVar.isRefundable) && Intrinsics.f(this.refundedAmount, jVar.refundedAmount) && Intrinsics.f(this.fees, jVar.fees) && Intrinsics.f(this.paymentMethod, jVar.paymentMethod) && Intrinsics.f(this.card, jVar.card) && Intrinsics.f(this.sepaDirectDebit, jVar.sepaDirectDebit);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getRefundedAmount() {
        return this.refundedAmount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final lt6.e getSepaDirectDebit() {
        return this.sepaDirectDebit;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getStartedAt() {
        return this.startedAt;
    }

    public final int hashCode() {
        int iJ = v7.j(this.amount, p.a.c(a0.d.c(a0.d.c(this.id.hashCode() * 31, 31, this.startedAt), 31, this.updatedAt), 31, this.state), 31);
        Boolean bool = this.isRefundable;
        int iHashCode = (iJ + (bool == null ? 0 : bool.hashCode())) * 31;
        jo3.a aVar = this.refundedAmount;
        int iC = p.a.c(p.a.d((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.fees), 31, this.paymentMethod);
        a aVar2 = this.card;
        int iHashCode2 = (iC + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        lt6.e eVar = this.sepaDirectDebit;
        return iHashCode2 + (eVar != null ? eVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Boolean getIsRefundable() {
        return this.isRefundable;
    }
}
