package y77;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.global_markets.impl.ui.flow.index_details.IndexDetailsFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import xsl.q;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IndexDetailsFlowContract$InputData f311380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f311381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f311382c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f311383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f311384h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f311385j;
    public final e4m.e k;

    public e(c cVar, ViewController viewController, IndexDetailsFlowContract$InputData indexDetailsFlowContract$InputData) {
        this.f311381b = cVar;
        this.f311380a = indexDetailsFlowContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 11;
        this.e = e4m.b.b(new q(cVar, this, 2, i));
        this.f = e4m.b.b(new q(cVar, this, 1, i));
        this.f311383g = e4m.b.b(new q(cVar, this, 0, i));
        this.f311384h = e4m.b.b(new q(cVar, this, 4, i));
        this.i = e4m.b.b(new q(cVar, this, 5, i));
        this.f311385j = e4m.b.b(new q(cVar, this, 3, i));
        this.k = e4m.b.b(new q(cVar, this, 6, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f311383g.get());
    }
}
