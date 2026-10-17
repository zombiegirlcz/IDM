package o8i;

import com.revolut.feature.credit.card.api.models.creditcard.CreditCardPaymentDetails;
import com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig;
import com.revolut.kompot.common.StackDestination;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ll4.n;
import mx0.v9;
import n8i.f0;
import n8i.g0;
import n8i.l;
import n8i.m;
import n8i.o;
import n8i.p;
import n8i.v;
import n8i.y;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends g0 {
    @Override // n8i.g0
    public final List Z2(k1j.a targetAccountType) {
        Intrinsics.checkNotNullParameter(targetAccountType, "targetAccountType");
        return u.c(targetAccountType);
    }

    @Override // n8i.g0
    public final StackDestination b3(l destinationModel) {
        Intrinsics.checkNotNullParameter(destinationModel, "destinationModel");
        return new CreditCardKompotFeatureConfig.AutoPaySettings.AutoPaySettingsDestination(destinationModel.f213443a);
    }

    @Override // n8i.g0
    public final o c3(y yVar) {
        CreditCardPaymentDetails creditCardPaymentDetails;
        v vVar = (v) yVar;
        boolean z = ((vVar == null || (creditCardPaymentDetails = vVar.f213474a) == null) ? null : creditCardPaymentDetails.f68749w) == n.SUPPORTED;
        l lVar = vVar != null ? new l(vVar.f213474a.f68735a) : null;
        return lVar != null ? new m(z, z, p.CALENDAR_RECURRING, lVar) : new n8i.n(true, false, p.CALENDAR_RECURRING);
    }

    @Override // n8i.g0
    public final void d3(Object obj2, Object event, v9 onAmountUpdate) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(onAmountUpdate, "onAmountUpdate");
        if (obj2 instanceof dm4.b) {
            onAmountUpdate.invoke(new f0(((dm4.b) obj2).f115853a));
        }
    }
}
