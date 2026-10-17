package vrl;

import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class s0 {

    @NotNull
    private static final p0 Companion = new p0();
    public static final Set e;
    public static final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set f291675g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f291676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zrl.b f291677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nil.e f291678c;
    public final Lazy d;

    static {
        k4l.r0 r0Var = k4l.r0.MARKET;
        k4l.r0 r0Var2 = k4l.r0.LIMIT;
        k4l.r0 r0Var3 = k4l.r0.STOP;
        k4l.r0[] elements = {r0Var, r0Var2, r0Var3};
        Intrinsics.checkNotNullParameter(elements, "elements");
        e = kotlin.collections.d.y0(elements);
        k4l.r0[] elements2 = {r0Var, r0Var3};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        f = kotlin.collections.d.y0(elements2);
        k4l.r0[] elements3 = {r0Var, k4l.r0.RECURRING};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        f291675g = kotlin.collections.d.y0(elements3);
    }

    public s0(gte.a featureToggleInteractor, zrl.b maximumBuyAmountResolver, nil.e wealthKeyboardSuggestionsInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(maximumBuyAmountResolver, "maximumBuyAmountResolver");
        Intrinsics.checkNotNullParameter(wealthKeyboardSuggestionsInteractor, "wealthKeyboardSuggestionsInteractor");
        this.f291676a = featureToggleInteractor;
        this.f291677b = maximumBuyAmountResolver;
        this.f291678c = wealthKeyboardSuggestionsInteractor;
        this.d = yhm.j.b(new vch.a(this, 24));
    }

    public static pel.e a(s0 s0Var, BigDecimal bigDecimal) {
        return new pel.e("PERCENT_SUGGESTION_" + bigDecimal, bigDecimal, f8l.c.SECURITY);
    }

    public static boolean b(wrl.c cVar, f8l.c cVar2) {
        List list = cVar.f;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (((Asset) it8.next()).f104719a == cVar2) {
                return true;
            }
        }
        return false;
    }

    public static Asset d(wrl.c cVar) {
        Object next;
        Iterator it8 = cVar.f.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (boh.f.l((Asset) next)) {
                break;
            }
        }
        return (Asset) next;
    }

    public final go.g c(wrl.c cVar) {
        Object objC;
        bfl.g gVar = cVar.f299636c;
        k4l.r0 r0Var = cVar.d;
        nel.n nVar = cVar.f299635b;
        if (gVar != bfl.g.SELL || !f.contains(r0Var)) {
            return zi0.c.i(zhm.f0.f322471a);
        }
        if (!io3.h.i(nVar.f214597c) && n14.k.j(cVar.f299638h, r0Var) <= 0) {
            return zi0.c.i(zhm.f0.f322471a);
        }
        int i = r0.f291673c[cVar.e.f104719a.ordinal()];
        if (i == 1) {
            objC = b(cVar, f8l.c.SECURITY) ? io3.h.i(nVar.f214597c) ? zhm.u.c(new pel.a(null)) : zhm.v.k(a(this, new BigDecimal("0.1")), a(this, new BigDecimal("0.25")), a(this, new BigDecimal("0.5")), new pel.a(null)) : zhm.f0.f322471a;
        } else if (i == 2 || i == 3 || i == 4) {
            objC = b(cVar, f8l.c.SECURITY) ? zhm.u.c(new pel.a(nVar.e)) : zhm.f0.f322471a;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            objC = zhm.f0.f322471a;
        }
        return zi0.c.i(objC);
    }
}
