package y6b;

import com.revolut.feature.hyper_text.model.HyperTextTarget;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import wli.x;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ HyperTextTarget f311255w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, HyperTextTarget hyperTextTarget, Continuation continuation) {
        super(1, continuation);
        this.v = kVar;
        this.f311255w = hyperTextTarget;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, this.f311255w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
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
        x xVar = this.v.f311256p;
        String str = ((HyperTextTarget.Link) this.f311255w).f74757a;
        lg0.a aVar2 = lg0.a.OPEN_BROWSER;
        this.u = 1;
        Object objX1 = lg0.b.x1(xVar, str, aVar2, null, this, 4);
        return objX1 == aVar ? aVar : objX1;
    }
}
