package yl7;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance_car.impl.R$string;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import rp0.l;
import rp0.t;
import rp0.y;
import zhm.a0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    /* JADX WARN: Type inference failed for: r10v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public static final y a(Clause title, AbstractList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        t tVar = new t(title, null, null, 30);
        l lVar = l.WINDOW;
        aim.e eVarB = u.b();
        ArrayList arrayList = new ArrayList(w.t(items, 10));
        Iterator it8 = items.iterator();
        while (it8.hasNext()) {
            c cVar = (c) it8.next();
            arrayList.add(new CellDetailsDelegate.Model(cVar.f314663a.toString(), cVar.f314663a, cVar.f314664b, null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        a0.x(arrayList, eVarB);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_common_close, null, null, 14);
        int i = R$attr.uikit_dp16;
        eVarB.add(new LargeActionButtonDelegate.Model("PRIMARY_BUTTON", defaultFilledButton, null, textLocalisedClause, false, null, null, i, R$attr.uikit_dp24, i, i, 496));
        return new y(u.a(eVarB), tVar, lVar, null, null, null, 1016);
    }
}
