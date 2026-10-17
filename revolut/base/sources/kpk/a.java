package kpk;

import com.revolut.data.utils.gson.GsonHolder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    public static String a(ipk.a aVar) {
        if (aVar == null) {
            return null;
        }
        String strK = GsonHolder.a().k(aVar);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }
}
