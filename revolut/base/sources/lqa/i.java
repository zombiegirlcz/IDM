package lqa;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"Llqa/i;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "c", "()Ljo3/a;", "total", "Llqa/j;", "b", "Llqa/j;", "()Llqa/j;", "fee", "Llqa/k;", "Llqa/k;", "()Llqa/k;", "tax", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("total")
    @NotNull
    private final jo3.a total;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fee")
    @NotNull
    private final j fee;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("tax")
    @NotNull
    private final k tax;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final j getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final k getTax() {
        return this.tax;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getTotal() {
        return this.total;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.total, iVar.total) && Intrinsics.f(this.fee, iVar.fee) && Intrinsics.f(this.tax, iVar.tax);
    }

    public final int hashCode() {
        return this.tax.hashCode() + ((this.fee.hashCode() + (this.total.hashCode() * 31)) * 31);
    }
}
