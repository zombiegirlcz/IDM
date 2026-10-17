package cuc;

import auc.g0;
import auc.m0;
import auc.s0;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.security_hub.api.models.StreetModeDelayDuration;
import com.revolut.feature.security_hub.api.models.StreetModeDelayDurationDisclaimer;
import com.revolut.feature.security_hub.api.models.StreetModeInfo;
import com.revolut.feature.security_hub.api.models.StreetModeMinimumAmount;
import com.revolut.feature.security_hub.api.models.StreetModeTrustedLocation;
import com.revolut.feature.security_hub.api.models.StreetModeTrustedWifi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 {
    public static StreetModeInfo a(auc.d0 dto) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(dto, "dto");
        boolean z = dto.f9711a;
        String str = dto.f9712b;
        g0 g0Var = dto.f9713c;
        long j2 = g0Var.f9726a;
        xi0.a aVar = xi0.b.Companion;
        String str2 = g0Var.f9727b;
        aVar.getClass();
        StreetModeMinimumAmount streetModeMinimumAmount = new StreetModeMinimumAmount(j2, xi0.a.a(str2));
        List<m0> list = dto.d;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
        for (m0 m0Var : list) {
            arrayList2.add(new StreetModeTrustedLocation(m0Var.f9748a, m0Var.f9749b, new LocationDomain(m0Var.f9750c, m0Var.d), m0Var.e));
        }
        List list2 = dto.e;
        ArrayList arrayList3 = null;
        if (list2 != null) {
            List<s0> list3 = list2;
            arrayList = new ArrayList(zhm.w.t(list3, 10));
            for (s0 s0Var : list3) {
                arrayList.add(new StreetModeTrustedWifi(s0Var.f9785a, s0Var.f9786b, new LocationDomain(s0Var.f9787c, s0Var.d)));
                z = z;
            }
        } else {
            arrayList = null;
        }
        boolean z3 = z;
        List list4 = dto.f;
        if (list4 != null) {
            List<auc.a0> list5 = list4;
            ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
            for (auc.a0 a0Var : list5) {
                String str3 = a0Var.f9692a;
                String str4 = a0Var.f9693b;
                String str5 = a0Var.f9694c;
                String str6 = a0Var.d;
                auc.x xVar = a0Var.e;
                arrayList4.add(new StreetModeDelayDuration(str3, str4, str5, str6, xVar != null ? new StreetModeDelayDurationDisclaimer(xVar.f9796a, xVar.f9797b) : null, a0Var.f));
            }
            arrayList3 = arrayList4;
        }
        return new StreetModeInfo(z3, str, streetModeMinimumAmount, arrayList2, arrayList, arrayList3);
    }
}
