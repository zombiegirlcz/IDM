package ij9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f161744w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f161744w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f161744w, continuation, 0);
            case 1:
                return new e(this.f161744w, continuation, 1);
            default:
                return new e(this.f161744w, continuation, 2);
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
                i iVar = this.f161744w;
                d dVar = new d(iVar, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(iVar.e, "navigateToPayLaterCard", dVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                i iVar2 = this.f161744w;
                g gVar = new g(iVar2, null, 0);
                this.v = 1;
                Object objB2 = pu7.a.B(iVar2.e, "showHowPayLaterModeWorksDialog", gVar, this);
                return objB2 == aVar2 ? aVar2 : objB2;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                i iVar3 = this.f161744w;
                g gVar2 = new g(iVar3, null, 1);
                this.v = 1;
                Object objB3 = pu7.a.B(iVar3.e, "toggle_pay_later_mode", gVar2, this);
                return objB3 == aVar3 ? aVar3 : objB3;
        }
    }
}
