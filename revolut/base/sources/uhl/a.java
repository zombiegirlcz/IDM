package uhl;

import com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.trading_events.TradingEventsService;
import efm.r;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import ueg.p0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f280269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f280270c;

    public /* synthetic */ a(e eVar, Set set, int i) {
        this.f280268a = i;
        this.f280269b = eVar;
        this.f280270c = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Instant instant;
        switch (this.f280268a) {
            case 0:
                d plan = (d) obj2;
                Intrinsics.checkNotNullParameter(plan, "plan");
                e eVar = this.f280269b;
                eVar.getClass();
                ihm.b bVar = new ihm.b();
                Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
                r rVarStartWith = bVar.startWith(plan.f280273a);
                Set set = this.f280270c;
                efm.b bVarIgnoreElements = rVarStartWith.flatMap(new b(new a(eVar, set, 1), 1)).doOnNext(new b(new sc7.b(eVar, plan, set, bVar, 9), 2)).ignoreElements();
                Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                return bVarIgnoreElements.l(new r2d.e(plan, 14, eVar, set));
            default:
                i cursor = (i) obj2;
                Intrinsics.checkNotNullParameter(cursor, "cursor");
                TradingEventsService tradingEventsService = this.f280269b.f280276b;
                ZonedDateTime zonedDateTime = (ZonedDateTime) cursor.f224257a;
                return tradingEventsService.getEvents(this.f280270c, 200, (zonedDateTime == null || (instant = zonedDateTime.toInstant()) == null) ? null : Long.valueOf(instant.toEpochMilli())).x().map(new ubj.c(29, new p0(15)));
        }
    }
}
