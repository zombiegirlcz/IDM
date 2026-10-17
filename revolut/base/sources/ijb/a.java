package ijb;

import akg.n;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ncd.g;
import ncd.h;
import ncd.m;
import od0.i;
import olb.d;
import w4l.k;
import zhm.u;
import zi0.c;

/* JADX INFO: loaded from: classes6.dex */
public interface a {
    static /* synthetic */ n a(a aVar, h hVar, List list, List list2, k kVar, int i) {
        if ((i & 1) != 0) {
            hVar = h.PERSONAL;
        }
        if ((i & 2) != 0) {
            list = g.a();
        }
        if ((i & 4) != 0) {
            list2 = m.a();
        }
        if ((i & 8) != 0) {
            kVar = w4l.h.f294642c;
        }
        return ((d) aVar).g(list, list2, hVar, kVar);
    }

    static vkm.d b(a aVar, String productId) {
        d dVar = (d) aVar;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(productId, "productId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return dVar.f226368a.a(productId, loadingStrategy);
    }

    static /* synthetic */ n c(a aVar, List list, List list2, int i) {
        if ((i & 2) != 0) {
            list2 = m.a();
        }
        return ((d) aVar).h(list, list2);
    }

    static Flow d(a aVar, SavingsProductData productData) {
        d dVar = (d) aVar;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(productData, "productData");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        boolean zH = opg.a.h(productData);
        SavingsProduct savingsProduct = productData.f86683a;
        if (zH && savingsProduct.f86628r == h.PERSONAL) {
            return nim.a.v(dVar.h(u.c(savingsProduct.f86619c), u.c(m.ACTIVE)), new nmb.u(productData, 1));
        }
        i.Companion.getClass();
        return c.i(i.f224256b);
    }

    static /* synthetic */ Object e(a aVar, h hVar, gim.c cVar, int i) {
        if ((i & 1) != 0) {
            hVar = h.PERSONAL;
        }
        return ((d) aVar).m(hVar, (i & 2) == 0, cVar);
    }

    static n f(a aVar) {
        h savingsProductAccountType = h.PERSONAL;
        d dVar = (d) aVar;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(savingsProductAccountType, "savingsProductAccountType");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(dVar.j(g.a(), m.a(), savingsProductAccountType, loadingStrategy), new okk.d(8));
    }
}
