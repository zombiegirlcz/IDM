package nb2;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import ms1.s;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f213973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f213974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f213975c;

    public e(b bVar, d dVar) {
        this.f213973a = bVar;
        int i = 15;
        this.f213974b = e4m.b.b(new s(bVar, this, 1, i));
        this.f213975c = e4m.b.b(new s(bVar, this, 0, i));
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
