package qsa;

import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kqa.a f248772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferTrustData f248773b;

    public j(kqa.a aVar, TransferTrustData trustData) {
        Intrinsics.checkNotNullParameter(trustData, "trustData");
        this.f248772a = aVar;
        this.f248773b = trustData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f248772a, jVar.f248772a) && Intrinsics.f(this.f248773b, jVar.f248773b);
    }

    public final int hashCode() {
        kqa.a aVar = this.f248772a;
        return this.f248773b.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31);
    }
}
