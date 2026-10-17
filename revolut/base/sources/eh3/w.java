package eh3;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class w extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a f125731w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f125732x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a aVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f125731w = aVar;
        this.f125732x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.f125731w, this.f125732x, continuation, 0);
            case 1:
                return new w(this.f125731w, this.f125732x, continuation, 1);
            default:
                return new w(this.f125731w, this.f125732x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((w) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a aVar2 = this.f125731w;
                    v vVar = new v(aVar2, null, 0);
                    this.v = 1;
                    if (u0.b0(aVar2.X(), this.f125732x, vVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a.J2(this.f125731w, this.f125732x, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a aVar5 = this.f125731w;
                    w wVar = new w(aVar5, this.f125732x, null, 1);
                    this.v = 1;
                    if (aVar5.p2(this, wVar) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
