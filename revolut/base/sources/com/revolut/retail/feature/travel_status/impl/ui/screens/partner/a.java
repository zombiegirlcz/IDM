package com.revolut.retail.feature.travel_status.impl.ui.screens.partner;

import a2l.o;
import a2l.p;
import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.TravelStatusPartnerActionBottomSheetData;
import i2l.f;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private a() {
    }

    public static TravelStatusPartnerActionBottomSheetData a(String str, String str2, List list, i2l.a aVar) {
        o oVar;
        o oVar2;
        Pair pair;
        Object next;
        Object next2;
        if (list != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it8.next();
                if (((o) next2).f921b == p.CONFIRM) {
                    break;
                }
            }
            oVar = (o) next2;
        } else {
            oVar = null;
        }
        if (list != null) {
            Iterator it9 = list.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next = null;
                    break;
                }
                next = it9.next();
                if (((o) next).f921b == p.DISMISS) {
                    break;
                }
            }
            oVar2 = (o) next;
        } else {
            oVar2 = null;
        }
        int i = f.f158012b[aVar.ordinal()];
        if (i == 1) {
            pair = new Pair(oVar, oVar2);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(oVar2, oVar);
        }
        o oVar3 = (o) pair.f186385a;
        o oVar4 = (o) pair.f186386b;
        return new TravelStatusPartnerActionBottomSheetData(str, str2, oVar3 != null ? new TravelStatusPartnerActionBottomSheetData.Button(oVar3.f920a, oVar3.f921b) : null, oVar4 != null ? new TravelStatusPartnerActionBottomSheetData.Button(oVar4.f920a, oVar4.f921b) : null, aVar);
    }
}
