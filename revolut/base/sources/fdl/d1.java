package fdl;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lfdl/d1;", "", "", "toString", "()Ljava/lang/String;", "", "Lfdl/u0;", "a", "Ljava/util/List;", "()Ljava/util/List;", "instruments", "Lfdl/w0;", "b", "Lfdl/w0;", "()Lfdl/w0;", "page", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("instruments")
    @NotNull
    private final List<u0> instruments;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("page")
    private final w0 page;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getInstruments() {
        return this.instruments;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final w0 getPage() {
        return this.page;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.instruments, d1Var.instruments) && Intrinsics.f(this.page, d1Var.page);
    }

    public final int hashCode() {
        int iHashCode = this.instruments.hashCode() * 31;
        w0 w0Var = this.page;
        return iHashCode + (w0Var == null ? 0 : w0Var.hashCode());
    }
}
