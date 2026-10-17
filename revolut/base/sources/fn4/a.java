package fn4;

import ip0.v7;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u000f\u0010\u0019¨\u0006\u001b"}, d2 = {"Lfn4/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "amount", "Ljava/time/LocalDate;", "c", "Ljava/time/LocalDate;", "d", "()Ljava/time/LocalDate;", "dueDate", "billNumber", "f", "qrCode", "", "J", "()J", "createdAt", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("dueDate")
    @NotNull
    private final LocalDate dueDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("billNumber")
    @NotNull
    private final String billNumber;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("qrCode")
    @NotNull
    private final String qrCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("createdAt")
    private final long createdAt;

    public a(String id10, jo3.a amount, LocalDate dueDate, String billNumber, String qrCode, long j2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        Intrinsics.checkNotNullParameter(billNumber, "billNumber");
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        this.id = id10;
        this.amount = amount;
        this.dueDate = dueDate;
        this.billNumber = billNumber;
        this.qrCode = qrCode;
        this.createdAt = j2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBillNumber() {
        return this.billNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.amount, aVar.amount) && Intrinsics.f(this.dueDate, aVar.dueDate) && Intrinsics.f(this.billNumber, aVar.billNumber) && Intrinsics.f(this.qrCode, aVar.qrCode) && this.createdAt == aVar.createdAt;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getQrCode() {
        return this.qrCode;
    }

    public final int hashCode() {
        return Long.hashCode(this.createdAt) + p.a.c(p.a.c(y.a(v7.j(this.amount, this.id.hashCode() * 31, 31), 31, this.dueDate), 31, this.billNumber), 31, this.qrCode);
    }
}
