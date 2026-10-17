package xo4;

import ip0.v7;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ql4.q0;
import yn4.z;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\t\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010!\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u001eR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0013\u0010\u001eR\u001c\u0010&\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b\u0018\u0010%R \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010/\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010-\u001a\u0004\b\u0005\u0010.R\u001a\u00104\u001a\u0002008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103¨\u00065"}, d2 = {"Lxo4/u;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "c", "facilityId", "", "J", "()J", "createdAt", "j", "state", "", "e", "I", "k", "()I", "term", "f", "i", "settledInstalments", "Ljo3/a;", "g", "Ljo3/a;", "()Ljo3/a;", "principalAmount", "h", "remainingTotalAmount", "nextDueAmount", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "nextDueDate", "", "Ljava/util/List;", "l", "()Ljava/util/List;", "transactionIds", "Lyn4/z$a;", "Lyn4/z$a;", "()Lyn4/z$a;", "cancellation", "Lql4/q0;", "m", "Lql4/q0;", "()Lql4/q0;", "type", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("facilityId")
    @NotNull
    private final String facilityId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdAt")
    private final long createdAt;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("term")
    private final int term;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("settledInstalments")
    private final int settledInstalments;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("principalAmount")
    @NotNull
    private final jo3.a principalAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("remainingTotalAmount")
    @NotNull
    private final jo3.a remainingTotalAmount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("nextDueAmount")
    private final jo3.a nextDueAmount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextDueDate")
    private final LocalDate nextDueDate;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("transactionIds")
    @NotNull
    private final List<String> transactionIds;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellation")
    private final z.a cancellation;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final q0 type;

    public u(String id10, String facilityId, long j2, String state, int i, int i2, jo3.a principalAmount, jo3.a remainingTotalAmount, jo3.a aVar, LocalDate localDate, List transactionIds, z.a aVar2, q0 type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(principalAmount, "principalAmount");
        Intrinsics.checkNotNullParameter(remainingTotalAmount, "remainingTotalAmount");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id10;
        this.facilityId = facilityId;
        this.createdAt = j2;
        this.state = state;
        this.term = i;
        this.settledInstalments = i2;
        this.principalAmount = principalAmount;
        this.remainingTotalAmount = remainingTotalAmount;
        this.nextDueAmount = aVar;
        this.nextDueDate = localDate;
        this.transactionIds = transactionIds;
        this.cancellation = aVar2;
        this.type = type;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final z.a getCancellation() {
        return this.cancellation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFacilityId() {
        return this.facilityId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getNextDueAmount() {
        return this.nextDueAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.id, uVar.id) && Intrinsics.f(this.facilityId, uVar.facilityId) && this.createdAt == uVar.createdAt && Intrinsics.f(this.state, uVar.state) && this.term == uVar.term && this.settledInstalments == uVar.settledInstalments && Intrinsics.f(this.principalAmount, uVar.principalAmount) && Intrinsics.f(this.remainingTotalAmount, uVar.remainingTotalAmount) && Intrinsics.f(this.nextDueAmount, uVar.nextDueAmount) && Intrinsics.f(this.nextDueDate, uVar.nextDueDate) && Intrinsics.f(this.transactionIds, uVar.transactionIds) && Intrinsics.f(this.cancellation, uVar.cancellation) && this.type == uVar.type;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LocalDate getNextDueDate() {
        return this.nextDueDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final jo3.a getPrincipalAmount() {
        return this.principalAmount;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final jo3.a getRemainingTotalAmount() {
        return this.remainingTotalAmount;
    }

    public final int hashCode() {
        int iJ = v7.j(this.remainingTotalAmount, v7.j(this.principalAmount, j6.a.b(this.settledInstalments, j6.a.b(this.term, p.a.c(a0.d.c(p.a.c(this.id.hashCode() * 31, 31, this.facilityId), 31, this.createdAt), 31, this.state), 31), 31), 31), 31);
        jo3.a aVar = this.nextDueAmount;
        int iHashCode = (iJ + (aVar == null ? 0 : aVar.hashCode())) * 31;
        LocalDate localDate = this.nextDueDate;
        int iD = p.a.d((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.transactionIds);
        z.a aVar2 = this.cancellation;
        return this.type.hashCode() + ((iD + (aVar2 != null ? aVar2.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getSettledInstalments() {
        return this.settledInstalments;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getTerm() {
        return this.term;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final List getTransactionIds() {
        return this.transactionIds;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final q0 getType() {
        return this.type;
    }
}
