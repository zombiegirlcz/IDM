package u1k;

import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import u80.o;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f276432a;

    public k(o moneyPrefixFormatter, w80.b moneyEditAmountFormatter) {
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(moneyEditAmountFormatter, "moneyEditAmountFormatter");
        this.f276432a = moneyEditAmountFormatter;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f276419a, new tyg.g(27), new tw8.g(17), new tvh.e(this, domainState, 5));
        dj0.d dVar = domainState.f276420b;
        return new h(list, dVar != null ? dVar.f(dj0.d.e) : false);
    }
}
