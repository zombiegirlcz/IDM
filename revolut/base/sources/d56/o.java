package d56;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class o {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.defi.common.models.dto.b f111386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c36.n f111387c;
    public final com.revolut.feature.defi.common.models.dto.b d;
    public final c36.n e;
    public final c36.q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f111388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c36.k f111389h;
    public final n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f111390j;
    public final String k;

    public /* synthetic */ o(int i, String str, com.revolut.feature.defi.common.models.dto.b bVar, c36.n nVar, com.revolut.feature.defi.common.models.dto.b bVar2, c36.n nVar2, c36.q qVar, String str2, c36.k kVar, n nVar3, long j2, String str3) {
        if (2047 != (i & 2047)) {
            j1.f(d.f111372a.getDescriptor(), i, 2047);
            throw null;
        }
        this.f111385a = str;
        this.f111386b = bVar;
        this.f111387c = nVar;
        this.d = bVar2;
        this.e = nVar2;
        this.f = qVar;
        this.f111388g = str2;
        this.f111389h = kVar;
        this.i = nVar3;
        this.f111390j = j2;
        this.k = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f111385a, oVar.f111385a) && Intrinsics.f(this.f111386b, oVar.f111386b) && Intrinsics.f(this.f111387c, oVar.f111387c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f111388g, oVar.f111388g) && Intrinsics.f(this.f111389h, oVar.f111389h) && Intrinsics.f(this.i, oVar.i) && this.f111390j == oVar.f111390j && Intrinsics.f(this.k, oVar.k);
    }

    public final int hashCode() {
        int iHashCode = (this.f111389h.hashCode() + p.a.c((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f111387c.hashCode() + ((this.f111386b.hashCode() + (this.f111385a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f111388g)) * 31;
        n nVar = this.i;
        return this.k.hashCode() + a0.d.c((iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31, 31, this.f111390j);
    }
}
