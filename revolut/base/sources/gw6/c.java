package gw6;

import com.revolut.feature.freelancer.common.models.FreelancerCustomer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerCustomer f147280a;

    public c(FreelancerCustomer customer) {
        Intrinsics.checkNotNullParameter(customer, "customer");
        this.f147280a = customer;
    }

    @Override // gw6.d
    public final String a() {
        return this.f147280a.f73283c;
    }

    @Override // gw6.d
    public final String b() {
        String str = this.f147280a.f73282b;
        if (str != null) {
            return str;
        }
        m70.a.c(t0.f186434a);
        return "";
    }

    @Override // gw6.d
    public final String c() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f147280a, ((c) obj2).f147280a);
    }

    public final int hashCode() {
        return this.f147280a.hashCode();
    }
}
