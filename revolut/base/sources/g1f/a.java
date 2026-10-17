package g1f;

import aii.e;
import kotlin.jvm.internal.Intrinsics;
import u2f.j;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f139583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f139584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f139585c;

    public a(String agentId, String name, j product) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f139583a = product;
        this.f139584b = agentId;
        this.f139585c = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f139583a == aVar.f139583a && Intrinsics.f(this.f139584b, aVar.f139584b) && Intrinsics.f(this.f139585c, aVar.f139585c);
    }

    public final int hashCode() {
        return this.f139585c.hashCode() + p.a.c(this.f139583a.hashCode() * 31, 31, this.f139584b);
    }
}
