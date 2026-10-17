package z8k;

import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hrf.c f320218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f320219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PaymentPocketInfo f320220c;
    public final List d;
    public final hrf.h e;
    public final boolean f;

    public u(hrf.c cVar, long j2, PaymentPocketInfo paymentPocketInfo, List suggestions, hrf.h errorState, boolean z) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(errorState, "errorState");
        this.f320218a = cVar;
        this.f320219b = j2;
        this.f320220c = paymentPocketInfo;
        this.d = suggestions;
        this.e = errorState;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f320218a, uVar.f320218a) && this.f320219b == uVar.f320219b && Intrinsics.f(this.f320220c, uVar.f320220c) && Intrinsics.f(this.d, uVar.d) && Intrinsics.f(this.e, uVar.e) && this.f == uVar.f;
    }

    public final int hashCode() {
        hrf.c cVar = this.f320218a;
        int iC = a0.d.c((cVar == null ? 0 : cVar.hashCode()) * 31, 31, this.f320219b);
        PaymentPocketInfo paymentPocketInfo = this.f320220c;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + p.a.d((iC + (paymentPocketInfo != null ? paymentPocketInfo.hashCode() : 0)) * 31, 31, this.d)) * 31);
    }
}
