package mif;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import aw0.b9;
import aw0.o9;
import aw0.r9;
import aw0.s9;
import com.revolut.chat.domain.model.Transcript;
import com.revolut.chat.domain.model.TranscriptDateRange;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.core.models.transfers.ApmTransferDestination;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferences;
import com.revolut.feature.revolut_shop.api.domain.model.IppProductType;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.transport.models.transit.TransitTicketType;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.esim.api.model.EsimAutoRenewalTerms;
import com.revolut.retail.wealth.resources.R$string;
import d3c.g0;
import dej.x1;
import dfl.k0;
import dx4.e1;
import ft3.c1;
import ft3.d1;
import ft3.j1;
import ft3.s0;
import ft3.t0;
import ft3.v0;
import ft3.y0;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kfj.e3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.FlowCollector;
import le.u1;
import nx4.m0;
import nx4.o0;
import org.joda.time.LocalDate;
import tof.l1;
import v30.w0;
import v30.x0;
import zh9.r0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final Transcript A(n20.d dVar) {
        x0 x0Var;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        UUID uuidB = dVar.getId();
        UUID uuidD = dVar.getTicketId();
        w0 w0Var = x0.Companion;
        String strC = dVar.getState();
        w0Var.getClass();
        x0[] x0VarArrValues = x0.values();
        int length = x0VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                x0Var = null;
                break;
            }
            x0Var = x0VarArrValues[i];
            if (Intrinsics.f(x0Var.a(), strC)) {
                break;
            }
            i++;
        }
        x0 x0Var2 = x0Var;
        if (x0Var2 == null) {
            throw new IllegalStateException(j6.a.q("Irrelevant transcript state: ", strC));
        }
        return new Transcript(uuidB, uuidD, x0Var2, dVar.getCreatedAt(), dVar.getUpdatedAt());
    }

    public static final TranscriptDateRange B(c20.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new TranscriptDateRange(aVar.getStart(), aVar.getEnd());
    }

    public static final TranscriptDateRange C(n20.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new TranscriptDateRange(aVar.getStart(), aVar.getEnd());
    }

    public static final Terms D(qre.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        String strC = dVar.getId();
        String strH = dVar.getUri();
        String strB = dVar.getHtmlUri();
        if (strB == null) {
            strB = dVar.getUri();
        }
        return new Terms(strC, strH, strB, dVar.getPdfUri(), new LocalDate(dVar.getCreatedDate()), new TermsScope(dVar.getScope()), dVar.getTemplateId(), dVar.getTitle(), dVar.getVersion());
    }

    public static final TransitTicketType E(cvf.z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        String strC = zVar.getKey();
        String strD = zVar.getName();
        bxf.g gVar = bxf.h.Companion;
        String strA = zVar.getCategory();
        gVar.getClass();
        return new TransitTicketType(strC, strD, bxf.g.a(strA), zVar.getDisplayOrder());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.shared.feature.market_data.models.domain.models.Amount F(e8l.a r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.math.BigDecimal r1 = new java.math.BigDecimal
            java.lang.String r2 = r5.getValue()
            r1.<init>(r2)
            java.lang.String r2 = r5.getAssetType()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case 2157622: goto L41;
                case 1300506381: goto L35;
                case 1731749696: goto L29;
                case 1996612801: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L49
        L1d:
            java.lang.String r0 = "CRYPTO"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L26
            goto L49
        L26:
            f8l.c r0 = f8l.c.CRYPTO
            goto L4e
        L29:
            java.lang.String r0 = "SECURITY"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L32
            goto L49
        L32:
            f8l.c r0 = f8l.c.SECURITY
            goto L4e
        L35:
            java.lang.String r0 = "COMMODITY"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L3e
            goto L49
        L3e:
            f8l.c r0 = f8l.c.COMMODITY
            goto L4e
        L41:
            java.lang.String r0 = "FIAT"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L4c
        L49:
            f8l.c r0 = f8l.c.UNDEFINED
            goto L4e
        L4c:
            f8l.c r0 = f8l.c.FIAT
        L4e:
            java.lang.String r2 = r5.getSymbol()
            java.lang.String r3 = r5.getRef()
            if (r3 == 0) goto L62
            xi0.a r5 = xi0.b.Companion
            r5.getClass()
            xi0.b r5 = xi0.a.a(r3)
            goto L95
        L62:
            java.lang.String r5 = r5.getSymbol()
            int[] r3 = d8l.a.f112295a
            int r4 = r0.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L8c
            r4 = 2
            if (r3 == r4) goto L8c
            r4 = 3
            if (r3 == r4) goto L8c
            r5 = 4
            if (r3 == r5) goto L84
            r5 = 5
            if (r3 != r5) goto L7e
            goto L84
        L7e:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L84:
            xi0.a r5 = xi0.b.Companion
            r5.getClass()
            xi0.b r5 = xi0.b.f306271c
            goto L95
        L8c:
            xi0.a r3 = xi0.b.Companion
            r3.getClass()
            xi0.b r5 = xi0.a.a(r5)
        L95:
            com.revolut.shared.feature.market_data.models.domain.models.Asset r3 = new com.revolut.shared.feature.market_data.models.domain.models.Asset
            r3.<init>(r0, r2, r5)
            com.revolut.shared.feature.market_data.models.domain.models.Amount r5 = new com.revolut.shared.feature.market_data.models.domain.models.Amount
            r5.<init>(r1, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mif.a.F(e8l.a):com.revolut.shared.feature.market_data.models.domain.models.Amount");
    }

    public static final d3c.h G(j3c.m mVar) {
        g0 g0Var;
        d3c.l lVar;
        dj0.d dVar;
        dj0.d dVar2;
        d3c.i iVar;
        d3c.i iVar2;
        d3c.a0 a0Var;
        String str;
        d3c.o oVar;
        String str2 = "<this>";
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        String strG = mVar.getId();
        String strM = mVar.getState();
        g0[] g0VarArrValues = g0.values();
        int length = g0VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                g0Var = null;
                break;
            }
            g0Var = g0VarArrValues[i];
            if (kotlin.text.a0.z(g0Var.name(), strM, true)) {
                break;
            }
            i++;
        }
        if (g0Var == null) {
            g0Var = g0.UNKNOWN;
        }
        g0 g0Var2 = g0Var;
        String strB = mVar.getCreatedBy();
        long jC = mVar.getCreatedDate();
        long jR = mVar.getUpdatedDate();
        Long lE = mVar.getExpirationDate();
        String strI = mVar.getMerchantId();
        String strJ = mVar.getOrderNumber();
        dj0.d dVarX = kp0.w0.x(mVar.getTotalAmount());
        j3c.b bVarD = mVar.getDeliveryAddress();
        Intrinsics.checkNotNullParameter(bVarD, "<this>");
        Address address = new Address(bVarD.getStreetLine1(), bVarD.getStreetLine2(), bVarD.getRegion(), bVarD.getCity(), bVarD.getPostcode(), bVarD.getCountry(), bVarD.getFullAddress(), null, null, null, null, bVarD.getNeighbourhood(), null, Address.Type.INSTANCE.fromString(null), null, 22400, null);
        j3c.o oVarK = mVar.getPaymentMethod();
        Intrinsics.checkNotNullParameter(oVarK, "<this>");
        String strC = oVarK.getType();
        d3c.l[] lVarArrValues = d3c.l.values();
        int length2 = lVarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                lVar = null;
                break;
            }
            lVar = lVarArrValues[i2];
            int i3 = length2;
            int i5 = i2;
            if (kotlin.text.a0.z(lVar.name(), strC, true)) {
                break;
            }
            i2 = i5 + 1;
            length2 = i3;
        }
        if (lVar == null) {
            lVar = d3c.l.UNKNOWN;
        }
        d3c.k kVar = new d3c.k(lVar, oVarK.getPaymentId(), oVarK.getPocketId());
        List listH = mVar.getItems();
        ArrayList arrayList = new ArrayList(zhm.w.t(listH, 10));
        Iterator it8 = listH.iterator();
        while (it8.hasNext()) {
            j3c.n nVar = (j3c.n) it8.next();
            Intrinsics.checkNotNullParameter(nVar, "<this>");
            String strD = nVar.getSku();
            IppProductType ippProductTypeA = g3c.a.a(nVar.getType());
            long jA = nVar.getCount();
            dj0.d dVarX2 = kp0.w0.x(nVar.getUnitPrice());
            dj0.d dVarX3 = kp0.w0.x(nVar.getTotalPrice());
            j3c.a0 a0VarC = nVar.getMetadata();
            Intrinsics.checkNotNullParameter(a0VarC, "<this>");
            Iterator it9 = it8;
            d3c.d0 d0Var = new d3c.d0(a0VarC.getLocationId());
            j3c.l lVarE = nVar.getStrings();
            Intrinsics.checkNotNullParameter(lVarE, "<this>");
            d3c.g gVar = new d3c.g(lVarE.getType(), lVarE.getVariation());
            j3c.k kVarB = nVar.getImages();
            Intrinsics.checkNotNullParameter(kVarB, "<this>");
            arrayList.add(new d3c.j(strD, ippProductTypeA, jA, dVarX2, dVarX3, d0Var, gVar, new d3c.f(kVarB.getSmall(), kVarB.getAvatar())));
            it8 = it9;
            g0Var2 = g0Var2;
        }
        g0 g0Var3 = g0Var2;
        List listL = mVar.getShipments();
        ArrayList arrayList2 = new ArrayList(zhm.w.t(listL, 10));
        Iterator it10 = listL.iterator();
        while (it10.hasNext()) {
            j3c.p pVar = (j3c.p) it10.next();
            Intrinsics.checkNotNullParameter(pVar, str2);
            String strC2 = pVar.getServiceProvider();
            Iterator it11 = it10;
            d3c.a0[] a0VarArrValues = d3c.a0.values();
            int length3 = a0VarArrValues.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length3) {
                    a0Var = null;
                    break;
                }
                a0Var = a0VarArrValues[i6];
                int i21 = i6;
                int i22 = length3;
                if (kotlin.text.a0.z(a0Var.name(), strC2, true)) {
                    break;
                }
                i6 = i21 + 1;
                length3 = i22;
            }
            if (a0Var == null) {
                a0Var = d3c.a0.UNKNOWN;
            }
            d3c.a0 a0Var2 = a0Var;
            String strD2 = pVar.getState();
            d3c.o[] oVarArrValues = d3c.o.values();
            int length4 = oVarArrValues.length;
            int i32 = 0;
            while (true) {
                if (i32 >= length4) {
                    str = strB;
                    oVar = null;
                    break;
                }
                oVar = oVarArrValues[i32];
                int i33 = i32;
                str = strB;
                if (kotlin.text.a0.z(oVar.name(), strD2, true)) {
                    break;
                }
                i32 = i33 + 1;
                strB = str;
            }
            if (oVar == null) {
                oVar = d3c.o.UNKNOWN;
            }
            d3c.o oVar2 = oVar;
            long jA2 = pVar.getDeliveryDate();
            String strE = pVar.getTrackingNumber();
            String strF = pVar.getTrackingUrl();
            List listB = pVar.getItems();
            ArrayList arrayList3 = new ArrayList(zhm.w.t(listB, 10));
            for (Iterator it12 = listB.iterator(); it12.hasNext(); it12 = it12) {
                j3c.q qVar = (j3c.q) it12.next();
                Intrinsics.checkNotNullParameter(qVar, str2);
                arrayList3.add(new d3c.n(qVar.getSku(), g3c.a.a(qVar.getType()), Integer.parseInt(qVar.getCount())));
                str2 = str2;
            }
            arrayList2.add(new d3c.m(a0Var2, oVar2, jA2, strE, strF, arrayList3));
            it10 = it11;
            str2 = str2;
            strB = str;
        }
        String str3 = strB;
        j3c.b0 b0VarP = mVar.getTotalDeliveryAmount();
        dj0.d dVarX4 = b0VarP != null ? kp0.w0.x(b0VarP) : null;
        j3c.b0 b0VarQ = mVar.getTotalTaxAmount();
        dj0.d dVarX5 = b0VarQ != null ? kp0.w0.x(b0VarQ) : null;
        String strA = mVar.getCancellationReason();
        if (strA != null) {
            d3c.i[] iVarArrValues = d3c.i.values();
            int length5 = iVarArrValues.length;
            dVar = dVarX4;
            int i43 = 0;
            while (true) {
                if (i43 >= length5) {
                    dVar2 = dVarX5;
                    iVar2 = null;
                    break;
                }
                iVar2 = iVarArrValues[i43];
                int i59 = i43;
                dVar2 = dVarX5;
                if (kotlin.text.a0.z(iVar2.name(), strA, true)) {
                    break;
                }
                i43 = i59 + 1;
                dVarX5 = dVar2;
            }
            iVar = iVar2;
        } else {
            dVar = dVarX4;
            dVar2 = dVarX5;
            iVar = null;
        }
        return new d3c.h(strG, g0Var3, str3, jC, jR, lE, strI, strJ, dVarX, address, kVar, arrayList, arrayList2, dVar, dVar2, iVar, mVar.getTaxRate(), mVar.getHasFailedPayments());
    }

    public static final x1 H(e3 e3Var) {
        Intrinsics.checkNotNullParameter(e3Var, "<this>");
        boolean zC = e3Var.getEnabled();
        boolean zB = e3Var.getAllowed();
        kfj.a aVarF = e3Var.getTerms();
        EsimAutoRenewalTerms esimAutoRenewalTermsF = aVarF != null ? knm.b.F(aVarF) : null;
        String strA = e3Var.getActiveSubscriptionId();
        Instant instantOfEpochMilli = e3Var.getRenewedOnDate() != null ? Instant.ofEpochMilli(e3Var.getRenewedOnDate().longValue()) : null;
        Instant instantOfEpochMilli2 = Instant.ofEpochMilli(e3Var.getExpirationDate());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(...)");
        return new x1(zC, zB, instantOfEpochMilli2, instantOfEpochMilli, esimAutoRenewalTermsF, strA);
    }

    public static final k0 I(n3f.b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        return new k0(hx7.a.v(b0Var.getBaseCurrencyValue()), hx7.a.v(b0Var.getInstrumentCurrencyValue()), null);
    }

    public static final k0 J(w3f.g0 g0Var) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        return new k0(mo3.a.o(g0Var.getBaseCurrencyValue()), mo3.a.o(g0Var.getInstrumentCurrencyValue()), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    public static final lu3.c K(k04.a aVar, r10.f networkUrlBuilder) {
        ?? arrayList;
        xz3.b bVar;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(networkUrlBuilder, "networkUrlBuilder");
        String strG = aVar.getTitle();
        String strF = aVar.getSubtitle();
        String strA = aVar.getButtonText();
        String strC = aVar.getFooter();
        List listD = aVar.getItems();
        if (listD != null) {
            ArrayList arrayListZ = zhm.d0.Z(listD);
            arrayList = new ArrayList();
            Iterator it8 = arrayListZ.iterator();
            while (it8.hasNext()) {
                e1 e1VarP = o0.p((m0) it8.next(), arrayListZ);
                if (e1VarP != null) {
                    arrayList.add(e1VarP);
                }
            }
        } else {
            arrayList = f0.f322471a;
        }
        ?? r4 = arrayList;
        j04.a aVarE = aVar.getPreferences();
        lu3.b bVar2 = null;
        ConsentPreferences consentPreferencesA = aVarE != null ? j04.c.a(aVarE) : null;
        List listB = aVar.getDocuments();
        if (listB != null && (bVar = (xz3.b) zhm.d0.d0(listB)) != null) {
            String strG2 = bVar.getName();
            String string = r10.f.q(networkUrlBuilder, bVar.getPdfPath()).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            bVar2 = new lu3.b(strG2, string);
        }
        return new lu3.c(strG, strF, r4, strC, strA, consentPreferencesA, bVar2);
    }

    public static final hz1.e L(t02.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        t02.d dVarB = oc.c.B(fVar.f266856a);
        ApmTransferDestination apmTransferDestination = fVar.f266857b;
        jo3.a aVarP = mo3.a.p(fVar.f266858c);
        String str = fVar.d;
        java.time.LocalDate localDate = fVar.e;
        String str2 = null;
        String str3 = localDate != null ? localDate.format(DateTimeFormatter.ISO_LOCAL_DATE) : null;
        jli.c cVar = fVar.f;
        if (cVar != null) {
            switch (gz1.a.f147933a[cVar.ordinal()]) {
                case 1:
                    str2 = "DAILY";
                    break;
                case 2:
                    str2 = "WEEKLY";
                    break;
                case 3:
                    str2 = "BIWEEKLY";
                    break;
                case 4:
                    str2 = "MONTHLY";
                    break;
                case 5:
                    str2 = "ANNUALLY";
                    break;
                case 6:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return new hz1.e(dVarB, apmTransferDestination, aVarP, str, str3, str2);
    }

    public static final yh6.k M(lg6.a aVar) {
        yh6.j iVar;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        dj0.d dVar = aVar.f195073a;
        yh6.f fVar = new yh6.f(dVar.f115083b.f306286a, dVar.f115082a);
        ve6.a aVar2 = aVar.d;
        if (aVar2 == null) {
            String str = aVar.f195074b;
            if (str == null) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("providerId is required for non multi currency top up request");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                throw illegalArgumentException;
            }
            iVar = new yh6.h(str);
        } else {
            String str2 = aVar.f195074b;
            String str3 = aVar2.f288131a;
            l1 l1Var = aVar2.f288132b;
            iVar = new yh6.i(str2, str3, new yh6.s(String.valueOf(l1Var.f272904a), String.valueOf(l1Var.f272905b), cp5.d.d(new Pair(l1Var.f272906c, l1Var.d)), l1Var.e), zhm.v.l(aVar2.f288133c ? "TCS_THRESHOLD_EXCEEDED" : null), aVar2.d.f297794a);
        }
        return new yh6.k(fVar, iVar, Intrinsics.f(aVar.f195075c, Boolean.TRUE) ? new yh6.l() : null);
    }

    public static final n3f.b0 N(k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        return new n3f.b0(hx7.a.A(k0Var.f114406a), hx7.a.A(k0Var.f114407b));
    }

    public static final dj0.d O(ej0.b bVar, int i, RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        BigDecimal scale = bVar.f126703a.setScale(i, roundingMode);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        ej0.b bVarB = ej0.b.b(bVar, scale, null, 2);
        BigDecimal bigDecimal = bVarB.f126703a;
        long jLongValue = bigDecimal.unscaledValue().longValue();
        xi0.b bVarA = bVarB.f126704b;
        if (bVarA.c() != bigDecimal.scale()) {
            bVarA = xi0.b.a(bVarA, Integer.valueOf(bigDecimal.scale()));
        }
        return new dj0.d(jLongValue, bVarA);
    }

    public static /* synthetic */ dj0.d P(ej0.b bVar, int i, int i2) {
        RoundingMode roundingMode = RoundingMode.DOWN;
        if ((i2 & 1) != 0) {
            i = 10;
        }
        if ((i2 & 2) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        return O(bVar, i, roundingMode);
    }

    public static dj0.d Q(ej0.b bVar) {
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        BigDecimal scale = bVar.f126703a.setScale(bVar.f126704b.c(), roundingMode);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        ej0.b bVarB = ej0.b.b(bVar, scale, null, 2);
        return new dj0.d(bVarB.f126703a.unscaledValue().longValue(), bVarB.f126704b);
    }

    public static final dj0.d R(ej0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return P(bVar, bVar.f126703a.scale(), 2);
    }

    public static final bi9.f S(zh9.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        r0 r0Var = yVar.f322365a;
        zh9.p pVar = yVar.f322366b;
        return new bi9.f(r0Var, Integer.valueOf(pVar.f322316a), czi.c.s(pVar));
    }

    public static final b9 T(mel.q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        int i = swk.a.f266232a[qVar.ordinal()];
        if (i == 1) {
            return b9.NEGATIVE;
        }
        if (i == 2) {
            return b9.NEUTRAL;
        }
        if (i == 3) {
            return b9.POSITIVE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final float U(mel.q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        int i = swk.a.f266232a[qVar.ordinal()];
        if (i == 1) {
            return 0.25f;
        }
        if (i == 2) {
            return 0.5f;
        }
        if (i == 3) {
            return 0.75f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final n20.c V(TranscriptDateRange transcriptDateRange) {
        Intrinsics.checkNotNullParameter(transcriptDateRange, "<this>");
        return new n20.c(transcriptDateRange.f51076a, transcriptDateRange.f51077b);
    }

    public static s9 W(mel.q qVar) {
        r9 segmentsCount = r9.THREE;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(segmentsCount, "segmentsCount");
        return new s9(U(qVar), Float.valueOf(0.5f), segmentsCount, 8);
    }

    public static TextClause X(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 124);
    }

    public static final TextLocalisedClause Y(mel.q qVar, Custom custom) {
        int i;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        int i2 = swk.a.f266232a[qVar.ordinal()];
        if (i2 == 1) {
            i = R$string.instrument_insights_sentiment_bearish;
        } else if (i2 == 2) {
            i = R$string.instrument_insights_sentiment_neutral;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.instrument_insights_sentiment_bullish;
        }
        return new TextLocalisedClause(i, null, custom, 10);
    }

    public static final i80.a Z(i80.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int[][] iArr = aVar.f159408a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (kotlin.collections.d.G(iArr[i], 1)) {
                break;
            }
            i++;
        }
        int length2 = iArr.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i2 = length2 - 1;
                if (kotlin.collections.d.G(iArr[length2], 1)) {
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length2 = i2;
            }
            length2 = -1;
        } else {
            length2 = -1;
        }
        if (i == -1) {
            IllegalStateException illegalStateException = new IllegalStateException("QR code matrix is empty");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return new i80.a(new int[0][]);
        }
        int i3 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        for (int[] iArr2 : iArr) {
            if (i3 == 0 && i5 == iArr2.length - 1) {
                break;
            }
            int length3 = iArr2.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length3) {
                    i6 = -1;
                    break;
                }
                if (iArr2[i6] == 1) {
                    break;
                }
                i6++;
            }
            if (i6 != -1 && i6 < i3) {
                i3 = i6;
            }
            int length4 = iArr2.length - 1;
            if (length4 >= 0) {
                while (true) {
                    int i21 = length4 - 1;
                    if (iArr2[length4] == 1) {
                        break;
                    }
                    if (i21 < 0) {
                        break;
                    }
                    length4 = i21;
                }
                length4 = -1;
            } else {
                length4 = -1;
            }
            if (length4 != -1 && length4 > i5) {
                i5 = length4;
            }
        }
        int i22 = (length2 - i) + 1;
        int[][] iArr3 = new int[i22][];
        for (int i32 = 0; i32 < i22; i32++) {
            int i33 = (i5 - i3) + 1;
            int[] iArr4 = new int[i33];
            for (int i43 = 0; i43 < i33; i43++) {
                iArr4[i43] = iArr[i + i32][i3 + i43];
            }
            iArr3[i32] = iArr4;
        }
        return new i80.a(iArr3);
    }

    public static ali.k a(ali.g gVar, int i, int i2, ali.h model, int i3) {
        if ((i3 & 1) != 0) {
            i = R$layout.flow_scroller_item_container;
        }
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        return new ali.k(gVar, i, model, i2);
    }

    public static final Object a0(CoroutineContext coroutineContext, Object obj2, Object obj3, Function2 function2, Continuation continuation) {
        Object objInvoke;
        Object objC = zkm.w.c(coroutineContext, obj3);
        try {
            wkm.x xVar = new wkm.x(continuation, coroutineContext);
            if (function2 == null) {
                objInvoke = fim.h.c(function2, obj2, xVar);
            } else {
                u0.f(2, function2);
                objInvoke = function2.invoke(obj2, xVar);
            }
            zkm.w.a(coroutineContext, objC);
            if (objInvoke == fim.a.COROUTINE_SUSPENDED) {
                nim.a.C(continuation);
            }
            return objInvoke;
        } catch (Throwable th10) {
            zkm.w.a(coroutineContext, objC);
            throw th10;
        }
    }

    public static final int b(AnalyticsAccount analyticsAccount) {
        if ((analyticsAccount instanceof AnalyticsAccount.Personal.All) || (analyticsAccount instanceof AnalyticsAccount.Joint.All) || (analyticsAccount instanceof AnalyticsAccount.Pro.All)) {
            return 0;
        }
        if ((analyticsAccount instanceof AnalyticsAccount.Personal.CurrencyPocket) || (analyticsAccount instanceof AnalyticsAccount.Joint.CurrencyPocket) || (analyticsAccount instanceof AnalyticsAccount.Pro.CurrencyPocket)) {
            return 1;
        }
        if ((analyticsAccount instanceof AnalyticsAccount.Personal.Subaccount) || (analyticsAccount instanceof AnalyticsAccount.Joint.Subaccount)) {
            return 2;
        }
        return analyticsAccount instanceof AnalyticsAccount.Personal.CreditCard ? 3 : Integer.MAX_VALUE;
    }

    public static final FlowCollector c(FlowCollector flowCollector, CoroutineContext coroutineContext) {
        return ((flowCollector instanceof wkm.w) || (flowCollector instanceof wkm.s)) ? flowCollector : new vkf.d(flowCollector, coroutineContext);
    }

    public static final void c0(ViewController viewController, zki.h modalHost, Function1 onClosed) {
        Intrinsics.checkNotNullParameter(viewController, "<this>");
        Intrinsics.checkNotNullParameter(modalHost, "modalHost");
        Intrinsics.checkNotNullParameter(onClosed, "onClosed");
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        viewController.l2(new ky4.f(ref$BooleanRef, onClosed, ref$ObjectRef));
        modalHost.a(viewController, new kp0.m(ref$BooleanRef, ref$ObjectRef, 4));
    }

    public static final efm.r d(efm.r a7, efm.r b4) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        return u1.d(a7, b4);
    }

    public static final efm.r e(efm.r a7, efm.r b4, efm.r c2) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        return u1.e(a7, b4, c2);
    }

    public static final efm.r f(efm.r a7, efm.r b4, efm.r c2, efm.r d) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        return nim.a.w(u1.d(u1.e(a7, b4, c2), d), new vea.n(13));
    }

    public static final efm.r g(efm.r a7, efm.r b4, efm.r c2, efm.r d, efm.r e) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        return nim.a.w(u1.d(f(a7, b4, c2, d), e), new vea.n(20));
    }

    public static final efm.r h(efm.r a7, efm.r b4, efm.r c2, efm.r d, efm.r e, efm.r f) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(f, "f");
        return nim.a.w(u1.d(g(a7, b4, c2, d, e), f), new vea.n(19));
    }

    public static final efm.r i(efm.r a7, efm.r b4, efm.r c2, efm.r d, efm.r e, efm.r f, efm.r g3) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(g3, "g");
        return nim.a.w(u1.d(h(a7, b4, c2, d, e, f), g3), new vea.n(18));
    }

    public static final efm.r j(efm.r a7, efm.r b4, efm.r c2, efm.r d, efm.r e, efm.r f, efm.r g3, efm.r h2) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(g3, "g");
        Intrinsics.checkNotNullParameter(h2, "h");
        return nim.a.w(u1.d(i(a7, b4, c2, d, e, f, g3), h2), new vea.n(17));
    }

    public static final efm.r k(efm.r a7, efm.r b4, efm.r c2, efm.r d, efm.r e, efm.r f, efm.r g3, efm.r h2, efm.r i, efm.r j2) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(g3, "g");
        Intrinsics.checkNotNullParameter(h2, "h");
        Intrinsics.checkNotNullParameter(i, "i");
        Intrinsics.checkNotNullParameter(j2, "j");
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(g3, "g");
        Intrinsics.checkNotNullParameter(h2, "h");
        Intrinsics.checkNotNullParameter(i, "i");
        return nim.a.w(kli.a.h(nim.a.w(u1.d(j(a7, b4, c2, d, e, f, g3, h2), i), new vea.n(22)), j2), new vea.n(21));
    }

    public static final efm.r l(List sources) {
        Intrinsics.checkNotNullParameter(sources, "sources");
        efm.r rVarCombineLatest = efm.r.combineLatest(sources, new vdl.s(27, new vea.n(16)));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        return rVarCombineLatest;
    }

    public static final d1 m(c1 c1Var, j1 productType, it3.k kVar) {
        Intrinsics.checkNotNullParameter(c1Var, "<this>");
        Intrinsics.checkNotNullParameter(productType, "productType");
        return new d1(productType, null, kVar);
    }

    public static final String o(cl4.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar instanceof cl4.b) {
            return null;
        }
        if (dVar instanceof cl4.c) {
            return ((cl4.c) dVar).f24932a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void p() {
        List list = Collections.EMPTY_LIST;
    }

    public static final lt3.a q(y0 y0Var) {
        String str;
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        String strName = y0Var.c0().name();
        if (y0Var instanceof ft3.u0) {
            str = ((ft3.u0) y0Var).f137879a;
        } else {
            if (!(y0Var instanceof ft3.x0) && !(y0Var instanceof v0) && !(y0Var instanceof ft3.w0) && !(y0Var instanceof s0) && !(y0Var instanceof t0) && !(y0Var instanceof ft3.r0)) {
                throw new NoWhenBranchMatchedException();
            }
            str = null;
        }
        return new lt3.a(strName, str);
    }

    public static final ej0.b r(ej0.b bVar, ej0.b other) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (!Intrinsics.f(bVar.f126704b, other.f126704b)) {
            throw new IllegalStateException("Currencies should be same");
        }
        BigDecimal bigDecimalSubtract = bVar.f126703a.subtract(other.f126703a, MathContext.DECIMAL128);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return new ej0.b(bigDecimalSubtract, bVar.f126704b);
    }

    public static final ej0.b s(ej0.b bVar, double d, xi0.b rateCurrency) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(rateCurrency, "rateCurrency");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return t(bVar, bigDecimalValueOf, rateCurrency);
    }

    public static final ej0.b t(ej0.b bVar, BigDecimal rate, xi0.b rateCurrency) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(rateCurrency, "rateCurrency");
        BigDecimal bigDecimalMultiply = bVar.f126703a.multiply(rate);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return new ej0.b(bigDecimalMultiply, rateCurrency);
    }

    public static final ej0.b u(ej0.b bVar, ej0.b other) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (!Intrinsics.f(bVar.f126704b, other.f126704b)) {
            throw new IllegalStateException("Currencies should be same");
        }
        BigDecimal bigDecimalAdd = bVar.f126703a.add(other.f126703a, MathContext.DECIMAL128);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return new ej0.b(bigDecimalAdd, bVar.f126704b);
    }

    public static final lq0.p v(ax0.j viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        ConstraintLayout hostView = viewHolder.getHostView();
        List listE = viewHolder.e();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listE) {
            if (((View) obj2).getVisibility() == 0) {
                arrayList.add(obj2);
            }
        }
        viewHolder.c();
        lq0.f fVar = new lq0.f();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            fVar.a((View) it8.next());
        }
        lq0.p.Companion.getClass();
        lq0.p pVarA = lq0.o.a(hostView, fVar);
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            ((View) it9.next()).setVisibility(0);
        }
        return pVarA;
    }

    public static final int w(i80.a aVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int iCeil = (int) Math.ceil((((double) (aVar.f159408a.length * i)) / 100.0d) - 0.5d);
        if (iCeil % 2 == 0) {
            iCeil--;
        }
        if (iCeil < 0) {
            return 0;
        }
        return iCeil;
    }

    public static final ej0.b x(ej0.b bVar, double d) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return y(bVar, bigDecimalValueOf);
    }

    public static final ej0.b y(ej0.b bVar, BigDecimal constant) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(constant, "constant");
        BigDecimal bigDecimalMultiply = bVar.f126703a.multiply(constant, MathContext.DECIMAL128);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return new ej0.b(bigDecimalMultiply, bVar.f126704b);
    }

    public static final c20.a z(TranscriptDateRange transcriptDateRange) {
        Intrinsics.checkNotNullParameter(transcriptDateRange, "<this>");
        return new c20.a(transcriptDateRange.f51076a, transcriptDateRange.f51077b);
    }
}
