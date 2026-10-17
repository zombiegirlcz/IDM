package mif;

import android.database.DatabaseUtils;
import android.view.View;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.revolut.feature.address.models.AddressItem;
import com.revolut.feature.external_accounts.impl.domain.pse.model.PseProvider;
import com.revolut.feature.freelancer.common.models.FreelancerCustomer;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceItemPayload;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceNumberData;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSupplierDetails;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceTax;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceUpdate;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceUpdateItem;
import com.revolut.feature.revolut_shop.api.domain.model.IppProductType;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberCancellationPreview;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberCancellationPreviewRefund;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberPostCancellationBreakdown;
import com.youTransactor.uCube.rpc.Constants;
import j3c.s;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kfj.g4;
import kfj.y3;
import kfj.z3;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kp0.w0;
import le.u1;
import mel.h0;
import mel.i0;
import nnd.a1;
import nnd.b1;
import nnd.c1;
import nnd.l0;
import nnd.m0;
import nnd.n0;
import nnd.o0;
import nnd.p0;
import nnd.r0;
import nnd.s0;
import nnd.t0;
import nnd.u0;
import nnd.v0;
import nnd.x0;
import nnd.y0;
import nnd.z0;
import org.jmrtd.cbeff.ISO781611;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import skm.b2;
import zhm.f0;
import zhm.q0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class e0 {
    public static final sgl.e A(jo3.b bVar) {
        return new sgl.e(bVar.getAmount(), bVar.getCurrency());
    }

    public static final PseProvider B(yh6.x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        String str = (String) xVar.getAttributes().get("pse.financial-institution-code");
        if (str != null) {
            return new PseProvider(xVar.getId(), xVar.getName(), xVar.getLogo(), str);
        }
        throw new IllegalStateException(j6.a.q("Missing required attribute 'pse.financial-institution-code' for PSE provider with id: ", xVar.getId()));
    }

    public static final FreelancerCustomer C(com.revolut.feature.freelancer.impl.network.models.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        String strE = lVar.getId();
        String strD = lVar.getFullName();
        String strC = lVar.getEmail();
        String strF = lVar.getPhone();
        String strH = lVar.getVatNumber();
        no3.b bVarA = lVar.getAddress();
        return new FreelancerCustomer(strE, strD, strC, strF, strH, bVarA != null ? oo3.a.a(bVarA) : null, new DateTime(lVar.getCreatedAt()), new DateTime(lVar.getUpdatedAt()));
    }

    public static final FreelancerCustomer D(ks6.v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        String str = vVar.f189270a;
        String str2 = vVar.f189271b;
        String str3 = vVar.f189272c;
        String str4 = vVar.d;
        String str5 = vVar.e;
        so3.c cVar = vVar.f;
        return new FreelancerCustomer(str, str2, str3, str4, str5, cVar != null ? to3.a.a(cVar) : null, new DateTime(vVar.f189273g), new DateTime(vVar.f189274h));
    }

    public static final EsimSubscriptionPhoneNumberCancellationPreview E(y3 y3Var) {
        Intrinsics.checkNotNullParameter(y3Var, "<this>");
        EsimSubscriptionPhoneNumberCancellationPreviewRefund esimSubscriptionPhoneNumberCancellationPreviewRefund = null;
        Instant instantOfEpochMilli = y3Var.getSuspensionDate() != null ? Instant.ofEpochMilli(y3Var.getSuspensionDate().longValue()) : null;
        Instant instantOfEpochMilli2 = y3Var.getTerminationDate() != null ? Instant.ofEpochMilli(y3Var.getTerminationDate().longValue()) : null;
        z3 z3VarB = y3Var.getRefund();
        if (z3VarB != null) {
            Intrinsics.checkNotNullParameter(z3VarB, "<this>");
            jo3.a aVarA = z3VarB.getAmount();
            dj0.d dVarO = aVarA != null ? mo3.a.o(aVarA) : null;
            String strB = z3VarB.getPoints();
            esimSubscriptionPhoneNumberCancellationPreviewRefund = new EsimSubscriptionPhoneNumberCancellationPreviewRefund(dVarO, strB != null ? new BigDecimal(strB) : null);
        }
        g4 g4VarA = y3Var.getPostCancellationBreakdown();
        Intrinsics.checkNotNullParameter(g4VarA, "<this>");
        return new EsimSubscriptionPhoneNumberCancellationPreview(instantOfEpochMilli, instantOfEpochMilli2, esimSubscriptionPhoneNumberCancellationPreviewRefund, new EsimSubscriptionPhoneNumberPostCancellationBreakdown(mo3.a.o(g4VarA.getFinalAmount())));
    }

    public static final d3c.p F(j3c.r rVar) {
        d3c.q qVar;
        d3c.w wVar;
        d3c.v vVar;
        j3c.s sVar;
        d3c.s sVar2;
        d3c.u uVar;
        Iterator it8;
        String str;
        String str2;
        d3c.d bVar;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        IppProductType ippProductTypeA = g3c.a.a(rVar.getProductType());
        String strG = rVar.getTermsAndConditionsUri();
        String strC = rVar.getName();
        String strB = rVar.getDescription();
        String strA = rVar.getCategory();
        d3c.q[] qVarArrValues = d3c.q.values();
        int length = qVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                qVar = null;
                break;
            }
            qVar = qVarArrValues[i];
            if (kotlin.text.a0.z(qVar.name(), strA, true)) {
                break;
            }
            i++;
        }
        if (qVar == null) {
            qVar = d3c.q.UNKNOWN;
        }
        d3c.q qVar2 = qVar;
        List listH = rVar.getVariations();
        int i2 = 10;
        ArrayList arrayList = new ArrayList(zhm.w.t(listH, 10));
        Iterator it9 = listH.iterator();
        while (it9.hasNext()) {
            j3c.u uVar2 = (j3c.u) it9.next();
            Intrinsics.checkNotNullParameter(uVar2, "<this>");
            String strJ = uVar2.getSku();
            long jB = uVar2.getCountLimit();
            String strK = uVar2.getSmallImage();
            List listF = uVar2.getImages();
            if (listF == null) {
                listF = f0.f322471a;
            }
            List list = listF;
            String strG2 = uVar2.getName();
            dj0.d dVarX = w0.x(uVar2.getPrice());
            j3c.b0 b0VarE = uVar2.getDiscountedPrice();
            dj0.d dVarX2 = b0VarE != null ? w0.x(b0VarE) : null;
            dj0.d dVarX3 = w0.x(uVar2.getDeliveryPrice());
            long jC = uVar2.getDeliveryDate();
            List listI = uVar2.getPromotions();
            ArrayList arrayList2 = new ArrayList(zhm.w.t(listI, i2));
            Iterator it10 = listI.iterator();
            while (it10.hasNext()) {
                arrayList2.add(mra.d.Y((j3c.c0) it10.next()));
            }
            j3c.c cVarA = uVar2.getAssets();
            Intrinsics.checkNotNullParameter(cVarA, "<this>");
            String strC2 = cVarA.getTile();
            String strA2 = cVarA.getAvatar();
            List listB = cVarA.getGallery();
            Iterator it11 = it9;
            IppProductType ippProductType = ippProductTypeA;
            ArrayList arrayList3 = new ArrayList(zhm.w.t(listB, i2));
            Iterator it12 = listB.iterator();
            while (it12.hasNext()) {
                j3c.i iVar = (j3c.i) it12.next();
                he0.m mVar = j3c.j.f171066a;
                Intrinsics.checkNotNullParameter(iVar, "<this>");
                if (iVar instanceof j3c.h) {
                    j3c.h hVar = (j3c.h) iVar;
                    Intrinsics.checkNotNullParameter(hVar, "<this>");
                    it8 = it12;
                    str = strG;
                    str2 = strC;
                    bVar = new d3c.c(hVar.getFallback(), (String) hVar.getLight().get("mp4"), (String) hVar.getDark().get("mp4"), hVar.getThumbnail());
                } else {
                    it8 = it12;
                    str = strG;
                    str2 = strC;
                    if (!(iVar instanceof j3c.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j3c.g gVar = (j3c.g) iVar;
                    Intrinsics.checkNotNullParameter(gVar, "<this>");
                    bVar = new d3c.b(gVar.getFullSize(), gVar.getThumbnail());
                }
                arrayList3.add(bVar);
                it12 = it8;
                strG = str;
                strC = str2;
            }
            arrayList.add(new d3c.x(strJ, jB, strK, list, strG2, dVarX, dVarX2, dVarX3, jC, arrayList2, new d3c.a(strC2, strA2, arrayList3)));
            it9 = it11;
            ippProductTypeA = ippProductType;
            i2 = 10;
        }
        IppProductType ippProductType2 = ippProductTypeA;
        String str3 = strG;
        String str4 = strC;
        List listF2 = rVar.getRecommendations();
        ArrayList arrayList4 = new ArrayList(zhm.w.t(listF2, 10));
        Iterator it13 = listF2.iterator();
        while (it13.hasNext()) {
            arrayList4.add(g3c.a.a((String) it13.next()));
        }
        j3c.s sVarD = rVar.getPageDefinition();
        if (sVarD != null) {
            Lazy lazy = j3c.t.f171139a;
            Intrinsics.checkNotNullParameter(sVarD, "<this>");
            String strB2 = sVarD.getProductDescription();
            s.e eVarD = sVarD.getStylePicker();
            if (eVarD != null) {
                Intrinsics.checkNotNullParameter(eVarD, "<this>");
                String strB3 = eVarD.getTitle();
                Map mapA = eVarD.getItems();
                LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapA.size()));
                for (Map.Entry entry : mapA.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((s.f) entry.getValue()).getColour());
                }
                vVar = new d3c.v(linkedHashMap, strB3);
            } else {
                vVar = null;
            }
            s.c cVarA2 = sVarD.getDetails();
            if (cVarA2 != null) {
                Intrinsics.checkNotNullParameter(cVarA2, "<this>");
                String strB4 = cVarA2.getTitle();
                List listA = cVarA2.getSubsections();
                ArrayList arrayList5 = new ArrayList(zhm.w.t(listA, 10));
                for (Iterator it14 = listA.iterator(); it14.hasNext(); it14 = it14) {
                    s.c.C0972c c0972c = (s.c.C0972c) it14.next();
                    Intrinsics.checkNotNullParameter(c0972c, "<this>");
                    arrayList5.add(new d3c.r(j6.a.q("24_", nkm.y.u(nkm.y.x(Regex.c((Regex) j3c.t.f171139a.getValue(), c0972c.getIcon()), new j1.e(24)), "_", new j1.e(25), 30)), c0972c.getTitle(), c0972c.getDescription()));
                    sVarD = sVarD;
                }
                sVar = sVarD;
                sVar2 = new d3c.s(strB4, arrayList5);
            } else {
                sVar = sVarD;
                sVar2 = null;
            }
            s.d dVarC = sVar.getSpecs();
            if (dVarC != null) {
                Intrinsics.checkNotNullParameter(dVarC, "<this>");
                String strB5 = dVarC.getTitle();
                List<s.d.c> listA2 = dVarC.getSubsections();
                ArrayList arrayList6 = new ArrayList(zhm.w.t(listA2, 10));
                for (s.d.c cVar : listA2) {
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    arrayList6.add(new d3c.t(cVar.getTitle(), cVar.getBulletPoints()));
                }
                uVar = new d3c.u(strB5, arrayList6);
            } else {
                uVar = null;
            }
            wVar = new d3c.w(strB2, vVar, sVar2, uVar);
        } else {
            wVar = null;
        }
        return new d3c.p(ippProductType2, str3, str4, strB, qVar2, arrayList, arrayList4, wVar);
    }

    public static final lre.a G(qre.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new lre.a(new DateTime(cVar.getCreateDate()), new TermsScope(cVar.getScope()));
    }

    public static final xzg.p H(i8h.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        xi0.a aVar2 = xi0.b.Companion;
        String strC = aVar.getFrom();
        aVar2.getClass();
        return new xzg.p(xi0.a.a(strC), xi0.a.a(aVar.getTo()), aVar.getAsk(), aVar.getBid(), aVar.getMid());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public static final yt8.d I(rt8.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        yt8.i iVar = (yt8.i) u1.u(cVar.getStatus(), vt8.d.f291926a);
        List<rt8.b> addresses = cVar.getAddresses();
        ArrayList arrayList = new ArrayList(zhm.w.t(addresses, 10));
        for (rt8.b bVar : addresses) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            arrayList.add(new AddressItem(bVar.getElementId(), to3.a.a(bVar.getAddress())));
        }
        return new yt8.d(iVar, arrayList);
    }

    public static final hz1.h J(t02.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        t02.d dVarB = oc.c.B(gVar.f266859a);
        String value = gVar.f266860b.getValue();
        jo3.a aVarP = mo3.a.p(gVar.f266861c);
        r02.a aVar = gVar.d;
        r02.b bVar = null;
        t02.b bVar2 = null;
        if (aVar != null) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            r02.g gVar2 = aVar.f250679a;
            Intrinsics.checkNotNullParameter(gVar2, "<this>");
            t02.a aVar2 = gVar2.f250686a;
            if (aVar2 != null) {
                Intrinsics.checkNotNullParameter(aVar2, "<this>");
                bVar2 = new t02.b(aVar2.f266850a, aVar2.f266851b);
            }
            bVar = new r02.b(new r02.h(bVar2, gVar2.f250687b));
        }
        return new hz1.h(dVarB, value, aVarP, bVar);
    }

    public static final i8h.a K(xzg.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return new i8h.a(pVar.getFrom().f306286a, pVar.getTo().f306286a, pVar.getAsk(), pVar.getBid(), pVar.getMid());
    }

    public static final FreelancerInvoiceUpdate L(FreelancerInvoice freelancerInvoice) {
        Intrinsics.checkNotNullParameter(freelancerInvoice, "<this>");
        DateTime dateTime = freelancerInvoice.f;
        DateTime dateTime2 = freelancerInvoice.f73377g;
        DateTime dateTime3 = freelancerInvoice.e;
        xi0.b bVar = freelancerInvoice.i;
        String str = freelancerInvoice.f73381m;
        List list = freelancerInvoice.f73382n;
        List list2 = freelancerInvoice.o;
        FreelancerInvoiceSupplierDetails freelancerInvoiceSupplierDetails = freelancerInvoice.f73384q;
        List list3 = freelancerInvoice.f73387t;
        ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
        Iterator it8 = list3.iterator();
        while (it8.hasNext()) {
            FreelancerInvoiceItemPayload freelancerInvoiceItemPayload = (FreelancerInvoiceItemPayload) it8.next();
            String str2 = freelancerInvoiceItemPayload.f73394b;
            sr6.h hVar = freelancerInvoiceItemPayload.f73395c;
            DateTime dateTime4 = dateTime3;
            double d = freelancerInvoiceItemPayload.d;
            dj0.d dVar = freelancerInvoiceItemPayload.e;
            List list4 = freelancerInvoiceItemPayload.i;
            Iterator it9 = it8;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
            Iterator it10 = list4.iterator();
            while (it10.hasNext()) {
                arrayList2.add(((FreelancerInvoiceTax) it10.next()).f73416a.f73418a);
            }
            arrayList.add(new FreelancerInvoiceUpdateItem(str2, hVar, d, dVar, arrayList2));
            dateTime3 = dateTime4;
            it8 = it9;
        }
        return new FreelancerInvoiceUpdate(dateTime3, dateTime, dateTime2, bVar, str, freelancerInvoiceSupplierDetails, list, list2, arrayList, freelancerInvoice.u, new FreelancerInvoiceNumberData(freelancerInvoice.f73375b, freelancerInvoice.d, false), freelancerInvoice.v, freelancerInvoice.f73390y, freelancerInvoice.z, freelancerInvoice.f73389x);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public static final rt8.c M(yt8.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        String strG = u1.g(dVar.f316665a, vt8.d.f291926a);
        List<AddressItem> list = dVar.f316666b;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (AddressItem addressItem : list) {
            Intrinsics.checkNotNullParameter(addressItem, "<this>");
            arrayList.add(new rt8.b(addressItem.getElementId(), to3.a.b(addressItem.getAddress())));
        }
        return new rt8.c(strG, arrayList);
    }

    public static final String N(f8l.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i = d8l.b.f112296a[bVar.ordinal()];
        if (i == 1) {
            return "from";
        }
        if (i == 2) {
            return "to";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String O(zel.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = bil.b.f15533b[aVar.ordinal()];
        if (i == 1) {
            return "1D";
        }
        if (i == 2) {
            return "1M";
        }
        if (i == 3) {
            return "1W";
        }
        if (i == 4) {
            return "1Y";
        }
        if (i == 5) {
            return "5Y";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String P(zel.f fVar) {
        int i = fVar == null ? -1 : bil.b.f15532a[fVar.ordinal()];
        if (i == -1) {
            return "ALL";
        }
        if (i == 1) {
            return "STOCKS";
        }
        if (i == 2) {
            return "ETPS";
        }
        if (i == 3) {
            return "BONDS";
        }
        if (i == 4) {
            return "CFDS";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int a(int i, List list) {
        return p.a.d(i, 31, list);
    }

    public static String b(int i) {
        if (i == 34) {
            return "GATT CONN LMP TIMEOUT";
        }
        if (i == 257) {
            return "TOO MANY OPEN CONNECTIONS";
        }
        if (i == 58) {
            return "GATT CONTROLLER BUSY";
        }
        if (i == 59) {
            return "GATT UNACCEPT CONN INTERVAL";
        }
        switch (i) {
            case 0:
                return "GATT_SUCCESS";
            case 1:
                return "GATT INVALID HANDLE";
            case 2:
                return "GATT READ NOT PERMIT";
            case 3:
                return "GATT WRITE NOT PERMIT";
            case 4:
                return "GATT INVALID PDU";
            case 5:
                return "GATT INSUF AUTHENTICATION";
            case 6:
                return "GATT REQ NOT SUPPORTED";
            case 7:
                return "GATT INVALID OFFSET";
            case 8:
                return "GATT INSUF AUTHORIZATION";
            case 9:
                return "GATT PREPARE Q FULL";
            case 10:
                return "GATT NOT FOUND";
            case 11:
                return "GATT NOT LONG";
            case 12:
                return "GATT INSUF KEY SIZE";
            case 13:
                return "GATT INVALID ATTR LEN";
            case 14:
                return "GATT ERR UNLIKELY";
            case 15:
                return "GATT INSUF ENCRYPTION";
            case 16:
                return "GATT UNSUPPORT GRP TYPE";
            case 17:
                return "GATT INSUF RESOURCE";
            default:
                switch (i) {
                    case 128:
                        return "GATT NO RESOURCES";
                    case 129:
                        return "GATT INTERNAL ERROR";
                    case 130:
                        return "GATT WRONG STATE";
                    case ISO781611.CREATION_DATE_AND_TIME_TAG /* 131 */:
                        return "GATT DB FULL";
                    case 132:
                        return "GATT BUSY";
                    case 133:
                        return "GATT ERROR";
                    case ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA /* 134 */:
                        return "GATT CMD STARTED";
                    case 135:
                        return "GATT ILLEGAL PARAMETER";
                    case 136:
                        return "GATT PENDING";
                    case 137:
                        return "GATT AUTH FAIL";
                    case 138:
                        return "GATT MORE";
                    case 139:
                        return "GATT INVALID CFG";
                    case 140:
                        return "GATT SERVICE STARTED";
                    case ModuleDescriptor.MODULE_VERSION /* 141 */:
                        return "GATT ENCRYPTED NO MITM";
                    case 142:
                        return "GATT NOT ENCRYPTED";
                    case 143:
                        return "GATT CONGESTED";
                    default:
                        switch (i) {
                            case Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION /* 253 */:
                                return "GATT CCCD CFG ERROR";
                            case 254:
                                return "GATT PROCEDURE IN PROGRESS";
                            case 255:
                                return "GATT VALUE OUT OF RANGE";
                            default:
                                return j6.a.l(i, "UNKNOWN (", ")");
                        }
                }
        }
    }

    public static final String c(String str) {
        String strSqlEscapeString = DatabaseUtils.sqlEscapeString(str);
        Intrinsics.checkNotNullExpressionValue(strSqlEscapeString, "sqlEscapeString(...)");
        return strSqlEscapeString;
    }

    public static final void d(aim.e eVar, View view) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getVisibility() == 0) {
            eVar.add(view);
        }
    }

    public static final f8l.b e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.f(str, "from")) {
            return f8l.b.FROM;
        }
        if (Intrinsics.f(str, "to")) {
            return f8l.b.TO;
        }
        throw new IllegalArgumentException(j6.a.q("Unknown asset pointer: ", str));
    }

    public static final dj0.d f(c1 c1Var) {
        Intrinsics.checkNotNullParameter(c1Var, "<this>");
        if (c1Var instanceof l0) {
            return ((l0) c1Var).f217567b.f255591b;
        }
        if (c1Var instanceof n0) {
            return ((n0) c1Var).f217573b.f255591b;
        }
        if (c1Var instanceof o0) {
            return ((o0) c1Var).f217576b;
        }
        if (c1Var instanceof p0) {
            return ((p0) c1Var).f217579b.d;
        }
        if (c1Var instanceof nnd.q0) {
            return ((nnd.q0) c1Var).f217581b;
        }
        if (c1Var instanceof r0) {
            return ((r0) c1Var).d;
        }
        if (c1Var instanceof s0) {
            return ((s0) c1Var).f217591b.d;
        }
        if (c1Var instanceof t0) {
            return ((t0) c1Var).d;
        }
        if (c1Var instanceof m0) {
            return ((m0) c1Var).f217570b;
        }
        if (c1Var instanceof u0) {
            return ((u0) c1Var).d;
        }
        if (c1Var instanceof v0) {
            return ((v0) c1Var).f217601b.f255606c;
        }
        if (c1Var instanceof nnd.w0) {
            return ((nnd.w0) c1Var).f217604c;
        }
        if (c1Var instanceof x0) {
            return ((x0) c1Var).f217606b;
        }
        if (c1Var instanceof y0) {
            return ((y0) c1Var).d;
        }
        if (c1Var instanceof z0) {
            return ((z0) c1Var).d;
        }
        if (c1Var instanceof a1) {
            return ((a1) c1Var).f217524b;
        }
        if (c1Var instanceof b1) {
            return ((b1) c1Var).d;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Object g(Continuation frame, Function0 function0, Function3 function3, FlowCollector flowCollector, Flow[] flowArr) {
        h6i.n0 n0Var = new h6i.n0(null, function0, function3, flowCollector, flowArr);
        b2 b2Var = new b2(frame.getContext(), frame, 1);
        Object objB = com.bumptech.glide.d.B(b2Var, true, b2Var, n0Var);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objB == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objB == aVar ? objB : Unit.f186387a;
    }

    public static final efm.r h(efm.r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        efm.r map = rVar.map(new vdl.s(28, new vea.n(24)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public static final int i(i0 i0Var, mel.q qVar) {
        ArrayList arrayListE0 = zhm.d0.E0(i0Var.f204757c, i0Var.f204756b);
        int i = 0;
        if (arrayListE0.isEmpty()) {
            return 0;
        }
        Iterator it8 = arrayListE0.iterator();
        while (it8.hasNext()) {
            if (((h0) it8.next()).f204753b == qVar && (i = i + 1) < 0) {
                zhm.v.r();
                throw null;
            }
        }
        return i;
    }

    public static final ej0.b j(ejb.f fVar, boolean z) {
        ej0.b bVar = fVar.f126845b;
        ej0.b bVar2 = fVar.f126844a;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (z) {
            return a.r(bVar2, bVar);
        }
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return a.r(a.r(bVar2, bVar), fVar.f126846c);
    }

    public static final mha.s k(List list) {
        Object next;
        mha.r rVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            mha.s sVar = (mha.s) next;
            mha.m mVar = sVar.f205465c;
            mha.m.Companion.getClass();
            if (Intrinsics.f(mVar, mha.m.f205456b) && ((rVar = sVar.f205464b) == null || rVar == mha.r.DEFAULT)) {
                break;
            }
        }
        return (mha.s) next;
    }

    public static final mha.s l(List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            mha.s sVar = (mha.s) next;
            mha.m mVar = sVar.f205465c;
            mha.m.Companion.getClass();
            if (Intrinsics.f(mVar, mha.m.f205456b) && sVar.f205464b == mha.r.HU_HIGHER_FREE_ATM) {
                break;
            }
        }
        return (mha.s) next;
    }

    public static final DateTime m(sr6.a aVar, DateTime now) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(now, "now");
        int i = yv6.a.f317127b[aVar.ordinal()];
        if (i == 1) {
            return now;
        }
        if (i == 2) {
            DateTime dateTimeWithDayOfMonth = now.withDayOfMonth(1);
            Intrinsics.checkNotNullExpressionValue(dateTimeWithDayOfMonth, "withDayOfMonth(...)");
            return dateTimeWithDayOfMonth;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        DateTime dateTimePlusMonths = now.withDayOfMonth(1).plusMonths(1);
        Intrinsics.checkNotNullExpressionValue(dateTimePlusMonths, "plusMonths(...)");
        return dateTimePlusMonths;
    }

    public static final hha.w0 n(zm3.a aVar) {
        zm3.h hVarD;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if ((aVar instanceof zm3.i) || (aVar instanceof zm3.j)) {
            hVarD = ((zm3.l) aVar).d();
        } else {
            if (!(aVar instanceof zm3.p) && !(aVar instanceof zm3.g)) {
                throw new NoWhenBranchMatchedException();
            }
            hVarD = null;
        }
        switch (hVarD == null ? -1 : am3.a.f6286a[hVarD.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return hha.w0.PRIVATE;
            case 2:
                return hha.w0.ULTRA;
            case 3:
                return hha.w0.METAL;
            case 4:
                return hha.w0.PREMIUM;
            case 5:
                return hha.w0.PLUS;
            case 6:
                return hha.w0.STANDARD;
            case 7:
                return hha.w0.ESSENTIAL;
        }
    }

    public static final ky7.c o(zw7.d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        ky7.d.Companion.getClass();
        ky7.d dVarA = ky7.b.a(d0Var);
        Intrinsics.checkNotNullParameter(dVarA, "<this>");
        switch (ky7.e.f190636a[dVarA.ordinal()]) {
            case 1:
                return ky7.c.IN_PROGRESS;
            case 2:
                return ky7.c.CANCELLED;
            case 3:
            case 4:
            case 5:
            case 6:
                return ky7.c.ACTIVE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final cli.r p(ViewController viewController) {
        cli.s sVar;
        Intrinsics.checkNotNullParameter(viewController, "<this>");
        aim.e eVarB = zhm.u.b();
        cli.s sVar2 = viewController.J;
        eVarB.add(sVar2);
        for (com.revolut.kompot.navigable.a aVar = viewController.f98405m; aVar != null; aVar = aVar.f98405m) {
            ViewController viewController2 = aVar instanceof ViewController ? (ViewController) aVar : null;
            if (viewController2 != null && (sVar = viewController2.J) != null) {
                eVarB.add(sVar);
            }
        }
        aim.e eVarA = zhm.u.a(eVarB);
        return eVarA.size() > 1 ? new cli.c(eVarA) : sVar2;
    }

    public static final boolean q(FreelancerInvoice freelancerInvoice) {
        Intrinsics.checkNotNullParameter(freelancerInvoice, "<this>");
        return freelancerInvoice.f73378h == sr6.n.CANCELLED;
    }

    public static final boolean r(FreelancerInvoice freelancerInvoice) {
        Intrinsics.checkNotNullParameter(freelancerInvoice, "<this>");
        return freelancerInvoice.f73378h == sr6.n.DRAFT;
    }

    public static final boolean s(mha.s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return Intrinsics.f(sVar.f205469l, Boolean.FALSE);
    }

    public static final boolean t(FreelancerInvoice freelancerInvoice, DateTime now) {
        Intrinsics.checkNotNullParameter(freelancerInvoice, "<this>");
        Intrinsics.checkNotNullParameter(now, "now");
        if (!x(freelancerInvoice)) {
            return false;
        }
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        return now.withZone(dateTimeZone).withTimeAtStartOfDay().isAfter(freelancerInvoice.e().withZone(dateTimeZone).withTimeAtStartOfDay());
    }

    public static final boolean u(FreelancerInvoice freelancerInvoice) {
        Intrinsics.checkNotNullParameter(freelancerInvoice, "<this>");
        sr6.n[] elements = {sr6.n.COMPLETED, sr6.n.PAID};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements).contains(freelancerInvoice.f73378h);
    }

    public static final boolean v(FreelancerInvoice freelancerInvoice) {
        Intrinsics.checkNotNullParameter(freelancerInvoice, "<this>");
        if (freelancerInvoice.f73387t.isEmpty()) {
            return false;
        }
        List<FreelancerInvoiceItemPayload> list = freelancerInvoice.f73387t;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (FreelancerInvoiceItemPayload freelancerInvoiceItemPayload : list) {
                if (freelancerInvoiceItemPayload.f73394b.length() <= 0 || freelancerInvoiceItemPayload.d == 0.0d || !freelancerInvoiceItemPayload.e.f(dj0.d.e)) {
                    return false;
                }
            }
        }
        return freelancerInvoice.f73381m != null;
    }

    public static final boolean w(FreelancerInvoice freelancerInvoice) {
        Intrinsics.checkNotNullParameter(freelancerInvoice, "<this>");
        boolean zD = freelancerInvoice.d();
        sr6.n nVar = freelancerInvoice.f73378h;
        if (!zD || r(freelancerInvoice)) {
            return false;
        }
        Intrinsics.checkNotNullParameter(freelancerInvoice, "<this>");
        if (nVar == sr6.n.EXPIRED || q(freelancerInvoice)) {
            return false;
        }
        Intrinsics.checkNotNullParameter(freelancerInvoice, "<this>");
        return nVar != sr6.n.COMPLETED;
    }

    public static final boolean x(FreelancerInvoice freelancerInvoice) {
        Intrinsics.checkNotNullParameter(freelancerInvoice, "<this>");
        return freelancerInvoice.f73378h == sr6.n.SENT;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean y(mha.s r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            mha.k r1 = r6.f205466g
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L35
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1 instanceof mha.j
            if (r0 == 0) goto L20
            mha.j r1 = (mha.j) r1
            double r0 = r1.f205454a
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L1e
            r0 = r3
            goto L2c
        L1e:
            r0 = r2
            goto L2c
        L20:
            boolean r0 = r1 instanceof mha.i
            if (r0 == 0) goto L2f
            mha.i r1 = (mha.i) r1
            dj0.d r0 = r1.f205453a
            boolean r0 = r0.k()
        L2c:
            if (r0 == 0) goto L3a
            goto L35
        L2f:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L35:
            mha.p r6 = r6.f205467h
            if (r6 != 0) goto L3a
            return r3
        L3a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mif.e0.y(mha.s):boolean");
    }

    public static final ejb.f z(ejb.f fVar, ejb.f item) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        return new ejb.f(a.u(fVar.f126844a, item.f126844a), a.u(fVar.f126845b, item.f126845b), a.u(fVar.f126846c, item.f126846c));
    }
}
