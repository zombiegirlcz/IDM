package dmc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.robo.impl.ui.screen.transaction_details.RoboTransactionDetailsControllerContract$Input;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1h.a f116020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RoboTransactionDetailsControllerContract$Input f116021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f116022c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f116023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f116024h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f116025j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f116026l;

    public q(r rVar, ViewController viewController, RoboTransactionDetailsControllerContract$Input roboTransactionDetailsControllerContract$Input, v1h.a aVar) {
        this.f116022c = rVar;
        this.f116020a = aVar;
        this.f116021b = roboTransactionDetailsControllerContract$Input;
        this.d = e4m.b.b(e4m.c.a(viewController));
        this.e = e4m.b.b(new db1.f(rVar, this, 2, 22));
        this.f = e4m.b.b(new db1.f(rVar, this, 1, 22));
        this.f116023g = e4m.b.b(new db1.f(rVar, this, 0, 22));
        this.f116024h = e4m.b.b(new db1.f(rVar, this, 4, 22));
        this.i = e4m.b.b(new db1.f(rVar, this, 3, 22));
        this.f116025j = e4m.b.b(new db1.f(rVar, this, 5, 22));
        this.k = e4m.b.b(new db1.f(rVar, this, 6, 22));
        this.f116026l = e4m.b.b(new db1.f(rVar, this, 7, 22));
    }

    @Override // xki.e
    public final Set f() {
        Object extension = (glc.c) this.f116025j.get();
        aoc.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.n nVar = (yji.n) extension;
        vc.s.k(nVar);
        return ImmutableSet.of(nVar, (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f116023g.get(), (yji.d) this.i.get());
    }
}
