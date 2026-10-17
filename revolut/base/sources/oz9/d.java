package oz9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow.TransferOnlyChatFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import lo5.p;
import ove.w;
import vc.s;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferOnlyChatFlowContract$InputData f231145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yz9.c f231146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f231147c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f231148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f231149h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f231150j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f231151l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f231152m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f231153n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f231154p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f231155q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f231156r;

    public d(c cVar, ViewController viewController, TransferOnlyChatFlowContract$InputData transferOnlyChatFlowContract$InputData, yz9.c cVar2) {
        this.f231147c = cVar;
        this.f231145a = transferOnlyChatFlowContract$InputData;
        this.f231146b = cVar2;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 12;
        this.e = e4m.b.b(new w(cVar, this, 2, i));
        this.f = e4m.b.b(new w(cVar, this, 4, i));
        this.f231148g = e4m.b.b(new w(cVar, this, 3, i));
        this.f231149h = e4m.b.b(new w(cVar, this, 1, i));
        this.i = e4m.b.b(new w(cVar, this, 0, i));
        this.f231150j = e4m.b.b(new w(cVar, this, 5, i));
        this.k = e4m.b.b(new w(cVar, this, 6, i));
        this.f231151l = e4m.b.b(new w(cVar, this, 7, i));
        this.f231152m = e4m.b.b(new w(cVar, this, 8, i));
        this.f231153n = e4m.b.b(new w(cVar, this, 11, i));
        this.o = e4m.b.b(new w(cVar, this, 10, i));
        this.f231154p = e4m.b.b(new w(cVar, this, 9, i));
        this.f231155q = e4m.b.b(new w(cVar, this, 12, i));
        this.f231156r = e4m.b.b(new w(cVar, this, 13, i));
    }

    public final q0a.b b() {
        x2k.e eVar = new x2k.e();
        c cVar = this.f231147c;
        p pVarB = ((yo5.w) cVar.v).b();
        s.j(pVarB);
        oy1.b bVarB = cVar.f231142w.b();
        un9.a aVarD = cVar.f231143x.d();
        s.j(aVarD);
        return new q0a.b(eVar, pVarB, bVarB, aVarD);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f231151l.get(), (n) this.f231152m.get(), (n) this.f231154p.get(), (n) this.f231155q.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.i.get(), (yji.d) this.f231150j.get(), (yji.d) this.k.get());
    }
}
