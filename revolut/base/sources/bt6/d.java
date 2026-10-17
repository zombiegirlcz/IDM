package bt6;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements xki.c, u27.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f18319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f18320b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f18321c;

    public d(b bVar) {
        this.f18319a = bVar;
        this.f18321c = e4m.b.b(new c(bVar));
    }

    @Override // u27.a
    public final b0 b() {
        return new b0(this.f18319a, this.f18320b, 0);
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
