package ix7;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0012"}, d2 = {"Lix7/c;", "", "", "toString", "()Ljava/lang/String;", "Lno3/b;", "a", "Lno3/b;", "b", "()Lno3/b;", "newAddress", "Ljo3/a;", "Ljo3/a;", "c", "()Ljo3/a;", "refund", "Ljava/lang/String;", "cancellationDate", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("newAddress")
    @NotNull
    private final no3.b newAddress;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("refund")
    @NotNull
    private final jo3.a refund;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellationDate")
    @NotNull
    private final String cancellationDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCancellationDate() {
        return this.cancellationDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final no3.b getNewAddress() {
        return this.newAddress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getRefund() {
        return this.refund;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.newAddress, cVar.newAddress) && Intrinsics.f(this.refund, cVar.refund) && Intrinsics.f(this.cancellationDate, cVar.cancellationDate);
    }

    public final int hashCode() {
        return this.cancellationDate.hashCode() + v7.j(this.refund, this.newAddress.hashCode() * 31, 31);
    }
}
