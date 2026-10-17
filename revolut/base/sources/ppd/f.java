package ppd;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final grd.b f238404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f238405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f238406c;
    public final e4m.e d;

    public f(n nVar, u0 u0Var, grd.b bVar) {
        this.f238405b = nVar;
        this.f238404a = bVar;
        int i = 20;
        this.f238406c = e4m.b.b(new pa6.f(nVar, this, 0, i));
        this.d = e4m.b.b(new pa6.f(nVar, this, 1, i));
    }

    public final w80.b b() {
        qd0.b languageProvider = this.f238405b.d.n();
        vc.s.j(languageProvider);
        hrd.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return v80.b.b(languageProvider, false, true, 10);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f238406c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
