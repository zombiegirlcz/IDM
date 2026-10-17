package p12;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class x implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e12.b f231816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f231817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f231818c;
    public final e4m.e d;

    public x(v vVar, e12.b bVar) {
        this.f231816a = bVar;
        int i = 26;
        this.f231817b = e4m.b.b(new oai.s(this, 0, i));
        this.f231818c = e4m.b.b(new oai.s(this, 2, i));
        this.d = e4m.b.b(new oai.s(this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f231817b.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
