package a32;

import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.apm.core.models.payments_authorisations.ui.ApmPaymentAuthorisationUi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmProduct f1028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f1029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApmPaymentAuthorisationUi f1030c;
    public final z22.a d;
    public final Data e;

    public m(ApmProduct apmProduct, Data data, ApmPaymentAuthorisationUi uiConfig, z22.a aVar, Data extraData) {
        Intrinsics.checkNotNullParameter(apmProduct, "apmProduct");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(uiConfig, "uiConfig");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f1028a = apmProduct;
        this.f1029b = data;
        this.f1030c = uiConfig;
        this.d = aVar;
        this.e = extraData;
    }

    public static m a(m mVar, Data data, z22.a aVar, Data data2, int i) {
        ApmProduct apmProduct = mVar.f1028a;
        if ((i & 2) != 0) {
            data = mVar.f1029b;
        }
        Data data3 = data;
        ApmPaymentAuthorisationUi uiConfig = mVar.f1030c;
        if ((i & 8) != 0) {
            aVar = mVar.d;
        }
        z22.a aVar2 = aVar;
        if ((i & 16) != 0) {
            data2 = mVar.e;
        }
        Data extraData = data2;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(apmProduct, "apmProduct");
        Intrinsics.checkNotNullParameter(data3, "data");
        Intrinsics.checkNotNullParameter(uiConfig, "uiConfig");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        return new m(apmProduct, data3, uiConfig, aVar2, extraData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f1028a, mVar.f1028a) && Intrinsics.f(this.f1029b, mVar.f1029b) && Intrinsics.f(this.f1030c, mVar.f1030c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f1030c.hashCode() + kii.e.c(this.f1029b, this.f1028a.hashCode() * 31, 31)) * 31;
        z22.a aVar = this.d;
        return this.e.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }
}
