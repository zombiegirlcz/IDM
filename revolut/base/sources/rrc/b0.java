package rrc;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f256756w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(f0 f0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f256756w = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b0 b0Var = new b0(this.f256756w, continuation, 0);
                b0Var.v = obj2;
                return b0Var;
            default:
                b0 b0Var2 = new b0(this.f256756w, continuation, 1);
                b0Var2.v = obj2;
                return b0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b0) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data = (Data) rVar.f314201a;
                String str = (String) rVar.f314202b;
                String str2 = (String) rVar.f314203c;
                f0 f0Var = this.f256756w;
                f0Var.H2(f0Var.f256772x, new q2k.b((Object) data, (Object) f0Var, (Object) str2, (Object) str, false, 21));
                break;
            default:
                List list = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0Var2 = this.f256756w;
                f0Var2.H2(f0Var2.f256772x, new q2j.j(list, 27));
                break;
        }
        return Unit.f186387a;
    }
}
