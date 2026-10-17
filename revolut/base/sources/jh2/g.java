package jh2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ljh2/g;", "Ljh2/j;", "", "toString", "()Ljava/lang/String;", "Lqx1/a;", "Lqx1/e;", "a", "Lqx1/a;", "()Lqx1/a;", "recipient", "Ljh2/m;", "b", "Ljh2/m;", "getDetails", "()Ljh2/m;", "details", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("recipient")
    @NotNull
    private final qx1.a<qx1.e> recipient;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("details")
    private final m details;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final qx1.a getRecipient() {
        return this.recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.recipient, gVar.recipient) && Intrinsics.f(this.details, gVar.details);
    }

    public final int hashCode() {
        int iHashCode = this.recipient.hashCode() * 31;
        m mVar = this.details;
        return iHashCode + (mVar == null ? 0 : mVar.hashCode());
    }
}
