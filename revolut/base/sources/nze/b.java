package nze;

import com.revolut.domain.models.topup.TopUpContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f221024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f221025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TopUpContext f221026c;

    public b(dj0.d amount, String mandateId, TopUpContext topUpContext) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        Intrinsics.checkNotNullParameter(topUpContext, "topUpContext");
        this.f221024a = amount;
        this.f221025b = mandateId;
        this.f221026c = topUpContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f221024a, bVar.f221024a) && Intrinsics.f(this.f221025b, bVar.f221025b) && Intrinsics.f(this.f221026c, bVar.f221026c);
    }

    public final int hashCode() {
        return this.f221026c.hashCode() + p.a.c(this.f221024a.hashCode() * 31, 31, this.f221025b);
    }
}
