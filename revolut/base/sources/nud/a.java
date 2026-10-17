package nud;

import a0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f219298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f219299c;
    public final String d;
    public final Long e;

    public a(long j2, Long l2, String id10, String state, String productId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.f219297a = id10;
        this.f219298b = j2;
        this.f219299c = state;
        this.d = productId;
        this.e = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f219297a, aVar.f219297a) && this.f219298b == aVar.f219298b && Intrinsics.f(this.f219299c, aVar.f219299c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(d.c(this.f219297a.hashCode() * 31, 31, this.f219298b), 31, this.f219299c), 31, this.d);
        Long l2 = this.e;
        return iC + (l2 == null ? 0 : l2.hashCode());
    }
}
