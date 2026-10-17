package qc9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.passcode.PasscodeScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;
import prk.k0;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements he9.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PasscodeScreenContract$InputData f244611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseScreen f244612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f244613c;
    public final d d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f244614g;

    public b(c cVar, d dVar, BaseScreen baseScreen, PasscodeScreenContract$InputData passcodeScreenContract$InputData) {
        this.f244613c = cVar;
        this.d = dVar;
        this.f244611a = passcodeScreenContract$InputData;
        this.f244612b = baseScreen;
        int i = 16;
        this.e = e4m.b.b(new k0(cVar, this, 1, i));
        this.f = e4m.b.b(new k0(cVar, this, 0, i));
        this.f244614g = e4m.g.a(new k0(cVar, this, 2, i));
    }

    @Override // he9.j
    public final de9.n a() {
        return (de9.n) this.f.get();
    }

    @Override // sji.b
    public final Set f() {
        yji.n nVar = (yji.n) this.d.f.get();
        fe9.h hVar = new fe9.h(this.f244613c.e.a());
        h7d.a.d(hVar);
        return ImmutableSet.of((fe9.h) nVar, hVar);
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of(h7d.a.c(j()));
    }

    @Override // he9.j
    public final a61.a h() {
        return this.f244613c.d.c();
    }

    @Override // he9.j
    public final j70.a i() {
        j70.a aVarK = this.f244613c.f244620j.k();
        s.j(aVarK);
        return aVarK;
    }

    @Override // he9.j
    public final fe9.a j() {
        return h7d.a.b(this.f244612b, (he9.c) this.f244614g.get());
    }

    @Override // he9.j
    public final de9.b k() {
        l.Companion.getClass();
        return new j();
    }
}
