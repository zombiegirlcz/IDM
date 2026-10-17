package i2i;

import android.content.Intent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.data.network.models.moneyrequest.TransferLinkDetailsDto;
import com.revolut.data.network.models.moneyrequest.TransferLinkResponseDto;
import com.revolut.data.network.models.moneyrequest.mapper.TransferLinkMappingsKt;
import com.revolut.data.network.models.transfer.PeerToPeerTransferDto;
import com.revolut.data.network.models.transfer.mapper.PeerToPeerTransferDtoMapperKt;
import com.revolut.domain.models.payment.links.PaymentLink;
import com.revolut.feature.bank_transfer.models.PaymentVendor;
import com.revolut.feature.bank_transfer.models.PaymentVendorCorridor;
import com.revolut.feature.staking.api.model.StakingAvailability;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeStakingData;
import i2l.t0;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157968a;

    public /* synthetic */ o(int i) {
        this.f157968a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        StakingAvailability stakingAvailability;
        int i = 0;
        switch (this.f157968a) {
            case 0:
                CellDetailsActionDelegate.Model it8 = (CellDetailsActionDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(Intrinsics.f(it8.f51781a, "LIMIT"));
            case 1:
                CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                bw0.m mVar = model.e;
                Object obj3 = mVar != null ? mVar.e : null;
                if (obj3 instanceof r) {
                    return (r) obj3;
                }
                return null;
            case 2:
                ExchangeOrderDraft draft = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft, "draft");
                return draft.f96880b.f;
            case 3:
                kpi.a result = (kpi.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                Intent intent = result.f188248c;
                Float fValueOf = intent != null ? Float.valueOf(intent.getFloatExtra("ARG_LOWEST_LIMIT", BitmapDescriptorFactory.HUE_RED)) : null;
                if (Intrinsics.d(fValueOf, BitmapDescriptorFactory.HUE_RED)) {
                    fValueOf = null;
                }
                Float fValueOf2 = intent != null ? Float.valueOf(intent.getFloatExtra("ARG_HIGHEST_LIMIT", BitmapDescriptorFactory.HUE_RED)) : null;
                return new Pair(fValueOf, Intrinsics.d(fValueOf2, BitmapDescriptorFactory.HUE_RED) ? null : fValueOf2);
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 5:
                od0.i it9 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                od0.h hVar = od0.i.Companion;
                ExchangeStakingData exchangeStakingData = (ExchangeStakingData) it9.f224257a;
                if (exchangeStakingData != null && (stakingAvailability = exchangeStakingData.f96896b) != null) {
                    obj = stakingAvailability.f88059b;
                }
                hVar.getClass();
                return od0.h.a(obj);
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                ArrayList arrayList = new ArrayList(5);
                while (i < 5) {
                    arrayList.add(nb0.b(pb0.Companion, a0.d.n("loading_", i), false, 0, false, 30));
                    i++;
                }
                return new i2k.m(null, arrayList);
            case 7:
                i2l.q update = (i2l.q) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return i2l.q.a(update, null, null, null, true, null, 23);
            case 8:
                i2l.q it10 = (i2l.q) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                a2l.y yVar = (a2l.y) it10.f158038a.getContent();
                if (yVar != null) {
                    return yVar.f939h;
                }
                return null;
            case 9:
                i2l.q update2 = (i2l.q) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return i2l.q.a(update2, null, null, null, false, null, 23);
            case 10:
                i2l.q update3 = (i2l.q) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                AnimationRequest animationRequest = update3.e;
                if (animationRequest == null) {
                    animationRequest = new AnimationRequest(false);
                }
                return i2l.q.a(update3, null, null, null, false, animationRequest, 15);
            case 11:
                a2l.y yVar2 = (a2l.y) ((i2l.q) obj2).f158038a.getContent();
                if (yVar2 != null) {
                    return yVar2.f941l;
                }
                return null;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                for (int i2 = 0; i2 < 2; i2++) {
                    String strN = a0.d.n("travel_status_partner_loading_", i2);
                    ArrayList arrayList2 = new ArrayList(3);
                    for (int i3 = 0; i3 < 3; i3++) {
                        arrayList2.add(nb0.b(pb0.Companion, com.google.android.gms.internal.mlkit_vision_face.a.k(i3, strN, "_row_"), true, 0, false, 28));
                    }
                    eVarB.addAll(yp0.b.h(arrayList2, new gu(a0.d.r(strN, "_subheader"), 0, 0, 30), null, 0, 126));
                }
                return new i2l.z(zhm.u.a(eVarB), i2l.t.f158046a, null);
            case 13:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                while (i < 3) {
                    arrayListP.add(nb0.b(pb0.Companion, a0.d.n("travel_status_partner_transactions_loading_row_", i), true, 0, false, 28));
                    i++;
                }
                return yp0.b.g(arrayListP, t0.a(), null, 0, 0, 126);
            case 14:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 15:
                return h30.l.q("email", (od0.i) obj2);
            case 16:
                PeerToPeerTransferDto dto = (PeerToPeerTransferDto) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                return PeerToPeerTransferDtoMapperKt.toDescriptor(dto);
            case 17:
                PeerToPeerTransferDto dto2 = (PeerToPeerTransferDto) obj2;
                Intrinsics.checkNotNullParameter(dto2, "dto");
                return PeerToPeerTransferDtoMapperKt.toDescriptor(dto2);
            case 18:
                PeerToPeerTransferDto dto3 = (PeerToPeerTransferDto) obj2;
                Intrinsics.checkNotNullParameter(dto3, "dto");
                return PeerToPeerTransferDtoMapperKt.toDescriptor(dto3);
            case 19:
                PeerToPeerTransferDto dto4 = (PeerToPeerTransferDto) obj2;
                Intrinsics.checkNotNullParameter(dto4, "dto");
                return PeerToPeerTransferDtoMapperKt.toDescriptor(dto4);
            case 20:
                TransferLinkResponseDto transferLink = (TransferLinkResponseDto) obj2;
                Intrinsics.checkNotNullParameter(transferLink, "transferLink");
                String id10 = transferLink.getId();
                String receiveUrl = transferLink.getReceiveUrl();
                if (receiveUrl != null) {
                    return new PaymentLink(transferLink.getExpiryDate(), id10, receiveUrl, transferLink.getTransactionId());
                }
                throw new IllegalStateException("link can't be null");
            case 21:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                List list2 = list;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it11 = list2.iterator();
                while (it11.hasNext()) {
                    arrayList3.add(TransferLinkMappingsKt.toDomain((TransferLinkDetailsDto) it11.next()));
                }
                return arrayList3;
            case 22:
                TransferLinkDetailsDto it12 = (TransferLinkDetailsDto) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return TransferLinkMappingsKt.toDomain(it12);
            case 23:
                IntRange intRangeU = t61.a.u((Function0) obj2, "it", 1, 3, 1);
                ArrayList arrayList4 = new ArrayList(zhm.w.t(intRangeU, 10));
                vim.f it13 = intRangeU.iterator();
                while (it13.f289625c) {
                    arrayList4.add(new pb0(a0.d.n("SECURITY_DEPOSIT_DETAILS_", it13.nextInt())));
                }
                yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                return i35.h.a(arrayList4);
            case 24:
                Intrinsics.checkNotNullParameter((lk0.e) obj2, "it");
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 26:
                List vendors = (List) obj2;
                Intrinsics.checkNotNullParameter(vendors, "vendors");
                List<h3k.b> list3 = vendors;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(list3, 10));
                for (h3k.b bVar : list3) {
                    Map map = i3k.d.f158233a;
                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                    String id11 = bVar.getId();
                    String name = bVar.getName();
                    String logoMono = bVar.getLogoMono();
                    String logoColored = bVar.getLogoColored();
                    boolean zF = Intrinsics.f(bVar.getDefault(), Boolean.TRUE);
                    List<h3k.a> corridors = bVar.getCorridors();
                    ArrayList arrayList6 = new ArrayList(zhm.w.t(corridors, 10));
                    for (h3k.a aVar : corridors) {
                        wi0.a aVar2 = wi0.b.Companion;
                        String country = aVar.getCountry();
                        aVar2.getClass();
                        wi0.b bVarA = wi0.a.a(country);
                        xi0.a aVar3 = xi0.b.Companion;
                        String currency = aVar.getCurrency();
                        aVar3.getClass();
                        arrayList6.add(new PaymentVendorCorridor(bVarA, xi0.a.a(currency), aVar.getDefault()));
                    }
                    arrayList5.add(new PaymentVendor(id11, name, logoMono, logoColored, arrayList6, zF));
                }
                return arrayList5;
            case 27:
                List list4 = (List) obj2;
                Intrinsics.checkNotNullParameter(list4, "list");
                List list5 = list4;
                ArrayList arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                Iterator it14 = list5.iterator();
                while (it14.hasNext()) {
                    arrayList7.add(i3k.d.b((h3k.m) it14.next()));
                }
                return arrayList7;
            case 28:
                List list6 = (List) obj2;
                Intrinsics.checkNotNullParameter(list6, "list");
                List<h3k.n> list7 = list6;
                ArrayList arrayList8 = new ArrayList(zhm.w.t(list7, 10));
                for (h3k.n nVar : list7) {
                    Map map2 = i3k.d.f158233a;
                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                    xi0.a aVar4 = xi0.b.Companion;
                    String code = nVar.getCode();
                    aVar4.getClass();
                    arrayList8.add(new z1k.n(xi0.a.a(code), nVar.getSupported(), nVar.getCardSupported()));
                }
                return arrayList8;
            default:
                i3k.l it15 = (i3k.l) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15;
        }
    }

    public /* synthetic */ o(Object obj2, int i) {
        this.f157968a = i;
    }
}
