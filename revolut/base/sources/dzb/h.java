package dzb;

import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f121306w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f121307x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f121306w = iVar;
        this.f121307x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f121307x, this.f121306w, continuation);
            case 1:
                return new h(this.f121306w, this.f121307x, continuation, 1);
            default:
                return new h(this.f121306w, this.f121307x, continuation, 2);
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
                    String str = this.f121307x;
                    if (str == null) {
                        return null;
                    }
                    d0 d0VarC = ((s06.j) this.f121306w.f121308p).c(str, false, lg0.a.IGNORE);
                    this.v = 1;
                    obj2 = nim.a.b(d0VarC, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return (Boolean) obj2;
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
                d0 d0VarC2 = ((s06.j) this.f121306w.f121308p).c(this.f121307x, false, lg0.a.IGNORE);
                this.v = 1;
                Object objB = nim.a.b(d0VarC2, this);
                return objB == aVar2 ? aVar2 : objB;
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
                d0 d0VarC3 = ((s06.j) this.f121306w.f121308p).c(this.f121307x, false, lg0.a.IGNORE);
                this.v = 1;
                Object objB2 = nim.a.b(d0VarC3, this);
                return objB2 == aVar3 ? aVar3 : objB2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, i iVar, Continuation continuation) {
        super(2, continuation);
        this.u = 0;
        this.f121307x = str;
        this.f121306w = iVar;
    }
}
