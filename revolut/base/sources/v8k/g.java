package v8k;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import java.util.Set;
import us6.r2;
import yji.n;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements xki.c, fri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerTransferInputData f286852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f286853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f286854c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f286855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f286856h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f286857j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f286858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f286859m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f286860n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f286861p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f286862q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f286863r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f286864s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f286865t;
    public final e4m.e u;

    public g(c cVar, ViewController viewController, PeerToPeerTransferInputData peerToPeerTransferInputData) {
        this.f286853b = cVar;
        this.f286852a = peerToPeerTransferInputData;
        int i = 9;
        this.d = e4m.b.b(new r2(cVar, this, 0, i));
        this.e = e4m.b.b(new r2(cVar, this, 1, i));
        this.f = e4m.b.b(new r2(cVar, this, 2, i));
        this.f286855g = e4m.b.b(new r2(cVar, this, 3, i));
        this.f286856h = e4m.b.b(new r2(cVar, this, 5, i));
        this.i = e4m.b.b(new r2(cVar, this, 4, i));
        this.f286857j = e4m.b.b(new r2(cVar, this, 6, i));
        this.k = e4m.b.b(new r2(cVar, this, 9, i));
        this.f286858l = e4m.b.b(new r2(cVar, this, 8, i));
        this.f286859m = e4m.b.b(new r2(cVar, this, 7, i));
        this.f286860n = e4m.b.b(new r2(cVar, this, 10, i));
        this.o = e4m.b.b(new r2(cVar, this, 11, i));
        this.f286861p = e4m.b.b(e4m.c.a(viewController));
        int i2 = 9;
        this.f286862q = e4m.b.b(new r2(cVar, this, 12, i2));
        this.f286863r = e4m.b.b(new r2(cVar, this, 13, i2));
        this.f286864s = e4m.b.b(new r2(cVar, this, 14, i2));
        this.f286865t = e4m.b.b(new r2(cVar, this, 15, i2));
        this.u = e4m.b.b(new r2(cVar, this, 16, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.i.get(), (n) this.f286857j.get(), (n) this.f286859m.get(), (n) this.f286860n.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get(), (yji.d) this.e.get(), (yji.d) this.f.get(), (yji.d) this.f286855g.get());
    }
}
