package v59;

import com.revolut.feature.masav.api.MasavApi$Toggles$MasavPayToMerchant;
import com.revolut.feature.masav.api.navigation.MasavPayToMerchantDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import xii.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t59.a f286173a;

    public a(t59.a featureChecker) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.f286173a = featureChecker;
    }

    @Override // xii.b
    public final Set a() {
        Set set = s59.a.f260051a;
        return s59.a.f260051a;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        String str;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (((d) this.f286173a.f268048a).c(MasavApi$Toggles$MasavPayToMerchant.f78089c) && (str = (String) deeplink.f195040b.get("authId")) != null) {
            return new MasavPayToMerchantDestination.WithId(str);
        }
        return null;
    }
}
