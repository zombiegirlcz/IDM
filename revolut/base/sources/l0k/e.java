package l0k;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.marketnews.impl.flows.wealthassettypenews.WealthAssetTypeNewsFlowContract$InputData;
import java.util.Set;
import kyk.n;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements qji.a, i1k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthAssetTypeNewsFlowContract$InputData f191279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f191280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f191281c = this;
    public final e4m.e d;
    public final e4m.e e;

    public e(c cVar, WealthAssetTypeNewsFlowContract$InputData wealthAssetTypeNewsFlowContract$InputData) {
        this.f191280b = cVar;
        this.f191279a = wealthAssetTypeNewsFlowContract$InputData;
        int i = 3;
        this.d = e4m.b.b(new n(this, 0, i));
        this.e = e4m.b.b(new n(this, 1, i));
    }

    @Override // i1k.a
    public final j b() {
        return new j(this.f191280b, this.f191281c, 1);
    }

    public final ImmutableSet c() {
        c cVar = this.f191280b;
        m51.a aVar = cVar.f191266m;
        return ImmutableSet.of((c1k.b) new c1k.a(new zjh.f(((n51.a) aVar).b()), new i4b.f(cVar.f191262g.E()), new b1k.a()), new c1k.b(new zjh.j(((n51.a) aVar).b()), new b1k.b()));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
