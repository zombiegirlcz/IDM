package l5i;

import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature_market_data_api.models.OrderQuoteParamsVariant;
import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.Screen;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d9.e1;
import efm.d0;
import efm.r;
import g3e.s;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends pri.c implements p4i.f {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f192277h;
    public final tga.k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m5i.a f192278j;
    public final o5i.c k;

    public f(q mapperProvider, tga.k entryPointItemProvider, m5i.a entryPointTypeResolver, o5i.c presentationModel) {
        Intrinsics.checkNotNullParameter(mapperProvider, "mapperProvider");
        Intrinsics.checkNotNullParameter(entryPointItemProvider, "entryPointItemProvider");
        Intrinsics.checkNotNullParameter(entryPointTypeResolver, "entryPointTypeResolver");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        this.f192277h = mapperProvider;
        this.i = entryPointItemProvider;
        this.f192278j = entryPointTypeResolver;
        this.k = presentationModel;
    }

    public static aim.e N(List list, qv0.i iVar, qv0.i iVar2) {
        aim.e eVarB = u.b();
        yp0.b.k(list, 0, 0, 0, 0, 31);
        eVarB.addAll(list);
        if (iVar != null) {
            yp0.b.l(iVar, 0, 0, 0, 0, null, false, 63);
            eVarB.add(iVar);
        }
        if (iVar2 != null && !eVarB.isEmpty()) {
            int iJ = v.j(eVarB);
            qv0.n nVar = (qv0.n) eVarB.get(v.j(eVarB));
            yp0.b.c(nVar, R$attr.uikit_dp0);
            eVarB.set(iJ, nVar);
            qv0.i iVar3 = iVar2;
            int i = R$attr.uikit_dp0;
            yp0.b.r(iVar3, i, i, 0, 0, 12);
            eVarB.add(iVar3);
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.b(R$attr.uikit_dp24, eVarA);
        return eVarA;
    }

    public static z O(OrderQuote orderQuote, List list) {
        Object next;
        String str = e1.k(orderQuote).f104721c.f306286a;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(str, ((nel.n) next).f214596b)) {
                break;
            }
        }
        nel.n nVar = (nel.n) next;
        if (nVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("No instrument found for base asset ", str));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        if (nVar != null) {
            return nVar.f214597c;
        }
        return null;
    }

    @Override // p4i.f
    public final r E(Screen screen) {
        Screen.TransactionBreakdown screen2 = (Screen.TransactionBreakdown) screen;
        Intrinsics.checkNotNullParameter(screen2, "screen");
        h hVarD = this.f192277h.d(screen2.f97142c);
        OrderQuoteParamsVariant orderQuoteParamsVariant = screen2.f97141b;
        o5i.c cVar = this.k;
        r rVarStartWith = cVar.a(orderQuoteParamsVariant).startWith(new Data(screen2.f97140a, null, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        r rVarE = m70.a.e(rVarStartWith, new s(26), new e(this, 0));
        d0 d0VarF = cVar.f222443c.f(false);
        o5i.b bVar = o5i.b.f;
        ufm.i iVar = new ufm.i(d0VarF, new o0.a(9), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        r rVarX = iVar.x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        c4i.a aVar = screen2.f97142c;
        r rVarE2 = (aVar == c4i.a.TRADING_ORDER || aVar == c4i.a.TRADING_FUND_ORDER) ? m70.a.e(ybl.b.c(cVar.e), new s(26), new e(this, 1)) : null;
        if (rVarE2 == null) {
            rVarE2 = r.just(f0.f322471a);
            Intrinsics.checkNotNullExpressionValue(rVarE2, "just(...)");
        }
        r rVarFlatMap = w.m(rVarE, rVarX, rVarE2).flatMap(new b(2, new ja3.d(screen2, hVarD, screen2, this, 14)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "run(...)");
        return rVarFlatMap;
    }
}
