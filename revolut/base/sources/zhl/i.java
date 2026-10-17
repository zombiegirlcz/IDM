package zhl;

import efm.r;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import te0.w;
import ueg.p0;
import ymk.u;
import zhm.a1;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f322446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f322447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nel.n f322448c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ vgl.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eel.c f322449g;

    public i(boolean z, k kVar, nel.n nVar, boolean z3, Function1 function1, vgl.a aVar, eel.c cVar) {
        this.f322446a = z;
        this.f322447b = kVar;
        this.f322448c = nVar;
        this.d = z3;
        this.e = function1;
        this.f = aVar;
        this.f322449g = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Flow gVar;
        Flow gVar2;
        eel.e history = (eel.e) obj2;
        Intrinsics.checkNotNullParameter(history, "history");
        boolean z = this.f322446a;
        nel.n nVar = this.f322448c;
        k kVar = this.f322447b;
        if (z) {
            String ref2 = nVar.f214596b;
            yhl.h hVar = kVar.f322453c;
            Pair period = new Pair(ZonedDateTime.ofInstant(Instant.ofEpochMilli(history.f125228b), ZoneId.systemDefault()), ZonedDateTime.ofInstant(Instant.ofEpochMilli(history.f125229c), ZoneId.systemDefault()));
            hVar.getClass();
            Intrinsics.checkNotNullParameter(period, "period");
            Intrinsics.checkNotNullParameter(ref2, "ref");
            Intrinsics.checkNotNullParameter(period, "period");
            uhl.e eVar = hVar.f314180a;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(period, "period");
            r map = r.fromCallable(new s2i.i(eVar, 10)).flatMap(new ubj.c(26, new u69.g(eVar, period, 29))).distinctUntilChanged().map(new ubj.c(27, new p0(13)));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            gVar = mo3.a.g(rd0.e.b(nim.a.w(w.f0(map), new y9d.c(ref2, 10))), new z8d.h(22), null, 2);
        } else {
            gVar = new go.g(f0.f322471a, 2);
        }
        String str = nVar.f214596b;
        Instant instantOfEpochMilli = Instant.ofEpochMilli(history.f125228b);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        LocalDate localDateW = oi0.d.W(instantOfEpochMilli);
        Instant instantOfEpochMilli2 = Instant.ofEpochMilli(history.f125229c);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(...)");
        LocalDate localDatePlusDays = oi0.d.W(instantOfEpochMilli2).plusDays(1L);
        boolean z3 = Math.abs(localDateW.getYear() - localDatePlusDays.getYear()) > 3;
        if (!this.d || z3) {
            gVar2 = new go.g(f0.f322471a, 2);
        } else {
            yhl.d dVar = kVar.f322452b;
            gVar2 = new u(rd0.e.b(yhl.d.c(dVar, str, localDateW, localDatePlusDays, false, a1.j(a1.j(dVar.a(), iel.e.MARKET_HOLIDAY), iel.e.EX_DIVIDEND), null, null, null, 256)), this.e, 8);
        }
        return new acb.i(yh5.b.d(gVar, gVar2), kVar, history, this.f, this.f322449g, 8);
    }
}
