package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AliasRegistrationType f233966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f233967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f233968c;
    public final e4m.e d;
    public final e4m.e e;

    public g(d0 d0Var, f fVar, AliasRegistrationType aliasRegistrationType) {
        this.f233966a = aliasRegistrationType;
        int i = 27;
        this.f233967b = e4m.b.b(new p12.f0(d0Var, this, 2, i));
        this.f233968c = e4m.b.b(new p12.f0(d0Var, this, 1, i));
        this.d = e4m.b.b(new p12.f0(d0Var, this, 0, i));
        this.e = e4m.b.b(new p12.f0(d0Var, this, 3, i));
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
