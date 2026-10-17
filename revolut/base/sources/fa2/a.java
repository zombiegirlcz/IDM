package fa2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f133236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f133237c;
    public final f5j.a d;

    public a(String id10, String name, String value, f5j.a beneficiary) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        this.f133235a = id10;
        this.f133236b = name;
        this.f133237c = value;
        this.d = beneficiary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f133235a, aVar.f133235a) && Intrinsics.f(this.f133236b, aVar.f133236b) && Intrinsics.f(this.f133237c, aVar.f133237c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f133235a.hashCode() * 31, 31, this.f133236b), 31, this.f133237c);
    }
}
