package exe;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dj0.d f130391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi0.b f130392c;

    public /* synthetic */ c(dj0.d dVar, xi0.b bVar) {
        this.f130390a = 3;
        this.f130392c = bVar;
        this.f130391b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        dj0.d dVar;
        Object next;
        dj0.d dVar2;
        xi0.b bVar;
        Object next2;
        switch (this.f130390a) {
            case 0:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new dj0.d((long) (this.f130391b.f115082a * ((n9l.a) d0.b0(it8)).f213663c), this.f130392c);
            case 1:
                Double exchangeRate = (Double) obj2;
                Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
                dj0.d dVar3 = this.f130391b;
                long j2 = dVar3.f115082a;
                float fK = cp5.d.k(dVar3.f115083b);
                return new dj0.d((long) ((j2 / exchangeRate.doubleValue()) * ((double) (cp5.d.k(r3) / fK))), this.f130392c);
            case 2:
                List exchangeRates = (List) obj2;
                Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                Iterator it9 = exchangeRates.iterator();
                while (true) {
                    boolean zHasNext = it9.hasNext();
                    dVar = this.f130391b;
                    if (zHasNext) {
                        next = it9.next();
                        n9l.a aVar = (n9l.a) next;
                        if (!Intrinsics.f(aVar.f213661a, dVar.f115083b) || !Intrinsics.f(aVar.f213662b, this.f130392c)) {
                        }
                    } else {
                        next = null;
                    }
                }
                n9l.a aVar2 = (n9l.a) next;
                dj0.d dVarK = aVar2 != null ? pyd.c.K(dVar, aVar2.f213663c, aVar2.f213662b) : null;
                od0.h hVar = od0.i.Companion;
                o27.i iVar = dVarK != null ? new o27.i(dVarK) : null;
                hVar.getClass();
                return od0.h.a(iVar);
            case 3:
                se1.d updateState = (se1.d) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                updateState.f262080a.getClass();
                xi0.b currency = this.f130392c;
                Intrinsics.checkNotNullParameter(currency, "currency");
                dj0.d dVar4 = new dj0.d(0L, currency);
                m70.a.c(t0.f186434a);
                return se1.d.a(updateState, dVar4, "", false, this.f130391b, null, 4);
            default:
                Iterator it10 = ((List) obj2).iterator();
                while (true) {
                    boolean zHasNext2 = it10.hasNext();
                    dVar2 = this.f130391b;
                    bVar = this.f130392c;
                    if (zHasNext2) {
                        next2 = it10.next();
                        n9l.a aVar3 = (n9l.a) next2;
                        if (!Intrinsics.f(aVar3.f213661a, dVar2.f115083b) || !Intrinsics.f(aVar3.f213662b, bVar)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                n9l.a aVar4 = (n9l.a) next2;
                if (aVar4 != null) {
                    return pyd.c.K(dVar2, aVar4.f213663c, aVar4.f213662b);
                }
                throw new IllegalStateException(("Rate not found (from: " + dVar2.f115083b.f306286a + ", to: " + bVar.f306286a + ")").toString());
        }
    }

    public /* synthetic */ c(dj0.d dVar, xi0.b bVar, int i) {
        this.f130390a = i;
        this.f130391b = dVar;
        this.f130392c = bVar;
    }
}
