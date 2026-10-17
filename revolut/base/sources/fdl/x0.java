package fdl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u000e\u0010\f¨\u0006\u0011"}, d2 = {"Lfdl/x0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "name", "", "b", "Z", "()Z", "canBuy", "c", "canSell", "canView", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("canBuy")
    private final boolean canBuy;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("canSell")
    private final boolean canSell;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("canView")
    private final boolean canView;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCanBuy() {
        return this.canBuy;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getCanSell() {
        return this.canSell;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCanView() {
        return this.canView;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.name, x0Var.name) && this.canBuy == x0Var.canBuy && this.canSell == x0Var.canSell && this.canView == x0Var.canView;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.canView) + j6.a.c(j6.a.c(this.name.hashCode() * 31, 31, this.canBuy), 31, this.canSell);
    }
}
