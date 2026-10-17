package rt5;

import h30.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f257193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f257194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f257195c;
    public final d d;
    public final d e;

    public f(dj0.d combinedBalance, dj0.d dVar, xi0.b baseCurrency, d available, d dVar2) {
        Intrinsics.checkNotNullParameter(combinedBalance, "combinedBalance");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(available, "available");
        this.f257193a = combinedBalance;
        this.f257194b = dVar;
        this.f257195c = baseCurrency;
        this.d = available;
        this.e = dVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f257193a, fVar.f257193a) && Intrinsics.f(this.f257194b, fVar.f257194b) && Intrinsics.f(this.f257195c, fVar.f257195c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f257193a.hashCode() * 31;
        dj0.d dVar = this.f257194b;
        int iHashCode2 = (this.d.hashCode() + l.j(this.f257195c, (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31)) * 31;
        d dVar2 = this.e;
        return iHashCode2 + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
