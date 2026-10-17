package g9g;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f141806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f141807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f141808c;

    public s(d dVar, n nVar) {
        this.f141806a = dVar;
        int i = 26;
        this.f141807b = e4m.b.b(new fta.e(dVar, this, 1, i));
        this.f141808c = e4m.b.b(new fta.e(dVar, this, 0, i));
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
