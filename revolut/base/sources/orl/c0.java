package orl;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lorl/c0;", "Lorl/e0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "mode", "", "Ljava/util/List;", "()Ljava/util/List;", "ids", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("mode")
    @NotNull
    private final String mode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("ids")
    private final List<String> ids;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getIds() {
        return this.ids;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.mode, c0Var.mode) && Intrinsics.f(this.ids, c0Var.ids);
    }

    public final int hashCode() {
        int iHashCode = this.mode.hashCode() * 31;
        List<String> list = this.ids;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
