package er5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f128552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f128553b;

    public f(List cryptoAddresses, List blockchains) {
        Intrinsics.checkNotNullParameter(cryptoAddresses, "cryptoAddresses");
        Intrinsics.checkNotNullParameter(blockchains, "blockchains");
        this.f128552a = cryptoAddresses;
        this.f128553b = blockchains;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f128552a, fVar.f128552a) && Intrinsics.f(this.f128553b, fVar.f128553b);
    }

    public final int hashCode() {
        return this.f128553b.hashCode() + (this.f128552a.hashCode() * 31);
    }
}
