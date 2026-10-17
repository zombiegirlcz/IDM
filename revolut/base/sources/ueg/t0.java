package ueg;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class t0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b f279420w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(int i, com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f279420w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t0(0, this.f279420w, continuation);
            case 1:
                return new t0(1, this.f279420w, continuation);
            case 2:
                return new t0(2, this.f279420w, continuation);
            default:
                return new t0(3, this.f279420w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar = this.f279420w;
                    d dVar = bVar.f94060p;
                    ihm.f events = bVar.I;
                    e eVar = (e) dVar;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(events, "events");
                    efm.b bVarSwitchMapCompletable = eVar.f279381a.h().distinctUntilChanged().mergeWith(eVar.e).takeUntil(eVar.f).switchMapCompletable(new ubj.c(16, new u69.g(eVar, events, 19)));
                    Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
                    this.v = 1;
                    if (nim.a.a(bVarSwitchMapCompletable, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    fag.t0 t0Var = this.f279420w.C.f159804a;
                    pfm.h hVar = new pfm.h(new fag.n0(t0Var, wp5.y.u(t0Var.o, "toString(...)"), 2), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                    pfm.a aVarV = ue0.e.v(hVar);
                    this.v = 1;
                    if (nim.a.a(aVarV, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                efm.d0 d0VarS1 = lg0.b.s1(this.f279420w.H, "revolut://app/faq?key=f74ea88b-2189-43c6-97b0-609df6481e0b", null, null, 6);
                this.v = 1;
                Object objB = nim.a.b(d0VarS1, this);
                return objB == aVar3 ? aVar3 : objB;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar2 = this.f279420w;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarFirstOrError = bVar2.f94063s.g().firstOrError();
                    Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                    this.v = 1;
                    obj2 = nim.a.b(d0VarFirstOrError, this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                List list = (List) obj2;
                Intrinsics.h(list);
                bVar2.C2(new a0(list));
                return Unit.f186387a;
        }
    }
}
