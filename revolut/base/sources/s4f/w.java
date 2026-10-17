package s4f;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f259869w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f259869w = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                w wVar = new w(this.f259869w, continuation, 0);
                wVar.v = obj2;
                return wVar;
            case 1:
                w wVar2 = new w(this.f259869w, continuation, 1);
                wVar2.v = obj2;
                return wVar2;
            default:
                w wVar3 = new w(this.f259869w, continuation, 2);
                wVar3.v = obj2;
                return wVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((w) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayListA;
        int i = this.u;
        x xVar = this.f259869w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data = (Data) pair.f186385a;
                String str = (String) pair.f186386b;
                Data data2 = null;
                if (str != null) {
                    Intrinsics.h(data);
                    try {
                        Object content = data.getContent();
                        if (content != null) {
                            xVar.f259871q.getClass();
                            arrayListA = u.a((xzg.k) content, str);
                        } else {
                            arrayListA = null;
                        }
                        data2 = new Data(arrayListA, data.getError(), data.getLoading());
                    } catch (Throwable th10) {
                        data2 = new Data(null, th10, data.getLoading());
                    }
                }
                xVar.H2(xVar.v, new s06.e(data, 1, data2, str));
                break;
            case 1:
                Data data3 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.v, new rtl.s(data3, 24));
                break;
            default:
                Data data4 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.v, new rtl.s(data4, 25));
                break;
        }
        return Unit.f186387a;
    }
}
