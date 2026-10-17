package zxb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.impl.ui.wrapped.cards.RevPointsWrappedCardsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsWrappedCardsScreenContract$InputData f326109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f326110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f326111c;
    public final e4m.e d;
    public final e4m.e e;

    public c0(e eVar, d0 d0Var, ViewController viewController, RevPointsWrappedCardsScreenContract$InputData revPointsWrappedCardsScreenContract$InputData) {
        this.f326110b = eVar;
        this.f326109a = revPointsWrappedCardsScreenContract$InputData;
        this.f326111c = e4m.b.b(e4m.c.a(viewController));
        int i = 3;
        this.d = e4m.b.b(new s(eVar, this, 0, i));
        this.e = e4m.b.b(new s(eVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
