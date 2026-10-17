package e16;

import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiBalance f121894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f121895b;

    public g(DeFiBalance deFiBalance, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(deFiBalance, "deFiBalance");
        this.f121894a = deFiBalance;
        this.f121895b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f121894a, gVar.f121894a) && Intrinsics.f(this.f121895b, gVar.f121895b);
    }

    public final int hashCode() {
        int iHashCode = this.f121894a.hashCode() * 31;
        dj0.d dVar = this.f121895b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
