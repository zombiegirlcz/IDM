package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215713b;

    public b(String id10, String type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f215712a = id10;
        this.f215713b = type;
    }

    public final String a() {
        return this.f215712a;
    }

    public final String b() {
        return this.f215713b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f215712a, bVar.f215712a) && Intrinsics.f(this.f215713b, bVar.f215713b);
    }

    public final int hashCode() {
        return this.f215713b.hashCode() + (this.f215712a.hashCode() * 31);
    }
}
