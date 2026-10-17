package l0k;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.WealthAllNewsContract$InputData;
import java.util.Set;
import vc.s;
import z0h.s1;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f191276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WealthAllNewsContract$InputData f191277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f191278c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public d(c cVar, WealthAllNewsContract$InputData wealthAllNewsContract$InputData, s1 s1Var) {
        this.f191278c = cVar;
        this.f191276a = s1Var;
        this.f191277b = wealthAllNewsContract$InputData;
        int i = 17;
        this.d = e4m.b.b(new kr9.m(cVar, this, 0, i));
        this.e = e4m.b.b(new kr9.m(cVar, this, 2, i));
        this.f = e4m.b.b(new kr9.m(cVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        aah.h hVar = (aah.h) this.d.get();
        a0k.b.n(hVar);
        return ImmutableSet.of(hVar);
    }

    @Override // xki.e
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.f191278c.f191264j).d();
        s.j(iVarD);
        return ImmutableSet.of(a0k.b.l(iVarD, this.f191276a, (aah.h) this.d.get()));
    }
}
