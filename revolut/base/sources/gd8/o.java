package gd8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f143095w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f143096x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ v6d.a f143097y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, String str, v6d.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f143095w = pVar;
        this.f143096x = str;
        this.f143097y = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f143095w, this.f143096x, this.f143097y, continuation, 0);
            default:
                return new o(this.f143095w, this.f143096x, this.f143097y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        p pVar = this.f143095w;
        String str = this.f143096x;
        v6d.a aVar = this.f143097y;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    efm.b bVarJ = pVar.d.j(new n(str, aVar.name()));
                    this.v = 1;
                    if (nim.a.a(bVarJ, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                xc8.a aVar3 = xc8.a.GIVEN;
                m mVar = p.Companion;
                pVar.a(str, aVar, aVar3);
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    efm.b bVarJ2 = pVar.e.j(new n(str, aVar.name()));
                    this.v = 1;
                    if (nim.a.a(bVarJ2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                xc8.a aVar5 = xc8.a.NOT_GIVEN;
                m mVar2 = p.Companion;
                pVar.a(str, aVar, aVar5);
                return Unit.f186387a;
        }
    }
}
