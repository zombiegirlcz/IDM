package pne;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f237729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f237730c;
    public final long d;
    public final h0 e;

    public /* synthetic */ o(int i, String str, c cVar, String str2, long j2, h0 h0Var) {
        if (31 != (i & 31)) {
            j1.f(m.f237727a.getDescriptor(), i, 31);
            throw null;
        }
        this.f237728a = str;
        this.f237729b = cVar;
        this.f237730c = str2;
        this.d = j2;
        this.e = h0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f237728a, oVar.f237728a) && Intrinsics.f(this.f237729b, oVar.f237729b) && Intrinsics.f(this.f237730c, oVar.f237730c) && this.d == oVar.d && Intrinsics.f(this.e, oVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + a0.d.c(p.a.c((this.f237729b.hashCode() + (this.f237728a.hashCode() * 31)) * 31, 31, this.f237730c), 31, this.d);
    }

    public o(String code, c limits, String taxYear, long j2, h0 validityPeriod) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(taxYear, "taxYear");
        Intrinsics.checkNotNullParameter(validityPeriod, "validityPeriod");
        this.f237728a = code;
        this.f237729b = limits;
        this.f237730c = taxYear;
        this.d = j2;
        this.e = validityPeriod;
    }
}
