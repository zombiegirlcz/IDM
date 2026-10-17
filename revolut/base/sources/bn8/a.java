package bn8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rcd.a f17121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17122b;

    public a(rcd.a savingRequest, String maxSavingProductInterestRate) {
        Intrinsics.checkNotNullParameter(savingRequest, "savingRequest");
        Intrinsics.checkNotNullParameter(maxSavingProductInterestRate, "maxSavingProductInterestRate");
        this.f17121a = savingRequest;
        this.f17122b = maxSavingProductInterestRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f17121a, aVar.f17121a) && Intrinsics.f(this.f17122b, aVar.f17122b);
    }

    public final int hashCode() {
        return this.f17122b.hashCode() + (this.f17121a.hashCode() * 31);
    }
}
