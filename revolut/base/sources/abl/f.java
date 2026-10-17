package abl;

import abl.d;
import aii.r;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        r cVar;
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (data.getLoading()) {
            cVar = d.b.f2983a;
        } else if (data.getContent() != null) {
            Object content = data.getContent();
            if (content == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            cVar = new c((SuspiciousTransactionDialog) content);
        } else {
            cVar = d.a.f2982a;
        }
        this.v.v2(cVar);
        return Unit.f186387a;
    }
}
