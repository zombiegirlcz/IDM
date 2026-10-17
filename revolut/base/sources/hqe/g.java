package hqe;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ h v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        e eVar = obj3 instanceof e ? (e) obj3 : null;
        if (eVar == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("PocketPickerSelection is null");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            return Unit.f186387a;
        }
        io3.d dVar = eVar.f154669a;
        h hVar = this.v;
        j60.a.v(hVar.o, true, null, 2);
        d dVar2 = eVar.f154670b;
        if (dVar2 instanceof b) {
            hVar.c3(dVar);
        } else {
            if (!(dVar2 instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            hVar.d3(dVar);
        }
        return Unit.f186387a;
    }
}
