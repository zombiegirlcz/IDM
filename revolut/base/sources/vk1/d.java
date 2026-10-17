package vk1;

import com.revolut.feature.alipay.impl.ui.qr.AlipayPlusQrFlowContract$Page;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AlipayPlusQrFlowContract$Page f289848a;

    public d(AlipayPlusQrFlowContract$Page page) {
        Intrinsics.checkNotNullParameter(page, "page");
        this.f289848a = page;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f289848a, ((d) obj2).f289848a);
    }

    public final int hashCode() {
        return this.f289848a.hashCode();
    }
}
