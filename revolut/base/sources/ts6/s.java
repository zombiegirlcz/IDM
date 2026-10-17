package ts6;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public Ref$ObjectRef v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f274020w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f274021x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f274022y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Ref$ObjectRef ref$ObjectRef, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f274022y = ref$ObjectRef;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.f274022y, continuation, 0);
                sVar.f274021x = obj2;
                return sVar;
            default:
                s sVar2 = new s(this.f274022y, continuation, 1);
                sVar2.f274021x = obj2;
                return sVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Function1 function1 = (Function1) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s) create(function1, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        switch (this.u) {
            case 0:
                Function1 function1 = (Function1) this.f274021x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f274020w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.f274021x = null;
                    Ref$ObjectRef ref$ObjectRef3 = this.f274022y;
                    this.v = ref$ObjectRef3;
                    this.f274020w = 1;
                    Object objInvoke = function1.invoke(this);
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                    ref$ObjectRef = ref$ObjectRef3;
                    obj2 = objInvoke;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef = this.v;
                    yhm.o.b(obj2);
                }
                ref$ObjectRef.f186409a = obj2;
                return Unit.f186387a;
            default:
                Function1 function12 = (Function1) this.f274021x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f274020w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.f274021x = null;
                    Ref$ObjectRef ref$ObjectRef4 = this.f274022y;
                    this.v = ref$ObjectRef4;
                    this.f274020w = 1;
                    Object objInvoke2 = function12.invoke(this);
                    if (objInvoke2 == aVar2) {
                        return aVar2;
                    }
                    ref$ObjectRef2 = ref$ObjectRef4;
                    obj2 = objInvoke2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef2 = this.v;
                    yhm.o.b(obj2);
                }
                ref$ObjectRef2.f186409a = obj2;
                return Unit.f186387a;
        }
    }
}
