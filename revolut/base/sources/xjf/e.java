package xjf;

import aw0.k7;
import com.revolut.core.ui_kit.models.MoneyClause;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k71.k;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import tof.a3;
import tof.l6;
import tof.m3;
import tof.o3;
import tof.r0;
import tof.s0;
import u80.j;
import u80.s;
import u80.t;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class e {
    public static final dj0.d a(a3 a3Var, nrf.a... type) {
        s0 s0Var;
        List list;
        Object next;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        ArrayList arrayList = new ArrayList(type.length);
        for (nrf.a aVar : type) {
            arrayList.add(aVar.a());
        }
        Set setI1 = d0.i1(arrayList);
        m3 m3Var = a3Var.f272589e1;
        if (m3Var != null && (s0Var = m3Var.f272931c) != null && (list = s0Var.f273036a) != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (setI1.contains(((r0) next).f273016a)) {
                    break;
                }
            }
            r0 r0Var = (r0) next;
            if (r0Var != null) {
                return r0Var.e;
            }
        }
        return null;
    }

    public static final MoneyClause b(a3 a3Var) {
        dj0.d dVar;
        xi0.b bVar;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        long jF0 = k.f0(a3Var);
        o3 o3Var = a3Var.J;
        String str = (o3Var == null || (dVar = o3Var.f272965a) == null || (bVar = dVar.f115083b) == null) ? null : bVar.f306286a;
        if (str == null) {
            str = "";
        }
        return new MoneyClause(new dj0.d(jF0, new xi0.b(6, str, null)), new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, null, 12);
    }

    public static final dj0.d c(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return pyd.c.O(a3Var.k.a(), a3Var.f272599l.a());
    }

    public static final String d(xi0.b currencyFrom, xi0.b bVar, BigDecimal exchangeRate, t ratesMoneyUtils, qd0.b languageProvider, boolean z, boolean z3) {
        CharSequence charSequenceE;
        Intrinsics.checkNotNullParameter(currencyFrom, "currencyFrom");
        Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
        Intrinsics.checkNotNullParameter(ratesMoneyUtils, "ratesMoneyUtils");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        if (bVar == null) {
            m70.a.c(t0.f186434a);
            return "";
        }
        Pair pair = (z3 || g(currencyFrom, bVar)) ? new Pair(bVar, currencyFrom) : new Pair(currencyFrom, bVar);
        xi0.b bVar2 = (xi0.b) pair.f186385a;
        xi0.b bVar3 = (xi0.b) pair.f186386b;
        u80.k.Companion.getClass();
        u80.k kVarA = j.a(languageProvider);
        kVarA.f278047b = bVar2;
        kVarA.q(cp5.d.k(bVar2));
        kVarA.k = true;
        String strA = kVarA.a();
        if (z && cp5.d.z(bVar2)) {
            charSequenceE = ratesMoneyUtils.f(exchangeRate, bVar3, true);
        } else {
            if (z3 && exchangeRate.signum() == 0) {
                m70.a.c(t0.f186434a);
                return "";
            }
            if (z3) {
                exchangeRate = BigDecimal.ONE.divide(exchangeRate, MathContext.DECIMAL128);
            }
            Intrinsics.h(exchangeRate);
            s sVar = t.Companion;
            charSequenceE = ratesMoneyUtils.e(exchangeRate, bVar3, true);
        }
        return strA + " = " + ((Object) charSequenceE);
    }

    public static String e(xi0.b currencyFrom, xi0.b bVar, double d, t ratesMoneyUtils, qd0.b languageProvider, int i) {
        Intrinsics.checkNotNullParameter(currencyFrom, "currencyFrom");
        Intrinsics.checkNotNullParameter(ratesMoneyUtils, "ratesMoneyUtils");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return d(currencyFrom, bVar, new BigDecimal(String.valueOf(d)), ratesMoneyUtils, languageProvider, false, false);
    }

    public static final MoneyClause f(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return new MoneyClause(a3Var.k, new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, null, 12);
    }

    public static final boolean g(xi0.b from, xi0.b to6) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        if (cp5.d.A(from)) {
            return cp5.d.z(to6) || cp5.d.y(to6);
        }
        return false;
    }

    public static final dj0.d h(l6 l6Var) {
        Intrinsics.checkNotNullParameter(l6Var, "<this>");
        long j2 = l6Var.f272916a;
        xi0.a aVar = xi0.b.Companion;
        String str = l6Var.f272917b;
        aVar.getClass();
        return new dj0.d(j2, xi0.a.a(str));
    }
}
