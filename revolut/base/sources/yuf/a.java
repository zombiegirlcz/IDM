package yuf;

import avf.e;
import com.revolut.feature.transport.models.TransportTicketProvider;
import com.revolut.feature.transport.models.TransportTicketQrCode;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicketActivationParams;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicketValidity;
import com.revolut.feature.transport.models.transit.PurchasedTransportTicketActivationProviderParams;
import com.revolut.feature.transport.models.transit.TransitTicketDescription;
import com.revolut.feature.transport.models.transit.TransitTicketType;
import cvf.f;
import cvf.g;
import cvf.h;
import cvf.i;
import cvf.k;
import dj0.d;
import i26.l;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import pyd.c;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static final PurchasedTransitTicket a(i iVar, LocalDateTime now) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(now, "now");
        if (iVar instanceof h) {
            h hVar = (h) iVar;
            String strJ = hVar.getId();
            String strR = hVar.getTicketOfferId();
            String strQ = hVar.getTicketNumber();
            String strT = hVar.getTitle();
            TransitTicketType transitTicketTypeE = mif.a.E(hVar.getTicketType());
            TransitTicketDescription transitTicketDescriptionQ = s.q(hVar.getDescriptions());
            List listV = hVar.getZones();
            List listP = hVar.getTags();
            LocalDateTime localDateTimeC = ruf.b.c(hVar.getCreatedDate());
            String strK = hVar.getLocationName();
            wi0.a aVar = wi0.b.Companion;
            String strF = hVar.getCountryCode();
            aVar.getClass();
            wi0.b bVarA = wi0.a.a(strF);
            TransportTicketProvider transportTicketProviderZ = c.Z(hVar.getProvider());
            d dVarO = mo3.a.o(hVar.getPrice());
            String strM = hVar.getPocketId();
            List listI = hVar.getGeneralInputs();
            ArrayList arrayList = new ArrayList(w.t(listI, 10));
            Iterator it8 = listI.iterator();
            while (it8.hasNext()) {
                arrayList.add(l.v((e) it8.next()));
            }
            List listL = hVar.getPassengerInputs();
            ArrayList arrayList2 = new ArrayList(w.t(listL, 10));
            Iterator it9 = listL.iterator();
            while (it9.hasNext()) {
                arrayList2.add(l.v((e) it9.next()));
            }
            String strU = hVar.getTransactionId();
            Boolean boolW = hVar.getIsDiscounted();
            List<cvf.b> listB = hVar.getActivationParams();
            ArrayList arrayList3 = new ArrayList(w.t(listB, 10));
            for (cvf.b bVar : listB) {
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                arrayList3.add(new PurchasedTransitTicketActivationParams(bVar.getId(), bVar.getCode(), bxf.b.valueOf(bVar.getType()), bVar.getLabel(), bVar.getRegex(), bVar.getErrorMessage(), bVar.getIsRequired()));
            }
            cvf.c cVarC = hVar.getActivationProviderParams();
            PurchasedTransportTicketActivationProviderParams purchasedTransportTicketActivationProviderParams = cVarC != null ? new PurchasedTransportTicketActivationProviderParams(cVarC.getMaxAttempts(), cVarC.getActivationTimeout(), cVarC.getActivationBlockDuration()) : null;
            String strD = hVar.getActivationTimeoutDate();
            LocalDateTime localDateTimeC2 = strD != null ? ruf.b.c(strD) : null;
            String strA = hVar.getActivationAvailableDate();
            return new PurchasedTransitTicket.ToBeActivated(strJ, strR, strQ, strT, transitTicketTypeE, transitTicketDescriptionQ, listV, listP, localDateTimeC, strK, bVarA, transportTicketProviderZ, dVarO, strM, arrayList, arrayList2, strU, boolW, arrayList3, purchasedTransportTicketActivationProviderParams, localDateTimeC2, strA != null ? ruf.b.c(strA) : null, hVar.getCanBeUsedForExtension());
        }
        if (!(iVar instanceof cvf.d)) {
            if (iVar instanceof g) {
                g gVar = (g) iVar;
                String strE = gVar.getId();
                String strM2 = gVar.getTicketOfferId();
                String strL = gVar.getTicketNumber();
                String strO = gVar.getTitle();
                TransitTicketType transitTicketTypeE2 = mif.a.E(gVar.getTicketType());
                TransitTicketDescription transitTicketDescriptionQ2 = s.q(gVar.getDescriptions());
                List listQ = gVar.getZones();
                List listK = gVar.getTags();
                LocalDateTime localDateTimeC3 = ruf.b.c(gVar.getCreatedDate());
                String strF2 = gVar.getLocationName();
                wi0.a aVar2 = wi0.b.Companion;
                String strA2 = gVar.getCountryCode();
                aVar2.getClass();
                wi0.b bVarA2 = wi0.a.a(strA2);
                TransportTicketProvider transportTicketProviderZ2 = c.Z(gVar.getProvider());
                jo3.a aVarI = gVar.getPrice();
                d dVarO2 = aVarI != null ? mo3.a.o(aVarI) : null;
                String strH = gVar.getPocketId();
                List listD = gVar.getGeneralInputs();
                ArrayList arrayList4 = new ArrayList(w.t(listD, 10));
                Iterator it10 = listD.iterator();
                while (it10.hasNext()) {
                    arrayList4.add(l.v((e) it10.next()));
                }
                List listG = gVar.getPassengerInputs();
                ArrayList arrayList5 = new ArrayList(w.t(listG, 10));
                Iterator it11 = listG.iterator();
                while (it11.hasNext()) {
                    arrayList5.add(l.v((e) it11.next()));
                }
                return new PurchasedTransitTicket.Pending(strE, strM2, strL, strO, transitTicketTypeE2, transitTicketDescriptionQ2, listQ, listK, localDateTimeC3, strF2, bVarA2, transportTicketProviderZ2, dVarO2, strH, arrayList4, arrayList5, gVar.getTransactionId(), gVar.getIsDiscounted());
            }
            if (!(iVar instanceof f)) {
                if (!(iVar instanceof cvf.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                cvf.e eVar = (cvf.e) iVar;
                IllegalStateException illegalStateException = new IllegalStateException(j6.a.s("Can't map Transport state: ", eVar.getState(), " (id: ", eVar.getId(), ")"));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return null;
            }
            f fVar = (f) iVar;
            String strE2 = fVar.getId();
            String strM3 = fVar.getTicketOfferId();
            String strL2 = fVar.getTicketNumber();
            String strO2 = fVar.getTitle();
            TransitTicketType transitTicketTypeE3 = mif.a.E(fVar.getTicketType());
            TransitTicketDescription transitTicketDescriptionQ3 = s.q(fVar.getDescriptions());
            List listQ2 = fVar.getZones();
            List listK2 = fVar.getTags();
            LocalDateTime localDateTimeC4 = ruf.b.c(fVar.getCreatedDate());
            String strF3 = fVar.getLocationName();
            wi0.a aVar3 = wi0.b.Companion;
            String strA3 = fVar.getCountryCode();
            aVar3.getClass();
            wi0.b bVarA3 = wi0.a.a(strA3);
            TransportTicketProvider transportTicketProviderZ3 = c.Z(fVar.getProvider());
            jo3.a aVarI2 = fVar.getPrice();
            d dVarO3 = aVarI2 != null ? mo3.a.o(aVarI2) : null;
            String strH2 = fVar.getPocketId();
            List listD2 = fVar.getGeneralInputs();
            ArrayList arrayList6 = new ArrayList(w.t(listD2, 10));
            Iterator it12 = listD2.iterator();
            while (it12.hasNext()) {
                arrayList6.add(l.v((e) it12.next()));
            }
            List listG2 = fVar.getPassengerInputs();
            ArrayList arrayList7 = new ArrayList(w.t(listG2, 10));
            Iterator it13 = listG2.iterator();
            while (it13.hasNext()) {
                arrayList7.add(l.v((e) it13.next()));
            }
            return new PurchasedTransitTicket.NotPurchased(strE2, strM3, strL2, strO2, transitTicketTypeE3, transitTicketDescriptionQ3, listQ2, listK2, localDateTimeC4, strF3, bVarA3, transportTicketProviderZ3, dVarO3, strH2, arrayList6, arrayList7, fVar.getTransactionId(), fVar.getIsDiscounted());
        }
        cvf.d dVar = (cvf.d) iVar;
        k kVarU = dVar.getValidityTimeInterval();
        Intrinsics.checkNotNullParameter(kVarU, "<this>");
        LocalDateTime localDateTimeC5 = ruf.b.c(kVarU.getFrom());
        LocalDateTime localDateTimeC6 = ruf.b.c(kVarU.getTo());
        PurchasedTransitTicketValidity purchasedTransitTicketValidity = new PurchasedTransitTicketValidity(localDateTimeC5, localDateTimeC6);
        Intrinsics.checkNotNullParameter(now, "now");
        if (localDateTimeC6.isBefore(now)) {
            String strH3 = dVar.getId();
            String strQ2 = dVar.getTicketOfferId();
            String strP = dVar.getTicketNumber();
            String strS = dVar.getTitle();
            TransitTicketType transitTicketTypeE4 = mif.a.E(dVar.getTicketType());
            TransitTicketDescription transitTicketDescriptionQ4 = s.q(dVar.getDescriptions());
            List listV2 = dVar.getZones();
            List listO = dVar.getTags();
            LocalDateTime localDateTimeC7 = ruf.b.c(dVar.getCreatedDate());
            String strI = dVar.getLocationName();
            wi0.a aVar4 = wi0.b.Companion;
            String strD2 = dVar.getCountryCode();
            aVar4.getClass();
            wi0.b bVarA4 = wi0.a.a(strD2);
            TransportTicketProvider transportTicketProviderZ4 = c.Z(dVar.getProvider());
            d dVarO4 = mo3.a.o(dVar.getPrice());
            String strK2 = dVar.getPocketId();
            List listG3 = dVar.getGeneralInputs();
            ArrayList arrayList8 = new ArrayList(w.t(listG3, 10));
            Iterator it14 = listG3.iterator();
            while (it14.hasNext()) {
                arrayList8.add(l.v((e) it14.next()));
            }
            List listJ = dVar.getPassengerInputs();
            ArrayList arrayList9 = new ArrayList(w.t(listJ, 10));
            Iterator it15 = listJ.iterator();
            while (it15.hasNext()) {
                arrayList9.add(l.v((e) it15.next()));
            }
            return new PurchasedTransitTicket.Expired(strH3, strQ2, strP, strS, transitTicketTypeE4, transitTicketDescriptionQ4, listV2, listO, localDateTimeC7, strI, bVarA4, transportTicketProviderZ4, dVarO4, strK2, arrayList8, arrayList9, dVar.getTransactionId(), dVar.getIsDiscounted(), purchasedTransitTicketValidity);
        }
        String strH4 = dVar.getId();
        String strQ3 = dVar.getTicketOfferId();
        String strP2 = dVar.getTicketNumber();
        String strS2 = dVar.getTitle();
        TransitTicketType transitTicketTypeE5 = mif.a.E(dVar.getTicketType());
        TransitTicketDescription transitTicketDescriptionQ5 = s.q(dVar.getDescriptions());
        List listV3 = dVar.getZones();
        List listO2 = dVar.getTags();
        LocalDateTime localDateTimeC8 = ruf.b.c(dVar.getCreatedDate());
        String strI2 = dVar.getLocationName();
        wi0.a aVar5 = wi0.b.Companion;
        String strD3 = dVar.getCountryCode();
        aVar5.getClass();
        wi0.b bVarA5 = wi0.a.a(strD3);
        TransportTicketProvider transportTicketProviderZ5 = c.Z(dVar.getProvider());
        d dVarO5 = mo3.a.o(dVar.getPrice());
        String strK3 = dVar.getPocketId();
        List listG4 = dVar.getGeneralInputs();
        ArrayList arrayList10 = new ArrayList(w.t(listG4, 10));
        Iterator it16 = listG4.iterator();
        while (it16.hasNext()) {
            arrayList10.add(l.v((e) it16.next()));
        }
        List listJ2 = dVar.getPassengerInputs();
        ArrayList arrayList11 = new ArrayList(w.t(listJ2, 10));
        Iterator it17 = listJ2.iterator();
        while (it17.hasNext()) {
            arrayList11.add(l.v((e) it17.next()));
        }
        String strT2 = dVar.getTransactionId();
        Boolean boolW2 = dVar.getIsDiscounted();
        zuf.d dVarN = dVar.getQrCode();
        Intrinsics.checkNotNullParameter(dVarN, "<this>");
        zwf.c cVar = zwf.d.Companion;
        String type = dVarN.getType();
        cVar.getClass();
        TransportTicketQrCode transportTicketQrCode = new TransportTicketQrCode(zwf.c.a(type), dVarN.getValue());
        String strA4 = dVar.getActivatedAt();
        return new PurchasedTransitTicket.Activated(strH4, strQ3, strP2, strS2, transitTicketTypeE5, transitTicketDescriptionQ5, listV3, listO2, localDateTimeC8, strI2, bVarA5, transportTicketProviderZ5, dVarO5, strK3, arrayList10, arrayList11, strT2, boolW2, transportTicketQrCode, purchasedTransitTicketValidity, strA4 != null ? ruf.b.c(strA4) : null, dVar.getControlNumber(), dVar.getCanBeUsedForExtension());
    }
}
