package af4;

import com.revolut.core.model.FileExtension;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class r extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f3874w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = uVar;
        this.f3874w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r(this.v, this.f3874w, continuation);
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
        ufm.n nVarB = this.v.f3879q.b(this.f3874w, true, FileExtension.Pdf.f51406b);
        this.u = 1;
        Object objB = nim.a.b(nVarB, this);
        return objB == aVar ? aVar : objB;
    }
}
