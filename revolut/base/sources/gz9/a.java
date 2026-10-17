package gz9;

import jq9.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jq9.b f147971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f147972b;

    public a(jq9.b bVar, t paymentRecipient) {
        Intrinsics.checkNotNullParameter(paymentRecipient, "paymentRecipient");
        this.f147971a = bVar;
        this.f147972b = paymentRecipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f147971a, aVar.f147971a) && Intrinsics.f(this.f147972b, aVar.f147972b);
    }

    public final int hashCode() {
        jq9.b bVar = this.f147971a;
        return this.f147972b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }
}
