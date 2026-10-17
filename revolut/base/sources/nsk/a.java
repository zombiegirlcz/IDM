package nsk;

import d5d.b;
import kotlin.jvm.internal.Intrinsics;
import yj1.e;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f218904b;

    public a(String id10, e queryParams) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        this.f218903a = id10;
        this.f218904b = queryParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f218903a, aVar.f218903a) && Intrinsics.f(this.f218904b, aVar.f218904b);
    }

    public final int hashCode() {
        return this.f218904b.hashCode() + (this.f218903a.hashCode() * 31);
    }
}
