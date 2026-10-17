package a83;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a f2063w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f2063w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n0 n0Var = new n0(this.f2063w, continuation, 0);
                n0Var.v = obj2;
                return n0Var;
            case 1:
                n0 n0Var2 = new n0(this.f2063w, continuation, 1);
                n0Var2.v = obj2;
                return n0Var2;
            case 2:
                n0 n0Var3 = new n0(this.f2063w, continuation, 2);
                n0Var3.v = obj2;
                return n0Var3;
            case 3:
                n0 n0Var4 = new n0(this.f2063w, continuation, 3);
                n0Var4.v = obj2;
                return n0Var4;
            case 4:
                n0 n0Var5 = new n0(this.f2063w, continuation, 4);
                n0Var5.v = obj2;
                return n0Var5;
            case 5:
                n0 n0Var6 = new n0(this.f2063w, continuation, 5);
                n0Var6.v = obj2;
                return n0Var6;
            case 6:
                n0 n0Var7 = new n0(this.f2063w, continuation, 6);
                n0Var7.v = obj2;
                return n0Var7;
            case 7:
                n0 n0Var8 = new n0(this.f2063w, continuation, 7);
                n0Var8.v = obj2;
                return n0Var8;
            default:
                n0 n0Var9 = new n0(this.f2063w, continuation, 8);
                n0Var9.v = obj2;
                return n0Var9;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((n0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a aVar = this.f2063w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.Q, new a26.j(list, 4));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.Q, new a07.l(data, 16));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.Q, new a07.l(data2, 17));
                break;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.Q, new a07.l(data3, 18));
                break;
            case 4:
                Data data4 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.Q, new a07.l(data4, 19));
                break;
            case 5:
                Data data5 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.Q, new a07.l(data5, 20));
                break;
            case 6:
                Pair pair = (Pair) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.Q, new p0((Data) pair.f186385a, (Data) pair.f186386b, 0));
                break;
            case 7:
                Data data6 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.Q, new a07.l(data6, 21));
                break;
            default:
                Data value = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a1 a1Var = aVar.L;
                Intrinsics.h(value);
                a1Var.getClass();
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getContent() != null) {
                    a1Var.f2035a.set(new Data(value.getContent(), null, false, 6, null));
                }
                aVar.H2(aVar.Q, new a07.l(value, 22));
                break;
        }
        return Unit.f186387a;
    }
}
