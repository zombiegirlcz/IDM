package zyb;

import com.revolut.feature.hyper_text.model.HyperTextTarget;
import efm.d0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import s06.j;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends i implements Function2 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ HyperTextTarget.Link f326402w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, HyperTextTarget.Link link, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
        this.f326402w = link;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.v, this.f326402w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        d0 d0VarC = ((j) this.v.f326405q).c(this.f326402w.f74757a, false, lg0.a.OPEN_BROWSER);
        this.u = 1;
        Object objB = nim.a.b(d0VarC, this);
        return objB == aVar ? aVar : objB;
    }
}
