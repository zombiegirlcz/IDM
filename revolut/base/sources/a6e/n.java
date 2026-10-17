package a6e;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f1638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s f1639x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k6e.f f1640y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(String str, s sVar, k6e.f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f1638w = str;
        this.f1639x = sVar;
        this.f1640y = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f1638w, this.f1639x, this.f1640y, continuation, 0);
            default:
                return new n(this.f1638w, this.f1639x, this.f1640y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                e7e.a aVar = this.f1639x.u;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    String str = this.f1638w;
                    boolean zF = Intrinsics.f(str, "ACTION_ID_PAYMENT_DETAILS");
                    k6e.f fVar = this.f1640y;
                    if (zF) {
                        k6e.c cVar = new k6e.c(fVar);
                        this.v = 1;
                        if (aVar.Z2(cVar, this) == aVar2) {
                            return aVar2;
                        }
                    } else if (Intrinsics.f(str, "ACTION_ID_DELETE_PAYMENT")) {
                        k6e.b bVar = new k6e.b(fVar);
                        this.v = 2;
                        if (aVar.Z2(bVar, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    if (Intrinsics.f(this.f1638w, "ACTION_ID_CONFIRM_DELETE_PAYMENT")) {
                        e7e.a aVar4 = this.f1639x.u;
                        k6e.a aVar5 = new k6e.a(this.f1640y);
                        this.v = 1;
                        if (aVar4.Z2(aVar5, this) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
