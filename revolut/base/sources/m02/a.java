package m02;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import kotlin.jvm.internal.Intrinsics;
import r02.e;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmQuote f201040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f201041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f201042c;

    public a(ApmQuote apmQuote, e eVar, boolean z) {
        this.f201040a = apmQuote;
        this.f201041b = eVar;
        this.f201042c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f201040a, aVar.f201040a) && Intrinsics.f(this.f201041b, aVar.f201041b) && this.f201042c == aVar.f201042c;
    }

    public final int hashCode() {
        ApmQuote apmQuote = this.f201040a;
        int iHashCode = (apmQuote == null ? 0 : apmQuote.hashCode()) * 31;
        e eVar = this.f201041b;
        return Boolean.hashCode(this.f201042c) + ((iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 31);
    }
}
