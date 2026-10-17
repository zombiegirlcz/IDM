package mn6;

import com.revolut.domain.models.openbanking.penny_verification.PennyAuthorisationResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ufm.n;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f207365w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f207366x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(j jVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f207365w = jVar;
        this.f207366x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f207365w, this.f207366x, continuation, 0);
            default:
                return new c(this.f207365w, this.f207366x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    n nVarG = ((xg6.j) this.f207365w.f207383l).g(new y61.b(this.f207366x));
                    this.v = 1;
                    obj2 = nim.a.b(nVarG, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Boolean.valueOf(obj2 != PennyAuthorisationResult.IN_PROGRESS);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.v = 1;
                Object objF3 = j.f3(this.f207365w, this.f207366x, this);
                return objF3 == aVar2 ? aVar2 : objF3;
        }
    }
}
