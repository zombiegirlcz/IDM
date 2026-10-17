package dkj;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.api.model.EsimFeaturedPhoneNumberTiers;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelectionsFee;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_featured_number_selection.EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData;
import dee.a0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData f115580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z80.b f115581b;

    public m(EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData inputData, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f115580a = inputData;
        this.f115581b = phoneToolsProvider;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        dj0.d dVar;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        EsimPhoneNumberSelectionsFee esimPhoneNumberSelectionsFee = ((EsimFeaturedPhoneNumberTiers) d0.b0(this.f115580a.f101221c.f100256a)).d;
        if (esimPhoneNumberSelectionsFee == null || (dVar = esimPhoneNumberSelectionsFee.f100409a) == null) {
            dj0.d.Companion.getClass();
            dVar = dj0.d.e;
        }
        return new k((List) iii.c.f(domainState.f115569a, new dg3.d(this, 22), new a0(25), new cab.m(this, domainState, 25)), new h(new TextLocalisedClause(R$string.esim_mobile_plans_vip_number_selection_title, null, null, 14), new TextLocalisedClause(R$string.esim_mobile_plans_vip_number_selection_subtitle, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12)));
    }
}
