package kye;

import com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopUpTarget f190795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pte.a f190796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f190797c;
    public final PreselectedTopUpMethodId d;
    public final boolean e;
    public final dj0.d f;

    public n(TopUpTarget topUpTarget, pte.a topUpFlow, xi0.b currency, PreselectedTopUpMethodId preselectedTopUpMethodId, boolean z, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
        Intrinsics.checkNotNullParameter(topUpFlow, "topUpFlow");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f190795a = topUpTarget;
        this.f190796b = topUpFlow;
        this.f190797c = currency;
        this.d = preselectedTopUpMethodId;
        this.e = z;
        this.f = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f190795a, nVar.f190795a) && this.f190796b == nVar.f190796b && Intrinsics.f(this.f190797c, nVar.f190797c) && Intrinsics.f(this.d, nVar.d) && this.e == nVar.e && Intrinsics.f(this.f, nVar.f);
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.f190797c, (this.f190796b.hashCode() + (this.f190795a.hashCode() * 31)) * 31, 31);
        PreselectedTopUpMethodId preselectedTopUpMethodId = this.d;
        int iC = j6.a.c((iJ + (preselectedTopUpMethodId == null ? 0 : preselectedTopUpMethodId.hashCode())) * 31, 31, this.e);
        dj0.d dVar = this.f;
        return iC + (dVar != null ? dVar.hashCode() : 0);
    }
}
