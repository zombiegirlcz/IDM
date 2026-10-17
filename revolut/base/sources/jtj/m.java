package jtj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.v, continuation, 0);
            default:
                return new m(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        n nVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List listB = nVar.f178521a.b();
                ArrayList arrayList = new ArrayList(w.t(listB, 10));
                Iterator it8 = listB.iterator();
                while (it8.hasNext()) {
                    arrayList.add(zsj.b.a((ysj.g) it8.next()));
                }
                return arrayList;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List listB2 = nVar.f178521a.b();
                ArrayList arrayList2 = new ArrayList(w.t(listB2, 10));
                Iterator it9 = listB2.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(zsj.b.a((ysj.g) it9.next()));
                }
                return arrayList2;
        }
    }
}
