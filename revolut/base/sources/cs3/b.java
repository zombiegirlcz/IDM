package cs3;

import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements Serializable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f108440g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f108441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f108442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f108443c;
    public final dj0.d d;
    public final dj0.d e;
    public final d f;

    static {
        dj0.c cVar = dj0.d.Companion;
        cVar.getClass();
        dj0.d dVar = dj0.d.e;
        cVar.getClass();
        cVar.getClass();
        d.Companion.getClass();
        f108440g = new b(dVar, dVar, dVar, null, null, d.f108444c);
    }

    public b(dj0.d loanMaxAmount, dj0.d loanMinAmount, dj0.d creditLimit, dj0.d dVar, dj0.d dVar2, d entryPoints) {
        Intrinsics.checkNotNullParameter(loanMaxAmount, "loanMaxAmount");
        Intrinsics.checkNotNullParameter(loanMinAmount, "loanMinAmount");
        Intrinsics.checkNotNullParameter(creditLimit, "creditLimit");
        Intrinsics.checkNotNullParameter(entryPoints, "entryPoints");
        this.f108441a = loanMaxAmount;
        this.f108442b = loanMinAmount;
        this.f108443c = creditLimit;
        this.d = dVar;
        this.e = dVar2;
        this.f = entryPoints;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f108441a, bVar.f108441a) && Intrinsics.f(this.f108442b, bVar.f108442b) && Intrinsics.f(this.f108443c, bVar.f108443c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(this.f108441a.hashCode() * 31, 31, this.f108442b), 31, this.f108443c);
        dj0.d dVar = this.d;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.e;
        return this.f.hashCode() + ((iHashCode + (dVar2 != null ? dVar2.hashCode() : 0)) * 31);
    }
}
