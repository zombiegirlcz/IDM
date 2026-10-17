package jg9;

import com.revolut.feature.apm.bills.billers.api.model.Biller;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Biller f173941a;

    public e(Biller value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f173941a = value;
    }

    @Override // jg9.f
    public final String a() {
        return p.a.p("SearchBiller(value=", this.f173941a.f61146b, ")");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f173941a, ((e) obj2).f173941a);
    }

    public final int hashCode() {
        return this.f173941a.hashCode();
    }
}
