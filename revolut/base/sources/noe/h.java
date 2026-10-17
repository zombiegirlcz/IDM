package noe;

import com.revolut.data.model.Data;
import efm.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f218013w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(k kVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f218013w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f218013w, continuation, 0);
            case 1:
                return new h(this.f218013w, continuation, 1);
            case 2:
                return new h(this.f218013w, continuation, 2);
            default:
                return new h(this.f218013w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    k kVar = this.f218013w;
                    if (!i2b.a.k(((b) kVar.t2()).f218005c)) {
                        return ((b) kVar.t2()).f218005c;
                    }
                    r rVarDoOnNext = ((joe.o) ((hoe.a) kVar.f218018q).f154277a).f176942g.f(Unit.f186387a, true).doOnNext(new njf.c(new g(kVar, 0), 16));
                    Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
                    r rVarN = mo3.a.n(rVarDoOnNext);
                    this.v = 1;
                    obj2 = nim.a.f(rVarN, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return (Data) obj2;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    k kVar2 = this.f218013w;
                    if (!kVar2.f218017p.f90101c) {
                        return null;
                    }
                    if (!i2b.a.k(((b) kVar2.t2()).d)) {
                        return ((b) kVar2.t2()).d;
                    }
                    r rVarDoOnNext2 = ((joe.o) ((hoe.a) kVar2.f218018q).f154277a).e.f(Unit.f186387a, true).doOnNext(new njf.c(new g(kVar2, 1), 17));
                    Intrinsics.checkNotNullExpressionValue(rVarDoOnNext2, "doOnNext(...)");
                    r rVarN2 = mo3.a.n(rVarDoOnNext2);
                    this.v = 1;
                    obj2 = nim.a.f(rVarN2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return (Data) obj2;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    k kVar3 = this.f218013w;
                    if (!i2b.a.k(((b) kVar3.t2()).f218003a)) {
                        return ((b) kVar3.t2()).f218003a;
                    }
                    r rVarDoOnNext3 = nim.a.w(((joe.o) ((hoe.a) kVar3.f218018q).f154277a).d.f(Unit.f186387a, true), new hmc.a(24)).doOnNext(new njf.c(new g(kVar3, 2), 18));
                    Intrinsics.checkNotNullExpressionValue(rVarDoOnNext3, "doOnNext(...)");
                    r rVarN3 = mo3.a.n(rVarDoOnNext3);
                    this.v = 1;
                    obj2 = nim.a.f(rVarN3, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return (Data) obj2;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    k kVar4 = this.f218013w;
                    if (!i2b.a.k(((b) kVar4.t2()).f218004b)) {
                        return ((b) kVar4.t2()).f218004b;
                    }
                    r rVarDoOnNext4 = nim.a.w(kVar4.f218019r.k(false), i.f).doOnNext(new njf.c(new g(kVar4, 3), 19));
                    Intrinsics.checkNotNullExpressionValue(rVarDoOnNext4, "doOnNext(...)");
                    r rVarN4 = mo3.a.n(rVarDoOnNext4);
                    this.v = 1;
                    obj2 = nim.a.f(rVarN4, this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return (Data) obj2;
        }
    }
}
