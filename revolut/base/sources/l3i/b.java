package l3i;

import com.revolut.data.model.Data;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import qta.d;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function3 {
    public /* synthetic */ Data u;
    public /* synthetic */ Data v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jx0.a f191954w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f191955x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(jx0.a aVar, float f, Continuation continuation) {
        super(3, continuation);
        this.f191954w = aVar;
        this.f191955x = f;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        b bVar = new b(this.f191954w, this.f191955x, (Continuation) obj4);
        bVar.u = (Data) obj2;
        bVar.v = (Data) obj3;
        return bVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        d dVarA;
        Data data = this.u;
        Data data2 = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Intrinsics.h(data);
        jx0.a aVar2 = this.f191954w;
        try {
            Object content = data.getContent();
            if (content != null) {
                d dVar = (d) content;
                List list = dVar.e;
                aVar2.getClass();
                ArrayList arrayListZ = jx0.a.z(list);
                n9l.a aVar3 = (n9l.a) data2.getContent();
                dVarA = d.a(dVar, jx0.a.A(aVar3 != null ? aVar3.f213663c : this.f191955x, arrayListZ));
            } else {
                dVarA = null;
            }
            return new Data(dVarA, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            return new Data(null, th10, data.getLoading());
        }
    }
}
