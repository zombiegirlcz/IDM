package mlk;

import aw0.o9;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardSecurityDeposit;
import com.revolut.feature.feedback.api.domain.Feedback;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.vaults.R$string;
import ip0.on0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206994a;

    public /* synthetic */ a0(int i) {
        this.f206994a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        int i = 10;
        Object next = null;
        switch (this.f206994a) {
            case 0:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                ArrayList arrayList = new ArrayList();
                Iterator it8 = cards.iterator();
                while (it8.hasNext()) {
                    u uVar = (u) ((od0.i) it8.next()).f224257a;
                    if (uVar != null) {
                        arrayList.add(uVar);
                    }
                }
                return arrayList;
            case 1:
                List it9 = (List) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new Data(it9, null, false, 6, null);
            case 2:
                List rewardsPreviews = (List) obj2;
                Intrinsics.checkNotNullParameter(rewardsPreviews, "rewardsPreviews");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : rewardsPreviews) {
                    if (((ggc.g0) obj3).a().f) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            case 3:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 4:
                u it10 = (u) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it10);
            case 5:
                Object[] it11 = (Object[]) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                List listV0 = kotlin.collections.d.v0(it11);
                Intrinsics.i(listV0, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.core.common.Optional<com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreenContract.CardToTerminateData>>");
                return listV0;
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return AnimatedBackgroundType.DEFAULT.f51471a;
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 9:
                Intrinsics.checkNotNullParameter((lk0.e) obj2, "it");
                return null;
            case 10:
                mm5.e update = (mm5.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                zhm.f0 meshEvents = zhm.f0.f322471a;
                update.getClass();
                Intrinsics.checkNotNullParameter(meshEvents, "meshEvents");
                return new mm5.e(meshEvents);
            case 11:
                Throwable it12 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.ERROR, null, "updateApplicationForm failed", it12, null, 18);
                return Boolean.TRUE;
            case 12:
                List netWorthGroups = (List) obj2;
                Intrinsics.checkNotNullParameter(netWorthGroups, "netWorthGroups");
                return zhm.d0.P0(netWorthGroups, new k2j.d(new k2j.d(new mmd.a(), 11), i));
            case 13:
                List assets = (List) obj2;
                Intrinsics.checkNotNullParameter(assets, "assets");
                List list = assets;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list, 10));
                Iterator it13 = list.iterator();
                while (it13.hasNext()) {
                    arrayList3.add(new enh.a((vel.f) it13.next(), null));
                }
                return arrayList3;
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                List listK = zhm.v.k(new on0("JUNIOR_PLAN_PRODUCT_LIST_ITEM_0"), new on0("JUNIOR_PLAN_PRODUCT_LIST_ITEM_1"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 15:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255100b = false;
                Json.f255101c = true;
                Json.f255099a = true;
                Json.e = true;
                return Unit.f186387a;
            case 16:
                od0.i statusOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(statusOptional, "statusOptional");
                cfl.b bVar = (cfl.b) statusOptional.g();
                int i2 = bVar == null ? -1 : mob.c.f207601a[bVar.ordinal()];
                return Boolean.valueOf(i2 == -1 || i2 == 1 || i2 == 2 || i2 == 3);
            case 17:
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                return zi0.c.j(items);
            case 18:
                Data updateState = (Data) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                Feedback.INSTANCE.getClass();
                return new Data(Feedback.f73124g, null, false, 6, null);
            case 19:
                Data updateState2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return new Data(null, null, false, 7, null);
            case 20:
                return mp7.h.a((mp7.h) obj2, null, null, r0.g(), null, 11);
            case 21:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 22:
                mpd.a aVar = (mpd.a) obj2;
                mpd.b bVar2 = aVar.f207787g;
                return mpd.a.a(aVar, null, null, null, false, bVar2 != null ? mpd.b.a(bVar2, null, null, null, null, null, false, 31) : null, 63);
            case 23:
                yw4.p it14 = (yw4.p) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(it14.f317329h != null);
            case 24:
                yhm.r rVar = (yhm.r) obj2;
                return new mq4.h((CreditCardSecurityDeposit) rVar.f314201a, (io3.d) rVar.f314202b, ((Boolean) rVar.f314203c).booleanValue());
            case 25:
                Throwable it15 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                throw it15;
            case 26:
                yhm.r rVar2 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                List list2 = (List) rVar2.f314202b;
                od0.i iVar = (od0.i) rVar2.f314203c;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list2) {
                    SavingsProductData savingsProductData = (SavingsProductData) obj4;
                    if (!iVar.d() || Intrinsics.f(((hha.d) iVar.c()).f152287a, savingsProductData.f86683a.i)) {
                        arrayList4.add(obj4);
                    }
                }
                Iterator it16 = arrayList4.iterator();
                if (it16.hasNext()) {
                    next = it16.next();
                    if (it16.hasNext()) {
                        SavingsProduct savingsProduct = ((SavingsProductData) next).f86683a;
                        Intrinsics.checkNotNullParameter(savingsProduct, "<this>");
                        LocalDate localDate = ocd.c.f224221a;
                        Intrinsics.checkNotNullParameter(savingsProduct, "<this>");
                        Double dE = ocd.c.e(savingsProduct, savingsProduct.f86621h.f86645b.f86647a);
                        if (dE == null) {
                            throw new IllegalStateException("Primary rate percentage can't be null");
                        }
                        double dDoubleValue = dE.doubleValue();
                        do {
                            Object next2 = it16.next();
                            SavingsProduct savingsProduct2 = ((SavingsProductData) next2).f86683a;
                            Intrinsics.checkNotNullParameter(savingsProduct2, "<this>");
                            LocalDate localDate2 = ocd.c.f224221a;
                            Intrinsics.checkNotNullParameter(savingsProduct2, "<this>");
                            Double dE2 = ocd.c.e(savingsProduct2, savingsProduct2.f86621h.f86645b.f86647a);
                            if (dE2 == null) {
                                throw new IllegalStateException("Primary rate percentage can't be null");
                            }
                            double dDoubleValue2 = dE2.doubleValue();
                            if (Double.compare(dDoubleValue, dDoubleValue2) < 0) {
                                next = next2;
                                dDoubleValue = dDoubleValue2;
                            }
                        } while (it16.hasNext());
                    }
                }
                od0.i.Companion.getClass();
                return od0.h.a((SavingsProductData) next);
            case 27:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                od0.i iVar2 = (od0.i) pair.f186385a;
                n38.a aVar2 = (n38.a) ((od0.i) pair.f186386b).f224257a;
                if (((n38.d0) iVar2.f224257a) == null) {
                    if ((aVar2 != null ? aVar2.f211925c : null) != n38.q.PENDING) {
                        return aVar2 != null ? new mqd.j(aVar2.f211923a) : mqd.k.f207983a;
                    }
                }
                return mqd.l.f207984a;
            case 28:
                hha.d it17 = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it17);
            default:
                JuniorBankingProfile profile = (JuniorBankingProfile) obj2;
                Intrinsics.checkNotNullParameter(profile, "profile");
                return new bcb.b(null, new TextLocalisedClause(R$string.junior_transfer_withdrawal_destination_account_name, zhm.u.c(profile.f77099b), null, 12), new ContactImage(profile.f77103j, (String) null, (String) null, (String) null, (String) null, ta6.a.t(profile), (String) null, false, (StylableContactImage$ContactStyle) rf8.a.f253707a, (ImageTransformations) null, (TextLocalisedClause) null, 3550));
        }
    }

    public /* synthetic */ a0(mmd.b bVar) {
        this.f206994a = 12;
    }
}
