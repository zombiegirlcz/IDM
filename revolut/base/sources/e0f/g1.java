package e0f;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class g1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r1 f121605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f121606x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(r1 r1Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f121605w = r1Var;
        this.f121606x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g1(this.f121605w, this.f121606x, continuation, 0);
            default:
                return new g1(this.f121605w, this.f121606x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        jve.a aVarA;
        int i = this.u;
        String storedMethodId = this.f121606x;
        r1 r1Var = this.f121605w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    pfm.a aVarA2 = r1Var.e.a(storedMethodId);
                    this.v = 1;
                    if (nim.a.a(aVarA2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    hve.b bVar = r1Var.f121679a;
                    this.v = 1;
                    hve.o oVar = (hve.o) bVar;
                    kve.b bVar2 = (kve.b) oVar.f;
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(storedMethodId, "storedMethodId");
                    jve.a aVarB = bVar2.b(storedMethodId);
                    if (aVarB != null) {
                        aVarA = jve.a.a(aVarB, null, 55);
                        bVar2.d(aVarA);
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("Stored account details should be persisted once linked account revoke called");
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        aVarA = null;
                    }
                    if (aVarA != null) {
                        oVar.f155856n.g(new hve.a(storedMethodId, null), mue.a.a(aVarA));
                    }
                    if (Unit.f186387a == aVar2) {
                        return aVar2;
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
