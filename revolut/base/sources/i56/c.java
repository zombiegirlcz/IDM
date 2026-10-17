package i56;

import com.revolut.feature.defi.common.models.domain.DeFiRate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeFiRate f158762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DeFiRate f158763c;

    public c(String valueLossPercent, DeFiRate midRate, DeFiRate executionRate) {
        Intrinsics.checkNotNullParameter(valueLossPercent, "valueLossPercent");
        Intrinsics.checkNotNullParameter(midRate, "midRate");
        Intrinsics.checkNotNullParameter(executionRate, "executionRate");
        this.f158761a = valueLossPercent;
        this.f158762b = midRate;
        this.f158763c = executionRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f158761a, cVar.f158761a) && Intrinsics.f(this.f158762b, cVar.f158762b) && Intrinsics.f(this.f158763c, cVar.f158763c);
    }

    public final int hashCode() {
        return this.f158763c.hashCode() + ((this.f158762b.hashCode() + (this.f158761a.hashCode() * 31)) * 31);
    }
}
