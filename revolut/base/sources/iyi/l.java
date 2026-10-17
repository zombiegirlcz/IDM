package iyi;

import com.revolut.feature.hyper_text.model.HyperTextTarget;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import wli.x;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ HyperTextTarget.Link f169769w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, HyperTextTarget.Link link, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
        this.f169769w = link;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, this.f169769w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        x xVar = this.v.o;
        String str = this.f169769w.f74757a;
        lg0.a aVar2 = lg0.a.OPEN_BROWSER;
        Boolean bool = Boolean.FALSE;
        this.u = 1;
        Object objL1 = xVar.L1(str, aVar2, bool, this);
        return objL1 == aVar ? aVar : objL1;
    }
}
