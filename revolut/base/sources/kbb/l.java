package kbb;

import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f182561w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, Continuation continuation) {
        super(2, continuation);
        this.f182561w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.f182561w, continuation);
        lVar.v = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = (FlowCollector) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            List listD1 = d0.d1(v.k(ibb.c.f160140a, ibb.c.f, ibb.c.f160141b, ibb.c.f160142c, ibb.c.d, ibb.c.e));
            ArrayList arrayList = new ArrayList(w.t(listD1, 10));
            Iterator it8 = listD1.iterator();
            while (it8.hasNext()) {
                arrayList.add(o.a(this.f182561w, (MainScreenTab) it8.next(), false, u19.b.LIFESTYLE));
            }
            this.v = null;
            this.u = 1;
            if (flowCollector.emit(arrayList, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
