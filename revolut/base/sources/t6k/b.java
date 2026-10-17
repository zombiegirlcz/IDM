package t6k;

import b3j.p;
import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.MoneyRequestDetailsContract$InputData;
import java.util.Set;
import t0b.l;
import thf.m;
import vc.s;
import yji.n;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequestDetailsContract$InputData f268361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f268362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f268363c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f268364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f268365h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f268366j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f268367l;

    public b(c cVar, ViewController viewController, MoneyRequestDetailsContract$InputData moneyRequestDetailsContract$InputData) {
        this.f268362b = cVar;
        this.f268361a = moneyRequestDetailsContract$InputData;
        this.f268363c = e4m.b.b(e4m.c.a(viewController));
        int i = 14;
        this.d = e4m.b.b(new l(cVar, this, 2, i));
        this.e = e4m.b.b(new l(cVar, this, 4, i));
        this.f = e4m.b.b(new l(cVar, this, 3, i));
        this.f268364g = e4m.b.b(new l(cVar, this, 1, i));
        this.f268365h = e4m.b.b(new l(cVar, this, 0, i));
        this.i = e4m.b.b(new l(cVar, this, 5, i));
        this.f268366j = e4m.b.b(new l(cVar, this, 6, i));
        this.k = e4m.b.b(new l(cVar, this, 7, i));
        this.f268367l = e4m.b.b(new l(cVar, this, 8, i));
    }

    public final b7k.b b() {
        c cVar = this.f268362b;
        wv9.e eVar = (wv9.e) ((s6k.b) cVar.d).F.get();
        s.j(eVar);
        m mVarG = cVar.f268375m.g();
        s.j(mVarG);
        z80.b bVarS = cVar.f268370c.s();
        s.j(bVarS);
        t2j.a aVar = cVar.k;
        return new b7k.b(eVar, mVarG, bVarS, ((p) aVar).a(), ((p) aVar).b());
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f268366j.get(), (n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f268365h.get(), (yji.d) this.i.get());
    }
}
