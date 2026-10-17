package n8a;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pix.impl.domain.model.AliasPortabilityOperationResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ gim.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f213312w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f213313x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AccountId f213314y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(Function2 function2, String str, o oVar, AccountId accountId, String str2, Continuation continuation) {
        super(2, continuation);
        this.v = (gim.i) function2;
        this.f213312w = str;
        this.f213313x = oVar;
        this.f213314y = accountId;
        this.z = str2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.v, this.f213312w, this.f213313x, this.f213314y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        String str = this.f213312w;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            if (this.v.invoke(str, this) != aVar) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        o oVar = this.f213313x;
        jld.h hVar = new jld.h(12, oVar, this.f213314y, str, this.z, null);
        this.u = 2;
        Object objJ = oVar.j(AliasPortabilityOperationResult.Pending.f80541a, hVar, this);
        return objJ == aVar ? aVar : objJ;
    }
}
