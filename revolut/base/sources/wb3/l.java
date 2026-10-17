package wb3;

import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.terms.api.model.TermsScope;
import efm.d0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        m mVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            pre.c cVar = mVar.f296010q;
            TermsScope.INSTANCE.getClass();
            d0 d0VarF = cVar.f(TermsScope.f90369j, null);
            this.u = 1;
            obj2 = nim.a.b(d0VarF, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        Terms terms = (Terms) ((od0.i) obj2).g();
        if (terms == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No terms received");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            return Unit.f186387a;
        }
        String str = terms.f90357c;
        if (str == null) {
            return null;
        }
        mVar.x2(new k(str, 0));
        return Unit.f186387a;
    }
}
