package qve;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import qgk.f1;

/* JADX INFO: loaded from: classes8.dex */
public final class s implements tye.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sye.e f249653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f249654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f249655c = e4m.b.b(new f1(this, 13));

    public s(k kVar, n nVar, sye.e eVar) {
        this.f249654b = nVar;
        this.f249653a = eVar;
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
        n nVar = this.f249654b;
        builderBuilderWithExpectedSize.addAll((Iterable) nVar.f249640s.get());
        return j6.a.g(nVar.f249639r, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
