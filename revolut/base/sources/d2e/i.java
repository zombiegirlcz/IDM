package d2e;

import com.revolut.feature.store.api.model.StoreAuctionOffer;
import com.revolut.feature.store.api.model.StoreComingSoonProductOffer;
import com.revolut.feature.store.api.model.StoreExclusivesOfferContext;
import com.revolut.feature.store.api.model.StoreLockedProductOffer;
import com.revolut.feature.store.api.model.StoreProductOffer;
import com.revolut.feature.store.api.model.StoreSoldOutProductOffer;
import f2e.d2;
import f2e.d5;
import f2e.m0;
import f2e.z3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import t1e.g0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class i {
    public static final StoreExclusivesOfferContext a(z3 z3Var, f2e.g gVar, d5 d5Var, d2 d2Var, m0 m0Var) {
        if (z3Var != null) {
            Intrinsics.checkNotNullParameter(z3Var, "<this>");
            return new StoreExclusivesOfferContext.Product(new StoreProductOffer(qvb.a.d(z3Var.d), z3Var.f131777a, z3Var.f131778b, z3Var.f131779c, z3Var.e));
        }
        if (gVar != null) {
            Intrinsics.checkNotNullParameter(gVar, "<this>");
            return new StoreExclusivesOfferContext.Auction(new StoreAuctionOffer(qvb.a.d(gVar.f131595c), gVar.f131593a, gVar.f131594b, gVar.d, gVar.e));
        }
        g0 g0Var = null;
        if (d5Var == null) {
            if (d2Var != null) {
                Intrinsics.checkNotNullParameter(d2Var, "<this>");
                return new StoreExclusivesOfferContext.LockedProduct(new StoreLockedProductOffer(d2Var.f131565a, d2Var.f131566b, d2Var.f131567c, d2Var.d));
            }
            if (m0Var == null) {
                return null;
            }
            Intrinsics.checkNotNullParameter(m0Var, "<this>");
            return new StoreExclusivesOfferContext.ComingSoonProduct(new StoreComingSoonProductOffer(m0Var.f131655a, m0Var.f131656b));
        }
        Intrinsics.checkNotNullParameter(d5Var, "<this>");
        String str = d5Var.f131570a;
        String str2 = d5Var.f131571b;
        String str3 = d5Var.f131572c;
        g0[] g0VarArrValues = g0.values();
        int length = g0VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            g0 g0Var2 = g0VarArrValues[i];
            if (a0.z(g0Var2.name(), str3, true)) {
                g0Var = g0Var2;
                break;
            }
            i++;
        }
        if (g0Var == null) {
            g0Var = g0.UNKNOWN;
        }
        return new StoreExclusivesOfferContext.SoldOutProduct(new StoreSoldOutProductOffer(str, str2, g0Var));
    }
}
