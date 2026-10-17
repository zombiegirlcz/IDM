package yca;

import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PixIdentifiedType.Valid f312592w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, PixIdentifiedType.Valid valid, Continuation continuation) {
        super(1, continuation);
        this.v = tVar;
        this.f312592w = valid;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r(this.v, this.f312592w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
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
        f8a.c cVar = this.v.f312597s;
        this.u = 1;
        Object objA = ((s8a.m) cVar).a(this.f312592w, this);
        return objA == aVar ? aVar : objA;
    }
}
