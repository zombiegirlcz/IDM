package qgk;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class g1 implements khk.b, xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nik.c f245966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f245967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1 f245968c = this;
    public final e4m.e d = e4m.b.b(new f1(this, 0));

    public g1(i0 i0Var, nik.c cVar) {
        this.f245967b = i0Var;
        this.f245966a = cVar;
    }

    @Override // khk.b
    public final c2 b() {
        return new c2(this.f245967b, this.f245968c, 0);
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
