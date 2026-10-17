package x3a;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f302720w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f302720w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f302720w, continuation, 0);
            default:
                return new j(this.f302720w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                l lVar = this.f302720w;
                if (i == 0) {
                    o.b(obj2);
                    t3a.f fVar = lVar.o;
                    this.v = 1;
                    if (fVar.b(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                Intrinsics.checkNotNullParameter("PRIMARY_BUTTON_TAG", "buttonTag");
                lVar.C2(new f());
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                l lVar2 = this.f302720w;
                if (i2 == 0) {
                    o.b(obj2);
                    t3a.f fVar2 = lVar2.o;
                    this.v = 1;
                    mk0.a aVar3 = fVar2.f267718c;
                    Intrinsics.checkNotNullParameter("OPTED_IN_FOR_NEWLY_JOINED_NOTIFICATION", "id");
                    Object objE = aVar3.e(new tk0.b("OPTED_IN_FOR_NEWLY_JOINED_NOTIFICATION"), Boolean.FALSE, this);
                    if (objE != aVar2) {
                        objE = Unit.f186387a;
                    }
                    if (objE != aVar2) {
                        objE = Unit.f186387a;
                    }
                    if (objE == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                Intrinsics.checkNotNullParameter("SECONDARY_BUTTON_TAG", "buttonTag");
                lVar2.C2(new g());
                return Unit.f186387a;
        }
    }
}
