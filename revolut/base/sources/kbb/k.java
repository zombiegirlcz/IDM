package kbb;

import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ o v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((u19.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        u19.b bVar = (u19.b) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        aim.e eVarB = u.b();
        eVarB.add(ibb.c.f160140a);
        eVarB.add(ibb.c.f160142c);
        if (bVar != u19.b.NOT_AVAILABLE) {
            eVarB.add(ibb.c.e);
        }
        aim.e eVarA = u.a(eVarB);
        ArrayList arrayList = new ArrayList(w.t(eVarA, 10));
        ListIterator listIterator = eVarA.listIterator(0);
        while (true) {
            aim.b bVar2 = (aim.b) listIterator;
            if (!bVar2.hasNext()) {
                return new go.g(arrayList, 2);
            }
            arrayList.add(o.a(this.v, (MainScreenTab) bVar2.next(), false, bVar));
        }
    }
}
