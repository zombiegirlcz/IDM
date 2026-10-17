package zxb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.impl.ui.RevPointsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements xki.c, o0c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsFlowContract$InputData f326219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f326220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f326221c = this;
    public final e4m.e d;

    public m(e eVar, RevPointsFlowContract$InputData revPointsFlowContract$InputData) {
        this.f326220b = eVar;
        this.f326219a = revPointsFlowContract$InputData;
        this.d = e4m.b.b(new zu8.r(eVar, this, 12));
    }

    @Override // o0c.b
    public final o0c.a b() {
        return new g0(this.f326220b, this.f326221c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
