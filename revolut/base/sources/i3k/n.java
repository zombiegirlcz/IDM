package i3k;

import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import java.lang.reflect.Type;
import kg.s;
import kg.t;
import kg.u;
import kg.w;
import kg.y;
import kg.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements t, z {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kg.t
    public final Object deserialize(u json, Type typeOfT, s context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter(context, "context");
        w wVarC = json.c();
        Intrinsics.checkNotNullExpressionValue(wVarC, "getAsJsonObject(...)");
        String strI = boh.f.i("KEY_TYPE", wVarC);
        if (strI != null) {
            switch (strI.hashCode()) {
                case -1525751262:
                    if (strI.equals("TYPE_INTERNAL")) {
                        return RemittanceRouteId.Internal.f101916b;
                    }
                    break;
                case -959994847:
                    if (strI.equals("TYPE_BANK")) {
                        return RemittanceRouteId.BANK.f101914b;
                    }
                    break;
                case -959964939:
                    if (strI.equals("TYPE_CARD")) {
                        return RemittanceRouteId.CARD.f101915b;
                    }
                    break;
                case -135076657:
                    if (strI.equals("TYPE_MW")) {
                        return new RemittanceRouteId.MobileWallet(boh.f.j("KEY_WALLET_VENDOR_ID", json), boh.f.i("KEY_VENDOR_NAME", json));
                    }
                    break;
            }
        }
        return RemittanceRouteId.UNKNOWN.f101919b;
    }

    @Override // kg.z
    public final u serialize(Object obj2, Type typeOfSrc, y context) {
        RemittanceRouteId src2 = (RemittanceRouteId) obj2;
        Intrinsics.checkNotNullParameter(src2, "src");
        Intrinsics.checkNotNullParameter(typeOfSrc, "typeOfSrc");
        Intrinsics.checkNotNullParameter(context, "context");
        w wVar = new w();
        if (Intrinsics.f(src2, RemittanceRouteId.BANK.f101914b)) {
            wVar.h("KEY_TYPE", "TYPE_BANK");
            return wVar;
        }
        if (Intrinsics.f(src2, RemittanceRouteId.CARD.f101915b)) {
            wVar.h("KEY_TYPE", "TYPE_CARD");
            return wVar;
        }
        if (Intrinsics.f(src2, RemittanceRouteId.Internal.f101916b)) {
            wVar.h("KEY_TYPE", "TYPE_INTERNAL");
            return wVar;
        }
        if (!(src2 instanceof RemittanceRouteId.MobileWallet)) {
            if (!Intrinsics.f(src2, RemittanceRouteId.UNKNOWN.f101919b)) {
                throw new NoWhenBranchMatchedException();
            }
            wVar.h("KEY_TYPE", "TYPE_UNKNOWN");
            return wVar;
        }
        RemittanceRouteId.MobileWallet mobileWallet = (RemittanceRouteId.MobileWallet) src2;
        wVar.h("KEY_WALLET_VENDOR_ID", mobileWallet.f101917b);
        String str = mobileWallet.f101918c;
        if (str != null) {
            wVar.h("KEY_VENDOR_NAME", str);
        }
        wVar.h("KEY_TYPE", "TYPE_MW");
        return wVar;
    }
}
