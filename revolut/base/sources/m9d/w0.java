package m9d;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f203748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Data f203749c;

    public /* synthetic */ w0(Data data, Data data2, int i) {
        this.f203747a = i;
        this.f203748b = data;
        this.f203749c = data2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data currentBalanceData;
        Data vaultsData;
        List list;
        Data data;
        ArrayList arrayList;
        dj0.d dVar;
        switch (this.f203747a) {
            case 0:
                Data data2 = this.f203748b;
                Intrinsics.h(data2);
                return z.a((z) obj2, data2, null, null, null, this.f203749c, null, null, null, null, null, null, false, false, null, null, null, false, 262126);
            case 1:
                ((mo8.d) obj2).getClass();
                Data juniorProfile = this.f203748b;
                Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
                Data juniorPlanProducts = this.f203749c;
                Intrinsics.checkNotNullParameter(juniorPlanProducts, "juniorPlanProducts");
                return new mo8.d(juniorProfile, juniorPlanProducts);
            case 2:
                return mwk.i.f((mwk.i) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f203748b, this.f203749c, null, null, null, 30408703);
            case 3:
                ((nui.h) obj2).getClass();
                Data passData = this.f203748b;
                Intrinsics.checkNotNullParameter(passData, "passData");
                Data termsUrlData = this.f203749c;
                Intrinsics.checkNotNullParameter(termsUrlData, "termsUrlData");
                return new nui.h(passData, termsUrlData);
            case 4:
                Data userCompany = this.f203749c;
                Intrinsics.h(userCompany);
                ((o07.b) obj2).getClass();
                Data processingFeesData = this.f203748b;
                Intrinsics.checkNotNullParameter(processingFeesData, "processingFeesData");
                Intrinsics.checkNotNullParameter(userCompany, "userCompany");
                return new o07.b(processingFeesData, userCompany);
            case 5:
                Data plans = this.f203749c;
                Intrinsics.h(plans);
                e93.f cardDesign = ((ox2.c) obj2).f230542a;
                Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
                Data pricingPlan = this.f203748b;
                Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                Intrinsics.checkNotNullParameter(plans, "plans");
                return new ox2.c(cardDesign, pricingPlan, plans);
            case 6:
                return ox5.l.a((ox5.l) obj2, null, null, null, null, null, this.f203748b, this.f203749c, null, 0, null, null, false, null, null, false, 32671);
            case 7:
                pmb.d dVar2 = (pmb.d) obj2;
                Pair pair = (Pair) this.f203749c.getContent();
                return pmb.d.a(dVar2, this.f203748b, pair != null ? (SavingsProductData) pair.f186385a : null, 0, 12);
            case 8:
                return pmk.k.a((pmk.k) obj2, this.f203748b, this.f203749c, null, null, null, null, null, 124);
            case 9:
                ((pnj.d) obj2).getClass();
                Data revolutTermsUrl = this.f203748b;
                Intrinsics.checkNotNullParameter(revolutTermsUrl, "revolutTermsUrl");
                Data partnerTermsUrl = this.f203749c;
                Intrinsics.checkNotNullParameter(partnerTermsUrl, "partnerTermsUrl");
                return new pnj.d(revolutTermsUrl, partnerTermsUrl);
            case 10:
                q03.i0 i0Var = (q03.i0) obj2;
                String cardId = i0Var.f241080a;
                AccountId accountId = i0Var.f241081b;
                wy2.b flowType = i0Var.e;
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                Data settingsItems = this.f203748b;
                Intrinsics.checkNotNullParameter(settingsItems, "settingsItems");
                Data legalContext = this.f203749c;
                Intrinsics.checkNotNullParameter(legalContext, "legalContext");
                Intrinsics.checkNotNullParameter(flowType, "flowType");
                return new q03.i0(cardId, accountId, settingsItems, legalContext, flowType);
            case 11:
                Data reward = this.f203748b;
                Intrinsics.h(reward);
                ((qm8.b) obj2).getClass();
                Intrinsics.checkNotNullParameter(reward, "reward");
                Data juniorProfile2 = this.f203749c;
                Intrinsics.checkNotNullParameter(juniorProfile2, "juniorProfile");
                return new qm8.b(reward, juniorProfile2);
            case 12:
                rb6.f fVar = (rb6.f) obj2;
                dj0.d dVar3 = fVar.d;
                Data data3 = this.f203749c;
                if (dVar3 == null) {
                    List list2 = (List) data3.getContent();
                    dVar3 = list2 != null ? (dj0.d) zhm.d0.e0(1, list2) : null;
                }
                return rb6.f.a(fVar, this.f203748b, data3, dVar3, 1);
            case 13:
                ((s0d.f) obj2).getClass();
                Data highlights = this.f203748b;
                Intrinsics.checkNotNullParameter(highlights, "highlights");
                Data invitation = this.f203749c;
                Intrinsics.checkNotNullParameter(invitation, "invitation");
                return new s0d.f(highlights, invitation);
            case 14:
                Data data4 = this.f203748b;
                Data data5 = this.f203749c;
                s1k.d dVar4 = (s1k.d) obj2;
                try {
                    Object content = data4.getContent();
                    if (content != null) {
                        io3.d dVar5 = (io3.d) content;
                        long j2 = dVar5.i;
                        xi0.a aVar = xi0.b.Companion;
                        String str = dVar5.f163147c;
                        aVar.getClass();
                        dVar = new dj0.d(j2, xi0.a.a(str));
                    } else {
                        dVar = null;
                    }
                    currentBalanceData = new Data(dVar, data4.getError(), data4.getLoading());
                    break;
                } catch (Throwable th10) {
                    currentBalanceData = new Data(null, th10, data4.getLoading());
                }
                try {
                    Object content2 = data5.getContent();
                    if (content2 != null) {
                        List list3 = (List) content2;
                        try {
                            Object content3 = data4.getContent();
                            if (content3 != null) {
                                io3.d dVar6 = (io3.d) content3;
                                arrayList = new ArrayList();
                                for (Object obj3 : list3) {
                                    pcd.s sVar = (pcd.s) obj3;
                                    if (opg.c.c(sVar) && !opg.c.d(sVar) && sVar.f234885h.f234861c > 0 && Intrinsics.f(sVar.getCurrency(), dVar6.f163147c)) {
                                        arrayList.add(obj3);
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                            data = new Data(arrayList, data4.getError(), data4.getLoading());
                        } catch (Throwable th11) {
                            data = new Data(null, th11, data4.getLoading());
                        }
                        list = (List) data.getContent();
                    } else {
                        list = null;
                    }
                    vaultsData = new Data(list, data5.getError(), data5.getLoading());
                    break;
                } catch (Throwable th12) {
                    vaultsData = new Data(null, th12, data5.getLoading());
                }
                dj0.d dueAmount = dVar4.f259147a;
                Intrinsics.checkNotNullParameter(dueAmount, "dueAmount");
                Intrinsics.checkNotNullParameter(currentBalanceData, "currentBalanceData");
                Intrinsics.checkNotNullParameter(vaultsData, "vaultsData");
                return new s1k.d(currentBalanceData, vaultsData, dueAmount);
            case 15:
                Data data6 = this.f203749c;
                Intrinsics.h(data6);
                return s47.j.a((s47.j) obj2, this.f203748b, data6, null, 25);
            case 16:
                String loanId = ((s85.f) obj2).f260889a;
                Intrinsics.checkNotNullParameter(loanId, "loanId");
                Data loanBackupCard = this.f203748b;
                Intrinsics.checkNotNullParameter(loanBackupCard, "loanBackupCard");
                Data loanDetails = this.f203749c;
                Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
                return new s85.f(loanBackupCard, loanDetails, loanId);
            case 17:
                ((tj9.b) obj2).getClass();
                Data management = this.f203748b;
                Intrinsics.checkNotNullParameter(management, "management");
                Data instalmentPlans = this.f203749c;
                Intrinsics.checkNotNullParameter(instalmentPlans, "instalmentPlans");
                return new tj9.b(management, instalmentPlans);
            case 18:
                ((ud6.e) obj2).getClass();
                Data instructionsEligibility = this.f203748b;
                Intrinsics.checkNotNullParameter(instructionsEligibility, "instructionsEligibility");
                Data instructions = this.f203749c;
                Intrinsics.checkNotNullParameter(instructions, "instructions");
                return new ud6.e(instructionsEligibility, instructions);
            case 19:
                Data data7 = this.f203748b;
                Intrinsics.h(data7);
                Data data8 = this.f203749c;
                Intrinsics.h(data8);
                return uwi.k.a((uwi.k) obj2, null, data7, null, data8, 5);
            case 20:
                Data pricingPlan2 = this.f203749c;
                Intrinsics.h(pricingPlan2);
                ((v0c.g) obj2).getClass();
                Data savingsDetails = this.f203748b;
                Intrinsics.checkNotNullParameter(savingsDetails, "savingsDetails");
                Intrinsics.checkNotNullParameter(pricingPlan2, "pricingPlan");
                return new v0c.g(savingsDetails, pricingPlan2);
            case 21:
                return wj8.h.a((wj8.h) obj2, null, this.f203748b, this.f203749c, 1);
            case 22:
                ((wj9.d) obj2).getClass();
                Data management2 = this.f203748b;
                Intrinsics.checkNotNullParameter(management2, "management");
                Data missedInstalments = this.f203749c;
                Intrinsics.checkNotNullParameter(missedInstalments, "missedInstalments");
                return new wj9.d(management2, missedInstalments);
            case 23:
                return wuk.j.f((wuk.j) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f203748b, this.f203749c, null, 5242879);
            case 24:
                return wya.h.a((wya.h) obj2, null, this.f203748b, this.f203749c, 21);
            case 25:
                return wya.h.a((wya.h) obj2, this.f203748b, this.f203749c, null, 28);
            case 26:
                ((xkk.f) obj2).getClass();
                Data subscription = this.f203748b;
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                Data benefitsToLose = this.f203749c;
                Intrinsics.checkNotNullParameter(benefitsToLose, "benefitsToLose");
                return new xkk.f(subscription, benefitsToLose);
            case 27:
                xya.h invitesList = new xya.h(this.f203748b, this.f203749c);
                ((xya.m) obj2).getClass();
                Intrinsics.checkNotNullParameter(invitesList, "invitesList");
                return new xya.m(invitesList, true);
            case 28:
                Data userCompany2 = this.f203749c;
                Intrinsics.h(userCompany2);
                ((yw6.d) obj2).getClass();
                Data pluginFee = this.f203748b;
                Intrinsics.checkNotNullParameter(pluginFee, "pluginFee");
                Intrinsics.checkNotNullParameter(userCompany2, "userCompany");
                return new yw6.d(pluginFee, userCompany2);
            default:
                return yx5.a.a((yx5.a) obj2, this.f203748b, this.f203749c, null, false, null, 28);
        }
    }

    public /* synthetic */ w0(s1k.j jVar, Data data, Data data2) {
        this.f203747a = 14;
        this.f203748b = data;
        this.f203749c = data2;
    }
}
