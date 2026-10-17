package i1e;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f157616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f157617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0h.b f157618c;

    public g(Data transactions, boolean z, n0h.b bVar) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f157616a = transactions;
        this.f157617b = z;
        this.f157618c = bVar;
    }

    public static g a(g gVar, Data transactions, boolean z, n0h.b bVar, int i) {
        if ((i & 1) != 0) {
            transactions = gVar.f157616a;
        }
        if ((i & 2) != 0) {
            z = gVar.f157617b;
        }
        if ((i & 4) != 0) {
            bVar = gVar.f157618c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        return new g(transactions, z, bVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f157616a, gVar.f157616a) && this.f157617b == gVar.f157617b && Intrinsics.f(this.f157618c, gVar.f157618c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f157616a.hashCode() * 31, 31, this.f157617b);
        n0h.b bVar = this.f157618c;
        return iC + (bVar == null ? 0 : bVar.hashCode());
    }
}
