package bxf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19672b;

    public a(String id10, String value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f19671a = id10;
        this.f19672b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f19671a, aVar.f19671a) && Intrinsics.f(this.f19672b, aVar.f19672b);
    }

    public final int hashCode() {
        return this.f19672b.hashCode() + (this.f19671a.hashCode() * 31);
    }
}
