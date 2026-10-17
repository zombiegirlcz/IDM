package u2f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f276655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f276656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f276657c;
    public final String d;
    public final s e;

    public r(j product, u type, t source, String id10, s idType) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(idType, "idType");
        this.f276655a = product;
        this.f276656b = type;
        this.f276657c = source;
        this.d = id10;
        this.e = idType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f276655a == rVar.f276655a && this.f276656b == rVar.f276656b && this.f276657c == rVar.f276657c && Intrinsics.f(this.d, rVar.d) && this.e == rVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c((this.f276657c.hashCode() + ((this.f276656b.hashCode() + (this.f276655a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }
}
