package gsh;

import android.content.SharedPreferences;
import androidx.collection.ArrayMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends we0.g {
    public d0() {
        super(2, 3, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        String string = sharedPref.getString("widget_values", null);
        if (string == null) {
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("homeFeedWidgets", "Home");
        arrayMap.put("cryptoFeedWidgets", "RetailCryptoPortfolio");
        arrayMap.put("investFeedWidgets", "TradingPortfolioFeed");
        arrayMap.put("juniorAccountFeedWidgets", "HOME");
        rlm.b bVar = Json.d;
        JsonObject jsonObjectK = rlm.j.k(bVar.d(string));
        rlm.t tVar = new rlm.t();
        jsonObjectK.forEach(new c0(0, new fb.c(tVar, arrayMap, 8)));
        String strC = bVar.c(JsonObject.INSTANCE.serializer(), tVar.a());
        ij.e eVarEdit = sharedPref.edit();
        eVarEdit.g("widget_values", strC);
        eVarEdit.apply();
    }
}
