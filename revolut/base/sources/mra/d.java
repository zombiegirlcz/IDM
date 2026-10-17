package mra;

import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import aw0.r9;
import aw0.s9;
import cli.y;
import cli.z;
import com.fasterxml.jackson.databind.JavaType;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteBreakdownItem;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteChargeFee;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteChargeTax;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteCharges;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteLimits;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteRate;
import com.revolut.feature.retail.savings.api.domain.models.SavingsOption;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucherDetails;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucherDetailsRedemption;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductTermsAndConditions;
import com.revolut.feature.statements.api.models.TaxPeriod;
import com.revolut.feature.statements.api.navigation.DocumentsHubProduct;
import com.revolut.feature.statements.impl.documents_hub.domain.DocumentsHubMappingException;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionsEmptyDisplay;
import com.revolut.retail.wealth.resources.R$string;
import d3c.k0;
import dej.g0;
import efm.d0;
import hz1.m;
import hz1.o;
import iyd.m0;
import iyd.p0;
import iyd.u;
import j3c.c0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import kfj.e0;
import kfj.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.text.a0;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import mel.j0;
import nhm.l;
import nhm.p;
import org.jmrtd.lds.LDSFile;
import org.joda.time.DateTime;
import qfm.i2;
import vf0.n;
import vf0.v;
import wxd.q;
import wxd.s;
import wxd.t;
import wxd.x;
import yhm.m;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d {
    public static int A(l lVar) {
        p map = lVar.f215602a.d().map(new com.google.android.material.color.utilities.f(7));
        int iHashCode = 1;
        while (map.hasNext()) {
            iHashCode += Objects.hashCode(map.next());
        }
        return iHashCode;
    }

    public static CdnImage B(String str) {
        ImageTransformations transformations = new ImageTransformations(null, null, null, gz0.b.CenterInside, null, null, null, LDSFile.EF_SOD_TAG);
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        return com.revolut.core.ui_kit_core.displayers.image.models.b.c(str, transformations, null, null, 28);
    }

    public static final boolean C(List list) {
        Object next;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((aue.b) next).a() == aue.c.CARDS_HIGH_RISK_COUNTRY_LIMIT) {
                break;
            }
        }
        return (next instanceof aue.a ? (aue.a) next : null) != null;
    }

    public static final int E(egc.a aVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i3 = bkc.a.f16350a[aVar.ordinal()];
        if (i3 == 1) {
            return i;
        }
        if (i3 == 2) {
            return i2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void F(String str) {
        throw new DocumentsHubMappingException(str);
    }

    public static final Clause G(egc.a aVar, int i, int i2, int i3, List rentArgs) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(rentArgs, "rentArgs");
        int i5 = bkc.a.f16350a[aVar.ordinal()];
        if (i5 == 1) {
            return new TextLocalisedClause(i, rentArgs, null, 12);
        }
        if (i5 == 2) {
            return new TextLocalisedQuantityClause(i2, Integer.valueOf(i3), (List) null, (Style) null, 28);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ufm.i H(d0 d0Var, long j2, Function2 continuePredicate) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(continuePredicate, "continuePredicate");
        n nVar = new n(new vf0.p(4), 16);
        d0Var.getClass();
        ufm.i iVar = new ufm.i(d0Var, nVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(K(iVar, j2, new f2.a(3, continuePredicate)), new n(new vf0.p(5), 17), 2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
        return iVar2;
    }

    public static final void J(ArrayList arrayList, h0 h0Var, String str) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(h0Var.invoke(obj2))) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.size() == arrayList.size()) {
            return;
        }
        F("Duplicate ".concat(str));
        throw null;
    }

    public static final i2 K(d0 d0Var, long j2, Function2 continuePredicate) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(continuePredicate, "continuePredicate");
        i2 i2VarP = d0Var.p(new n(new v(0, j2, continuePredicate), 18));
        Intrinsics.checkNotNullExpressionValue(i2VarP, "retryWhen(...)");
        return i2VarP;
    }

    public static final TextLocalisedClause M(j0 j0Var, Custom custom) {
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        int i = swk.b.f266233a[j0Var.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.instrument_insights_suggestion_strong_buy, null, custom, 10);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.instrument_insights_suggestion_buy, null, custom, 10);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.instrument_insights_suggestion_hold, null, custom, 10);
        }
        if (i == 4) {
            return new TextLocalisedClause(R$string.instrument_insights_suggestion_sell, null, custom, 10);
        }
        if (i == 5) {
            return new TextLocalisedClause(R$string.instrument_insights_suggestion_strong_sell, null, custom, 10);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ej0.b P(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        BigDecimal bigDecimalY = pyd.c.Y(dVar);
        BigDecimal bigDecimal = bigDecimalY.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalY.stripTrailingZeros();
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "stripTrailingZeros(...)");
        return new ej0.b(bigDecimal, dVar.f115083b);
    }

    public static final ApmQuote R(o oVar) {
        ApmQuoteRate apmQuoteRate;
        ApmQuoteCharges apmQuoteCharges;
        ApmQuoteLimits apmQuoteLimits;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        hz1.n nVarD = oVar.getRate();
        if (nVarD != null) {
            Intrinsics.checkNotNullParameter(nVarD, "<this>");
            double dB = nVarD.getRate();
            xi0.a aVar = xi0.b.Companion;
            String strA = nVarD.getFrom();
            aVar.getClass();
            apmQuoteRate = new ApmQuoteRate(dB, nVarD.getTimestamp(), xi0.a.a(strA), xi0.a.a(nVarD.getTo()));
        } else {
            apmQuoteRate = null;
        }
        dj0.d dVarO = mo3.a.o(oVar.getBillAmount());
        dj0.d dVarO2 = mo3.a.o(oVar.getRecipientAmount());
        hz1.l lVarB = oVar.getCharges();
        if (lVarB != null) {
            Intrinsics.checkNotNullParameter(lVarB, "<this>");
            dj0.d dVarO3 = mo3.a.o(lVarB.getTotal());
            hz1.k kVarB = lVarB.getTax();
            Intrinsics.checkNotNullParameter(kVarB, "<this>");
            dj0.d dVarO4 = mo3.a.o(kVarB.getTotal());
            List listA = kVarB.getBreakdown();
            ArrayList arrayList = new ArrayList(w.t(listA, 10));
            Iterator it8 = listA.iterator();
            while (it8.hasNext()) {
                arrayList.add(S((hz1.i) it8.next()));
            }
            ApmQuoteChargeTax apmQuoteChargeTax = new ApmQuoteChargeTax(dVarO4, arrayList);
            hz1.j jVarA = lVarB.getFee();
            Intrinsics.checkNotNullParameter(jVarA, "<this>");
            dj0.d dVarO5 = mo3.a.o(jVarA.getTotal());
            boolean zB = jVarA.getIntermediaryFees();
            List listA2 = jVarA.getBreakdown();
            ArrayList arrayList2 = new ArrayList(w.t(listA2, 10));
            Iterator it9 = listA2.iterator();
            while (it9.hasNext()) {
                arrayList2.add(S((hz1.i) it9.next()));
            }
            apmQuoteCharges = new ApmQuoteCharges(dVarO3, new ApmQuoteChargeFee(dVarO5, zB, arrayList2), apmQuoteChargeTax);
        } else {
            apmQuoteCharges = null;
        }
        m mVarC = oVar.getLimits();
        if (mVarC != null) {
            Intrinsics.checkNotNullParameter(mVarC, "<this>");
            String strB = mVarC.getPeriod();
            t02.h hVar = Intrinsics.f(strB, "DAILY") ? t02.h.DAILY : Intrinsics.f(strB, "MONTHLY") ? t02.h.MONTHLY : t02.h.UNKNOWN;
            jo3.a aVarA = mVarC.getLower();
            dj0.d dVarO6 = aVarA != null ? mo3.a.o(aVarA) : null;
            jo3.a aVarE = mVarC.getUsed();
            dj0.d dVarO7 = aVarE != null ? mo3.a.o(aVarE) : null;
            jo3.a aVarD = mVarC.getUpper();
            apmQuoteLimits = new ApmQuoteLimits(dVarO6, aVarD != null ? mo3.a.o(aVarD) : null, dVarO7, hVar, mVarC.getResetDateTime());
        } else {
            apmQuoteLimits = null;
        }
        Boolean boolF = oVar.getIsDecimalsAllowed();
        return new ApmQuote(apmQuoteRate, dVarO2, dVarO, apmQuoteCharges, apmQuoteLimits, boolF != null ? boolF.booleanValue() : true);
    }

    public static final ApmQuoteBreakdownItem S(hz1.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String strD = iVar.getShortDescription();
        String strE = iVar.getTitle();
        String strC = iVar.getDescription();
        dj0.d dVarO = mo3.a.o(iVar.getAmount());
        jo3.a aVarB = iVar.getAmountInBaseCurrency();
        return new ApmQuoteBreakdownItem(strE, strC, strD, dVarO, aVarB != null ? mo3.a.o(aVarB) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.push_to_card.api.data.CardOwner U(lqa.f r18) {
        /*
            java.lang.String r0 = "<this>"
            r1 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r2 = r1.getId()
            java.lang.String r3 = r1.getFirstName()
            java.lang.String r4 = r1.getLastName()
            java.lang.String r5 = r1.getLabel()
            java.lang.String r6 = r1.getEmail()
            lqa.g r0 = r1.getType()
            int[] r7 = mra.c.f208091a
            int r0 = r0.ordinal()
            r0 = r7[r0]
            r7 = 1
            if (r0 == r7) goto L3d
            r7 = 2
            if (r0 == r7) goto L3a
            r7 = 3
            if (r0 != r7) goto L34
            wpa.a r0 = wpa.a.OTHER
        L32:
            r7 = r0
            goto L40
        L34:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L3a:
            wpa.a r0 = wpa.a.LINKED
            goto L32
        L3d:
            wpa.a r0 = wpa.a.SELF
            goto L32
        L40:
            lqa.e r0 = r1.getCard()
            com.revolut.feature.push_to_card.api.data.Card r8 = new com.revolut.feature.push_to_card.api.data.Card
            java.lang.String r9 = r0.getLastFour()
            java.lang.String r10 = r0.getBillingCurrency()
            java.lang.String r11 = r0.getScheme()
            java.lang.String r12 = r0.getIssuerName()
            java.lang.String r13 = r0.getIssuerCountry()
            no3.b r14 = r0.getAddress()
            r17 = 0
            if (r14 == 0) goto L67
            com.revolut.feature.address.models.Address r14 = oo3.a.a(r14)
            goto L69
        L67:
            r14 = r17
        L69:
            java.lang.String r15 = r0.getCity()
            java.lang.String r16 = r0.getLogoUrl()
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            java.util.List r0 = r1.getSettings()
            if (r0 == 0) goto La5
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L80:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L9b
            java.lang.Object r1 = r0.next()
            r9 = r1
            lqa.b0 r9 = (lqa.b0) r9
            java.lang.String r9 = r9.getId()
            java.lang.String r10 = "alwaysRequire2FA"
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r9, r10)
            if (r9 == 0) goto L80
            r17 = r1
        L9b:
            lqa.b0 r17 = (lqa.b0) r17
            if (r17 == 0) goto La5
            boolean r0 = r17.getEnabled()
        La3:
            r9 = r0
            goto La7
        La5:
            r0 = 0
            goto La3
        La7:
            com.revolut.feature.push_to_card.api.data.CardOwner r1 = new com.revolut.feature.push_to_card.api.data.CardOwner
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mra.d.U(lqa.f):com.revolut.feature.push_to_card.api.data.CardOwner");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.rev_points.giftcards.api.model.UserVoucherDetails V(zvb.d r26) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mra.d.V(zvb.d):com.revolut.feature.rev_points.giftcards.api.model.UserVoucherDetails");
    }

    public static final EsimSubscriptionsEmptyDisplay X(mfj.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String strB = jVar.getTitle();
        e0 e0VarA = jVar.getDescription();
        String strC = e0VarA.getText();
        List listA = e0VarA.getDescriptors();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = listA.iterator();
        while (true) {
            List list = null;
            if (!it8.hasNext()) {
                List<String> listB = e0VarA.getParameters();
                if (listB != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (String str : listB) {
                        g0[] g0VarArrValues = g0.values();
                        if (g0VarArrValues.length > 0) {
                            g0 g0Var = g0VarArrValues[0];
                            throw null;
                        }
                    }
                    list = arrayList2;
                }
                if (list == null) {
                    list = f0.f322471a;
                }
                return new EsimSubscriptionsEmptyDisplay(strB, new EsimHyperText(strC, arrayList, list));
            }
            r rVar = (r) it8.next();
            String strB2 = rVar.getText();
            if (rVar.getAction() != null) {
                dej.f0[] f0VarArrValues = dej.f0.values();
                if (f0VarArrValues.length > 0) {
                    dej.f0 f0Var = f0VarArrValues[0];
                    throw null;
                }
            }
            String strC2 = rVar.getUrl();
            EsimHyperText.Descriptor descriptor = strC2 != null ? new EsimHyperText.Descriptor(strB2, new EsimDescriptorValue.Link(strC2)) : null;
            if (descriptor != null) {
                arrayList.add(descriptor);
            }
        }
    }

    public static final d3c.j0 Y(c0 c0Var) {
        k0 k0Var;
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        String strB = c0Var.getType();
        k0[] k0VarArrValues = k0.values();
        int length = k0VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                k0Var = null;
                break;
            }
            k0Var = k0VarArrValues[i];
            if (a0.z(k0Var.name(), strB, true)) {
                break;
            }
            i++;
        }
        if (k0Var == null) {
            k0Var = k0.UNKNOWN;
        }
        return new d3c.j0(k0Var, c0Var.getShippingFrom());
    }

    public static final ArrayList Z(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<qre.h> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (qre.h hVar : list2) {
            Intrinsics.checkNotNullParameter(hVar, "<this>");
            arrayList.add(new lre.d(hVar.f248723a, hVar.f248724b, hVar.d, new DateTime(hVar.e), hVar.f));
        }
        return arrayList;
    }

    public static final y a(z zVar, cli.j initialState, cli.n stateMapper, cli.i iVar, boolean z) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        return new y(initialState, stateMapper, z, iVar);
    }

    public static final wxd.e a0(iyd.c cVar) {
        Object objA;
        String str = cVar.f169653a;
        int iHashCode = str.hashCode();
        if (iHashCode != -407029972) {
            if (iHashCode != 629233382) {
                if (iHashCode == 1810371957 && str.equals("generate")) {
                    String value = cVar.d;
                    if (value == null) {
                        F("Missing generate payload");
                        throw null;
                    }
                    try {
                        m.Companion aVar = yhm.m.INSTANCE;
                        objA = rlm.j.k(Json.d.d(value));
                    } catch (Throwable th10) {
                        m.Companion aVar2 = yhm.m.INSTANCE;
                        objA = yhm.o.a(th10);
                    }
                    if (yhm.m.a(objA) != null) {
                        F("Invalid entity generate payload");
                        throw null;
                    }
                    Object obj2 = ((JsonObject) objA).get("productId");
                    kotlinx.serialization.json.b bVar = obj2 instanceof kotlinx.serialization.json.b ? (kotlinx.serialization.json.b) obj2 : null;
                    if (bVar == null || !bVar.b() || kotlin.text.d0.W(bVar.a())) {
                        F("Invalid entity generate product ID");
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(value, "value");
                    return new wxd.d(value);
                }
            } else if (str.equals("deeplink")) {
                return new wxd.b(q0(cVar.f169654b, "deeplink URI"));
            }
        } else if (str.equals("document_download")) {
            String value2 = q0(cVar.f169655c, "request ID");
            Intrinsics.checkNotNullParameter(value2, "value");
            return new wxd.c(value2);
        }
        F("Unknown entity action type: " + cVar.f169653a);
        throw null;
    }

    public static /* synthetic */ y b(z zVar, cli.j jVar, cli.n nVar, cli.i iVar, boolean z, int i) {
        if ((i & 4) != 0) {
            iVar = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return a(zVar, jVar, nVar, iVar, z);
    }

    public static final s b0(iyd.j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        String str = j0Var.f169672a;
        String strP0 = str != null ? p0(str, "products title") : null;
        List<iyd.g0> list = j0Var.f169673b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (iyd.g0 g0Var : list) {
            String value = q0(g0Var.f169664a, "product ID");
            DocumentsHubProduct.Companion aVar = DocumentsHubProduct.INSTANCE;
            Intrinsics.checkNotNullParameter(value, "value");
            String strQ0 = q0(g0Var.f169665b, "product title");
            String value2 = q0(g0Var.f169666c, "product icon");
            Intrinsics.checkNotNullParameter(value2, "value");
            arrayList.add(new wxd.r(value, strQ0, value2));
        }
        J(arrayList, new h0() { // from class: kyd.c
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return new DocumentsHubProduct(((wxd.r) obj2).f300880a);
            }
        }, "product IDs");
        return new s(strP0, arrayList);
    }

    public static y c(yji.n nVar, cli.j initialState, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        return new y(initialState, stateMapper, false, null);
    }

    public static final cli.h d(z PersistentModelState, String str, States$PersistentDomain initialState, cli.n stateMapper, boolean z, Function2 restoredStateReducer) {
        Intrinsics.checkNotNullParameter(PersistentModelState, "$this$PersistentModelState");
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-kompot-navigable-vc-ui-PersistentModelStateKey$-key$0");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(restoredStateReducer, "restoredStateReducer");
        return new cli.h(str, restoredStateReducer, initialState, stateMapper, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final t d0(m0 m0Var) {
        wxd.h hVar;
        x vVar;
        Object next;
        Object next2;
        Iterator it8;
        wxd.h hVar2;
        String str;
        Iterator it9;
        ArrayList arrayList;
        String str2;
        Intrinsics.checkNotNullParameter(m0Var, "<this>");
        String str3 = m0Var.f169678a;
        String str4 = m0Var.f169679b;
        String strP0 = str4 != null ? p0(str4, "screen subtitle") : null;
        List list = m0Var.f169680c;
        int i = 10;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        Iterator it10 = list.iterator();
        while (it10.hasNext()) {
            p0 p0Var = (p0) it10.next();
            List list2 = p0Var.f169687c;
            iyd.f fVar = p0Var.d;
            if (list2 == null || fVar != null) {
                hVar = null;
                if (list2 != null || fVar == null) {
                    F("Entity tab must contain exactly one content type");
                    throw null;
                }
                Set<String> set = fVar.f169662b;
                iyd.i iVar = fVar.f169661a;
                ArrayList arrayList3 = new ArrayList();
                for (String str5 : set) {
                    Iterator<E> it11 = wxd.z.a().iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it11.next();
                        if (Intrinsics.f(((wxd.z) next2).b(), str5)) {
                            break;
                        }
                    }
                    wxd.z zVar = (wxd.z) next2;
                    if (zVar != null) {
                        arrayList3.add(zVar);
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                zhm.d0.Z0(arrayList3, linkedHashSet);
                Iterator<E> it12 = wxd.y.a().iterator();
                while (true) {
                    if (!it12.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it12.next();
                    if (Intrinsics.f(((wxd.y) next).name(), iVar.f169668a)) {
                        break;
                    }
                }
                wxd.y yVar = (wxd.y) next;
                if (yVar == null) {
                    F("Unknown entity end date configuration");
                    throw null;
                }
                iyd.d0 d0Var = iVar.f169669b;
                vVar = new wxd.v(new wxd.f(new wxd.g(yVar, new TaxPeriod(d0Var.f169657a, d0Var.f169658b)), linkedHashSet));
            } else {
                List<iyd.a0> list3 = list2;
                ArrayList arrayList4 = new ArrayList(w.t(list3, i));
                for (iyd.a0 a0Var : list3) {
                    String strQ0 = q0(a0Var.f169649a, "section ID");
                    String str6 = a0Var.f169650b;
                    String strP02 = str6 != null ? p0(str6, "section title") : null;
                    List<iyd.x> list4 = a0Var.f169651c;
                    ArrayList arrayList5 = new ArrayList(w.t(list4, i));
                    for (iyd.x xVar : list4) {
                        String strQ02 = q0(xVar.f169695a, "item ID");
                        String strQ03 = q0(xVar.f169696b, "item title");
                        String str7 = xVar.f169697c;
                        String strP03 = str7 != null ? p0(str7, "item subtitle") : null;
                        String str8 = xVar.d;
                        if (str8 != null) {
                            String value = p0(str8, "item icon");
                            Intrinsics.checkNotNullParameter(value, "value");
                            str2 = value;
                        } else {
                            str2 = null;
                        }
                        arrayList5.add(new wxd.l(strQ02, strQ03, strP03, str2, a0(xVar.e)));
                    }
                    J(arrayList5, new h0() { // from class: kyd.d
                        @Override // kotlin.jvm.internal.h0, wim.p
                        public final Object get(Object obj2) {
                            return ((wxd.l) obj2).f300870a;
                        }
                    }, "item IDs");
                    iyd.l lVar = a0Var.d;
                    arrayList4.add(new q(strQ0, strP02, arrayList5, lVar != null ? new wxd.i(q0(lVar.f169675a, "footer action title"), a0(lVar.f169676b)) : null));
                    i = 10;
                }
                hVar = null;
                if (arrayList4.isEmpty()) {
                    arrayList4 = null;
                }
                if (arrayList4 == null) {
                    F("Empty tab sections");
                    throw null;
                }
                J(arrayList4, new h0() { // from class: kyd.e
                    @Override // kotlin.jvm.internal.h0, wim.p
                    public final Object get(Object obj2) {
                        return ((q) obj2).f300877a;
                    }
                }, "section IDs");
                vVar = new wxd.w(arrayList4);
            }
            String strQ04 = q0(p0Var.f169685a, "tab ID");
            String strQ05 = q0(p0Var.f169686b, "tab title");
            iyd.o oVar = p0Var.e;
            if (oVar != null) {
                List list5 = oVar.f169683a;
                ArrayList arrayList6 = new ArrayList(w.t(list5, 10));
                Iterator it13 = list5.iterator();
                while (it13.hasNext()) {
                    u uVar = (u) it13.next();
                    String strQ06 = q0(uVar.f169691a, "footer paragraph");
                    String str9 = uVar.f169692b;
                    if (str9 != null) {
                        String value2 = p0(str9, "footer icon");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        str = value2;
                    } else {
                        str = hVar;
                    }
                    List list6 = uVar.f169693c;
                    if (list6 != null) {
                        List list7 = list6;
                        it9 = it10;
                        arrayList = new ArrayList(w.t(list7, 10));
                        Iterator it14 = list7.iterator();
                        while (it14.hasNext()) {
                            iyd.r rVar = (iyd.r) it14.next();
                            arrayList.add(new wxd.j(q0(rVar.f169688a, "footer highlight"), q0(rVar.f169689b, "footer highlight deeplink")));
                            it14 = it14;
                            it13 = it13;
                        }
                    } else {
                        it9 = it10;
                        arrayList = hVar;
                    }
                    Iterator it15 = it13;
                    arrayList6.add(new wxd.k(strQ06, str, arrayList));
                    it10 = it9;
                    it13 = it15;
                }
                it8 = it10;
                hVar2 = new wxd.h(arrayList6);
            } else {
                it8 = it10;
                hVar2 = hVar;
            }
            arrayList2.add(new wxd.u(strQ04, strQ05, vVar, hVar2));
            it10 = it8;
            i = 10;
        }
        J(arrayList2, new h0() { // from class: kyd.b
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((wxd.u) obj2).f300888a;
            }
        }, "tab IDs");
        return new t(str3, strP0, arrayList2);
    }

    public static /* synthetic */ cli.h e(z zVar, String str, States$PersistentDomain states$PersistentDomain, cli.n nVar, Function2 function2, int i) {
        boolean z = (i & 8) == 0;
        if ((i & 16) != 0) {
            function2 = new ccg.a(29);
        }
        return d(zVar, str, states$PersistentDomain, nVar, z, function2);
    }

    public static final ewb.a e0(UserVoucherDetails userVoucherDetails) {
        String str;
        String str2;
        ewb.b bVar;
        Intrinsics.checkNotNullParameter(userVoucherDetails, "<this>");
        String str3 = userVoucherDetails.f83624a;
        String strName = userVoucherDetails.f83625b.name();
        long j2 = userVoucherDetails.f83626c;
        Long l2 = userVoucherDetails.d;
        String str4 = userVoucherDetails.e;
        String str5 = userVoucherDetails.f;
        VoucherProductTermsAndConditions voucherProductTermsAndConditions = userVoucherDetails.f83627g;
        Intrinsics.checkNotNullParameter(voucherProductTermsAndConditions, "<this>");
        ewb.h hVar = new ewb.h(voucherProductTermsAndConditions.f83653a, voucherProductTermsAndConditions.f83654b);
        String str6 = userVoucherDetails.f83628h;
        String str7 = userVoucherDetails.i;
        jo3.b bVarA = hx7.a.A(userVoucherDetails.f83629j);
        dj0.d dVar = userVoucherDetails.k;
        jo3.b bVarA2 = dVar != null ? hx7.a.A(dVar) : null;
        String strName2 = userVoucherDetails.f83630l.name();
        UserVoucherDetailsRedemption userVoucherDetailsRedemption = userVoucherDetails.f83631m;
        if (userVoucherDetailsRedemption != null) {
            Intrinsics.checkNotNullParameter(userVoucherDetailsRedemption, "<this>");
            str = str3;
            str2 = strName;
            bVar = new ewb.b(userVoucherDetailsRedemption.f83636a, userVoucherDetailsRedemption.f83637b, userVoucherDetailsRedemption.f83638c);
        } else {
            str = str3;
            str2 = strName;
            bVar = null;
        }
        String str8 = userVoucherDetails.f83632n;
        String str9 = userVoucherDetails.o;
        tvb.g gVar = userVoucherDetails.f83633p;
        String strName3 = gVar != null ? gVar.name() : null;
        ewb.b bVar2 = bVar;
        tvb.f fVar = userVoucherDetails.f83634q;
        return new ewb.a(str, str2, j2, l2, str4, str5, hVar, str6, str7, bVarA, bVarA2, strName2, bVar2, str8, str9, strName3, fVar != null ? fVar.name() : null, userVoucherDetails.f83635r);
    }

    public static final List f() {
        String[] elements = {"upload", "bulkUpload"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public static final iyd.c g0(wxd.e eVar) {
        if (eVar instanceof wxd.b) {
            return new iyd.c("deeplink", ((wxd.b) eVar).f300855a, (String) null, (String) null, 12);
        }
        if (eVar instanceof wxd.c) {
            return new iyd.c("document_download", (String) null, ((wxd.c) eVar).f300856a, (String) null, 10);
        }
        if (eVar instanceof wxd.d) {
            return new iyd.c("generate", (String) null, (String) null, ((wxd.d) eVar).f300857a, 6);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final po9.t h(Data data, String widgetId) {
        Intrinsics.checkNotNullParameter(data, "<this>");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return new po9.t(widgetId, new po9.g(data));
    }

    public static final iyd.o h0(wxd.h hVar) {
        ArrayList<wxd.k> arrayList = hVar.f300862a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (wxd.k kVar : arrayList) {
            String str = kVar.f300867a;
            String str2 = kVar.f300868b;
            ArrayList arrayList3 = null;
            if (str2 == null) {
                str2 = null;
            }
            List list = kVar.f300869c;
            if (list != null) {
                List<wxd.j> list2 = list;
                arrayList3 = new ArrayList(w.t(list2, 10));
                for (wxd.j jVar : list2) {
                    arrayList3.add(new iyd.r(jVar.f300865a, jVar.f300866b));
                }
            }
            arrayList2.add(new u(str, str2, arrayList3));
        }
        return new iyd.o(arrayList2);
    }

    public static final krf.c i(rtf.c cVar) {
        rtf.a aVar = cVar instanceof rtf.a ? (rtf.a) cVar : null;
        if (aVar != null) {
            return aVar.f257226a;
        }
        return null;
    }

    public static final float i0(j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        int i = swk.b.f266233a[j0Var.ordinal()];
        if (i == 1) {
            return 1.0f;
        }
        if (i == 2) {
            return 0.75f;
        }
        if (i == 3) {
            return 0.5f;
        }
        if (i == 4) {
            return 0.25f;
        }
        if (i == 5) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TransferReasonsValues k(rtf.c cVar) {
        rtf.b bVar = cVar instanceof rtf.b ? (rtf.b) cVar : null;
        if (bVar != null) {
            return bVar.f257227a;
        }
        return null;
    }

    public static final void l(AutoCloseable autoCloseable, Throwable th10) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th10 != null) {
                try {
                    ehe.n.y(autoCloseable);
                    return;
                } catch (Throwable th11) {
                    yhm.f.a(th10, th11);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                } else {
                    if (!(autoCloseable instanceof MediaMetadataRetriever)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static final SavingsOption l0(ncd.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        int i = ejb.l.f126854a[gVar.ordinal()];
        if (i == 1) {
            return SavingsOption.BANK_SAVINGS;
        }
        if (i == 2) {
            throw new IllegalStateException("Legacy option selection screen doesn't support Fixed Term");
        }
        if (i == 3) {
            return SavingsOption.FUND_SAVINGS;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static boolean m(l lVar, Object obj2) {
        if (lVar == obj2) {
            return true;
        }
        boolean z = false;
        if (obj2 instanceof nhm.s) {
            nhm.s sVar = (nhm.s) obj2;
            if (lVar.f215602a.size() == ((l) sVar).f215602a.size()) {
                try {
                    Predicate predicateNegate = new akl.p(sVar, 17).negate();
                    Objects.requireNonNull(predicateNegate, "predicate is null");
                    p it8 = lVar.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        if (predicateNegate.test(it8.next())) {
                            z = true;
                            break;
                        }
                    }
                    return !z;
                } catch (ClassCastException unused) {
                }
            }
        }
        return false;
    }

    public static s9 m0(j0 j0Var, r9 segmentsCount, int i) {
        if ((i & 2) != 0) {
            segmentsCount = r9.THREE;
        }
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(segmentsCount, "segmentsCount");
        return new s9(i0(j0Var), Float.valueOf(0.5f), segmentsCount, 8);
    }

    public static final aue.l n(dj0.d amount, List list) {
        Object obj2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(amount, "amount");
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            dj0.d dVarU = u((aue.l) obj3);
            if (Intrinsics.f(dVarU.f115083b, amount.f115083b) && amount.compareTo(dVarU) > 0) {
                arrayList.add(obj3);
            }
        }
        Iterator it8 = arrayList.iterator();
        if (it8.hasNext()) {
            Object next = it8.next();
            if (it8.hasNext()) {
                long j2 = u((aue.l) next).f115082a;
                do {
                    Object next2 = it8.next();
                    long j3 = u((aue.l) next2).f115082a;
                    if (j2 > j3) {
                        next = next2;
                        j2 = j3;
                    }
                } while (it8.hasNext());
            }
            obj2 = next;
        } else {
            obj2 = null;
        }
        return (aue.l) obj2;
    }

    public static final String n0(f8l.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int i = d8l.c.f112297a[cVar.ordinal()];
        if (i == 1) {
            return "FIAT";
        }
        if (i == 2) {
            return "CRYPTO";
        }
        if (i == 3) {
            return "COMMODITY";
        }
        if (i == 4) {
            return "SECURITY";
        }
        if (i == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final aue.k o(java.util.List r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r1 = r7
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r2 = r1.iterator()
        Lf:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.next()
            r5 = r3
            aue.l r5 = (aue.l) r5
            aue.c r5 = r5.a()
            aue.c r6 = aue.c.DAILY_LIMIT
            if (r5 != r6) goto Lf
            goto L27
        L26:
            r3 = r4
        L27:
            boolean r2 = r3 instanceof aue.k
            if (r2 == 0) goto L2e
            aue.k r3 = (aue.k) r3
            goto L2f
        L2e:
            r3 = r4
        L2f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.util.Iterator r7 = r1.iterator()
        L36:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r7.next()
            r1 = r0
            aue.l r1 = (aue.l) r1
            aue.c r1 = r1.a()
            aue.c r2 = aue.c.ACCOUNT_LIMIT
            if (r1 != r2) goto L36
            goto L4d
        L4c:
            r0 = r4
        L4d:
            boolean r7 = r0 instanceof aue.k
            if (r7 == 0) goto L54
            aue.k r0 = (aue.k) r0
            goto L55
        L54:
            r0 = r4
        L55:
            if (r3 == 0) goto L64
            if (r0 == 0) goto L64
            dj0.d r7 = r3.d
            dj0.d r1 = r0.d
            int r7 = r7.compareTo(r1)
            if (r7 >= 0) goto L69
            goto L6a
        L64:
            if (r3 != 0) goto L6a
            if (r0 != 0) goto L69
            return r4
        L69:
            return r0
        L6a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mra.d.o(java.util.List):aue.k");
    }

    public static final dj0.d o0(amd.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        List list = jVar.f6333b;
        dj0.d.Companion.getClass();
        dj0.d dVarO = dj0.d.e;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            dVarO = i == 0 ? ((amd.d) obj2).d : pyd.c.O(dVarO, ((amd.d) obj2).d);
            i = i2;
        }
        return dVarO;
    }

    public static final mha.s p(List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            mha.m mVar = ((mha.s) next).f205465c;
            mha.m.Companion.getClass();
            if (Intrinsics.f(mVar, mha.m.e)) {
                break;
            }
        }
        return (mha.s) next;
    }

    public static final String p0(String str, String str2) {
        if (kotlin.text.d0.W(str)) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        F("Invalid ".concat(str2));
        throw null;
    }

    public static final Map q() {
        return r0.k(new Pair("LINK", lr6.k.LINK), new Pair("QR", lr6.k.QR), new Pair("INVOICE", lr6.k.INVOICE), new Pair("CARD_READER", lr6.k.CARD_READER), new Pair("POS", lr6.k.POS), new Pair("APPLE_TAP_TO_PAY", lr6.k.APPLE_TAP_TO_PAY), new Pair("SHOPIFY_CHECKOUT", lr6.k.SHOPIFY_CHECKOUT), new Pair("SHOPIFY_RPAY", lr6.k.SHOPIFY_RPAY), new Pair("PRESTASHOP", lr6.k.PRESTASHOP), new Pair("WOOCOMMERCE", lr6.k.WOOCOMMERCE));
    }

    public static final String q0(String str, String str2) {
        if (str != null) {
            if (kotlin.text.d0.W(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        F("Invalid ".concat(str2));
        throw null;
    }

    public static final Map r() {
        return r0.k(new Pair("PENDING", lr6.r.PENDING), new Pair("PROCESSING", lr6.r.PROCESSING), new Pair("AUTHORISED", lr6.r.AUTHORISED), new Pair("CANCELLED", lr6.r.CANCELLED), new Pair("COMPLETED", lr6.r.COMPLETED), new Pair("FAILED", lr6.r.FAILED));
    }

    public static final Map s() {
        return r0.k(new Pair("PAYMENT", lr6.s.PAYMENT), new Pair("PAYMENT_REQUEST", lr6.s.PAYMENT_REQUEST), new Pair("REFUND", lr6.s.REFUND), new Pair("CHARGEBACK", lr6.s.CHARGEBACK), new Pair("CHARGEBACK_REVERSAL", lr6.s.CHARGEBACK_REVERSAL), new Pair("CREDIT_REIMBURSEMENT", lr6.s.REFUND_REVERSAL));
    }

    public static final dj0.d u(aue.l lVar) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (lVar instanceof aue.k) {
            aue.k kVar = (aue.k) lVar;
            aue.j jVar = kVar.e;
            return (jVar == null || (dVar = jVar.f9814c) == null) ? kVar.d : dVar;
        }
        if (!(lVar instanceof aue.i)) {
            throw new NoWhenBranchMatchedException();
        }
        aue.i iVar = (aue.i) lVar;
        dj0.d dVar2 = iVar.f9811c;
        return dVar2 == null ? iVar.f9810b : dVar2;
    }

    public static final boolean v(amd.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return !dVar.f6313b.isEmpty();
    }

    public static final boolean w(amd.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        List list = jVar.f6333b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (v((amd.d) it8.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean x(amd.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (w(jVar)) {
            return true;
        }
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        List<amd.d> list = jVar.f6333b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (amd.d dVar : list) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            if (!dVar.f6314c.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean y(amd.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        List list = jVar.f6333b;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            zhm.a0.x(((amd.d) it8.next()).f6313b, arrayList);
        }
        return arrayList.isEmpty();
    }

    public boolean D() {
        return t() != null;
    }

    public abstract String N();

    public abstract JavaType t();
}
