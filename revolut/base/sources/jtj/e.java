package jtj;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import wim.z;
import yhm.o;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f178514w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(k kVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = kVar;
        this.f178514w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, this.f178514w, continuation, 0);
            default:
                return new e(this.v, this.f178514w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        String str = this.f178514w;
        k kVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar = kVar.f178518a;
                Iterable iterable = (List) p.a.j(String.class, KTypeProjection.INSTANCE, List.class, cVar, "DISMISSED_EXECUTIONS_ACTIONS");
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                cVar.G(d0.A0(iterable, str), "DISMISSED_EXECUTIONS_ACTIONS", z.d(o0.c(List.class, KTypeProjection.Companion.a(o0.b(String.class)))));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar2 = kVar.f178518a;
                Collection collection = (List) p.a.j(String.class, KTypeProjection.INSTANCE, List.class, cVar2, "DISMISSED_EXECUTIONS_ACTIONS");
                if (collection == null) {
                    collection = f0.f322471a;
                }
                cVar2.G(d0.F0(str, collection), "DISMISSED_EXECUTIONS_ACTIONS", z.d(o0.c(List.class, KTypeProjection.Companion.a(o0.b(String.class)))));
                break;
        }
        return Unit.f186387a;
    }
}
