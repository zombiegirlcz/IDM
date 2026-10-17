package re9;

import com.google.common.collect.ImmutableSet;
import he9.f;
import he9.k;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements xki.c, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f253554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f253555b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f253556c;

    public b(a aVar) {
        this.f253554a = aVar;
        this.f253556c = e4m.b.b(new r8h.a(aVar, 4));
    }

    @Override // he9.k
    public final f b() {
        return new f(this.f253554a, this.f253555b, 5);
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
