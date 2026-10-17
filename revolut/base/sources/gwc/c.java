package gwc;

import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.security_hub.impl.ui.LimitType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutboundTransactionLimit f147306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LimitType f147307b;

    public c(OutboundTransactionLimit limit, LimitType limitType) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        this.f147306a = limit;
        this.f147307b = limitType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f147306a, cVar.f147306a) && Intrinsics.f(this.f147307b, cVar.f147307b);
    }

    public final int hashCode() {
        return this.f147307b.hashCode() + (this.f147306a.hashCode() * 31);
    }
}
