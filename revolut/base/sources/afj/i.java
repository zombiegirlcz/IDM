package afj;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f4278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f4279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f4280c;

    public i(b bVar, m mVar) {
        this.f4278a = bVar;
        int i = 11;
        this.f4279b = e4m.b.b(new a1e.c(bVar, this, 1, i));
        this.f4280c = e4m.b.b(new a1e.c(bVar, this, 0, i));
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
