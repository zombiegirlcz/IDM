package w59;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements xki.c, d69.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f294735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f294736b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f294737c;

    public c(d dVar) {
        this.f294735a = dVar;
        this.f294737c = e4m.b.b(new vrg.a(dVar, 15));
    }

    @Override // d69.b
    public final d69.a b() {
        return new f(this.f294735a, this.f294736b);
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
