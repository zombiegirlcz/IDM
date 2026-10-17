package yc3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.cashback.impl.ui.pocket.details.CashbackPocketDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import ffk.t;
import java.util.Set;
import vc.s;
import xsl.q;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashbackPocketDetailsScreenContract$InputData f312449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseScreen f312450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f312451c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f312452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f312453h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f312454j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f312455l;

    public b(a aVar, h hVar, BaseScreen baseScreen, CashbackPocketDetailsScreenContract$InputData cashbackPocketDetailsScreenContract$InputData) {
        this.f312451c = aVar;
        this.f312449a = cashbackPocketDetailsScreenContract$InputData;
        this.f312450b = baseScreen;
        this.d = e4m.b.b(e4m.c.a(baseScreen));
        int i = 15;
        this.e = e4m.b.b(new q(aVar, this, 2, i));
        this.f = e4m.b.b(new q(aVar, this, 1, i));
        this.f312452g = e4m.b.b(new q(aVar, this, 0, i));
        this.f312453h = e4m.b.b(new q(aVar, this, 3, i));
        this.i = e4m.b.b(new q(aVar, this, 4, i));
        this.f312454j = e4m.b.b(new q(aVar, this, 6, i));
        this.k = e4m.b.b(new q(aVar, this, 5, i));
        this.f312455l = e4m.b.b(new q(aVar, this, 7, i));
    }

    public final jd3.k d() {
        a aVar = this.f312451c;
        bd3.a aVarA = aVar.f312437c.a();
        s.j(aVarA);
        t tVarF = aVar.d.f();
        s.j(tVarF);
        return new jd3.k(aVarA, tVarF, aVar.f312439h.b(), aVar.f312448t.c());
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((n) this.f312453h.get(), (n) this.i.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f312452g.get());
    }
}
