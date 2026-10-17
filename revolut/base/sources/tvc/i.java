package tvc;

import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProduct;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductGroupDetails;
import com.revolut.feature.rev_points.models.RevPoints;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.ListIterator;
import jel.a3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.x;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f274754b;

    public /* synthetic */ i(Data data, int i) {
        this.f274753a = i;
        this.f274754b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object objPrevious;
        VoucherProduct voucherProduct;
        VoucherProductGroupDetails voucherProductGroupDetails;
        x xVar;
        switch (this.f274753a) {
            case 0:
                return d.a((d) obj2, this.f274754b, 3);
            case 1:
                return tw7.h.a((tw7.h) obj2, this.f274754b, false, null, 6);
            case 2:
                return tw7.h.a((tw7.h) obj2, null, false, (hha.d) this.f274754b.getContent(), 3);
            case 3:
                tw7.h hVar = (tw7.h) obj2;
                Boolean bool = (Boolean) this.f274754b.getContent();
                return tw7.h.a(hVar, null, bool != null ? bool.booleanValue() : false, null, 5);
            case 4:
                twb.l lVar = (twb.l) obj2;
                Data data = this.f274754b;
                kwb.b bVar = (kwb.b) data.getContent();
                VoucherProduct voucherProduct2 = null;
                RevPoints revPoints = (bVar == null || (xVar = bVar.f190327b) == null) ? null : xVar.f201472c;
                kwb.b bVar2 = (kwb.b) data.getContent();
                ArrayList arrayList = (bVar2 == null || (voucherProductGroupDetails = bVar2.f190326a) == null) ? null : voucherProductGroupDetails.i;
                if (revPoints != null) {
                    if (arrayList != null) {
                        ListIterator listIterator = arrayList.listIterator(arrayList.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                objPrevious = listIterator.previous();
                                if (((VoucherProduct) objPrevious).f83640b.d(revPoints)) {
                                }
                            } else {
                                objPrevious = null;
                            }
                        }
                        VoucherProduct voucherProduct3 = (VoucherProduct) objPrevious;
                        if (voucherProduct3 != null) {
                            voucherProduct = voucherProduct3;
                            return twb.l.a(lVar, data, null, null, voucherProduct, false, false, null, 246);
                        }
                    }
                    if (arrayList != null) {
                        voucherProduct2 = (VoucherProduct) d0.d0(arrayList);
                    }
                } else if (arrayList != null) {
                    voucherProduct2 = (VoucherProduct) d0.d0(arrayList);
                }
                voucherProduct = voucherProduct2;
                return twb.l.a(lVar, data, null, null, voucherProduct, false, false, null, 246);
            case 5:
                return twb.l.a((twb.l) obj2, this.f274754b, null, null, null, false, false, null, 254);
            case 6:
                return twb.l.a((twb.l) obj2, this.f274754b, null, null, null, false, false, null, 254);
            case 7:
                return twb.l.a((twb.l) obj2, null, this.f274754b, null, null, false, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
            case 8:
                return twb.l.a((twb.l) obj2, null, null, this.f274754b, null, false, false, null, Constants.TAG_FB_CHARGING_STATUS);
            case 9:
                return twb.l.a((twb.l) obj2, this.f274754b, null, null, null, false, false, null, 246);
            case 10:
                a3 sector = ((txg.e) obj2).f275420a;
                Intrinsics.checkNotNullParameter(sector, "sector");
                return new txg.e(sector, this.f274754b);
            case 11:
                Data data2 = this.f274754b;
                Intrinsics.h(data2);
                return new ty4.d(data2);
            case 12:
                Data data3 = this.f274754b;
                Intrinsics.h(data3);
                return tz6.h.a((tz6.h) obj2, data3, false, 2);
            case 13:
                ((u07.e) obj2).getClass();
                Data taxSettingsInfo = this.f274754b;
                Intrinsics.checkNotNullParameter(taxSettingsInfo, "taxSettingsInfo");
                return new u07.e(taxSettingsInfo);
            case 14:
                ((u1a.f) obj2).getClass();
                Data qrStateData = this.f274754b;
                Intrinsics.checkNotNullParameter(qrStateData, "qrStateData");
                return new u1a.f(qrStateData);
            case 15:
                Data data4 = this.f274754b;
                Intrinsics.h(data4);
                return u1k.e.a((u1k.e) obj2, data4, null, 2);
            case 16:
                ((u2a.d) obj2).getClass();
                Data personalisations = this.f274754b;
                Intrinsics.checkNotNullParameter(personalisations, "personalisations");
                return new u2a.d(personalisations);
            case 17:
                return u2e.e.a((u2e.e) obj2, this.f274754b, null, null, 6);
            case 18:
                return u2e.e.a((u2e.e) obj2, null, this.f274754b, null, 5);
            case 19:
                return u36.b.a((u36.b) obj2, this.f274754b, null, 2);
            case 20:
                return u37.g.a((u37.g) obj2, null, this.f274754b, null, null, null, false, 61);
            case 21:
                ((u3b.d) obj2).getClass();
                Data maintenanceMarginWidgetState = this.f274754b;
                Intrinsics.checkNotNullParameter(maintenanceMarginWidgetState, "maintenanceMarginWidgetState");
                return new u3b.d(maintenanceMarginWidgetState);
            case 22:
                return u3c.e.a((u3c.e) obj2, this.f274754b, null, 2);
            case 23:
                return u3c.e.a((u3c.e) obj2, null, this.f274754b, 1);
            case 24:
                return u3k.e.a((u3k.e) obj2, null, this.f274754b, 1);
            case 25:
                return u4b.e.a((u4b.e) obj2, this.f274754b, 0L, null, null, false, false, 62);
            case 26:
                return u4b.e.a((u4b.e) obj2, null, 0L, this.f274754b, null, false, false, 59);
            case 27:
                u4c.c cVar = (u4c.c) obj2;
                xi0.b currency = cVar.f277309a;
                t4c.a breakdownStyle = cVar.f277310b;
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(breakdownStyle, "breakdownStyle");
                Data revolutXOrders = this.f274754b;
                Intrinsics.checkNotNullParameter(revolutXOrders, "revolutXOrders");
                return new u4c.c(currency, breakdownStyle, revolutXOrders);
            case 28:
                return u4e.d.a((u4e.d) obj2, this.f274754b, null, null, 6);
            default:
                return u4e.d.a((u4e.d) obj2, null, this.f274754b, null, 5);
        }
    }

    public /* synthetic */ i(Data data, com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a aVar) {
        this.f274753a = 4;
        this.f274754b = data;
    }
}
