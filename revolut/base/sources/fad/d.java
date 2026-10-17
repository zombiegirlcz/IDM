package fad;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u9d.b f133277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f133278b;

    public d() {
        this((u9d.b) null, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f133277a == dVar.f133277a && Intrinsics.f(this.f133278b, dVar.f133278b);
    }

    public final int hashCode() {
        u9d.b bVar = this.f133277a;
        return this.f133278b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    public d(u9d.b bVar, String searchInput) {
        Intrinsics.checkNotNullParameter(searchInput, "searchInput");
        this.f133277a = bVar;
        this.f133278b = searchInput;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d(u9d.b bVar, int i) {
        bVar = (i & 1) != 0 ? null : bVar;
        m70.a.c(t0.f186434a);
        this(bVar, "");
    }
}
