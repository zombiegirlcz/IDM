package t42;

import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferData f267849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferReviewInfo f267850b;

    public e(TransferData data, TransferReviewInfo transferInfo) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(transferInfo, "transferInfo");
        this.f267849a = data;
        this.f267850b = transferInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f267849a, eVar.f267849a) && Intrinsics.f(this.f267850b, eVar.f267850b);
    }

    public final int hashCode() {
        return this.f267850b.hashCode() + (this.f267849a.hashCode() * 31);
    }
}
