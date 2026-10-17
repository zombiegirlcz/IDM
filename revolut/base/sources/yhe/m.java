package yhe;

import aw0.n6;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.api.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        List list;
        List list2;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f313914a;
        xfe.d dVar = (xfe.d) data.getContent();
        lw0.m aVar = dVar != null ? new lw0.a(dVar.f305245a, dVar.f305246b, null, null, false, 28) : new lw0.h(lw0.i.TITLE_SUBTITLE);
        xfe.d dVar2 = (xfe.d) data.getContent();
        aw0.g gVar = null;
        if (dVar2 == null || (list2 = dVar2.f305247c) == null) {
            list = f0.f322471a;
        } else {
            List list3 = list2;
            ArrayList arrayList = new ArrayList(w.t(list3, 10));
            int i = 0;
            for (Object obj2 : list3) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                Pair pair = (Pair) obj2;
                arrayList.add(new RowDelegate.Model(a0.d.n("LIST_ID_", i), new RowDelegate.Model.MainImage.Image40((Image) pair.f186386b, null, null, false, null, false, 62), (Clause) pair.f186385a, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
                i = i2;
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            list = arrayList;
        }
        xfe.d dVar3 = (xfe.d) data.getContent();
        if (dVar3 != null) {
            n6 n6Var = new n6(new TextLocalisedClause(R$string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020);
            String str = domainState.f313915b;
            Clause textLocalisedClause = dVar3.d;
            if (textLocalisedClause == null) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_yes, null, null, 14);
            }
            gVar = new aw0.g(n6Var, new n6(textLocalisedClause, LargeActionButton.ButtonStyle.f58725a, null, str, false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), (Clause) null, (aw0.f) null, 25);
        }
        return new f(aVar, gVar, list);
    }
}
