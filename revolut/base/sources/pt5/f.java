package pt5;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto_investments.api.R$string;
import ip0.zj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import ms0.h4;
import whf.j;

/* JADX INFO: loaded from: classes3.dex */
public interface f {
    static List a(f fVar, Data transactionsData) {
        dv5.f fVar2 = (dv5.f) fVar;
        fVar2.getClass();
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        return (List) iii.c.f(transactionsData, new ds4.b(9), new dv5.b(fVar2, 2), new dv5.c(fVar2, 1));
    }

    static List b(f fVar, whf.p transactionsContent, boolean z, String searchQuery, boolean z3, int i) {
        boolean z4 = (i & 8) != 0 ? false : z3;
        int i2 = i & 16;
        whf.j iVar = j.a.f297643a;
        whf.j jVar = i2 != 0 ? null : iVar;
        dv5.f fVar2 = (dv5.f) fVar;
        fVar2.getClass();
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        if (transactionsContent.f297646a.isEmpty()) {
            if (!d0.W(searchQuery)) {
                return dv5.f.c(searchQuery);
            }
            List listC = zhm.u.c(new FullScreenStateDelegate.Model("LIST_ID_EMPTY_TRANSACTIONS", new TextLocalisedClause(R$string.crypto_investments_no_transactions_placeholder, null, null, 14), z4 ? new TextLocalisedClause(R$string.crypto_investments_no_transactions_with_filters_description, null, null, 14) : new TextLocalisedClause(R$string.crypto_investments_no_transactions_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D128", null, null, null, 30)), z4 ? new l6(12, new TextLocalisedClause(R$string.crypto_investments_clear_filters_action, null, null, 14), null, h4.ACCENT) : null, zj.REGULAR, false, z4 ? d.f239615a : null, null, null, 1600));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        whf.n nVar = fVar2.f118036a;
        if (jVar != null) {
            iVar = jVar;
        } else if (!z) {
            iVar = new whf.i(false);
        }
        ArrayList arrayListA = whf.n.a(nVar, transactionsContent, null, iVar, new whf.c(5), 2);
        ArrayList arrayList = new ArrayList(zhm.w.t(arrayListA, 10));
        Iterator it8 = arrayListA.iterator();
        while (it8.hasNext()) {
            arrayList.add(dv5.f.h((qv0.i) it8.next()));
        }
        if (!z) {
            return arrayList;
        }
        List listV0 = zhm.d0.V0(arrayList, 3);
        yp0.b.k(listV0, 0, 0, 0, 0, 31);
        return listV0;
    }
}
