package gd8;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import wim.z;
import zhm.a1;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f143075w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v6d.a f143076x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, String str, v6d.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cVar;
        this.f143075w = str;
        this.f143076x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, this.f143075w, this.f143076x, continuation, 0);
            default:
                return new b(this.v, this.f143075w, this.f143076x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Boolean boolValueOf;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj3 = new Object();
                Object objPutIfAbsent = this.v.e.putIfAbsent(this.f143075w, obj3);
                if (objPutIfAbsent != null) {
                    obj3 = objPutIfAbsent;
                }
                c cVar = this.v;
                String str = this.f143075w;
                v6d.a aVar2 = this.f143076x;
                synchronized (obj3) {
                    try {
                        ue0.c cVar2 = cVar.f143078b;
                        KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                        KType kTypeB = o0.b(v6d.a.class);
                        companion.getClass();
                        Set set = (Set) cVar2.T2(str, z.d(o0.c(Set.class, KTypeProjection.Companion.a(kTypeB))));
                        if (set == null) {
                            set = h0.f322473a;
                        }
                        boolValueOf = Boolean.valueOf(set.contains(aVar2));
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                return boolValueOf;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj4 = new Object();
                Object objPutIfAbsent2 = this.v.e.putIfAbsent(this.f143075w, obj4);
                if (objPutIfAbsent2 != null) {
                    obj4 = objPutIfAbsent2;
                }
                c cVar3 = this.v;
                String str2 = this.f143075w;
                v6d.a aVar4 = this.f143076x;
                synchronized (obj4) {
                    try {
                        ue0.c cVar4 = cVar3.f143078b;
                        KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
                        KType kTypeB2 = o0.b(v6d.a.class);
                        companion2.getClass();
                        Set set2 = (Set) cVar4.T2(str2, z.d(o0.c(Set.class, KTypeProjection.Companion.a(kTypeB2))));
                        if (set2 == null) {
                            set2 = h0.f322473a;
                        }
                        cVar3.f143078b.G(a1.m(set2, aVar4), str2, z.d(o0.c(Set.class, KTypeProjection.Companion.a(o0.b(v6d.a.class)))));
                    } catch (Throwable th11) {
                        throw th11;
                    }
                }
                return Unit.f186387a;
        }
    }
}
