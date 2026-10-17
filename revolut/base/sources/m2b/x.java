package m2b;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.cfd.impl.screens.withdraw.CfdWithdrawScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class x implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1h.j f201943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CfdWithdrawScreenContract$InputData f201944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f201945c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f201946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f201947h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f201948j;
    public final e4m.e k;

    public x(v vVar, w wVar, CfdWithdrawScreenContract$InputData cfdWithdrawScreenContract$InputData, d1h.j jVar) {
        this.f201945c = vVar;
        this.f201943a = jVar;
        this.f201944b = cfdWithdrawScreenContract$InputData;
        int i = 13;
        this.d = e4m.b.b(new lzk.b(vVar, this, 0, i));
        this.e = e4m.b.b(new lzk.b(vVar, this, 3, i));
        this.f = e4m.b.b(new lzk.b(vVar, this, 4, i));
        this.f201946g = e4m.b.b(new lzk.b(vVar, this, 5, i));
        this.f201947h = e4m.b.b(new lzk.b(vVar, this, 6, i));
        this.i = e4m.b.b(new lzk.b(vVar, this, 2, i));
        this.f201948j = e4m.b.b(new lzk.b(vVar, this, 7, i));
        this.k = e4m.b.b(new lzk.b(vVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of(dw3.l.m((d1h.e) this.d.get()));
    }

    @Override // xki.e
    public final Set g() {
        gah.f fVarA = ((u8h.b) this.f201945c.f201926j).a();
        vc.s.j(fVarA);
        return ImmutableSet.of(dw3.l.l(fVarA, this.f201943a, (d1h.e) this.d.get()));
    }
}
