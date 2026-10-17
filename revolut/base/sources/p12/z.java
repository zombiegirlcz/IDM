package p12;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class z implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c12.f f231827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmNewContactNavigation$InputData f231828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f231829c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f231830g;

    public z(v vVar, ApmNewContactNavigation$InputData apmNewContactNavigation$InputData, c12.f fVar) {
        this.f231829c = vVar;
        this.f231827a = fVar;
        this.f231828b = apmNewContactNavigation$InputData;
        int i = 27;
        this.d = e4m.b.b(new ove.w(vVar, this, 0, i));
        this.e = e4m.b.b(new ove.w(vVar, this, 2, i));
        this.f = e4m.b.b(new ove.w(vVar, this, 3, i));
        this.f231830g = e4m.b.b(new ove.w(vVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
