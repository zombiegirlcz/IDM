package ev4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ll4.c0;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f129706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f129707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f129708c;
    public final List d;
    public final wi0.b e;

    public f(String facilityId, xi0.b currency, c0 c0Var, List statements, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(statements, "statements");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f129706a = facilityId;
        this.f129707b = currency;
        this.f129708c = c0Var;
        this.d = statements;
        this.e = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f129706a, fVar.f129706a) && Intrinsics.f(this.f129707b, fVar.f129707b) && Intrinsics.f(this.f129708c, fVar.f129708c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.f129707b, this.f129706a.hashCode() * 31, 31);
        c0 c0Var = this.f129708c;
        return this.e.f297794a.hashCode() + p.a.d((iJ + (c0Var == null ? 0 : c0Var.hashCode())) * 31, 31, this.d);
    }
}
