package ow9;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements qji.a, bpg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f230331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f230332b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f230333c = e4m.b.b(new m0m.a(28));

    public b(a aVar) {
        this.f230331a = aVar;
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // bpg.b
    public final bpg.a j() {
        return new c(this.f230331a, this.f230332b);
    }
}
