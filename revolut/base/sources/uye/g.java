package uye;

import com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopUpTarget f284275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pte.a f284276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f284277c;
    public final PreselectedTopUpMethodId d;
    public final boolean e;
    public final dj0.d f;

    public g(TopUpTarget target, pte.a topUpFlow, xi0.b currency, PreselectedTopUpMethodId preselectedTopUpMethodId, boolean z, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(topUpFlow, "topUpFlow");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f284275a = target;
        this.f284276b = topUpFlow;
        this.f284277c = currency;
        this.d = preselectedTopUpMethodId;
        this.e = z;
        this.f = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f284275a, gVar.f284275a) && this.f284276b == gVar.f284276b && Intrinsics.f(this.f284277c, gVar.f284277c) && Intrinsics.f(this.d, gVar.d) && this.e == gVar.e && Intrinsics.f(this.f, gVar.f);
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.f284277c, (this.f284276b.hashCode() + (this.f284275a.hashCode() * 31)) * 31, 31);
        PreselectedTopUpMethodId preselectedTopUpMethodId = this.d;
        int iC = j6.a.c((iJ + (preselectedTopUpMethodId == null ? 0 : preselectedTopUpMethodId.hashCode())) * 31, 31, this.e);
        dj0.d dVar = this.f;
        return iC + (dVar != null ? dVar.hashCode() : 0);
    }
}
