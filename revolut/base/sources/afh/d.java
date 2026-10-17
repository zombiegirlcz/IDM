package afh;

import aah.g;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.screens.overview.PrivateCompanyDetailsOverviewController;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.l;
import i7d.i;
import i7d.o;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import vc.s;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f4084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f4085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f4086c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f4087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f4088h;

    public d(e eVar, c cVar, ViewController viewController, i iVar) {
        this.f4086c = eVar;
        this.f4084a = viewController;
        this.f4085b = iVar;
        this.d = e4m.b.b(new a1e.c(eVar, this, 0, 7));
        this.e = e4m.b.b(new a1e.c(eVar, this, 2, 7));
        this.f = e4m.b.b(new a1e.c(eVar, this, 1, 7));
        this.f4087g = e4m.b.b(new a1e.c(eVar, this, 4, 7));
        this.f4088h = e4m.b.b(new a1e.c(eVar, this, 3, 7));
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
        gah.f fVarA = ((u8h.b) this.f4086c.f4092g).a();
        s.j(fVarA);
        kfh.b.Companion.getClass();
        ViewController view = this.f4084a;
        Intrinsics.checkNotNullParameter(view, "view");
        g gVarL = l.l(fVarA, (PrivateCompanyDetailsOverviewController) view, (d1h.e) this.d.get());
        i7d.n nVar = (i7d.n) this.f.get();
        h7d.c.a(nVar);
        return ImmutableSet.of((i7d.n) gVarL, nVar);
    }
}
