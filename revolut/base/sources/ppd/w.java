package ppd;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final urd.c f238565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f238566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f238567c;
    public final e4m.e d;

    public w(n nVar, u0 u0Var, urd.c cVar) {
        this.f238566b = nVar;
        this.f238565a = cVar;
        int i = 26;
        this.f238567c = e4m.b.b(new pa6.f(nVar, this, 0, i));
        this.d = e4m.b.b(new pa6.f(nVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f238567c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
