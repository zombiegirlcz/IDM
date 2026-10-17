package hxk;

import gxk.c;
import gxk.f;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import ybl.k;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.b f156616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f156617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fxk.a f156618c;

    public b(ybl.b instrumentTickerInteractor, k tradingAccountsInteractor, fxk.a tradingHoursInteractor) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingHoursInteractor, "tradingHoursInteractor");
        this.f156616a = instrumentTickerInteractor;
        this.f156617b = tradingAccountsInteractor;
        this.f156618c = tradingHoursInteractor;
    }

    public static final gxk.a a(b bVar, List list, f fVar) {
        Object next;
        bVar.getClass();
        n nVar = fVar.f147765a;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((o4l.b) next).f222298a, nVar.k.a())) {
                break;
            }
        }
        if (next != null) {
            return new gxk.a(fVar, new c((o4l.b) next));
        }
        throw new IllegalArgumentException(j6.a.s("Trading sessions info for ", nVar.d, " with exchange ", nVar.k.a(), " not found").toString());
    }
}
