package ga0;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function0 f141975w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function0 f141976x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Function0 function0, Function0 function02, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f141975w = function0;
        this.f141976x = function02;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f141975w, this.f141976x, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f141975w, this.f141976x, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f141975w, this.f141976x, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n1 n1Var = (n1) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(n1Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Function0 function0 = this.f141976x;
        Function0 function02 = this.f141975w;
        switch (i) {
            case 0:
                n1 n1Var = (n1) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (!(n1Var instanceof l1) || function02 == null) {
                    function0.invoke();
                } else {
                    function02.invoke();
                }
                break;
            case 1:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (n1Var2 instanceof l1) {
                    function02.invoke();
                } else {
                    function0.invoke();
                }
                break;
            default:
                n1 n1Var3 = (n1) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (n1Var3 instanceof l1) {
                    function02.invoke();
                } else {
                    function0.invoke();
                }
                break;
        }
        return Unit.f186387a;
    }
}
