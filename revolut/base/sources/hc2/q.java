package hc2;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements xki.c, xc2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f150823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f150824b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f150825c;

    public q(m mVar) {
        this.f150823a = mVar;
        this.f150825c = e4m.b.b(new gp8.c(mVar, 20));
    }

    @Override // xc2.b
    public final xc2.a b() {
        return new u(this.f150823a, this.f150824b, 0);
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
