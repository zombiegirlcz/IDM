package t42;

import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m02.a f267843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentPocketInfo f267844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hrf.h f267845c;
    public final List d;

    public c(m02.a aVar, PaymentPocketInfo paymentPocketInfo, hrf.h errorState, List suggestions) {
        Intrinsics.checkNotNullParameter(errorState, "errorState");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f267843a = aVar;
        this.f267844b = paymentPocketInfo;
        this.f267845c = errorState;
        this.d = suggestions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f267843a, cVar.f267843a) && Intrinsics.f(this.f267844b, cVar.f267844b) && Intrinsics.f(this.f267845c, cVar.f267845c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        m02.a aVar = this.f267843a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        PaymentPocketInfo paymentPocketInfo = this.f267844b;
        return this.d.hashCode() + ((this.f267845c.hashCode() + ((iHashCode + (paymentPocketInfo != null ? paymentPocketInfo.hashCode() : 0)) * 31)) * 31);
    }
}
