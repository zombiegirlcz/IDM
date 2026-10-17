package pt4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xp3.d f239599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xp3.d f239600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f239601c;

    public a(xp3.d dVar, xp3.d dVar2, List availableOptions) {
        Intrinsics.checkNotNullParameter(availableOptions, "availableOptions");
        this.f239599a = dVar;
        this.f239600b = dVar2;
        this.f239601c = availableOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f239599a == aVar.f239599a && this.f239600b == aVar.f239600b && Intrinsics.f(this.f239601c, aVar.f239601c);
    }

    public final int hashCode() {
        xp3.d dVar = this.f239599a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        xp3.d dVar2 = this.f239600b;
        return this.f239601c.hashCode() + ((iHashCode + (dVar2 != null ? dVar2.hashCode() : 0)) * 31);
    }
}
