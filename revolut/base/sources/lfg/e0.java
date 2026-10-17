package lfg;

import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yfg.p;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 extends gim.i implements Function2 {
    public hlm.c u;
    public g0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hfg.h0 f194874w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f194875x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g0 f194876y;
    public final /* synthetic */ hfg.h0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, hfg.h0 h0Var, Continuation continuation) {
        super(2, continuation);
        this.f194876y = g0Var;
        this.z = h0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e0(this.f194876y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        g0 g0Var;
        hlm.c cVar;
        hfg.h0 h0Var;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f194875x;
        if (i == 0) {
            yhm.o.b(obj2);
            g0Var = this.f194876y;
            hlm.c cVar2 = g0Var.f;
            this.u = cVar2;
            this.v = g0Var;
            hfg.h0 h0Var2 = this.z;
            this.f194874w = h0Var2;
            this.f194875x = 1;
            if (cVar2.lock(null, this) == aVar) {
                return aVar;
            }
            cVar = cVar2;
            h0Var = h0Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = this.f194874w;
            g0Var = this.v;
            cVar = this.u;
            yhm.o.b(obj2);
        }
        try {
            ue0.c cVar3 = g0Var.d;
            g0.Companion.getClass();
            Type type = g0.f194884p;
            yfg.p pVar = (yfg.p) cVar3.T2("PREFILLED_LOCATIONS_STORAGE_KEY", type);
            Intrinsics.checkNotNullParameter(h0Var, "<this>");
            TravelMilesSearchLocation travelMilesSearchLocation = h0Var.f151845a;
            p.a aVarB = travelMilesSearchLocation != null ? kfg.e.b(travelMilesSearchLocation) : null;
            TravelMilesSearchLocation travelMilesSearchLocation2 = h0Var.f151846b;
            yfg.p pVar2 = new yfg.p(aVarB, travelMilesSearchLocation2 != null ? kfg.e.b(travelMilesSearchLocation2) : null);
            if (pVar != null) {
                p.a origin = pVar2.getOrigin();
                if (origin == null) {
                    origin = pVar.getOrigin();
                }
                p.a destination = pVar2.getDestination();
                if (destination == null) {
                    destination = pVar.getDestination();
                }
                pVar2 = new yfg.p(origin, destination);
            }
            g0Var.d.G(pVar2, "PREFILLED_LOCATIONS_STORAGE_KEY", type);
            Unit unit = Unit.f186387a;
            cVar.unlock(null);
            return Unit.f186387a;
        } catch (Throwable th10) {
            cVar.unlock(null);
            throw th10;
        }
    }
}
