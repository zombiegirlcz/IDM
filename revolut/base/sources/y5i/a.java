package y5i;

import aii.e;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyInputData f311090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1j.a f311091b;

    public a(MoveMoneyInputData inputData, ulf.b bVar, int i) {
        bVar = (i & 2) != 0 ? null : bVar;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f311090a = inputData;
        this.f311091b = bVar;
    }

    public final MoveMoneyInputData b() {
        return this.f311090a;
    }

    public final i1j.a c() {
        return this.f311091b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f311090a, aVar.f311090a) && Intrinsics.f(this.f311091b, aVar.f311091b);
    }

    public final int hashCode() {
        int iHashCode = this.f311090a.hashCode() * 31;
        i1j.a aVar = this.f311091b;
        return (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 961;
    }
}
