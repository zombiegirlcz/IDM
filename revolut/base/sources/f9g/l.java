package f9g;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.database.models.transactioncategory.mapper.CustomTransactionCategoryMapperKt;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.budgeting.CustomCategoryDto;
import com.revolut.domain.exceptions.NotFoundException;
import com.revolut.domain.models.transactions.CategoryColor;
import com.revolut.domain.models.transactions.CategoryImage;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.feature.junior_core.models.configuration.JuniorPlanConfiguration;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType;
import com.revolut.feature.payments.bills_chooser.impl.domain.SplitBillItem;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature_travel_hotels_models.property.room.BedOption;
import com.revolut.feature_travel_hotels_models.property.room.OccupancyRates;
import do3.n;
import fag.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import le.u1;
import org.jmrtd.lds.LDSFile;
import tof.j3;
import zhm.a1;
import zhm.f0;
import zhm.r0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f132961b;

    public /* synthetic */ l(String str, int i) {
        this.f132960a = i;
        this.f132961b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        String str;
        Object next2;
        Object next3;
        List list;
        Object next4;
        boolean zBooleanValue;
        switch (this.f132960a) {
            case 0:
                OccupancyRates occupancyRates = (OccupancyRates) obj2;
                Intrinsics.checkNotNullParameter(occupancyRates, "occupancyRates");
                return Boolean.valueOf(Intrinsics.f(v04.b.M(occupancyRates.f98112a), this.f132961b));
            case 1:
                OccupancyRates occupancyRates2 = (OccupancyRates) obj2;
                Intrinsics.checkNotNullParameter(occupancyRates2, "occupancyRates");
                ArrayList arrayList = occupancyRates2.f98113b;
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                String bedOptionId = this.f132961b;
                Intrinsics.checkNotNullParameter(bedOptionId, "bedOptionId");
                Iterator it8 = arrayList.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((BedOption) next).f98087a, bedOptionId)) {
                        }
                    } else {
                        next = null;
                    }
                }
                BedOption bedOption = (BedOption) next;
                if (bedOption != null) {
                    return new Pair(occupancyRates2, bedOption);
                }
                return null;
            case 2:
                fad.d update = (fad.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                u9d.b bVar = update.f133277a;
                String searchInput = this.f132961b;
                Intrinsics.checkNotNullParameter(searchInput, "searchInput");
                return new fad.d(bVar, searchInput);
            case 3:
                q it9 = (q) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(Intrinsics.f(it9.f133361a, this.f132961b));
            case 4:
                q it10 = (q) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(Intrinsics.f(it10.f133361a, this.f132961b));
            case 5:
                List list2 = (List) obj2;
                Intrinsics.checkNotNullParameter(list2, "list");
                List<s9g.a> list3 = list2;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                for (s9g.a aVar : list3) {
                    Intrinsics.checkNotNullParameter(aVar, "<this>");
                    String campaignId = this.f132961b;
                    Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                    arrayList2.add(new uei.a(v04.b.u(aVar.getLocation()), aVar.getImage(), aVar.getName(), aVar.getDiscount(), campaignId, aVar.getRank()));
                }
                return arrayList2;
            case 6:
                fb7.j update2 = (fb7.j) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return fb7.j.a(update2, null, false, gc0.c.A(update2.e, this.f132961b), null, false, LDSFile.EF_DG15_TAG);
            case 7:
                lf8.f configuration = (lf8.f) obj2;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Iterator it11 = configuration.d.iterator();
                while (true) {
                    boolean zHasNext = it11.hasNext();
                    str = this.f132961b;
                    if (zHasNext) {
                        next2 = it11.next();
                        if (Intrinsics.f(((JuniorPlanConfiguration) next2).f76898a, str)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                JuniorPlanConfiguration juniorPlanConfiguration = (JuniorPlanConfiguration) next2;
                if (juniorPlanConfiguration != null) {
                    return juniorPlanConfiguration;
                }
                throw new IllegalArgumentException(j6.a.q("No junior configuration found for the pricing plan with id ", str));
            case 8:
                List limits = (List) obj2;
                Intrinsics.checkNotNullParameter(limits, "limits");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : limits) {
                    if (Intrinsics.f(((mha.h) obj3).a(), this.f132961b)) {
                        arrayList3.add(obj3);
                    }
                }
                return arrayList3;
            case 9:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                Iterator it13 = it12.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        next3 = it13.next();
                        if (Intrinsics.f(((hha.d) next3).f152287a, this.f132961b)) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                return (hha.d) next3;
            case 10:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return (!data.getLoading() && i2b.a.k(data) && data.getError() == null) ? Data.copy$default(data, null, new NotFoundException(p.a.p("pricing plan with id ", this.f132961b, " not found")), false, 5, null) : data;
            case 11:
                hha.l it14 = (hha.l) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                String str2 = this.f132961b;
                if (str2 == null) {
                    list = it14.f152320a;
                } else {
                    List list4 = it14.f152320a;
                    if (list4 != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : list4) {
                            if (Intrinsics.f(((hha.j) obj4).f152317b, str2)) {
                                arrayList4.add(obj4);
                            }
                        }
                        list = arrayList4;
                    } else {
                        list = null;
                    }
                }
                return list == null ? f0.f322471a : list;
            case 12:
                List it15 = (List) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                od0.h hVar = od0.i.Companion;
                Iterator it16 = it15.iterator();
                while (true) {
                    if (it16.hasNext()) {
                        next4 = it16.next();
                        if (Intrinsics.f(((hha.d) next4).f152287a, this.f132961b)) {
                        }
                    } else {
                        next4 = null;
                    }
                }
                hVar.getClass();
                return od0.h.a(next4);
            case 13:
                fi8.f update3 = (fi8.f) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Set set = update3.f135347c;
                String str3 = this.f132961b;
                return fi8.f.a(update3, null, null, set.contains(str3) ? a1.j(set, str3) : a1.m(set, str3), null, 11);
            case 14:
                fi8.f update4 = (fi8.f) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                Map map = update4.d;
                String str4 = this.f132961b;
                Boolean bool = (Boolean) map.get(str4);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    r6.b.D("The previous state of consent toggle is absent");
                    zBooleanValue = false;
                }
                return fi8.f.a(update4, null, null, null, r0.q(update4.d, new Pair(str4, Boolean.valueOf(!zBooleanValue))), 7);
            case 15:
                fo6.i update5 = (fo6.i) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return fo6.i.a(update5, null, this.f132961b, 1);
            case 16:
                fo9.h update6 = (fo9.h) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return fo9.h.a(update6, null, null, null, this.f132961b, 7);
            case 17:
                fq9.d update7 = (fq9.d) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                Set set2 = update7.e;
                String str5 = this.f132961b;
                LinkedHashSet selectedMemberIds = set2.contains(str5) ? a1.j(set2, str5) : a1.m(set2, str5);
                SplitBillItem item = update7.f137213a;
                SplitMembersType members = update7.f137214b;
                xi0.b currency = update7.f137215c;
                n nVar = update7.d;
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(members, "members");
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(selectedMemberIds, "selectedMemberIds");
                return new fq9.d(item, members, currency, nVar, selectedMemberIds);
            case 18:
                fr8.l updateState = (fr8.l) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return fr8.l.a(updateState, 0L, this.f132961b, null, null, null, null, null, null, null, 509);
            case 19:
                fs2.i update8 = (fs2.i) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                List pagerItems = update8.f137560a;
                Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
                String selectedPagerItemId = this.f132961b;
                Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
                return new fs2.i(pagerItems, selectedPagerItemId);
            case 20:
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : (List) obj2) {
                    Subaccount subaccount = (Subaccount) obj5;
                    if ((subaccount instanceof Subaccount.Junior) && opg.c.c(((Subaccount.Junior) subaccount).f88955a)) {
                        arrayList5.add(obj5);
                    }
                }
                return new Pair(this.f132961b, arrayList5);
            case 21:
                return ft4.m.a((ft4.m) obj2, null, null, this.f132961b, 3);
            case 22:
                fv4.f update9 = (fv4.f) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                List pagerItems2 = update9.f138325a;
                Data content = update9.f138327c;
                Intrinsics.checkNotNullParameter(pagerItems2, "pagerItems");
                Intrinsics.checkNotNullParameter(content, "content");
                return new fv4.f(content, this.f132961b, pagerItems2);
            case 23:
                fv6.g update10 = (fv6.g) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                AcquiringPaymentsQuery acquiringPaymentsQuery = update10.f138360b;
                String str6 = this.f132961b;
                if (d0.W(str6)) {
                    str6 = null;
                }
                return fv6.g.a(update10, null, AcquiringPaymentsQuery.a(acquiringPaymentsQuery, str6, null, null, null, null, 126), null, false, 13);
            case 24:
                fz6.h update11 = (fz6.h) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                String str7 = this.f132961b;
                if (str7.length() == 0) {
                    str7 = null;
                }
                return fz6.h.a(update11, null, null, null, null, str7, null, false, LDSFile.EF_DG15_TAG);
            case 25:
                fz6.h update12 = (fz6.h) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                String str8 = this.f132961b;
                if (str8.length() == 0) {
                    str8 = null;
                }
                return fz6.h.a(update12, null, null, str8, null, null, null, false, 123);
            case 26:
                fz6.h update13 = (fz6.h) obj2;
                Intrinsics.checkNotNullParameter(update13, "$this$update");
                String str9 = this.f132961b;
                if (str9.length() == 0) {
                    str9 = null;
                }
                return fz6.h.a(update13, null, null, null, null, null, str9, false, 95);
            case 27:
                List categories = (List) obj2;
                Intrinsics.checkNotNullParameter(categories, "categories");
                List<CustomCategoryDto> list5 = categories;
                ArrayList arrayList6 = new ArrayList(w.t(list5, 10));
                for (CustomCategoryDto customCategoryDto : list5) {
                    arrayList6.add(new j3((CategoryColor) u1.v(customCategoryDto.getColor(), CustomTransactionCategoryMapperKt.getTransactionCategoryColorMapper()), (CategoryImage) u1.v(customCategoryDto.getLogo(), CustomTransactionCategoryMapperKt.getTransactionCategoryImageMapper()), customCategoryDto.getId(), this.f132961b, customCategoryDto.getName()));
                }
                return arrayList6;
            case 28:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.joint_home_offboarding_account_closed_title, null, null, 14);
                int i = zBooleanValue2 ? R$string.joint_home_account_closed_prompt_subtitle : R$string.joint_home_account_closed_prompt_no_joint_subtitle;
                String str10 = this.f132961b;
                Intrinsics.h(str10);
                return new g48.m(textLocalisedClause, new TextLocalisedClause(i, u.c(new TextClause(str10, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d051", null, null, null, 30));
            default:
                n38.a jointAccount = (n38.a) obj2;
                Intrinsics.checkNotNullParameter(jointAccount, "jointAccount");
                return Boolean.valueOf(Intrinsics.f(jointAccount.f211923a, this.f132961b));
        }
    }
}
