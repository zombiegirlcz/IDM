package k01;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import wvg.a1;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f179903w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ gim.i f179904x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(Function2 function2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        switch (i) {
            case 1:
                this.f179904x = (gim.i) function2;
                super(2, continuation);
                break;
            case 2:
                this.f179904x = (gim.i) function2;
                super(2, continuation);
                break;
            default:
                this.f179904x = (gim.i) function2;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f179904x, continuation, 0);
                iVar.f179903w = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f179904x, continuation, 1);
                iVar2.f179903w = obj2;
                return iVar2;
            default:
                i iVar3 = new i(this.f179904x, continuation, 2);
                iVar3.f179903w = obj2;
                return iVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((IndexedValue) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((a1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r6v2, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r6v8, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.f179903w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.f179903w = null;
                this.v = 1;
                Object objInvoke = this.f179904x.invoke(coroutineScope, this);
                return objInvoke == aVar ? aVar : objInvoke;
            case 1:
                IndexedValue indexedValue = (IndexedValue) this.f179903w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    int i3 = indexedValue.f186391a;
                    Object obj3 = indexedValue.f186392b;
                    if (i3 == 0) {
                        this.f179903w = null;
                        this.v = 1;
                        if (this.f179904x.invoke(obj3, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                a1 a1Var = (a1) this.f179903w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    this.f179903w = null;
                    this.v = 1;
                    obj2 = this.f179904x.invoke(a1Var, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                if (obj2 != null) {
                    return new Pair(obj2, null);
                }
                return null;
        }
    }
}
