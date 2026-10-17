package yra;

import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kqa.a f316178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f316179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hrf.h f316180c;
    public final PaymentPocketInfo d;

    public k(kqa.a aVar, List suggestions, hrf.h errorState, PaymentPocketInfo paymentPocketInfo) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(errorState, "errorState");
        this.f316178a = aVar;
        this.f316179b = suggestions;
        this.f316180c = errorState;
        this.d = paymentPocketInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f316178a, kVar.f316178a) && Intrinsics.f(this.f316179b, kVar.f316179b) && Intrinsics.f(this.f316180c, kVar.f316180c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        kqa.a aVar = this.f316178a;
        int iHashCode = (this.f316180c.hashCode() + p.a.d((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.f316179b)) * 31;
        PaymentPocketInfo paymentPocketInfo = this.d;
        return iHashCode + (paymentPocketInfo != null ? paymentPocketInfo.hashCode() : 0);
    }
}
