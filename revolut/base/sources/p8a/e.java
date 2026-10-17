package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.impl.flow.pix_area.screens.alias_details.AliasDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AliasDetailsScreenContract$InputData f233949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f233950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f233951c;
    public final e4m.e d = e4m.b.b(new p7c.a(this, 6));

    public e(d0 d0Var, n nVar, AliasDetailsScreenContract$InputData aliasDetailsScreenContract$InputData) {
        this.f233950b = d0Var;
        this.f233951c = nVar;
        this.f233949a = aliasDetailsScreenContract$InputData;
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f233951c.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
