package g94;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.other_liabilities.DebtV2OtherLiabilitiesControllerContract$InputData;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DebtV2OtherLiabilitiesControllerContract$InputData f141460a;

    public i(DebtV2OtherLiabilitiesControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f141460a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<pu3.d> list = this.f141460a.f67500a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (pu3.d dVar : list) {
            arrayList.add(new InputDisclosureDelegate.Model(dVar.name(), new TextLocalisedClause(R$string.credit_application_outstanding_debts_other_liabilities_debt_type_title, u.c(new TextLocalisedClause(cp5.c.w(dVar), null, null, 14)), null, 12), null, dVar, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new g(arrayList);
    }
}
