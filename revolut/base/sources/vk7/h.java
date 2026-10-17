package vk7;

import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claims_list.CFACClaimsListScreenContract$InputData;
import jki.p;
import kj7.o;
import kotlin.jvm.internal.Intrinsics;
import vfg.m;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CFACClaimsListScreenContract$InputData f289878p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final si7.a f289879q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f289880r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p stateMapper, CFACClaimsListScreenContract$InputData inputData, si7.a insuranceInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(insuranceInteractor, "insuranceInteractor");
        this.f289878p = inputData;
        this.f289879q = insuranceInteractor;
        this.f289880r = new d(0);
    }

    @Override // yji.l
    public final void I1() {
        dl7.a subtype = this.f289878p.f75138b.f115711a;
        fj7.b bVar = (fj7.b) this.f289879q;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        o oVar = (o) bVar.f135546a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        l.a1(this, rd0.e.b(oVar.d.f(subtype, false)), null, null, new m(this, null, 8), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f289880r;
    }
}
