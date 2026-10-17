package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.preapplication.PreApplicationChecksScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class e5 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PreApplicationChecksScreenContract$InputData f118646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mki.b f118647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f118648c;

    public e5(c1 c1Var, b1 b1Var, PreApplicationChecksScreenContract$InputData preApplicationChecksScreenContract$InputData, mki.b bVar) {
        this.f118646a = preApplicationChecksScreenContract$InputData;
        this.f118647b = bVar;
        this.f118648c = e4m.b.b(new w3(c1Var, this, 2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of(new c84.w((rg4.s) this.f118648c.get()));
    }
}
