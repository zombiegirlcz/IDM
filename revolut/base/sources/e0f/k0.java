package e0f;

import com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k0 extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopUpTarget f121626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pte.a f121627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f121628c;
    public final PreselectedTopUpMethodId d;
    public final boolean e;
    public final dj0.d f;

    public k0(TopUpTarget target, pte.a topUpFlow, xi0.b currency, PreselectedTopUpMethodId preselectedTopUpMethodId, boolean z, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(topUpFlow, "topUpFlow");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f121626a = target;
        this.f121627b = topUpFlow;
        this.f121628c = currency;
        this.d = preselectedTopUpMethodId;
        this.e = z;
        this.f = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f121626a, k0Var.f121626a) && this.f121627b == k0Var.f121627b && Intrinsics.f(this.f121628c, k0Var.f121628c) && Intrinsics.f(this.d, k0Var.d) && this.e == k0Var.e && Intrinsics.f(this.f, k0Var.f);
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.f121628c, (this.f121627b.hashCode() + (this.f121626a.hashCode() * 31)) * 31, 31);
        PreselectedTopUpMethodId preselectedTopUpMethodId = this.d;
        int iC = j6.a.c((iJ + (preselectedTopUpMethodId == null ? 0 : preselectedTopUpMethodId.hashCode())) * 31, 31, this.e);
        dj0.d dVar = this.f;
        return iC + (dVar != null ? dVar.hashCode() : 0);
    }
}
