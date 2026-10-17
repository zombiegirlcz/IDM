package g22;

import cli.j;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f139762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmQuote f139763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f139764c;

    public b(ApmQuote apmQuote, dj0.d targetMoney, boolean z) {
        Intrinsics.checkNotNullParameter(targetMoney, "targetMoney");
        Intrinsics.checkNotNullParameter(apmQuote, "apmQuote");
        this.f139762a = targetMoney;
        this.f139763b = apmQuote;
        this.f139764c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f139762a, bVar.f139762a) && Intrinsics.f(this.f139763b, bVar.f139763b) && this.f139764c == bVar.f139764c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f139764c) + ((this.f139763b.hashCode() + (this.f139762a.hashCode() * 31)) * 31);
    }
}
