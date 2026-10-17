package ix7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lix7/f0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "renewalDate", "", "Z", "c", "()Z", "isOptedIn", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "monthlyPayment", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("renewalDate")
    @NotNull
    private final String renewalDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("isOptedIn")
    private final boolean isOptedIn;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("monthlyPayment")
    @NotNull
    private final jo3.a monthlyPayment;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getMonthlyPayment() {
        return this.monthlyPayment;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRenewalDate() {
        return this.renewalDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsOptedIn() {
        return this.isOptedIn;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.renewalDate, f0Var.renewalDate) && this.isOptedIn == f0Var.isOptedIn && Intrinsics.f(this.monthlyPayment, f0Var.monthlyPayment);
    }

    public final int hashCode() {
        return this.monthlyPayment.hashCode() + j6.a.c(this.renewalDate.hashCode() * 31, 31, this.isOptedIn);
    }
}
