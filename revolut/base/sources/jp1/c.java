package jp1;

import gp1.e;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\n\u0010\u0015R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001c"}, d2 = {"Ljp1/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getPaymentMethod", "paymentMethod", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "amount", "c", "d", "min", "max", "", "e", "Z", "()Z", "amountEditable", "Lgp1/e;", "f", "Lgp1/e;", "()Lgp1/e;", "warning", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("min")
    private final jo3.a min;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("max")
    private final jo3.a max;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("amountEditable")
    private final boolean amountEditable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("warning")
    private final e warning;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAmountEditable() {
        return this.amountEditable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final e getWarning() {
        return this.warning;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.paymentMethod, cVar.paymentMethod) && Intrinsics.f(this.amount, cVar.amount) && Intrinsics.f(this.min, cVar.min) && Intrinsics.f(this.max, cVar.max) && this.amountEditable == cVar.amountEditable && Intrinsics.f(this.warning, cVar.warning);
    }

    public final int hashCode() {
        int iJ = v7.j(this.amount, this.paymentMethod.hashCode() * 31, 31);
        jo3.a aVar = this.min;
        int iHashCode = (iJ + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.max;
        int iC = j6.a.c((iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31, this.amountEditable);
        e eVar = this.warning;
        return iC + (eVar != null ? eVar.hashCode() : 0);
    }
}
