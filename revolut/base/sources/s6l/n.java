package s6l;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015¨\u0006\u0017"}, d2 = {"Ls6l/n;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "d", "()Ljo3/b;", "total", "b", "fee", "", "Ls6l/j;", "c", "Ljava/util/List;", "()Ljava/util/List;", "taxes", "Ls6l/l;", "Ls6l/l;", "()Ls6l/l;", "quote", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("total")
    @NotNull
    private final jo3.b total;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fee")
    @NotNull
    private final jo3.b fee;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("taxes")
    private final List<j> taxes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("quote")
    private final l quote;

    public n(jo3.b total, jo3.b fee2, ArrayList arrayList, l lVar) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.total = total;
        this.fee = fee2;
        this.taxes = arrayList;
        this.quote = lVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l getQuote() {
        return this.quote;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getTaxes() {
        return this.taxes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.b getTotal() {
        return this.total;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.total, nVar.total) && Intrinsics.f(this.fee, nVar.fee) && Intrinsics.f(this.taxes, nVar.taxes) && Intrinsics.f(this.quote, nVar.quote);
    }

    public final int hashCode() {
        int iE = y.e(this.fee, this.total.hashCode() * 31, 31);
        List<j> list = this.taxes;
        int iHashCode = (iE + (list == null ? 0 : list.hashCode())) * 31;
        l lVar = this.quote;
        return iHashCode + (lVar != null ? lVar.hashCode() : 0);
    }
}
