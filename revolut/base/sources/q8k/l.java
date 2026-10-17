package q8k;

import com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f243152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PeerToPeerTransferDescriptor f243153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f243154c;

    public l(dj0.d amount, PeerToPeerTransferDescriptor result, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f243152a = amount;
        this.f243153b = result;
        this.f243154c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f243152a, lVar.f243152a) && Intrinsics.f(this.f243153b, lVar.f243153b) && this.f243154c == lVar.f243154c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f243154c) + ((this.f243153b.hashCode() + (this.f243152a.hashCode() * 31)) * 31);
    }
}
