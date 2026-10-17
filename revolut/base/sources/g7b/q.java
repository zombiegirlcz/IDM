package g7b;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.youTransactor.uCube.rpc.Constants;
import e93.m0;
import h93.f0;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.tg;
import ise.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import zhm.d0;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f141157b;

    public /* synthetic */ q(Object obj2, boolean z, int i) {
        this.f141156a = i;
        this.f141157b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ChargeEntry chargeEntry;
        Object next;
        switch (this.f141156a) {
            case 0:
                n update = (n) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return n.a(update, null, null, null, this.f141157b, 7);
            case 1:
                return n.a((n) obj2, null, null, null, this.f141157b, 7);
            case 2:
                return gcg.j.a((gcg.j) obj2, null, null, null, null, null, null, null, null, null, this.f141157b, null, 3583);
            case 3:
                gvc.g update2 = (gvc.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return gvc.g.a(update2, null, null, null, null, null, null, null, null, this.f141157b, 255);
            case 4:
                gzg.n update3 = (gzg.n) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return gzg.n.a(update3, null, null, null, null, this.f141157b, null, null, null, 8063);
            case 5:
                return h43.n.a((h43.n) obj2, null, null, this.f141157b, 3);
            case 6:
                OrderQuote fees = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(fees, "$this$fees");
                ChargeBreakdown chargeBreakdown = fees.f104755g.f104731a;
                List list = chargeBreakdown.f104723b;
                if (!this.f141157b || list.size() != 1) {
                    list = null;
                }
                return (list == null || (chargeEntry = (ChargeEntry) d0.d0(list)) == null) ? new d4i.b(chargeBreakdown) : new d4i.c(chargeEntry);
            case 7:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                int i = this.f141157b ? 7 : 3;
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(new s7(a0.d.n("LIST_ID_RESULTS.", i2), 0, 0, 0, 0, false, null, 94));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 8:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                od0.h hVar = od0.i.Companion;
                Iterator it9 = cards.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        f0 f0Var = (f0) next;
                        if (!f0Var.Y() || f0Var.M() != this.f141157b) {
                        }
                    } else {
                        next = null;
                    }
                }
                hVar.getClass();
                return od0.h.a(next);
            case 9:
                hbg.l update4 = (hbg.l) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return hbg.l.a(update4, null, null, null, null, null, null, this.f141157b, false, 383);
            case 10:
                return hbg.l.a((hbg.l) obj2, null, null, null, null, null, Boolean.valueOf(this.f141157b), false, false, 479);
            case 11:
                return hea.o.a((hea.o) obj2, null, false, null, null, null, null, null, null, false, null, null, false, null, null, this.f141157b, 16383);
            case 12:
                return hea.o.a((hea.o) obj2, null, false, null, null, null, null, null, null, false, null, null, this.f141157b, null, null, false, 30719);
            case 13:
                hg4.j update5 = (hg4.j) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return hg4.j.a(update5, null, this.f141157b, 1);
            case 14:
                return ht2.i.a((ht2.i) obj2, null, null, null, this.f141157b, null, false, null, false, Constants.TAG_BLE_FIRMWARE_VERSION);
            case 15:
                return htf.g.a((htf.g) obj2, null, null, this.f141157b, 31);
            case 16:
                Data designsData = (Data) obj2;
                Intrinsics.checkNotNullParameter(designsData, "designsData");
                List list2 = (List) designsData.getContent();
                if (list2 == null || !this.f141157b) {
                    return te0.w.h(designsData);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    e93.f fVar = (e93.f) obj3;
                    if (!(fVar instanceof e93.e) || ((e93.e) fVar).f != m0.DISPOSABLE) {
                        arrayList2.add(obj3);
                    }
                }
                return te0.w.h(new Data(arrayList2, designsData.getError(), designsData.getLoading()));
            case 17:
                hz6.e update6 = (hz6.e) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                String str = update6.f157041b;
                boolean z = this.f141157b;
                if (!z) {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                return hz6.e.a(update6, null, str, z, 1);
            case 18:
                i06.g update7 = (i06.g) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return i06.g.a(update7, !this.f141157b, null, false, null, false, 30);
            case 19:
                com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a update8 = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                String str2 = update8.f74192c;
                boolean z3 = this.f141157b;
                if (!z3) {
                    str2 = null;
                }
                return com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a.a(update8, null, null, str2, z3, false, 19);
            case 20:
                return com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a.a((com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a) obj2, null, null, null, false, this.f141157b, 15);
            case 21:
                List providerList = (List) obj2;
                Intrinsics.checkNotNullParameter(providerList, "providerList");
                if (!this.f141157b) {
                    return providerList;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : providerList) {
                    if (y0.b(fgi.a.VRBO).contains(((fgi.b) obj4).f135075a)) {
                        arrayList3.add(obj4);
                    }
                }
                return arrayList3;
            case 22:
                xag.c updateFilters = (xag.c) obj2;
                Intrinsics.checkNotNullParameter(updateFilters, "$this$updateFilters");
                List list3 = updateFilters.f303878c;
                boolean z4 = !this.f141157b;
                List<ieg.b> list4 = list3;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                for (ieg.b bVar : list4) {
                    oei.b category = bVar.f160710a;
                    List amenities = bVar.f160711b;
                    if (category == oei.b.FOOD_AND_DRINK) {
                        List<ieg.a> list5 = amenities;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list5, 10));
                        for (ieg.a aVarA : list5) {
                            if (aVarA.f160707a.f97838b == oei.a.RATE) {
                                aVarA = ieg.a.a(aVarA, z4);
                            }
                            arrayList5.add(aVarA);
                        }
                        amenities = arrayList5;
                    }
                    Intrinsics.checkNotNullParameter(category, "category");
                    Intrinsics.checkNotNullParameter(amenities, "amenities");
                    arrayList4.add(new ieg.b(category, amenities));
                }
                return xag.c.b(updateFilters, null, null, arrayList4, 3);
            case 23:
                nag.a item = (nag.a) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                boolean z6 = this.f141157b;
                return new tg(new TextClause(item.f213901b.f97839c, (Style) new Custom(Integer.valueOf(z6 ? R$attr.uikit_colorGreen : R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), z6 ? new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreen), (List) null, (ImageTransformations) null, (Clause) null, 246) : ue8.c.x(item.f213900a, R$attr.uikit_colorGreyTone50));
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                List listC = zhm.u.c(nb0.a(pb0.Companion, "FUND_DETAILS_HIGHLIGHTS_ROW_ITEM_LOADING", false, 6));
                if (this.f141157b) {
                    return yp0.b.h(listC, new gu("FUND_DETAILS_HIGHLIGHTS_HEADER_LOADING", 0, 0, 30), null, 0, 126);
                }
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return listC;
            case 25:
                inc.e update9 = (inc.e) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return inc.e.a(update9, null, null, null, this.f141157b, null, 23);
            case 26:
                return j0.a((j0) obj2, null, null, null, null, null, null, null, null, null, this.f141157b, 4095);
            case 27:
                j33.i update10 = (j33.i) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                return j33.i.a(update10, null, Boolean.valueOf(!this.f141157b), !update10.d, false, null, null, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG);
            case 28:
                return j33.i.a((j33.i) obj2, null, Boolean.valueOf(!this.f141157b), false, true, null, null, 107);
            default:
                return j43.d.a((j43.d) obj2, null, this.f141157b, 15);
        }
    }

    public /* synthetic */ q(boolean z, int i) {
        this.f141156a = i;
        this.f141157b = z;
    }
}
