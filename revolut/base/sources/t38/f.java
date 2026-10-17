package t38;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f267677w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ io3.d f267678x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p pVar, b bVar, io3.d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = pVar;
        this.f267677w = bVar;
        this.f267678x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.v, this.f267677w, this.f267678x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            String str = this.f267677w.f267671a;
            io3.d dVar = this.f267678x;
            sfe.m mVar = new sfe.m(str, new ProductAccountId(dVar.f163145a, null), dVar);
            this.u = 1;
            if (this.v.b3(mVar, this) == aVar) {
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
