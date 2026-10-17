package ft3;

import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f137832a;

    static {
        c1 c1Var = d1.Companion;
        Pair pair = new Pair("cc", mif.a.m(c1Var, j1.CREDIT_CARD, null));
        j1 j1Var = j1.FIXED_TERM_CREDIT;
        f137832a = zhm.r0.k(pair, new Pair("ftc", new d1(j1Var, gt3.d.LOAN, null)), new Pair("bnpl", mif.a.m(c1Var, j1.BUY_NOW_PAY_LATER, null)), new Pair("cc-cli", mif.a.m(c1Var, j1.CREDIT_CARD_LIMIT_INCREASE, null)), new Pair("fcc", mif.a.m(c1Var, j1.FAMILY_CREDIT_CARD, null)), new Pair("cc-bcm", mif.a.m(c1Var, j1.BASIC_CREDIT_CARD, null)), new Pair("rfl", new d1(j1Var, gt3.d.REFINANCING, null)), new Pair("od", mif.a.m(c1Var, j1.OVERDRAFT, null)), new Pair("mtg", mif.a.m(c1Var, j1.MORTGAGE, null)), new Pair("mtg-rf", mif.a.m(c1Var, j1.REFINANCING_MORTGAGE, null)), new Pair("mtg-rng", mif.a.m(c1Var, j1.MORTGAGE_RENEGOTIATION, null)), new Pair("ftc-fbr", mif.a.m(c1Var, j1.FTC_FORBEARANCE, null)), new Pair("cc-fbr", mif.a.m(c1Var, j1.CC_FORBEARANCE, null)), new Pair("pt-rp", mif.a.m(c1Var, j1.POST_TERMINATION_REPAYMENT_PLAN, null)), new Pair("pt-ps", mif.a.m(c1Var, j1.POST_TERMINATION_PARTIAL_SETTLEMENTS, null)), new Pair("cc-cld", mif.a.m(c1Var, j1.CREDIT_CARD_LIMIT_DECREASE, null)), new Pair("ne-ci-ftc", mif.a.m(c1Var, j1.NON_EMBEDDED_CREDIT_INSURANCE_FTC, null)), new Pair("ne-ci-cc", mif.a.m(c1Var, j1.NON_EMBEDDED_CREDIT_INSURANCE_CC, null)));
    }

    public static final d1 a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        d1 d1VarB = b(str);
        if (d1VarB != null) {
            return d1VarB;
        }
        throw new IllegalStateException(p.a.p("Can't support ", str, " product"));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final d1 b(String str) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Iterator it8 = f137832a.entrySet().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((Map.Entry) next).getKey(), str)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (d1) entry.getValue();
        }
        return null;
    }

    public static final q0 c(d1 d1Var, String str, it3.k kVar) {
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        j1 j1Var = d1Var.f137810a;
        gt3.f fVar = d1Var.f137811b;
        switch (f1.f137825a[j1Var.ordinal()]) {
            case 1:
                return fVar == gt3.d.LOAN ? w.INSTANCE : fVar == gt3.d.REFINANCING ? o0.INSTANCE : fVar == gt3.d.HOME_IMPROVEMENT ? u.INSTANCE : w.INSTANCE;
            case 2:
                if (str == null) {
                    throw new IllegalStateException("MORTGAGE_RENEGOTIATION can't be mapped without originalFacility id");
                }
                Intrinsics.i(fVar, "null cannot be cast to non-null type com.revolut.feature.credit.application.models.products.types.ProductSubtype.MortgageRenegotiationType");
                return new d0(str, (gt3.e) fVar);
            case 3:
                return new g(fVar instanceof gt3.c ? (gt3.c) fVar : null, kVar);
            case 4:
                return new n(str, 2);
            case 5:
                return str == null ? s.INSTANCE : new r(str);
            case 6:
                if (str != null) {
                    return new c(str);
                }
                throw new IllegalStateException("BASIC_CREDIT_CARD can't be mapped without originalFacility id");
            case 7:
                return a0.INSTANCE;
            case 8:
                return p0.INSTANCE;
            case 9:
                return g0.INSTANCE;
            case 10:
                return d.INSTANCE;
            case 11:
                if (str != null) {
                    return new z(str);
                }
                throw new IllegalStateException("FTC_FORBEARANCE can't be mapped without originalFacility id");
            case 12:
                if (str != null) {
                    return new j(str);
                }
                throw new IllegalStateException("CC_FORBEARANCE can't be mapped without originalFacility id");
            case 13:
                if (str != null) {
                    return new n0(str);
                }
                throw new IllegalStateException("POST_TERMINATION_REPAYMENT_PLAN can't be mapped without originalFacility id");
            case 14:
                if (str != null) {
                    return new k0(str);
                }
                throw new IllegalStateException("POST_TERMINATION_PARTIAL_SETTLEMENTS can't be mapped without originalFacility id");
            case 15:
                if (str != null) {
                    return new m(str, fVar instanceof gt3.b ? (gt3.b) fVar : null);
                }
                throw new IllegalStateException("CREDIT_CARD_LIMIT_DECREASE can't be mapped without originalFacility id");
            case 16:
                return new f0(str);
            case 17:
                return new e0(str);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ q0 d(d1 d1Var, String str, it3.k kVar, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            kVar = null;
        }
        return c(d1Var, str, kVar);
    }

    public static q0 e(j1 j1Var, gt3.f fVar, String str) {
        Intrinsics.checkNotNullParameter(j1Var, "<this>");
        return c(new d1(j1Var, fVar, null), str, null);
    }

    public static final d1 f(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        d1 d1VarG = g(str, str2, null);
        if (d1VarG != null) {
            return d1VarG;
        }
        throw new IllegalStateException(p.a.p("Can't support ", str, " product"));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final d1 g(String str, String str2, String str3) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Iterator it8 = f137832a.entrySet().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((Map.Entry) next).getKey(), str)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        d1 d1Var = entry != null ? (d1) entry.getValue() : null;
        if (d1Var == null) {
            return null;
        }
        j1 j1Var = d1Var.f137810a;
        gt3.f fVarV = hb9.b.v(j1Var, str2);
        if (fVarV == null) {
            fVarV = d1Var.f137811b;
        }
        it3.k.Companion.getClass();
        return new d1(j1Var, fVarV, it3.j.a(str3));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final String h(d1 d1Var) {
        Object next;
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        Iterator it8 = f137832a.entrySet().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((Map.Entry) next).getValue(), d1Var)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        String str = entry != null ? (String) entry.getKey() : null;
        Lazy lazyY0 = te0.w.y0(new e1(d1Var, 1));
        if (str != null) {
            return str;
        }
        String str2 = (String) lazyY0.getValue();
        if (str2 != null) {
            return str2;
        }
        throw new IllegalStateException("Can't support productType=" + d1Var.f137810a + ", productSubtype=" + d1Var.f137811b + " product");
    }

    public static final String i(j1 j1Var) {
        Intrinsics.checkNotNullParameter(j1Var, "<this>");
        d1 d1Var = new d1(j1Var, null, null);
        if (j1Var == j1.FIXED_TERM_CREDIT) {
            d1Var = d1.c(d1Var, gt3.d.LOAN, null, 5);
        }
        return h(d1Var);
    }
}
