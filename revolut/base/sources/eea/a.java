package eea;

import com.revolut.feature.pockets.api.ui.mcy.PocketDetailsMcyDestination;
import com.revolut.kompot.common.ParcelableDestination;
import io3.l;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import lg0.g;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements xii.b {
    @Override // xii.b
    public final Set a() {
        return y0.b(gda.a.MCY_ACCOUNT_DETAILS.a());
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        l lVar;
        String strA;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        LinkedHashMap linkedHashMap = deeplink.f195041c;
        String strA2 = g.a("currency", linkedHashMap);
        if (strA2 == null) {
            return null;
        }
        xi0.b.Companion.getClass();
        xi0.b bVarA = xi0.a.a(strA2);
        String strA3 = g.a("pocketType", linkedHashMap);
        if (strA3 == null) {
            return null;
        }
        l[] lVarArrValues = l.values();
        int length = lVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                lVar = null;
                break;
            }
            lVar = lVarArrValues[i];
            if (a0.z(lVar.name(), strA3, true)) {
                break;
            }
            i++;
        }
        if (lVar == null || (strA = g.a("walletId", linkedHashMap)) == null) {
            return null;
        }
        return new PocketDetailsMcyDestination(bVarA, lVar, strA);
    }
}
