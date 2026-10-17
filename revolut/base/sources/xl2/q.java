package xl2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f306927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f306928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9l.a f306929c;

    public q(String id10, String str, v9l.a transaction) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f306927a = id10;
        this.f306928b = str;
        this.f306929c = transaction;
    }

    @Override // xl2.r
    public final String a() {
        return this.f306928b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f306927a, qVar.f306927a) && Intrinsics.f(this.f306928b, qVar.f306928b) && Intrinsics.f(this.f306929c, qVar.f306929c);
    }

    @Override // xl2.r
    public final String getId() {
        return this.f306927a;
    }

    public final int hashCode() {
        int iHashCode = this.f306927a.hashCode() * 31;
        String str = this.f306928b;
        return this.f306929c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
