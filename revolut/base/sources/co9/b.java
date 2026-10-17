package co9;

import a83.d0;
import com.revolut.data.model.Data;
import elm.f;
import gim.i;
import go.g;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rd0.d;
import skm.e0;
import skm.p0;
import w4l.h;
import y65.l;
import yn9.c;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f25498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f25499b;

    public b(c paymentCounterpartyRepository, a paymentCounterpartyFeatureChecker) {
        Intrinsics.checkNotNullParameter(paymentCounterpartyRepository, "paymentCounterpartyRepository");
        Intrinsics.checkNotNullParameter(paymentCounterpartyFeatureChecker, "paymentCounterpartyFeatureChecker");
        this.f25498a = paymentCounterpartyRepository;
        this.f25499b = paymentCounterpartyFeatureChecker;
    }

    public final Object a(String str, gim.c cVar) {
        Continuation continuation = null;
        if (this.f25499b.a()) {
            c cVar2 = this.f25498a;
            cVar2.getClass();
            l lVar = new l(cVar2, str, continuation, 11);
            p0 p0Var = p0.f264001a;
            return e0.J(f.f127540b, lVar, cVar);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("paymentCounterparty is disabled, can't getCounterparty");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return null;
    }

    public final Flow b() {
        if (!this.f25499b.a()) {
            return zi0.c.i(f0.f322471a);
        }
        c cVar = this.f25498a;
        cVar.getClass();
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(nim.a.y(cVar.d.b(Unit.f186387a, loadingStrategy), new cmc.c(21)), new cmc.c(22));
    }

    public final Flow c(String str, Set set) {
        Flow flowB = b();
        if (!set.isEmpty()) {
            flowB = nim.a.v(flowB, new d0(11, set));
        }
        return (str == null || kotlin.text.d0.W(str)) ? flowB : nim.a.v(flowB, new c86.c(str, 10));
    }

    public final Flow d(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        if (this.f25499b.a()) {
            c cVar = this.f25498a;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            return nim.a.v(cVar.d.b(Unit.f186387a, h.f294642c), new y9d.c(id10, 12));
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("paymentCounterparty is disabled, can't observe counterparty");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return new g(new Data(null, illegalArgumentException, false, 5, null), 2);
    }

    public final Object e(i iVar) {
        if (!this.f25499b.a()) {
            return Unit.f186387a;
        }
        x4l.c cVar = this.f25498a.d;
        Unit unit = Unit.f186387a;
        Object objD = cVar.d(unit, true, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = unit;
        }
        return objD == aVar ? objD : unit;
    }

    public final Object f(String str, String str2, i iVar) throws Throwable {
        if (!this.f25499b.a()) {
            return Unit.f186387a;
        }
        c cVar = this.f25498a;
        cVar.getClass();
        wh3.h hVar = new wh3.h(str2, cVar, str, (Continuation) null, 26);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(f.f127540b, hVar, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
