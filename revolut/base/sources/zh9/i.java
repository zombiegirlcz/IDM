package zh9;

import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f322281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f322282c;
    public final wi0.b d;
    public final dj0.d e;
    public final h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f322283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f322284h;

    public i(String pocketId, b accountVariant, c balanceState, wi0.b countryCode, dj0.d totalToRepay, h hVar, d dVar, boolean z) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(accountVariant, "accountVariant");
        Intrinsics.checkNotNullParameter(balanceState, "balanceState");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(totalToRepay, "totalToRepay");
        this.f322280a = pocketId;
        this.f322281b = accountVariant;
        this.f322282c = balanceState;
        this.d = countryCode;
        this.e = totalToRepay;
        this.f = hVar;
        this.f322283g = dVar;
        this.f322284h = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f322280a, iVar.f322280a) && this.f322281b == iVar.f322281b && this.f322282c == iVar.f322282c && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f322283g, iVar.f322283g) && this.f322284h == iVar.f322284h;
    }

    public final int hashCode() {
        int iC = v7.c(p.a.c((this.f322282c.hashCode() + ((this.f322281b.hashCode() + (this.f322280a.hashCode() * 31)) * 31)) * 31, 31, this.d.f297794a), 31, this.e);
        h hVar = this.f;
        int iHashCode = (iC + (hVar == null ? 0 : hVar.hashCode())) * 31;
        d dVar = this.f322283g;
        return Boolean.hashCode(this.f322284h) + ((iHashCode + (dVar != null ? dVar.f322257a.hashCode() : 0)) * 31);
    }
}
