package k50;

import com.revolut.chat.domain.model.ChatEntryPoint;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class o3 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j4 f181200w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3(int i, j4 j4Var, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.f181200w = j4Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o3(0, this.f181200w, continuation);
            default:
                return new o3(1, this.f181200w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((o3) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        j4 j4Var = this.f181200w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    e3 e3Var = new e3(2, j4Var, (Continuation) null);
                    this.v = 1;
                    p2 p2Var = j4.Companion;
                    if (j4Var.W2(e3Var, this) == aVar) {
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
                    t30.f fVar = j4Var.X;
                    ChatEntryPoint chatEntryPoint = j4Var.o.f51176c;
                    this.v = 1;
                    fVar.getClass();
                    sx2.r rVar = new sx2.r(fVar, chatEntryPoint, null, 8);
                    skm.p0 p0Var = skm.p0.f264001a;
                    obj2 = skm.e0.J(elm.f.f127540b, rVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                j4Var.H2(j4Var.f181140w0, new k37.t((List) obj2, 5));
                return Unit.f186387a;
        }
    }
}
