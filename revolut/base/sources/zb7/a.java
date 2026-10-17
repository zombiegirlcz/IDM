package zb7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f320831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f320832b;

    public a(String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f320831a = id10;
        this.f320832b = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f320831a, aVar.f320831a) && Intrinsics.f(this.f320832b, aVar.f320832b);
    }

    public final int hashCode() {
        return this.f320832b.hashCode() + (this.f320831a.hashCode() * 31);
    }
}
