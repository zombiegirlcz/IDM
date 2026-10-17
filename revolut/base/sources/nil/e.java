package nil;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import neg.q;
import org.jetbrains.annotations.NotNull;
import pel.g;
import pel.i;
import pel.j;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xi0.b f216285c;
    public static final BigDecimal d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f216286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k9l.a f216287b;

    static {
        xi0.b.Companion.getClass();
        f216285c = xi0.b.i;
        d = new BigDecimal("1000");
    }

    public e(b fixedAmountSuggestionValuesResolver, k9l.a ratesInteractor) {
        Intrinsics.checkNotNullParameter(fixedAmountSuggestionValuesResolver, "fixedAmountSuggestionValuesResolver");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f216286a = fixedAmountSuggestionValuesResolver;
        this.f216287b = ratesInteractor;
    }

    public static final BigDecimal a(List list, xi0.b bVar, xi0.b bVar2) {
        Object next;
        BigDecimal bigDecimalValueOf;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            n9l.a aVar = (n9l.a) next;
            if (Intrinsics.f(aVar.f213661a, bVar) && Intrinsics.f(aVar.f213662b, bVar2)) {
                break;
            }
        }
        n9l.a aVar2 = (n9l.a) next;
        if (aVar2 != null && (bigDecimalValueOf = BigDecimal.valueOf(aVar2.f213663c)) != null) {
            return bigDecimalValueOf;
        }
        throw new IllegalStateException(("Rate not found (from: " + bVar.f306286a + ", to: " + bVar2.f306286a + ")").toString());
    }

    public final Flow b(j request) {
        Flow flowI;
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof g) {
            g gVar = (g) request;
            Amount amount = gVar.f235403b;
            xi0.b bVar = amount.f104718b.f104721c;
            xi0.b bVar2 = gVar.f235402a.f104721c;
            aim.e eVarB = u.b();
            xi0.b bVar3 = f216285c;
            if (!Intrinsics.f(bVar, bVar3)) {
                eVarB.add(new Pair(bVar, bVar3));
            }
            if (!Intrinsics.f(bVar2, bVar3)) {
                eVarB.add(new Pair(bVar3, bVar2));
            }
            aim.e eVarA = u.a(eVarB);
            flowI = nim.a.v(eVarA.isEmpty() ? zi0.c.i(new Pair(amount.f104717a, BigDecimal.ONE)) : nim.a.v(rd0.e.b(this.f216287b.a(d0.U(eVarA), false)), new q(bVar, 1, bVar2, gVar)), new nc1.j(gVar, this, 12));
        } else {
            if (!(request instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            i iVar = (i) request;
            List<BigDecimal> listK = v.k(new BigDecimal("0.1"), new BigDecimal("0.2"), new BigDecimal("0.5"));
            ArrayList arrayList = new ArrayList(w.t(listK, 10));
            for (BigDecimal bigDecimal : listK) {
                arrayList.add(new pel.e("PERCENT_SUGGESTION_" + bigDecimal, bigDecimal, iVar.f235405a));
            }
            aim.e eVarB2 = u.b();
            eVarB2.addAll(arrayList);
            eVarB2.add(new pel.a(null));
            flowI = zi0.c.i(u.a(eVarB2));
        }
        return vkm.q.q(flowI);
    }
}
