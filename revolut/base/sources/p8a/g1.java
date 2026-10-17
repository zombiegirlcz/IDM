package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.impl.flow.pix_area.screens.my_aliases.MyAliasesScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class g1 implements uaa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MyAliasesScreenContract$InputData f233972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f233973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f233974c;

    public g1(d0 d0Var, o0 o0Var, MyAliasesScreenContract$InputData myAliasesScreenContract$InputData) {
        this.f233973b = d0Var;
        this.f233972a = myAliasesScreenContract$InputData;
        this.f233974c = e4m.b.b(new p2k.c(d0Var, this, 14));
    }

    @Override // uaa.a
    public final taa.k a() {
        return (taa.k) this.f233974c.get();
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
