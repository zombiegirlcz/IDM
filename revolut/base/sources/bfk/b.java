package bfk;

import dj0.d;
import hha.f;
import hha.g;
import hha.g0;
import hha.h0;
import hha.i0;
import hha.m;
import hha.o;
import hha.p;
import hha.t0;
import hha.u;
import hha.x;
import hha.y;
import hha.z;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import org.joda.time.DateTime;
import org.joda.time.Period;
import zek.b0;
import zek.d0;
import zek.i;
import zek.l;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f15010a = r0.k(new Pair("AVAILABLE", g0.AVAILABLE), new Pair("UNAVAILABLE", g0.UNAVAILABLE), new Pair("PENDING", g0.PENDING));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f15011b = r0.k(new Pair("ENABLED", y.ENABLED), new Pair("DISABLED", y.DISABLED), new Pair("INACTIVE", y.INACTIVE), new Pair("PENDING", y.PENDING), new Pair("LOCKED", y.LOCKED));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f15012c = r0.k(new Pair("KEEP_PLAN", p.KEEP_PLAN), new Pair("CHANGE_PLAN", p.CHANGE_PLAN));

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Map] */
    public static final g a(l lVar) {
        f fVar;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Period period = Period.parse(lVar.getPeriod());
        Intrinsics.checkNotNullExpressionValue(period, "parse(...)");
        String fixedTermPeriod = lVar.getFixedTermPeriod();
        Period period2 = fixedTermPeriod != null ? Period.parse(fixedTermPeriod) : null;
        d dVarV = hx7.a.v(lVar.getFee());
        zek.f charge = lVar.getCharge();
        o oVarD = charge != null ? d(charge) : null;
        l.a discount = lVar.getDiscount();
        if (discount != null) {
            Intrinsics.checkNotNullParameter(discount, "<this>");
            long fee2 = discount.getFee();
            xi0.a aVar = xi0.b.Companion;
            String currency = discount.getCurrency();
            aVar.getClass();
            d dVar = new d(fee2, xi0.a.a(currency));
            zek.f charge2 = discount.getCharge();
            fVar = new f(discount.getPeriodsCount(), discount.getEndDate(), dVar, charge2 != null ? d(charge2) : null, discount.getTermsUrl(), (p) u1.t(discount.getPostDiscountOption(), p.KEEP_PLAN, f15012c));
        } else {
            fVar = null;
        }
        i freeTrial = lVar.getFreeTrial();
        z zVarF = freeTrial != null ? f(freeTrial) : null;
        jo3.b reward = lVar.getReward();
        d dVarV2 = reward != null ? hx7.a.v(reward) : null;
        zek.b cashbackBoostCampaign = lVar.getCashbackBoostCampaign();
        return new g(period, period2, dVarV, oVarD, fVar, zVarF, dVarV2, cashbackBoostCampaign != null ? c(cashbackBoostCampaign) : null);
    }

    public static final m b(gfk.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        BigDecimal percentage = bVar.getPercentage();
        Period period = Period.parse(bVar.getDuration());
        Intrinsics.checkNotNullExpressionValue(period, "parse(...)");
        Long endDate = bVar.getEndDate();
        return new m(percentage, period, endDate != null ? new DateTime(endDate.longValue()) : null);
    }

    public static final m c(zek.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        BigDecimal percentage = bVar.getPercentage();
        Period period = Period.parse(bVar.getDuration());
        Intrinsics.checkNotNullExpressionValue(period, "parse(...)");
        Long endDate = bVar.getEndDate();
        return new m(percentage, period, endDate != null ? new DateTime(endDate.longValue()) : null);
    }

    public static final o d(zek.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        d dVarV = hx7.a.v(fVar.getTotal());
        d dVarV2 = hx7.a.v(fVar.getFee());
        List taxes = fVar.getTaxes();
        if (taxes == null) {
            taxes = f0.f322471a;
        }
        List<d0> list = taxes;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (d0 d0Var : list) {
            Intrinsics.checkNotNullParameter(d0Var, "<this>");
            arrayList.add(new t0(hx7.a.v(d0Var.getValue()), d0Var.getType()));
        }
        return new o(dVarV, dVarV2, arrayList);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public static final x e(zek.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return new x(new u(pVar.getName()), (y) u1.u(pVar.getState(), f15011b));
    }

    public static final z f(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Period period = Period.parse(iVar.getDuration());
        Intrinsics.checkNotNullExpressionValue(period, "parse(...)");
        Long endDate = iVar.getEndDate();
        h0 h0Var = null;
        DateTime dateTime = endDate != null ? new DateTime(endDate.longValue()) : null;
        String termsUrl = iVar.getTermsUrl();
        String type = iVar.getType();
        if (type != null) {
            h0[] h0VarArrValues = h0.values();
            int length = h0VarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                h0 h0Var2 = h0VarArrValues[i];
                if (a0.z(h0Var2.name(), type, true)) {
                    h0Var = h0Var2;
                    break;
                }
                i++;
            }
        }
        return new z(period, dateTime, termsUrl, h0Var);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    public static final i0 g(b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        long fee2 = b0Var.getFee();
        xi0.a aVar = xi0.b.Companion;
        String currency = b0Var.getCurrency();
        aVar.getClass();
        d dVar = new d(fee2, xi0.a.a(currency));
        zek.f charge = b0Var.getCharge();
        h0 h0Var = null;
        o oVarD = charge != null ? d(charge) : null;
        String duration = b0Var.getDuration();
        Period period = duration != null ? Period.parse(duration) : null;
        Long startDate = b0Var.getStartDate();
        Long endDate = b0Var.getEndDate();
        String termsUrl = b0Var.getTermsUrl();
        p pVar = (p) u1.t(b0Var.getPostDiscountOption(), p.KEEP_PLAN, f15012c);
        String type = b0Var.getType();
        if (type != null) {
            h0[] h0VarArrValues = h0.values();
            int length = h0VarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                h0 h0Var2 = h0VarArrValues[i];
                if (a0.z(h0Var2.name(), type, true)) {
                    h0Var = h0Var2;
                    break;
                }
                i++;
            }
        }
        return new i0(period, startDate, endDate, dVar, oVarD, termsUrl, pVar, h0Var);
    }

    public static final zek.b h(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        BigDecimal bigDecimal = mVar.f152321a;
        String string = mVar.f152322b.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        DateTime dateTime = mVar.f152323c;
        return new zek.b(bigDecimal, string, dateTime != null ? Long.valueOf(dateTime.getMillis()) : null);
    }

    public static final i i(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        String string = zVar.f152375a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        DateTime dateTime = zVar.f152376b;
        Long lValueOf = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
        String str = zVar.f152377c;
        h0 h0Var = zVar.d;
        return new i(string, lValueOf, str, h0Var != null ? h0Var.name() : null);
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.Map] */
    public static final l j(g gVar) {
        l.a aVar;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        String string = gVar.f152306a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Period period = gVar.f152307b;
        String string2 = period != null ? period.toString() : null;
        jo3.b bVarA = hx7.a.A(gVar.f152308c);
        o oVar = gVar.d;
        zek.f fVarL = oVar != null ? l(oVar) : null;
        f fVar = gVar.e;
        if (fVar != null) {
            d dVar = fVar.f152304c;
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            long j2 = dVar.f115082a;
            o oVar2 = fVar.d;
            aVar = new l.a(j2, oVar2 != null ? l(oVar2) : null, dVar.f115083b.f306286a, fVar.f152302a, fVar.f152303b, fVar.e, u1.g(fVar.f, f15012c));
        } else {
            aVar = null;
        }
        z zVar = gVar.f;
        i iVarI = zVar != null ? i(zVar) : null;
        d dVar2 = gVar.f152309g;
        jo3.b bVarA2 = dVar2 != null ? hx7.a.A(dVar2) : null;
        m mVar = gVar.f152310h;
        return new l(string, string2, bVarA, fVarL, aVar, iVarI, bVarA2, mVar != null ? h(mVar) : null);
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
    public static final b0 k(i0 i0Var) {
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        long j2 = i0Var.d.f115082a;
        o oVar = i0Var.e;
        zek.f fVarL = oVar != null ? l(oVar) : null;
        String str = i0Var.d.f115083b.f306286a;
        Period period = i0Var.f152311a;
        String string = period != null ? period.toString() : null;
        Long l2 = i0Var.f152312b;
        Long l3 = i0Var.f152313c;
        String str2 = i0Var.f;
        String strG = u1.g(i0Var.f152314g, f15012c);
        h0 h0Var = i0Var.f152315h;
        return new b0(j2, fVarL, str, string, l2, l3, str2, strG, h0Var != null ? h0Var.name() : null);
    }

    public static final zek.f l(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        jo3.b bVarA = hx7.a.A(oVar.f152326a);
        jo3.b bVarA2 = hx7.a.A(oVar.f152327b);
        List<t0> list = oVar.f152328c;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (t0 t0Var : list) {
            Intrinsics.checkNotNullParameter(t0Var, "<this>");
            jo3.b bVarA3 = hx7.a.A(t0Var.f152340a);
            String strA = t0Var.f152341b.a();
            if (strA == null) {
                strA = "UNKNOWN";
            }
            arrayList.add(new d0(strA, bVarA3));
        }
        return new zek.f(bVarA, bVarA2, arrayList);
    }
}
