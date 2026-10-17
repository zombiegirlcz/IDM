package xqc;

import cli.j;
import com.revolut.feature.salary_switch.impl.models.v2.PayrollSwitchCounterparty;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PayrollSwitchCounterparty f308149c;

    public d(String employerName, String cnpj, PayrollSwitchCounterparty counterparty) {
        Intrinsics.checkNotNullParameter(employerName, "employerName");
        Intrinsics.checkNotNullParameter(cnpj, "cnpj");
        Intrinsics.checkNotNullParameter(counterparty, "counterparty");
        this.f308147a = employerName;
        this.f308148b = cnpj;
        this.f308149c = counterparty;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f308147a, dVar.f308147a) && Intrinsics.f(this.f308148b, dVar.f308148b) && Intrinsics.f(this.f308149c, dVar.f308149c);
    }

    public final int hashCode() {
        return this.f308149c.hashCode() + p.a.c(this.f308147a.hashCode() * 31, 31, this.f308148b);
    }
}
