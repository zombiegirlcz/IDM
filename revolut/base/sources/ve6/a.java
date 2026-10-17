package ve6;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import tof.l1;
import wi0.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f288131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f288132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f288133c;
    public final b d;

    public a(String storedMethodId, l1 mcyExchangeRate, boolean z, b countryCode) {
        Intrinsics.checkNotNullParameter(storedMethodId, "storedMethodId");
        Intrinsics.checkNotNullParameter(mcyExchangeRate, "mcyExchangeRate");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f288131a = storedMethodId;
        this.f288132b = mcyExchangeRate;
        this.f288133c = z;
        this.d = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f288131a, aVar.f288131a) && Intrinsics.f(this.f288132b, aVar.f288132b) && this.f288133c == aVar.f288133c && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.f297794a.hashCode() + j6.a.c((this.f288132b.hashCode() + (this.f288131a.hashCode() * 31)) * 31, 31, this.f288133c);
    }
}
