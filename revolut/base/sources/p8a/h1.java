package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.impl.flow.pix_area.screens.my_aliases.MyAliasesScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class h1 implements uaa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MyAliasesScreenContract$InputData f233980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f233981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f233982c;
    public final e4m.e d;

    public h1(d0 d0Var, n nVar, MyAliasesScreenContract$InputData myAliasesScreenContract$InputData) {
        this.f233981b = d0Var;
        this.f233982c = nVar;
        this.f233980a = myAliasesScreenContract$InputData;
        this.d = e4m.b.b(new p2k.c(d0Var, this, 15));
    }

    @Override // uaa.a
    public final taa.k a() {
        return (taa.k) this.d.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f233982c.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
