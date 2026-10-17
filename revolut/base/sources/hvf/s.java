package hvf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transport.impl.ui.hub.tickets.TransportHubTicketsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseScreen f155953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransportHubTicketsScreenContract$InputData f155954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f155955c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f155956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f155957h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f155958j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f155959l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f155960m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f155961n;
    public final e4m.e o;

    public s(q qVar, r rVar, BaseScreen baseScreen, TransportHubTicketsScreenContract$InputData transportHubTicketsScreenContract$InputData) {
        this.f155955c = qVar;
        this.f155953a = baseScreen;
        this.f155954b = transportHubTicketsScreenContract$InputData;
        int i = 11;
        this.d = e4m.b.b(new hjg.b(qVar, this, 2, i));
        this.e = e4m.b.b(new hjg.b(qVar, this, 3, i));
        this.f = e4m.b.b(new hjg.b(qVar, this, 1, i));
        this.f155956g = e4m.b.b(new hjg.b(qVar, this, 0, i));
        this.f155957h = e4m.b.b(new hjg.b(qVar, this, 4, i));
        this.i = e4m.b.b(new hjg.b(qVar, this, 5, i));
        this.f155958j = e4m.b.b(new hjg.b(qVar, this, 7, i));
        this.k = e4m.b.b(new hjg.b(qVar, this, 6, i));
        this.f155959l = e4m.b.b(new hjg.b(qVar, this, 9, i));
        this.f155960m = e4m.b.b(new hjg.b(qVar, this, 8, i));
        this.f155961n = e4m.b.b(new hjg.b(qVar, this, 11, i));
        this.o = e4m.b.b(new hjg.b(qVar, this, 10, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f155955c.f155949n.get(), (yji.n) this.i.get(), (yji.n) this.k.get(), (yji.n) this.f155960m.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f155956g.get(), (yji.d) this.f155957h.get());
    }
}
