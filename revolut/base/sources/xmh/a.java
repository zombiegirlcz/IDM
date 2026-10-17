package xmh;

import kotlin.jvm.internal.Intrinsics;
import oel.l;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f307261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f307262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f307263c;

    public a(String ref2, String name, l summary) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.f307261a = ref2;
        this.f307262b = name;
        this.f307263c = summary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f307261a, aVar.f307261a) && Intrinsics.f(this.f307262b, aVar.f307262b) && Intrinsics.f(this.f307263c, aVar.f307263c);
    }

    public final int hashCode() {
        return this.f307263c.hashCode() + p.a.c(this.f307261a.hashCode() * 31, 31, this.f307262b);
    }
}
