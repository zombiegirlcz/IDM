package yod;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f315654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f315655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f315656c;
    public final long d;

    public b(int i, long j2, Clause title, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f315654a = id10;
        this.f315655b = title;
        this.f315656c = i;
        this.d = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f315654a, bVar.f315654a) && Intrinsics.f(this.f315655b, bVar.f315655b) && this.f315656c == bVar.f315656c && this.d == bVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + j6.a.b(this.f315656c, p.a.a(this.f315654a.hashCode() * 31, 31, this.f315655b), 31);
    }
}
