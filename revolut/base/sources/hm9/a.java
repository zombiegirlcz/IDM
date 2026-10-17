package hm9;

import com.google.common.collect.ImmutableSet;
import hc2.r;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final um9.f f153542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f153543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f153544c;

    public a(b bVar, g gVar, um9.f fVar) {
        this.f153543b = bVar;
        this.f153542a = fVar;
        this.f153544c = e4m.b.b(new r(bVar, this, 3));
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
