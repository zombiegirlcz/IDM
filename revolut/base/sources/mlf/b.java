package mlf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.crypto.card.linked_transaction.LinkedTransactionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import thf.m;
import vc.s;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f206711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedTransactionScreenContract$InputData f206712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f206713c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f206714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f206715h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f206716j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f206717l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f206718m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f206719n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f206720p;

    public b(d dVar, ViewController viewController, LinkedTransactionScreenContract$InputData linkedTransactionScreenContract$InputData) {
        this.f206713c = dVar;
        this.f206711a = viewController;
        this.f206712b = linkedTransactionScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 14;
        this.e = e4m.b.b(new mjl.b(dVar, this, 2, i));
        this.f = e4m.b.b(new mjl.b(dVar, this, 1, i));
        this.f206714g = e4m.b.b(new mjl.b(dVar, this, 0, i));
        this.f206715h = e4m.b.b(new mjl.b(dVar, this, 4, i));
        this.i = e4m.b.b(new mjl.b(dVar, this, 6, i));
        this.f206716j = e4m.b.b(new mjl.b(dVar, this, 5, i));
        this.k = e4m.b.b(new mjl.b(dVar, this, 7, i));
        this.f206717l = e4m.b.b(new mjl.b(dVar, this, 3, i));
        this.f206718m = e4m.b.b(new mjl.b(dVar, this, 8, i));
        this.f206719n = e4m.b.b(new mjl.b(dVar, this, 11, i));
        this.o = e4m.b.b(new mjl.b(dVar, this, 10, i));
        this.f206720p = e4m.b.b(new mjl.b(dVar, this, 9, i));
    }

    public final hof.d b() {
        wnf.b bVar = (wnf.b) this.f206719n.get();
        d dVar = this.f206713c;
        m mVarG = dVar.f206738h.g();
        s.j(mVarG);
        return new hof.d(bVar, mVarG, new hof.b(), dVar.f206754p.f(), dVar.f206736g.d(), dVar.f206756q.b(), dVar.f206757r.e(), new l4i.a(), new hof.e());
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f206718m.get(), (n) this.f206716j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f206714g.get(), (yji.d) this.f206717l.get());
    }
}
