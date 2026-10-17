package xqg;

import ccb.l;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f308170w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ yki.l f308171x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, e eVar, yki.l lVar2, Continuation continuation) {
        super(2, continuation);
        this.v = lVar;
        this.f308170w = eVar;
        this.f308171x = lVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f308170w, this.f308171x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            l lVar = this.v;
            if (!(lVar instanceof ccb.o)) {
                throw new NoWhenBranchMatchedException();
            }
            l.a aVar2 = ((ccb.o) lVar).f23009a;
            this.u = 1;
            if (e.I2(this.f308170w, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        Unit unit = Unit.f186387a;
        h.D2(this.f308171x);
        return Unit.f186387a;
    }
}
