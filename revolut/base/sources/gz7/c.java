package gz7;

import kotlin.jvm.internal.Intrinsics;
import zw7.d0;
import zw7.q0;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f147943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f147944b;

    public c(d0 d0Var, q0 petRenewalDetails) {
        Intrinsics.checkNotNullParameter(petRenewalDetails, "petRenewalDetails");
        this.f147943a = d0Var;
        this.f147944b = petRenewalDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f147943a, cVar.f147943a) && Intrinsics.f(this.f147944b, cVar.f147944b);
    }

    public final int hashCode() {
        d0 d0Var = this.f147943a;
        return this.f147944b.hashCode() + ((d0Var == null ? 0 : d0Var.hashCode()) * 31);
    }
}
