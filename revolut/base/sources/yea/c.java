package yea;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.data.model.Data;
import com.revolut.feature.pockets.api.ui.add_new.AddNewPocketContract$InputData;
import com.revolut.feature.pockets.api.ui.add_new.ExtendedAccountId;
import e7l.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import jid.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s7a.c0;
import wsg.n;
import y66.q;
import y7k.g0;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends x7a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddNewPocketContract$InputData f312833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f312834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fk3.a f312835c;
    public final kbb.c d;
    public final z e;
    public final f01.c f;

    public c(AddNewPocketContract$InputData inputData, n walletInteractor, fk3.a configurationInteractor, kbb.c juniorConfigInteractor, z delistedPocketsInteractor, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(delistedPocketsInteractor, "delistedPocketsInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f312833a = inputData;
        this.f312834b = walletInteractor;
        this.f312835c = configurationInteractor;
        this.d = juniorConfigInteractor;
        this.e = delistedPocketsInteractor;
        this.f = uiKitResources;
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        xi0.a aVar = xi0.b.Companion;
        String str = (String) d0.a0(ids);
        aVar.getClass();
        return new b(xi0.a.a(str));
    }

    @Override // x7a.d
    public final List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        return (List) iii.c.f(data, new ye1.m(2), new yd8.a(4), new q(this, query, 6));
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Flow flowV;
        Intrinsics.checkNotNullParameter(query, "query");
        AddNewPocketContract$InputData addNewPocketContract$InputData = this.f312833a;
        io3.l lVar = addNewPocketContract$InputData.f80786a;
        ExtendedAccountId extendedAccountId = addNewPocketContract$InputData.f80787b;
        AccountId accountIdO2 = extendedAccountId.o2();
        n nVar = this.f312834b;
        w4l.h hVar = w4l.h.f294642c;
        vkm.d dVarB = rd0.e.b(osg.b.g(nVar, hVar, lVar, null, null, null, null, accountIdO2, 60));
        akg.n nVarN = this.e.n(extendedAccountId.o2());
        if ((extendedAccountId instanceof ExtendedAccountId.Joint) || Intrinsics.f(extendedAccountId, ExtendedAccountId.Personal.f80793a)) {
            flowV = nim.a.v(rd0.e.b(((ik3.c) this.f312835c).l(g.b.f123407a, hVar)), new ye1.m(3));
        } else {
            if (!(extendedAccountId instanceof ExtendedAccountId.Junior)) {
                throw new NoWhenBranchMatchedException();
            }
            flowV = this.d.N(((ExtendedAccountId.Junior) extendedAccountId).f80790a);
        }
        return nim.a.v(u0.i(dVarB, nVarN, flowV), new g0(this, query, 17));
    }

    public final List i(String str, List list) {
        if (str.length() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            a aVar = (a) obj2;
            String strJ = j(aVar);
            if (kotlin.text.d0.J(aVar.f312831a.f306286a, str, true) || kotlin.text.d0.J(strJ, str, true)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final String j(a aVar) {
        return this.f.b(new CurrencyClause(aVar.f312831a, CurrencyClause.Format.DisplayName.f57755a, null, 4)).toString();
    }
}
