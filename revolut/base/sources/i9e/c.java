package i9e;

import efm.d0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ppk.f f159667a;

    public c(ppk.f ratesInteractor) {
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f159667a = ratesInteractor;
    }

    public final ufm.i a(ArrayList moneyList, xi0.b baseCurrency) {
        Intrinsics.checkNotNullParameter(moneyList, "moneyList");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        d0 list = efm.r.fromIterable(moneyList).distinct(new i52.j(12, new i6j.p(20))).filter(new i52.j(13, new i5f.g(1, baseCurrency))).map(new i52.j(9, new i5f.g(2, baseCurrency))).toList();
        Intrinsics.checkNotNullExpressionValue(list, "toList(...)");
        i52.j jVar = new i52.j(10, new a(this, 0));
        list.getClass();
        ufm.i iVar = new ufm.i(new ufm.i(list, jVar, 0), new i52.j(11, new b(this, moneyList, baseCurrency, 0)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
