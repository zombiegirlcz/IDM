package t84;

import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements p {
    @Override // jki.p
    public final m a(i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<pu3.d> list = domainState.f268835a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (pu3.d dVar : list) {
            InputDisclosureDelegate.Model model = new InputDisclosureDelegate.Model(dVar.name(), new TextLocalisedClause(cp5.c.w(dVar), null, null, 14), null, dVar, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            int i = R$attr.uikit_dp8;
            int i2 = R$attr.uikit_dp0;
            int i3 = R$attr.uikit_dp16;
            yp0.b.l(model, i, i2, i3, i3, null, false, 48);
            arrayList.add(model);
        }
        return new f(arrayList);
    }
}
