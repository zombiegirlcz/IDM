package did;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f115030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f115031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f115032c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public j(d dVar) {
        this.f115030a = dVar;
        int i = 8;
        this.f115031b = e4m.b.b(new db1.f(dVar, this, 1, i));
        this.f115032c = e4m.b.b(new db1.f(dVar, this, 0, i));
        this.d = e4m.b.b(new db1.f(dVar, this, 3, i));
        this.e = e4m.b.b(new db1.f(dVar, this, 2, i));
        this.f = e4m.b.b(new db1.f(dVar, this, 4, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f115032c.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
