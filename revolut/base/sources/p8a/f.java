package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.impl.flow.alias_registration.AliasRegistrationContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements xki.c, xca.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AliasRegistrationContract$InputData f233957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f233958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f233959c = this;
    public final e4m.e d = e4m.b.b(new p7c.a(this, 7));

    public f(d0 d0Var, AliasRegistrationContract$InputData aliasRegistrationContract$InputData) {
        this.f233958b = d0Var;
        this.f233957a = aliasRegistrationContract$InputData;
    }

    @Override // xca.a
    public final o1 b() {
        return new o1(this.f233958b, this.f233959c, 1);
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
