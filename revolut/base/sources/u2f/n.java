package u2f;

import java.time.Instant;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f276648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f276649c;
    public final Instant d;
    public final Instant e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f276650g;

    public n(String id10, j product, q state, Instant createdDate, Instant updatedDate, ArrayList transactions, m mVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f276647a = id10;
        this.f276648b = product;
        this.f276649c = state;
        this.d = createdDate;
        this.e = updatedDate;
        this.f = transactions;
        this.f276650g = mVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f276647a, nVar.f276647a) && this.f276648b == nVar.f276648b && this.f276649c == nVar.f276649c && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && this.f.equals(nVar.f) && Intrinsics.f(this.f276650g, nVar.f276650g);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, r6.b.c(r6.b.c((this.f276649c.hashCode() + ((this.f276648b.hashCode() + (this.f276647a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31);
        m mVar = this.f276650g;
        return iB + (mVar == null ? 0 : mVar.hashCode());
    }
}
