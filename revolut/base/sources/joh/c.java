package joh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth_discovery.impl.collection.popular_first_buy.PopularFirstBuyScreenContract$Input;
import java.util.Set;
import jm4.z3;
import z0h.s1;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f176973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PopularFirstBuyScreenContract$Input f176974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f176975c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public c(a aVar, PopularFirstBuyScreenContract$Input popularFirstBuyScreenContract$Input, s1 s1Var) {
        this.f176975c = aVar;
        this.f176973a = s1Var;
        this.f176974b = popularFirstBuyScreenContract$Input;
        int i = 15;
        this.d = e4m.b.b(new z3(aVar, this, 0, i));
        this.e = e4m.b.b(new z3(aVar, this, 2, i));
        this.f = e4m.b.b(new z3(aVar, this, 1, i));
    }

    @Override // sji.b
    public final Set f() {
        aah.h hVar = (aah.h) this.d.get();
        a0k.b.m(hVar);
        return ImmutableSet.of(hVar);
    }

    @Override // sji.b
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.f176975c.f176955a).d();
        vc.s.j(iVarD);
        return ImmutableSet.of(a0k.b.k(iVarD, this.f176973a, (aah.h) this.d.get()));
    }
}
