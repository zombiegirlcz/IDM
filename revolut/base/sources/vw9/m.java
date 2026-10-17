package vw9;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import v20.c0;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.profile.impl.ui_kompot.flow.b f292665w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.payments.profile.impl.ui_kompot.flow.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f292665w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f292665w, continuation, 0);
            case 1:
                return new m(this.f292665w, continuation, 1);
            default:
                return new m(this.f292665w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    d6k.d dVar = this.f292665w.f79638q;
                    this.v = 1;
                    d6k.g gVar = (d6k.g) dVar;
                    gVar.getClass();
                    Object objY2 = gVar.Y2(this, new cpb.j(gVar, null, 5));
                    if (objY2 != aVar) {
                        objY2 = Unit.f186387a;
                    }
                    if (objY2 == aVar) {
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
                    ex1.a aVar3 = this.f292665w.f79641t;
                    this.v = 1;
                    if (((uz1.b) aVar3).Z2(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.payments.profile.impl.ui_kompot.flow.b bVar = this.f292665w;
                    j2 j2Var = bVar.u.d;
                    c0 c0Var = new c0(bVar, 2);
                    this.v = 1;
                    if (j2Var.collect(c0Var, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                throw new KotlinNothingValueException();
        }
    }
}
