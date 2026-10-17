package i4h;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ p0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p0 p0Var, Continuation continuation) {
        super(2, continuation);
        this.v = p0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f0 f0Var = new f0(this.v, continuation);
        f0Var.u = obj2;
        return f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f0) create((vf0.y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        e3h.h hVarC3;
        Long l2;
        vf0.y yVar = (vf0.y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        TrendViewDelegate.a aVar2 = (TrendViewDelegate.a) yVar.f288491a;
        eel.b bVar = (eel.b) yVar.f288492b;
        eel.c cVar = (eel.c) yVar.f288493c;
        Data data = (Data) yVar.d;
        Data dataT = t1.t((Data) yVar.e, (Data) yVar.f);
        try {
            Object content = dataT.getContent();
            if (content != null) {
                Pair pair = (Pair) content;
                nel.p0 p0Var = (nel.p0) pair.f186385a;
                o4l.b bVar2 = (o4l.b) pair.f186386b;
                p0 p0Var2 = this.v;
                if (bVar != null) {
                    l2 = new Long(bVar.f125223g);
                } else {
                    eel.l lVarB3 = p0.b3(p0Var2, aVar2, data);
                    l2 = lVarB3 != null ? new Long(lVarB3.f125238b) : null;
                }
                hVarC3 = p0.c3(p0Var2, bVar2, cVar, l2, p0Var);
            } else {
                hVarC3 = null;
            }
            return new Data(hVarC3, dataT.getError(), dataT.getLoading());
        } catch (Throwable th10) {
            return new Data(null, th10, dataT.getLoading());
        }
    }
}
