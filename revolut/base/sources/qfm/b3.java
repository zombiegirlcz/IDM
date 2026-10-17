package qfm;

import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes4.dex */
public final class b3 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IntRange f245379c;
    public final vf0.n d;

    public b3(efm.i iVar, IntRange intRange, vf0.n nVar) {
        super(iVar);
        this.f245379c = intRange;
        this.d = nVar;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        try {
            vim.f it8 = this.f245379c.iterator();
            try {
                if (!it8.hasNext()) {
                    yfm.d.c(aVar);
                } else {
                    this.f245362b.n(new a3(aVar, it8, this.d));
                }
            } catch (Throwable th10) {
                m70.a.u(th10);
                yfm.d.d(th10, aVar);
            }
        } catch (Throwable th11) {
            m70.a.u(th11);
            yfm.d.d(th11, aVar);
        }
    }
}
