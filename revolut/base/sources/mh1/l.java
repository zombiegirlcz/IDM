package mh1;

import efm.d0;
import ijj.p;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.q;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f205365w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f205365w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f205365w, continuation, 0);
            case 1:
                return new l(this.f205365w, continuation, 1);
            default:
                return new l(this.f205365w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                gr6.a aVar2 = this.f205365w.f205371c;
                this.v = 1;
                Object objC = ((et6.g) aVar2).c(w4l.j.f294644c, this);
                return objC == aVar ? aVar : objC;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    wkm.l lVarA = k38.c.a(this.f205365w.f205370b, w4l.j.f294644c, null, 2);
                    this.v = 1;
                    obj2 = q.x(lVarA, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Boolean.valueOf(obj2 != null);
            default:
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    d0 d0VarH = ((ik3.g) ((ik3.c) this.f205365w.f205369a).f161878a).f161888g.h();
                    ihd.c cVar = new ihd.c(6, new p(5));
                    d0VarH.getClass();
                    ufm.i iVar = new ufm.i(d0VarH, cVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    this.v = 1;
                    obj2 = nim.a.b(iVar, this);
                    if (obj2 != arrayList) {
                    }
                    return arrayList;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
                Iterable iterable = (Iterable) obj2;
                arrayList = new ArrayList(w.t(iterable, 10));
                Iterator it8 = iterable.iterator();
                while (it8.hasNext()) {
                    arrayList.add(new xi0.b(6, (String) it8.next(), null));
                }
                return arrayList;
        }
    }
}
