package yw9;

import ew9.c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import yhm.m;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ w v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f317378w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, CoroutineScope coroutineScope, Continuation continuation) {
        super(1, continuation);
        this.v = wVar;
        this.f317378w = coroutineScope;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new t(this.v, this.f317378w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((t) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        iw9.c cVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        w wVar = this.v;
        try {
        } catch (Throwable th10) {
            m.Companion companion = yhm.m.INSTANCE;
            yhm.o.a(th10);
        }
        if (i == 0) {
            yhm.o.b(obj2);
            iw9.b bVar = ((e) ((j2) wVar.f317387t.f22677a).getValue()).d;
            if (bVar != null && (cVar = (iw9.c) d0.d0(bVar.f168999a)) != null) {
                m.Companion companion2 = yhm.m.INSTANCE;
                cpg.a aVar2 = wVar.f317386s;
                String str = cVar.f169000a;
                this.u = 1;
                if (aVar2.d(str, this) == aVar) {
                    return aVar;
                }
            }
            wVar.C2(c.a.b.f130115a);
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yhm.o.b(obj2);
        Unit unit = Unit.f186387a;
        m.Companion companion3 = yhm.m.INSTANCE;
        wVar.C2(c.a.b.f130115a);
        return Unit.f186387a;
    }
}
