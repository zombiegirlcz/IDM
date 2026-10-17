package s8a;

import com.revolut.feature.pix.api.model.AliasRegistrationResult;
import hy1.b0;
import kkf.r6;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f260941w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f260941w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f260941w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            m8a.d dVar = this.v.f260943b;
            String operationId = this.f260941w;
            Intrinsics.checkNotNullParameter(operationId, "operationId");
            r6 r6Var = new r6(new r6(new b0(dVar.f203459a, dVar, operationId, 25), 23), 22);
            this.u = 1;
            obj2 = q.z(r6Var, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        AliasRegistrationResult aliasRegistrationResult = (AliasRegistrationResult) obj2;
        return aliasRegistrationResult == null ? AliasRegistrationResult.Pending.f80384a : aliasRegistrationResult;
    }
}
