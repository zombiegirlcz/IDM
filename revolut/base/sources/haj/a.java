package haj;

import kotlin.jvm.internal.Intrinsics;
import xi0.b;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f150521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9l.a f150522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vel.a f150523c;

    public a(b currency, n9l.a aVar, vel.a aVar2) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f150521a = currency;
        this.f150522b = aVar;
        this.f150523c = aVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f150521a, aVar.f150521a) && Intrinsics.f(this.f150522b, aVar.f150522b) && Intrinsics.f(this.f150523c, aVar.f150523c);
    }

    public final int hashCode() {
        int iHashCode = this.f150521a.hashCode() * 31;
        n9l.a aVar = this.f150522b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        vel.a aVar2 = this.f150523c;
        return iHashCode2 + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
