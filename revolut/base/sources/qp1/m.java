package qp1;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\u0004¨\u0006\""}, d2 = {"Lqp1/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getPaymentMethod", "paymentMethod", "", "Lgp1/c;", "b", "Ljava/util/List;", "getInputs", "()Ljava/util/List;", "inputs", "Ljo3/a;", "c", "Ljo3/a;", "getAmount", "()Ljo3/a;", "amount", "d", "getPocketId", "pocketId", "Lt02/d;", "e", "Lt02/d;", "getSource", "()Lt02/d;", "source", "f", "getScheduledDate", "scheduledDate", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("inputs")
    @NotNull
    private final List<gp1.c> inputs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("source")
    private final t02.d source;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("scheduledDate")
    private final String scheduledDate;

    public m(String paymentMethod, ArrayList inputs, jo3.a amount, String str, t02.d dVar, String str2) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.paymentMethod = paymentMethod;
        this.inputs = inputs;
        this.amount = amount;
        this.pocketId = str;
        this.source = dVar;
        this.scheduledDate = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.paymentMethod, mVar.paymentMethod) && Intrinsics.f(this.inputs, mVar.inputs) && Intrinsics.f(this.amount, mVar.amount) && Intrinsics.f(this.pocketId, mVar.pocketId) && Intrinsics.f(this.source, mVar.source) && Intrinsics.f(this.scheduledDate, mVar.scheduledDate);
    }

    public final int hashCode() {
        int iJ = v7.j(this.amount, p.a.d(this.paymentMethod.hashCode() * 31, 31, this.inputs), 31);
        String str = this.pocketId;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        t02.d dVar = this.source;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str2 = this.scheduledDate;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
