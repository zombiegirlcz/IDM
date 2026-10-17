package p2b;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import skm.p0;
import vkm.c2;
import vkm.d2;
import vkm.q;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1b.a f232203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f232204b;

    public j(y1b.a cfdInteractor) {
        Intrinsics.checkNotNullParameter(cfdInteractor, "cfdInteractor");
        this.f232203a = cfdInteractor;
        this.f232204b = new ConcurrentHashMap();
    }

    public static /* synthetic */ Flow b(j jVar, String str, xi0.b bVar, int i) {
        if ((i & 2) != 0) {
            bVar = null;
        }
        return jVar.a(str, bVar, n9l.b.SEC_3);
    }

    public final Flow a(String portfolioId, xi0.b bVar, n9l.b ratesUpdatePeriod) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(ratesUpdatePeriod, "ratesUpdatePeriod");
        String str = portfolioId + "_" + (bVar != null ? bVar.f306286a : null) + "_" + ratesUpdatePeriod;
        ConcurrentHashMap concurrentHashMap = this.f232204b;
        Object objM = concurrentHashMap.get(str);
        if (objM == null) {
            objM = q.M(((b) this.f232203a).d(portfolioId, bVar, ratesUpdatePeriod), rd0.e.a(p0.f264003c), c2.a(d2.Companion, 0L, 3), 1);
            concurrentHashMap.putIfAbsent(str, objM);
        }
        return (Flow) objM;
    }
}
