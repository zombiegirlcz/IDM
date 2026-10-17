package aoa;

import anf.p;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.profile.impl.R$string;
import efm.r;
import ffk.t;
import hha.h0;
import hha.i0;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import jgk.r;
import jgk.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vf0.y;
import yna.d1;
import yna.e1;
import yna.w;
import zhm.d0;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f7946b;

    public /* synthetic */ g(j jVar, int i) {
        this.f7945a = i;
        this.f7946b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        TextLocalisedClause textLocalisedClause;
        i0 i0Var;
        switch (this.f7945a) {
            case 0:
                if (!((Boolean) obj2).booleanValue()) {
                    ufm.d dVar = this.f7946b.e;
                    return rd0.e.c(nim.a.v(n14.e.x((t) dVar.f279876b, new vdl.a(dVar, 22)), new p(13)), kotlin.coroutines.g.f186406a);
                }
                od0.i.Companion.getClass();
                r rVarJust = r.just(new Data(od0.i.f224256b, null, false, 6, null));
                Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                return rVarJust;
            case 1:
                y yVar = (y) obj2;
                Intrinsics.checkNotNullParameter(yVar, "<destruct>");
                Data data = (Data) yVar.f288491a;
                Data data2 = (Data) yVar.f288492b;
                Data data3 = (Data) yVar.f288493c;
                Data data4 = (Data) yVar.d;
                Data planCampaigns = (Data) yVar.e;
                Data data5 = (Data) yVar.f;
                e1 e1Var = this.f7946b.f;
                Intrinsics.checkNotNullParameter(planCampaigns, "planCampaigns");
                List listK = v.k(hha.k.PARTNER_SALARY_ACTIVE, hha.k.PARTNER_SALARY_GRACE, hha.k.SALARY_HUB_ACTIVE, hha.k.SALARY_HUB_GRACE);
                List list = (List) planCampaigns.getContent();
                TextLocalisedClause textLocalisedClause2 = null;
                if (list != null) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (listK.contains(((hha.j) next).f152316a)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    hha.j salaryCampaign = (hha.j) next;
                    if (salaryCampaign != null) {
                        hha.k kVar = salaryCampaign.f152316a;
                        Intrinsics.checkNotNullParameter(salaryCampaign, "salaryCampaign");
                        LocalDate localDate = salaryCampaign.f152318c;
                        jgk.r sVar = localDate == null ? r.a.f174088a : new s(localDate);
                        if (sVar instanceof r.a) {
                            switch (d1.f315331a[kVar.ordinal()]) {
                                case 1:
                                    textLocalisedClause = new TextLocalisedClause(R$string.profile_pricing_plan_title_salary_hub_active, null, null, 14);
                                    break;
                                case 2:
                                    textLocalisedClause = new TextLocalisedClause(R$string.profile_pricing_plan_title_salary_partner_active, null, null, 14);
                                    break;
                                case 3:
                                    textLocalisedClause = new TextLocalisedClause(R$string.profile_pricing_plan_title_salary_hub_grace, null, null, 14);
                                    break;
                                case 4:
                                    textLocalisedClause = new TextLocalisedClause(R$string.profile_pricing_plan_title_salary_partner_grace, null, null, 14);
                                    break;
                                case 5:
                                case 6:
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            textLocalisedClause2 = textLocalisedClause;
                        } else {
                            if (!(sVar instanceof s)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            switch (d1.f315331a[kVar.ordinal()]) {
                                case 1:
                                    textLocalisedClause = new TextLocalisedClause(R$string.profile_pricing_plan_title_salary_hub_ending, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10);
                                    break;
                                case 2:
                                    textLocalisedClause = new TextLocalisedClause(R$string.profile_pricing_plan_title_salary_partner_ending, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10);
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            textLocalisedClause2 = textLocalisedClause;
                        }
                    }
                }
                return new w(data, data2, data3, data4, textLocalisedClause2, data5);
            default:
                Data subscriptionData = (Data) obj2;
                Intrinsics.checkNotNullParameter(subscriptionData, "subscriptionData");
                List listK2 = v.k(h0.PARTNER_SALARY_DISCOUNT, h0.SALARY_HUB_DISCOUNT);
                PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) subscriptionData.getContent();
                return d0.T(listK2, (pricingPlanSubscription == null || (i0Var = pricingPlanSubscription.f81135l) == null) ? null : i0Var.f152315h) ? rd0.e.c(this.f7946b.f7950a.g(null, w4l.h.f294642c), kotlin.coroutines.g.f186406a) : zi0.c.j(f0.f322471a);
        }
    }
}
