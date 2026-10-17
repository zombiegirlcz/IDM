package dwi;

import com.revolut.data.model.Data;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesUserCapabilities;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f120423b;

    public /* synthetic */ f0(i0 i0Var, int i) {
        this.f120422a = i;
        this.f120423b = i0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        efm.r rVarJ;
        switch (this.f120422a) {
            case 0:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                AirportLoungesUserCapabilities airportLoungesUserCapabilities = (AirportLoungesUserCapabilities) data.getContent();
                String str = airportLoungesUserCapabilities != null ? airportLoungesUserCapabilities.d : null;
                if (str != null && str.length() != 0) {
                    return zi0.c.j(str);
                }
                if (data.getLoading()) {
                    efm.r rVarF = z9h.n.f(null, null, true, 3, null);
                    Intrinsics.checkNotNullExpressionValue(rVarF, "just(...)");
                    return rVarF;
                }
                i0 i0Var = this.f120423b;
                pre.c cVar = i0Var.f120430c;
                TermsScope.INSTANCE.getClass();
                efm.r rVarL = pre.c.l(cVar, null, null, zhm.u.c(TermsScope.f90361b), 11);
                zhm.f0 f0Var = zhm.f0.f322471a;
                Intrinsics.checkNotNullParameter(rVarL, "<this>");
                efm.r map = rVarL.map(new dz7.l(new av8.o(f0Var, 9), 1));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return pd.b.r(ue0.e.E(map, zi0.c.P(f0Var, false, null, 3)), new f0(i0Var, 1));
            default:
                List terms = (List) obj2;
                Intrinsics.checkNotNullParameter(terms, "terms");
                Iterator it8 = terms.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        TermsScope termsScope = ((Terms) next).f;
                        TermsScope.INSTANCE.getClass();
                        if (Intrinsics.f(termsScope, TermsScope.f90361b)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Terms terms2 = (Terms) next;
                String str2 = terms2 != null ? terms2.f90357c : null;
                if (str2 != null && (rVarJ = zi0.c.j(str2)) != null) {
                    return rVarJ;
                }
                efm.r rVarW = nim.a.w(this.f120423b.f120429b.k(false), new f(8));
                Intrinsics.checkNotNullParameter(rVarW, "<this>");
                efm.r map2 = rVarW.map(new dz7.l(new av8.o("https://www.revolut.com/legal/airport-lounges", 9), 1));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                return ue0.e.E(map2, zi0.c.P("https://www.revolut.com/legal/airport-lounges", false, null, 3));
        }
    }
}
