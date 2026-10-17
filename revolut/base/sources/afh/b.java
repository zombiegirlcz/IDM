package afh;

import aah.g;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.screens.financials.PrivateCompanyDetailsFinancialsController;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.l;
import i7d.i;
import i7d.o;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import vc.s;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f4067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f4068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f4069c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f4070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f4071h;

    public b(e eVar, c cVar, ViewController viewController, i iVar) {
        this.f4069c = eVar;
        this.f4067a = viewController;
        this.f4068b = iVar;
        this.d = e4m.b.b(new a1e.c(eVar, this, 0, 5));
        this.e = e4m.b.b(new a1e.c(eVar, this, 2, 5));
        this.f = e4m.b.b(new a1e.c(eVar, this, 1, 5));
        this.f4070g = e4m.b.b(new a1e.c(eVar, this, 4, 5));
        this.f4071h = e4m.b.b(new a1e.c(eVar, this, 3, 5));
    }

    @Override // xki.e
    public final Set f() {
        n nVarM = l.m((d1h.e) this.d.get());
        o oVar = (o) this.e.get();
        h7d.e.a(oVar);
        return ImmutableSet.of((o) nVarM, oVar);
    }

    @Override // xki.e
    public final Set g() {
        gah.f fVarA = ((u8h.b) this.f4069c.f4092g).a();
        s.j(fVarA);
        ifh.b.Companion.getClass();
        ViewController view = this.f4067a;
        Intrinsics.checkNotNullParameter(view, "view");
        g gVarL = l.l(fVarA, (PrivateCompanyDetailsFinancialsController) view, (d1h.e) this.d.get());
        i7d.n nVar = (i7d.n) this.f.get();
        h7d.c.a(nVar);
        return ImmutableSet.of((i7d.n) gVarL, nVar);
    }
}
