package qw7;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements uw7.b, qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f249816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f249817b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f249818c = e4m.b.b(new p12.o(26));

    public f(e eVar) {
        this.f249816a = eVar;
    }

    @Override // uw7.b
    public final uw7.a b() {
        return new h(this.f249816a, this.f249817b);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
