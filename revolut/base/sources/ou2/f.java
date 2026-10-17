package ou2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card.terminate.impl.ui.flow.screen.CardTerminateScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardTerminateScreenContract$InputData f229779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f229780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f229781c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f229782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f229783h;

    public f(d dVar, e eVar, BaseScreen baseScreen, CardTerminateScreenContract$InputData cardTerminateScreenContract$InputData) {
        this.f229779a = cardTerminateScreenContract$InputData;
        this.f229780b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 22;
        this.f229781c = e4m.b.b(new oi9.a(dVar, this, 2, i));
        this.d = e4m.b.b(new oi9.a(dVar, this, 1, i));
        this.e = e4m.b.b(new oi9.a(dVar, this, 0, i));
        this.f = e4m.b.b(new oi9.a(dVar, this, 4, i));
        this.f229782g = e4m.b.b(new oi9.a(dVar, this, 5, i));
        this.f229783h = e4m.b.b(new oi9.a(dVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
