package ds2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kr2.e f117178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f117179b;

    public f(kr2.e blockedMerchant, Data blockedTransactions) {
        Intrinsics.checkNotNullParameter(blockedMerchant, "blockedMerchant");
        Intrinsics.checkNotNullParameter(blockedTransactions, "blockedTransactions");
        this.f117178a = blockedMerchant;
        this.f117179b = blockedTransactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f117178a, fVar.f117178a) && Intrinsics.f(this.f117179b, fVar.f117179b);
    }

    public final int hashCode() {
        return this.f117179b.hashCode() + (this.f117178a.hashCode() * 31);
    }
}
