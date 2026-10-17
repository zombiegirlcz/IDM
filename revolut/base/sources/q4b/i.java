package q4b;

import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import com.revolut.feature.retail.cfd.impl.screens.order.utils.CfdOpenPositionsDelegate$OpenPositions;
import d9.t0;
import java.math.BigDecimal;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f242127b;

    public /* synthetic */ i(j jVar, int i) {
        this.f242126a = i;
        this.f242127b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f242126a) {
            case 0:
                MarginQuote marginQuote = (MarginQuote) obj2;
                Intrinsics.checkNotNullParameter(marginQuote, "marginQuote");
                ej0.b bVar = marginQuote.f82115j;
                g gVar = this.f242127b.f242128p;
                dj0.d dVarD = t0.D(bVar, gVar.f242123a);
                dj0.d dVarD2 = t0.D(marginQuote.i, gVar.f242123a);
                ej0.b bVar2 = marginQuote.k;
                BigDecimal bigDecimalDivide = bVar2.f126703a.divide(new BigDecimal(2));
                Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                return new d(dVarD, dVarD2, t0.D(ej0.b.b(bVar2, bigDecimalDivide, null, 2), gVar.f242123a));
            default:
                CfdOpenPositionsDelegate$OpenPositions positions = (CfdOpenPositionsDelegate$OpenPositions) obj2;
                Intrinsics.checkNotNullParameter(positions, "positions");
                j jVar = this.f242127b;
                t2b.f fVar = jVar.f242129q;
                f8l.e eVar = f8l.e.MARKET;
                g gVar2 = jVar.f242128p;
                return nim.a.v(fVar.a(eVar, gVar2.d, gVar2.f242123a, gVar2.f242125c, positions.f82237a, positions.f82238b, gVar2.f242124b, null), new i(jVar, 0));
        }
    }
}
