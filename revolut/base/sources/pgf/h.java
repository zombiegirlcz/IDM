package pgf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenContentRecyclerView f235917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionsScreenContract$InputData f235918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f235919c;
    public final f d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f235920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f235921h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f235922j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f235923l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f235924m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f235925n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f235926p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f235927q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f235928r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f235929s;

    public h(e eVar, f fVar, ViewController viewController, ScreenContentRecyclerView screenContentRecyclerView, TransactionsScreenContract$InputData transactionsScreenContract$InputData) {
        this.f235919c = eVar;
        this.d = fVar;
        this.f235917a = screenContentRecyclerView;
        this.f235918b = transactionsScreenContract$InputData;
        int i = 29;
        this.e = e4m.b.b(new ned.h(eVar, fVar, this, 1, i));
        this.f = e4m.b.b(new ned.h(eVar, fVar, this, 0, i));
        this.f235920g = e4m.b.b(e4m.c.a(viewController));
        this.f235921h = e4m.b.b(new ned.h(eVar, fVar, this, 4, i));
        this.i = e4m.b.b(new ned.h(eVar, fVar, this, 3, i));
        this.f235922j = e4m.b.b(new ned.h(eVar, fVar, this, 2, i));
        this.k = e4m.b.b(new ned.h(eVar, fVar, this, 7, i));
        this.f235923l = e4m.b.b(new ned.h(eVar, fVar, this, 6, i));
        this.f235924m = e4m.b.b(new ned.h(eVar, fVar, this, 5, i));
        this.f235925n = e4m.b.b(new ned.h(eVar, fVar, this, 8, i));
        this.o = e4m.b.b(new ned.h(eVar, fVar, this, 10, i));
        this.f235926p = e4m.b.b(new ned.h(eVar, fVar, this, 11, i));
        this.f235927q = e4m.b.b(new ned.h(eVar, fVar, this, 13, i));
        this.f235928r = e4m.b.b(new ned.h(eVar, fVar, this, 12, i));
        this.f235929s = e4m.b.b(new ned.h(eVar, fVar, this, 9, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f235925n.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f235922j.get(), (yji.d) this.f235924m.get());
    }
}
