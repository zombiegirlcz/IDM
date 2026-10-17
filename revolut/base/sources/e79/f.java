package e79;

import com.google.common.collect.ImmutableSet;
import dw3.v7;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f123134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f123135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f123136c;

    public f(c cVar, e eVar) {
        this.f123134a = cVar;
        int i = 20;
        this.f123135b = e4m.b.b(new v7(cVar, this, 1, i));
        this.f123136c = e4m.b.b(new v7(cVar, this, 0, i));
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
