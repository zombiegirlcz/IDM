package hp1;

import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\f\u0010\u0019R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\t\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004¨\u0006\""}, d2 = {"Lhp1/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "paymentIntentId", "b", "e", "paymentMethod", "c", "h", "state", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "amount", "i", "title", "", "Lgp1/b;", "f", "Ljava/util/List;", "()Ljava/util/List;", "inputs", "Lqp1/b;", "g", "fields", "pocketId", "j", "transactionId", "scheduledDate", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentIntentId")
    @NotNull
    private final String paymentIntentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("inputs")
    private final List<gp1.b> inputs;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("fields")
    private final List<qp1.b> fields;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("transactionId")
    private final String transactionId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("scheduledDate")
    private final String scheduledDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getFields() {
        return this.fields;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getInputs() {
        return this.inputs;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPaymentIntentId() {
        return this.paymentIntentId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.paymentIntentId, bVar.paymentIntentId) && Intrinsics.f(this.paymentMethod, bVar.paymentMethod) && Intrinsics.f(this.state, bVar.state) && Intrinsics.f(this.amount, bVar.amount) && Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.inputs, bVar.inputs) && Intrinsics.f(this.fields, bVar.fields) && Intrinsics.f(this.pocketId, bVar.pocketId) && Intrinsics.f(this.transactionId, bVar.transactionId) && Intrinsics.f(this.scheduledDate, bVar.scheduledDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPocketId() {
        return this.pocketId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getScheduledDate() {
        return this.scheduledDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final int hashCode() {
        int iJ = v7.j(this.amount, p.a.c(p.a.c(this.paymentIntentId.hashCode() * 31, 31, this.paymentMethod), 31, this.state), 31);
        String str = this.title;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        List<gp1.b> list = this.inputs;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<qp1.b> list2 = this.fields;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.pocketId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.transactionId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scheduledDate;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }
}
