package g00;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h00.a f139247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h00.c f139248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f139249c;

    public c(h00.a country, h00.c documentType, e side) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(side, "side");
        this.f139247a = country;
        this.f139248b = documentType;
        this.f139249c = side;
    }

    @Override // xv.q
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f139247a == cVar.f139247a && this.f139248b == cVar.f139248b && this.f139249c == cVar.f139249c;
    }

    public final int hashCode() {
        return this.f139249c.hashCode() + ((this.f139248b.hashCode() + (this.f139247a.hashCode() * 31)) * 31);
    }
}
