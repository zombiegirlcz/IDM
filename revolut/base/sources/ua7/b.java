package ua7;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tw9.h;
import wa7.m;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f278551w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f278552x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(f fVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f278551w = fVar;
        this.f278552x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f278551w, this.f278552x, continuation, 0);
            case 1:
                return new b(this.f278551w, this.f278552x, continuation, 1);
            default:
                return new b(this.f278551w, this.f278552x, continuation, 2);
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
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                f fVar = this.f278551w;
                if (i == 0) {
                    o.b(obj2);
                    m mVar = fVar.f278556l;
                    this.v = 1;
                    Object objA = mVar.a(this.f278552x, "HIDDEN_ACCOUNTS", this);
                    if (objA != aVar) {
                        objA = Unit.f186387a;
                    }
                    if (objA == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return fVar.L2(fVar.f278557m.b());
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
                String str = this.f278552x;
                f fVar2 = this.f278551w;
                c cVar = new c(fVar2, str, null);
                this.v = 1;
                Object objY2 = fVar2.Y2(this, cVar);
                return objY2 == aVar2 ? aVar2 : objY2;
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
                f fVar3 = this.f278551w;
                h hVar = new h(fVar3, this.f278552x, null, 6);
                this.v = 1;
                Object objY22 = fVar3.Y2(this, hVar);
                return objY22 == aVar3 ? aVar3 : objY22;
        }
    }
}
