package tl7;

import gim.i;
import ip0.kx;
import ip0.vd;
import java.time.LocalDate;
import java.time.LocalTime;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f272008w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f272008w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f272008w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f272008w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            case 2:
                e eVar3 = new e(this.f272008w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
            default:
                e eVar4 = new e(this.f272008w, continuation, 3);
                eVar4.v = obj2;
                return eVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((kx) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        f fVar = this.f272008w;
        switch (i) {
            case 0:
                vd vdVar = (vd) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j60.a.v(fVar.f272009c, false, null, 3);
                fVar.f272017q.invoke(vdVar.f166807b);
                break;
            case 1:
                kx kxVar = (kx) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j60.a.v(fVar.f272009c, false, null, 3);
                LocalDate localDateAtDay = kxVar.f165093b.atDay(1);
                Function1 function1 = fVar.f272017q;
                Intrinsics.h(localDateAtDay);
                function1.invoke(localDateAtDay);
                break;
            case 2:
                Pair pair = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                fVar.f272013l = (LocalTime) pair.f186386b;
                break;
            default:
                ty0.a aVar4 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Function1 function12 = fVar.o;
                Intrinsics.h(aVar4);
                function12.invoke(aVar4);
                break;
        }
        return Unit.f186387a;
    }
}
