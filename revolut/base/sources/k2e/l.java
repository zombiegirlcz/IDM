package k2e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.store.impl.ui.home.StoreHomeFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements xki.c, z2e.a, b3e.b, h3e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoreHomeFlowContract$InputData f180529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f180530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f180531c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public l(j jVar, StoreHomeFlowContract$InputData storeHomeFlowContract$InputData) {
        this.f180530b = jVar;
        this.f180529a = storeHomeFlowContract$InputData;
        int i = 9;
        this.d = e4m.b.b(new jqa.h(jVar, this, 1, i));
        this.e = e4m.b.b(new jqa.h(jVar, this, 0, i));
        this.f = e4m.b.b(new jqa.h(jVar, this, 2, i));
    }

    @Override // h3e.a
    public final u b() {
        return new u(this.f180530b, this.f180531c);
    }

    @Override // b3e.b
    public final b3e.a c() {
        return new r(this.f180530b, this.f180531c);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // z2e.a
    public final p j() {
        return new p(this.f180530b, this.f180531c);
    }
}
