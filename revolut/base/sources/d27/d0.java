package d27;

import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.threedstransactions.ThreeDSTransactionDto;
import com.revolut.data.network.models.threedstransactions.mapper.ThreeDSTransactionMapperKt;
import com.revolut.feature.exchange.models.ExchangeResult;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details.CommodityAssetDetailsScreen;
import ip0.bo0;
import ip0.gu;
import ip0.o9;
import ip0.p9;
import ip0.s7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110739a;

    public /* synthetic */ d0(int i) {
        this.f110739a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f110739a) {
            case 0:
                u update = (u) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                boolean z = !update.f;
                s sVar = update.f110776h;
                if (sVar == s.AMOUNT) {
                    sVar = s.NONE;
                }
                return u.a(update, null, null, null, null, null, z, null, sVar, null, null, null, 1887);
            case 1:
                u update2 = (u) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                t tVar = update2.f110777j;
                boolean z3 = tVar.f110769a;
                return u.a(update2, null, null, null, null, null, false, null, !z3 ? s.REUSABLE_COUNT : s.NONE, null, new t(!z3, tVar.f110770b), null, 1407);
            case 2:
                u update3 = (u) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return u.a(update3, null, null, null, null, null, false, new r(update3.f110775g.f110767a, !r1.f110768b), null, null, null, null, 1983);
            case 3:
                u update4 = (u) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                lr6.c cardProcessorStatus = update4.f110774c.f110760a;
                Intrinsics.checkNotNullParameter(cardProcessorStatus, "cardProcessorStatus");
                return u.a(update4, null, null, new o(cardProcessorStatus, true), null, null, false, null, null, null, null, null, 2043);
            case 4:
                u update5 = (u) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                q qVar = update5.e;
                boolean z4 = qVar.f110766b;
                return u.a(update5, null, null, null, null, q.a(qVar, null, !z4, 1), false, null, !z4 ? s.CUSTOM_FIELD : s.NONE, null, null, null, 1903);
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                gu guVar = new gu("TOP_ATTRACTIONS_TITLE_ITEM_ID", 0, 0, 30);
                ArrayList arrayList = new ArrayList(3);
                for (int i = 0; i < 3; i++) {
                    p9 p9VarA = o9.a(p9.Companion, "TOP_ATTRACTION_ITEM_ID_" + i);
                    yp0.b.l(p9VarA, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(p9VarA);
                }
                List listK = zhm.v.k(guVar, f2g.a.a(arrayList));
                aim.e eVarB = zhm.u.b();
                for (int i2 = 0; i2 < 2; i2++) {
                    eVarB.add(new gu(a0.d.n("CATEGORY_SECTION_TITLE_ITEM_ID_", i2), 0, 0, 30));
                    String str = "CATEGORY_SECTION_ITEM_SCROLLER_ID_" + i2;
                    ArrayList arrayList2 = new ArrayList(2);
                    for (int i3 = 0; i3 < 2; i3++) {
                        bo0 bo0Var = new bo0(a0.d.n("CATEGORY_SECTION_EXPERIENCE_ITEM_ID_", i3));
                        yp0.b.l(bo0Var, 0, 0, 0, 0, null, false, 63);
                        arrayList2.add(bo0Var);
                    }
                    eVarB.add(f2g.c.a(str, arrayList2));
                }
                return new d2g.w(zhm.d0.E0(zhm.u.a(eVarB), listK), d2g.n.f110814a, d2g.h.f110805a);
            case 6:
                io3.d it8 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new Pair(Boolean.valueOf(it8.f == io3.k.ACTIVE), it8.e);
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return new Pair(Boolean.FALSE, io3.l.CURRENT);
            case 8:
                eda.e it9 = (eda.e) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f124961a;
            case 9:
                io3.d it10 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new Pair(Boolean.valueOf(it10.f == io3.k.ACTIVE), it10.e);
            case 10:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return new Pair(Boolean.FALSE, io3.l.MERCHANT);
            case 11:
                Intrinsics.checkNotNullParameter((k4l.a0) obj2, "it");
                return ExchangeResult.InvestSuccess.f72149a;
            case 12:
                m20.s it11 = (m20.s) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.getUrl();
            case 13:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return ThreeDSTransactionMapperKt.toDomain((List<ThreeDSTransactionDto>) it12);
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                IntRange intRangeO = kotlin.ranges.f.o(0, 3);
                ArrayList arrayList3 = new ArrayList(zhm.w.t(intRangeO, 10));
                vim.f it13 = intRangeO.iterator();
                while (it13.f289625c) {
                    arrayList3.add(new s7(a0.d.n("ID_PAYMENT_FROM_LOADING_ITEM", it13.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                return arrayList3;
            case 15:
                return ((h1h.g) obj2).f148577b.f121715a;
            case 16:
                h3g.a updateAnswer = (h3g.a) obj2;
                Intrinsics.checkNotNullParameter(updateAnswer, "$this$updateAnswer");
                return updateAnswer.b();
            case 17:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return new Data(null, null, false, 6, null);
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                bw0.m.Companion.getClass();
                return bw0.k.a();
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126);
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new d4c.h(zhm.f0.f322471a, false);
            case 22:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                return user.f116408a;
            case 23:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return zhm.f0.f322471a;
            case 24:
                m63.f revolutCardsContent = (m63.f) obj2;
                Intrinsics.checkNotNullParameter(revolutCardsContent, "revolutCardsContent");
                List list = revolutCardsContent.f202995a;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list) {
                    if (!((h93.f0) obj3).d) {
                        arrayList4.add(obj3);
                    }
                }
                return arrayList4;
            case 25:
                String it14 = (String) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Long.valueOf(it14.length() == 0 ? 0L : 400L);
            case 26:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 27:
                d6g.f update6 = (d6g.f) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return d6g.f.a(update6, new Data(null, null, true, 3, null));
            case 28:
                return ((d6g.f) obj2).f111539c;
            default:
                InputDisclosureDelegate.Model model = (InputDisclosureDelegate.Model) obj2;
                CommodityAssetDetailsScreen.Companion aVar = CommodityAssetDetailsScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(model, "model");
                return Boolean.valueOf(Intrinsics.f(model.f52539a, "CONTACT_US_ITEM_LIST_ID"));
        }
    }

    public /* synthetic */ d0(Object obj2, int i) {
        this.f110739a = i;
    }
}
