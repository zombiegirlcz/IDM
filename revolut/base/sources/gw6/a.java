package gw6;

import kotlin.jvm.internal.Intrinsics;
import n61.j;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f147278a;

    public a(f5j.a beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        this.f147278a = beneficiary;
    }

    @Override // gw6.d
    public final String a() {
        return this.f147278a.i;
    }

    @Override // gw6.d
    public final String b() {
        return j.c(this.f147278a);
    }

    @Override // gw6.d
    public final String c() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f147278a, ((a) obj2).f147278a);
    }

    public final int hashCode() {
        return this.f147278a.hashCode();
    }
}
