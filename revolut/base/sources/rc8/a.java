package rc8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nj8.n;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f253213w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f253214x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(e eVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f253213w = eVar;
        this.f253214x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f253213w, this.f253214x, continuation, 0);
            case 1:
                return new a(this.f253213w, this.f253214x, continuation, 1);
            default:
                return new a(this.f253213w, this.f253214x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    hj8.a aVar2 = this.f253213w.o;
                    this.v = 1;
                    if (((n) aVar2).g(this.f253214x, w4l.h.f294642c, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                e eVar = this.f253213w;
                b bVar = new b(eVar, this.f253214x, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(eVar.e, "ACCOUNT_CLOSE_TASK", bVar, this);
                return objB == aVar3 ? aVar3 : objB;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    e eVar2 = this.f253213w;
                    b bVar2 = new b(eVar2, this.f253214x, null, 1);
                    this.v = 1;
                    if (eVar2.Y2(this, bVar2) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
