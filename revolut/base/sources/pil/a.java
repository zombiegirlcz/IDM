package pil;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f236615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236616b;

    public a(wi0.b citizenship, String query) {
        Intrinsics.checkNotNullParameter(citizenship, "citizenship");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f236615a = citizenship;
        this.f236616b = query;
    }

    public final wi0.b a() {
        return this.f236615a;
    }

    public final String b() {
        return this.f236616b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f236615a, aVar.f236615a) && Intrinsics.f(this.f236616b, aVar.f236616b);
    }

    public final int hashCode() {
        return this.f236616b.hashCode() + (this.f236615a.f297794a.hashCode() * 31);
    }
}
