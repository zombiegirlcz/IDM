package rob;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f255950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cfl.b f255951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f255952c;
    public final Map d;

    public d(ArrayList savingsAccountDetails, cfl.b bVar, i selectorType, Map teenNames) {
        Intrinsics.checkNotNullParameter(savingsAccountDetails, "savingsAccountDetails");
        Intrinsics.checkNotNullParameter(selectorType, "selectorType");
        Intrinsics.checkNotNullParameter(teenNames, "teenNames");
        this.f255950a = savingsAccountDetails;
        this.f255951b = bVar;
        this.f255952c = selectorType;
        this.d = teenNames;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f255950a.equals(dVar.f255950a) && this.f255951b == dVar.f255951b && this.f255952c == dVar.f255952c && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f255950a.hashCode() * 31;
        cfl.b bVar = this.f255951b;
        return this.d.hashCode() + ((this.f255952c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31);
    }
}
