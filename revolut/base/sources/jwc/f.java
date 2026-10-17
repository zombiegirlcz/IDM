package jwc;

import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.security_hub.impl.ui.LimitType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutboundTransactionLimit f178955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OutboundTransactionLimit f178956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LimitType f178957c;
    public final do3.n d;

    public f(OutboundTransactionLimit initialLimit, OutboundTransactionLimit updatedLimit, LimitType limitType, do3.n nVar) {
        Intrinsics.checkNotNullParameter(initialLimit, "initialLimit");
        Intrinsics.checkNotNullParameter(updatedLimit, "updatedLimit");
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        this.f178955a = initialLimit;
        this.f178956b = updatedLimit;
        this.f178957c = limitType;
        this.d = nVar;
    }

    public static f a(f fVar, OutboundTransactionLimit updatedLimit, do3.n nVar, int i) {
        OutboundTransactionLimit initialLimit = fVar.f178955a;
        if ((i & 2) != 0) {
            updatedLimit = fVar.f178956b;
        }
        LimitType limitType = fVar.f178957c;
        if ((i & 8) != 0) {
            nVar = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(initialLimit, "initialLimit");
        Intrinsics.checkNotNullParameter(updatedLimit, "updatedLimit");
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        return new f(initialLimit, updatedLimit, limitType, nVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f178955a, fVar.f178955a) && Intrinsics.f(this.f178956b, fVar.f178956b) && Intrinsics.f(this.f178957c, fVar.f178957c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f178957c.hashCode() + ((this.f178956b.hashCode() + (this.f178955a.hashCode() * 31)) * 31)) * 31;
        do3.n nVar = this.d;
        return iHashCode + (nVar == null ? 0 : nVar.hashCode());
    }
}
