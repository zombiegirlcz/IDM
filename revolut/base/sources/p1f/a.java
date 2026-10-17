package p1f;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f231897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f231898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f231899c;
    public final c d;
    public final List e;

    public a(String id10, String product, String externalId, c loyaltyProgramme, List primaryAgents) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        Intrinsics.checkNotNullParameter(loyaltyProgramme, "loyaltyProgramme");
        Intrinsics.checkNotNullParameter(primaryAgents, "primaryAgents");
        this.f231897a = id10;
        this.f231898b = product;
        this.f231899c = externalId;
        this.d = loyaltyProgramme;
        this.e = primaryAgents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f231897a, aVar.f231897a) && Intrinsics.f(this.f231898b, aVar.f231898b) && Intrinsics.f(this.f231899c, aVar.f231899c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + p.a.c(p.a.c(this.f231897a.hashCode() * 31, 31, this.f231898b), 31, this.f231899c)) * 31);
    }
}
