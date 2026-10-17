package tqg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tpl.o;
import tq0.j;
import wsg.n;
import ypg.p;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends mqg.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ppg.b f273556h;
    public final ijb.a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(hj8.a juniorProfileInteractor, ijb.a savingsProductInteractor, o7.d validator, ppg.a customisedVaultInteractor, ppg.b vaultsInteractor, n walletInteractor) {
        super(juniorProfileInteractor, savingsProductInteractor, validator, customisedVaultInteractor, vaultsInteractor, walletInteractor);
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(customisedVaultInteractor, "customisedVaultInteractor");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        this.f273556h = vaultsInteractor;
        this.i = savingsProductInteractor;
    }

    @Override // ybb.d
    public final Flow c(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return rd0.e.e(mo3.a.g(boh.f.e(rd0.e.b(((p) this.f273556h).j(id10, w4l.h.f294642c)), new o(this, 2)), null, new j(2), 1), h0.f322473a, new tc6.d(3, 12, null));
    }

    @Override // mqg.e, ybb.d
    public final Flow h(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new go.g(new bcb.c(id10), 2);
    }
}
