package n36;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class x {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f211907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c36.n f211908c;
    public final com.revolut.feature.defi.common.models.dto.b d;
    public final c36.n e;
    public final q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f211909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f211910h;
    public final c36.k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f211911j;
    public final String k;

    public /* synthetic */ x(int i, String str, w wVar, c36.n nVar, com.revolut.feature.defi.common.models.dto.b bVar, c36.n nVar2, q qVar, t tVar, String str2, c36.k kVar, long j2, String str3) {
        if (2047 != (i & 2047)) {
            j1.f(m.f211895a.getDescriptor(), i, 2047);
            throw null;
        }
        this.f211906a = str;
        this.f211907b = wVar;
        this.f211908c = nVar;
        this.d = bVar;
        this.e = nVar2;
        this.f = qVar;
        this.f211909g = tVar;
        this.f211910h = str2;
        this.i = kVar;
        this.f211911j = j2;
        this.k = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f211906a, xVar.f211906a) && Intrinsics.f(this.f211907b, xVar.f211907b) && Intrinsics.f(this.f211908c, xVar.f211908c) && Intrinsics.f(this.d, xVar.d) && Intrinsics.f(this.e, xVar.e) && Intrinsics.f(this.f, xVar.f) && Intrinsics.f(this.f211909g, xVar.f211909g) && Intrinsics.f(this.f211910h, xVar.f211910h) && Intrinsics.f(this.i, xVar.i) && this.f211911j == xVar.f211911j && Intrinsics.f(this.k, xVar.k);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.f211908c.hashCode() + ((this.f211907b.hashCode() + (this.f211906a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        q qVar = this.f;
        return this.k.hashCode() + a0.d.c((this.i.hashCode() + p.a.c((this.f211909g.hashCode() + ((iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31)) * 31, 31, this.f211910h)) * 31, 31, this.f211911j);
    }
}
