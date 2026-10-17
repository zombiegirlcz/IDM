package pyd;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextSwitcher;
import android.widget.TextView;
import aqd.i;
import aqd.p;
import aqd.r;
import aqd.s;
import cgi.e;
import cgi.k;
import ch.qos.logback.core.CoreConstants;
import com.hcaptcha.sdk.HCaptchaStateListener;
import com.revolut.core.ui_kit_core.R$id;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.wallet.account.PixDto;
import com.revolut.data.network.models.wallet.account.TedDto;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import com.revolut.feature.transport.models.TransportTicketLogo;
import com.revolut.feature.transport.models.TransportTicketProvider;
import com.revolut.feature_travel_hotels_models.property.OverallPrice;
import com.revolut.feature_travel_hotels_models.property.room.BedOptionSelection;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestination;
import io.fotoapparat.exception.camera.InvalidConfigurationException;
import io.fotoapparat.exception.camera.UnsupportedConfigurationException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k91.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import org.joda.time.DateTime;
import pfm.h;
import qfm.j0;
import s4d.m;
import tof.a3;
import tof.h0;
import tof.l0;
import tof.p0;
import tof.y6;
import u3a.q;
import u91.l;
import u91.n;
import u91.o;
import vkm.q0;
import vkm.v1;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zhm.w;
import zm3.j;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c {
    public static final dj0.d A(List list) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<BedOptionSelection> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (BedOptionSelection bedOptionSelection : list2) {
            OverallPrice overallPrice = bedOptionSelection.f98090a.f98106c.f98114c.d;
            if (overallPrice == null || (dVar = overallPrice.f98058b) == null) {
                dVar = new dj0.d(0L, bedOptionSelection.f98090a.f98106c.f98114c.f98068c.f98058b.f115083b);
            }
            arrayList.add(dVar);
        }
        dj0.d.Companion.getClass();
        dj0.d dVarO = dj0.d.e;
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            dVarO = i == 0 ? (dj0.d) obj2 : O(dVarO, (dj0.d) obj2);
            i = i2;
        }
        return dVarO;
    }

    public static final dj0.d B(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((BedOptionSelection) it8.next()).f98090a.f98106c.f98114c.f98068c.f98058b);
        }
        dj0.d.Companion.getClass();
        dj0.d dVarO = dj0.d.e;
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            dVarO = i == 0 ? (dj0.d) obj2 : O(dVarO, (dj0.d) obj2);
            i = i2;
        }
        return dVarO;
    }

    public static final boolean C(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        int i = k71.b.f181774a[a3Var.e.ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    public static final boolean D(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        if (sVar instanceof p) {
            return false;
        }
        if (!(sVar instanceof r)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = i.f8347a[((r) sVar).f.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean E(Data data) {
        Intrinsics.checkNotNullParameter(data, "<this>");
        return data.getContent() == null;
    }

    public static final boolean F(f5j.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String str = aVar.f132333h;
        return str == null || str.length() == 0;
    }

    public static final boolean G(Data data) {
        Intrinsics.checkNotNullParameter(data, "<this>");
        return data.getContent() != null;
    }

    public static final dj0.d H(dj0.d dVar, dj0.d dVar2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar2 != null) {
            xi0.b bVar = dVar2.f115083b;
            long j2 = dVar2.f115082a;
            long j3 = dVar.f115082a;
            xi0.b bVar2 = dVar.f115083b;
            if (j3 == 0) {
                return new dj0.d(-j2, bVar);
            }
            if (j2 != 0) {
                if (Intrinsics.f(bVar2, bVar)) {
                    return new dj0.d(dVar.f115082a - j2, bVar2);
                }
                throw new IllegalStateException("Addition of different currencies is not supported");
            }
        }
        return dVar;
    }

    public static final long I(dj0.d dVar, BigDecimal rate, xi0.b rateCurrency) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(rateCurrency, "rateCurrency");
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(rateCurrency, "rateCurrency");
        BigDecimal bigDecimal = new BigDecimal(cp5.d.k(dVar.f115083b));
        BigDecimal bigDecimalMultiply = new BigDecimal(dVar.f115082a).divide(bigDecimal).multiply(rate).multiply(new BigDecimal(cp5.d.k(rateCurrency)));
        Intrinsics.h(bigDecimalMultiply);
        return bigDecimalMultiply.longValue();
    }

    public static long J(dj0.d dVar, double d, xi0.b rateCurrency) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(rateCurrency, "rateCurrency");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return I(dVar, bigDecimalValueOf, rateCurrency);
    }

    public static final dj0.d K(dj0.d dVar, double d, xi0.b rateCurrency) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(rateCurrency, "rateCurrency");
        return new dj0.d(J(dVar, d, rateCurrency), rateCurrency);
    }

    public static dj0.d L(dj0.d dVar, BigDecimal rate, xi0.b rateCurrency) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(rateCurrency, "rateCurrency");
        return new dj0.d(I(dVar, rate, rateCurrency), rateCurrency);
    }

    public static final dj0.d M(dj0.d dVar) {
        if (dVar != null) {
            return dVar;
        }
        dj0.d.Companion.getClass();
        return dj0.d.e;
    }

    public static final dj0.d N(dj0.d dVar, float f) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return f == 1.0f ? dVar : V(dVar, new BigDecimal(String.valueOf(f)));
    }

    public static final dj0.d O(dj0.d dVar, dj0.d dVar2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar2 != null) {
            long j2 = dVar2.f115082a;
            long j3 = dVar.f115082a;
            xi0.b bVar = dVar.f115083b;
            if (j3 == 0) {
                return dVar2;
            }
            if (j2 != 0) {
                if (Intrinsics.f(bVar, dVar2.f115083b)) {
                    return new dj0.d(dVar.f115082a + j2, bVar);
                }
                throw new IllegalStateException("Addition of different currencies is not supported");
            }
        }
        return dVar;
    }

    public static final e P(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (((k) it8.next()).b().a().getF98116b() != e.PAY_NOW) {
                    return e.PAY_LATER;
                }
            }
        }
        return e.PAY_NOW;
    }

    public static h Q(pfm.r rVar, KClass exception) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new h(new j0(rVar.B(), new q(new hwg.b(exception, 1), 26), 2), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int R(Function1 function1, IntRange supportedRange) {
        Comparable value = (Comparable) function1.invoke(supportedRange);
        if (value == 0) {
            Intrinsics.checkNotNullParameter("Jpeg quality", "configurationName");
            Intrinsics.checkNotNullParameter(supportedRange, "supportedRange");
            throw new UnsupportedConfigurationException((RuntimeException) null, "Jpeg quality configuration selector couldn't select a value. Supported parameters from: " + Integer.valueOf(supportedRange.f186448a) + " to " + Integer.valueOf(supportedRange.f186449b) + CoreConstants.DOT);
        }
        if (supportedRange.contains(value)) {
            return ((Number) value).intValue();
        }
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(Integer.class, "klass");
        Intrinsics.checkNotNullParameter(supportedRange, "supportedRange");
        throw new InvalidConfigurationException(null, "Integer configuration selector selected value " + value + ". However it's not in the supported set of values. Supported parameters from: " + Integer.valueOf(supportedRange.f186448a) + " to " + Integer.valueOf(supportedRange.f186449b) + CoreConstants.DOT);
    }

    public static final v1 S(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new v1(new g0a.e(block, null));
    }

    public static final dj0.d T(double d, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d);
        return new dj0.d(new BigDecimal(dVar.f115082a).multiply(bigDecimalValueOf).setScale(cp5.d.p(dVar.f115083b), RoundingMode.HALF_UP).longValue(), dVar.f115083b);
    }

    public static final dj0.d U(dj0.d dVar, long j2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new dj0.d(dVar.f115082a * j2, dVar.f115083b);
    }

    public static final dj0.d V(dj0.d dVar, BigDecimal multiplier) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        return new dj0.d(new BigDecimal(dVar.f115082a).multiply(multiplier).setScale(0, RoundingMode.HALF_UP).longValue(), dVar.f115083b);
    }

    public static final long W(BigDecimal bigDecimal, xi0.b currency) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return (long) (bigDecimal.doubleValue() * cp5.d.k(currency));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final amd.a X(String str) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "<this>");
        switch (str.hashCode()) {
            case -1553284678:
                if (str.equals("tab_max")) {
                    return amd.a.MAX;
                }
                break;
            case -881391802:
                if (str.equals("tab_1m")) {
                    return amd.a.MONTH;
                }
                break;
            case -881391792:
                if (str.equals("tab_1w")) {
                    return amd.a.WEEK;
                }
                break;
            case -881391790:
                if (str.equals("tab_1y")) {
                    return amd.a.YEAR;
                }
                break;
            case -881391647:
                if (str.equals("tab_6m")) {
                    return amd.a.SIX_MONTHS;
                }
                break;
        }
        hx7.e.n(new IllegalArgumentException("Unknown timeframe id: ".concat(str)));
        return amd.a.YEAR;
    }

    public static final BigDecimal Y(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new BigDecimal(BigInteger.valueOf(dVar.f115082a), dVar.f115083b.c());
    }

    public static final TransportTicketProvider Z(zuf.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String strB = bVar.getName();
        zuf.c cVarA = bVar.getLogo();
        zwf.a aVar = zwf.b.Companion;
        String type = cVarA.getType();
        aVar.getClass();
        return new TransportTicketProvider(strB, new TransportTicketLogo(zwf.a.a(type), cVarA.getValue()));
    }

    public static final vki.a a(vki.b bVar, Object obj2) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new vki.a(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ij8.g a0(pj8.f r19) {
        /*
            r0 = r19
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r2 = r0.f236697c
            java.lang.String r3 = r0.d
            ij8.e[] r4 = ij8.e.values()
            int r5 = r4.length
            r6 = 0
            r7 = r6
        L12:
            r8 = 0
            r9 = 1
            if (r7 >= r5) goto L27
            r10 = r4[r7]
            java.lang.String r11 = r10.name()
            boolean r11 = kotlin.text.a0.z(r11, r2, r9)
            if (r11 == 0) goto L24
            r11 = r10
            goto L28
        L24:
            int r7 = r7 + 1
            goto L12
        L27:
            r11 = r8
        L28:
            if (r11 == 0) goto Lb2
            int[] r2 = oj8.a.f225746a
            int r4 = r11.ordinal()
            r2 = r2[r4]
            if (r2 == r9) goto L3f
            r1 = 2
            if (r2 != r1) goto L39
        L37:
            r13 = r8
            goto L7c
        L39:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L3f:
            pj8.i r2 = r0.e
            if (r2 == 0) goto L5f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            com.revolut.feature.junior_profile.api.models.WorkflowConfiguration r12 = new com.revolut.feature.junior_profile.api.models.WorkflowConfiguration
            java.lang.String r13 = r2.f236699a
            java.lang.String r14 = r2.f236700b
            java.lang.String r15 = r2.f236701c
            java.lang.String r1 = r2.d
            java.lang.String r4 = r2.e
            java.lang.String r2 = r2.f
            r16 = r1
            r18 = r2
            r17 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r13 = r12
            goto L7c
        L5f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "workflowConfiguration is empty while state is "
            r2.<init>(r4)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r4 = rd0.d.f253311a
            rd0.c r4 = rd0.c.ERROR
            rd0.d.a(r4, r8, r8, r1, r2)
            goto L37
        L7c:
            java.lang.String r1 = r0.f236695a
            java.lang.String r10 = r0.f236696b
            ij8.f[] r0 = ij8.f.values()
            int r2 = r0.length
        L85:
            if (r6 >= r2) goto L98
            r4 = r0[r6]
            java.lang.String r5 = r4.name()
            boolean r5 = kotlin.text.a0.z(r5, r3, r9)
            if (r5 == 0) goto L95
            r12 = r4
            goto L99
        L95:
            int r6 = r6 + 1
            goto L85
        L98:
            r12 = r8
        L99:
            if (r12 == 0) goto La2
            ij8.g r8 = new ij8.g
            r9 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        La2:
            java.lang.String r0 = "Type is not valid. Value = "
            java.lang.String r0 = j6.a.q(r0, r3)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        Lb2:
            java.lang.String r0 = r0.f236697c
            java.lang.String r1 = "State is not valid. Value = "
            java.lang.String r0 = j6.a.q(r1, r0)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pyd.c.a0(pj8.f):ij8.g");
    }

    public static final cp0.b b(TextSwitcher view) {
        cp0.b bVarJ = mo3.a.j(view);
        if (bVarJ != null) {
            return bVarJ;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        cp0.c cVar = new cp0.c(view);
        view.setTag(R$id.internal_view_tag_clause_adapter, cVar);
        return cVar;
    }

    public static final ogd.a b0(m mVar, String orderingKey) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(orderingKey, "orderingKey");
        List assetPairs = mVar.getAssetPairs();
        ArrayList arrayList = new ArrayList(w.t(assetPairs, 10));
        Iterator it8 = assetPairs.iterator();
        while (it8.hasNext()) {
            arrayList.add(cp5.d.d(cp5.d.H((String) it8.next())));
        }
        return new ogd.a(orderingKey, arrayList);
    }

    public static final cp0.b c(TextView view) {
        cp0.b bVarJ = mo3.a.j(view);
        if (bVarJ != null) {
            return bVarJ;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        cp0.d dVar = new cp0.d(view);
        view.setTag(R$id.internal_view_tag_clause_adapter, dVar);
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public static final u91.e c0(k91.c cVar) {
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ArrayList arrayList4;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        List listA = cVar.getDirectDebits();
        int i = 10;
        if (listA != null) {
            List list = listA;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                f fVar = (f) it8.next();
                Intrinsics.checkNotNullParameter(fVar, "<this>");
                String strB = fVar.getId();
                String strE = fVar.getName();
                dj0.d dVarO = mo3.a.o(fVar.getMoney());
                LocalDate localDate = LocalDate.parse(fVar.getDate());
                Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                String strC = fVar.getLogoUrl();
                o oVar = u91.p.Companion;
                String strI = fVar.getType();
                oVar.getClass();
                u91.p pVarA = o.a(strI);
                u91.m mVar = n.Companion;
                String strH = fVar.getState();
                mVar.getClass();
                n nVarA = u91.m.a(strH);
                String strG = fVar.getSentDate();
                LocalDate localDate2 = strG != null ? LocalDate.parse(strG) : null;
                List listF = fVar.getRequiredAttributes();
                if (listF != null) {
                    List<k91.k> list2 = listF;
                    ArrayList arrayList5 = new ArrayList(w.t(list2, i));
                    for (k91.k kVar : list2) {
                        Intrinsics.checkNotNullParameter(kVar, "<this>");
                        arrayList5.add(new l(kVar.getId(), kVar.getTitle(), kVar.getDescription()));
                        it8 = it8;
                    }
                    arrayList4 = arrayList5;
                } else {
                    arrayList4 = null;
                }
                Iterator it9 = it8;
                arrayList.add(new u91.i(strB, strE, dVarO, localDate, strC, pVarA, nVarA, localDate2, arrayList4));
                it8 = it9;
                i = 10;
            }
        } else {
            arrayList = f0.f322471a;
        }
        List listC = cVar.getScheduledPayments();
        if (listC != null) {
            List<k91.m> list3 = listC;
            arrayList2 = new ArrayList(w.t(list3, 10));
            for (k91.m mVar2 : list3) {
                Intrinsics.checkNotNullParameter(mVar2, "<this>");
                String strD = mVar2.getId();
                String strG2 = mVar2.getName();
                dj0.d dVarO2 = mo3.a.o(mVar2.getMoney());
                LocalDate localDate3 = LocalDate.parse(mVar2.getDate());
                Intrinsics.checkNotNullExpressionValue(localDate3, "parse(...)");
                String strE2 = mVar2.getLogoUrl();
                u91.r rVar = u91.s.Companion;
                String strB2 = mVar2.getFrequency();
                rVar.getClass();
                u91.s sVarA = u91.r.a(strB2);
                if (sVarA == null) {
                    sVarA = u91.s.MONTHLY;
                }
                u91.s sVar = sVarA;
                String strC2 = mVar2.getIban();
                String strH2 = mVar2.getReference();
                u91.m mVar3 = n.Companion;
                String strJ = mVar2.getState();
                mVar3.getClass();
                n nVarA2 = u91.m.a(strJ);
                String strI2 = mVar2.getSentDate();
                arrayList2.add(new u91.q(strD, strG2, dVarO2, localDate3, sVar, strC2, strH2, strE2, nVarA2, strI2 != null ? LocalDate.parse(strI2) : null));
            }
        } else {
            arrayList2 = f0.f322471a;
        }
        List listB = cVar.getIncomingPayments();
        if (listB != null) {
            List<k91.i> list4 = listB;
            arrayList3 = new ArrayList(w.t(list4, 10));
            for (k91.i iVar : list4) {
                Intrinsics.checkNotNullParameter(iVar, "<this>");
                String strB3 = iVar.getId();
                String strE3 = iVar.getName();
                dj0.d dVarO3 = mo3.a.o(iVar.getMoney());
                LocalDate localDate4 = LocalDate.parse(iVar.getDate());
                Intrinsics.checkNotNullExpressionValue(localDate4, "parse(...)");
                String strC3 = iVar.getLogoUrl();
                o oVar2 = u91.p.Companion;
                String strH3 = iVar.getType();
                oVar2.getClass();
                u91.p pVarA2 = o.a(strH3);
                u91.m mVar4 = n.Companion;
                String strG3 = iVar.getState();
                mVar4.getClass();
                n nVarA3 = u91.m.a(strG3);
                String strF = iVar.getSentDate();
                arrayList3.add(new u91.k(strB3, strE3, dVarO3, localDate4, strC3, pVarA2, nVarA3, strF != null ? LocalDate.parse(strF) : null));
            }
        } else {
            arrayList3 = f0.f322471a;
        }
        return new u91.e(arrayList, arrayList2, arrayList3);
    }

    public static final n71.a d(PixDto pixDto) {
        return new n71.a(pixDto.getKey(), pixDto.getTransferTime());
    }

    public static final z3d.e d0(s4d.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Pair pairH = cp5.d.H(eVar.getCurrencyPair());
        xi0.b bVar = (xi0.b) pairH.f186385a;
        xi0.b bVar2 = (xi0.b) pairH.f186386b;
        String str = bVar.f306286a;
        String str2 = bVar2.f306286a;
        FavouritesAssetTypeKey favouritesAssetTypeKey = new FavouritesAssetTypeKey(eVar.getAssetType());
        DateTime dateTime = DateTime.parse(eVar.getCreatedDate());
        Intrinsics.checkNotNullExpressionValue(dateTime, "parse(...)");
        return new z3d.e(str, str2, dateTime, favouritesAssetTypeKey, z3d.f.SYNCED);
    }

    public static final n71.c e(TedDto tedDto) {
        return new n71.c(tedDto.getBankName(), tedDto.getBeneficiaryName(), tedDto.getBankCode(), tedDto.getBranchCode(), tedDto.getAccountNumber(), tedDto.getCompanyRegisteredNumber(), tedDto.getTransferTime());
    }

    public static final j e0(ml3.o oVar, ml3.p pVar) {
        String strL;
        String strL2;
        String strL3;
        String strL4;
        String strL5;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        String str7 = oVar.f206609a;
        if (pVar == null || (str6 = pVar.f206616b) == null || (strL = m70.a.l(str6)) == null) {
            strL = oVar.f206610b;
        }
        String str8 = strL;
        if (pVar == null || (str5 = pVar.e) == null || (strL2 = m70.a.l(str5)) == null) {
            strL2 = oVar.f206611c;
        }
        String str9 = strL2;
        if (pVar == null || (str4 = pVar.f) == null || (strL3 = m70.a.l(str4)) == null) {
            strL3 = oVar.d;
        }
        String str10 = strL3;
        if (pVar == null || (str3 = pVar.f206618g) == null || (strL4 = m70.a.l(str3)) == null) {
            strL4 = oVar.e;
        }
        String str11 = strL4;
        String str12 = oVar.f;
        do3.b.Companion.getClass();
        do3.b bVar = do3.b.FULL;
        LocalDate localDate = null;
        zm3.h hVarI = pw5.a.I(pVar != null ? pVar.f206617c : null);
        if (pVar != null && (str2 = pVar.d) != null) {
            localDate = LocalDate.parse(str2);
        }
        LocalDate localDate2 = localDate;
        int i = oVar.f206614j;
        long j2 = oVar.k;
        zm3.k kVarValueOf = zm3.k.valueOf(oVar.f206613h);
        if (pVar == null || (str = pVar.f206619h) == null || (strL5 = m70.a.l(str)) == null) {
            strL5 = oVar.i;
        }
        return new j(str9, str10, str11, strL5, kVarValueOf, str7, str8, str12, bVar, hVarI, localDate2, j2, i);
    }

    public static final PixDto f(n71.a aVar) {
        return new PixDto(aVar.f212972a, aVar.f212973b);
    }

    public static long f0(LocalDate localDate) {
        ZoneOffset offset = ZoneOffset.UTC;
        Intrinsics.checkNotNullExpressionValue(offset, "UTC");
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(offset, "offset");
        return localDate.atStartOfDay().toInstant(offset).toEpochMilli();
    }

    public static final TedDto g(n71.c cVar) {
        return new TedDto(cVar.f212991a, cVar.f212992b, cVar.f212993c, cVar.d, cVar.e, cVar.f, cVar.f212994g);
    }

    public static final String g0(alc.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String[] elements = {"DrawdownChartParams", bVar.f6187a, bVar.f6188b.toString(), bVar.f6189c};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0.k0(kotlin.collections.d.L(elements), "_", null, null, 0, null, 62);
    }

    public static final ArrayList h(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList<IncomeSorterHomeContract$DestinationValue> arrayListP = p(list);
        ArrayList arrayList = new ArrayList(w.t(arrayListP, 10));
        for (IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue : arrayListP) {
            arrayList.add(new IncomeSorterDestination(incomeSorterHomeContract$DestinationValue.f87826b, incomeSorterHomeContract$DestinationValue.f87825a.getId()));
        }
        return arrayList;
    }

    public static final YearMonth h0(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return YearMonth.from(localDate);
    }

    public static final int i(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return Intrinsics.l(dVar.f115082a, 0L);
    }

    public static final dj0.d i0(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new dj0.d(-dVar.f115082a, dVar.f115083b);
    }

    public static final BigDecimal j(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        BigDecimal bigDecimalDivide = new BigDecimal(dVar.f115082a).divide(cp5.d.j(dVar.f115083b), MathContext.DECIMAL128);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide;
    }

    public static final dj0.d j0(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        int iB = dVar.f115083b.b();
        xi0.b bVar = dVar.f115083b;
        if (iB == bVar.c()) {
            return dVar;
        }
        BigDecimal bigDecimal = new BigDecimal(cp5.d.k(bVar));
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        BigDecimal bigDecimalDivide = bigDecimal.divide(new BigDecimal((long) Math.pow(10.0d, bVar.b())));
        long j2 = dVar.f115082a;
        MathContext DECIMAL128 = MathContext.DECIMAL128;
        Intrinsics.checkNotNullExpressionValue(DECIMAL128, "DECIMAL128");
        return new dj0.d(new BigDecimal(j2, DECIMAL128).divide(bigDecimalDivide, RoundingMode.DOWN).longValue(), xi0.b.a(bVar, Integer.valueOf(bVar.b())));
    }

    public static final dj0.d k(dj0.d dVar, long j2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new dj0.d(dVar.f115082a / j2, dVar.f115083b);
    }

    public static String l(com.google.crypto.tink.shaded.protobuf.j jVar) {
        StringBuilder sb6 = new StringBuilder(jVar.size());
        for (int i = 0; i < jVar.size(); i++) {
            byte bA = jVar.a(i);
            if (bA == 34) {
                sb6.append("\\\"");
            } else if (bA == 39) {
                sb6.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb6.append("\\a");
                        break;
                    case 8:
                        sb6.append("\\b");
                        break;
                    case 9:
                        sb6.append("\\t");
                        break;
                    case 10:
                        sb6.append("\\n");
                        break;
                    case 11:
                        sb6.append("\\v");
                        break;
                    case 12:
                        sb6.append("\\f");
                        break;
                    case 13:
                        sb6.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb6.append(CoreConstants.ESCAPE_CHAR);
                            sb6.append((char) (((bA >>> 6) & 3) + 48));
                            sb6.append((char) (((bA >>> 3) & 7) + 48));
                            sb6.append((char) ((bA & 7) + 48));
                        } else {
                            sb6.append((char) bA);
                        }
                        break;
                }
            } else {
                sb6.append("\\\\");
            }
        }
        return sb6.toString();
    }

    public static final q0 m(Flow flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return new q0(flow, new xsd.a(2, 12, null), 1);
    }

    public static final String n(iv9.a message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String str = message.d;
        List listN0 = str != null ? kotlin.text.d0.n0(str, new String[]{":"}, 0, 6) : null;
        Integer numValueOf = listN0 != null ? Integer.valueOf(listN0.size()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return message.f168779c;
        }
        if (numValueOf != null && numValueOf.intValue() == 4) {
            return (String) d0.b0(listN0);
        }
        throw new IllegalStateException("Unsupported amount of data in message content: " + listN0);
    }

    public static final String o(kv9.h message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String strD = message.getMedia();
        List listN0 = strD != null ? kotlin.text.d0.n0(strD, new String[]{":"}, 0, 6) : null;
        Integer numValueOf = listN0 != null ? Integer.valueOf(listN0.size()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            String code = message.getRecipient().getCode();
            if (code != null) {
                return code;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (numValueOf != null && numValueOf.intValue() == 4) {
            return (String) d0.b0(listN0);
        }
        throw new IllegalStateException("Unsupported amount of data in message content: " + listN0);
    }

    public static final ArrayList p(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue = (IncomeSorterHomeContract$DestinationValue) obj2;
            if (incomeSorterHomeContract$DestinationValue.f87826b.f(dj0.d.e) && !lqd.a.c(incomeSorterHomeContract$DestinationValue)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final String q(iv9.a message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return r(message.f168778b, message.f168779c);
    }

    public static final String r(String recipientCode, String senderCode) {
        Intrinsics.checkNotNullParameter(recipientCode, "recipientCode");
        Intrinsics.checkNotNullParameter(senderCode, "senderCode");
        return d0.k0(d0.O0(v.k(recipientCode, senderCode)), "", null, null, 0, null, 62);
    }

    public static final String s(kv9.h message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String code = message.getRecipient().getCode();
        if (code == null && (code = message.getRecipient().getGroupId()) == null) {
            code = "";
        }
        return r(code, message.getSender().getCode());
    }

    public static final dj0.d t(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        l0 l0Var = a3Var.Q1;
        if (l0Var == null) {
            return null;
        }
        h0 h0Var = l0Var.f272897c;
        return u80.q.a(h0Var.f272777a, new xi0.b(6, h0Var.f272778b, null));
    }

    public static final xi0.b u(a3 a3Var) {
        String str;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        l0 l0Var = a3Var.Q1;
        if (l0Var == null || (str = l0Var.f272897c.f272778b) == null) {
            return null;
        }
        return new xi0.b(6, str, null);
    }

    public static final xi0.b v(a3 a3Var) {
        xi0.b bVarW;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        xi0.b bVarU = u(a3Var);
        if (bVarU == null) {
            return null;
        }
        return ((a3Var.e == y6.DEFI_SWAP && a3Var.z == p0.BUY) || (bVarW = w(a3Var)) == null) ? bVarU : bVarW;
    }

    public static final xi0.b w(a3 a3Var) {
        h0 h0Var;
        String str;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        l0 l0Var = a3Var.Q1;
        if (l0Var == null || (h0Var = l0Var.f272899h) == null || (str = h0Var.f272778b) == null) {
            return null;
        }
        return new xi0.b(6, str, null);
    }

    public static final BigDecimal x(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        BigDecimal bigDecimalDivide = BigDecimal.valueOf(dVar.f115082a).divide(new BigDecimal(cp5.d.k(dVar.f115083b)));
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide;
    }

    public static Parcelable y(Bundle bundle) {
        return Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable("hCaptchaDialogListener", HCaptchaStateListener.class) : bundle.getParcelable("hCaptchaDialogListener");
    }

    public static final boolean z(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(dVar.f115083b, "<this>");
        long jPow = (long) Math.pow(10.0d, r1.b());
        return new BigDecimal(10).pow(2).multiply(BigDecimal.valueOf((((double) (Math.abs(dVar.f115082a) % jPow)) * 1.0d) / ((double) jPow))).remainder(BigDecimal.ONE).doubleValue() > 0.0d;
    }
}
