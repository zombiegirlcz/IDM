package e88;

import com.revolut.feature.junior.accounts.api.JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids;
import e4k.f;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import te8.z;
import w4l.h;
import wsg.n;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements mf1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f123626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kbb.c f123627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hj8.a f123628c;
    public final wsg.b d;
    public final z e;
    public final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f123629g;

    public e(gte.a featureToggleInteractor, kbb.c juniorConfigInteractor, hj8.a juniorProfileInteractor, wsg.b walletInteractor, z juniorProductsInteractor, n legacyWalletsInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        Intrinsics.checkNotNullParameter(legacyWalletsInteractor, "legacyWalletsInteractor");
        this.f123626a = featureToggleInteractor;
        this.f123627b = juniorConfigInteractor;
        this.f123628c = juniorProfileInteractor;
        this.d = walletInteractor;
        this.e = juniorProductsInteractor;
        this.f = legacyWalletsInteractor;
        this.f123629g = ne8.a.f214420c.a();
    }

    @Override // mf1.a
    public final Flow a() {
        boolean zC = ((jte.d) this.f123626a).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c);
        kbb.c cVar = this.f123627b;
        if (!zC) {
            return new a87.b(mo3.a.f(rd0.e.n(nim.a.v(rd0.e.b(cVar.L()), new f(25)), h0.f322473a), new e6e.a(3), new dob.a(12), new e6e.a(4)), 11);
        }
        akg.n nVarV = nim.a.v(rd0.e.b(cVar.L()), new f(25));
        nj8.n nVar = (nj8.n) this.f123628c;
        h hVar = h.f294642c;
        return new a6e.b(rd0.e.n(zi0.c.w(u0.i(nVarV, boh.f.e(u0.j(nVar.k(null, hVar), this.d.b(hVar), nim.a.v(rd0.e.b(this.e.a(null, false)), new f(26)), rd0.e.b(this.f.d0(null, hVar))), new e87.e(this, 1)), rd0.e.b(cVar.O(false)))), h0.f322473a), 4);
    }

    @Override // mf1.a
    public final String b() {
        return this.f123629g;
    }
}
