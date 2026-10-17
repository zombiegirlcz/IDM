package jt1;

import com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData;
import com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BizumTransferData f178281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BizumTransferReviewInfo f178282b;

    public e(BizumTransferData data, BizumTransferReviewInfo transferInfo) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(transferInfo, "transferInfo");
        this.f178281a = data;
        this.f178282b = transferInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f178281a, eVar.f178281a) && Intrinsics.f(this.f178282b, eVar.f178282b);
    }

    public final int hashCode() {
        return this.f178282b.hashCode() + (this.f178281a.hashCode() * 31);
    }
}
