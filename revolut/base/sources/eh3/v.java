package eh3;

import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.exceptions.ChecklistChallengeAccessException;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class v extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a f125730w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f125730w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v(this.f125730w, continuation, 0);
            case 1:
                return new v(this.f125730w, continuation, 1);
            default:
                return new v(this.f125730w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((v) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a aVar = this.f125730w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                try {
                    if (i == 0) {
                        yhm.o.b(obj2);
                        aVar.f65820w = true;
                        twg.c cVar = aVar.f65818s;
                        vii.b bVar = aVar.v;
                        this.v = 1;
                        if (cVar.H(bVar, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    return Unit.f186387a;
                } catch (Throwable cause) {
                    if (cause instanceof CancellationException) {
                        throw cause;
                    }
                    Intrinsics.checkNotNullParameter(cause, "cause");
                    throw new ChecklistChallengeAccessException(cause);
                }
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a.K2(this.f125730w, this) == aVar3) {
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
                    com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a aVar5 = this.f125730w;
                    v vVar = new v(aVar5, null, 1);
                    this.v = 1;
                    if (aVar5.p2(this, vVar) == aVar4) {
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
