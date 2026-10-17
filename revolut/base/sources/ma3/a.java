package ma3;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.NaviCommand;
import gim.c;
import grl.k9;
import pi3.h;
import xfa.b;

/* JADX INFO: loaded from: classes21.dex */
public interface a {
    static Object a(a aVar, b bVar, NaviCommand naviCommand, h hVar, AnalyticsProduct.Retail retail, c cVar, int i) {
        if ((i & 1) != 0) {
            bVar = null;
        }
        if ((i & 8) != 0) {
            naviCommand = null;
        }
        if ((i & 32) != 0) {
            hVar = null;
        }
        if ((i & 128) != 0) {
            AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
            k9 k9Var = frl.a.f137496c;
            retail = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        }
        AnalyticsProduct.Retail retail2 = retail;
        return ((pa3.c) aVar).b(bVar, AccountId.Personal.f51414a, naviCommand, hVar, retail2, cVar);
    }
}
