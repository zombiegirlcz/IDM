package r12;

import com.revolut.feature.apm.core.api.product.ApmAani;
import com.revolut.feature.apm.core.api.product.ApmBizum;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.apm.core.api.product.ApmBreb;
import com.revolut.feature.apm.core.api.product.ApmIris;
import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import com.revolut.feature.apm.core.api.product.ApmPayId;
import com.revolut.feature.apm.core.api.product.ApmPix;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.apm.core.api.product.ApmQvik;
import com.revolut.feature.apm.core.api.product.ApmSpin;
import com.revolut.feature.apm.core.api.product.ApmUpi;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.tab.accounts.api.model.ProductAccountListAction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h {
    public static ProductAccountListAction a(ApmProduct apmProduct) {
        Intrinsics.checkNotNullParameter(apmProduct, "apmProduct");
        if (Intrinsics.f(apmProduct, ApmAani.f61807c)) {
            return null;
        }
        if (Intrinsics.f(apmProduct, ApmBizum.f61808c)) {
            return y02.e.f310104a;
        }
        if (Intrinsics.f(apmProduct, ApmBlik.f61809c)) {
            return y02.e.f310105b;
        }
        if (Intrinsics.f(apmProduct, ApmBreb.f61810c)) {
            return y02.e.f310106c;
        }
        if (Intrinsics.f(apmProduct, ApmIris.f61811c)) {
            return y02.e.d;
        }
        if (Intrinsics.f(apmProduct, ApmMultibanco.f61815c)) {
            return y02.e.e;
        }
        if (Intrinsics.f(apmProduct, ApmPayId.f61819c)) {
            return y02.e.f;
        }
        if (Intrinsics.f(apmProduct, ApmPix.f61820c)) {
            return y02.e.f310109j;
        }
        if (Intrinsics.f(apmProduct, ApmQvik.f61823c)) {
            return y02.e.f310107g;
        }
        if (Intrinsics.f(apmProduct, ApmWero.f61829c)) {
            return y02.e.f310108h;
        }
        if (Intrinsics.f(apmProduct, ApmSpin.f61827c)) {
            return null;
        }
        if (Intrinsics.f(apmProduct, ApmUpi.f61828c)) {
            return y02.e.i;
        }
        throw new NoWhenBranchMatchedException();
    }
}
