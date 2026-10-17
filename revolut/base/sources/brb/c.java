package brb;

import gim.i;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f17977w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = eVar;
        this.f17977w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, this.f17977w, continuation, 0);
            default:
                return new c(this.v, this.f17977w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        String str = this.f17977w;
        e eVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar = eVar.f17981a;
                Iterable iterableA = e.a(eVar, cVar);
                if (iterableA == null) {
                    iterableA = h0.f322473a;
                }
                Set setH1 = d0.h1(iterableA);
                if (setH1.remove(str)) {
                    e.b(eVar, cVar, setH1);
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar2 = eVar.f17981a;
                Iterable iterableA2 = e.a(eVar, cVar2);
                if (iterableA2 == null) {
                    iterableA2 = h0.f322473a;
                }
                Set setH12 = d0.h1(iterableA2);
                if (setH12.add(str)) {
                    e.b(eVar, cVar2, setH12);
                }
                break;
        }
        return Unit.f186387a;
    }
}
