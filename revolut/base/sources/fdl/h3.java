package fdl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lfdl/h3;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "getAmountToWithdraw", "()Ljo3/a;", "amountToWithdraw", "Lfdl/f3;", "b", "Lfdl/f3;", "getAcceptedNotice", "()Lfdl/f3;", "acceptedNotice", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amountToWithdraw")
    @NotNull
    private final jo3.a amountToWithdraw;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("acceptedNotice")
    private final f3 acceptedNotice;

    public h3(jo3.a amountToWithdraw, f3 f3Var) {
        Intrinsics.checkNotNullParameter(amountToWithdraw, "amountToWithdraw");
        this.amountToWithdraw = amountToWithdraw;
        this.acceptedNotice = f3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj2;
        return Intrinsics.f(this.amountToWithdraw, h3Var.amountToWithdraw) && this.acceptedNotice == h3Var.acceptedNotice;
    }

    public final int hashCode() {
        int iHashCode = this.amountToWithdraw.hashCode() * 31;
        f3 f3Var = this.acceptedNotice;
        return iHashCode + (f3Var == null ? 0 : f3Var.hashCode());
    }
}
