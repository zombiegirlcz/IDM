package yr1;

import cli.j;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f316106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f316107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f316108c;

    public c(dj0.d serviceFee, dj0.d vat, dj0.d total) {
        Intrinsics.checkNotNullParameter(serviceFee, "serviceFee");
        Intrinsics.checkNotNullParameter(vat, "vat");
        Intrinsics.checkNotNullParameter(total, "total");
        this.f316106a = serviceFee;
        this.f316107b = vat;
        this.f316108c = total;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f316106a, cVar.f316106a) && Intrinsics.f(this.f316107b, cVar.f316107b) && Intrinsics.f(this.f316108c, cVar.f316108c);
    }

    public final int hashCode() {
        return this.f316108c.hashCode() + v7.c(this.f316106a.hashCode() * 31, 31, this.f316107b);
    }
}
