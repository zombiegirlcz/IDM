package xy9;

import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PixIdentifiedType.Valid f309662w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, PixIdentifiedType.Valid valid, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
        this.f309662w = valid;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, this.f309662w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            PixIdentifiedType.Valid valid = this.f309662w;
            o oVar = this.v;
            j jVar = new j(oVar, valid, null);
            this.u = 1;
            if (oVar.Y2(this, jVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
