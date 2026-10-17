package njg;

import com.revolut.feature.trusted_merchants.impl.ui.TrustedMerchantsFlowContract$MerchantsContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrustedMerchantsFlowContract$MerchantsContent f216508a;

    public b(TrustedMerchantsFlowContract$MerchantsContent merchantsContent) {
        Intrinsics.checkNotNullParameter(merchantsContent, "merchantsContent");
        this.f216508a = merchantsContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f216508a, ((b) obj2).f216508a);
    }

    public final int hashCode() {
        return this.f216508a.hashCode();
    }
}
