package tn1;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\u0004R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\u0004¨\u0006%"}, d2 = {"Ltn1/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getPaymentMethod", "paymentMethod", "b", "getType", "type", "Ljo3/a;", "c", "Ljo3/a;", "getAmount", "()Ljo3/a;", "amount", "", "Lsn1/a;", "d", "Ljava/util/List;", "getInputs", "()Ljava/util/List;", "inputs", "e", "getPocketId", "pocketId", "f", "getScheduledDate", "scheduledDate", "g", "getFrequency", "frequency", "h", "getLabel", "label", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("inputs")
    @NotNull
    private final List<sn1.a> inputs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("pocketId")
    private final String pocketId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("scheduledDate")
    private final String scheduledDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @b("frequency")
    private final String frequency;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @b("label")
    private final String label;

    public a(String str, String str2, String str3, String str4, ArrayList inputs, jo3.a amount) {
        Intrinsics.checkNotNullParameter("BPAY", "paymentMethod");
        Intrinsics.checkNotNullParameter("BILL_PAYMENT", "type");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        this.paymentMethod = "BPAY";
        this.type = "BILL_PAYMENT";
        this.amount = amount;
        this.inputs = inputs;
        this.pocketId = str;
        this.scheduledDate = str2;
        this.frequency = str3;
        this.label = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.paymentMethod, aVar.paymentMethod) && Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.amount, aVar.amount) && Intrinsics.f(this.inputs, aVar.inputs) && Intrinsics.f(this.pocketId, aVar.pocketId) && Intrinsics.f(this.scheduledDate, aVar.scheduledDate) && Intrinsics.f(this.frequency, aVar.frequency) && Intrinsics.f(this.label, aVar.label);
    }

    public final int hashCode() {
        int iD = p.a.d(v7.j(this.amount, p.a.c(this.paymentMethod.hashCode() * 31, 31, this.type), 31), 31, this.inputs);
        String str = this.pocketId;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scheduledDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.frequency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.label;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
