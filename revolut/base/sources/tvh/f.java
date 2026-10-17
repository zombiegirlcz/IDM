package tvh;

import abf.n;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import gim.i;
import ida.c;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.q0;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends i implements Function2 {
    public int u;
    public final /* synthetic */ ida.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f274773w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ida.c cVar, g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f274773w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.v, this.f274773w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        Object objA;
        g gVar = this.f274773w;
        int i = gVar.f274776r;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i2 = this.u;
        if (i2 == 0) {
            o.b(obj2);
            ida.c cVar = this.v;
            if (cVar instanceof c.a) {
                str = "PocketsSummary";
            } else {
                if (!(cVar instanceof ida.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((ida.d) cVar).f160458a.f163163a.f163145a;
            }
            kq.h hVar = gVar.f274775q;
            Map mapX = a0.d.x("pocketId", str);
            this.u = 1;
            if (!hVar.f() || (objA = hVar.a(new n(mapX, i, 17), this)) != aVar) {
                objA = Unit.f186387a;
            }
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return gVar.C1(new BridgeDestination(new FinishCommand(new Integer(-1), q0.c(new Pair("appWidgetId", new Integer(i))), null, 4)));
    }
}
