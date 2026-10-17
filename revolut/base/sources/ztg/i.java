package ztg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.progress.AccountClosureProgressScreenContract$InputData;
import java.util.Set;
import vc.s;
import z0h.s1;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f325136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountClosureProgressScreenContract$InputData f325137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f325138c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public i(n nVar, AccountClosureProgressScreenContract$InputData accountClosureProgressScreenContract$InputData, s1 s1Var) {
        this.f325138c = nVar;
        this.f325136a = s1Var;
        this.f325137b = accountClosureProgressScreenContract$InputData;
        int i = 5;
        this.d = e4m.b.b(new zpc.m(nVar, this, 0, i));
        this.e = e4m.b.b(new zpc.m(nVar, this, 2, i));
        this.f = e4m.b.b(new zpc.m(nVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        aah.h hVar = (aah.h) this.d.get();
        a0k.b.n(hVar);
        return ImmutableSet.of(hVar);
    }

    @Override // xki.e
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.f325138c.f325155m).d();
        s.j(iVarD);
        return ImmutableSet.of(a0k.b.l(iVarD, this.f325136a, (aah.h) this.d.get()));
    }
}
