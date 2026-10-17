package i2l;

import com.revolut.data.model.Data;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import skm.a2;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m0 f158013w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i, m0 m0Var, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f158013w = m0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f0 f0Var = new f0(0, this.f158013w, continuation);
                f0Var.v = obj2;
                return f0Var;
            case 1:
                f0 f0Var2 = new f0(1, this.f158013w, continuation);
                f0Var2.v = obj2;
                return f0Var2;
            case 2:
                f0 f0Var3 = new f0(2, this.f158013w, continuation);
                f0Var3.v = obj2;
                return f0Var3;
            default:
                f0 f0Var4 = new f0(3, this.f158013w, continuation);
                f0Var4.v = obj2;
                return f0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a2 a2Var;
        int i = this.u;
        int i2 = 0;
        m0 m0Var = this.f158013w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m0Var.H2(m0Var.f158032y, new e0(list, i2));
                break;
            case 1:
                Set set = (Set) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!set.isEmpty()) {
                }
                break;
            case 2:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m0Var.H2(m0Var.f158032y, new hzb.e0(data, 10));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m0Var.H2(m0Var.f158032y, new hzb.e0(data2, 11));
                a2l.y yVar = (a2l.y) data2.getContent();
                if (yVar != null && data2.getError() == null && !data2.getLoading()) {
                    a2l.n nVar = yVar.f937c;
                    Continuation continuation = null;
                    if (nVar == null) {
                        m0Var.f158030w = null;
                        m0Var.v = null;
                    } else {
                        int iHashCode = nVar.hashCode();
                        Integer num = m0Var.f158030w;
                        if ((num == null || iHashCode != num.intValue()) && ((a2Var = m0Var.v) == null || !a2Var.d())) {
                            m0Var.f158030w = Integer.valueOf(iHashCode);
                            m0Var.v = m0Var.l2(new g0(m0Var, nVar, continuation, i2), new yi5.b(26));
                        }
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
