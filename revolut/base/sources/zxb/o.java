package zxb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.impl.ui.opt_in.screen.RevPointsOptInScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsOptInScreenContract$InputData f326230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f326231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f326232c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f326233g;

    public o(e eVar, RevPointsOptInScreenContract$InputData revPointsOptInScreenContract$InputData) {
        this.f326231b = eVar;
        this.f326230a = revPointsOptInScreenContract$InputData;
        int i = 28;
        this.f326232c = e4m.b.b(new zpc.m(eVar, this, 2, i));
        this.d = e4m.b.b(new zpc.m(eVar, this, 1, i));
        this.e = e4m.b.b(new zpc.m(eVar, this, 0, i));
        this.f = e4m.b.b(new zpc.m(eVar, this, 3, i));
        this.f326233g = e4m.b.b(new zpc.m(eVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
