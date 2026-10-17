package vjk;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.b1;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance.api.models.cfac.CFACClaim;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claims_list.CFACClaimsListScreen;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_profile.api.models.JuniorProfileCompany;
import com.revolut.feature.payments.social.api.model.StartAction;
import com.revolut.feature.payments.social.api.navigation.SocialPaymentsFeatureConfig;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.rfi_tool.impl.navigation.RfiToolFlowContract$RfiToolFlowState;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.feature.wealth.ui.impl.documents.details.a;
import com.revolut.retail.core.navigation.FeatureCommand;
import ip0.gu;
import ip0.pb0;
import ip0.y;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import vk7.k;
import vm5.i;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zhm.w;
import zm3.l;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289797a;

    public /* synthetic */ b(int i) {
        this.f289797a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Date dateD;
        switch (this.f289797a) {
            case 0:
                return ((PricingPlanSubscription) obj2).f81129a;
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                gu guVar = new gu("REVOLUT_FRIENDS_LOADING_SUBHEADER_ID", 0, R$attr.uikit_dp8, 26);
                pb0 pb0Var = new pb0("REVOLUT_FRIENDS_LOADING_ITEM_ID");
                yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                return v.k(guVar, pb0Var);
            case 2:
                RowDelegate.Model it8 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = CFACClaimsListScreen.f75134d0;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj3 = it8.u;
                if (obj3 instanceof CFACClaim) {
                    return (CFACClaim) obj3;
                }
                return null;
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return k.b();
            case 4:
                RfiToolFlowContract$RfiToolFlowState update = (RfiToolFlowContract$RfiToolFlowState) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return RfiToolFlowContract$RfiToolFlowState.a(update, d0.V(update.f85009a, 1));
            case 5:
                RfiToolFlowContract$RfiToolFlowState update2 = (RfiToolFlowContract$RfiToolFlowState) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return RfiToolFlowContract$RfiToolFlowState.a(update2, d0.V(update2.f85009a, 1));
            case 6:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : pockets) {
                    xi0.a aVar = xi0.b.Companion;
                    String str = ((io3.d) obj4).f163147c;
                    aVar.getClass();
                    if (cp5.d.y(xi0.a.a(str))) {
                        arrayList.add(obj4);
                    }
                }
                return arrayList;
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 8:
                List portfolios = (List) obj2;
                Intrinsics.checkNotNullParameter(portfolios, "portfolios");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : portfolios) {
                    if (v.k(xdh.c.ACTIVE, xdh.c.SUSPENDED, xdh.c.OFFBOARDING).contains(((RoboPortfolioInfo) obj5).f95704g)) {
                        arrayList2.add(obj5);
                    }
                }
                return arrayList2;
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return a.C0591a.f95994a;
            case 10:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.TRUE;
            case 11:
                zm3.a it9 = (zm3.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(it9 instanceof l);
            case 12:
                zm3.a it10 = (zm3.a) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (l) it10;
            case 13:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.TRUE;
            case 14:
                l contact = (l) obj2;
                Intrinsics.checkNotNullParameter(contact, "contact");
                return new FeatureCommand(new SocialPaymentsFeatureConfig.PaymentsProfileChat((zm3.a) contact, (TransferMoneyPocket) null, (StartAction.ShowBottomDialog) null, false, 14));
            case 15:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.TRUE;
            case 16:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.FALSE;
            case 17:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 18:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 2);
                for (int i = 0; i < 2; i++) {
                    b1 b1Var = new b1(String.valueOf(i));
                    yp0.b.r(b1Var, 0, 0, 0, 0, 15);
                    arrayListP.add(b1Var);
                }
                return arrayListP;
            case 19:
                vlm.c it11 = (vlm.c) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                uc0.b bVar = it11.f290505c;
                if (bVar instanceof vlm.c) {
                    return (vlm.c) bVar;
                }
                return null;
            case 20:
                vlm.c it12 = (vlm.c) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                StringBuilder sb6 = new StringBuilder();
                sb6.append(it12.f290503a);
                sb6.append('=');
                sb6.append(it12.f290504b);
                return sb6.toString();
            case 21:
                Boolean canBeIgnored = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(canBeIgnored, "canBeIgnored");
                return Boolean.valueOf(!canBeIgnored.booleanValue());
            case 22:
                vm5.e update3 = (vm5.e) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                update3.getClass();
                return new vm5.e(null);
            case 23:
                LocalDate localDate = ((vm5.e) obj2).f290536a;
                if (localDate != null && (dateD = ebm.a.D(localDate)) != null) {
                    return dateD;
                }
                i.Companion.getClass();
                return vm5.d.f290535b;
            case 24:
                y it13 = (y) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                Object obj6 = it13.f167226b.f58324n;
                if (obj6 instanceof vmh.e) {
                    return (vmh.e) obj6;
                }
                return null;
            case 25:
                Set it14 = (Set) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                Set set = it14;
                ArrayList arrayList3 = new ArrayList(w.t(set, 10));
                Iterator it15 = set.iterator();
                while (it15.hasNext()) {
                    arrayList3.add(d8l.d.J((xnh.a) it15.next()));
                }
                return d0.i1(arrayList3);
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new ProfileCardModel.Loading(0);
            case 28:
                JuniorBankingProfile it16 = (JuniorBankingProfile) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                JuniorProfileCompany juniorProfileCompany = it16.f77107p;
                return Boolean.valueOf(Intrinsics.f(juniorProfileCompany != null ? juniorProfileCompany.f77109a : null, "Revolut Bank UAB, Sucursal en España"));
            default:
                JuniorBankingProfile it17 = (JuniorBankingProfile) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                wi0.b bVarC = com.bumptech.glide.d.c(it17.k.getCountry());
                wi0.b.Companion.getClass();
                return Boolean.valueOf(Intrinsics.f(bVarC, wi0.b.y2));
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f289797a = i;
    }
}
