package yvk;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentTerms;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.shared.feature.wealth.models.config.Links;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import jel.a3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import q35.g0;
import z0f.q;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f317225b;

    public /* synthetic */ n(Data data, int i) {
        this.f317224a = i;
        this.f317225b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List listA;
        switch (this.f317224a) {
            case 0:
                return f.a((f) obj2, this.f317225b, null, 2);
            case 1:
                return f.a((f) obj2, null, (TradingLegalEntityInformation) this.f317225b.getContent(), 1);
            case 2:
                return ywb.d.a((ywb.d) obj2, null, this.f317225b, null, 5);
            case 3:
                return ywb.d.a((ywb.d) obj2, this.f317225b, null, null, 6);
            case 4:
                ywg.b bVar = (ywg.b) obj2;
                hel.b bVar2 = bVar.f317424b;
                WidgetisedAnalyticsType analyticsType = bVar.f317425c;
                Links links = bVar.d;
                Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
                return new ywg.b(this.f317225b, bVar2, analyticsType, links);
            case 5:
                ((ywi.e) obj2).getClass();
                Data amenitiesData = this.f317225b;
                Intrinsics.checkNotNullParameter(amenitiesData, "amenitiesData");
                return new ywi.e(amenitiesData);
            case 6:
                yxg.e eVar = (yxg.e) obj2;
                a3 sector = eVar.f317684a;
                WidgetisedAnalyticsType analyticsType2 = eVar.f317685b;
                Intrinsics.checkNotNullParameter(sector, "sector");
                Intrinsics.checkNotNullParameter(analyticsType2, "analyticsType");
                return new yxg.e(sector, analyticsType2, this.f317225b);
            case 7:
                Data data = this.f317225b;
                Intrinsics.h(data);
                return yy6.l.a((yy6.l) obj2, data, null, 13);
            case 8:
                ((yyi.g) obj2).getClass();
                Data home = this.f317225b;
                Intrinsics.checkNotNullParameter(home, "home");
                return new yyi.g(home);
            case 9:
                return q.a((q) obj2, null, null, null, null, null, false, null, this.f317225b, 3071);
            case 10:
                return q.a((q) obj2, this.f317225b, null, null, null, null, false, null, null, 4062);
            case 11:
                return z0k.k.a((z0k.k) obj2, null, null, this.f317225b, 3);
            case 12:
                Data data2 = this.f317225b;
                Intrinsics.h(data2);
                return z0k.k.a((z0k.k) obj2, data2, null, null, 6);
            case 13:
                return z27.f.a((z27.f) obj2, this.f317225b, false, 6);
            case 14:
                ((z2a.i) obj2).getClass();
                Data personalisations = this.f317225b;
                Intrinsics.checkNotNullParameter(personalisations, "personalisations");
                return new z2a.i(personalisations);
            case 15:
                ((z4e.d) obj2).getClass();
                return new z4e.d(this.f317225b);
            case 16:
                return z66.b.a((z66.b) obj2, null, null, this.f317225b, null, null, false, null, null, Constants.TAG_FB_CHARGING_STATUS);
            case 17:
                boolean z = ((z6k.a) obj2).f319779b;
                Data data3 = this.f317225b;
                Intrinsics.checkNotNullParameter(data3, "data");
                return new z6k.a(data3, z);
            case 18:
                z75.o oVar = (z75.o) obj2;
                LoanRepaymentTerms terms = oVar.f319924a;
                LoanDetails loanDetails = oVar.f319925b;
                boolean z3 = oVar.f319926c;
                g0 g0Var = oVar.e;
                Intrinsics.checkNotNullParameter(terms, "terms");
                Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
                Data selectedRepaymentAccountState = this.f317225b;
                Intrinsics.checkNotNullParameter(selectedRepaymentAccountState, "selectedRepaymentAccountState");
                return new z75.o(terms, loanDetails, z3, selectedRepaymentAccountState, g0Var);
            case 19:
                return z8b.g.a((z8b.g) obj2, this.f317225b, null, null, 6);
            case 20:
                ((za8.c) obj2).getClass();
                Data tradingProfileWithAgeEligibility = this.f317225b;
                Intrinsics.checkNotNullParameter(tradingProfileWithAgeEligibility, "tradingProfileWithAgeEligibility");
                return new za8.c(tradingProfileWithAgeEligibility);
            case 21:
                zag.d dVar = (zag.d) obj2;
                Data data4 = this.f317225b;
                rei.g gVar = (rei.g) data4.getContent();
                rei.e eVar2 = gVar != null ? gVar.e : null;
                vim.d dVarB = dVar.f320689c;
                if (dVarB == null && eVar2 != null) {
                    dVarB = vim.i.b(eVar2.f253602a, eVar2.f253603b);
                }
                return zag.d.a(dVar, data4, dVarB, 10);
            case 22:
                zah.b bVar3 = (zah.b) obj2;
                Data data5 = this.f317225b;
                List list = (List) data5.getContent();
                if (list != null) {
                    zah.g.Companion.getClass();
                    listA = zah.e.a(list);
                } else {
                    listA = bVar3.f320707b;
                }
                return zah.b.a(bVar3, null, listA, data5, null, 9);
            case 23:
                ((zaj.a) obj2).getClass();
                Data preLaunchTokenData = this.f317225b;
                Intrinsics.checkNotNullParameter(preLaunchTokenData, "preLaunchTokenData");
                return new zaj.a(preLaunchTokenData);
            case 24:
                zb6.h update = (zb6.h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return zb6.h.a(update, null, null, null, null, this.f317225b, null, LDSFile.EF_DG15_TAG);
            case 25:
                zb6.h update2 = (zb6.h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return zb6.h.a(update2, null, null, null, null, null, this.f317225b, 95);
            case 26:
                Data data6 = this.f317225b;
                Intrinsics.h(data6);
                return zd3.c.a((zd3.c) obj2, null, null, null, data6, null, null, null, LDSFile.EF_SOD_TAG);
            case 27:
                Data data7 = this.f317225b;
                Intrinsics.h(data7);
                return zd3.c.a((zd3.c) obj2, null, null, null, null, data7, null, null, LDSFile.EF_DG15_TAG);
            case 28:
                return zd3.c.a((zd3.c) obj2, this.f317225b, null, null, null, null, null, null, 126);
            default:
                return zd3.c.a((zd3.c) obj2, null, this.f317225b, null, null, null, null, null, ISO781611.SMT_TAG);
        }
    }
}
