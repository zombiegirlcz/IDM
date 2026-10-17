package i1f;

import kotlin.jvm.internal.Intrinsics;
import u2f.j;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f157635b;

    public a(String agentId, j product) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f157634a = agentId;
        this.f157635b = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f157634a, aVar.f157634a) && this.f157635b == aVar.f157635b;
    }

    public final int hashCode() {
        return this.f157635b.hashCode() + (this.f157634a.hashCode() * 31);
    }
}
