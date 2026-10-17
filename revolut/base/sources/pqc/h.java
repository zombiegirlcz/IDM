package pqc;

import aii.r;
import com.revolut.feature.salary_switch.impl.models.v2.PayrollSwitchCounterparty;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f238721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f238722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PayrollSwitchCounterparty f238723c;

    public h(String employerName, String cnpj, PayrollSwitchCounterparty counterparty) {
        Intrinsics.checkNotNullParameter(employerName, "employerName");
        Intrinsics.checkNotNullParameter(cnpj, "cnpj");
        Intrinsics.checkNotNullParameter(counterparty, "counterparty");
        this.f238721a = employerName;
        this.f238722b = cnpj;
        this.f238723c = counterparty;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f238721a, hVar.f238721a) && Intrinsics.f(this.f238722b, hVar.f238722b) && Intrinsics.f(this.f238723c, hVar.f238723c);
    }

    public final int hashCode() {
        return this.f238723c.hashCode() + p.a.c(this.f238721a.hashCode() * 31, 31, this.f238722b);
    }
}
